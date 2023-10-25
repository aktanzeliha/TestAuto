@wip
Feature:Log in test

  Background: User is on the Log in page
    Given User open browser
    When User click Accept All Cookies
    And User click Log in
  @login
  Scenario: 1-Verify user able to login with valid credentials

    And User click "Hudl"
    And User enter email
    And User enter password
    And User click continue
    Then User verify successfully Log in
    Then Close Browser

  Scenario Outline: 2-Verify user will not able to login with invalid credentials

    And User click "Hudl"
    And User enter email "<email>"
    And User enter password "<password>"
    And User click continue
    And User verify error message "<error message>"
    Then Close Browser
    Examples:
      |email                  |password          |error message|
      |aktann.zeliha@gmail.com|                  |Please fill in all of the required fields|
      |                       |                  |Please fill in all of the required fields|
      |                       |VGVzdDEyMzQ1NiE=  |Please fill in all of the required fields|
      |test@abc.com           |jsahhasha         |We don't recognize that email and/or password|
      |aktann.zeliha@gmail.com|fsdss             |We don't recognize that email and/or password|
      |aktann.zelihagmail.com |VGVzdDEyMzQ1NiE=  |We don't recognize that email and/or password|

  @login
Scenario: 3-Verify user can Log Out successfully
  And User click "Hudl"
  And User enter email
  And User enter password
  And User click continue
  Then User verify successfully Log in
  And User click the log Out
  Then User verify successfully Log Out
  Then Close Browser