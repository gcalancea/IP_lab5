/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip.lab5;

import java.util.Vector;

/**
 * @author dell
 */


public class Client {

    public String nume;

    public Integer id;

    public String telefon;

    public String email;

    public Client(String name, int id, String telefon, String email) {
        this.id = id;
        this.nume = name;
        this.telefon = telefon;
        this.email = email;
    }

    ;

    public void afis() {
        System.out.println("Numele clientului: " + this.nume);
    }

    public Vector myRezervare;
    public Vector myManager_Rezervari;

    public void rezerva() {
    }

    public void anuleaza(Rezervare rezervare) {
    }

    public Vector<Rezervare> rezervari() {
        return null;
    }

}
