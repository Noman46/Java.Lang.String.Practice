/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringBuffer.mutable.test;

/**
 *
 * @author Noman Ibrahim
 */
public class equalsForStringBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StringBuffer sb1= new StringBuffer("Noman");
       StringBuffer sb2= new StringBuffer("Noman");
        System.out.println(sb1==sb2); // False.. It looks for reference.
        System.out.println(sb1.equals(sb2)); // Fale... beacuse Object class .equals method is not overriden here
    }
    
}
