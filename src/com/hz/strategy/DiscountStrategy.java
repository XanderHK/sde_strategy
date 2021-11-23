package com.hz.strategy;

import com.hz.Customer;

public interface DiscountStrategy {
    double getDiscount(Customer customer, int productIndex, int productCount);
}
