package com.ralf;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do seu sistema é ");
        System.out.print(loc.getDisplayLanguage());;
    }
}
