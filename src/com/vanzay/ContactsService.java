package com.vanzay;

import java.util.ArrayList;

public interface ContactsService {
    ArrayList<Contact> getAll();

    void remove(int index);

    void add(Contact contact);
}
