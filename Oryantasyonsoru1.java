/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*Klavyeden girilen 3 sayi icin girilen 2 sayinin toplami 3. sayidan buyuk,kucuk ya da esitligini bulan kod */
package oryantasyonsoru1;
import java.util.Scanner;
public class Oryantasyonsoru1 {
public static void main(String[] args) {
Scanner giris=new Scanner(System.in);
int x,y,z;
System.out.println("Lütfen 3 Adet Sayı Giriniz");
x= giris.nextInt();
y= giris.nextInt();
z= giris.nextInt();
int a=x+y;
if(a>z){    
    System.out.println("Toplam Son Girdiğinizden Daha Büyük");
}
else if(a==z){
    System.out.println("Toplam Son Girdiğiniz Sayıya Eşit");
    }
else{
    System.out.println("Toplam Son Girdiğiniz Sayıdan Küçük");
    }  
    }

}
