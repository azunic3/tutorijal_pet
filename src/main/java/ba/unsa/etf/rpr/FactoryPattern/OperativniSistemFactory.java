package ba.unsa.etf.rpr.FactoryPattern;

public class OperativniSistemFactory {
    public OperativniSistem getInstance(String tipObjekta){
        if(tipObjekta.toLowerCase().equals("open source") || tipObjekta.toLowerCase().equals("open"))
            return new Android();
        else if(tipObjekta.equals("Closed source") || tipObjekta.equals("Closed"))
            return new IOS();
        else return new Windows();
    }
}
