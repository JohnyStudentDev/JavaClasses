/**
 * CLASS - FUNCTIONS
 * 
 * Java class that contains methods to use for vector sorting
 * @author: JohnyStudent
 * @date: 17 Mar 2021
 * @version: v1.0
 */

import java.util.*;

class FSort {
    /**
     * Method to print an array on the screen
     * @param array (array)
     */
    public void showArray (int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            System.out.print("["+array[i]+"]");
        }
        System.out.println("");
    }

    /**
     * Method for applying insertion ordering in an array
     * @param array (array)
     */
    public void insertion (int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int temp = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > temp)) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }

    /**
     * Method for applying insertion ordering in an array while printing all steps
     * @param array (array)
     */
    public void showInsertion (int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            System.out.print("Insertion["+i+" step]: ");
            showArray(array);
            int temp = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > temp)) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
        System.out.print("Insertion[Final]: ");
        showArray(array);
    }
}
