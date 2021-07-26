package demo2;

import demo1.Test;

public class Test1  implements Comparable<Test1>{

    public String str;

    public Test1(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(Test1 t) {
        if (this.str.compareTo(t.str)>0){
            return 1;
        }else if (this.str.compareTo(t.str)==0){
            return 0;

        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
            Test1 t = new Test1("aaa");
            Test1 t2 = new Test1("bbb");
        int i = t.compareTo(t2);
        System.out.println(i);
    }
}
