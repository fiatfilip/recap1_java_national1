package siit.hw4;

public abstract class Car implements Vehicle{
    private int currentGear;
    private int availableFuel;
    private int tyreSize;
    private double currentConsumption;
    private boolean onOff;
    private double trip;



    private final int fuelTankSize;
    private final int gears;
    private final String chassisNumber;
    private final String fuelType;
    private final double consumptionPer100Km;

    public void shiftGear(int gear){
        if(gear > 0 && gear <= this.gears){
            this.currentGear = gear;
        }
    }

    public Car(int fuelTankSize, int availableFuel, String chassisNumber, int gears, String fuelType, double consumptionPer100Km){
        this.fuelTankSize = fuelTankSize;
        this.chassisNumber = chassisNumber;
        this.gears = gears;
        this.availableFuel = availableFuel;
        this.fuelType = fuelType;
        this.consumptionPer100Km = consumptionPer100Km;
    }

    public abstract double getInstantConsumption();

    public int getCurrentGear() {
        return currentGear;
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public int getGears() {
        return gears;
    }

    public void start() {
        currentConsumption = 0;
        trip = 0;
        onOff = true;
    }

    public double stop() {
        onOff = false;
        return this.currentConsumption;
    }

    @Override
    public void drive(int km) {
        if(onOff && km < (double)availableFuel/consumptionPer100Km*100) {
            this.currentConsumption += km * getInstantConsumption() / 100;
            this.trip += km;
        }
    }

    public double getAverageFuelConsumption(){
        return 100 * this.currentConsumption/ trip;
    }
}
