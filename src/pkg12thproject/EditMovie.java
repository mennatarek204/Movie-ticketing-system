package pkg12thproject;

import java.util.Scanner;

public class EditMovie extends MovieList {

    Scanner input = new Scanner(System.in);
    private String name;
    private String code;
    private String dateAndTime;
    private Double price;
    private int pos;
//method that edits certain rows of movies and their details as desired by the employer
    public void editing() {
        System.out.println("how many movies do you wanna edit?");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("movie position");
            pos = input.nextInt();
            
            System.out.println("new movie name");
            name = input.next();
            name += " "+input.next();
            movies.set((pos - 1), name);

            System.out.println("new movie code begins with#0");
            code = input.next();
            codes.set((pos - 1), code);

            System.out.println("new movie date and time");
            dateAndTime = input.next();
            dateAndTime += " "+input.next();
            dateAndTime += " "+input.next();
            dateAndTime += " "+input.next();
            dAndT.set((pos - 1), dateAndTime);

            System.out.println("new movie price");
            price = input.nextDouble();
            prices.set((pos - 1), price);

            System.out.println(" ");
        }

    }

    @Override
    public void showMovieList() {
        super.showMovieList();
    }
}
