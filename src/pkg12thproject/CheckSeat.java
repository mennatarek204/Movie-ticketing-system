package pkg12thproject;
//Checseat is a subclass of BookTicket

public class CheckSeat extends BookTicket {

    //created an array of number of seats
    private int[] seats = new int[60];
//    places reservations for seats

    public void reservations() {
        for (int i = 0; i < seats.length; i++) {
            if (getSeatno() != 0) {
                seats[(getSeatno() - 1)] = getSeatno();
            }
        }
    }

    @Override
    public void booking() {
        System.out.println("\nenter your name");
        setName(input.next());
        System.out.println("enter your phone");
        setPhone(input.next());
        System.out.println("enter movie code");
        setMovieCode(input.next());
        System.out.println("enter number of tickets");
        setNumberOfTickets(input.nextInt());
        System.out.println("enter desired seat/s number/s");
        for (int i = 0; i < getNumberOfTickets(); i++) {
            System.out.print("seat number ");
            setSeatno(input.nextInt());
            reservations();
        }
    }

    @Override
    public void viewing() {
        super.viewing();
        for (int i = 0; i < seats.length; i++) {
            if(seats[i]!=0)
            System.out.println("Seat number:\n" + seats[i]);
        }
    }

    //checks availabe and reserved seats
    public void checking() {
        reservations();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                System.out.println("seat" + (i + 1) + " is not reserved yet");
            } else {
                System.out.println("seat" + (i + 1) + " is already reserved");
                System.out.println("check another seat\n");
            }
        }
    }

}
