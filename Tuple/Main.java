package Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input1 = scan.nextLine().split("\\s+");
        String names = String.join(" ", input1[0], input1[1]);
        String address = input1[2];
        Tuple<String, String> tuple1 = new Tuple<>(names, address);
        System.out.println(tuple1.getItem1() + " -> " + tuple1.getItem2());

        String[] input2 = scan.nextLine().split("\\s+");
        String name = input2[0];
        int liters = Integer.parseInt(input2[1]);
        Tuple<String, Integer> tuple2 = new Tuple<>(name, liters);
        System.out.println(tuple2.getItem1() + " -> " + tuple2.getItem2());

        String[] input3 = scan.nextLine().split("\\s+");
        int integer = Integer.parseInt(input3[0]);
        double floating = Double.parseDouble(input3[1]);
        Tuple<Integer, Double> tuple3 = new Tuple<>(integer, floating);
        System.out.println(tuple3.getItem1() + " -> " + tuple3.getItem2());
    }
}
