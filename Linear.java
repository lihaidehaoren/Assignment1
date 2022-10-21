import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();    //定义数据数量


        for (int i=0;i<T;i++){
            float a, b, c, d, x;           //输入5个变量
            a = sc.nextFloat();
            b = sc.nextFloat();
            c = sc.nextFloat();
            d = sc.nextFloat();
            x = sc.nextFloat();

            float k,t,y;
            k=(b-d)/(a-c);                //计算变量
            t=b-k*a;
            y=k*x+t;
            System.out.printf("%.1f\n", y);
        }
    }
}
