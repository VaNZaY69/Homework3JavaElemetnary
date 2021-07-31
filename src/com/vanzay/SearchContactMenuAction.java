package com.vanzay;

public class SearchContactMenuAction implements MenuAction {
    private final InMemoryContactsService service;

    public SearchContactMenuAction(InMemoryContactsService service) {
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

}
