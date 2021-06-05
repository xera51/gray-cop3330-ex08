/*
 *  UCF COP3330 Summer 2021 Exercise 6 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void output_generated_in_proper_format() {
        App myApp = new App();
        int numPeople = 8;
        int numPizzas = 2;
        int numSlicesPerPizza = 8;

        String expectedOutput = String.format("8 people with 2 pizzas (16 slices)%n" +
                "Each person gets 2 pieces of pizza.%nThere are 0 leftover pieces.");
        String actualOutput = myApp.generateOutputString(numPeople, numPizzas, numSlicesPerPizza);

        assertEquals(expectedOutput, actualOutput);
    }
}