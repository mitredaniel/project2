import{Injectable} from '@angular/core';
import{Router, NavigationStart} from '@angular/router';
import {Observable, Subject} from 'rxjs';

@Injectable()
export class AlertService{
    private subject = new Subject<any>();
    private keepOnViewChange = false;

    constructor(private router:Router){
        //clear alert
        router.events.subscribe(event =>{
            if(event instanceof NavigationStart){
                //if true
                if(this.keepOnViewChange){
                    this.keepOnViewChange = false;
                }
                else{
                    //clear the alert
                    this.subject.next();
                }
            }
        })
    }
        //method for success message
        success(message: string, keepOnViewChange = false) {
        this.keepOnViewChange = keepOnViewChange;
        this.subject.next({ type: 'success', text: message });
    }
    //method for error message
    error(message: string, keepOnViewChange = false) {
        this.keepOnViewChange = keepOnViewChange;
        this.subject.next({ type: 'error', text: message });
    }

    //returns message as observable
    getMessage(): Observable<any> {
        return this.subject.asObservable();
    }
}