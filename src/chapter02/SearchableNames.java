package chapter02;


public class SearchableNames {


    private static final int STATUS_FINISHED = 4;
    private static final int DAYS_IN_A_WEEK = 7;
    private static final int SECONDS_IN_A_DAY = 86400;

    public static void main(String[] args) {

        SearchableNames practice = new SearchableNames();

        System.out.println("--- Running Dirty Example ---");
        practice.checkTaskStatusDirty(4);

        System.out.println("\n--- Running Clean Example ---");
        practice.checkTaskStatusClean(4);
    }


    public void checkTaskStatusDirty(int status) {
        if (status == 4) {
            long expiration = 7 * 86400;
            System.out.println("Task expired in: " + expiration);
        }
    }


    public void checkTaskStatusClean(int currentStatus) {
        if (currentStatus == STATUS_FINISHED) {
            long expirationInSeconds = (long) DAYS_IN_A_WEEK * SECONDS_IN_A_DAY;
            System.out.println("Task expired in: " + expirationInSeconds);
        }
    }
}