package com.vanzay;

public class ReadAllContactsMenuAction implements MenuAction {
    private final InMemoryContactsService service;

    public ReadAllContactsMenuAction(InMemoryContactsService service) {
        this.service = service;
    }

    @Override
    public void doAction() {
        for (int i = 0; i < service.getAll().size(); i++) {
            System.out.println((i + 1) + ") " + service.getAll().get(i));
        }
    }

    @Override
    public String getName() {
        return "Read all contacts";
    }

}
