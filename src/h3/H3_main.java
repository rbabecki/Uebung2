package h3;

public class H3_main {
    public static void main(String[] args){
        int i = 140;
        int j = 150;
        int k = -10;
        boolean a = i > j;
        boolean b = i > 200;
        boolean c = j > 100;
        if (a == true && b == false && c == false) {
            k = 1;
        }
        if (a == true && b == true && c == false) {
            k = 2;
        }
        if (a == true && b == true && c == true) {
            k = 3;
        }
        if (a == false && b == false && c == false) {
            k = 4;
        }
        System.out.println(k);
        }
    }
