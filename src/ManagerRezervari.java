/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Vector;

public class ManagerRezervari {
    private static ManagerRezervari instance = null;
    private Vector <Rezervare> rezervari;

    public ManagerRezervari getInstance() {
        if(instance == null) {
            instance = new ManagerRezervari();
            return instance;
        }
        return instance;
    }

    public Boolean adaugaRezervare(Rezervare rez) {
        if(isAvailable(rez)) {
            rezervari.add(rez);
            return true;
        }
        return false;
    }

    public void stergeRezervare(Rezervare rez) {
        for(Rezervare now : rezervari)
            if(now.equals(rez)) {
                rezervari.remove(now);
                System.out.println("Rezervarea a fost stearsa!");
                return ;
            }
        System.out.println("Rezervarea nu a fost gasita!");
    }

    public Boolean isAvailable(Rezervare rezervare) {
        int cnt = rezervare.getRestaurant().getNrMese();
        String name = rezervare.getRestaurant().getName().lower();
        for(Rezervare now : rezervari)
            if(rezervare.getRestaurant().getName().lower().equals(name))
                cnt -= rezervare.getNrMese();

        return cnt >= rezervare.getNrMese() && cnt > 0;
    }
    public Vector<Rezervare> getRezervari(Client client) {
        Vector<Rezervare> ans = new Vector<>();
        for(Rezervare now : rezervari)
            ans.add(now);

        return ans;
    }
}