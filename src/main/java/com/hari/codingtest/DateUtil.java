package com.hari.codingtest;

public class DateUtil {


    /* time format : "[H]H:MM{AM|PM}"
        AddMinutes("9:13 AM", 200) -> "12:33 PM"
    */
    public static String addMinutesToTime(String time, int minutesToAdd) {

        int hoursToAdd   = 0;

        if(minutesToAdd > 59) {
            hoursToAdd   = minutesToAdd/60;
            minutesToAdd = minutesToAdd%60;
        }

        int hoursInInputTime   = Integer.valueOf(time.substring(0, time.indexOf(":")));
        int minutesInInputTime = Integer.valueOf(time.substring(time.indexOf(":") + 1, time.indexOf(" ")));
        String meridiem        = time.substring(time.indexOf(" ") + 1, time.length());

        int updatedMinutes = minutesInInputTime + minutesToAdd;
        int updatedHours   = hoursInInputTime + hoursToAdd;

        if(updatedMinutes > 59) {
            hoursToAdd = updatedMinutes/60;
            int finalMinutes = updatedMinutes%60;

            updatedHours   = updatedHours + hoursToAdd;
            updatedMinutes = finalMinutes;
        }

        if(meridiem.equalsIgnoreCase("AM") && (updatedHours % 24) >= 12) {
            meridiem = "PM";
        }
        else if(meridiem.equalsIgnoreCase("PM") && (updatedHours % 24) >= 12) {
            meridiem = "AM";
        }

        // We want the first argument be in 12 hour time string
        if(updatedHours != 12 && updatedHours / 12 > 0) {
            updatedHours = updatedHours % 12;
        }

        return updatedHours + ":" + String.format("%02d", updatedMinutes) + " " + meridiem;
    }
}
