package factory_method.factory;

import factory_method.product.ElectricSupercar;
import factory_method.product.Supercar;

public class ElectricFactory extends SupercarFactory {
    @Override
    public Supercar createSupercar() {
        return new ElectricSupercar();
    }
}
