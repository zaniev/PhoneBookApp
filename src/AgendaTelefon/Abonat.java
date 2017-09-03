/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaTelefon;

import AgendaTelefon.nrTel;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.lang.Exception;
import java.util.Comparator;

public class Abonat implements Comparable {

    private String nume;
    private String prenume;
    private nrTel tel;
    private String cnp;

    public Abonat(String nume, String prenume, nrTel tel, String cnp) {
        this.nume = nume;
        this.prenume = prenume;
        this.tel = tel;
        this.cnp = cnp;
    }

    public void verifCnp() {

        if (cnp.length() != 13) {

            System.out.println("Lungimea este gresita!");
        }
        if (!cnp.matches("[0-9]+")) {
            System.out.println("Nu contine cifre!");
        }
        if (!cnp.substring(0, 1).contains("1") && !cnp.substring(0, 1).contains("2")) {
            System.out.println("Poate esti extraterestru!");
        }

    }

    public void verifNume(String nume) {
        if (!nume.matches("[a-zA-z]+")) {
            throw new RuntimeException("Nu e bine!");
            // System.out.println("Nu contine litere!");
        }
    }

    public String toString() {
        return nume + " " + prenume + " " + tel.getTel() + " " + cnp;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getTell() {
        return tel.getTel();
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
