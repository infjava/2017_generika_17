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
        //klietka.vloz(new Lev());
        klietka.vloz(new Lev());
        klietka.vlozPotravu(new Kralik());
        klietka.vypisObsah();
        
        /*** 2. PRIKLAD ***/
        for (Integer cislo : new PostupnostCisel(1, 10)) {
            System.out.println("- " + cislo);
        }
        
        /* to iste ako:
            Iterator<Integer> prst = new PostupnostCisel(1, 10).iterator();
            while (prst.hasNext()) {
                Integer cislo = prst.next();
                System.out.println("- " + cislo);
            }
        */
        
        /*** 3. PRIKLAD (samostatne) ***/
        System.out.println("Prvocisla po 100:");
        for (Integer cislo : new Prvocisla(100)) {
            System.out.println("- " + cislo);
        }
    }
}
