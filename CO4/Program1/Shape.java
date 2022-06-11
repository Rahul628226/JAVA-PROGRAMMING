import Graphics.Area;
public class Shape{
    public static void main(String []args){
        Area testObj = new Area();
        testObj.rectangleArea(1,2);
        testObj.circleArea(10);
        testObj.squareArea(10);
        testObj.triangleArea(10,2);
    }
}
