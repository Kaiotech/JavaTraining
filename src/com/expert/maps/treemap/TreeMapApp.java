package com.expert.maps.treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {

    public static void main(String[] args) {

        Map<String, Double> productPricesHashMap = new HashMap<>();
        productPricesHashMap.put("Chocolate bar", 1.5);
        productPricesHashMap.put("Pasta", 1.1);
        productPricesHashMap.put("Cereal", 1.7);
        productPricesHashMap.put("Apple", 0.15);

        System.out.println("HashMap:");
        for (String products : productPricesHashMap.keySet()) {
            System.out.println(products + " $" + productPricesHashMap.get(products));
        }

        System.out.println();
        System.out.println("LinkedHashMap:");
        Map<String, Double> productPricesLinkedHashMap = new LinkedHashMap<>();
        productPricesLinkedHashMap.put("Chocolate bar", 1.5);
        productPricesLinkedHashMap.put("Pasta", 1.1);
        productPricesLinkedHashMap.put("Cereal", 1.7);
        productPricesLinkedHashMap.put("Apple", 0.15);

        for (String products : productPricesLinkedHashMap.keySet()) {
            System.out.println(products + " $" + productPricesLinkedHashMap.get(products));
        }

        Map<String, Double> productPricesTreeMap = new TreeMap<>();
        productPricesTreeMap.put("Chocolate bar", 1.5);
        productPricesTreeMap.put("Pasta", 1.1);
        productPricesTreeMap.put("Cereal", 1.7);
        productPricesTreeMap.put("Apple", 0.15);

        System.out.println();
        System.out.println("TreeMap:");
        for (String products : productPricesTreeMap.keySet()) {
            System.out.println(products + " $" + productPricesTreeMap.get(products));
        }
    }
}











