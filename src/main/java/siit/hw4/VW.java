package siit.hw4;

public abstract class VW extends Car{
    public VW(int fuelTankSize, int availableFuel, String chassisNumber, int gears, String fuelType, double consumptionPer100Km) {
        super(fuelTankSize, availableFuel, chassisNumber, gears, fuelType, consumptionPer100Km);
    }
}
