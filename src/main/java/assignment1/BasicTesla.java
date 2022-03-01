package assignment1;

/**
 * This Concrete class implements Tesla interface and 
 * all the required methods of that interface
 * @authors Islam Nuryyev, Chris Lammers
 */
public class BasicTesla implements Tesla {
    /** 
     * this method represents one of the features of the car
     * this is an existing functionality in decorator design pattern
     * @return String, feature
     */
    @Override
    public String parkingSensors() {
        return "Parking Sensors";
    }

    
    /** 
     * this method represents one of the features of the car
     * this is an existing functionality in decorator design pattern
     * @return String, feature
     */
    @Override
    public String superchargers() {
        return "Superchargers";
    }

    
    /** 
     * this method represents one of the features of the car
     * this is an existing functionality in decorator design pattern
     * @return String, feature
     */
    @Override
    public String app() {
        return "The app";
    }

    
    /** 
     * this method represents one of the features of the car
     * this is an existing functionality in decorator design pattern
     * @return String, feature
     */
    @Override
    public String touchscreen() {
        return "Touchscreen";
    }

    
    /** 
     * this method retuns all features of a car
     * @return String, features
     */
    @Override
    public String carFeatures() {
        return "Features: " + parkingSensors() + ", " + superchargers() + ", " + app() + ", " + touchscreen();
    }

    
    /** 
     * this method return the total cost of a car including the cost of features
     * @return Integer, cost of a car
     */
    @Override
    public Integer cost() {
        return 20000;
    }
}
