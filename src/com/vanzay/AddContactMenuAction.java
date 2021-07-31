package com.vanzay;

import java.util.Scanner;

public class AddContactMenuAction implements MenuAction {
    private Scanner scanner;
    private InMemoryContactsService service;

    public AddContactMenuAction(Scanner scanner, InMemoryContactsService service) {
        this.scanner = scanner;
        this.service = service;
    }

    @Override
    public void doAction() {
        System.out.print("Enter contact name: ");
        String nameContact = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter the contact's phone number: ");
        String phoneContact = scanner.nextLine();
        scanner.nextLine();
        service.add(new Contact(nameContact, phoneContact));
        System.out.println("The contact has been added.");
    }

    @Override
    public String getName() {
        return "Add contact";
    }

    @Override
    public boolean closeAfter() {
        // доработать
        System.out.println("Exit the program, enter 1, if you want to continue, enter 2");
        int choice = scanner.nextInt();
        return choice == 1;
    }

}
