package com.pluralsight;

public class Exercise {
    public static void main(String[] args) {
        long vehicleIdentificationNumber = 100000_999999L;
        String vehicleMark = "Ford Explorer";
        String vehicleColor = "red";
        boolean towingPackage = true;
        boolean odometerReading = true;
        long price = 2000L;
        char qualityRating = 'A';
        String phoneNumber = "980-253-4587";
        String sSN = "235-25-3647";
        int zipCode = 56875;
//        TYPE CASTING
        int myint = (int) price;
        float myfloat = 1.8925f;
        double mydouble = (double) myfloat;
        System.out.println("Here you go "+ mydouble);
        System.out.println("Here you go "+ myint);
         System.out.println("Here you go "+ vehicleIdentificationNumber);
        System.out.println("Here you go "+ vehicleMark);
        System.out.println("Here you go "+ vehicleColor);
        System.out.println("Here you go "+ towingPackage);
        System.out.println("Here you go "+ odometerReading);
        System.out.println("Here you go "+ price);
        System.out.println("Here you go "+ qualityRating);
        System.out.println("Here you go "+ phoneNumber);
        System.out.println("Here you go "+ sSN);
        System.out.println("Here you go "+ zipCode);

    }
}
