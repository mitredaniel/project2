import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import { AlertService } from '../services/alert.service';
import { AuthService } from '../services/auth.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-manager-home',
  templateUrl: './manager-home.component.html',
  styleUrls: ['./manager-home.component.css']
})
export class ManagerHomeComponent implements OnInit {

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private authService: AuthService,
    private alertService: AlertService,
    private userService: UserService,
  ) { }

  ngOnInit() {
    
  }

}
