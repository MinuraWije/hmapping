package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(name = "laptop")
public class Laptop {
    @Id
    private int lid;
    private String model;

    public Laptop(int lid, String model) {
        this.setLid(lid);
        this.setModel(model);
    }

    public Laptop() {
    }



    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
