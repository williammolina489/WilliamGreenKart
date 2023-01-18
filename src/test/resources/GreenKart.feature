@greenKart
Feature: Verify green kart item shipment
Scenario: Successfully add 2 items to cart and shipped to united states
Given user goes to green kart home page
And user verify the page title "GreenKart - veg and fruits kart"
When user capture all items from the page
And print sorted prices in decending order
And add second plus third item into cart
Then user go to cart page
And user verify total price 
And user go to next page to select country "United States"
And user verify successfully shipped item "Thank you, your order has been placed successfully"