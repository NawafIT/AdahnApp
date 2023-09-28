package org.example;

import org.example.prayer.PrayerByCity;
import org.example.prayer.PrayerByGeo;
import org.example.prayer.PrayerByLocation;
import org.example.prayer.PrayerCity;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {


        PrayerCity byCity = new PrayerByCity();
        boolean exitLoop = false;
        Start(byCity, exitLoop);
    }

    public static void Start(PrayerCity byCity, boolean exitLoop) {
        while (!exitLoop) {

            switch (cityList()) {
                case "1":
                    jeddahCity("jeddah", byCity);
                    break;
                case "2":
                    riyadhCity("riyadh", byCity);
                    break;
                case "3":
                    dammamCity("dammam", byCity);
                    break;
                case "4":
                    makkahCity("makkah", byCity);
                    break;
                case "5":
                    yanbuCity("yanbu", byCity);
                    break;

                case "6":
                    exitLoop = true;
                    break;

                default:
                    System.out.println("\nYou should enter number from 1 to 5!");
            }

        }
    }

    public static void jeddahCity(String city, PrayerCity byCity) {
        System.out.println(byCity.prayerByCity(city));

    }

    public static void riyadhCity(String city, PrayerCity byCity) {
        System.out.println(byCity.prayerByCity(city));

    }

    public static void dammamCity(String city, PrayerCity byCity) {
        System.out.println(byCity.prayerByCity(city));

    }

    public static void makkahCity(String city, PrayerCity byCity) {
        System.out.println(byCity.prayerByCity(city));

    }

    public static void yanbuCity(String city, PrayerCity byCity) {
        System.out.println(byCity.prayerByCity(city));

    }

    public static String cityList() {
        System.out.println(
                "\nfrom the list of cities choose your city to display prayer times\n" +
                        "---------------------------------------------------------------------\n" +
                        "1- Jeddah\n" +
                        "2- Riyadh\n" +
                        "3- Dammam\n" +
                        "4- Makkah\n" +
                        "5- Yanbu\n" +
                        "---------------------------------------------------------------------\n" +
                        "6- To exit \n" +
                        "---------------------------------------------------------------------"

        );

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Your City:");
        return input.next();
    }
}


