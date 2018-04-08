package edu.ithaca.Group6;

public abstract class MaterialByUnitImpl implements MaterialByUnit{
    private String materialName = "";
    private double costPerUnit = 0.00;
    private double length = 0.0;
    private double width = 0.0;
    private double height = 0.0;
    private int orientation = 0;
    private double[] startPoint = new double[3];

    public abstract String materialNameBuilder();
    public abstract double costPerUnitBuilder();
    public abstract double lengthBuilder();
    public abstract double widthBuilder();
    public abstract double heightBuilder();
    public abstract int orientationBuilder();
    public abstract double[] startPointBuilder();

    public MaterialByUnitImpl(){
        this.materialName = materialNameBuilder();
        this.costPerUnit = costPerUnitBuilder();
        this.length = lengthBuilder();
        this.width = widthBuilder();
        this.height = heightBuilder();
        this.orientation = orientationBuilder();
        this.startPoint = startPointBuilder();
    }

    @Override
    public String getMaterialName() { return this.materialName; }

    @Override
    public double getCostPerUnit() { return this.costPerUnit; }

    @Override
    public double getLength() { return this.length; }

    @Override
    public double getWidth() { return this.width; }

    @Override
    public double getHeight() { return this.height; }

    @Override
    public String toString() {
        String costStr = String.format("%.2f",this.costPerUnit);
        return this.materialName + ", $" + costStr + ", Length: " + this.length + "ft, Width: " + this.width + "ft, Height: " + this.height + "ft";
    }

    @Override
    public int getOrientation(){ return this.orientation; }

    @Override
    public void setOrientation(int newVal){
        if(newVal != 0 && newVal != 1) {
            throw new IndexOutOfBoundsException("Must be either 0 or 1");
        }
        else{
            this.orientation = newVal;
        }
    }

    @Override
    public double[] getStartPoint(){
        return this.startPoint; }

    @Override
    public void setStartPoint(double newX, double newY, double newZ){
        if (newX < 0) {
            throw new IndexOutOfBoundsException("Cannot have a negative x value");
        }
        else if (newY < 0) {
            throw new IndexOutOfBoundsException("Cannot have a negative y value");
        }
        else if (newZ < 0) {
            throw new IndexOutOfBoundsException("Cannot have a negative z value");
        }
        else{
            this.startPoint[0] = newX;
            this.startPoint[1] = newY;
            this.startPoint[2] = newZ;
        }
    }

    @Override
    public double[] getEndPoint(){
        double[] defPos = new double[]{0, 0, 0};
        return defPos;
    }
}

class Door extends MaterialByUnitImpl {
    @Override
    public String materialNameBuilder() {
        return "Door";
    }

    @Override
    public double costPerUnitBuilder() { return 900.00; }

    @Override
    public double lengthBuilder() { return 3.0; }

    @Override
    public double widthBuilder() { return .15; }

    @Override
    public double heightBuilder() { return 6.67; }

    @Override
    public int orientationBuilder() { return 0; }

    @Override
    public double[] startPointBuilder(){
        double[] defPos = new double[]{0, 0, 0};
        return defPos;
    }
}
