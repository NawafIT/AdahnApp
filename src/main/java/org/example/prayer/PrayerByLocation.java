package org.example.prayer;

import com.batoulapps.adhan.CalculationMethod;
import com.batoulapps.adhan.CalculationParameters;
import com.batoulapps.adhan.Coordinates;
import com.batoulapps.adhan.PrayerTimes;
import com.batoulapps.adhan.data.DateComponents;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class PrayerByLocation implements PrayerByGeo {

    @Override
    public String prayerByGeo(double lat, double log) {
        return allPrayerTimes(lat, log);

    }

    private String allPrayerTimes(double lat, double log) {
        Coordinates coordinates = new Coordinates(lat, log);
        DateComponents date = DateComponents.from(new Date());
        CalculationParameters params = CalculationMethod.UMM_AL_QURA.getParameters();
        PrayerTimes prayerTimes = new PrayerTimes(coordinates, date, params);
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Riyadh"));

        return new StringBuilder("\nPrayer Times\n")
                .append("Fajr: "+formatter.format(prayerTimes.fajr) + "\n")
                .append("Dhuhr: "+formatter.format(prayerTimes.dhuhr) + "\n")
                .append("Asr: "+formatter.format(prayerTimes.asr) + "\n")
                .append("Maghrib: "+formatter.format(prayerTimes.maghrib) + "\n")
                .append("Isha: "+formatter.format(prayerTimes.isha)).toString();

    }
}
