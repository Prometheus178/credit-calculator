package com.calculator;

import com.calculator.util.Convert;
import com.calculator.util.PaymentCount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

//        double amount = 100000;
//        double period = 6;
//        double rateInYear = 10;

//        double rateInMonth = Convert.rateYearToMonth(rateInYear);
//        System.out.println(rateInMonth);
//        double rateInFraction = Convert.rateInFraction(rateInYear);
//        System.out.println(rateInFraction);
//        double payment;
//
//        double paymentLoan;
//        double paymentRate;
//        double balanceLoan;
//        payment = PaymentCount.annuityPaymentInMonth(amount,rateInMonth, period);
//        System.out.println(payment);
//
//        paymentRate = PaymentCount.countPaymentRate(amount, rateInFraction);
//        System.out.println(paymentRate);
//        paymentLoan = PaymentCount.countPaymentLoan(payment,paymentRate);
//        System.out.println(paymentLoan);
//        balanceLoan = amount - paymentLoan;
//        System.out.println(balanceLoan);
//        List array = new ArrayList();
//        for (int i = 0; i < period-1; i++){
//            paymentRate = PaymentCount.countPaymentRate(balanceLoan,rateInFraction);
//            System.out.println(paymentRate);
//            paymentLoan = PaymentCount.countPaymentLoan(payment,paymentRate);
//            System.out.println(paymentLoan);
//            balanceLoan = balanceLoan - paymentLoan;
//        }










    }
}
