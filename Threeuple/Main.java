package Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input1 = scan.nextLine().split("\\s+");
        String names = String.join(" ", input1[0], input1[1]);
        String address = input1[2];
        String town = input1[3];
        Threeuple<String, String, String> tuple1 = new Threeuple<>(names, address, town);
        System.out.println(tuple1.getItem1() + " -> " + tuple1.getItem2() + " -> " + tuple1.getItem3());

        String[] input2 = scan.nextLine().split("\\s+");
        String name = input2[0];
        int litersOfBeer = Integer.parseInt(input2[1]);
        String drunk = input2[2];
        boolean isDrunk = false;

        if (drunk.equals("drunk")) {
            isDrunk = true;
        }
        Threeuple<String, Integer, Boolean> tuple2 = new Threeuple<>(name, litersOfBeer, isDrunk);
        System.out.println(tuple2.getItem1() + " -> " + tuple2.getItem2() + " -> " + tuple2.getItem3());

        String[] input3 = scan.nextLine().split("\\s+");
        String personName = input3[0];
        double bankBalance = Double.parseDouble(input3[1]);
        String bankName = input3[2];
        Threeuple<String, Double, String> tuple3 = new Threeuple<>(personName, bankBalance, bankName);
        System.out.println(tuple3.getItem1() + " -> " + tuple3.getItem2() + " -> " + tuple3.getItem3());
    }
}
