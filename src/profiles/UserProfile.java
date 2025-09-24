package profiles;

public class UserProfile {
    // Access modifier demonstration
    public String username = "Kelompok 11 PBO";
    protected String emailAddress = "pbo123@gmail.com";
    String lastLoginIp = "123410556";
    private String passwordHash = "wahyuginanjar123";

    // Public method
    public void showPublic() {
        System.out.println("Ini adalah public method");
    }

    // Protected method
    protected void showProtected() {
        System.out.println("Ini adalah protected method");
    }

    // Default method
    void showDefault() {
        System.out.println("Ini adalah default method");
    }

    // Private method
    private void showPrivate() {
        System.out.println("Ini adalah private method");
    }

    // Method untuk mengakses private dari dalam class
    public void accessPrivate() {
        System.out.println("Accessing private method from inside the same class:");
        showPrivate();
    }
}
