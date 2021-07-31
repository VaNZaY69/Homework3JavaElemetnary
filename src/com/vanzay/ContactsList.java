package com.vanzay;

import java.util.Arrays;

public class ContactsList {
    private final int step = 10;
    private int currentSize = 0;
    private Contact[] contacts = new Contact[step];

    public Contact get(int index){
        return contacts[index];
    }

    public void set(int index, Contact c){
        contacts[index] = c;
    }

    public int size(){
        return currentSize;
    }

    public void remove(int index){
        for(int i = index; i < currentSize - 1; i++){
            contacts[i] = contacts[i+1]; }
        contacts[currentSize - 1] = null;
    }

    public void add(Contact c){
        if (currentSize >= contacts.length) {
            contacts = Arrays.copyOf(contacts, contacts.length + step);
        }
        contacts[currentSize] = c;
        currentSize++;
    }

    @Override
    public String toString() {
        return Arrays.toString(contacts);
    }
}
