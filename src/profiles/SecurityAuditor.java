package profiles;

public class SecurityAuditor {
    public static void main(String[] args) {
        UserProfile obj = new UserProfile();

        // Bisa akses semuanya kecuali private
        System.out.println("=== Dari package profiles  ===");
        System.out.println(obj.username);
        System.out.println(obj.emailAddress);
        System.out.println(obj.lastLoginIp);
        // System.out.println(obj.privateVar); // ERROR, karena private

        obj.showPublic();
        obj.showProtected();
        obj.showDefault();
        // obj.showPrivate(); // ERROR, karena private

        obj.accessPrivate(); // lewat method public
    }
}
