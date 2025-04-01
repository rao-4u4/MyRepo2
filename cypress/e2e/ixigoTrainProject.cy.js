/// <referance types = "cypress"/>
describe("Ixigo Frontend Webtesting",()=>{
    cy.on('uncaught:exception',(err, Runnable)=>{
        return false
     })
  
    
    beforeEach(()=>{
        cy.visit("https://www.ixigo.com/trains")

    })

it("Test1 Validating url and title",()=>{


cy.url().should('contains',"ixigo")
cy.title().should('include',"Train Ticket Booking Online, Use IRCTC Login | ixigo")
})
it("Select the origine to Destination",()=>{
cy.get("[placeholder='Enter Origin']").click()
cy.get("[placeholder='Enter Origin']").type("Guntakal")
.should('have.value',"Guntakal").click()
cy.get('.w-full > :nth-child(1) > .flex-col > .body-md').click()
cy.get("[placeholder='Enter Destination']").type("Bengaluru")
.should('have.value',"Bengaluru")
cy.get('.w-full > :nth-child(1) > .flex-col > .body-md').click()
cy.get('[data-testid="calendar"] > .body-lg').click()//Selecting date
cy.get("button[class='react-calendar__navigation__arrow react-calendar__navigation__next-button']").click({force: true})


})

})











