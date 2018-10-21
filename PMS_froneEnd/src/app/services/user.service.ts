import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from "../User";
import { Observable, of } from 'rxjs';
import {userInfo} from '../userInfo';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable()
export class UserService{
   private apiUrl= 'http://localhost:9090/PMSystem';
userinfo= new userInfo;
constructor(private http: HttpClient){}


 httpOptions={
headers: new HttpHeaders({
    'Content-Type': 'application/json'
})
};
private extractData(res:Response){
    let body= res;
    return body || {};
}

//retrieve all users
getAllUsers(): Observable<any>{
    return this.http.get<User[]>(this.apiUrl + '/login')
    .pipe(map(this.extractData));
}

//user by ID
getUserById(id:number){
    // return this.http.get('${apiUrl}/' + id);
    return this.http.get<User[]>(this.apiUrl+'')
    .pipe(map(this.extractData));
}

userLogin(userInfo: userInfo){
return this.http.post(this.apiUrl +'/login', userInfo, this.httpOptions);

}

//apply for residency
register(user:User){
    return this.http.post('${uriUrl}/user/register', user)
}


}