package abstract_factory.products;

public class AeroCarbonBodyKit implements BodyKit {
    private static final String MATERIAL = "Ultra-Light Carbon Fiber";

    @Override
    public String getMaterial() { return MATERIAL; }

    @Override
    public void testAerodynamics(int speedKmH) {
        System.out.println("Carbon BodyKit produces 600kg downforce at " + speedKmH + " km/h.");
    }
}
