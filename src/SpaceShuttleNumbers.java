public class SpaceShuttleNumbers {
    public static void main(String[] args) {
        int countShuttles = 100;
        int shuttleNumber = 1;

        while (countShuttles > 0) {
            int number = shuttleNumber;
            boolean containsUnlucky = false;

            while (number > 0) { // // перевірка наявності 4 або 9 в числі
                int lastDigit = number % 10;
                if (lastDigit == 4 || lastDigit == 9) {
                    containsUnlucky = true;
                    break;
                }
                number /= 10;
            }
            if (!containsUnlucky) {
                System.out.println("Космічний шатл №" + shuttleNumber);
                countShuttles--;
            }
            shuttleNumber++;
        }
    }
}
