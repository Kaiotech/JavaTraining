package com.beginner;

public class OperatorsApp {

    public static void main(String[] args) {
        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a " + carModel + ": €" + price );

        int increasedPrice = price + 1000;
        System.out.println("The increased Price of a " + carModel + ": €" + increasedPrice );
        int decreasedPrice = price - 1000;
        System.out.println("The decreased Price of a " + carModel + ": €" + decreasedPrice );
        int twoCarsPrice = price * 2;
        System.out.println("Two " +carModel + ": €" + twoCarsPrice );
        int dodgeYouCanBuy = moneyInTheBank / price;
        System.out.println("from the money we have in the bank we can buy " +carModel + " " + dodgeYouCanBuy + " " + carModel);
        int moneyRemaining = moneyInTheBank % price;
        System.out.println("money we would remain after buying " + dodgeYouCanBuy + " " + carModel + ": €" + moneyRemaining );
        System.out.println();

        int priceNegative = - 14999;
        int priceNegativeWithPlusSign = + priceNegative;
        System.out.println("Negative price with plus sign: €" + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = - priceNegative;
        System.out.println("Negative price with minus sign: €" + priceNegativeWithMinusSign);
        int priceOneEuroIncrease = ++price;
        System.out.println("Prise after One euro price increase: €" + priceOneEuroIncrease);
        int priceOneEuroDecrease = --price;
        System.out.println("Prise after One euro price decrease: €" + priceOneEuroDecrease);
        System.out.println("This car is damaged: " + !isDamaged);
        System.out.println();


        System.out.println("Cars price equals the money in the bank: " + (price == moneyInTheBank));
        System.out.println("Cars price doesn't equals the money in the bank: " + (price != moneyInTheBank));
        System.out.println("Cars price is greater than the money in the bank: " + (price > moneyInTheBank));
        System.out.println("Cars price is lesser than the money in the bank: " + (price < moneyInTheBank));
        System.out.println("Cars price is greater or equals than the money in the bank: " + (price >= moneyInTheBank));
        System.out.println("Cars price is lesser or equals than the money in the bank: " + (price <= moneyInTheBank));
        System.out.println("The carModel variable's dataType is a String: " + (carModel instanceof String));
        System.out.println();


        String damageText = isDamaged ? "The car is damaged" : "The car is not damaged";
        System.out.println(damageText);
        System.out.println();

        String worthSeeingText = !isDamaged || price <= 20000 ? "The car is worth seeing" : "The car is not worth seeing";
        System.out.println(worthSeeingText);
        String worthRepairingText = isDamaged && price <= 10000 ? "The car is worth repairing" : "The car is not worth repairing";
        System.out.println(worthRepairingText);

        price += 1000;
        System.out.println("Price is increased: €" + price);
        price -= 2000;
        System.out.println("Price is decreased: €" + price);
        price *= 2;
        System.out.println("Price is multiplied: €" + price);
        price /= 2;
        System.out.println("Price is divided: €" + price);
        price %= 10000;
        System.out.println("Price is remained: €" + price);









    }
}
