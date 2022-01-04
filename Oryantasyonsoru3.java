/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Kullanicidan 2 adet sayi alan , ilk sayi ciftse ekrana 2.sayi kadar Mustafa yazdiran tekse tektir yazdiran kod*/
package oryantasyonsoru3;
import java.util.Scanner;
public class Oryantasyonsoru3 {
public static void main(String[] args) {
 Scanner giris= new Scanner(System.in);
int x,y;
System.out.println("Lütfen 2 Sayı Giriniz" );
    x = giris.nextInt();
    y = giris.nextInt();   
if(x%2==0){
    for(int i=1 ;i<=y;i++){
        System.out.println( "Mustafa");
    }
}
    else{
            System.out.println("Sayı Tektir Çift Giriniz ");
            }

}
}
    
    

