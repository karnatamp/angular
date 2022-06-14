# angular
 Persistent queue using typescript for Frontend and java Spring boot for backend.
 
persistantqueue: Backend(using Java Spring Boot for DB connection)


persistant-queue: FrontEnd(Typescript)

Future Work: implementation of event priority based execution,alert messagesto select which one to execute  when same priority level event occur.

**Frontend and working of application**

<img width="800" alt="Screenshot 2022-06-14 at 7 29 52 PM" src="https://user-images.githubusercontent.com/75111889/173644113-80345383-11bd-4c5f-9c29-e36cef09f5dc.png"> 
1) three buttons to get events,create event and to start the event.
<img width="800" alt="Screenshot 2022-06-14 at 7 29 52 PM" src="https://user-images.githubusercontent.com/75111889/173675760-b12cf772-f699-4beb-a123-1536e1cfc168.png">
2)event creation.
<img width="800" alt="Screenshot 2022-06-14 at 7 34 59 PM" src="https://user-images.githubusercontent.com/75111889/173675833-850617e6-35d5-4a61-9fd6-bb3546d5768f.png">
3) default event status is "Ready" after the creation of Event.
<img width="800" alt="Screenshot 2022-06-14 at 7 36 27 PM" src="https://user-images.githubusercontent.com/75111889/173675904-584d8684-8f27-470f-9785-f2b1bc9dbbdb.png">
4) Event status shows "in-progress" during the processing time.
<img width="800" alt="Screenshot 2022-06-14 at 7 28 44 PM" src="https://user-images.githubusercontent.com/75111889/173676014-041226c5-4145-4214-b399-8c9636935df8.png"> 
5) status update with "Completed" after the execution of event depending on the process Time.
7) event start time and end time generated at start of event and completion of event.
<img width="800" alt="Screenshot 2022-06-14 at 7 39 24 PM" src="https://user-images.githubusercontent.com/75111889/173676318-3bb59268-c23e-422c-8c78-75c0cd1cd103.png">
8) Postgre DB is updated each time when an event start/end.




 
 
 
