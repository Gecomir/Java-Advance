package Defining_classes;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String carInfo() {
        return String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHorsePower());
    }

    public int getHorsePower() {
        return horsePower;

    }
}
