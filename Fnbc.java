/**
 * NBC - Number base converter 
 * Java class that contains methods to convert the number base
 * @author: JohnyStudent
 * @date: 22 Fev 2021
 * @version: v1.0
 */
import java.util.*;

public class Fnbc {
    /**
     * Method created to convert a binary number to its decimal form
     * 
     * @restricted: Only for integer numbers
     * @param : binary number (int)
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
     * @param : decimal number (int)
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
     * @param : decimal number (int)
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
            System.out.println("out");
        } catch (Exception e) {
            System.out.println("ERRO Fnbc - Method dec2hex");
            resp = "";
        }
        return resp;
    }
}
