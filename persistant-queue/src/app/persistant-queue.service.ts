import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';
import { PersistantQueue } from './persistant-queue';

@Injectable({
  providedIn: 'root'
})
export class PersistantQueueService {

  private url = 'http://localhost:8080';
  constructor(private http: HttpClient) { }
  createEvent(persistantQueue:PersistantQueue):Observable<any> {
    alert(JSON.stringify(persistantQueue))
    return this.http.post(`${this.url}`+"/enqueue-event",persistantQueue);
  }

  executeEvent(eventName:any): Observable<any>{
    //return this.http.get(`${this.url}`+"/execute-event/"+eventName);
    return this.http.get(`${this.url}`+"/execute-event/"+eventName);
   }

  getEventList(): Observable<any>{
    
    return this.http.get(`${this.url}`+"/events",);
  }
}
