import { HttpClientModule} from '@angular/common/http';
import { SubtaskServiceService } from './subtask-service.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{ ProgressBarModule } from 'angular-progress-bar';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule, routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';
import { TasksComponent } from './tasks/tasks.component';


@NgModule({
  declarations: [
    AppComponent,
    routingComponents,
    TasksComponent
  ],
  imports: [
    BrowserModule,
    ProgressBarModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [SubtaskServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
