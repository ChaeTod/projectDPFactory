package it.sovy.Artem.FactorEx;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Configuration {

    public abstract String getCapacity();

    public abstract String getLifeRange();

     public abstract String getEngineEfficiency();

    public abstract String getApproximateCost(); // all tree classes with different planes has different formula to calculate the plane's cost

    Pattern approximateCostPattern = Pattern.compile("[-+]?([0-9]*[.])?[0-9]+([eE][-+]?\\d+)?");
    Matcher calculateCapacityValue;
    Matcher calculateLifeRangeValue;
    Matcher calculateEngineEfficiencyValue;
    DecimalFormat format = new DecimalFormat("###.###");

    @Override
    public String toString() {
        return "Capacity = " + this.getCapacity() + ", Life Range = " + this.getLifeRange() + ", Engine Efficiency = " + this.getEngineEfficiency() + ", Approximate Cost = " + this.getApproximateCost() + "mil USD";
    }
}
