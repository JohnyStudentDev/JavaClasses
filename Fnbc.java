/**
 * NBC - Number base converter 
 * Java class that contains methods to convert the number base
 * @author: JohnyStudent
 * @date: 22 Fev 2021
 * @version: v2.1
 */
import java.util.*;
import java.lang.Math;

public class Fnbc {
    /**
     * Method created to convert a binary number to its decimal form
     * 
     * @restricted: Only for integer numbers
     * @param numBin : binary number (int)
     * @return: decimal number (int)
     */
    public int bin2dec (int numBin) {
        int numDec = 0, base = 1, aux = 0;
        try {
            while (numBin != 0) {
                aux = numBin%10;
                numDec += aux*base;
                numBin = numBin/10;
                base = base*2;
            }
        } catch (Exception e) {
            System.out.println("ERRO Fnbc - Method bin2dec");
            numDec = 0;
        }
        return numDec;       
    }

    /**
     * Method created to convert a decimal number to its binary form
     * 
     * @restricted: Only for integer numbers
     * @param numDec : decimal number (int)
     * @return: binary number (int)
     */
    public int dec2bin(int numDec) {
        int[] numBinV = new int[20];
        int base = 1, numBin = 0;
        try {
            for (int i = 0; i < 20; i++) {
                numBinV[i] = (numDec%2)== 0 ? 0 : 1;
                numDec = numDec/2;
            }
            for(int i = 0; i < 20; i++) {
                numBin += numBinV[i] * base;
                base *= 10;
            }
        } catch (Exception e) {
            System.out.println("ERRO Fnbc - Method dec2bin");
            numBin = 0;
        }
        return numBin;
    }

    /**
     * Method created to convert a decimal number to its hexadecimal base
     * 
     * @restricted: Only for integer numbers
     * @param numDec : decimal number (int)
     * @return: hexadecimal number (String)
     */
    public String dec2hex(int numDec) {
        char[] bases = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int count = 0;
        String resp = "";
        String aux = "";
        try {
            for (int i = 0; numDec > 0; i++) {
                aux += bases[numDec%16];
                count++;
                numDec /= 16;
            }
            for (int i = count - 1; i >= 0; i--) {
                resp += aux.charAt(i);
            }
        } catch (Exception e) {
            System.out.println("ERRO Fnbc - Method dec2hex");
            resp = "";
        }
        return resp;
    }

    /**
     * Method created to convert a hexadecimal number to its decimal base
     * 
     * @restricted: Only for integer numbers
     * @param numHex : hexadecimal number (String)
     * @return: decimal number (int)
     */
    public int hex2dec(String numHex) {
        char[] bases = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int size = numHex.length(), numDec = 0, base = size - 1;
        try {
            for (int i = 0; i < size; i++) {
            int pos = 0;
                for (int j = 0; j < 16; j++) {
                  if (numHex.charAt(i) == bases[j]) {
                        pos = j; j = 16;
                    }
                }
                numDec += pos * Math.pow(16, base);
                base--;
            }
        } catch (Exception e) {
            System.out.println("ERRO Fnbc - Method hex2dec");
            numDec = 0;
        }
        return numDec;
    }

    /**
     * Method created to convert a hexadecimal number to its binary base
     * 
     * @restricted: Only for integer numbers
     * @param numHex : hexadecimal number (String)
     * @return: binary number (int)
     */
    public int hex2bin (String numHex) {
        int numDec = hex2dec(numHex);
        int numBin = dec2bin(numDec);
        return numBin;
    }

    /**
     * Method created to convert a binary number to its hexadecimal base
     * 
     * @restricted: Only for integer numbers
     * @param numBin : binary number (int)
     * @return: hexadecimal number (String)
     */
    public String bin2hex (int numBin) {
        int numDec = bin2dec(numBin);
        String numHex = dec2hex(numDec);
        return numHex;
    }

    /**
     * Method to show on the screen all the bases of a number
     * @param numDec : decimal number (int)
     */
    public void dec2all_show (int numDec) {
        System.out.println("Decimal: " + numDec);
        System.out.println("Binary: " + dec2bin(numDec));
        System.out.println("Hexadecimal: " + dec2hex(numDec));
    }

    /**
     * Method to show on the screen all the bases of a number
     * @param numBin : binary number (int)
     */
    public void bin2all_show (int numBin) {
        System.out.println("Decimal: " + bin2dec(numBin));
        System.out.println("Binary: " + numBin);
        System.out.println("Hexadecimal: " + bin2hex(numBin));
    }

    /**
     * Method to show on the screen all the bases of a number
     * @param numHex : hexadecimal number (String)
     */
    public void hex2all_show (String numHex) {
        System.out.println("Decimal: " + hex2dec(numHex));
        System.out.println("Binary: " + hex2bin(numHex));
        System.out.println("Hexadecimal: " + numHex);
    }
}
