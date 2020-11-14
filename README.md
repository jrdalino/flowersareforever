# Workshop: Pricing Algorithm Problem

## Objectives
- The objective of this workshop is to learn to solve the Pricing Algorithm problem using the Strategy Design Pattern.

## Overview
- During Checkout of products, one of the operations that needs to be performed is the calculation of the total price of the shopping cart. 
- Various discounts or marked up prices can be applied to certain products.
- For example, one month before the Mother’s Day, the prices of any Flowers will be jacked up by a certain amount.
- You will incorporate the Strategy pattern for switching between different computing algorithms for ‘calculateTotal‘ operation of the checkout method of the ShoppingCart class.

## Workshop 1
- During different seasons, the company may decide to vary the pricing schemes for its products. 
- For example, a month before Mother’s Day, the prices of Flowers are marked-up. 
- Different policies may be applied at different times of the year. 
- Flexibility is required, so that different pricing schemes can be selected by the application easily without making many modifications to the existing code.

## Solution
- Strategy Pattern offers a solution so that switching between the different pricing schemes is simplified. 
- Furthermore, the computation of the price itself is encapsulated in a separate class, so that changes in pricing scheme can be easily made.

## To do
- Improve two classes called MothersDayStrategy and ValentinesDayStrategy that implement (inherits from) the PricingStrategy interface (abstract class). 
- calculateTotal (..) method in the MothersDayStrategy class returns the total price of all the items. 
- If the item is a Flower, it marks up the price by 15%. 
- calculateTotal (..) method in the ValentinesDayStrategy class returns the total price of all the items. 
- If the item is a Toy, it marks up the price by 25%.

## Setup 
```
$ git clone https://github.com/jrdalino/flowersareforever.git
```

## Enum
```
DAISY = 2;
LILY = 3;
JASMINE = 4;
ROSE = 1;
FERN = 21;
SOFTTOY = 11;
```

## Output
```
runStrategy: BEGIN
RegularDayStrategy.calculateTotal: price for 2 = 0.3
RegularDayStrategy.calculateTotal: price for 3 = 0.9
RegularDayStrategy.calculateTotal: price for 4 = 0.7
RegularDayStrategy.calculateTotal: price for 1 = 1.0
RegularDayStrategy.calculateTotal: price for 21 = 0.2
RegularDayStrategy.calculateTotal: price for 11 = 1.5
Total price = 4.6000004

Expected quantity = 4.6

ValentinesDayStrategy.calculateTotal: price for 2 = 0.3
ValentinesDayStrategy.calculateTotal: price for 3 = 0.9
ValentinesDayStrategy.calculateTotal: price for 4 = 0.7
ValentinesDayStrategy.calculateTotal: price for 1 = 1.0
ValentinesDayStrategy.calculateTotal: price for 21 = 0.2
ValentinesDayStrategy.calculateTotal: price for 11 = 1.875
Total price = 4.9750004

Expected quantity = 4.975

MothersDayStrategy.calculateTotal: price for 2 = 0.345
MothersDayStrategy.calculateTotal: price for 3 = 1.035
MothersDayStrategy.calculateTotal: price for 4 = 0.80499995
MothersDayStrategy.calculateTotal: price for 1 = 1.15
MothersDayStrategy.calculateTotal: price for 21 = 0.2
MothersDayStrategy.calculateTotal: price for 11 = 1.5
Total price = 5.035

Expected quantity = 5.035

runStrategy: END
```

## Product Type Flower Validation
- Regular Price of DAISY, 2 = 0.30 vs Mother's Day Price of 0.345 which is 15% mark up
- Regular Price of LILY, 3 = 0.90 vs Mother's Day Price of 1.035 which is 15% mark up
- Regular Price of JASMINE, 4 = 0.70 vs Mother's Day Price of 0.805 which is 15% mark up
- Regular Price of ROSE, 5 = 1.00 vs Mother's Day Price of 1.15 which is 15% mark up

## Product Type Non-Flower or Non-Toy Validation
- Regular Price of FERN, 21 = 0.20 which i the same price for Mother's day and Valentines Day
 
## Product Type Toy Validation
- Regular Price of SOFTTOY, 11 = 1.50 vs Valentine's Day Price of 1.875 which is 25% mark up
