package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    ArrayList<String> shoppingList = new ArrayList<>();
    Scanner item = new Scanner(System.in);
    String yesOrNo;
    String myItem;

    public void addToShoppingList() {
        do {
            System.out.println("Please enter item:");
            myItem = item.nextLine();
            shoppingList.add(myItem);
            System.out.println("Would you like to add anything else? (yes/no):");
            yesOrNo = item.nextLine();
            if (!"yes".equalsIgnoreCase(yesOrNo)) {
                System.out.println(shoppingList);
            }
        }
        while (yesOrNo.equalsIgnoreCase("yes"));
    }
}
