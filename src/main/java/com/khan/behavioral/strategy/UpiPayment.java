package com.khan.behavioral.strategy;

public class UpiPayment implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("payment using UPI payment strategy");
    }
}
