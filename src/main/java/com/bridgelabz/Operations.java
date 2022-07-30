package com.bridgelabz;

import java.util.*;

public class Operations {
    static Scanner sc = new Scanner(System.in);
    //creating array list
    static ArrayList<Contacts> contactDetails = new ArrayList();
    static HashMap<String,  ArrayList<Contacts>>hashmap = new HashMap<String, ArrayList<Contacts>>();

    public static void AddressBook(Operations operations) {
        int ch;
        do {
            System.out.println("1. Add Address Book\n2. Count by City or State\n3. Exit");
            System.out.println("Select choice");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the Address Book Name");
                    String AddressBookName = sc.next();
                    ArrayList<Contacts> contactDetails1 = new ArrayList<>();
                    hashmap.put(AddressBookName, contactDetails1);
                    addDetails(contactDetails);
                    break;
                case 2:
                    //System.out.println("Enter the city or state");
                    //String cityOrState = sc.next();
                    //countFromState_City(cityOrState);
                    operations.countByCity();

            }
        } while (ch != 3);
    }

//    public static List<Contacts> countFromState_City(String name){
//        int count = 0;
//        for (Map.Entry<String, ArrayList<Contacts>> entry:hashmap.entrySet()) {
//            for (Contacts contact:entry.getValue()) {
//                if(contact.getcity().equals(name) || contact.getstate().equals(name)) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count + " Person belong from " + name + "\n");
//        return null;
//    }

    public void countByCity() {
        System.out.println("Enter the city Name:");
        String city = sc.next();
        contactDetails.stream().filter(contacts -> contacts.getcity().equalsIgnoreCase(city)).forEach(contacts -> System.out.println(contacts));
        long count = contactDetails.stream().filter(n -> n.getcity().equalsIgnoreCase(city)).count();
        System.out.println("Total number of Persons in city " + city + ":" + count);
    }

    public static ArrayList<Contacts> addDetails(ArrayList<Contacts> contactsDetails) {
        Contacts info = new Contacts();
        System.out.println("Enter First Name");
        info.setFirstName(sc.next());
        System.out.println("Enter Last Name");
        info.setFirstName(sc.next());
        System.out.println("Enter address");
        info.setFirstName(sc.next());
        System.out.println("Enter city");
        info.setFirstName(sc.next());
        System.out.println("Enter state");
        info.setFirstName(sc.next());
        System.out.println("Enter zip");
        info.setFirstName(sc.next());
        System.out.println("Enter contactNo");
        info.setFirstName(sc.next());
        System.out.println("Enter email");
        info.setFirstName(sc.next());
        return contactsDetails;
    }
}
