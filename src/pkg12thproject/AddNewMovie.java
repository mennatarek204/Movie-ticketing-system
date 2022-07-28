package pkg12thproject;

import java.util.Scanner;

public class AddNewMovie extends MovieList {

    Scanner input = new Scanner(System.in);
    private String name;
    private String code;
    private String dateAndTime;
    private Double price;
//method that helps adding movies to the movielist class
    public void adding() {
        System.out.println("how many movies do you wanna add?");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("movie name");
            name = input.next();
            name += " "+input.next();

            System.out.println("movie code begins with#0");
            code = input.next();

            System.out.println("movie date and time");
            dateAndTime = input.next();
            dateAndTime += " "+input.next();
            dateAndTime += " "+input.next();
            dateAndTime += " "+input.next();

            System.out.println("movie price");
            price = input.nextDouble();

            movies.add(name);
            codes.add(code);
            dAndT.add(dateAndTime);
            prices.add(price);
            System.out.println(" ");
        }

    }

    @Override
    public void showMovieList() {
        super.showMovieList();
    }

}
