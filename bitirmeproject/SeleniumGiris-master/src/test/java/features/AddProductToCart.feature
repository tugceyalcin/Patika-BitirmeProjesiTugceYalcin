@AddProduct

Feature: AddProductToCart
Scenario Outline: Add Product To Cart
Given Access"www.lcwaikiki.com.tr"
When Click Login Button
When Enter "<E-mail>" in e-mail box in login page
When Enter "<Password>" in password box in login page
When Click Log in button
When Click Women>Dress>Blouse
When Filter according to color>Black
When Click  one dress
When Pick Medium size
When Click Add to cart button
When Click My Cart
Then Check dress
When Click pay button

  Examples:
    |E-mail|                    |Password|
    |ttugceyalcin@gmail.com|    |tugce123456|
