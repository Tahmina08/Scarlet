Feature: Test Xfinity Functionalities

  Background:
    Given User is on the home page

    @InternetDeals
    Scenario: A user wants to check Internet deals

      When user mouse hover to Internet Menu
      And clicks on the Internet Deals option
      Then user lands on the Internet Service Deals

    @Speed_Test
    Scenario: user would like to perform a speed test

      When user clicks on support button
      And clicks on perform a speed test
      Then User lands on Xfinity speed test page

    @Flex_Streaming
    Scenario: user would like to get more information on Flex streaming
      When user mouse hovers to Tv&Streaming option
      And  clicks on Flex Streaming to open the page
      Then User lands on Xfinity Flex page

    @Phone_Compatibility
    Scenario: user would like to open Check phone compatibility page successfully

      When user clicks on Mobile option
      And  clicks on Check Phone Compatibility
      And clicks on Check Compatibility
      Then User lands on Check Phone Compatibility Page

    @Professional_Monitoring
    Scenario: user would like to get more information about professional monitoring

      When User mouse hovers to Security
      And  clicks on Professional monitoring
      Then User lands on professional monitoring page

  @Calling_features
  Scenario: user would like to see calling features

    When user mouse hovers to Home Phone option
    And clicks on Features
    And clicks see all calling features
    Then User lands on Xfinity voice features page

    @Compare_The_Competition
    Scenario: User would like to compare with other competitor service

      When user clicks on compare the competition option
      Then User lands on Xfinity VS. FiOs Page

  @Find_A_Store
  Scenario: user would like to Find a store

    When user clicks on Find a Store Option
    Then User lands on Find a retail Store page


  @My_Xfinity
  Scenario: user would like to open My xfinity page

    When user Clicks on MyXfinity Icon
    Then user lands on My Xfinity Page

  @Latino_Channels
  Scenario: User would like see all the Latino Channels

    When User mouse hovers to Tv&Streaming
    And Clicks on Latino from menu bar
    And Clicks on View Latino Channels
    Then View Latino Channel Lineup Page
