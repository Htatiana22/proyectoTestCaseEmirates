@Stories1
Feature: emirates Page
  user wants to book a hotel

  @scenario1
  Scenario: book a hotel
    Given user wants to book a hotel
    When user clicks on hotels option
    |strValueDestination|
    |pereira|
    Then should show the book page
    And the user makes the reservation
    |strFirstName | strLastName | strEnterEmail          | strConfirmationEmail   | strPhoneNumber |
    |  Herika     | Reyes       | herika.reyes@gmail.com | herika.reyes@gmail.com | 3218937861     |









