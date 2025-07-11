package com.cars;

public class Car {
    // Existing vehicle info fields
    private String make;
    private String model;
    private String vin;
    private String plateNumber;
    private int year;
    private int millage;

    // ✅ NEW FIELDS: Added for DMV-related requirements
    private String ownerName;                  // Full legal name of the vehicle owner
    private String driverLicenseNumber;        // Owner’s driver license for identity proof
    private String address;                    // Residential address (proof of residency)
    private String insuranceProvider;          // Insurance provider name (proof of insurance)
    private String emissionsCertificateStatus; // Yes/No - emission compliance
    private String sellerName;                 // Seller's name or dealership
    private String lienholderName;             // Name of bank or finance company (if any)

    // Existing getters/setters
    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public String getPlateNumber() { return plateNumber; }
    public void setPlateNumber(String plateNumber) { this.plateNumber = plateNumber; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getMillage() { return millage; }
    public void setMillage(int millage) { this.millage = millage; }

    // ✅ NEW Getters/Setters for added fields
    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getDriverLicenseNumber() { return driverLicenseNumber; }
    public void setDriverLicenseNumber(String driverLicenseNumber) { this.driverLicenseNumber = driverLicenseNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getInsuranceProvider() { return insuranceProvider; }
    public void setInsuranceProvider(String insuranceProvider) { this.insuranceProvider = insuranceProvider; }

    public String getEmissionsCertificateStatus() { return emissionsCertificateStatus; }
    public void setEmissionsCertificateStatus(String emissionsCertificateStatus) { this.emissionsCertificateStatus = emissionsCertificateStatus; }

    public String getSellerName() { return sellerName; }
    public void setSellerName(String sellerName) { this.sellerName = sellerName; }

    public String getLienholderName() { return lienholderName; }
    public void setLienholderName(String lienholderName) { this.lienholderName = lienholderName; }
}