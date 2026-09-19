package part_b_abstract_factory.factory;

import part_b_abstract_factory.products.BodyKit;
import part_b_abstract_factory.products.Engine;
import part_b_abstract_factory.products.TwinTurboV8Engine;
import part_b_abstract_factory.products.WidebodyAluminumKit;

public class TrackMotorsportFactory implements CarPackageFactory {
    @Override
    public Engine createEngine() {
        return new TwinTurboV8Engine();
    }

    @Override
    public BodyKit createBodyKit() {
        return new WidebodyAluminumKit();
    }
}
