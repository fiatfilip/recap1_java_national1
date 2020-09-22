package siit.hw4;

public class VWPassat extends VW{

    public VWPassat(int availableFuel, String chassisNumber){
        this(availableFuel, chassisNumber, "DIESEL");//apeleaza urmatorul constructor
    }

    private VWPassat(int availableFuel, String chassisNumber, String fuelType){
        this(75, availableFuel, chassisNumber, 6, fuelType, 9.9);//apeleaza urmatorul constructor
    }

    private VWPassat(int fuelTankSize, int availableFuel, String chassisNumber, int gears, String fuelType, double consumptionPer100Km) {
        super(fuelTankSize, availableFuel, chassisNumber, gears, fuelType, consumptionPer100Km);//apeleaza constructorul clasei parinte
    }

    @Override
    public double getInstantConsumption() {
        return getConsumptionPer100Km() * (100 - getCurrentGear() * 20)/100;
    }
}
