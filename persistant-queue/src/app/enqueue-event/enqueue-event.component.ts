import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { PersistantQueue } from '../persistant-queue';
import { PersistantQueueService } from '../persistant-queue.service';

@Component({
  selector: 'app-enqueue-event',
  templateUrl: './enqueue-event.component.html',
  styleUrls: ['./enqueue-event.component.scss']
})
export class EnqueueEventComponent implements OnInit {
  
  constructor(private persistantQueueService:PersistantQueueService,
    private fb:FormBuilder, ) {
    
}
EventForm=this.fb.group({
  eventName:['',],processCompletionTime:['',],eventPriority:['',]})


  ngOnInit(): void {
   //this.executeEvent('coke');
  }
  createEvent(EventForm:FormGroup):void{
    //const eventName:any = EventForm.get('eventname')?.value;
    let persistantQueue:PersistantQueue=new PersistantQueue;
    persistantQueue=EventForm.value;
    this.persistantQueueService.createEvent(persistantQueue).subscribe(data=>{
      console.log(data);
     });
  }
}
