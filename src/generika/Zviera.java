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
class Zviera {
    public void zjedz(Jedlo jedlo) {
        System.out.println(this.getClass().getSimpleName()
                + " ti dakuje za " + 
                jedlo.getClass().getSimpleName());
    }
}
