Feature: Cart Items
Scenario Outline: User add below products into cart
Given cart has Product"<category>" and"<subCategory>" and "<product>"
Then  verify item count and Price
Examples: 
|category|subCategory|product|
|Electronics|Vivo|Y12|
|TVs & Appliances|Fully Automatic Front Load|IFB|






