/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaTelefon;

import AgendaTelefon.Abonat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.AbstractListModel;

public class CarteDeTelefon extends AbstractListModel {

    final List ct = new ArrayList();

    //private Abonat[] ca = new Abonat[0];
    @Override
    public int getSize() {
        return ct.size();
    }

    @Override
    public Object getElementAt(int i) {
        return ct.get(i);
    }

    public void adauga(Abonat a) {
        /*ca = Arrays.copyOf(ca, ca.length + 1);
        ca[ca.length - 1] = a;
        fireContentsChanged(this, -1, -1);*/

        ct.add(a);
        fireContentsChanged(this, -1, -1);

    }

    public void adauga(String n, String p, nrTel t, String cnp) {
        adauga(new Abonat(n, p, t, cnp));
    }
    Comparator dupaNume = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Abonat a1 = (Abonat) o1,
                    a2 = (Abonat) o2;

            return a1.getNume().compareTo(a2.getNume());
        }

    };
    Comparator dupaPrenume = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Abonat a1 = (Abonat) o1,
                    a2 = (Abonat) o2;

            return a1.getPrenume().compareTo(a2.getPrenume());
        }

    };
    Comparator dupaCnp = new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            Abonat a1 = (Abonat) o1, a2 = (Abonat) o2;
            return a1.getCnp().compareTo(a2.getCnp());
        }
    };
    Comparator dupaNrTel = new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            Abonat a1 = (Abonat) o1, a2 = (Abonat) o2;
            return a1.getTell().compareTo(a2.getTell());

        }
    };

    public void sterge(int pozitie) {
        ct.remove(pozitie);
        fireContentsChanged(this, -1, -1);
    }
    private int srt = 1;

    public int getSrt() {
        return srt;
    }

    public void setSrt(int i) {
        srt = i;
    }

    public void ordoneaza() {
        switch (srt) {
            case 1:
                Collections.sort(ct, dupaNume);
                fireContentsChanged(this, -1, -1);
                break;
            case 2:
                Collections.sort(ct, dupaPrenume);
                fireContentsChanged(this, -1, -1);
                break;
            case 3:
                Collections.sort(ct, dupaCnp);
                fireContentsChanged(this, -1, -1);
                break;
            case 4:
                Collections.sort(ct, dupaNrTel);
                fireContentsChanged(this, -1, -1);
                break;
        }
        //Collections.sort(ct, dupaNume);
        // fireContentsChanged(this, -1, -1);

    }
    public void cautare(String s){
        
    }

}
