package com.vanzay;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchContactMenuAction implements MenuAction {
    private final InMemoryContactsService service;
    Scanner scanner;

    public SearchContactMenuAction(Scanner scanner, InMemoryContactsService service) {
        this.scanner = scanner;
        this.service = service;
    }

    @Override
    public void doAction() {
        System.out.println("Enter the name or part of the contact you are looking for:");
        String enteredStr = scanner.nextLine();
        for (int i = 0; i < service.getAll().size(); i++) {
            if (service.getAll().get(i).getName().contains(enteredStr)) {
                System.out.println((i + 1) + ") " + service.getAll().get(i));
            }
        }
    }

    @Override
    public String getName() {
        return "Search for contacts";
    }

}
