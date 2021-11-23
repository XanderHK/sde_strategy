package com.hz.strategy;

import com.hz.Customer;

public class StrategyNoAction implements DiscountStrategy{
    @Override
    public double getDiscount(Customer customer, int productIndex, int productCount){
        return customer.isRegular() ? .15 : 0;
    }
}
