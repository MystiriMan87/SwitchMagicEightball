import java.util.Random;

public class App {

    public static void main(String[] args) {
        Random random = new Random();

        int choice = 1 + random.nextInt(15);
        String response = "";

        if (choice == 1) {
           response = "lol";
        } else if (choice == 2) {
            response = "2";
        } else if (choice == 3) {
            response = "3";
        } else if (choice == 4) {
            response = "4";
        } else if (choice == 5) {
            response = "5";
        } else if (choice == 6) {
            response = "6";
        } else if (choice == 7) {
            response = "7";
        } else if (choice == 8) {
            response = "8";
        } else if (choice == 9) {
            response = "9";
        } else if (choice == 10) {
            response = "10";
        } else if (choice == 11) {
            response = "11";
        } else if (choice == 12) {
            response = "12";
        } else if (choice == 13) {
            response = "13";
        } else if (choice == 14) {
            response = "14";
        } else if (choice == 15) {
            response = "15";
        }


        System.out.println(response);
    }
}
