package pkg12thproject;
//class customer is a subclass of Person

import java.util.Scanner;

public class customer extends Person {
    String email;
    //COMPOSITION
    CheckSeat check = new CheckSeat();
    BookTicket book=new BookTicket();
    ShowMyTicket ticket= new ShowMyTicket();
    MovieList m= new AddNewMovie();
    //scans input for switches method
    Scanner input = new Scanner(System.in);

//prints the instructions made only for customers
    public void instructionOfCustomer() {
        System.out.println("\npress [4] To view Movie list");
        System.out.println("press [5] To book a ticket");
        System.out.println("press [6] To check available seats");
        System.out.println("press [7] To view my ticket");
        System.out.println("press [0] To quit");
    }

//method that switches over the options desired by the customer
    @Override
    public void switches() {
        int enter = 10;
        while (enter != 0) {
            instructionOfCustomer();
            enter = input.nextInt();
            switch (enter) {
                case 4:
                    m.showMovieList();
                    break;
                case 5:
                    System.out.println("here's our movie list please pick one.\n");
                    check.showMovieList();
                    check.booking();
                    System.out.println("total cost of ticket/s is/are " + check.TotalCost()+"\n");
                    break;
                case 6:
                    check.checking();
                    break;
                case 7:
                    check.viewing();
                    break;
                case 0:
                    System.out.println("\nsuccessfully quitted!\n");
                    break;
                default:
                    System.out.println("Wrong choice!");

            }
        }
    }

}
