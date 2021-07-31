package com.vanzay;

import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction{
    private Scanner scanner;
    private InMemoryContactsService service;

    public RemoveContactMenuAction(Scanner scanner, InMemoryContactsService service) {
        this.scanner = scanner;
        this.service = service;
    }

    @Override
    public void doAction() {
        System.out.println("Enter the number of the contact you want to delete: ");
        int number = scanner.nextInt();
        service.remove(number - 1);
        System.out.println("Contact deleted.");
    }

    @Override
    public String getName() {
        return "Remove contact";
    }

    @Override
    public boolean closeAfter() {
        // доработать
        System.out.println("Exit the program, enter 1, if you want to continue, enter 2");
        int choice = scanner.nextInt();
        return choice == 1;
    }
}
