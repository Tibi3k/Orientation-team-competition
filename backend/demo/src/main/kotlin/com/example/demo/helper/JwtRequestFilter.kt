package com.example.demo.helper

import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.filter.OncePerRequestFilter

class JwtRequestFilter(
    private val authenticationManager: AuthenticationManager,
    private val jwtTokenUtil: JwtTokenUtil
) : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val authorizationHeader = request.getHeader("Authorization")

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            val token = authorizationHeader.substring(7)
            val username = jwtTokenUtil.extractUsername(token)

            //if (username != null && SecurityContextHolder.getContext().authentication == null) {
            //    val userDetails = // Load the user details based on the username
//
            //        if (jwtTokenUtil.validateToken(token, userDetails)) {
            //            val authenticationToken = UsernamePasswordAuthenticationToken(
            //                userDetails, null, userDetails.authorities
            //            )
            //            SecurityContextHolder.getContext().authentication = authenticationToken
            //        }
            //}
        }

        filterChain.doFilter(request, response)
    }
}