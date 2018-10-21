import { Component, OnInit, NgModule } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { first } from 'rxjs/operators';
import{UserService} from '../services/user.service';
import { AlertService } from '../services/alert.service';
import { AuthService } from '../services/auth.service';
import {User} from '../user'
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
    userinfo = new userInfo;


    public users :  any=[];

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
        this.users=[];
    
    
    
}
    //getter for easy access to form fields
    get user() { return this.loginForm.controls; }

    onSubmit() {
        this.submitted = true;
        

        this.userinfo.passWord = this.loginForm.value.passWord;
        this.userinfo.email =this.loginForm.value.userName;
   console.log(this.userinfo.email + " " + this.userinfo.passWord);
        
        this.userService.userLogin(this.userinfo).subscribe(data=> console.log(data));



        //return if form is invalid
        if (this.loginForm.invalid) {
            return;
        }

        this.loading = true;
        //authenticate userName
        this.authService.login(this.user.userName.value, this.user.passWord.value)
            .pipe(first())
            .subscribe(
                data => {
                    this.router.navigate([this.returnUrl]);
                },//show error
                error => {
                    this.alertService.error(error);
                    this.loading = false;
                });
    }
}