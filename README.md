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
