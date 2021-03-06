package models;

//class for bank accounts
public class Account {
    //declare the entries of the Account table
    private String idaccount;
    private String idUser;
    private String amount;
    private String valuta;
    private String nrCard;

    //constructor with all entries
    public Account(String idaccount, String idUser, String amount, String valuta, String nrCard) {
        this.idaccount = idaccount;
        this.idUser = idUser;
        this.amount = amount;
        this.valuta = valuta;
        this.nrCard = nrCard;
    }
    //ocnstructor with all entries but the idUser
    public Account(String idaccount, String amount, String valuta, String nrCard) {
        this.idaccount = idaccount;
        this.amount = amount;
        this.valuta = valuta;
        this.nrCard = nrCard;
    }
    //method that converts currencies to RON, incase the user needs to see the account balance in RON
    public int ConversieLaRon(){
        int valuta_finala=Integer.parseInt(this.amount);
        if(this.valuta.equals("Euro")){

            valuta_finala*=4.84;
            return valuta_finala ;
        }
        if(this.valuta.equals("Lire")){

            valuta_finala*=5.42;
            return valuta_finala ;
        }
        if(this.valuta.equals("Ron")){

            return valuta_finala ;
        }
        return valuta_finala ;

    }
    //method that adds money to an account
    public String adaugare_suma(String s)
    {
        int temp=Integer.parseInt(this.amount);
        int suma_de_adaugat=Integer.parseInt(s);
        temp+=suma_de_adaugat;
        this.setAmount(Integer.toString(temp));
        return this.getAmount();
    }
    //method that extracts a sum from an account and prints a messasge if the sum in greater than the actual amount in the account
    public String extragere_suma(String s)
    {
        int temp=Integer.parseInt(this.amount);
        int suma_de_extras=Integer.parseInt(s);
        if(temp<suma_de_extras)
        {
            System.out.println("nu ai bani!");
            return null;
        }
            else
        {temp-=suma_de_extras;
        this.setAmount(Integer.toString(temp));
        return this.getAmount();}
    }
    //setters and getters for every entry of the table
    public String getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(String idaccount) {
        this.idaccount = idaccount;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    public String getNrCard() {
        return nrCard;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    @Override
    public String toString() {
        return this.idaccount+" "+this.valuta;
    }
}
