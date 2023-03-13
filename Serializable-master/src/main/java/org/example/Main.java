package org.example;

import java.io.*;
import java.util.ArrayList;

import static org.example.Load.loadContacts;
import static org.example.Save.saveContacts;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Contacts> contacts = new ArrayList<>();
        contacts.add(new Contacts("John Doe", "johndoe@mail.com", "123456789"));
        contacts.add(new Contacts("Jane Doe", "janedoe@mail.com", "987654321"));


        saveContacts(contacts);

        ArrayList<Contacts> retrievedContacts = loadContacts(contacts);
        System.out.println("Retrieved Contacts: ");
        for (Contacts contact : retrievedContacts) {
            System.out.println(contact);
        }

    }
}