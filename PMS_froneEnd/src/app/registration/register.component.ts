import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { first } from 'rxjs/operators';
import { AlertService } from '../services/alert.service';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-register',
  templateUrl: 'register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private formBuilder: FormBuilder,
    private router: Router,
    private userService: UserService,
    private alertService: AlertService) { } 
  registerForm: FormGroup;
  submit = false;

  ngOnInit() {
    this.registerForm= this.formBuilder.group({
    firstName: ['', Validators.required],
    lastName: ['', Validators.required],
    username: ['', Validators.required],
    password: ['', Validators.required],
    bDay: ['', Validators.required],
    social: ['', Validators.required],
    dLNumber: ['', Validators.required],
    cAddress: ['', Validators.required],
    cCity: ['', Validators.required],
    cState: ['', Validators.required],
    cZipCode: ['', Validators.required],
    pAddress: ['', Validators.required],
    pCity: ['', Validators.required],
    pState: ['', Validators.required],
    pZipCode: ['', Validators.required],
    hPhone: ['', Validators.required],
    cPhone: ['', Validators.required],
    occupant1: ['', Validators.required],
    occipant2: ['', Validators.required],
    unit: ['', Validators.required],
    cEAddress: ['', Validators.required],
    cEState: ['', Validators.required],
    cEZipCode: ['', Validators.required],
    ePhone: ['', Validators.required],
    pEAddress: ['', Validators.required],
    pECity: ['', Validators.required],
    pEState: ['', Validators.required],
    pEZipCode: ['', Validators.required],
    pEPhone: ['', Validators.required],
    refFName1: ['', Validators.required],
    refLName1: ['', Validators.required],
    relation1: ['', Validators.required],
    refPhone1: ['', Validators.required],
    refFName2: ['', Validators.required],
    refLName2: ['', Validators.required],
    relation2: ['', Validators.required],
    refPhone2: ['', Validators.required],
    email: ['', Validators.required],
    passWord: ['', Validators.required],
 });
  }

}
