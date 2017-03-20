// Decompiled by DJ v3.10.10.93 Copyright 2007 Atanas Neshkov  Date: 3/20/2017 11:10:41 AM
// Home Page: http://members.fortunecity.com/neshkov/dj.html http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Client.java

package ip.lab5;

import java.util.Vector;

// Referenced classes of package ip.lab5:
//            Rezervare

public class Client
{

    public Client(String name, int id, String telefon, String email)
    {
        this.id = Integer.valueOf(id);
        nume = name;
        this.telefon = telefon;
        this.email = email;
    }

    public void rezerva()
    {
    }

    public void anuleaza(Rezervare rezervare1)
    {
    }

    public Vector rezervari()
    {
        return null;
    }

    public String nume;
    public Integer id;
    public String telefon;
    public String email;
    public Vector myRezervare;
    public Vector myManager_Rezervari;
}