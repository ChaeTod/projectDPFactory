package it.sovy.Artem.FactorEx;

public class Main {
    public static void main(String[] args) {
        Configuration cessna = PlaneFactory.getComputer("CA", "Crew - 1", "1.185 km", "1.7 kN");
        Configuration c17 = PlaneFactory.getComputer("CP", "Crew - 3", "4.480 km", "180 kN");
        Configuration F15E = PlaneFactory.getComputer("MFP", "Crew - 1", "1.965 km", "64.9 kN");

        System.out.println("Cessna 172 Civil Aviation Configuration -- " + cessna);
        System.out.println("C17 Cargo Plane Configuration -- " + c17);
        System.out.println("F15 Super Eagle Multifunctional Fighter Configuration -- " + F15E);
    }
}
