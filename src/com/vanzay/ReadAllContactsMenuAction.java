package com.vanzay;

import java.util.Scanner;

public class ReadAllContactsMenuAction implements MenuAction{
    private Scanner scanner;
    private InMemoryContactsService service;

    public ReadAllContactsMenuAction(Scanner scanner, InMemoryContactsService service) {
        this.scanner = scanner;
        this.service = service;
    }

    @Override
    public void doAction() {
        for (int i = 0; i < service.getAll().size(); i++) {
            System.out.println((i + 1) + ") " + service.getAll().get(i));
        }
    }

    @Override
    public String getName() {
        return "Read all contacts";
    }

    @Override
    public boolean closeAfter() {
        // доработать
        System.out.println("Exit the program, enter 1, if you want to continue, enter 2");
        int choice = scanner.nextInt();
        return choice == 1;
    }
}
