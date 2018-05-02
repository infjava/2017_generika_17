/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generika;

/**
 *
 * @author janik
 */
public class Generika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Klietka<Integer> klietka = new Klietka<Integer>();
        Klietka<Lev> klietka = new Klietka<Lev>();
        klietka.vloz(new Lev());
        //klietka.vloz(new Kralik());
        klietka.vypisObsah();
    }
}
