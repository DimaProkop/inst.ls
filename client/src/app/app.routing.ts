import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AppComponent} from "./component/app/app.component";
import {HelloComponent} from "./component/hello/hello.component";

const routes: Routes = [
  { path: '', redirectTo: '/hello', pathMatch: 'prefix'},
  { path: 'app', component: AppComponent },
  { path: 'hello', component: HelloComponent }
];


@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRouting {}
