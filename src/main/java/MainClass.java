public class MainClass {
    public static void main(String args[]) throws Exception {
        CustomClassLoader ccl = new CustomClassLoader(MainClass.class.getClassLoader());
        System.out.println("ffff ->" + ccl.getClass().getClassLoader());
        Class<?> clas = ccl.loadClass("Test");
        System.err.println(clas.getClassLoader());
        System.err.println(clas.getCanonicalName());
    }
}
