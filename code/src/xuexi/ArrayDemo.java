package xuexi;

public class ArrayDemo {
    public static void main(String[] args) {
        //目标：学会访问数组元素
        int[] ages = {10,20,30,40,50};

        //取值：
        System.out.println(ages[2]);

        //赋值：
        ages[3]=100;
        System.out.println(ages[3]);

        //访问数组的长度：
        System.out.println(ages.length);

        //动态初始化数组
        double[] app = new double[5];
        app[0] = 100;
        System.out.println(app[0]);
        System.out.println(app[1]);

        String[] names = new String[5];
        names[0] ="梁老四";
        names[1] ="姚老二";
        System.out.println(names[0]);
        System.out.println(names[3]);
        System.out.println(names[4]);
    }
}
