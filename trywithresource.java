import java.io.*;
import java.util.*;
public class trywithresource {
    static FileInputStream fi;
    static Scanner sc;

    static void divide() throws Exception {
        fi = new FileInputStream("Address");
        
        sc = new Scanner(fi);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a/b);

        fi.close();
        sc.close();
    }
    public static void main(String[] args) throws Exception {
        try
        {
            divide();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
