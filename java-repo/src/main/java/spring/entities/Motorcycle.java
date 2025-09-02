package spring.entities;

public class Motorcycle {
    private String brand;
    private String model;

    public Motorcycle() {
        System.out.println("A motorcycle has been added.");
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Brand set to: " + brand);
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("Model set to: " + model);
    }

    @Override
    public String toString() {
        return "Motorcycle [brand=" + this.brand + " model=" + this.model + "]";
    }

}
