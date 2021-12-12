package model;


public class Car {
    private String model;
    private int series;
    private int productionYear;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Car(String model, int series, int productionYear) {
        this.model = model;
        this.series = series;
        this.productionYear = productionYear;
    }

}
