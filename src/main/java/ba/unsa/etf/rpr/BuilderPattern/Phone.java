package ba.unsa.etf.rpr.BuilderPattern;

public class Phone {
    private String operativnisistem;
    private Integer baterija;
    private String procesor;

    private Double velicinadisplaya;

    public Phone(String operativnisistem, Integer baterija, String procesor, Double velicinadisplaya) {
        this.operativnisistem = operativnisistem;
        this.baterija = baterija;
        this.procesor = procesor;
        this.velicinadisplaya = velicinadisplaya;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "operativnisistem='" + operativnisistem + '\'' +
                ", baterija=" + baterija +
                ", procesor='" + procesor + '\'' +
                ", velicinadisplaya=" + velicinadisplaya +
                '}';
    }
    public String getOperativnisistem() {
        return operativnisistem;
    }

    public void setOperativnisistem(String operativnisistem) {
        this.operativnisistem = operativnisistem;
    }

    public Integer getBaterija() {
        return baterija;
    }

    public void setBaterija(Integer baterija) {
        this.baterija = baterija;
    }

    public String getProcesor() {
        return procesor;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public Double getVelicinadisplaya() {
        return velicinadisplaya;
    }

    public void setVelicinadisplaya(Double velicinadisplaya) {
        this.velicinadisplaya = velicinadisplaya;
    }
}
