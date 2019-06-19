package com.erikriosetiawan;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UjiKalender {

    public static void main(String[] args) {

        // Menciptakan suatu kalender Gregorian untuk tanggal dan waktu saat ini
        Calendar kalender = new GregorianCalendar();

        print("Waktu sekarang adalah", new Date());
        print("YEAR", kalender.get(Calendar.YEAR));
        print("MONTH", kalender.get(Calendar.MONTH));
        print("DATE", kalender.get(Calendar.DATE));
        print("HOUR", kalender.get(Calendar.HOUR));
        print("HOUR_OF_DAY", kalender.get(Calendar.HOUR_OF_DAY));
        print("MINUTE", kalender.get(Calendar.MINUTE));
        print("SECOND", kalender.get(Calendar.SECOND));
        print("DAY_OF_WEEK", kalender.get(Calendar.DAY_OF_WEEK));
        print("DAY_OF_MONTH", kalender.get(Calendar.DAY_OF_MONTH));
        print("DAY_OF_YEAR", kalender.get(Calendar.DAY_OF_YEAR));
        print("WEEK_OF_MONTH", kalender.get(Calendar.WEEK_OF_MONTH));
        print("WEEK_OF_YEAR", kalender.get(Calendar.WEEK_OF_YEAR));
        print("AM_PM", kalender.get(Calendar.AM_PM));

        // Menciptakan kalender untuk 2 September 1997
        Calendar kalenderPast = new GregorianCalendar(1997, 9, 2);
        print("September 2, 1997 adalah hari", namaHariDalamMinggu(kalenderPast.get(Calendar.DAY_OF_WEEK)));
    }

    private static String namaHariDalamMinggu(int hariDalamMinggu) {
        switch (hariDalamMinggu) {
            case 1:
                return "Minggu";
            case 2:
                return "Senin";
            case 3:
                return "Selasa";
            case 4:
                return "Rabu";
            case 5:
                return "Kamis";
            case 6:
                return "Jumat";
            case 7:
                return "Sabtu";
            default:
                return null;
        }
    }

    private static void print(String str, int calendar) {
        System.out.println(str + " :\t" + calendar);
    }

    private static void print(String str, Date date) {
        System.out.println(str + " :\t" + date);
    }

    private static void print(String str, String strTwo) {
        System.out.println(str + " : \t" + strTwo);
    }
}
