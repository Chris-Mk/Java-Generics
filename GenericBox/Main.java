package GenericBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Box<Double>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double input = Double.parseDouble(scan.nextLine());
            Box<Double> box = new Box<>(input);
            list.add(box);
        }

        double toCompare = Double.parseDouble(scan.nextLine());

        System.out.println(Box.comparingByValue(list, toCompare));
    }
}
