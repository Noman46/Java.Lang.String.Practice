/*
 
 */
package string.immutable.test;

/**
 *
 * @author Noman Ibrahim
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = new String("Noman");
        s.concat("Ibrahim");
        System.out.println(s);
        
        /*
        * String is Immutable
        * Once I create an Object Of String it is unchangeable.
        * Noman cncate with Ibrahim. A new Object as Ibrahim is created.
        * But New object is not refered by any reference value. So it is eligable for garbage collecting
        */
    }

}
