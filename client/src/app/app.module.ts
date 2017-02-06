import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';


import { AppComponent } from './component/app/app.component';
import { AppRouting } from "./app.routing";
import { HelloComponent } from './component/hello/hello.component';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRouting
  ],
  declarations: [
    AppComponent,
    HelloComponent,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
