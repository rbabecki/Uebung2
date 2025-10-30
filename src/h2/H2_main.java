package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        boolean a = i < j;
        boolean b = j < k;
        boolean c = k < i;
        int min, max;
        if (a == true && b == false){
            max = j;
            if (c == true){
                min = k;
            }
            else{
                min = i;
            }
        }
        if (a == false && c == true);{
            max = i;
            if (b == true){
                min = j;}
            else{
                min = k;
            }}
        if (c == false && b == true){
            max = k;
            if (a == true){
                min = i;
            }
            else{
                min = j;
            }
        }
        System.out.println("Die größte Zahl ist: "+max);
        System.out.println("Die kleinste Zahl ist: "+min);
    }}