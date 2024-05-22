package com.cc.java;

public class App {
    
    public static void main(String[] args) {
           
        // Cat --> Referenztyp (Klasse aus dem Objekt entsteht)
        // cat2 --> Referenzvariable (Adresse des Objekts im RAM)
       Cat cat1 = new Cat(); // Instanziierung >> Objekt
       System.out.println("Blick von außen: "+cat1); // Adresse des Objekts
        System.out.println("-----------------------------------------");
       Cat cat2 = new Cat();
       cat2.sayHi();
       System.out.println("Blick von außen: "+cat2);
       
        // System.out.println(new Cat());
        // System.out.println(new Cat());
    }

   

}

