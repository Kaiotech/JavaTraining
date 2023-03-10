package com.advanced.exceptions;

public class DivideTwoNumbersException {

    public static void main(String[] args) {
        System.out.println(divide(30, 2));
        System.out.println(divide(15, 0));
        System.out.println("Job done");

    }

    private static int divide(int dividend, int divisor) {
        try {
            if (divisor == 0) {
                throw new ZeroDivisorException("The divisor cannot be 0. - Custom sht.");
            }
            return dividend / divisor;
        } catch (NullPointerException exception) {
            System.err.println("NullPointerException is thrown.");
            return 0;
        } catch (ZeroDivisorException exception) {
            System.err.println("The divisor cannot be 0.");
            exception.printStackTrace();
            return 0;
        } finally {
            System.out.println("Hello, hi.");
        }



    }
}
