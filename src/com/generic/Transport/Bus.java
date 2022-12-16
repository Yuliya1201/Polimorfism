package com.generic.Transport;

public class Bus extends Transport implements  Competing {
    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapTime;

    public Bus(String brend,String model,Integer enginePower,Integer pitStopTime,Integer maxSpeed,
               Integer bestLapTime) {
        super(brend,model,enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }
    void startToMove() {
        System.out.println("Bus started");
    }

    @Override
    void finish() {
        System.out.println("Bus finished");
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
