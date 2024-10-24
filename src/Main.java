import java.util.Arrays;

public class Main {

    static {
        System.loadLibrary("libutpjnicpart");
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.processDouble(4));
        System.out.println(main.processInt(5));
        System.out.println(main.processString("Hey there"));

        int[] arr = {1, 2, 3, 4, 5};
        int[] modArr = main.processArray(arr);
        System.out.println(Arrays.toString(modArr));
    }

    public native int processInt(int iVal);

    public native double processDouble(double dVal);

    public native String processString(String str);

    public native int[] processArray(int[] arr);
}
