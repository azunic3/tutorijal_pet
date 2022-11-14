package ba.unsa.etf.rpr.BuilderPattern;

public class PhoneBuilder {
    private Integer baterija;
    private String procesor;
    private Double velicinadisplaya;
    private final String operativniSistem;

    public PhoneBuilder setBaterija(Integer baterija) {
        this.baterija = baterija;
        return this;
    }

    public PhoneBuilder setProcesor(String procesor) {
        this.procesor = procesor;
        return this;
    }

    public PhoneBuilder setVelicinadisplaya(Double velicinadisplaya) {
        this.velicinadisplaya = velicinadisplaya;
        return this;
    }

    public PhoneBuilder(String operativniSistem, Integer baterija, String procesor, Double velicinadisplaya) {
        this.operativniSistem = operativniSistem;
        this.baterija = baterija;
        this.procesor = procesor;
        this.velicinadisplaya = velicinadisplaya;
    }
    public Phone build() {
        return new Phone(operativniSistem, baterija, procesor, velicinadisplaya);
    }

    public PhoneBuilder(String operativniSistem) {

        this.operativniSistem = operativniSistem;
    }



}
