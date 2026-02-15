import java.util.concurrent.CompletableFuture;

public class AsyncExample {
    public static void main(String[] args) {

        System.out.println("Start");

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> callRemoteService());

        future.thenAccept(result -> {
            System.out.println("Result: " + result);
        });

        System.out.println("End");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    
    public static String callRemoteService() {
        try {
            Thread.sleep(3000); // simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Data received";
    }
    
}
