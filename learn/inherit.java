class sColor{
    public void color (){
        System.out.print("color is red");
    }
}

class circle extends sColor{
    public void area(int r){
        System.out.print("the area is ");
        System.out.print(3.14*r*r);
    }
}

class out extends circle {
    public void outof(int r){
        System.out.print("the circle is out of : ");
        System.out.print((2*r)*(2*r));
        System.out.print("non circle part is : ");
        System.out.print((2*r)*(2*r)-(3.14*r*r));
    }
}


public class inherit {
    public static void main(String args[]){
        out o = new out();
        o.area(5);
        o.outof(5);
        o.color();
        System.out.println();
    }
}
