package demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("�����������������жϣ�");
        Scanner input = new Scanner(System.in);
        //Tri tri = new Tri();
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        try{    //��try-catch�����쳣
            triangle(a,b,c);
        }
        catch(Exception e){   //���������쳣ʱ�����
            e.printStackTrace();
        }

    }
    public static void triangle(int a,int b,int c) throws IllegalArgumentException {
        int []aa = new int[3];//����һ��triangle�ķ������÷������ܴ����쳣����throws�����쳣
        aa[0]=a;              //��a,b,c��������aa
        aa[1]=b;
        aa[2]=c;
        Arrays.sort(aa);//������aa��������
        if((aa[2]-aa[0]<aa[2])&&aa[0]+aa[1]>aa[2])//�ж��Ƿ���Թ��������Σ��������֮��С�ڵ�����
            System.out.println(a+" "+b+" "+c+" "+"���Թ���������");//����֮�ʹ��ڵ����߾Ϳ��Թ���������
        else   //����throw�׳��쳣
            throw new IllegalArgumentException("a,b,c���ܹ���������");//�쳣���
    }
}
