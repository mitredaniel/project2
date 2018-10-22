import { Component, OnInit, NgModule } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { first } from 'rxjs/operators';
import{UserService} from '../services/user.service';
import { AlertService } from '../services/alert.service';
import { AuthService } from '../services/auth.service';
import {P2User} from '../user'
import { map } from 'rxjs/operators';
import { HttpBackend } from '@angular/common/http';
import {userInfo} from '../userInfo';


@Component({templateUrl: 'login.component.html'})
export class LoginComponent implements OnInit {
    loginForm: FormGroup;
    loading = false;
    submitted = false;
    returnUrl: string;
    email: string;
    passWord: string;
    user: P2User = {} as P2User;
    returnUser: P2User = {} as P2User;

   

    constructor(
       
        private formBuilder: FormBuilder,
        private route: ActivatedRoute,
        private router: Router,
        private authService: AuthService,
        private alertService: AlertService,
        private userService: UserService,
        ) {}

    ngOnInit() {
        this.loginForm = this.formBuilder.group({
            userName: ['', Validators.required],
            passWord: ['', Validators.required]
        });
        const newLocal = 'currentUser';
          
    
}
    //getter for easy access to form fields
    get users() { return this.loginForm.controls; }

    onSubmit() {
        this.submitted = true;
        

        this.user.password = this.loginForm.value.passWord;
        this.user.login =this.loginForm.value.userName;
   console.log(this.user.login + " " + this.user.password);
        
        this.userService.userLogin(this.user).subscribe(data=> {this.returnUser=data;
           if(this.returnUser.role === "manager"){
               this.router.navigate(["manager-home"])};
           if(this.returnUser.role === "tenant"){
               this.router.navigate(["tenant-home"])
            }
            if(this.returnUser.role === "maintenance"){
                this.router.navigate(["maintenance-home"])
             }
            console.log(this.returnUser);});



        //return if form is invalid
       /* if (this.loginForm.invalid) {
            return;
        }

        this.loading = true;
        //authenticate userName
        this.authService.login(this.users.userName.value, this.users.passWord.value)
            .pipe(first())
            .subscribe(
                data => {
                    this.router.navigate([this.returnUrl]);
                },//show error
                error => {
                    this.alertService.error(error);
                    this.loading = false;
                }); */
               }
}