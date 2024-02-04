public class A {
    int x=10;
    private int y=15;
    public int z=20;
    protected int w=25;
    public static void main(String[] args) {
        A ob=new A();
        //Within the class default ,public ,private  and protected are accessible
        System.err.println(ob.x); 
        System.err.println(ob.y);
        System.err.println(ob.z);
        System.err.println(ob.w);
    }
}


public class B {
    public static void main(String[] args) {
        A ob1=new A();
    }
}

