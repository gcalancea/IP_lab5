// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 3/20/2017 11:10:41 AM
// Home Page: http://members.fortunecity.com/neshkov/dj.html http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   ManagerRezervari.java

package ip.lab5;

import java.util.Vector;

// Referenced classes of package ip.lab5:
//            Client, Rezervare

public class ManagerRezervari
{

    public ManagerRezervari()
    {
    }

    public Boolean adaugaRezervare(Integer idClient)
    {
        return Boolean.valueOf(true);
    }

    public void stergeRezervare(Client client1)
    {
    }

    public Boolean isAvailable(Rezervare rezervare)
    {
        return Boolean.valueOf(true);
    }

    public Vector getRezervari(Client client)
    {
        return new Vector();
    }

    private Vector rezervari;
}