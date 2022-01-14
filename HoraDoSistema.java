package com.ralf;

import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date(); // new é Criar um novo OBJETO
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    }
}