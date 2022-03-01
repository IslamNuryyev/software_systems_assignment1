package assignment1;

/**
 * This demo class is a main class to run our program
 * @authors Islam Nuryyev, Chris Lammers
 */
public class demo {
    public static void main(String[] args) {
        Tesla tesla = new BasicTesla();
        System.out.println("Tesla Base Model");
        System.out.println(tesla.carFeatures());
        System.out.println("Cost: $" + tesla.cost());
        System.out.println("\n");

        FeaturesDecorator tesla2 = new AutopilotDecorator(tesla);
        FeaturesDecorator tesla3 = new AirSuspension(tesla2);
        FeaturesDecorator tesla4 = new SeatsHeating(tesla3);

        System.out.println("Upgraded Tesla");
        System.out.println(tesla4.carFeatures());
        System.out.println("Cost: $" + tesla4.cost());
    }
}
