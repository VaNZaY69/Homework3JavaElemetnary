package com.vanzay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<MenuAction> actions = new ArrayList<>();

        ArrayList<Contact> contactsList = new ArrayList<>();

        InMemoryContactsService service = new InMemoryContactsService(scanner, contactsList);

        Menu menu = new Menu(scanner, actions);
        menu.addAction(new AddContactMenuAction(scanner, service));
        menu.addAction(new ReadAllContactsMenuAction(service));
        menu.addAction(new RemoveContactMenuAction(scanner, service));
        menu.addAction(new SearchContactMenuAction(scanner, service));

        menu.run();
    }
}
