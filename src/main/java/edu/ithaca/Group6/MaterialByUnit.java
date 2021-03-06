package edu.ithaca.Group6;

public interface MaterialByUnit {
    String materialName = "";
    double costPerUnit = 0.00;
    double length = 0.0;
    double width = 0.0;
    double height = 0.0;
    int orientation = 0;
    double[] startPoint = new double[3];

    public String materialNameBuilder();
    public double costPerUnitBuilder();
    public double lengthBuilder();
    public double heightBuilder();

    public String getMaterialName();

    public double getCostPerUnit();

    public double getLength();

    public double getWidth();

    public double getHeight();

    /**
     * For showing the user what materials are available
     * @return String of the form:
     * MaterialName + ": $" + amount per unit
     * Rounds up to the nearest cent
     */
    public String toString();

    /**
     * Get the orientation
     * The orientation can either be horizontal (0) or vertical (1)
     * @return orientation (0 or 1)
     */
    public int getOrientation();

    /**
     * set the orientation of the object
     * @param newVal
     * @post orientation becomes newVal
     */
    public void setOrientation(int newVal);

    /**
     * Get the start point
     * The start point of a unit is an array of 3 values representing a position in a 3D space
     * [x, y, z]
     * @return 3D array representing start point
     */
    public double[] getStartPoint();

    /**
     * set the start point of the object
     * @param newX
     * @param newY
     * @param newZ
     * @post start point becomes [newX, newY, newZ]
     */
    public void setStartPoint(double newX, double newY, double newZ);


    /**
     * use the start coordinates to calculate the position of the end coordinate
     * @return an array with 3 values representing coordinates in a 3d space
     */
    public double[] getEndPoint();
}
