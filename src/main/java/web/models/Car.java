package web.models;

import java.util.UUID;

public class Car {
    private UUID id;
    private String model;
    private String series;

    public Car() {
    }

    public Car(UUID id, String model, String series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}

