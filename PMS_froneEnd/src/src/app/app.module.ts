import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { routing } from './utilities/app.routing';
import { HttpClientModule } from '@angular/common/http';
import {ReactiveFormsModule} from '@angular/forms';
import {UserService} from './services/user.service';
import {AuthService} from './services/auth.service';
import { AlertService } from './services/alert.service';
import {AlertComponent } from './utilities/alert.component';
import { RegisterComponent } from './registration/register.component';
import { ManagerHomeComponent } from './manager-home/manager-home.component';
import { TenantHomeComponent } from './tenant-home/tenant-home.component';
import { MaintenanceHomeComponent } from './maintenance-home/maintenance-home.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AlertComponent,
    RegisterComponent,
    ManagerHomeComponent,
    TenantHomeComponent,
    MaintenanceHomeComponent,
    
    
  ],
  imports: [
    BrowserModule, NgbModule,
    ReactiveFormsModule, HttpClientModule,
    routing
    
  ],
  providers: [UserService, AuthService,
          AlertService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
