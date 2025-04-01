///<referance types="cypress"/>



describe("Validating the Registration Form",()=>{
    
        


it.skip("Step1 for Registration in openkartWebsit",()=>{
    cy.visit("https://naveenautomationlabs.com/opencart/")
    cy.get('.dropdown > .dropdown-toggle > .fa').click()
    cy.get('.dropdown-menu > :nth-child(1) > a').click()



//it("Step2 filling the form for the Registration purpose",()=>{
    cy.get("#input-firstname").type("Rajesh")
.should('have.value',"Rajesh")
cy.get('#input-lastname').type("rao").should('have.value',"rao")
cy.get('#input-email').type("kotanakari1993@gmail.com")
.should('have.value',"kotanakari1993@gmail.com")
cy.get("input[name='telephone']").type("1234")
cy.get("input#input-password").type("12345#")
cy.get("input#input-confirm").type("12345#")
cy.get("input[type='checkbox']").check()
cy.get("input[value='Continue']").click()


})

it("UserLogin and Logout",()=>{
    cy.visit("https://naveenautomationlabs.com/opencart/index.php?route=account/login")
    cy.get("input#input-email").type("kotanakari1993@gmail.com")
    cy.get("input#input-password").type("12345#")
    
    cy.debug()
    cy.get("input[type='submit']")

    .then((button)=>{
        cy.wrap(button).click()
    })
cy.scrollTo("bottom")
cy.get(".list-group").contains("Logout").click()
})


})









