package com.hz.strategy;

import com.hz.Customer;

public class StrategyBlackFriday implements DiscountStrategy{
    @Override
    public double getDiscount(Customer customer, int productIndex, int productCount){
        return productCount != 80 ? (float) productCount / 100 : .80;
    }
}
