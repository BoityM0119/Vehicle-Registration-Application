package com.cars;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Collection<Car> cars = new ArrayList<Car>();

        System.out.println("Welcome to the vehicle registration app, please fill in your information.");
        System.out.println("(1) Capture vehicle details\n(2) View vehicle report \n(3) Exit app");

        int menuOption = input.nextInt();
        input.nextLine(); // clean up newline

        while ((menuOption == 1) || (menuOption == 2)) {
            if (menuOption == 1) {
                Car carObj = new Car();

                // Existing fields
                String make, model, vinNum, plateNum = "";
                int year, millage;

                // ✅ Added variables to store new DMV-related data
                String ownerName, driverLicenseNumber, address, insuranceProvider;
                String emissionsStatus, sellerName, lienholderName;

                // ✅ Prompt for owner's full name
                System.out.println("Enter owner's full legal name:");
                ownerName = input.nextLine();

                // ✅ Prompt for driver's license (identity)
                System.out.println("Enter driver's license number:");
                driverLicenseNumber = input.nextLine();

                // ✅ Prompt for residential address
                System.out.println("Enter residential address:");
                address = input.nextLine();

                // ✅ Prompt for insurance provider
                System.out.println("Enter insurance provider:");
                insuranceProvider = input.nextLine();

                // ✅ Emissions certificate (yes/no)
                System.out.println("Does the vehicle have an emissions certificate? (Yes/No):");
                emissionsStatus = input.nextLine();

                // ✅ Prompt for seller's name or dealership
                System.out.println("Enter seller's full name or business:");
                sellerName = input.nextLine();

                // ✅ Lienholder info, optional
                System.out.println("Enter lienholder name (or type 'None'):");
                lienholderName = input.nextLine();

                // Existing inputs for car info
                System.out.println("Enter make:");
                make = input.nextLine();

                System.out.println("Enter model:");
                model = input.nextLine();

                // ✅ VIN input with validation for length
                do {
                    System.out.println("Enter VIN (17 characters):");
                    vinNum = input.nextLine();
                } while (vinNum.length() != 17);

                System.out.println("Enter (1) for old format license plate number, and (2) for new format:");
                int plateChoice = input.nextInt();
                input.nextLine(); // clean up newline

                if (plateChoice == 1) {
                    System.out.println("Enter plate number (e.g., AAA555GP):");
                } else {
                    System.out.println("Enter plate number (e.g., AA66BBGP):");
                }
                plateNum = input.nextLine();

                System.out.println("Enter millage:");
                millage = input.nextInt();

                System.out.println("Enter year:");
                year = input.nextInt();
                input.nextLine(); // clean up newline

                // ✅ Save all new values to Car object
                carObj.setOwnerName(ownerName);
                carObj.setDriverLicenseNumber(driverLicenseNumber);
                carObj.setAddress(address);
                carObj.setInsuranceProvider(insuranceProvider);
                carObj.setEmissionsCertificateStatus(emissionsStatus);
                carObj.setSellerName(sellerName);
                carObj.setLienholderName(lienholderName);

                // Existing setters
                carObj.setMake(make);
                carObj.setModel(model);
                carObj.setVin(vinNum);
                carObj.setPlateNumber(plateNum);
                carObj.setYear(year);
                carObj.setMillage(millage);

                cars.add(carObj); // Add to collection

            } else {
                // View vehicle report
                if (!cars.isEmpty()) {
                    System.out.println("*************************\nVEHICLE REPORT\n*************************");
                    for (Car carObject : cars) {
                        // ✅ Added output for all new DMV fields
                        System.out.println(
                                "OWNER: " + carObject.getOwnerName() +
                                        "\nLICENSE: " + carObject.getDriverLicenseNumber() +
                                        "\nADDRESS: " + carObject.getAddress() +
                                        "\nINSURANCE: " + carObject.getInsuranceProvider() +
                                        "\nEMISSIONS CERTIFICATE: " + carObject.getEmissionsCertificateStatus() +
                                        "\nSELLER: " + carObject.getSellerName() +
                                        "\nLIENHOLDER: " + carObject.getLienholderName() +
                                        "\nMAKE: " + carObject.getMake() +
                                        "\nMODEL: " + carObject.getModel() +
                                        "\nVIN: " + carObject.getVin() +
                                        "\nPLATE: " + carObject.getPlateNumber() +
                                        "\nYEAR: " + carObject.getYear() +
                                        "\nMILLAGE: " + carObject.getMillage()
                        );
                        System.out.println("--------------------------");
                    }
                } else {
                    System.out.println("There are no cars captured.");
                }
            }

            System.out.println("(1) Capture vehicle details\n(2) View vehicle report\n(3) Exit app");
            menuOption = input.nextInt();
            input.nextLine(); // clean up newline
        }

        System.out.println("Thanks for using the app.");
    }
}