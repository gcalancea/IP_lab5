import java.util.Vector;

public class Restaurant {

    public Integer nrMese;

    public String nume;

    public Restaurant(String numeStr, Integer nrMeseInt)
    {
        nume = numeStr;
        nrMese = nrMeseInt;
    }

    public void setNrMese(Integer nr )
    {
        this.nrMese=nr;
    }

    public Integer getNrMese() {
        return nrMese;
    }

    public void setNume(String nume )
    {
        this.nume=nume;
    }

    public String getNume() {
        return nume;
    }
}