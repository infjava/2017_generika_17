/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generika;

import java.util.Iterator;

/**
 *
 * @author janik
 */
public class PostupnostCisel implements Iterable<Integer> {

    private final int odCisla;
    private final int poCislo;

    public PostupnostCisel(int odCisla, int poCislo) {
        this.odCisla = odCisla;
        this.poCislo = poCislo;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PostupnostIterator();
    }

    private class PostupnostIterator implements Iterator<Integer> {

        private int aktualneCislo;
        
        public PostupnostIterator() {
            this.aktualneCislo = PostupnostCisel.this.odCisla - 1;
        }

        @Override
        public boolean hasNext() {
            return this.aktualneCislo < PostupnostCisel.this.poCislo;
        }

        @Override
        public Integer next() {
            this.aktualneCislo++;
            return this.aktualneCislo;
        }
    }
    
}
