/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.immutable.test;

/**
 *
 * @author Noman Ibrahim
 */
public class equalsForString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1= new String("Noman");
        String s2 = new String("Noman");
        System.out.println(s1==s2); // Fale.. It looks for reference
        System.out.println(s1.equals(s2)); // True.. It looks for the content.
    }
    
}
