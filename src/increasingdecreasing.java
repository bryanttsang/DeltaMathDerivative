public class increasingdecreasing
{
    public static void main(String args[])
    {
        int d = 1;

        double c1 = (double) -1;
        double p1 = (double) 4;

        double c2 = (double) -8;
        double p2 = (double) 3;

        double c3 = (double) 0;
        double p3 = (double) 0;

        double c4 = (double) 0;
        double p4 = (double) 0;

        double c5 = (double) 0;
        double p5 = (double) 0;

        for (int i = 0; i < d; i++)
        {
            c1 = c1 * p1;
            p1 = p1 - 1;
            c2 = c2 * p2;
            p2 = p2 - 1;
            c3 = c3 * p3;
            p3 = p3 - 1;
            c4 = c4 * p4;
            p4 = p4 - 1;
            c5 = c5 * p5;
            p5 = p5 - 1;
        }

        int c11 = (int) Math.round(c1);
        int c22 = (int) Math.round(c2);
        int c33 = (int) Math.round(c3);
        int c44 = (int) Math.round(c4);
        int c55 = (int) Math.round(c5);
        int p11 = (int) Math.round(p1);
        int p22 = (int) Math.round(p2);
        int p33 = (int) Math.round(p3);
        int p44 = (int) Math.round(p4);
        int p55 = (int) Math.round(p5);

        String c111 = Integer.toString(c11) + "x^";
        String c222 = Integer.toString(c22) + "x^";
        String c333 = Integer.toString(c33) + "x^";
        String c444 = Integer.toString(c44) + "x^";
        String c555 = Integer.toString(c55) + "x^";
        String p111 = Integer.toString(p11) + " ";
        String p222 = Integer.toString(p22) + " ";
        String p333 = Integer.toString(p33) + " ";
        String p444 = Integer.toString(p44) + " ";
        String p555 = Integer.toString(p55) + " ";

        if (c11 == 0) {c111 = ""; p111 = "";}
        if (c22 == 0) {c222 = ""; p222 = "";}
        if (c33 == 0) {c333 = ""; p333 = "";}
        if (c44 == 0) {c444 = ""; p444 = "";}
        if (c55 == 0) {c555 = ""; p555 = "";}

        String n1 = c111 + p111;
        String n2 = c222 + p222;
        String n3 = c333 + p333;
        String n4 = c444 + p444;
        String n5 = c555 + p555;

        System.out.println(n1 + n2 + n3 + n4 + n5);
    }
}