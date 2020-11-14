# Workshop: Pricing Algorithm Problem

## Objectives
- The objective of this workshop is to learn to solve the Pricing Algorithm problem using the Strategy Design Pattern.

## Overview
- During Checkout of products, one of the operations that needs to be performed is the calculation of the total price of the shopping cart. Various discounts or marked up prices can be applied to certain products. For example, one month
- Various discounts or marked up prices can be applied to certain products.
- For example, one month before the Mother’s Day, the prices of any Flowers will be jacked up by a certain amount.

## Setup 
```
$ git clone https://github.com/jrdalino/flowersareforever.git
```

## Workshop 1:
- During different seasons, the company may decide to vary the pricing schemes for its products. 
- For example, a month before Mother’s Day, the prices of Flowers are marked-up. 
- Different policies may be applied at different times of the year. 
- Flexibility is required, so that different pricing schemes can be selected by the application easily without making many modifications to the existing code.

## Solution:
- Strategy Pattern offers a solution so that switching between the different pricing schemes is simplified. 
- Furthermore, the computation of the price itself is encapsulated in a separate class, so that changes in pricing scheme can be easily made.

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