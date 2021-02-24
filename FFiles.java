/**
 * Files - Methods to Read/Print/Write
 * CLASS - FUNCTIONS
 * 
 * Java class that contains methods to play with .TXT files
 * @author: JohnyStudent
 * @date: 23 Fev 2021
 * @version: v2.1
 */

// Reference: https://github.com/gilbertotoledo/curso-java/blob/main/Aula%2012/src/aula12/Arquivo.java

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.sound.sampled.Line;

public class FFiles {
    /**
     * Method created to read all the .TXT file
     * 
     * @param path : file path
     * @return: all the .TXT file content
     */
    public static String readAll (String path) {
        String text = "";
        try {
            FileReader fp = new FileReader(path);
            BufferedReader reader = new BufferedReader(fp);
            String line = "";
            try {
                line = reader.readLine();
                while(line != null){
                    text += line;
                    line = reader.readLine();
                    if (line != null) {
                        text += "\n";
                    }
                }
                fp.close();
            } catch (IOException ex) {
                System.out.println("Erro FFiles - Method Read: cannnot read file");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro FFiles - Method Read: file not found");
            return "";
        }
        return text;
    }

    /**
     * Method created to read a line from the .TXT file
     * First Line = number 1;
     * 
     * 
     * @param path : file path
     * @param n : number of the line
     * @return: all the line content
     * @return: null if the line does not exist
     */
    public static String readNLine (String path, int n) {
        String line = "";
        try {
            FileReader fp = new FileReader(path);
            BufferedReader reader = new BufferedReader(fp);
            try {
                for (int i = 1; i <= n && line != null; i++) {
                    line = reader.readLine();
                }
                fp.close();
            } catch (IOException ex) {
                System.out.println("Erro FFiles - Method Read: cannnot read file");
                line = null;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro FFiles - Method Read: file not found");
            line = null;
        }
        return line;
    }

    /**
     * Method created to print on the screen all the .TXT file
     * 
     * @param path : file path
     * @print: file content
     */
    public static void printAll (String path) {
        try {
            FileReader fp = new FileReader(path);
            BufferedReader reader = new BufferedReader(fp);
            try {
                String line = reader.readLine();
                while(line != null){
                    System.out.println(line);
                    line = reader.readLine();
                }
                fp.close();
            } catch (IOException ex) {
                System.out.println("Erro FFiles - Method Print: cannot read file");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro FFlies - Method Print: file not found");
        }
    }
    
    /**
     * Method created to read all the .TXT file
     * 
     * @param path : file path
     * @param text : what to write in the file
     * @return: true if it could write and false if it didn't
     */
    public static boolean write (String path, String text) {
        try {
            FileWriter fp = new FileWriter(path);
            PrintWriter impressFile = new PrintWriter(fp);
            impressFile.println(text);
            impressFile.close();
            return true;
        } catch(IOException e){
            System.out.println("Erro FFiles - Method Write");
            return false;
        }
    }
}
