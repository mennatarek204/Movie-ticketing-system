package pkg12thproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//used polymorphism to create arrays of superclass types, and store objects of subtypes as elements
        Person[] p = {new employer(), new customer()};
        for (int i = 0; i < p.length; i++) {
            System.out.println("enter your status: 'employer' or 'customer'");
            p[i].status = input.next();
            p[i].instruction();
        }
//        main(args);
    }
}
