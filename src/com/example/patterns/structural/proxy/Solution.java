package com.example.patterns.structural.proxy;

import com.example.patterns.structural.proxy.blood.BloodDBProxy;
import com.example.patterns.structural.proxy.blood.BloodSample;
import com.example.patterns.structural.proxy.blood.DB;

import java.util.List;
import java.util.Scanner;

import static java.util.Objects.nonNull;

/* 
Surprise, анонимус!
*/

public class Solution {

    public static void main(String[] args) {
        DB database = new BloodDBProxy();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Make request: ");
        String request = scanner.nextLine();

        if (request.matches("\\d+")) {
            BloodSample result = database.getById(Integer.parseInt(request));
            printSample(result);
        } else {
            List<BloodSample> results = database.find(request);
            printSamples(results);
        }
    }

    private static void printSample(BloodSample sample) {
        System.out.println(nonNull(sample) ? sample : "No results.");
    }

    private static void printSamples(List<BloodSample> samples) {
        if (samples.isEmpty()) {
            System.out.println("No results.");
        } else {
            samples.forEach(System.out::println);
        }
    }
}
