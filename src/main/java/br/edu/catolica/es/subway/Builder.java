package br.edu.catolica.es.subway;

public interface Builder <K, T>{
    K recheio(String recheio);
    K molho(String molho);
    K extra(String extra);

    T create();
}
