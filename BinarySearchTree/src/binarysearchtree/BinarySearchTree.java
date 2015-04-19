/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

import java.util.Random;

/**
 *
 * @author taha
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        BST b = new BST();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            b.insert(rand.nextInt(1000) + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Ekleme için geçen süre :");
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double) estimatedTime / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println(seconds);

        long startTime1 = System.currentTimeMillis();
        b.inorder();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Ağacı inorder dolaşarak sıralı bir şekilde listememek için geçen süre :");
        long estimatedTime1 = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds1 = (double) estimatedTime1 / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println(seconds1);

        long startTime2 = System.currentTimeMillis();
        b.delete(50);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Silme için geçen süre :");
        long estimatedTime2 = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds2 = (double) estimatedTime2 / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println(seconds2);
        System.out.println(b.countNodes());
        
    }

}
