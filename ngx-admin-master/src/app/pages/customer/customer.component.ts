import {Component, OnDestroy} from '@angular/core';
import { UserProfileService } from '../../services/userProfile.service'
@Component({
    selector: 'ngx-customer',
    styleUrls: ['./customer.component.scss'],
    templateUrl: './customer.component.html',
    providers:[UserProfileService]
  })
  export class CustomerComponent implements OnDestroy {
    
  profile = {};  
  
  constructor( private userProfileService:UserProfileService) {}

  
    ngOnDestroy() {
        
      }

      createCustomer() {
        console.log(this.profile);
        
        this.userProfileService.postUserProfile(this.profile).subscribe(profile => {
            console.log(profile);
        });
      }
  }