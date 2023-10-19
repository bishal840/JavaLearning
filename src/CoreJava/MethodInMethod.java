package CoreJava;

public class MethodInMethod {

    public void getData()
    {
        System.out.println("HIIIIIII");
    }

    public static void main(String args[])
    {
        System.out.println("HELLO");
        MethodInMethod meth = new MethodInMethod();
        meth.getData();

        Home h = new Home();
        h.myHome(10);


    }
}
