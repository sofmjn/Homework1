package task22;

public class Main {
    public static void main(String[] args) {
        Box bx=new Box(1000);
        Pyramid pr=new Pyramid(100,3);
        System.out.print(bx.getVolume());
        System.out.print(" - ");
        System.out.print(pr.getVolume());
        System.out.print(" -> ");
        System.out.println(bx.add(pr));
        Cylinder cl=new Cylinder(1,5);
        System.out.print(bx.getVolume());
        System.out.print(" - ");
        System.out.print(cl.getVolume());
        System.out.print(" -> ");
        System.out.println(bx.add(cl));
        Ball bl=new Ball(5);
        System.out.print(bx.getVolume());
        System.out.print(" - ");
        System.out.print(bl.getVolume());
        System.out.print(" -> ");
        System.out.println(bx.add(bl));
    }
}
