package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("UM DIA NA PONTE RIO-NITERÓI\n");

        System.out.println("\n---- Niteroiense indo pro Rio ----");

        Cidade rio = new Rio();
        Visitante niteroiense = new Niteroiense(rio);
        niteroiense.viaja();

        System.out.println("\n---- Carioca indo pra Niterói ----");

        Cidade niteroi = new Niteroi();
        Visitante carioca = new Carioca(niteroi);
        carioca.viaja();

        System.out.println("\n---- Niteroiense voltando ----");
        niteroiense.mudaDestino(niteroi);
        niteroiense.viaja();

        System.out.println("\n---- Carioca voltando ----");
        carioca.mudaDestino(rio);
        carioca.viaja();
    }
}
