/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgendaTelefon;

public class nrTel {

    private String tel;

    public nrTel(String tel) {
        this.tel = tel;
    }

    public void verificaTel() {
        if (tel == null) {
            System.out.println("e Gol");
        }
        if (tel.length() != 10) {
            System.out.println("Lungimea nu e buna");
        }
        if (!tel.substring(0, 2).equals("07") && !tel.substring(0, 3).equals("021")) {
            System.out.println("Nu e numar de pe Terra!");
        }
    }

    public String getTel() {
        return tel;
    }
}
