package xuexi;

public class Test1 {
    public static void main(String[] args) {
        //数组元素求最大值,颜值15,9000,10000,20000,9500,-5
        //定义数组
        int [] face={15,9000,10000,20000,9500,-5};
        //定义一个最大值
        int max =face[0];
        //遍历数组，依次比较
        for (int i = 0; i < face.length; i++) {
            if (max<face[i]){
                max=face[i];
            }
        }
        System.out.println(max);
    }
}
