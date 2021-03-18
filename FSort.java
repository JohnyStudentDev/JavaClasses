/**
 * sort methods
 * Java class that contains methods for sorting a vector
 * @author: JohnyStudent
 * @date: 17 Mar 2021
 * @version: v2.1
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
            System.out.print("Insertion: ");
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

    /**
     * Method for applying shellsort ordering in an array
     * @param array (array)
     */
    public void shellsort (int[] array) {
        int n = array.length;
        int h = 1;
        do {h = (h * 3) + 1;} while (h < n);
        do {
            h /= 3;
            for (int cor = 0; cor < h; cor++) {
                for (int i = (cor + h); i < n; i += h) {
                    int temp = array[i];
                    int j = i - h;
                    while ((j >= 0) && (array[j] > temp)) {
                        array[j+h] = array[j];
                        j -= h;
                    }
                    array[j+h] = temp;
                }
            }
        } while (h != 1);
    }

    /**
     * Method for applying shellsort ordering in an array while printing all steps
     * @param array (array)
     */
    public void showShellsort (int[] array) {
        int n = array.length;
        int h = 1;
        do {h = (h * 3) + 1;} while (h < n);
        do {
            h /= 3;
            for (int cor = 0; cor < h; cor++) {
                System.out.print("Shellsort: ");
                showArray(array);
                for (int i = (cor + h); i < n; i += h) {
                    int temp = array[i];
                    int j = i - h;
                    while ((j >= 0) && (array[j] > temp)) {
                        array[j+h] = array[j];
                        j -= h;
                    }
                    array[j+h] = temp;
                }
            }
        } while (h != 1);
        System.out.print("Shellsort[Final]: ");
        showArray(array);
    }

    /**
     * Method for applying quicksort ordering in an array
     * @param array (array)
     */
    public void quicksort (int[] array, int left, int right) {
        int i = left, j = right, mid = array[(left + right)/2];
        while ( i < j ) {
            while (array[i] < mid)
                i++;
            while (array[j] > mid)
                j--;
            if ( i <= j ) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++; j--;
            }
        }
        if (left < j) 
            quicksort(array, left, j);
        if (right > i)
            quicksort(array, i, right);
    }
    public void quicksort (int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    /**
     * Method for applying quicksort ordering in an array while printing all steps
     * @param array (array)
     */
    public void showQuicksort (int[] array, int left, int right) {
        int i = left, j = right, mid = array[(left + right)/2];
        while ( i < j ) {
            while (array[i] < mid)
                i++;
            while (array[j] > mid)
                j--;
            if ( i <= j ) {
                System.out.print("Quicksort: ");
                showArray(array);
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++; j--;
            }
        }
        if (left < j) 
            quicksort(array, left, j);
        if (right > i)
            quicksort(array, i, right);
    }
    public void showQuicksort (int[] array) {
        uicksort(array, 0, array.length - 1);
        System.out.print("Quicksort[Final]: ");
        showArray(array);
    }
}
