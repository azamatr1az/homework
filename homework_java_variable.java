package casting;

public class homework_java_variable {
    public static void main(String[] args) {
        float fl = (float) Math.pow(Math.E, 5);
        float fl2 = 1.5f;
        byte bt = (byte) Math.log(2);
        short sh = (short) 14;
        int in = 1;
        double db2 = 1.5;




        float fl_result = fl + fl2;
        System.out.println(fl_result);

        int in_result = bt + sh;
        System.out.println(in_result);

        double db_result2 = in + db2;
        System.out.println(db_result2);

    }
}
