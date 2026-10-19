package com.example.cryptographicdataprotection_class3049;

import android.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class myMethods {

    public static String[] encryptionData(String name, String phone, String pass) throws Exception{



        byte[] nameBytes = name.getBytes("UTF-8");
        byte[] phoneBytes = phone.getBytes("UTF-8");

        String password = pass; //"N9@tF2x#Lp7zQ1vW" (16 bit)
        byte[] passwordBytes = password.getBytes("UTF-8");

        SecretKeySpec secretKeySpec = new SecretKeySpec(passwordBytes, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        byte[] encryptedName =  cipher.doFinal(nameBytes);
        byte[] encryptedPhone =  cipher.doFinal(phoneBytes);

        String encodedNameString = Base64.encodeToString(encryptedName, Base64.DEFAULT);
        String encodedPhoneString = Base64.encodeToString(encryptedPhone, Base64.DEFAULT);

        return new String[]{encodedNameString, encodedPhoneString};



    }
    //-============================================================================================
    //-============================================================================================


    public static String[] decryptedData(String encodedName, String encodedPhone, String pass) throws Exception {

        byte[] decodedName = Base64.decode(encodedName, Base64.DEFAULT);
        byte[] decodedPhone = Base64.decode(encodedPhone, Base64.DEFAULT);

        String password = pass;
        byte[] passwordBytes = password.getBytes("UTF-8");

        SecretKeySpec secretKeySpec = new SecretKeySpec(passwordBytes, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        byte[] decryptedName = cipher.doFinal(decodedName);
        byte[] decryptedPhone = cipher.doFinal(decodedPhone);

        String name = new String(decryptedName, "UTF-8");
        String phone = new String(decryptedPhone, "UTF-8");


        return new String[]{name, phone};

    }




}