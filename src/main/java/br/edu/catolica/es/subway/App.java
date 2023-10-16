package br.edu.catolica.es.subway;

public class App {
    public static void main(String[] args) {
        var sanduiche1 = new SanduicheBuilder("Parmesao")
                .create();

        System.out.println("Sanduiche 1: "+sanduiche1);
    }
}