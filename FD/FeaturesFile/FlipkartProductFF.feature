Feature: Select Product
Scenario Outline: Product is Added To Cart
Given User selects Product as "<category>" and "<subCategory>" and "<product>"
When  clicks on Add to Cart 
Then  product is added to cart
Examples: 
|category|subCategory|product|
|Electronics|Vivo|Y20|
|TVs & Appliances|Fully Automatic Front Load|IFB|



