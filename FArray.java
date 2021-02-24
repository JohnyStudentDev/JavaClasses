/**
 * Array
 * CLASS - FUNCTIONS
 * 
 * Java class that contains methods to play with arrays
 * @author: JohnyStudent
 * @date: 24 Fev 2021
 * @version: v1.0
 */
import java.util.*;

public class FArray {
    
    /**
     * Method to print on the screen all the array
     * 
     * @param vet : Array (int/char/double/boolean)
     */
    public void printFormAll (int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("[" + vet[i] + "]");
        }
        System.out.println("");
    }
    public void printFormAll (char[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("[" + vet[i] + "]");
        }
        System.out.println("");
    }
    public void printFormAll (double[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("[" + vet[i] + "]");
        }
        System.out.println("");
    }
    public void printFormAll (boolean[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.printf("[" + vet[i] + "]");
        }
        System.out.println("");
    }

    /**
     * Method that receives a vector and sort it in descending order
     * 
     * @param vet : Array (int/double)
     */
    public void descending (int[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            int high = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[high] < vet[j]) {
                    high = j;
                }
            }
            int temp = vet[i];
            vet[i] = vet[high];
            vet[high] = temp;
        }
    }
    public void descending (double[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            int high = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[high] < vet[j]) {
                    high = j;
                }
            }
            double temp = vet[i];
            vet[i] = vet[high];
            vet[high] = temp;
        }
    }

    /**
     * Method that receives a vector and sort it in ascending order
     * 
     * @param vet : Array (int/double)
     */
    public void ascending (int[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            int low = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[low] > vet[j]) {
                    low = j;
                }
            }
            int temp = vet[i];
            vet[i] = vet[low];
            vet[low] = temp;
        }
    }
    public void ascending (double[] vet) {
        for (int i = 0; i < vet.length - 1; i++) {
            int low = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[low] > vet[j]) {
                    low = j;
                }
            }
            double temp = vet[i];
            vet[i] = vet[low];
            vet[low] = temp;
        }
    }

    /**
     * Method that receives a vector and return another vector with the same values;
     * 
     * @param vet : Array (int/char/double/boolean)
     * @return: Array cloned
     */
    public int[] clone (int[] vet) {
        return vet;
    }
    public char[] clone (char[] vet) {
        return vet;
    }
    public double[] clone (double[] vet) {
        return vet;
    }
    public boolean[] clone (boolean[] vet) {
        return vet;
    }

    /**
     * Method that receives a value and a vector and say if the value is contained in that vector
     * 
     * @param vet : Array (int/char/double/boolean)
     * @param x : Value (int/char/double/boolean)
     * @return: true or false
     */
    public boolean search (int x, int[]vet) {
        boolean resp = false;
        for (int i = 0; i < vet.length; i++) {
            if (x == vet[i]) {
                resp = true;
                i = vet.length;
            }
        }
        return resp;
    }
    public boolean search (double x, double[]vet) {
        boolean resp = false;
        for (int i = 0; i < vet.length; i++) {
            if (x == vet[i]) {
                resp = true;
                i = vet.length;
            }
        }
        return resp;
    }
    public boolean search (char x, char[]vet) {
        boolean resp = false;
        for (int i = 0; i < vet.length; i++) {
            if (x == vet[i]) {
                resp = true;
                i = vet.length;
            }
        }
        return resp;
    }
    public boolean search (boolean x, boolean[]vet) {
        boolean resp = false;
        for (int i = 0; i < vet.length; i++) {
            if (x == vet[i]) {
                resp = true;
                i = vet.length;
            }
        }
        return resp;
    }

    /**
     * Method that receives a value and a vector and count how many times the value appears in the vector
     * 
     * @param vet : Array (int/char/double/boolean)
     * @param x : Value (int/char/double/boolean)
     * @return: int number
     */
    public int count (int x, int[]vet) {
        int c = 0;
        for (int i = 0; i < vet.length; i++) {
            if (x == vet[i]) {c++;}
        }
        return c;
    }
    public int count (double x, double[]vet) {
        int c = 0;
        for (int i = 0; i < vet.length; i++) {
            if (x == vet[i]) {c++;}
        }
        return c;
    }
    public int count (char x, char[]vet) {
        int c = 0;
        for (int i = 0; i < vet.length; i++) {
            if (x == vet[i]) {c++;}
        }
        return c;
    }
    public int count (boolean x, boolean[]vet) {
        int c = 0;
        for (int i = 0; i < vet.length; i++) {
            if (x == vet[i]) {c++;}
        }
        return c;
    }

}
