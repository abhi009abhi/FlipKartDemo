Feature: All Products
Scenario Outline: User is on Home Page
Given User selects  "<category>" and "<subCategory>" and "<product>" as
When  click on user Product
Then  user is taken to product Page
Examples: 
|category|subCategory|product|
|Electronics|Vivo|Y12|
|TVs & Appliances|Fully Automatic Front Load|IFB|
|TVs & Appliances|Fully Automatic Front Load|Y20|




