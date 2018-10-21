import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable()
export class AuthService{
apiUrl= 'http://localhost:9090/SpringMVCExample';

    constructor(private http: HttpClient){ }

    login(userName: string, passWord: string){
        return this.http.post<any>('${apiUrl}/login', {usename: userName, password: passWord})
            .pipe(map(user => {
                //check for jwt token & add to localStorage to persist session
                if(user && user.token){
                    localStorage.setItem('currentUser', JSON.stringify(user));
                }
                
                return user;
            }));
    
    }
    //logout by removing user from localStorage
    logout(){
        localStorage.removeItem('currentUser');
    }
}