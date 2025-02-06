import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
<<<<<<< HEAD
import { NavBarComponent } from './navbar/navbar.component';
=======
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
import { AuthModule } from '../auth/auth.module';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
<<<<<<< HEAD
    NavBarComponent 
=======
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
  ],
  imports: [
    CommonModule,
    AuthModule,
    RouterModule
  ],
  exports: [
<<<<<<< HEAD
    NavBarComponent
=======
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
  ]
})
export class SharedModule {}