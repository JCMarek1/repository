package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyProfileController {

    @GetMapping("/profile")
    public Map<String, String> getProfile() {
        Map<String, String> profileData = new HashMap<>();
        profileData.put("name", "Jacob Marek"); // Replace "Your Name" with your actual name
        profileData.put("this is very unique data", generateUniqueData()); // Generate a unique data string
        profileData.put("checksum", calculateChecksum(profileData.get("this is very unique data"))); // Calculate checksum for the unique data
        return profileData;
    }

    // Method to generate a unique data string
    private String generateUniqueData() {
        // Implement your logic to generate a unique data string
        return "Unique Data String";
    }

    // Method to calculate checksum
    private String calculateChecksum(String data) {
        if (data == null) {
            return "Data is null";
        }
        return HashCalculator.calculateSHA256(data);
    }
}
