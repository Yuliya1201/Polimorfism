package com.generic.Transport;
import static com.javacource.ValidateUtils.validateString;

public class Trucks extends Transport implements Competing {
    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapTime;

    public Trucks(String brend,String model,Integer enginePower,Integer pitStopTime,Integer maxSpeed,
                  Integer bestLapTime) {
        super(brend,model,enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
    }
    void startToMove() {
        System.out.println("Track started ");
    }

    @Override
    void finish() {
        System.out.println("Track finished ");
    }
    public void getPitStop() {
        System.out.println("track pit-stop time is " + pitStopTime);
    }
    public void getBestLapTime() {
        System.out.println("truck best lap time is " + bestLapTime);
    }
    public void getMaxSpeed () {
        System.out.println("truck max speed is " + maxSpeed);
    }
}
