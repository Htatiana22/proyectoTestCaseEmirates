@Stories2
Feature: booking Page
  User wants to apply filters when searching for a hotel to reserve one according to preferences

  @scenario2
  Scenario: Filter preferences to book a hotel

    Given user wants to filter the search
    When user clicks filter by section
    Then should automatically load the results according to the selected filter
      |strFirstName | strLastName | strEnterEmail          | strConfirmationEmail   | strPhoneNumber |
      |  Herika     | Reyes       | herika.reyes@gmail.com | herika.reyes@gmail.com | 3218937861     |
