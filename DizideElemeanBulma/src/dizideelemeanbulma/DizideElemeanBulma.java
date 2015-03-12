/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dizideelemeanbulma;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author taha
 */
public class DizideElemeanBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diziBoyutu;
        Scanner diziElemeanları = new Scanner(System.in);
        System.out.println("Dizinin uzunluğunu giriniz :");
        diziBoyutu = diziElemeanları.nextInt();    // Dizinin uzunlugunu kullanıcıdan alıyoruz ve alınan uzunluk değişkene aktırılıyor
        
        int dizi[] = new int[diziBoyutu];    // Dizinin boyutunu kullanıcının istediği boyuta göre tanımlıyoruz
        
        for (int i = 0; i < dizi.length; i++) {    // Dizinin uzunluğu kadar kullanıcıdan eleman girmesini sağlıyoruz
            System.out.println((i + 1) + ". elamanı giriniz");
            dizi[i] = diziElemeanları.nextInt();
        }
        System.out.println("sıralanmamış dizi :");
        for (int i = 0; i < dizi.length; i++) {    // Kullanıcının girmiş olduğu diziyi yazdırıyoruz
            System.out.print(dizi[i] + "-");
        }
        System.out.println(" ");
        elemanBul(dizi);    //Dizinin k. elemanını bulması için "elemanBul" metodunu çağırıyoruz

    }

    private static void elemanBul(int[] dizi) {
        Scanner diziElemeanları = new Scanner(System.in);
        int arananIndex;
        int buyukmuKucukmu;
        System.out.println("Dizinin en büyük elemanı için '1',en küçük elemanı için '2' tuşuna basınız :");
        buyukmuKucukmu = diziElemeanları.nextInt();    // Dizi içersinde bulunması istenen en büyük yada en küçük sayıyı kullanıcıdan alıyoruz ve değişkene atıyoruz 
        System.out.println("Dizideki en büyük veya en küçük kaçıncı elemanı bulmak istiyorsunuz :");
        arananIndex = diziElemeanları.nextInt();    // Dizi içersinde bulunan, kullanıcının istediği k. büyük veya küçük sayıyı alıyoruz ve değişkene atıyoruz
        
        int temp;   // Yer değiştirmede kullanılacak geçici değişken
        for (int i = 1; i < dizi.length; i++) {    // Dizinin ardışık elamanlarını karşılaştırmak için kullandığımız döngü
            for (int j = 0; j < dizi.length - i; j++) {// Dizi içersindeki iki sayı kontrol edilir ve soldaki sayı büyük ise iki sayının yerleri değiştirilir

                if (dizi[j] > dizi[j + 1]) {    // Dizi içersindeki iki sayı kontrol edilir ve soldaki sayı büyük ise iki sayının yerleri değiştirilir
                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;

                }
            }
            
        }
        if (buyukmuKucukmu == 1){
            System.out.println("Dizinin en büyük elemanı :"+ dizi[dizi.length - arananIndex]);
        }else if (buyukmuKucukmu == 2){
             System.out.println("Dizinin en küçük elemanı :"+ dizi[arananIndex-1]);
        }else {
            System.out.println("Yanlış bir karakter girdiniz!");
        }
        System.out.println("sıralı dizi");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + "-");
                    

        }
       
    }

}
