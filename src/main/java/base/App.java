/*
 *  UCF COP3330 Summer 2021 Exercise 6 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);
    static App myApp = new App();

    public static void main(String[] args) {

        int numPeople = myApp.readNumPeople();
        int numPizzas = myApp.readNumPizzas();
        int numSlicesPerPizza = myApp.readNumSlicesPerPizza();

        String output = myApp.generateOutputString(numPeople, numPizzas, numSlicesPerPizza);
        myApp.displayOutput(output);
    }

    public int readNumPeople() {
        System.out.print("How many people? ");
        return Integer.parseInt(in.nextLine());
    }

    public int readNumPizzas() {
        System.out.print("How many pizzas do you have? ");
        return Integer.parseInt(in.nextLine());
    }

    public int readNumSlicesPerPizza() {
        System.out.print("How many slices per pizza? ");
        return Integer.parseInt(in.nextLine());
    }

    public int calculateNumSlices(int numPizzas, int numSlicesPerPizza) {
        return numPizzas * numSlicesPerPizza;
    }

    public int calculateNumSlicesPerPerson(int numSlices, int numPeople) {
        return numSlices / numPeople;
    }

    public int calculateNumLeftoverSlices(int numSlices, int numPeople) {
        return numSlices % numPeople;
    }

    public String generateOutputString(int numPeople, int numPizzas, int numSlicesPerPizza) {
        int numSlices = myApp.calculateNumSlices(numPizzas, numSlicesPerPizza);
        int numSlicesPerPerson = myApp.calculateNumSlicesPerPerson(numSlices, numPeople);
        int numLeftoverSlices = myApp.calculateNumLeftoverSlices(numSlices, numPeople);

        return String.format("%d people with %d pizzas (%d slices)%n" +
                "Each person gets %d pieces of pizza.%nThere are %d leftover pieces.",
                numPeople, numPizzas, numSlices, numSlicesPerPerson, numLeftoverSlices);
    }

    public void displayOutput(String output) { System.out.println(output); }
}
