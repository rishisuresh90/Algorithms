package com.algorithms.basic;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by rishisuresh on 25/08/16.
 */
public class MergingColorsTogether {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of colors: ");
        Integer limit = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the Colors and '-' for blank:");
        String[] colors = new String[limit];
        IntStream.range(0, limit)
                 .forEach(index -> {
                    colors[index] = scanner.nextLine();
                 });

        int index = limit - 1;
        for(int i = limit - 1; i >= 0; i--) {
            if(colors[i].equalsIgnoreCase("-")) {
                String temp = colors[index];
                colors[index] = colors[i];
                colors[i] = temp;
                index--;
            }
        }

        System.out.println("O/P: ");
        IntStream.range(0, limit)
                .forEach(num -> {
                    System.out.println(colors[num]);
                });
    }
}
