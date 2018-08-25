/*
 * Immutable Means the value of the object can not be changed
 * If we try to change, existing object will remain same. 
  A New Object will be created with the moderate value.
 */
package create.my.own.immutableClass;

/**
 *
 * @author Noman Ibrahim
 */
public class TestImmutable_1 {

    private int i;

    public TestImmutable_1(int i) {

        this.i = i;

    }
    public TestImmutable_1 modify(int i){
    
    if(this.i==i){
    return this;}
    else
    return new TestImmutable_1(i);
    
    }
    
    public static void main(String [] args){
    
       TestImmutable_1 t1= new TestImmutable_1(10);
       TestImmutable_1 t2 = t1.modify(100);
       TestImmutable_1 t3= t2.modify(100);
        System.out.println(t1==t2);
        System.out.println(t3==t2);
    
    }

}
