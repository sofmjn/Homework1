package task22;

public class Shape {
    double volume;
    double getVolume()
    {
        return volume;
    }
} // в задаче на абстрактный класс по сути просто добавить abstract class к shape и SolidOfRevolution для которых не нужно экземпляра класса
class Box extends Shape{
    Box(double vol)
    {
        volume=vol;
    }
    Box()
    {
        volume=10*10*10;
    }
    boolean add(Shape addShape) //проверяет когда заокнчится место
    {
        if(volume-addShape.getVolume()>=0)
        {
            volume=volume-addShape.getVolume();
            return true;
        }
        else
            return false;
    }
}
class Pyramid extends Shape{
    double s,h;
    Pyramid(double sNew, double hNew)
    {
        s=sNew;
        h=hNew;
        volume=(s*h)/3;
    }
    Pyramid()
    {
        s=3;
        h=1;
        volume=(s*h)/3;
    }
}
class SolidOfRevolution extends Shape{
    double r;
    double getRadius()
    {
        return r;
    }
}
class Ball extends SolidOfRevolution{
    Ball(double radius)
    {
        r=radius;
        volume=(4*r*r*r*Math.PI)/3;
    }
}
class Cylinder extends SolidOfRevolution{
    double height;
    Cylinder(double radius, double h)
    {
        r=radius;
        height=h;
        volume=height*r*r*Math.PI;
    }
}
