package part_a_factory_method.factory;

import part_a_factory_method.product.ElectricSupercar;
import part_a_factory_method.product.Supercar;

public class ElectricFactory extends SupercarFactory {
    @Override
    public Supercar createSupercar() {
        return new ElectricSupercar();
    }
}
