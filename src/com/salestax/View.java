package com.salestax;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public void displayReceipt(ArrayList<Item> items) {
        for(Item item : items) {
            System.out.println(item);
        }
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
