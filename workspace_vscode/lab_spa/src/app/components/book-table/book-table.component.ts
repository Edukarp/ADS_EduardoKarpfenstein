import { AlertService } from './../../services/alert.service';
import { Component, OnInit } from '@angular/core';
import { IBook } from 'src/app/models/i-book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.scss']
})
export class BookTableComponent  implements OnInit{

  books: IBook[] = [];

  constructor(
    private service: BookService,
    private alertService: AlertService
    ) { }

  ngOnInit(): void {

    this.service.findAll().subscribe({
      next: (data) => this.books = data,
      error: (err) => {
        const tit = 'Erro ao buscar livros';
        const msg = err.mensage;
        this.alertService.error(tit, msg);
      }
    });


  }

}
