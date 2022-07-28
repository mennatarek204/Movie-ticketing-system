package pkg12thproject;
//class BookTicket is a subclass of Movie

import java.util.Scanner;

public class BookTicket extends MovieList {

    private String name;
    private String movieCode;
    private String phone;
    private int seatno;
    private Double cost;
    private int numberOfTickets;
    Scanner input = new Scanner(System.in);
//declaration of method booking that takes input of customer to book his ticket

    public void booking() {
    }

    //gets the total cost of desired number of tickets
    public Double TotalCost() {
        int index = codes.indexOf(movieCode);
        cost = prices.get(index);
        Double total = numberOfTickets * cost;
        return total;
    }
//getters and setters of variables

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovieCode(String movieCode) {
        this.movieCode = movieCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getMovieCode() {
        return movieCode;
    }

    public String getPhone() {
        return phone;
    }

    public Double getCost() {
        return cost;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public int getSeatno() {
        return seatno;
    }

    @Override
    public void showMovieList() {
        super.showMovieList();
    }

    void viewing() {
        System.out.println("Name:\n" + getName());
        System.out.println("Phone:\n" + getPhone());
        System.out.println("Cost :\n" + TotalCost());
        System.out.println("Number of tickets:\n" + getNumberOfTickets());
    }

}
