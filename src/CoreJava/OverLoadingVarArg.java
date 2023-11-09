package CoreJava;

public class OverLoadingVarArg {
    public static void main(String args[])
    {
        OverLoadingVarArg obj = new OverLoadingVarArg();
        obj.add(2,9);
    }
//    public void add(int... var,double a)
//    {
//
//    }
    public void add(double d, int a)
    {
        System.out.println("d, int");
    }

//    public void add(int d, double a)
//    {
//        System.out.println("d, int");
//    }
    public void add(double d, double a)
    {
        System.out.println("d, d");

    }

}
