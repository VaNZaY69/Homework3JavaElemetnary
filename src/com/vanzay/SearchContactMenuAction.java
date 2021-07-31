package com.vanzay;

import java.util.Scanner;

public class SearchContactMenuAction implements MenuAction{
    private Scanner scanner;
    private InMemoryContactsService service;

    public SearchContactMenuAction(Scanner scanner, InMemoryContactsService service) {
        this.scanner = scanner;
        this.service = service;
    }

    @Override
    public void doAction() {
        service.getSearchedContacts();
    }

    @Override
    public String getName() {
        return "Search for contacts";
    }

    @Override
    public boolean closeAfter() {
        // доработать
        System.out.println("Exit the program, enter 1, if you want to continue, enter 2");
        int choice = scanner.nextInt();
        return choice == 1;
    }
}
