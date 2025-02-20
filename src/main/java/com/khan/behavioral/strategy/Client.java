package com.khan.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout();

        cart.setPaymentStrategy(new UpiPayment());
        cart.checkout();
    }
}
