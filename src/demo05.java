public class demo05 {
    public static void main(String[] args) {
        //操作比较大的时候注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        int money=10_0000_0000;
        int years=20;
        int total=money*years; //默认为int；转换之前已经出现问题了。
        long total2=money*years;
        System.out.println(money);//1000000000
        System.out.println(total); //-1474836480 (计算的时候溢出了)
        System.out.println(total2); //-1474836480

        //正确写法
        long total3=money*((long)years); //先把一个数转化为long
        System.out.println(total3); //20000000000
        //代码的规范性：数字后面的字母全部用大写。例如：200.98F,10000L


    }
}
