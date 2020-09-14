package com.company;
import java.util.*;

public class Carioca implements Visitante{
    private Cidade destino;
    public Carioca(final Cidade destino){
        this.destino = destino;
    }

    @Override
    public void viaja(){
        System.out.println("Sou carioca e estou viajando hehe");
        Random randomno = new Random();
        boolean encantou = randomno.nextBoolean();
        if (encantou){
            destino.encanta();
        } else {
            destino.estressa();
        }
    }

    @Override
    public void mudaDestino(Cidade destino){
        this.destino = destino;
    }
}
