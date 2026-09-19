package part_b_abstract_factory.factory;

import part_b_abstract_factory.products.AeroCarbonBodyKit;
import part_b_abstract_factory.products.BodyKit;
import part_b_abstract_factory.products.ElectricEngine;
import part_b_abstract_factory.products.Engine;

public class HyperTechPackageFactory implements CarPackageFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public BodyKit createBodyKit() {
        return new AeroCarbonBodyKit();
    }
}
