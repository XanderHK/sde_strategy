package com.hz;

import com.hz.strategy.DiscountStrategy;
import com.hz.strategy.StrategyBlackFriday;
import com.hz.strategy.StrategyChristmasEve;
import com.hz.strategy.StrategyNoAction;
import products.Product;

import java.util.HashMap;

public class DiscountCalculator {

    private Customer customer;

    private SalesAction action;

    private HashMap<SalesAction, DiscountStrategy> actions;

    public DiscountCalculator(Customer customer){
        this.customer = customer;
        actions = new HashMap<SalesAction, DiscountStrategy>();
        actions.put(SalesAction.NoAction, new StrategyNoAction());
        actions.put(SalesAction.ChristmasEve, new StrategyChristmasEve());
        actions.put(SalesAction.BlackFriday, new StrategyBlackFriday());
    }

    public void setAction(SalesAction action) {
        this.action = action;
    }

    public double getDiscount(Product product, int index, int productCount) {
        return 1 - this.actions.get(this.action).getDiscount(this.customer, index, productCount);
    }
}
