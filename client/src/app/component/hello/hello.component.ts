import { Component, OnInit } from '@angular/core';
import {Message} from "../../model/message";
import {HelloService} from "../../service/hello/hello.service";

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css'],
  providers: [HelloService]
})
export class HelloComponent implements OnInit {

  private messages: Message[];

  constructor(private helloService: HelloService) { }

  ngOnInit() {
    this.helloService.getMessages()
      .subscribe(
        messages => {
          this.messages = messages;
          console.log(messages);
        }
      )
  }

}
