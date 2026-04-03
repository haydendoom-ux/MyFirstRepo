import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Add days of the week
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // Add average temperatures
        temperatures.add(65.0);
        temperatures.add(67.0);
        temperatures.add(70.0);
        temperatures.add(68.0);
        temperatures.add(72.0);
        temperatures.add(75.0);
        temperatures.add(71.0);

        System.out.print("Enter a day of the week or type 'week': ");
        String userInput = input.nextLine();

        double total = 0;

        if (userInput.equalsIgnoreCase("week")) {
            for (int i = 0; i < days.size(); i++) {
                System.out.println(days.get(i) + ": " + temperatures.get(i));
                total += temperatures.get(i);
            }

            double average = total / temperatures.size();
            System.out.println("Weekly Average Temperature: " + average);

        } else {
            boolean found = false;

            for (int i = 0; i < days.size(); i++) {
                if (userInput.equalsIgnoreCase(days.get(i))) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Invalid day entered.");
            }
        }

        input.close();
    }
}