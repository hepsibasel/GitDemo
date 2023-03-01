Feature: actiTime page

Scenario Outline: Validate Smit,Brettt page
Given User should be on landing page
When User enter "admin" and "manager"
And User clicks on Login button
And Click on Me dropdown
And Select "<dropdowValue>" value from dropdown
Then "<dropdowValue>" details should be displayed
And "<dropdownValue>" is displayed

Examples:
|dropdowValue|
|Smith, Brett|
|White, Janes|




