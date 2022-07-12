package main;

import Entitie.Financing;

public class App {
    public static void main(String[] args) throws Exception {
       try{
        Financing f1 = new Financing(100000.0, 2000.0, 20);
        System.out.println("Valores do Financiamento 1: ");
        System.out.printf("Entrada %.2f", f1.entry());
        System.out.printf("Prestação %.2f", f1.quota());
       }
       catch (IllegalArgumentException e){
            System.out.println("Erro no Financiamento 1 " + e.getMessage());
       }
        
       try{
        Financing f2 = new Financing(100000.0, 2000.0, 80);
        System.out.println("Valores do Financiamento 2: ");
        System.out.printf("Entrada %.2f%n ", f2.entry());
        System.out.printf("Prestação %.2f ", f2.quota());
       }
       catch(IllegalArgumentException e){
            System.out.println("Erro no financiamento 2 " + e.getMessage());
       }

    }
}
