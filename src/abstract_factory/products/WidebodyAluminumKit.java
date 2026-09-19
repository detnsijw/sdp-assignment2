package abstract_factory.products;

public class WidebodyAluminumKit implements BodyKit {
    private static final String MATERIAL = "Reinforced Aluminum-Matrix Alloy";

    @Override
    public String getMaterial() { return MATERIAL; }

    @Override
    public void testAerodynamics(int speedKmH) {
        System.out.println("Widebody Aluminum Kit stabilizes chassis roll at " + speedKmH + " km/h.");
    }
}
