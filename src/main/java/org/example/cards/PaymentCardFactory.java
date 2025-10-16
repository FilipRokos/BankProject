package org.example.cards;

import java.util.UUID;

public class PaymentCardFactory {
    private PaymentCardNumberGenerator paymentCardNumberGenerator = new PaymentCardNumberGenerator();
    private PaymentCardCvvGenerator paymentCardCvvGenerator = new PaymentCardCvvGenerator();
    private PaymentCardPinGenerator paymentCardPinGenerator = new PaymentCardPinGenerator();
    private PaymentCardExpireDateGenerator paymentCardExpireDateGenerator = new PaymentCardExpireDateGenerator();

    public PaymentCard create() {
        String uuid = UUID.randomUUID().toString();
        String cardNumber = this.paymentCardNumberGenerator.generate();
        String cvv = this.paymentCardCvvGenerator.generate();
        String pin = this.paymentCardPinGenerator.generate();
        String expireMonth = this.paymentCardExpireDateGenerator.CalculateMonthExpire();
        String expireYear = this.paymentCardExpireDateGenerator.CalculateYearExpire();

        return new PaymentCard(cardNumber,uuid, cvv, pin, expireMonth, expireYear);
    }
}
