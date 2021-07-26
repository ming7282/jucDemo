package demo1;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("请输入三个数用于判断：");
        Scanner input = new Scanner(System.in);
        //Tri tri = new Tri();
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        try{    //用try-catch捕获异常
            triangle(a,b,c);
        }
        catch(Exception e){   //当是其他异常时，输出
            e.printStackTrace();
        }

    }
    public static void triangle(int a,int b,int c) throws IllegalArgumentException {
        int []aa = new int[3];//定义一个triangle的方法，该方法可能存在异常，用throws声明异常
        aa[0]=a;              //将a,b,c赋给数组aa
        aa[1]=b;
        aa[2]=c;
        Arrays.sort(aa);//将数组aa进行排序
        if((aa[2]-aa[0]<aa[2])&&aa[0]+aa[1]>aa[2])//判断是否可以构成三角形，如果两边之差小于第三边
            System.out.println(a+" "+b+" "+c+" "+"可以构成三角形");//两边之和大于第三边就可以构成三角形
        else   //否则throw抛出异常
            throw new IllegalArgumentException("a,b,c不能构成三角形");//异常输出
    }
}
