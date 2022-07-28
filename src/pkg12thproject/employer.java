package pkg12thproject;
// class person is a subclass of Person

import java.util.Scanner;

public class employer extends Person {
    int regNo;
    //COMPOSITION
    AddNewMovie add = new AddNewMovie();
    DeleteMovie delete = new DeleteMovie();
    EditMovie edit = new EditMovie();
    MovieList m = new AddNewMovie();

    Scanner in = new Scanner(System.in);

//instructions for employees only
    public void instructionOfEmployer() {
        System.out.println("\npress [1] To add a new Movie");
        System.out.println("press [2] To edit a Movie");
        System.out.println("press [3] To delete a movie");
        System.out.println("press [4] To view Movie list");
        System.out.println("press [0] To quit");
    }

//method that switches over the options desired by the employer
    @Override
    public void switches() {
        int enter = 10;
        while (enter != 0) {
            instructionOfEmployer();
            //scans input for switches method
            enter = in.nextInt();
            switch (enter) {
                case 1:
                    System.out.println("you can add on this list");
                    m.showMovieList();
                    add.adding();
                    add.showMovieList();
                    break;
                case 2:
                    System.out.println("you can edit on this list");
                    m.showMovieList();
                    edit.editing();
                    edit.showMovieList();

                    break;
                case 3:
                    System.out.println("you can delete on this list");
                    m.showMovieList();
                    delete.removing();
                    delete.showMovieList();
                    break;
                case 4:
                    System.out.println("clean version\n");
                    m.showMovieList();
                    System.out.println("after deletion\n");
                    delete.showMovieList();
                    System.out.println("after editing\n");
                    edit.showMovieList();
                    System.out.println("after adding\n");
                    add.showMovieList();
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
