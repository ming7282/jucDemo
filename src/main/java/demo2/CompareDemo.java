package demo2;

import java.util.Comparator;

public class CompareDemo implements Comparator<Test1> {
    @Override
    public int compare(Test1 t1, Test1 t2) {
        if (t1.str.compareTo(t2.str)>0){
            return 1;
        }else if (t1.str.compareTo(t2.str)<0){
            return -1;
        }else{
            return 0;
        }
        
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1("a");
        Test1 t2 = new Test1("b");
        CompareDemo compareDemo = new CompareDemo();
        int compare = compareDemo.compare(t1, t2);
        System.out.println(compare);

    }
}

