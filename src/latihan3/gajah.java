/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author sheva
 */
public class gajah extends hewan {
    public static void testClassMethod(){
        System.out.println("the class method in Hewan...");
    }
    public void testInstanceMethod(){
        System.out.println("the instance method in Gajah...");
    }
    public static void main(String[] args){
        gajah mygajah = new gajah();
        hewan myhewan = new hewan();
        hewan.testClassMethod();
        myhewan.testInstanceMethod();
    }
}
