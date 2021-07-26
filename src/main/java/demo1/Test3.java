package demo1;

public class Test3 {
    private Test3(){

    }
    public static  Test3 getInstance(){
        return  TTT.TEST_3;
    }
    static class TTT {
        static final Test3 TEST_3 =  new Test3();

    }
}
