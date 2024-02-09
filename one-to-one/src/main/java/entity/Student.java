package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
//@Table(name = "student")
public class Student {
    @Id
    private int id;
    private String name;

    private String address;

    @OneToOne
    private Laptop laptop;

    public Student() {
    }

    public Student(int id, String name, String address, Laptop laptop) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setLaptop(laptop);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
