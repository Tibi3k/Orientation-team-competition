import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-new-race',
  templateUrl: './new-race.component.html',
  styleUrls: ['./new-race.component.css']
})
export class NewRaceComponent {
  form: FormGroup;

  constructor(private fb: FormBuilder) {
    this.form = this.fb.group({
      dateRange: this.fb.group({
        name: ['', Validators.required],
        startDate: [null, Validators.required],
        endDate: [null, Validators.required],
        startHour: ['', Validators.required],
        endHour: ['', Validators.required],
      })
    });
  }
}
