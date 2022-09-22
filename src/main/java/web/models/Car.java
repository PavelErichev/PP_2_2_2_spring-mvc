package web.models;

public class Car {
    private int id;
    private int Series;
    private String model;

    public Car(int id, int series, String model) {
        this.id = id;
        Series = series;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeries() {
        return Series;
    }

    public void setSeries(int series) {
        Series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}