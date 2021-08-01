package com.vanzay;

import java.util.ArrayList;
import java.util.Scanner;

public class InMemoryContactsService implements ContactsService {
    private final ArrayList<Contact> contactsList;
    Scanner scanner;

    public InMemoryContactsService(Scanner scanner, ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
        this.scanner = scanner;
    }

    @Override
    public ArrayList<Contact> getSearchContact(String enteredStr) {
        ArrayList<Contact> desiredContact = new ArrayList<>();
        for (Contact contact : contactsList) {
            if (contact.getName().contains(enteredStr)) {
                desiredContact.add(contact);
            }
        }
        return desiredContact;
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
