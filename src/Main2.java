import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        String a = "+5x^2";
        String b = "+4x";
        String c = "+2";
        System.out.println(doMath(2, a));
        System.out.println(doMath(2, b));
        System.out.println(doMath(2, c));
        List<String> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println(sumOfAll(list, 1));
        System.out.println(sumOfAll(list, 2));



    }

    private  static Point some(String t, boolean power){
        boolean minus = false;
        boolean second = false;
        if((t.charAt(0)=='-')){
            t=t.substring(1);
            minus = true;
        }else if(t.charAt(0)=='+'){
            t=t.substring(1);
        }
        char[] tab = t.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i < tab.length; i++ ){
            if(Character.isDigit(tab[i])){
                if(second){
                    sb2.append(tab[i]);
                }else{
                    sb.append(tab[i]);
                }

            }
            else second= true;
        }
        if(minus){
            sb.insert(0,'-');
        }
//        System.out.println(sb);
//        System.out.println(sb2);
        if(!power){
            return new Point( Integer.valueOf( sb.toString() ), 1) ;
        }
        return new Point(Integer.valueOf(sb.toString()), Integer.valueOf(sb2.toString()));

    }

    private static double multiply (Point p, int x){
        return p.getNumber()* Math.pow(x,p.getPower());

    }

    private static int noX(String a){
        if(a.charAt(0)=='-'){
            return -1*(Integer.valueOf(a.substring(1)));
        }
        else
            return Integer.valueOf(a);
    }



    private static double doMath(int x, String a){
        if(a.contains("x")){
            if(a.contains("x^"))
                return multiply(some(a, true), x);
            else
                return multiply(some(a,false), x);
        }
        else return noX(a);
    }

    private static  double sumOfAll(List<String> list, int x){
        double sum = 0;
        for(String s : list){
            sum+= doMath(x,s);
        }
        return sum;
    }
}
