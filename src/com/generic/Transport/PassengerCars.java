package com.generic.Transport;

public class PassengerCars extends Transport implements Competing {
    private Integer pitStopTime;
    private Integer maxSpeed;
    private Integer bestLapTime;

    public PassengerCars(String brend,String model,Integer enginePower,Integer pitStopTime,Integer maxSpeed,
                         Integer bestLapTime) {
        super(brend,model,enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }
    void startToMove () {
        System.out.println("Car started");
    }

    @Override
    void finish() {
        System.out.println("Car finished");
    }
    public void getPitStop() {
        System.out.println("pit-stop time is " + pitStopTime);
    }
    public void getBestLapTime() {
        System.out.println("best lap time is " + bestLapTime);
    }
    public void getMaxSpeed() {
        System.out.println("max speed is " + maxSpeed);
    }
}
