import { Component, OnDestroy } from '@angular/core';
import { NbThemeService } from '@nebular/theme';
import { takeWhile } from 'rxjs/operators';

import { UserActivityData, UserActive } from '../../../@core/data/user-activity';
import { UserProfileService } from '../../../services/userProfile.service';

@Component({
  selector: 'ngx-user-activity',
  styleUrls: ['./user-activity.component.scss'],
  templateUrl: './user-activity.component.html',
  providers:[UserProfileService]
})
export class ECommerceUserActivityComponent implements OnDestroy {

  private alive = true;

  userActivity: UserActive[] = [];
  type = 'month';
  types = ['week', 'month', 'year'];
  currentTheme: string;

  constructor(private themeService: NbThemeService,
              private userActivityService: UserActivityData, private userProfileService:UserProfileService) {
    this.themeService.getJsTheme()
      .pipe(takeWhile(() => this.alive))
      .subscribe(theme => {
        this.currentTheme = theme.name;
    });

    this.getUserActivity(this.type);
  }

  getUserActivity(period: string) {
    this.userActivityService.getUserActivityData(period)
      .pipe(takeWhile(() => this.alive))
      .subscribe(userActivityData => {
        this.userActivity = userActivityData;
      });
  }

  createCustomer() {
    var params = {
      "address1": "string",
      "address2": "string",
      "csid": 0,
      "gstno": "string",
      "mobile1": 0,
      "mobile2": 0,
      "name": "string",
      "pincode": 654326,
      "reference": "string",
      "shopname": "string",
      "state": "string"
    }
    this.userProfileService.postUserProfile(params).subscribe(profile => {
        console.log(profile);
    });
  }
  ngOnDestroy() {
    this.alive = false;
  }
}
