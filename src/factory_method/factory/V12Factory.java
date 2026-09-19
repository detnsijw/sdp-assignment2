package factory_method.factory;

import factory_method.product.Supercar;
import factory_method.product.V12Supercar;

public class V12Factory extends SupercarFactory {
    @Override
    public Supercar createSupercar() {
        return new V12Supercar();
    }
}
