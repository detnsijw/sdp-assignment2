package abstract_factory.products;

public class ElectricEngine implements Engine {
    private static final String TECH = "High-Voltage Quad-Motor Electric";

    @Override
    public String getTechnology() { return TECH; }

    @Override
    public void testPower(int rpm) {
        if (rpm < 0 || rpm > 20000) {
            throw new IllegalArgumentException("RPM for Electric Engine must be between 0 and 20000.");
        }
        System.out.println("Electric Engine delivers instant torque at " + rpm + " RPM!");
    }
}
