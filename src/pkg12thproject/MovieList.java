package pkg12thproject;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieList {

    //created array lists of movies, codes,prices and date&time
    ArrayList<String> movies = new ArrayList<String>(Arrays.asList("The Avengers",
            "A Wallflower", "Your Name", "Weathering You",
            "A silent Voice","Spirited Away","The fireflies","The legend","Last Airbender","Death Note"));

    ArrayList<String> codes = new ArrayList<String>(Arrays.asList("#011", "#012", "#013",
            "#014", "#015", "#016", "#017", "#018", "#019", "#020"));

    ArrayList<Double> prices = new ArrayList<Double>(Arrays.asList(50.0, 55.0,
            60.0, 65.0, 70.0, 75.0, 80.0, 85.0, 90.0, 95.0));

    ArrayList<String> dAndT = new ArrayList<String>(Arrays.asList("20/1 at 6 PM",
        "20/1 at 3 PM", "21/1 at 6 PM","21/1 at 3 PM", "22/1 at 6 PM",
        "22/1 at 3 PM", "23/1 at 6 PM","23/1 at 3 PM", "24/1 at 6 PM",
        "24/1 at 3 PM"));
   //method that views the movie list
    public void showMovieList() {
        System.out.println("Name"+"\t\t\t\t"+"code"+"\t\t\t"+"date and time"+"\t\t\t"+"price");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i) + "\t\t\t" + codes.get(i) + "\t\t\t" + dAndT.get(i)
                    + "\t\t\t" + prices.get(i)+"$");
        }
        System.out.println("\n");
    }
    
}
