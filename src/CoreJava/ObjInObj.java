package CoreJava;

public class ObjInObj {

    public static void main(String args[])
    {
        ObjInObj obj = new ObjInObj();
        ObjInObj obj1 = obj.returnObj();
        obj1.add(10,20);
        obj.add(30,40);
    }
    int a =10;
    public ObjInObj returnObj()
    {

        return new ObjInObj();
    }

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}
