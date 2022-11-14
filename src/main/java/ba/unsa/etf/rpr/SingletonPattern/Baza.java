package ba.unsa.etf.rpr.SingletonPattern;

public class Baza {

    private static Baza instanca=null;
    public Baza() {
    }

    public static Baza getInstanca() {
        if(instanca!=null)
            instanca=new Baza();
        return instanca;
    }
    public static void removeInstance(){
        if(instanca==null)
            return;
        instanca=null;
    }
}
