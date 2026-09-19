package part_b_abstract_factory.products;

public class TwinTurboV8Engine implements Engine {
    private static final String TECH = "Twin-Turbocharged 4.0L V8";

    @Override
    public String getTechnology() { return TECH; }

    @Override
    public void testPower(int rpm) {
        if (rpm < 0 || rpm > 9000) {
            throw new IllegalArgumentException("RPM for Twin-Turbo V8 must be between 0 and 9000.");
        }
        System.out.println("Twin-Turbo V8 roars at " + rpm + " RPM with full boost pressure!");
    }
}
