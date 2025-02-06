import { Component } from '@angular/core';
<<<<<<< HEAD
import { Supplier } from '../../types/Supplier';
=======
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Supplier } from '../../types/Supplier';
import { of } from 'rxjs';
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8

@Component({
  selector: 'app-suppliersample',
  standalone: true,
<<<<<<< HEAD
  imports: [],
=======
  imports: [], // Add necessary imports
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
  templateUrl: './suppliersample.component.html',
  styleUrls: ['./suppliersample.component.css'] 
})
export class SupplierSampleComponent {
<<<<<<< HEAD
  supplier:Supplier = new Supplier(1, "John Wane", "johnwane@gmail.com", "9876543210", "texas", "johnwane", "July@101", "USER");
=======
  // Component logic goes here
>>>>>>> 6eac17dfc6959ce859888e6275c17b3e3a5462e8
}