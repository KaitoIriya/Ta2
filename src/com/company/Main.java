package com.company;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
        Author a1 = new Author("Bill", "Bill1976@gmail.com", 'M');
        Author a2 = new Author("Alexandra", "Ale228322@gmail.com", 'F');
        a2.setEmail("Testmail1@gmail.com");
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        System.out.println();

        Ball b1 = new Ball(21.0, 51.0);
        Ball b2 = new Ball();
        b1.setX(33.0);
        b1.setY(66.0);
        b2.setXY(15.0, 150.0);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}
