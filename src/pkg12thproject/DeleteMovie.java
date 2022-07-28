package pkg12thproject;

import java.util.Scanner;

public class DeleteMovie extends MovieList {

    Scanner input = new Scanner(System.in);
    private int pos;

    //method that helps removing certain movies with their details
    public void removing() {
        System.out.println("\nhow many movies do you wanna delete?");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("enter movie position you want to delete with its details");
            pos = input.nextInt();
            movies.remove((pos - 1));
            codes.remove((pos - 1));
            dAndT.remove((pos - 1));
            prices.remove((pos - 1));

            System.out.println("successfully deleted movie number " + pos);
        }

    }

    @Override
    public void showMovieList() {
        super.showMovieList();
    }
}
