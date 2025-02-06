import { Injectable } from "@angular/core";
import {
  HttpInterceptor,
  HttpRequest,
  HttpHandler,
  HttpEvent,
} from "@angular/common/http";
import { Observable } from "rxjs";
import { AuthService } from "./auth/services/auth.service";

@Injectable()
export class AuthInterceptor implements HttpInterceptor {
<<<<<<< HEAD
  constructor(private authService: AuthService) { }
  intercept(
    request: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {

    const token = this.authService.getToken();

    if (request.url.includes("login") || request.url.includes("add-user")) {
      return next.handle(request);
    }

    if (token) {
      request = request.clone({
        setHeaders: {
          "Content-Type": "application/json; charset=utf-8",
          Accept: "application/json",
          Authorization: `Bearer ${token}`,
        },
      });
    }

    return next.handle(request);
  }
=======
  
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
}
