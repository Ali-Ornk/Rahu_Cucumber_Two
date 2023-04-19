package exp2.Page_Objects;

import Utilities.GenericUtils;

public class PageObjectManager {
    public LandingPage landingPage;
    public OffersPage offersPage;

    public GenericUtils genericUtils;


    public LandingPage getLandingPage(){
        landingPage = new LandingPage();
        return landingPage;
    }
    public OffersPage OfferPage(){
        offersPage = new OffersPage();
        return offersPage;
    }



}
