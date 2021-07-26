package demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

public class Test2 {

    private Test2(){
        System.out.println(Thread.currentThread().getName()+"=>��ö���");
    }
    private static volatile Test2 test;

    public static Test2 getInstance(){
        //�����жϼ���
        if (test==null){
            //����
            synchronized (Test2.class){
                //�ٴν����ж�
                if (test==null){
                    System.out.println("tΪ�� ���ص����´����Ķ���ʵ��");
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
        //����ֵ������ֵ
        //���ʵ��ֵ �� �ҵ�����ֵ��ͬ����ô�͸���
        //���ʵ��ֵ �� �ҵ�����ֵ��ͬ����ô�Ͳ�����
        System.out.println(atomicInteger.compareAndSet(2020, 2021));
        System.out.println(atomicInteger.get());

        //��Ϊ����ֵ��2020  ʵ��ֵȴ�����2021  ���Ի��޸�ʧ��
        //CAS ��CPU�Ĳ���ԭ��
        atomicInteger.getAndIncrement(); //++����
        System.out.println(atomicInteger.compareAndSet(2020, 2021));
        System.out.println(atomicInteger.get());


    }
}
