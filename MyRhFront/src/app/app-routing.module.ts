import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { OffersComponent } from './components/offers/offers.component';
import { OfferDetailsComponent } from './components/offer-details/offer-details.component';
import { HomeComponent } from './components/home/home.component';
import { OfferAppliedComponent } from './components/offer-applied/offer-applied.component';

const routes: Routes = [
  {
    path: "offer",
    component:OffersComponent,
  },
  {
    path: '',
    redirectTo: '/Home',
    pathMatch: 'full',
  },
  {
    path: 'Home',
    component: HomeComponent,
  },
  {
    path:"offerdetails/:id",
    component:OfferDetailsComponent
  },
  {
    path:"offerapplied/:id",
    component:OfferAppliedComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
