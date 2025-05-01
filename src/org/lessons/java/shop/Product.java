package org.lessons.java.shop;

public class Product {
    public int code;
    public String name;
    public String descrizione;
    public double price;
    public int iva;

    public Product(String name, String descrizione){
        this.code = setCode(); // Numero randomico
        this.name = name;
        this.descrizione = descrizione;
        this.price = basePrice(); //Prezzo default
        this.iva = ivaMinima(); // IVA Minima Applicabile


    }

    public Product(String name, String descrizione, double price, int iva){
      this.code = setCode(); // Numero randomico
      this.name = name;
      this.descrizione = descrizione;
      this.price = price; //Prezzo default
      this.iva = iva; // IVA Minima Applicabile

    }
// Metodi
     public int setCode(){
        return (int)(Math.random() * 1000000);
    }
    public double basePrice(){
      return price = 1;
    }
    public int ivaMinima(){
      return iva = 10;
    }

    public double finalPrice(){
      return price = price + (price * iva / 100);
    }

    public String nomeEsteso(){
      return code + "-" + name;
    }

    public String leggi(){
      return "Nome Prodotto: " + name + "/ " 
      +  "Codice prodotto: " + code + "/ " 
      + "Descrizione: " + descrizione + "/ " 
      + "Prezzo: " + price + " " +  "IVA: " + iva + "/ " 
      + "Prezzo compreso di IVA: " + finalPrice() + "/ "
      + "Nome Esteso: " + nomeEsteso() ;
    }
}
