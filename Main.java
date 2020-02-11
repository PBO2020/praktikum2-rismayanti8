package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ArrayList<String>kopi   = new ArrayList<String>();
        ArrayList<String>topping = new ArrayList<>();

        kopi = new ArrayList<>();
        topping = new ArrayList<>();

        mesinkopi robusta = new mesinkopi();
        robusta.setJenisKopi("Robusta");
        robusta.setAsal("Eropa");
        robusta.setJumlahStokKopi(40);
        kopi.add(robusta.getJenisKopi());

        mesinkopi florest = new mesinkopi();
        florest.setJenisKopi("Florest");
        florest.setAsal("Asia");
        florest.setJumlahStokKopi(40);
        kopi.add(florest.getJenisKopi());

        mesinkopi arabica = new mesinkopi();
        arabica.setJenisKopi("Arabica");
        arabica.setAsal("Timur Tengah");
        arabica.setJumlahStokKopi(40);
        kopi.add(arabica.getJenisKopi());

        robusta.setTopping("Cream");
        topping.add(robusta.getTopping());
        robusta.setTopping("gula");
        topping.add(robusta.getTopping());
        robusta.setTopping("Caramel");
        topping.add(robusta.getTopping());
        robusta.setTopping("Whip Cream");
        topping.add(robusta.getTopping());
        robusta.setTopping("Strawberry Sauce");
        topping.add(robusta.getTopping());

//        mesinkopi susu = new mesinkopi();
//        susu.setJenisKopi("Susu");
//        susu.setJumlahStokKopi(40);
//        kopi.add(susu.getJenisKopi());


        for(int i=0; i< kopi.size(); i++){
            int j= +1;
            System.out.println("Menu kopi adalah "+j+" "+kopi.get(i)) ;
        }
        System.out.println();
        for(int i=0; i< topping.size();i++){
            int j= i+1;
            System.out.println("Menu topping adalah "+j+" "+topping.get(i));
        }
        System.out.println();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan kopi yang mau dipilih ");
        int pilihanKopi = keyboard.nextInt() -1;
        int pilihantopping = keyboard.nextInt() -1;

        System.out.println("Pesanan anda adalah " + kopi.get(pilihanKopi) +  " dengan topping " + topping.get(pilihantopping));
    }
}
