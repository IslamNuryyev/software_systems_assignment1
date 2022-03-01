package assignment1;

// Decorator design patterns create decorator classes, which wrap the original class and supply additional functionality by keeping the class methods’ signature unchanged.
// Decorator design patterns are most frequently used for applying single responsibility principles since we divide the functionality into classes with unique areas of concern.
// The decorator design pattern is structurally almost like the chain of responsibility pattern.

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
