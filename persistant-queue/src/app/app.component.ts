import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { PersistantQueueService } from './persistant-queue.service';
import { delay, Observable } from 'rxjs';
import { PersistantQueue } from './persistant-queue';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'persistant-queue';
  public events:Array<PersistantQueue>=[];
  constructor(private persistantQueueService:PersistantQueueService,private router:Router ,private activatedRoute:ActivatedRoute,
    private fb:FormBuilder, ) {
    
}
EventForm=this.fb.group({
  eventname:['',],})

  ngOnInit(): void {
   // this.getEvents();
   //this.executeEvent('coke');
  }
  executeEvent(EventForm:FormGroup):void{
    const eventName:any = EventForm.get('eventname')?.value;
    this.persistantQueueService.executeEvent(eventName).subscribe(data=>{
      console.log(data);
      
     });

  
  }
  createEvent(){
    this.router.navigateByUrl('/', { skipLocationChange: true }).then(() => {
      this.router.navigate(['enqueue-event']);
    });
  }
getEvents(){
  //while(true){
  this.persistantQueueService.getEventList().subscribe( data=>{
    this.events=data;
    console.log(JSON.stringify(this.events))
    //delay(10000)
  })
 // }
}
}
