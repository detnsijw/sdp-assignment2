package part_a_factory_method.product;

public class ElectricSupercar implements Supercar {
    private boolean isAssembled = false;

    @Override
    public void assemble() {
        this.isAssembled = true;
    }

    @Override
    public String getSpecs() {
        return "Electric Supercar: " + (isAssembled ? "READY (1020 HP, 0-100 km/h in 2.1s)" : "IN ASSEMBLY");
    }
}
