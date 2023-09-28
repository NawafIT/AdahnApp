package org.example.prayer;

public class PrayerByCity implements PrayerCity {

    private PrayerByGeo p = new PrayerByLocation();


    @Override
    public String prayerByCity(String city) {
        if (city.equalsIgnoreCase("Jeddah")) {
            return p.prayerByGeo(21.492500, 39.177570);
        } else if (city.equalsIgnoreCase("Riyadh")) {
            return p.prayerByGeo(24.774265, 46.738586);
        } else if (city.equalsIgnoreCase("Dammam")) {
            return p.prayerByGeo(26.399250, 49.984360);
        } else if (city.equalsIgnoreCase("makkah")) {
            return p.prayerByGeo(21.422510, 39.826168);
        } else {
            return p.prayerByGeo(24.186848, 38.026428);
        }

    }
}
