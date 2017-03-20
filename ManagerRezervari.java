/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip.lab5;

/**
 *
 * @author dell
 */
import java.util.Vector;

public class ManagerRezervari {
    private Vector <Rezervare> rezervari;

    public Boolean adaugaRezervare(Integer idClient) {
            return true;
    }
    public void stergeRezervare(Client client) {
        
    }
    public Boolean isAvailable(Rezervare rezervare) {
        return true;
    }
    public Vector<Rezervare> getRezervari(Client client) {
        return new Vector<Rezervare>();
    }
}