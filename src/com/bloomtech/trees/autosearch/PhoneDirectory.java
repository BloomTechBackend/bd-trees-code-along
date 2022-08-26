package com.bloomtech.trees.autosearch;

import com.bloomtech.trees.autosearch.helpers.NameComparator;
import com.bloomtech.trees.autosearch.models.Contact;
import com.bloomtech.trees.autosearch.models.Name;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class PhoneDirectory {
    private final TreeMap<Name, Contact> contacts;
    private final String TERMINAL_CHARACTER = "~";

    public PhoneDirectory() {
        contacts = new TreeMap<>(new NameComparator());
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getName(), contact);
    }

    public void addContacts(TreeMap<Name, Contact> contacts) {

    }

    public TreeMap<Name, Contact> getContacts() {
        return contacts;
    }

    public TreeMap<Name, Contact> searchContacts(String searchString) {
        return new TreeMap<>();
    }
}
