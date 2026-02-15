public class BlockingExample {

    public static void main(String[] args) {

        System.out.println("Start");

        String result = callRemoteService();

        System.out.println("Result: " + result);

        System.out.println("End");
    }

    public static String callRemoteService() {
        try {
            Thread.sleep(3000); // Thread blocked for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Data received";
    }
}
