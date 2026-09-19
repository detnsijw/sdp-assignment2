package abstract_factory.factory;

import abstract_factory.products.BodyKit;
import abstract_factory.products.Engine;
import abstract_factory.products.TwinTurboV8Engine;
import abstract_factory.products.WidebodyAluminumKit;

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
