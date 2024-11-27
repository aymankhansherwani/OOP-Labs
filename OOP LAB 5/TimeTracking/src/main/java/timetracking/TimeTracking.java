package timetracking;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TimeTracking {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<Duration> dailyTaskDurations = new ArrayList<>();
        int weeklyTotalMinutes = 0;

        System.out.println("Welcome to the Time Tracking Tool!");
        System.out.println("Please enter your start and end times for each task in the format HH:MM.");

        for (int dayIndex = 1; dayIndex <= 7; dayIndex++) { 
            int minutesPerDay = 0;
            System.out.println("\nDay " + dayIndex + ":");

            while (true) {
                System.out.print("Enter start time : ");
                String startTimeInput = inputScanner.next();

                if (startTimeInput.equalsIgnoreCase("done")) {
                    break;
                }

                System.out.print("Enter end time: ");
                String endTimeInput = inputScanner.next();

                
                LocalTime taskStartTime = LocalTime.parse(startTimeInput);
                LocalTime taskEndTime = LocalTime.parse(endTimeInput);

                
                Duration taskDuration = Duration.between(taskStartTime, taskEndTime);
                minutesPerDay += taskDuration.toMinutes();

                System.out.println("Time spent on this task: " + formatTime(taskDuration));
            }

            Duration dailyDuration = Duration.ofMinutes(minutesPerDay);
            dailyTaskDurations.add(dailyDuration);
            weeklyTotalMinutes += minutesPerDay;

            System.out.println("Total time spent on Day " + dayIndex + ": " + formatTime(dailyDuration));
        }

        Duration weeklyDuration = Duration.ofMinutes(weeklyTotalMinutes);
        System.out.println("\nTotal time spent in the week: " + formatTime(weeklyDuration));

        if (weeklyDuration.toHours() < 20) {
            System.out.println("Warning: You have spent less than 20 hours this week.");
        }

        inputScanner.close();
    }
    private static String formatTime(Duration duration) {
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        return String.format("%02d:%02d", hours, minutes);
    }
}
