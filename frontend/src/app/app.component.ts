import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

interface Persona {
  dni: Int8Array;
  nya: string;
  edad: Int8Array;
  fechanac: string;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {

  constructor(private http: HttpClient) {  }
  
  ngOnInit(): void {
    this.http.get("http://localhost:8080/personas").subscribe(data => {
      console.log(data);
    })
  }

  
}
