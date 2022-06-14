import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersistantQueueService } from './persistant-queue.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { EnqueueEventComponent } from './enqueue-event/enqueue-event.component';

@NgModule({
  declarations: [
    AppComponent,
    EnqueueEventComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [PersistantQueueService],
  bootstrap: [AppComponent]
})
export class AppModule { }
