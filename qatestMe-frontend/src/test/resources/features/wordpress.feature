Feature: Test of content AddToYourOrder page
  #background wykonywany jest przed kazdym Scenario:
  #Background:
  #  Given User is on wordpress site "https://wordpress.com"
   # When  User clicks on loggin button
    #Then  Email login page is displayed
  #Alt+Enter na nierozwiazanym scenariuszu klikamy wszystkie definicje i wybieramy nasza klase, to automatycznie utworzy kod dla kazdego given when then w naszej klasie
  @wordpress @login
  Scenario: Checking of CartSubtotal content
    Given User is on wordpress site "https://wordpress.com"
    When  User clicks on loggin button
    Then  Email login page is displayed

    When  User enter email and clicks on continue button
    Then  Password login page is displayed
    When  User enter password and press continue button
    Then  Main loged page is displayed
#    When  User press avatar
#    Then  Personal page is displayed
#    When  User clicks notofication link
#    Then  Notification page is displayed
#    When  User press checkbox
#    Then  Checkbox is unselected