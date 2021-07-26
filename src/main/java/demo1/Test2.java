package demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

public class Test2 {

    private Test2(){
        System.out.println(Thread.currentThread().getName()+"=>获得对象");
    }
    private static volatile Test2 test;

    public static Test2 getInstance(){
        //进行判断加锁
        if (test==null){
            //加锁
            synchronized (Test2.class){
                //再次进行判断
                if (test==null){
                    System.out.println("t为空 返回的是新创建的对象实例");
                    test = new Test2();
                    return test;
                }
            }
        }

        return  test;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//            for (int i = 1;i<10;i++){
//                new Thread(() -> {
//                    Test2 instance = Test2.getInstance();
//
//                },String.valueOf(i)).start();
//            }
//        Test2 test2 = Test2.getInstance();
//        System.out.println(test2);
//        Constructor<Test2> constructor = Test2.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Test2 t2 = constructor.newInstance();
//        System.out.println(t2);
        AtomicInteger atomicInteger = new AtomicInteger(2020);

        //boolean compareAndSet(int expect, int update)
        //期望值、更新值
        //如果实际值 和 我的期望值相同，那么就更新
        //如果实际值 和 我的期望值不同，那么就不更新
        System.out.println(atomicInteger.compareAndSet(2020, 2021));
        System.out.println(atomicInteger.get());

        //因为期望值是2020  实际值却变成了2021  所以会修改失败
        //CAS 是CPU的并发原语
        atomicInteger.getAndIncrement(); //++操作
        System.out.println(atomicInteger.compareAndSet(2020, 2021));
        System.out.println(atomicInteger.get());


    }
}
