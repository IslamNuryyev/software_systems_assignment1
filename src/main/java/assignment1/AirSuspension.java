package assignment1;

/**
 * AirSuspension is a concrete decorator class extending the FeaturesDecorator class.
 * @authors Islam Nuryyev, Chris Lammers
 */
public class AirSuspension extends FeaturesDecorator {
    /**
     * Constructor of AirSuspension.
     * It calls super on decoratedTesla object to refer an instance 
     * of parent class - FeaturesDecorator.
     * We refer to FeaturesDecorator in order to add new functionality
     * @param decoratedTesla instance of Tesla class
     */
    public AirSuspension(Tesla decoratedTesla) {
        super(decoratedTesla);
    }

    
    /** 
     * @return String
     */
    //new functionality
    private String airSuspension() {
        return "Air suspension";
    }

    //Now we use the concrete decorator class created to decorate interface objects.
    /** 
     * this method retuns all features of a car
     * @return String, features
     */
    @Override
    public String carFeatures() {
        return decoratedTesla.carFeatures() + ", " + airSuspension();
    }

    
   /** 
     * this method return the total cost of a car including the cost of features
     * @return Integer, cost of a car
     */
    @Override
    public Integer cost() {
        return decoratedTesla.cost() + 500;
    }
}
