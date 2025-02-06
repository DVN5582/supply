import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
<<<<<<< HEAD
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';  
import { AuthInterceptor } from './auth.interceptors';
=======
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';  
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
<<<<<<< HEAD
    AppRoutingModule
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true,
    },
  ],
=======
    AppRoutingModule 
  ],
  providers: [],
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
  bootstrap: [AppComponent]
})
export class AppModule {}
