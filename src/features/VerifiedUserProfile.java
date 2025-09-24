package features;

import profiles.UserProfile;

public class VerifiedUserProfile extends UserProfile {
    public void displayContactInfo() {
        System.out.println("=== VerifiedUserProfile (subclass, different package) ===");

        // Public
        System.out.println(username);

        // Protected
        System.out.println(emailAddress);

        // Default
        // System.out.println(lastLoginIp);

        // Private
        // System.out.println(passwordHash);
    }
}