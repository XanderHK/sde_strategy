package com.hz.strategy;

import com.hz.Customer;

public class StrategyChristmasEve implements DiscountStrategy{
    @Override
    public double getDiscount(Customer customer, int productIndex, int productCount){
         return productIndex == 0 ? .2 : .125;
    }
}
