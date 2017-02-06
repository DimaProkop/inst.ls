package com.itools.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/**
 * Created by dmitry on 6.2.17.
 */
public class UrlShortener {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int LINK_LENGTH = 6;

    public static String generateLink() {
        Random random = new Random();
        StringBuilder link = new StringBuilder(LINK_LENGTH);

        for (int i = 0; i < LINK_LENGTH; i++) {
            int index = random.nextInt(ALPHABET.length());
            link.append(ALPHABET.charAt(index));
        }
        return link.toString();
    }


}
