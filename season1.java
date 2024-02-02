
import java.util.Scanner;
public class season1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int monthNumber;
            while (true) {
                try {
                    // Prompt the user to enter the month number
                    System.out.print("Enter the month number (1-12): ");
                    monthNumber = scanner.nextInt();

                    // Check if the month number is valid
                    if (monthNumber < 1 || monthNumber > 12) {
                        throw new IllegalArgumentException();
                    }

                    // If the input is valid, break out of the loop
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid month number. Please enter a number between 1 and 12.");
                }
            }

            // Determine and print the corresponding season
//            String season = getSeason(monthNumber);
        switch (monthNumber) {
            case 2:
            case 3:
//                return "Vasanta";
                System.out.println("Vasanta");
                break;
            case 4:
            case 5:
//                return "Grishma / Summer";
                System.out.println("Grishma / Summer");
                break;
            case 6:
            case 7:
//                return "Monsoon / Rainy";
                System.out.println("Monsoon / Rainy");
                break;
            case 8:
            case 9:
//                return "Sharada";
                System.out.println("Sharada");
                break;
            case 10:
            case 11:
//                return "Hemanta";
                System.out.println("Hemanta");
                break;
            case 12:
            case 1:
//                return "Shishira / Winter";
                System.out.println("Shishira / Winter");
                break;
            default:
//                return "Invalid Month";
                System.out.println("Invalid Month");
                break;
        }
//
            scanner.close();
        }

//        private static String getSeason(int monthNumber) {
//            switch (monthNumber) {
//                case 2:
//                case 3:
//                    return "Vasanta";
//                case 4:
//                case 5:
//                    return "Grishma / Summer";
//                case 6:
//                case 7:
//                    return "Monsoon / Rainy";
//                case 8:
//                case 9:
//                    return "Sharada";
//                case 10:
//                case 11:
//                    return "Hemanta";
//                case 12:
//                case 1:
//                    return "Shishira / Winter";
//                default:
//                    return "Invalid Month";
//            }
//        }
    }


