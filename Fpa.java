/**
 * CLASS - FUNCTIONS
 * 
 * Java class that contains methods use with arithmetic progression (PA)
 * @author: JohnyStudent
 * @date: 8 Mar 2021
 * @version: v1.0
 */
import java.util.*;

public class Fpa {
    /**
     * Method to create and fill the vector with a PA
     * @param ai First number of a PA
     * @param r Rate of the PA 
     * @param qntd Number to values that going to be in the array
     * @return Array with a PA
     */
    public int[] generatePAvet  (int ai, int r, int qntd) {
        int[] vet = new int[qntd];
        for (int i = 0; i < qntd; i++)
            vet[i] = ai + (r * i);
        return vet;
    }

    /**
     * Method to print N values of a PA
     * @param ai First number of the PA
     * @param r Rate of the PA
     * @param qntd Number to values that going to be printed
     */
    public void printPA (int ai, int r, int qntd) {
        for (int i = 0; i < qntd; i++) {
            System.out.print("[" + (ai+(r*i)) + "]");
        }
        System.out.println("");
    }

    /**
     * Method created to check if a value is inside a PA
     * @param ai First number of the PA
     * @param r Rate of the PA
     * @param x The value to check
     * @return (boolean) TRUE if inside and FALSE if not
     */
    public boolean isInsidePA (int ai, int r, int x) {
        return ((x - ai) % r == 0);
    }

    public boolean isInsidePAv2 (int ai, int r, int x) {
        boolean bool = false;
        if ((x - ai) % r == 0)
            bool = true;
        return bool;
    }

    /**
     * Method for knowing the position of a value within a PA
     * @param ai First number of the PA
     * @param r Rate of the PA
     * @param x The value to check position
     * @return (int) position - But 0 may mean that the number does not belong to the PA
     */
    public int positionInPA (int ai, int r, int x) {
        int resp = 0;
        if (isInsidePA(ai,r,x)) {
            resp = ((x - ai)/r)+1;
        }
        return resp;
    }
}
