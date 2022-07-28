package pkg12thproject;

import java.util.Scanner;

public class Person implements Instructions {

    Scanner input = new Scanner(System.in);
    protected String name;
    protected String status;
//overloading same methods of same name with different parameters

    public void print(String employer) {
        System.out.println("enter registeration number");
    }

    public void print() {
        System.out.println("enter your email: ");
    }

// implementing the interface
    @Override
    public void instruction() {
        if (status.equalsIgnoreCase("employer")) {
            print("employer");
            int regNo = input.nextInt();
            switches();

        } else if (status.equalsIgnoreCase("customer")) {
            print();
            String email = input.next();
            switches();
        } else {
            System.out.println("incorrect status! who are you?");
        }
    }

    @Override
    public void switches() {
    }

}
