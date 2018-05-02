/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generika;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author janik
 */
public class Prvocisla implements Iterable<Integer> {

    private final boolean[] sito;

    public Prvocisla(int posledne) {
        this.sito = new boolean[posledne + 1];
        Arrays.fill(this.sito, true);
        
        this.sito[0] = false;
        this.sito[1] = false;
        
        int max = (int) Math.sqrt(posledne);
        
        for (int i = 2; i <= max; i++) {
            for (int j = i*2; j <= posledne; j += i) {
                this.sito[j] = false;
            }
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrvocislaIterator();
    }

    private class PrvocislaIterator implements Iterator<Integer> {

        private int aktualnePrvocislo;

        public PrvocislaIterator() {
            this.aktualnePrvocislo = 2;
        }

        @Override
        public boolean hasNext() {
            return this.aktualnePrvocislo < Prvocisla.this.sito.length;
        }

        @Override
        public Integer next() {
            int ret = this.aktualnePrvocislo;
            
            do {
                this.aktualnePrvocislo++;
            } while (this.aktualnePrvocislo < Prvocisla.this.sito.length
                    && !Prvocisla.this.sito[this.aktualnePrvocislo] );
            
            return ret;
        }
        
        
    }
    
}
