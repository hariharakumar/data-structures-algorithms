package com.hari.codingtest.strings;

import java.util.Arrays;

/*
    https://www.techiedelight.com/validate-ip-address-java/
    Ip Address (Ipv4) is a 32 bit number with 4 dots containing numbers between dots - each number is between 0 and 255
 */
public class IpAddressValidator {

    private static void validate(String ipAddress) {
        String[] split = ipAddress.split("\\.");

        try {

            boolean result = Arrays.stream(split)
                    .filter(s -> s.length() > 0)
                    .map(item -> Integer.parseInt(item))
                    .filter(item -> item > 0 && item < 255)
                    .count() == 4;

            if(result) {
                System.out.println("Valid IpAddress");
            }
            else {
                System.out.println("Not valid IpAddress");
            }
        }
        catch (NumberFormatException nfe) {
            System.out.println("Not a valid Ip Address yo");
        }
    }

    public static void main(String[] args) {
        String ipAddress = "192.168.10.1";
        validate(ipAddress);

    }

}
