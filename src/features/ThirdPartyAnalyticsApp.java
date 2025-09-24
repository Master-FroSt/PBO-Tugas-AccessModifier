package features;

import profiles.UserProfile;

public class ThirdPartyAnalyticsApp {
    public static void main(String[] args) {
        VerifiedUserProfile profileVerified = new VerifiedUserProfile();
        UserProfile profile = new UserProfile();

        System.out.println("=== ThirdPartyAnalyticsApp (external app, not a subclass) ===");

        // Public
        System.out.println(profile.username);

        // Protected
        // System.out.println(profile.emailAddress);

        // Default
        // System.out.println(profile.lastLoginIp);

        // Private
        // System.out.println(profile.passwordHash);

//        Public dan Default
        profileVerified.displayContactInfo();
    }
}
