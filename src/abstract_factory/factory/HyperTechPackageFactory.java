package abstract_factory.factory;

import abstract_factory.products.AeroCarbonBodyKit;
import abstract_factory.products.BodyKit;
import abstract_factory.products.ElectricEngine;
import abstract_factory.products.Engine;

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
