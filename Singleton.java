public class Singleton {

    // Single shared instance
    private static volatile Singleton instance = null;

    // Private constructor
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {                // First check
            synchronized (Singleton.class) {   // Lock class
                if (instance == null) {        // Second check
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton: " + this);
    }

    public static void main(String[] args) {
        // Multiple calls to getInstance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        Singleton obj4 = Singleton.getInstance();

        // Show messages
        obj1.showMessage();
        obj2.showMessage();
        obj3.showMessage();
        obj4.showMessage();

        // Check if all references point to same object
        System.out.println("obj1 == obj2: " + (obj1 == obj2));
        System.out.println("obj2 == obj3: " + (obj2 == obj3));
        System.out.println("obj3 == obj4: " + (obj3 == obj4));
    }
}
