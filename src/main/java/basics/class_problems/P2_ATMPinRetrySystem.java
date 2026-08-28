public class P2_ATMPinRetrySystem {

    public static void main(String[] args) {
        String[] test1 = {"1111", "4821"};
        atmPinRetry("4821", test1);

        String[] test2 = {"1111", "2222", "3333"};
        atmPinRetry("4821", test2);
    }

    static void atmPinRetry(String correctPin, String[] attempts) {
        int attemptCount = 0;
        boolean success = false;

        while (attemptCount < 3 && success == false) {

            String currentAttempt = attempts[attemptCount];

            boolean isCorrect = currentAttempt.equals(correctPin);

            if (isCorrect == true) {
                success = true;
                System.out.println("PIN accepted");
                break;
            }

            attemptCount = attemptCount + 1;
        }

        if (success == false) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }
}