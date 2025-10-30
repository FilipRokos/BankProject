package org.example.cards;

import java.util.UUID;

public class PaymentCardFactory {
    private PaymentCardNumberGenerator paymentCardNumberGenerator;
    private PaymentCardCvvGenerator paymentCardCvvGenerator;
    private PaymentCardPinGenerator paymentCardPinGenerator;
    private PaymentCardExpireDateGenerator paymentCardExpireDateGenerator;

    public PaymentCardFactory(PaymentCardNumberGenerator paymentCardNumberGenerator, PaymentCardCvvGenerator paymentCardCvvGenerator, PaymentCardPinGenerator paymentCardPinGenerator, PaymentCardExpireDateGenerator paymentCardExpireDateGenerator) {
        this.paymentCardNumberGenerator = paymentCardNumberGenerator;
        this.paymentCardCvvGenerator = paymentCardCvvGenerator;
        this.paymentCardPinGenerator = paymentCardPinGenerator;
        this.paymentCardExpireDateGenerator = paymentCardExpireDateGenerator;
    }

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
