package part_a_factory_method.factory;

import part_a_factory_method.product.Supercar;

public abstract class SupercarFactory {
    public abstract Supercar createSupercar();

    public Supercar deliverCar() {
        Supercar supercar = createSupercar();
        supercar.assemble();
        return supercar;
    }
}
