package part_b_abstract_factory.factory;

import part_b_abstract_factory.products.BodyKit;
import part_b_abstract_factory.products.Engine;

public interface CarPackageFactory {
    Engine createEngine();
    BodyKit createBodyKit();
}
