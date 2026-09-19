package part_a_factory_method.product;

public class V12Supercar implements Supercar {
    private boolean isAssembled = false;

    @Override
    public void assemble() {
        this.isAssembled = true;
    }

    @Override
    public String getSpecs() {
        return "V12 Gas Supercar: " + (isAssembled ? "READY (800 HP, Naturally Aspirated)" : "IN ASSEMBLY");
    }
}
