package com.example.demo.helper

import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.security.Keys
import org.springframework.beans.factory.annotation.Value
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Component
import java.util.*

@Component
class JwtTokenUtil(
    @Value("\${jwt.secret}")
    private val secret: String,
    @Value("\${jwt.expiration}")
    private val expiration: Long
) {
    fun generateToken(username: String): String {
        val now = Date()
        val expiryDate = Date(now.time + expiration)
        return Jwts.builder()
            .setSubject(username)
            .setIssuedAt(now)
            .setExpiration(expiryDate)
            .signWith(Keys.hmacShaKeyFor(secret.toByteArray()))
            .compact()
    }

    fun validateToken(token: String, userDetails: UserDetails): Boolean {
        val username = extractUsername(token)
        return username == userDetails.username && !isTokenExpired(token)
    }

    private fun extractClaims(token: String): Claims {
        return Jwts.parserBuilder()
            .setSigningKey(Keys.hmacShaKeyFor(secret.toByteArray()))
            .build()
            .parseClaimsJws(token)
            .body
    }

    fun extractUsername(token: String): String {
        return extractClaim(token, Claims::getSubject)
    }

    private fun isTokenExpired(token: String): Boolean {
        val expirationDate = extractClaims(token).expiration
        return expirationDate.before(Date())
    }

    private fun <T> extractClaim(token: String, claimsResolver: (Claims) -> T): T {
        val claims = extractClaims(token)
        return claimsResolver.invoke(claims)
    }
}