import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
<<<<<<< HEAD
import { LoginComponent } from "./components/login/login.component";
import { UserComponent } from "./components/user/user.component";

const routes: Routes = [
  { path: "", component: LoginComponent },
  { path: "login", component: LoginComponent },
  { path: "add-user", component: UserComponent },
];
=======

const routes: Routes = [];
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
<<<<<<< HEAD
export class AuthRoutingModule { }
=======
export class AuthRoutingModule {}
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
