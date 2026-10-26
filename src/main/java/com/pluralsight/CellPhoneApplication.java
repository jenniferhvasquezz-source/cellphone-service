package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone myPhone = new CellPhone();

        System.out.println("What is the serial number? ");
        int serialNum = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("What model is the phone? ");
        String phoneModel = scanner.nextLine();

        System.out.println("Who is the carrier? ");
        String phoneCarrier = scanner.nextLine();

        System.out.println("What is the phone number? ");
        String num = scanner.nextLine();

        System.out.println("Who is the owner of the phone? ");
        String phoneOwner = scanner.nextLine();

        myPhone.setSerialNumber(serialnum);
        myPhone.setModel(phoneModel);
        myPhone.setCarrier(phoneCarrier);
        myPhone.setPhoneNumber(num);
        myPhone.setOwner(phoneOwner);

        System.out.println("\n--- Cell Phone Deatils ---");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());
    }

}

