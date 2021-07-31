package com.vanzay;

import java.util.ArrayList;

public interface ContactsService {
    ArrayList getAll();
    void remove(int index);
    void add(Contact contact);
}
