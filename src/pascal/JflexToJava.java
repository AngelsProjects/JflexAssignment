/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal;

import jflexassignment.*;
import java.io.*;

/**
 *
 * @author niennguyen
 */
public class JflexToJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dirFile = "C:\\Users\\nguyen\\Documents\\NetBeansProjects\\JflexAssignment\\src\\pascal\\pascal.jflex";
        File jflexFile = new File(dirFile);
        jflex.Main.generate(jflexFile);
    }
}
