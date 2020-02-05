import { NgModule } from '@angular/core';
import {
  NbActionsModule,
  NbButtonModule,
  NbCardModule,
  NbTabsetModule,
  NbInputModule,
  NbUserModule,
  NbRadioModule,
  NbSelectModule,
  NbListModule,
  NbIconModule,
} from '@nebular/theme';
import { NgxEchartsModule } from 'ngx-echarts';

import { ThemeModule } from '../../@theme/theme.module';
import { FormsModule } from '@angular/forms';
import { CustomerComponent } from './customer.component';
// import { FormsComponent } from '../forms/forms.component';
// import { FormInputsComponent } from '../forms/form-inputs/form-inputs.component';
// import { FormLayoutsComponent } from '../forms/form-layouts/form-layouts.component';
// import { DatepickerComponent } from '../forms/datepicker/datepicker.component';
// import { ButtonsComponent } from '../forms/buttons/buttons.component';

@NgModule({
  imports: [
    FormsModule,
    ThemeModule,
    NbCardModule,
    NbUserModule,
    NbButtonModule,
    NbInputModule,
    NbTabsetModule,
    NbActionsModule,
    NbRadioModule,
    NbSelectModule,
    NbListModule,
    NbIconModule,
    NbButtonModule,
    NgxEchartsModule,
  ],
  declarations: [
    CustomerComponent,
    //FormsComponent,
    //ButtonsComponent,
    //FormInputsComponent,
    //FormLayoutsComponent,
    //DatepickerComponent,
  ],
})
export class CustomerModule { }

