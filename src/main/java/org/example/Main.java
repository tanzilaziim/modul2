package org.example;

public class Main {
    public static void main(String[] args) {
//        Buku a = new Buku();
//        a.setNilai("Jurassic Park", "Michael Crichton", 21);
//        a.cetakKeLayar();
        Buku a,b = new Buku();
        a = new Buku("Siaga Merah", "Alistair Maclean");
        b = new Buku();
        a.cetakKeLayar();
        System.out.println();
        b.cetakKeLayar();
    }
}