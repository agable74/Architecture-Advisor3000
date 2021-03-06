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

    /**
     * Creates a dummy building for testing purposes
     */
    public void dummyBuilding();

    /**
     * Prompts user for input, and creates a new building based on user input values
     * @post add a new building to BuildingList
     */
    public void createBuilding();

    /**
     * Add an existing building to the building list
     * @param building
     * @post add building to BuildingList
     */
    public void addBuilding(Building building);

    /**
     * Prompts user for input, and creates a new wall based on user input values
     * @param idx
     * @post Adds wall to buildingList[idx]
     */
    public boolean addWall(int idx);

    /**
     * Prompts user for input, and adds a wall feature to a wall based on user input values
     * @param building
     */
    public void addWallFeature(Building building);

    /**
     * User chooses a wall from the building
     * Tells the user how many features are in the wall
     * User chooses which one to remove
     * @param building
     */
    public void removeWallFeature(Building building);

    /**
     * User can login as an architect or a builder
     * @post runs architectMain or buildingMain
     */
    public void login();

    /**
     * Displays architect functions
     */
    public void architectMain();

    /**
     * display building modification features
     * includes adding walls, adding features, removing features
     * @param idx
     * The functions operate on the building stored in the building array list at index idx
     */
    public void architectModify(int idx);

    /**
     * Displays builder functions
     */
    public void builderMain();

    /**
     * Similar functionality to wall feature implementation
     * @param building
     */
    public void addStairs(Building building);

    /**
     * determines if user input yes or user input no
     * @param input user input
     * @return true is yes, false if no
     */
    public boolean yesOrNo(String input);

}
