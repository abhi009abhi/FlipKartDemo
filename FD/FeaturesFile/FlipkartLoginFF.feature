Feature: Login TO Flipkart
Scenario Outline: Login with Different Credentials
Given User enter credentials as "<userId>" and "<passWord>" and "<errMsg>" and "<userName>"
When  User click on login Button
Then  User is taken to FlipKart Home.
Examples: 
|userId|passWord|errMsg|userName|
#|onlytoShopping@gmail.com|FlipKart007||Abhishek|
|7507218335|FlipKart007||Abhishek|
#|onlytoShopping@gmail|FlipKart007|Please enter valid Email ID/Mobile number||
|7507218335|FlipKart006|Your username or password is incorrect||






