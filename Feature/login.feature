Feature: Login functionality of LeafTaps application 

#Background: 
#Given Open the Chrome Browser
#And load the application url 'http://leaftaps.com/opentaps/control/login'

@regression
Scenario Outline: TC001 Login with positive data 

And Enter the username as <USR>
And Enter the password as <pwd>
When Click on Login button
Then Homepage will be displayed

Examples:
|USR|pwd|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@functional or @smoke
Scenario: TC002 Login with positive data 

And Enter the username as 'DemoCSR'
And Enter the password as 'cr@123'
When Click on Login button
But Error will be displayed



