import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { TitleCaseFirstPipe } from '../pipes/title-case-first.pipe';

@Component({
  selector: 'app-greeting-card',
  standalone: true,
  imports: [FormsModule, TitleCaseFirstPipe],
  templateUrl: './greeting-card.html',
  styleUrls: ['./greeting-card.css']
})
export class GreetingCardComponent {
  firstName: string = '';
  timeOfDay: string = '';
  enthusiastic: boolean = false;

  toggleEnthusiastic() {
    this.enthusiastic = !this.enthusiastic;
  }
}
