import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { P2User } from "../User";
import { Observable, of } from 'rxjs';
import {userInfo} from '../userInfo';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable()
export class UserService{
   private apiUrl= 'http://localhost:9090/PMSystem';
user:P2User;
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
    return this.http.get<P2User[]>(this.apiUrl + '/login')
    .pipe(map(this.extractData));
}

//user by ID
getUserById(id:number){
    // return this.http.get('${apiUrl}/' + id);
    return this.http.get<P2User[]>(this.apiUrl+'')
    .pipe(map(this.extractData));
}

userLogin(user: P2User):Observable<P2User>{
return this.http.post<P2User>(this.apiUrl + '/login', user, this.httpOptions);

}

//apply for residency
register(user:P2User){
    return this.http.post('${uriUrl}/user/register', user)
}


}