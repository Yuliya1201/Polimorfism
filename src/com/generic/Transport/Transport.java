package com.generic.Transport;
import static com.javacource.ValidateUtils.validateInteger;
import static com.javacource.ValidateUtils.validateString;
import static com.javacource.ValidateUtils.validateCarParameter;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final Integer enginePower;

    public Transport (String brand,String model,Integer enginePower) {
        this.brand = brand;
        this.model = model;
        this.enginePower = validateInteger(enginePower,2);
    }
    public String validateCarParameter(String brend) {
        return brand;

    }

    public String getBrand(){
        return brand;
    }
    public String getModel () {
        return model;
    }
    public Integer getEnginePower() {
        return enginePower;
    }
    abstract void startToMove();

    abstract void finish();

    @Override
    public String toString() {
        return "Transport{"+"brend= '" + brand + '\''+ "model= '" + model + '\'' + "enginePower= " +
                enginePower + '}';
    }
}

