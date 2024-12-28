package com.solncev.util;

import com.cloudinary.Cloudinary;

import java.util.HashMap;
import java.util.Map;

public class CloudinaryUtil {

    private static Cloudinary cloudinary;

    public static Cloudinary getInstance() {
        if (cloudinary == null) {
            Map<String, String> configMap = new HashMap<>();
            configMap.put("cloud_name", "itis-2024");
            configMap.put("api_key", "***");
            configMap.put("api_secret", "***");
            cloudinary = new Cloudinary(configMap);
        }
        return cloudinary;
    }
}