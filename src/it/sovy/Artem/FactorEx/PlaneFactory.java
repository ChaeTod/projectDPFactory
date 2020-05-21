package it.sovy.Artem.FactorEx;

public class PlaneFactory {
    static Configuration getComputer(String planeType, String capacity, String lifeRange, String engineEfficiency) {
        if ("CA".equalsIgnoreCase(planeType))
            return new CessnaPlane(capacity, lifeRange, engineEfficiency);
        else if ("CP".equalsIgnoreCase(planeType))
            return new C17CargoPlane(capacity, lifeRange, engineEfficiency);
        else if ("MFP".equalsIgnoreCase(planeType))
            return new F15E(capacity, lifeRange, engineEfficiency);
        return null;
    }
}
