package assignment1;

/**
 * This interface represents Tesla car
 * @authors Islam Nuryyev, Chris Lammers
 */
public interface Tesla {
    /**
     * abstract methods of an interface
     * existing functionalities in decorator design pattern
     */
    public String parkingSensors();
    public String superchargers();
    public String app();
    public String touchscreen();

    public String carFeatures();
    public Integer cost();
}
