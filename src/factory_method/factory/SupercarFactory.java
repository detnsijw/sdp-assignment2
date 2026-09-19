package factory_method.factory;

import factory_method.product.Supercar;

public abstract class SupercarFactory {
    public abstract Supercar createSupercar();

    public Supercar deliverCar() {
        Supercar supercar = createSupercar();
        supercar.assemble();
        return supercar;
    }
}
