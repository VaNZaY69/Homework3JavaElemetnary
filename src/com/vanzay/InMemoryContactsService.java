package com.vanzay;

import java.util.ArrayList;
import java.util.Scanner;

public class InMemoryContactsService implements ContactsService{
    private ArrayList<Contact> contactsList;
    Scanner scanner;

    public InMemoryContactsService(Scanner scanner, ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
        this.scanner = scanner;
    }

    public void getSearchedContacts() {
        System.out.println("Enter the name or part of the contact you are looking for:");
        String enteredStr = scanner.nextLine();
        //доделать поиск и вывод запрашиваемых видео 1.18.00 занятие 6, добавлять через этот адд
        for (int i = 0; i < contactsList.size(); i++) {
            if (contactsList.get(i).getName().contains(enteredStr)){
                System.out.println((i + 1) + ") " + contactsList.get(i));
            }

        }
    }

    @Override
    public ArrayList<Contact> getAll() {
        return contactsList;
    }

    @Override
    public void remove(int index) {
        contactsList.remove(index);
    }

    @Override
    public void add(Contact contact) {
        contactsList.add(contact);
    }
}
