Feature: Select Product
Scenario Outline: User is on Home Page
Given User selects  "<category>" and "<subCategory>" and "<product>" as
When  click on user Product
Then  user is taken to product Page
Examples: 
|category|subCategory|product|
#|Electronics|Mi|Redmi 8|
|TVs & Appliances|Inverter AC|Godrej|




