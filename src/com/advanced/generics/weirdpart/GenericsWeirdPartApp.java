package com.advanced.generics.weirdpart;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsWeirdPartApp {

    public static void main(String[] args) {
        ArrayList<Integer> lotteryNumbers = new ArrayList<>(Arrays.asList(23, 45, 56, 63, 99));
        GenericFunctions.addNumbers(lotteryNumbers);
        GenericFunctions.printList(lotteryNumbers);
        GenericFunctions.displayToString(lotteryNumbers);
    }
}
