package day1;

public class VerDemo2 {
    public static void main(String[] args) {
        /**int x=3;
        byte y=4;
        x=x+y;
        System.out.println("x="+x);
         */
        /**byte b=3;
        b = (byte)(b + 1);
        System.out.println("b="+b);
         */
        char ch=97;
        System.out.println("ch="+ch);
        char ch2 ='a';
        System.out.println("ch2="+(ch2+1));
    }
}
/**byte 自动提升为 int 然后相加
 这叫自动类型提升
 强制类型转换不太建议
 */