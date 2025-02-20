package com.khan.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("payment using credit card payment strategy");
    }
}
