Feature: To launches the Chrome

  Scenario Outline: User lauching the CRM Website
    Given User Validates the Login Page
    When User enters the Username "<Username>"
    And User enters the Password "<Password>"
    And User clicks on the Login Btn
    Then the user validate the redirected page "<Expected>"

    Examples:
      | Username               | Password | Expected    |
      | yuvabala358@gmail.com  | Yuv@1234 | invalidUser |
      |                        | Yuv@1234 | EmptyUser   |
      | yuvabala3598@gmail.com |          | EmptyPass   |
      |                        |          | invalid     |
      | yuvabala3598@gmail.com | Yuv@1234 | Valid       |

  Scenario: User verify the Dashboard Module
    Given User Validates the Dashborad Module
    When User Clicks on Fresh Leads
    Then User Validates the Result
    And User clicks on Followup
    And User clicks on the Call icon
    Then User Validates  the Softphone
    And User clicks on the Start Call
    And User clicks on the X button
    And User clicks on the Edit icon
    Then User validates the Customer Information
    And User clicks on CancelX button
    And User clicks on Interested
    And User clicks on Closed

  Scenario: User Validates the Leads Module
    Given User Clicks on the Leads
    When User Validates the Leads mo
    And User clicks on LFollowup
    And User enter keyword on Filter "Bavya"
    Then User Validates the Result1
    And user clicks on LInterested
    And User cliks on LClosed

  Scenario: User Validates the Follow-Ups Module
    Given User clicks on Follow-Ups
    Then User validates the Follow-Up page
    And User Validates the Total Leads Count
    And user Validates Fresh Leads Count
    And User validates the Interested Leads Count
    And User Validates the Closed Leads count
    And User clicks on filter option
    And User clicks on Scedule Option
    Then Usr Validates the Schedule Lead popup
    And User clicks on Cancel Btn
    And User clicks on Daily Leads
    Then User Validates the Redirected page
    And User clicks on Follow-up
    And User Clicks on Closed Leads
    Then User clicks on Redirected Closed Leads page

  Scenario: User validates the Reports Module
    Given User clicks on the Reports Module
    Then User VAlidate the Reports Module Page
    And User validates Total calls card
    And User Validates the Conversion Rate card
    And User Validates the Success Rate card
    And User Validates the Avg Duration card
    Then User Validates the Detailed montly analysis
    And User clicks on month
    Then User validates the Detailed monthly analysis changes
    And User clicks on next btn
    Then User valiadtes the next page analysis
    And User clicks on Prev
    Then User Validates the Prev analysis page

  Scenario Outline: User Validates the Tickets Module
    Given User Clicks on the Ticket Module
    Then User Validates the Ticket Module
    And User clicks on Create Ticket Option
    Then User Validates the Create Ticket Option
    And User clicks on select customer
    And User clicks on select Assignee
    And User enters the Ticket Title "Help"
    And User clicks on select Priority
    And User clicks on select Category
    And user clicks on Save & Queue Ticket
    Then User Validates the Added Ticket

  Scenario: User Validates the Closed Leads Module
    Given User clicks on Closed Leads Module
    Then User Validates the Closed leads Module Page
    And User validates the Not interested card
    And User validates the Conv. Rate card
    And User validates the Avg. Duration Card leads
    And User validates the Bounce Rate Card
    And user clicks on Active Leads
    Then User Validates the Active Leads page
    And User clicks on Edit leads Option
    Then User Validates the Edit Lead Details
    And User Clicks on Cancel in Edit Leads Page
    And User clicks on Filter Days
    And User Selects days option
    Then User Validates the Filtered Page
    And User clicks on Closed Leads (NI)
    Then User Validates the Closed Leads (NI) Page
    And User clicks on Archived Page
    And User Validates the Archived Page
    And User Clicks on Export Report

  Scenario: User Validates the Settings Module
    Given User Clicks on Settings Module
    Then User validates the Settings Module
    And User Enters REP DAILY TARGET "<35>"
    Then User Validates the REP DAILY TARGET
    And User Enters AUTO-DIAL DELAY(SEC) "<2>"
    Then User Validates the AUTO-DIAL DELAY(SEC)
    And User clicks on CALL RECORDING
    And User clicks on Save Settings

  Scenario Outline: User Validates the Profile Module
    Given User clicks on Profile Module
    And User clicks on Edit Profile
    And User enters the Full Name "<Full Name>"
    And User clicks on Update
    Then User validates the Full Name
    And User validates the Mobile Number
    And User validates the Account Created
    And User Validates the Email Address
    And user Validates the Last Login
    Then user Validates OTOTAL CALLS
    And User valiadtes the OSUCCESS RATE
    And User valiadtes the OAVG DURATION
    And User valiadtes the TEAM RANK
    And User clicks on Change Password
    Then User valiadtes the Change Password
    And User clicks on Cancel

    Examples:
      | Full Name   |
      |             |
      | @           |
      | sa          |
      | Yuvabalanss |

  Scenario: User Validates the Logout Functions
    Given User clicks on the Logout Module
    Then User Validates the Logout Option
    And User clicks on CancelBtnn
    And User clicks on Logout Icon
    Then user validates the Logout btn
    And User clicks on Log out buttonf
