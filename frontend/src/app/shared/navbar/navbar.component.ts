<<<<<<< HEAD
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'app-navbar',
    templateUrl: './navbar.component.html',
    styleUrls: ['./navbar.component.scss']
})
export class NavBarComponent implements OnInit {
    role: string | null;

    constructor(private router: Router) { }

    ngOnInit(): void {
        console.log(localStorage.getItem("role"));
        this.role = localStorage.getItem("role");
    }

    logout(): void {
        localStorage.removeItem('token')
        this.router.navigate(["/auth"]);
    }
=======

export class NavBarComponent{

  
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

}
