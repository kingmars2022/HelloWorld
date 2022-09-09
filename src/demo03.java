public class demo03 {
    public static void main(String[] args) {
        //整数拓展：  进制  二进制（0b开头）  十进制  八进制（0开头）  十六进制（0x开头）
        int i=0b10; //二进制（0b开头）
        int i2= 10; //十进制
        int i3=010; //八进制（0开头
        int i4=0x10; //十六进制（0x开头） 0~9 A~F 16
        int i5=0x11;
        System.out.println(i); // 2
        System.out.println(i2);// 10
        System.out.println(i3);// 8
        System.out.println(i4);// 16
        System.out.println(i5);// 17
        System.out.println("===========================");
        //============================================================================================
        //浮点数拓展  银行业务怎么表示？
        //BigDecimal 数学工具类
        //============================================================================================
        //float  有限的 离散的 舍入误差  表示的一个大约数（接近，但不等于）
        //double
        // 这里面float和double算小数的时候存在错误；所以最好完全避免使用浮点数进行比较

        float f=0.1F; //0.1
        double d=1.0/10; //0.1
        System.out.println(d==f); //false
        //d==f - d等于f
        System.out.println(d);
        System.out.println(f);

        float d1=231333131313F;
        float d2=d1 + 1;
        System.out.println(d1==d2); //true
        //============================================================================================
        //字符拓展
        //============================================================================================
        System.out.println("===========================");
        char c1='a';
        char c2='中';
        System.out.println(c1);

        System.out.println((int)c1); //强制转行

        System.out.println(c2);

        System.out.println((int)c2); //强制转行

        //所有的字符本质还是数字
        //char类型会涉及到编码问题：Unicode  2字节  65536个字符  （最早Excel是2的16次方=65536个字符）
        //Unicode （是一个表，每个数字对应的就是字。例如，U0000~UFFFF） a=97 中=20013

        char c3='\u0061';
        System.out.println(c3);//a

        //转义字符
        // \t  制表符
        // \n 换行
        System.out.println("Hello\tworld");
        System.out.println("Hello\nworld");

        System.out.println("===========================");
        String sa =new String ("hello world");
        String sb =new String ("hello world");
        System.out.println(sa==sb); //flase
        String sc ="hello world";
        String sd ="hello world";
        System.out.println(sc==sd); //true
        // 对象 从内存方面去考虑

        System.out.println("===========================");
        //布尔值拓展
        boolean flag=true;
        if (flag==true){} //if (flag){} 【老手】 =  if (flag==true){} 【新手】
        //less is more！代码要精简易读！


    }
}
