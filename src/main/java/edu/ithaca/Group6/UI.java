package edu.ithaca.Group6;

public interface UI {

    /**
     * A function that runs a demo of the features completed for Sprint 2
     */
    public void sprintThreeDemo();

    /**
     * Determines if the user input a valid yes or no answer
     * @param userInput String of what the user responds
     * @return True if valid yes/no, False if invalid
     */
    public boolean checkYesOrNo(String userInput);

    /**
     * Determines if the user input is a valid double
     * @param userInput String of what the user inputs
     * @return True if a valid double, False if invalid entry
     */
    public boolean checkValidDouble(String userInput);

    /**
     * Determines if the user input is a valid integer
     * @param userInput String of what the user inputs
     * @return True if a valid integer, False if invalid entry
     */
    public boolean checkValidInt(String userInput);

    /**
     * Displays a list of available MaterialByArea objects as a string
     * Includes names and cost per square foot
     * @Return String containing MaterialByArea object data
     */
    public String displayMaterialsByArea();

    /**
     * Displays a list of available door (MaterialByUnit objects as a string
     * Includes names, cost per unit, and dimensions
     * @Return String containing door data
     */
    public String displayDoors();

    /**
     * Displays a list of available window (MaterialByUnit objects as a string
     * Includes names, cost per unit, and dimensions
     * @Return String containing window data
     */
    public String displayWindows();
}
