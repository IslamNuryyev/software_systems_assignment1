package assignment1;

/**
 * FeaturesDecorator is an abstract decorator class implementing the Tesla interface
 * FeaturesDecorator decorator classes wraps the original class 
 * and supplies additional functionality by keeping the class methods’ signature unchanged.
 * @authors Islam Nuryyev, Chris Lammers
 */
abstract class FeaturesDecorator implements Tesla {
    protected Tesla decoratedTesla; //protected variable

    /**
     * Constructor of FeaturesDecorator class
     * @param decoratedTesla instance of Tesla class
     */
    public FeaturesDecorator(Tesla decoratedTesla) {
        this.decoratedTesla = decoratedTesla;
    }

    /**
     * Every class that is going to be extended from this absctract decorator
     * is going to have access to these methods and we will be able to an existing
     * object without altering its structure
     */

    /** 
     * @return String
     */
    @Override
    public String parkingSensors() {
        return decoratedTesla.parkingSensors();
    }

    
    /** 
     * @return String
     */
    @Override
    public String superchargers() {
        return decoratedTesla.superchargers();
    }

    
    /** 
     * @return String
     */
    @Override
    public String app() {
        return decoratedTesla.app();
    }

    
    /** 
     * @return String
     */
    @Override
    public String touchscreen() {
        return decoratedTesla.touchscreen();
    }

    
    /** 
     * this method retuns all features of a car
     * @return String, features
     */
    @Override
    public String carFeatures() {
        return decoratedTesla.carFeatures();
    }  
    
    
    /** 
     * this method return the total cost of a car including the cost of features
     * @return Integer, cost of a car
     */
    @Override
    public Integer cost() {
        return decoratedTesla.cost();
    }
}
