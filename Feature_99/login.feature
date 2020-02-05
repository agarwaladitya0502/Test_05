Feature: Login Action

Scenario Outline: Successfull Login with Valid Credentials

Given User is on Home Page
When User Navigate to Login Page
And User enters "<username>" and "<password>"
Then Message displayed Login Successfully

Examples:
| username  | password |
| admin    | password456 |

Scenario Outline: User adds category and subcategory
Given Users clicks on Category
And User enters "<category>" and "<subcategory>"
Then Message displayed category is added

Examples:
| category  | subcategory |
| sports    | basketball  |
| sports    | volleyball  |