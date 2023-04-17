package com.learntocode;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // get address info
        System.out.println("Full name: ");
        String name = myScanner.nextLine();

        System.out.println("Billing Street: ");
        String billingSt = myScanner.nextLine();

        System.out.println("Billing City: ");
        String billingCity = myScanner.nextLine();

        System.out.println("Billing State: ");
        String billingState = myScanner.nextLine();

        System.out.println("Billing Zip: ");
        String billingZip = myScanner.nextLine();

        System.out.println("Shipping Street: ");
        String shippingSt = myScanner.nextLine();

        System.out.println("Shipping City: ");
        String shippingCity = myScanner.nextLine();

        System.out.println("Shipping State: ");
        String shippingState = myScanner.nextLine();

        System.out.println("Shipping Zip: ");
        String shippingZip = myScanner.nextLine();

        // use StringBuilder
        StringBuilder addresses = new StringBuilder();

        addresses.append(name).append("\n\n");

        addresses.append("Billing Addresses:\n");
        addresses.append(billingSt).append("\n");
        addresses.append(billingCity).append(",");
        addresses.append(billingState).append(" ");
        addresses.append(billingZip).append("\n\n");

        addresses.append("Shipping Addresses:\n");
        addresses.append(shippingSt).append("\n");
        addresses.append(shippingCity).append(",");
        addresses.append(shippingState).append(" ");
        addresses.append(shippingZip).append("\n");

        String allAddresses = addresses.toString();
        System.out.println(allAddresses);

    }
}
