import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IBook } from '../models/i-book';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private readonly URI_BOOKS = 'api/book'

  constructor(private http: HttpClient) { }

  public findAll(): Observable<IBook[]>{
    return this.http.get<IBook[]>(this.URI_BOOKS);
  }
}
