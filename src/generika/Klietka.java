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
class Klietka<E extends Zviera> {
    private E zviera;

    public Klietka() {
        this.zviera = null;
    }
    
    void vloz(E zviera) {
        this.zviera = zviera;
    }

    void vypisObsah() {
        if (this.zviera == null) {
            System.out.println("Klietka je prazdna");
        } else {
            System.out.println("Z klietky na teba mava "
                    + this.zviera.getClass().getSimpleName());
        }
    }

    void vlozPotravu(Mrkva mrkva) {
        this.zviera.zjedz(mrkva);
    }
    
}
