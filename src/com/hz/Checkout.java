package com.hz;

public class Checkout {

    private SalesAction salesAction;

    public Checkout(SalesAction action) {
        this.salesAction = action;
    }

    public void nextInLine(Customer customer) {

        // init checkout
        DiscountCalculator discountCalculator = new DiscountCalculator(customer);
        discountCalculator.setAction(this.salesAction);

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(discountCalculator);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
