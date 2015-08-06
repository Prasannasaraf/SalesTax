package com.salestax;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class ViewTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;
    private double salesTax = 0;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void viewShouldDisplayReceipt() {
        View view = new View();
        Item item1 = new Item("someThing", salesTax, 20);
        Item item2 = new Item("newThing", salesTax, 40);
        ArrayList<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        view.displayReceipt(items);
        assertEquals("someThing :20.0\n" +
                "newThing :40.0\n",outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }
}