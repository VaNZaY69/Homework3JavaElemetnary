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
        System.out.println("Press enter to go to number entry");
        scanner.nextLine();
        System.out.print("Enter the contact's phone number: ");
        String phoneContact = scanner.nextLine();
        System.out.println("Press enter to add a contact");
        scanner.nextLine();
        service.add(new Contact(nameContact, phoneContact));
        System.out.println("The contact has been added.");
    }

    @Override
    public String getName() {
        return "Add contact";
    }
}
