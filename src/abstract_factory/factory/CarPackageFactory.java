package abstract_factory.factory;

import abstract_factory.products.BodyKit;
import abstract_factory.products.Engine;

public interface CarPackageFactory {
    Engine createEngine();
    BodyKit createBodyKit();
}
