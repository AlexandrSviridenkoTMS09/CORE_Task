package Task1;

public class MainClass {
    public static void main(String args[]) throws Exception {
        CustomClassLoader ccl = new CustomClassLoader(MainClass.class.getClassLoader());
        System.out.println("ffff ->" + ccl.getClass().getClassLoader());
        Class<?> clas = ccl.loadClass("Task1.Test");
        System.err.println(clas.getClassLoader());
        System.err.println(clas.getCanonicalName());
    }
}
