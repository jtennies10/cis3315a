/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author jten10
 */
public class C11PetTest {
    public static void main(String[] args) {
        C11Pet pc1 = new C11PetCat();
        pc1.setPetName("Mittens");
        C11Pet pd1 = new C11PetDog();
        pd1.setPetName("Fido");
        System.out.println("The cat says " + pc1.speak());
        System.out.println("The dog says " + pd1.speak());
        System.out.println(pc1);
        System.out.println(pd1);
    }
}
