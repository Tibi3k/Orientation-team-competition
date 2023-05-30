import { HttpEvent, HttpHandler, HttpInterceptor, HttpRequest } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable, from, mergeMap } from "rxjs";
import { Auth } from 'aws-amplify';

@Injectable()
export class AuthInterceptor implements HttpInterceptor {
  intercept(
    req: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {
    return from(Auth.currentSession()).pipe(
      mergeMap((session) => {
        const authenticatedReq = req.clone({
          setHeaders: {
            Authorization: `Bearer ${session.getIdToken().getJwtToken()}`,
          },
        });

        return next.handle(authenticatedReq);
      })
    );
  }
}