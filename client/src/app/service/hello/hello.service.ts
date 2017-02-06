import { Injectable } from '@angular/core';
import {Http, Response} from "@angular/http";
import {Observable} from "rxjs";
import {Message} from "../../model/message";

@Injectable()
export class HelloService {

  private messageUrl: string;

  constructor(private http: Http) {
    this.messageUrl = 'msg/get'
  }

  getMessages(): Observable<Message[]> {
    return this.http.get(this.messageUrl)
      .map(HelloService.extractData)
      .catch(HelloService.handleError);
  }

  private static extractData(res: Response) {
    return res.json();
  }

  private static handleError(error: any) {
    console.log('An error occured', error);
    return Promise.reject(error.message || error);
  }

}
