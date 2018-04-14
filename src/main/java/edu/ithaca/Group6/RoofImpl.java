package edu.ithaca.Group6;

public class RoofImpl implements Roof {
    private double length;
    private double width;
    private double height;

    private MaterialByArea material;
    private double[] firstCornerCoordinates = new double[3];
    private double[] secondCornerCoordinates = new double[3];

    public RoofImpl(){
        this.length = 0;
        this.width = 0;
        this.height = 0;
        firstCornerCoordinates[0] = 0;//x
        firstCornerCoordinates[1] = 0;//y
        firstCornerCoordinates[2] = 0;//z

        secondCornerCoordinates[0] = 0;//x
        secondCornerCoordinates[1] = 0;//y
        secondCornerCoordinates[2] = 0;//z
    }
    public RoofImpl(double lengthIn, double widthIn, double roofThickness, double startHeight){
        this.length = lengthIn;
        this.width = widthIn;
        this.height = roofThickness;

        firstCornerCoordinates[0] = 0;//x
        firstCornerCoordinates[1] = 0;//y
        firstCornerCoordinates[2] = startHeight;//z

        secondCornerCoordinates[0] = widthIn;//x
        secondCornerCoordinates[1] = lengthIn;//y
        secondCornerCoordinates[2] = startHeight + roofThickness;//z
    }


    @Override
    public boolean setFirstCornerCoordinates(double x, double y, double z) {
        double[] coordArray = {x,y,z};
        return setFirstCornerCoordinates(coordArray);
    }

    @Override
    public boolean setFirstCornerCoordinates(double[] xyzCoord) {
        if(xyzCoord[2] < 0){
            throw new IndexOutOfBoundsException("Cannot input negative height!");
        }
        try{firstCornerCoordinates = xyzCoord;
        return true;}
        catch(Exception e){
            return false;
        }
    }

    @Override
    public double[] getFirstCornerCoordinates() {
        return firstCornerCoordinates;
    }

    @Override
    public boolean setSecondCornerCoordinates(double x, double y, double z) {
        double[] coordArray = {x,y,z};
        return setSecondCornerCoordinates(coordArray);
    }

    @Override
    public boolean setSecondCornerCoordinates(double[] xyzCoord) {
        if(xyzCoord[2] < 0){
            throw new IndexOutOfBoundsException("Cannot input negative height!");
        }
        try{secondCornerCoordinates = xyzCoord;
            return true;}
        catch(Exception e){
            return false;
        }
    }

    @Override
    public double[] getSecondCornerCoordinates() {
        return secondCornerCoordinates;
    }

    @Override
    public boolean setHeight(double height) {
        return false;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public boolean setLength(double length) {
        return false;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public boolean setMaterial(MaterialByArea wallMaterial) {
        return false;
    }

    @Override
    public MaterialByArea getMaterial() {
        return null;
    }
}