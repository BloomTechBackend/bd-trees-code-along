package com.bloomtech.trees.autosearch;

import com.bloomtech.trees.autosearch.models.Contact;
import com.bloomtech.trees.autosearch.models.Name;

import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Datasource dataSource = new Datasource();

        PhoneDirectory oldDirectory = dataSource.oldDirectory;
        PhoneDirectory newDirectory = dataSource.newDirectory;
    }
}
