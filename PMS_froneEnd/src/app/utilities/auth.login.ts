import { Injectable } from '@angular/core';
import { Router, CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';

@Injectable()
export class AuthLogin implements CanActivate{

    constructor(private router: Router){}
    canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot){
        //if user logged in
        if (localStorage.getItem('currentUser')){
            return true;
        }
        //otherwise redirect back to login
        this.router.navigate(['/login'], {queryParams: {returnURL: state.url}});
            return false;
    }
}