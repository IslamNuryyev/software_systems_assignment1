package assignment1;

/**
 * AutopilotDecorator is a concrete decorator class extending the FeaturesDecorator class
 * @authors Islam Nuryyev, Chris Lammers
 */
public class AutopilotDecorator extends FeaturesDecorator {
    /**
     * Constructor of AutopilotDecorator.
     * It calls super on decoratedTesla object to refer an instance 
     * of parent class - FeaturesDecorator.
     * We refer to FeaturesDecorator in order to add new functionality
     * @param decoratedTesla instance of Tesla class
     */
    public AutopilotDecorator(Tesla decoratedTesla) {
        super(decoratedTesla);
    }

    
    /** 
     * @return String
     */
    //new functionality
    private String autopilot() {
        return "Autopilot";
    }

    //Now we use the concrete decorator class created to decorate an interface object.
    /** 
     * this method retuns all features of a car
     * @return String, features
     */
    @Override
    public String carFeatures() {
        return decoratedTesla.carFeatures() + ", " + autopilot();
    }

    
    /** 
     * this method return the total cost of a car including the cost of features
     * @return Integer, cost of a car
     */
    @Override
    public Integer cost() {
        return decoratedTesla.cost() + 10000;
    }
}
