Feature: User Navigate to Menu
Scenario Outline:User Navigate to His Choice of Menu
Given User has login successfully
When User clicks on "<category>" and "<subCategory>"
Then user is taken to Product Page
Examples:
|category|subCategory|
|Electronics|Mi|
|TVs & Appliances|Fully Automatic Front Load|

