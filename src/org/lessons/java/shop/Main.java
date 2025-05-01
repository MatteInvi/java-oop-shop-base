package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Product tastiera = new Product( "Razer", "Chroma", 120, 22);

        Product mouse = new Product("Razer", "Mamba", 70, 22);

        System.out.println(mouse.leggi());
        System.out.println(tastiera.leggi());
   
    }
 
}


