package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Test {
    public void test(int a){
        System.out.println("111");
    }
    public int test(){
        System.out.println("111");
        return 1;



    }

    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"66");
        map.put(20,"sss");
        map.put(4,"ggg");
        System.out.println(map);

    }
}
