///<reference types='cypress'/>

describe("Some practical Exercise",()=>{

beforeEach(()=>{
    cy.visit("",{failOnStatusCode:false});

})
it("First testCase",()=>{
    
  cy.get('[data-action-type="DISMISS"]').should('be.visible').click();
  
  cy.get('#searchDropdownBox').select("Movies & TV",{force:true});
  cy.get("#twotabsearchtextbox").type("tv");
  cy.contains("tv series 4k").click();
  cy.scrollTo(0,7000,{duration:2000});
  cy.get('[aria-label="Go to page 2"]').click();
  
});

it("TEST THE pagination2",()=>{
    
        cy.visit("https://www.amazon.com/s?k=tv+series+4k&i=movies-tv-intl-ship&page=2&xpid=fvWyCZoiEcnSy&crid=2JBKOZ889A774&qid=1743511290&sprefix=tv+series+4k%2Cmovies-tv-intl-ship%2C635&ref=sr_pg_2")
    
    
        cy.contains("House of the Dragon: The Complete Second Season (Steelbook/4K UHD)").click();
    
        cy.get("#buy-now-button").click();
        cy.get('[autocomplete="username"]').type("kotanakari1993@gmail.com",{delay:100});
        cy.get('[type="submit"]').click();
        cy.get('#ap_password').type("RRR#12345");
        cy.get('#signInSubmit').click();
        cy.get('#orderSummaryPrimaryActionBtn > .a-button-inner > .a-button-input').click();
    });

});


