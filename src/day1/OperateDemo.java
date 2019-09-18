package day1;

import java.util.logging.XMLFormatter;

public class OperateDemo
{
    public static void main(String[] args)
    {
        /**
         *  + - * / %(取余数)
         */
        int x=2810;
        System.out.println(2%5);
        /**
         * ++:自增 对原有的数据进行+1

        int a=3;
        a++; a=a+1 ++运算单独存在时,放左放右是没有区别的
        System.out.println("a="+a);
         */
        int a= 3,b;
        b=a++;//b=++a; temp=a;先将a进行临时存储. a=a+1;自增. b=temp;将临时的值赋值给b.
        //一般不建议将++放右边
        System.out.println("a="+a+",b="+b);
    }
}
