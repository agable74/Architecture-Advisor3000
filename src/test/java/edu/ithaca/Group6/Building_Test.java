package edu.ithaca.Group6;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Building_Test {
    private MaterialByArea newMaterial1;
    private MaterialByArea newMaterial2;

    @BeforeEach
    void setup() {
        newMaterial1 = new ClayBrick();
        newMaterial2 = new Wood();
    }

    @Test
    void constructorTest(){
        //test default constructor
        Building building1 = new BuildingImpl();
        //test length
        double length1 = building1.getLength();
        assertEquals(0.0, length1, "Innacurate length - Default Constructor");
        //test width
        double width1 = building1.getWidth();
        assertEquals(0.0, width1, "Innacurate width - Default Constructor");
        //test height
        double height1 = building1.getHeight();
        assertEquals(0.0, height1, "Innacurate height - Default Constructor");

        Building building2 = new BuildingImpl(80.0, 50.0, 10.0);
        //test length
        double length2 = building2.getLength();
        assertEquals(80.0, length2, "Innacurate length");
        //test width
        double width2 = building2.getWidth();
        assertEquals(50.0, width2, "Innacurate width");
        //test height
        double height2 = building2.getHeight();
        assertEquals(10.0, height2, "Innacurate height");
    }

    @Test
    void settersTest(){
        Building building1 = new BuildingImpl();
        //test length setter
        building1.setLength(50.0);
        assertEquals(50.0, building1.getLength(), "Length not set");
        //test width setter
        building1.setWidth(50.0);
        assertEquals(50.0, building1.getWidth(), "Width not set");
        //test height setter
        building1.setHeight(50.0);
        assertEquals(50.0, building1.getHeight(), "Height not set");
    }

    @Test
    void dimensionTest() {
        Building building1 = new BuildingImpl(60.0, 60.0, 12.0);
        //test square footage calculation
        double sqftg1 = building1.getSquareFootage();
        assertEquals(3600.0, sqftg1, "Innacurate calculation of square footage");
        //test perimeter calculation
        double perim1 = building1.getPerimeter();
        assertEquals(240.0, perim1, "Innaccurate calculation of perimeter");
    }

    /**@Test
    void calcTotalCostTest(){
        Building building1 = new BuildingImpl(60.0, 60.0, 12.0);
        double totalCost1 = building1.calcTotalCost();
        assertEquals(115.2, totalCost1, "Innacurate calculation of total cost");
    }*/

    @Test
    void addWallTest(){
        //Adding a wall
        BuildingImpl building = new BuildingImpl(50.0, 50.0, 50.0);
        double[] startPoint = new double[]{0.0, 0.0, 0.0};
        Wood wood = new Wood();
        InternalWall wall1 = new InternalWall(1.0, 1.0, 1.0, startPoint, wood);
        boolean added = building.addWall(wall1.getLength(), wall1.getThickness(), wall1.getHeight(), wall1.getBottomLeftOutsideCoordinates(), wall1.getMaterial());
        double[] endPoint = new double[]{1.0, 1.0, 1.0};
        assertEquals(1.0, wall1.getLength(), "Wall length not properly set when adding");
        assertEquals(1.0, wall1.getThickness(), "Wall width not properly set when adding");
        assertEquals(1.0, wall1.getHeight(), "Wall height not properly set when adding");
        assertArrayEquals(startPoint, wall1.getBottomLeftOutsideCoordinates(), "Wall start point not properly set when adding");
        assertEquals(wood, wall1.getMaterial(), "Wall material not properly set when adding");
        assertArrayEquals(endPoint, building.walls[0].getTopRightInsideCoordinates(), "Wall end point not properly set when adding");
        assertTrue(added, "Wall not added");

        //InternalWall wall2 = new InternalWall()
    }
}
