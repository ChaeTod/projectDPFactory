package it.sovy.Artem.FactorEx;

public class F15E extends Configuration {

     private String capacity;
    private String lifeRange;
    private String engineEfficiency;
    private double approximateCost;

    F15E(String capacity, String lifeRange, String engineEfficiency) {
        this.capacity = capacity;
        this.lifeRange = lifeRange;
        this.engineEfficiency = engineEfficiency;
    }

    @Override
    public String getCapacity() {
        return capacity;
    }

    @Override
    public String getLifeRange() {
        return lifeRange;
    }

    @Override
    public String getEngineEfficiency() {
        return engineEfficiency;
    }

    @Override
    public String getApproximateCost() {
        calculateCapacityValue = approximateCostPattern.matcher(getEngineEfficiency());
        calculateLifeRangeValue = approximateCostPattern.matcher(getCapacity());
        calculateEngineEfficiencyValue = approximateCostPattern.matcher(getLifeRange());

        while (calculateCapacityValue.find() && calculateEngineEfficiencyValue.find() && calculateLifeRangeValue.find()) {
            approximateCost = Double.parseDouble(calculateCapacityValue.group() + calculateLifeRangeValue.group()) + Double.parseDouble(calculateEngineEfficiencyValue.group());
        }
        return format.format(approximateCost * 3.60);
    }
}

