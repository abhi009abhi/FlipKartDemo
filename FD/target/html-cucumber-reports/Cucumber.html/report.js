$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:FeaturesFile/FlipkartAllProductFF.feature");
formatter.feature({
  "name": "Select Product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User is on Home Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User selects  \"\u003ccategory\u003e\" and \"\u003csubCategory\u003e\" and \"\u003cproduct\u003e\" as",
  "keyword": "Given "
});
formatter.step({
  "name": "click on user Product",
  "keyword": "When "
});
formatter.step({
  "name": "user is taken to product Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "subCategory",
        "product"
      ]
    },
    {
      "cells": [
        "Electronics",
        "Vivo",
        "Y20"
      ]
    },
    {
      "cells": [
        "TVs \u0026 Appliances",
        "Fully Automatic Front Load",
        "IFB"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User is on Home Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User selects  \"Electronics\" and \"Vivo\" and \"Y20\" as",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkarAllProductSDF.user_selects_and_and_as(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on user Product",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkarAllProductSDF.click_on_user_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to product Page",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkarAllProductSDF.user_is_taken_to_product_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User is on Home Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User selects  \"TVs \u0026 Appliances\" and \"Fully Automatic Front Load\" and \"IFB\" as",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkarAllProductSDF.user_selects_and_and_as(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on user Product",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkarAllProductSDF.click_on_user_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to product Page",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkarAllProductSDF.user_is_taken_to_product_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:FeaturesFile/FlipkartCartFF.feature");
formatter.feature({
  "name": "Cart Items",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User add below products into cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "cart has Product\"\u003ccategory\u003e\" and\"\u003csubCategory\u003e\" and \"\u003cproduct\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "verify item count and Price",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "subCategory",
        "product"
      ]
    },
    {
      "cells": [
        "Electronics",
        "Vivo",
        "Y20"
      ]
    },
    {
      "cells": [
        "TVs \u0026 Appliances",
        "Fully Automatic Front Load",
        "IFB"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User add below products into cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "cart has Product\"Electronics\" and\"Vivo\" and \"Y20\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartCartSDF.cart_has_Product_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify item count and Price",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartCartSDF.verify_item_count_and_Price()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User add below products into cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "cart has Product\"TVs \u0026 Appliances\" and\"Fully Automatic Front Load\" and \"IFB\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartCartSDF.cart_has_Product_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify item count and Price",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartCartSDF.verify_item_count_and_Price()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:FeaturesFile/FlipkartHomeFF.feature");
formatter.feature({
  "name": "User Navigate to Menu",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User Navigate to His Choice of Menu",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has login successfully",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on \"\u003ccategory\u003e\" and \"\u003csubCategory\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user is taken to Product Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "subCategory"
      ]
    },
    {
      "cells": [
        "Electronics",
        "Vivo"
      ]
    },
    {
      "cells": [
        "TVs \u0026 Appliances",
        "Fully Automatic Front Load"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Navigate to His Choice of Menu",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has login successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartHomeSDF.user_has_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"Electronics\" and \"Vivo\"",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartHomeSDF.user_clicks_on_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to Product Page",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartHomeSDF.user_is_taken_to_Product_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User Navigate to His Choice of Menu",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has login successfully",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartHomeSDF.user_has_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"TVs \u0026 Appliances\" and \"Fully Automatic Front Load\"",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartHomeSDF.user_clicks_on_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is taken to Product Page",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartHomeSDF.user_is_taken_to_Product_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:FeaturesFile/FlipkartLoginFF.feature");
formatter.feature({
  "name": "Login TO Flipkart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with Different Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enter credentials as \"\u003cuserId\u003e\" and \"\u003cpassWord\u003e\" and \"\u003cerrMsg\u003e\" and \"\u003cuserName\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User click on login Button",
  "keyword": "When "
});
formatter.step({
  "name": "User is taken to FlipKart Home.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "passWord",
        "errMsg",
        "userName"
      ]
    },
    {
      "cells": [
        "7507218335",
        "FlipKart007",
        "",
        "Abhishek"
      ]
    },
    {
      "cells": [
        "7507218335",
        "FlipKart006",
        "Your username or password is incorrect",
        ""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with Different Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enter credentials as \"7507218335\" and \"FlipKart007\" and \"\" and \"Abhishek\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartLoginSDF.userLoginData(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login Button",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartLoginSDF.submitLoginForm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is taken to FlipKart Home.",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartLoginSDF.verifyUserNameHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with Different Credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User enter credentials as \"7507218335\" and \"FlipKart006\" and \"Your username or password is incorrect\" and \"\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartLoginSDF.userLoginData(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on login Button",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartLoginSDF.submitLoginForm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is taken to FlipKart Home.",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartLoginSDF.verifyUserNameHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:FeaturesFile/FlipkartProductFF.feature");
formatter.feature({
  "name": "Select Product",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Product is Added To Cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User selects Product as \"\u003ccategory\u003e\" and \"\u003csubCategory\u003e\" and \"\u003cproduct\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "clicks on Add to Cart",
  "keyword": "When "
});
formatter.step({
  "name": "product is added to cart",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "subCategory",
        "product"
      ]
    },
    {
      "cells": [
        "Electronics",
        "Vivo",
        "Y20"
      ]
    },
    {
      "cells": [
        "TVs \u0026 Appliances",
        "Fully Automatic Front Load",
        "IFB"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Product is Added To Cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User selects Product as \"Electronics\" and \"Vivo\" and \"Y20\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartProductSDF.user_selects_Product_as_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Add to Cart",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartProductSDF.clicks_on_Add_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartProductSDF.product_is_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Product is Added To Cart",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User selects Product as \"TVs \u0026 Appliances\" and \"Fully Automatic Front Load\" and \"IFB\"",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartProductSDF.user_selects_Product_as_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on Add to Cart",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartProductSDF.clicks_on_Add_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "product is added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "FlipkartProductSDF.product_is_added_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});