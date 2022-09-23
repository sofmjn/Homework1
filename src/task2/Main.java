package task2;

public class Main { static Vector[] massiv(int n)
{
    if(n<0) n=0;
    Vector[] mas=new Vector[n];
    for(int i=0;i<n;i++)
        mas[i]=new Vector();
    return mas;
}
    public static void main(String[] args) {
        Vector vec=new Vector(1,0,0);
        vec.display();
        System.out.println(vec.len());

        Vector vec2=new Vector(-1,0,0);
        System.out.println(vec.scalar(vec2));

        (vec.vectorial(vec2)).display();

        System.out.println(vec.anglWith(vec2));

        (vec.summ(vec2)).display();
        (vec.diff(vec2)).display();

        int n=3;
        Vector[] ma=massiv(n); // произвольный вектор
        for(int i=0;i<n;i++)
            ma[i].display();
    }
}

class Vector{
    double x,y,z;
    Vector(double xNew, double yNew, double zNew){
        x=xNew; y=yNew; z=zNew;
    }
    Vector(){
        x=Math.random()*20-10;
        y=Math.random()*20-10;
        z=Math.random()*20-10;
    } //создает вектор координаты от -10 до 10
    double len() //длина вектора
    {
        return Math.sqrt(x*x+y*y+z*z);
    }
    double scalar(Vector two) //скаляр, передается какой-то второй вектор
    {
        return x*two.x+y*two.y+z*two.z;
    }
    Vector vectorial(Vector two)
    {
        Vector result=new Vector(y*two.z-z*two.y, z*two.x-x*two.z, x*two.x-y*two.x);
        return result; //создается новый вектор, чтобы не изменять координаты старого
    }
    double anglWith(Vector two)
    {
        return(scalar(two)/(len()*two.len()));
    }
    Vector summ(Vector two)
    {
        Vector result=new Vector(x+two.x, y+two.y, z+two.z);
        return result;
    }
    Vector diff(Vector two)
    {
        Vector result=new Vector(x-two.x, y-two.y, z-two.z);
        return result;
    }
    void display() //метод для удобства отображения координат
    {
        System.out.print(x);
        System.out.print(' ');
        System.out.print(y);
        System.out.print(' ');
        System.out.println(z);
    }
}

