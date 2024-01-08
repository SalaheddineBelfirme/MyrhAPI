import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OffersComponent } from './components/offers/offers.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { OfferDetailsComponent } from './components/offer-details/offer-details.component';
import { HomeComponent } from './components/home/home.component';
import { OfferAppliedComponent } from './components/offer-applied/offer-applied.component';

@NgModule({
  declarations: [
    AppComponent,
    OffersComponent,
    NavbarComponent,
    OfferDetailsComponent,
    HomeComponent,
    OfferAppliedComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
