Feature: IvoryPay User Registration

  @bello
  Scenario: User registration with valid details
    Given I am on IvoryPay App home page
    When I click on the SignUp link
    And I populate all the mandotory fields firstname as "Manuel", lastname as "Jacob", email as "kusharki@gmail.com", businessname as "MindTech Limited", country as "Nigeria", password and confirmpassword as "bello123$", and phonenumber as "08097777657"
    And I click What type of business do you own? as "Starter Business" and Are you a developer? as "No, I'm not"
    And I click I have read and agree to IvoryPay’s Privacy policy and Terms&Conditions link
    And I click Submit link
    Then I should received the message "Verify Email"
