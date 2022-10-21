import { Component, OnInit} from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { HttpService } from './service/HttpService';
import { Persona } from './Persona';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{

  persona: Persona[] = [];

  public columnas = ['dni', 'nya', 'edad', 'fechanac'];
  public dataSource = new MatTableDataSource<Persona>();

  constructor(private httpService: HttpService){

  }

  ngOnInit(): void {
    this.getInfo();
  }

  getInfo() {
    this.httpService.getPersonas()
    .subscribe((res)=>{
      this.dataSource.data = res;
    })
  }
  
}
