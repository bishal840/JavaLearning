package CoreJava;

public class MethodInMethod {

    public void getData()
    {
        System.out.println("HIIIIIII:"+a);

        a=50;
        System.out.println("HIIIIIII:"+a);
    }

    public void setData()
    {
        System.out.println("HEYY:"+a);
        System.out.println(b);
        a=100;
        disData();
        System.out.println("HEYY:"+a);
        getData();
    }

    int a =10;
    static int  b =20;
    public static void main(String args[])
    {
        System.out.println("HELLO");
        MethodInMethod meth = new MethodInMethod();
        meth.setData();
//
//        Home h = new Home();
//        h.myHome(10);
//        System.out.println(a);
//        getData();

        absClass abs = new absClassChild();


    }

    public static void disData()
    {
        System.out.println("DISP");
    }
}
