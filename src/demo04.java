public class demo04 {
    public static void main(String[] args) {
        int i=128;
        byte b=(byte)i;//为什么会是-128？ 因为byte最大值是127，会出现内存溢出的问题。在以后输入时要避免内存溢出的情况。
        //加了括号的转换是强制转换（从高到低）。例如：（类型）变量名 【(byte)i】

        System.out.println(i); //128
        System.out.println(b); //-128
        //==============================================================
        //自动转换（从低到高）不需要写什么东西
        int s=128;
        double t=s;
        System.out.println(s); //128
        System.out.println(t); //128.0

        /*注意点：
        1）不能对布尔值进行转换
        2）不能把对象类型转化为不想干的类型
        3）在把高容量转化为低能量时，需要强制转换；反之，自动转换。
        4）转换的时候可能存在内存溢出或者小数点精度的问题！！！！
         */
        //===============================
        //精度问题
        System.out.println((int)23.7); //23
        System.out.println((int)-45.89F); //-45

        //======================================
        char c='a';
        int d=c+1;
        System.out.println(d); //98
        System.out.println((char)d); //b

    }
}
