import { Routes, RouterModule } from '@angular/router';

//import { HomeComponent } from './home';
import { LoginComponent } from '../login/login.component';
import { RegisterComponent } from '../registration/register.component';
import { ManagerHomeComponent } from '../manager-home/manager-home.component';
import { TenantHomeComponent } from '../tenant-home/tenant-home.component';
import { MaintenanceHomeComponent } from '../maintenance-home/maintenance-home.component';
import { AuthLogin } from '../utilities/auth.login';

const appRoutes: Routes = [
    { path: '', redirectTo: 'login', pathMatch: 'full', canActivate: [AuthLogin] },
    { path: 'login', component: LoginComponent },
    { path: 'register', component: RegisterComponent },
    { path: 'managerhome', component: ManagerHomeComponent },
    { path: 'tenanthome', component: TenantHomeComponent },
    { path: 'maintenancehome', component: MaintenanceHomeComponent },
    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

export const routing = RouterModule.forRoot(appRoutes);