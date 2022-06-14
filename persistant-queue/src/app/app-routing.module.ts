import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { EnqueueEventComponent } from './enqueue-event/enqueue-event.component';

const routes: Routes = [
  
  {path:'enqueue-event',component:EnqueueEventComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
