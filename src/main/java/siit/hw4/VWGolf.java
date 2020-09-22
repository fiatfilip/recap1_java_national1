package siit.hw4;

public class VWGolf extends VW{

    public VWGolf(int availableFuel, String chassisNumber){
        super(50, availableFuel, chassisNumber, 5, "PETROL", 7.9);
    }

    @Override
    public double getInstantConsumption() {
        return getConsumptionPer100Km() * (100 - (getGears() - getCurrentGear()) * 10)/100;
    }
}
