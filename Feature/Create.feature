Feature: CreateLead functionality of Leaftaps

Scenario: TC001 Creating test lead

Given Open ChromeBrowser
When Click on CreateLead Tab
Given Enter the Company Name
And Enter FirstName
And Enter LastName
Then Click submit
Then Lead will be created
