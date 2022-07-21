package com.bridgelabz.workshop2;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        AdressBook addressBook = new AdressBook();
        //addressBook.contactDetails();
        //addressBook.ShowDetails();

        Scanner scanner = new Scanner(System.in);

        boolean exit = true;
        while (exit) {
            System.out.println("Select option: \n" +
                    "1.Add Contact \n" +
                    "2.Edit Contact");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addressBook.contactDetails();
                    break;
                case 2:
                    addressBook.editDetails();
                    break;
                case 3:
                    exit = false;
                default:
                    break;
            }
        }
    }
}
