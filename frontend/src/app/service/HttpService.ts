import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../Persona';

@Injectable()

export class HttpService {
    constructor(private httpClient: HttpClient) {
    }

    getPersonas(): Observable<Persona[]>{
        return this.httpClient.get<Persona[]>("http://localhost:8080/personas");
    }
}