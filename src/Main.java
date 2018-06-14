import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String rownanie = "5x^32+2x^22+4x-3";
        Pattern pattern = Pattern.compile("([0-9])+([x])([Z-a])([0-9])+");
        Pattern pattern2 = Pattern.compile("[+|-]([0-9])[x]");
        Pattern pattern3 = Pattern.compile("[+|-]([0-9])");
        Matcher mat = pattern.matcher(rownanie);
        int start =0, end =0;
        while(mat.find()) {
             start = mat.start();
             end = mat.end();
        }
       // while(mat.find()) System.out.println("znaleziono pod indeksem " + mat.start() + " " + mat.end());
        System.out.println(rownanie.substring(start, end));
        rownanie = rownanie.substring(end);
        mat= pattern2.matcher(rownanie);
         start =0; end =0;
        while(mat.find()) {
            start = mat.start();
            end = mat.end();
        }
        System.out.println(rownanie.substring(start, end));
        rownanie = rownanie.substring(end);

        System.out.println(rownanie);


      //  List<MyC> list = new ArrayList<>();
        //rownanie = rownanie.("([0-9])+([x])([Z-a])([0-9])+", "zamienonio");
      //  System.out.println(rownanie);
        //findX(list, rownanie);
        //System.out.println((int)'^');
    }

    private static void findX(List list, String text){
        char z= '+';
        int a;
        char b;
        char c;
        int d;

//        for(int i = 0; i<text.length(); i++){
//            char tmp = text.charAt(i);
//            if(tmp == '-') z='-';
//            if(tmp<='9' && tmp >= '0')
//                if(a!= 1)
//                a = Integer.valueOf(String.valueOf(tmp));
//
//        }



    }
}





class MyC {
    private int x;
    private int a;

    public MyC(int x, int a) {
        this.x = x;
        this.a = a;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
