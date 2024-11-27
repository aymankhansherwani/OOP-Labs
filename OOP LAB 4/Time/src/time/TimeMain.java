package time;
import java.time.LocalDateTime;

class CurrentDateTime {

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    public CurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        this.year = now.getYear();
        this.month = now.getMonthValue();
        this.day = now.getDayOfMonth();
        this.hour = now.getHour();
        this.minute = now.getMinute();
        this.second = now.getSecond();
    }

    public CurrentDateTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        LocalDateTime now = LocalDateTime.now();  // Use current time for hours, minutes, and seconds
        this.hour = now.getHour();
        this.minute = now.getMinute();
        this.second = now.getSecond();
    }

    public CurrentDateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void displayDateTime() {
        System.out.println("Current Date and Time: " + year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + second);
    }
}

public class TimeMain {
    public static void main(String[] args) {

        CurrentDateTime defaultDateTime = new CurrentDateTime();
        System.out.println("Default Constructor:");
        defaultDateTime.displayDateTime();

        CurrentDateTime customDateTime1 = new CurrentDateTime(2024, 10, 18);
        System.out.println("\nOverloaded Constructor (YEAR, MONTH, DAY):");
        customDateTime1.displayDateTime();

       
        CurrentDateTime customDateTime2 = new CurrentDateTime(2024, 10, 18, 10, 45, 30);
        System.out.println("\nOverloaded Constructor (YEAR, MONTH, DAY, HOUR, MINUTE, SECOND):");
        customDateTime2.displayDateTime();
        
        System.out.println("\nSetting new date and time values:");
        customDateTime2.setYear(2025);
        customDateTime2.setMonth(5);
        customDateTime2.setDay(20);
        customDateTime2.setHour(12);
        customDateTime2.setMinute(30);
        customDateTime2.setSecond(45);
        customDateTime2.displayDateTime();
    }
}

    

