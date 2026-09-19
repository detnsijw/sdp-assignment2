import part_b_abstract_factory.factory.CarPackageFactory;
import part_b_abstract_factory.factory.HyperTechPackageFactory;
import part_b_abstract_factory.factory.TrackMotorsportFactory;
import part_b_abstract_factory.products.BodyKit;
import part_b_abstract_factory.products.Engine;
import part_a_factory_method.factory.ElectricFactory;
import part_a_factory_method.factory.SupercarFactory;
import part_a_factory_method.factory.V12Factory;
import part_a_factory_method.product.Supercar;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PART A: FACTORY METHOD DEMO ===");

        SupercarFactory electricFactory = new ElectricFactory();
        Supercar electricCar = electricFactory.deliverCar();
        System.out.println(electricCar.getSpecs());

        SupercarFactory v12Factory = new V12Factory();
        Supercar v12Car = v12Factory.deliverCar();
        System.out.println(v12Car.getSpecs());

        System.out.println("\n=== PART B: ABSTRACT FACTORY DEMO ===");

        System.out.println("\n--- Assembling HyperTech Supercar Package ---");
        buildCustomSupercar(new HyperTechPackageFactory());

        System.out.println("\n--- Assembling TrackMotorsport Supercar Package ---");
        buildCustomSupercar(new TrackMotorsportFactory());
    }

    // Клиент работает ИСКЛЮЧИТЕЛЬНО через абстрактные интерфейсы!
    private static void buildCustomSupercar(CarPackageFactory factory) {
        Engine engine = factory.createEngine();
        BodyKit bodyKit = factory.createBodyKit();

        System.out.println("Engine Tech: " + engine.getTechnology());
        engine.testPower(7500);

        System.out.println("Body Material: " + bodyKit.getMaterial());
        bodyKit.testAerodynamics(280);
    }
}