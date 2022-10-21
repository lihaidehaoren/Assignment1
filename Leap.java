import java.util.Scanner;

public class Leap {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();    //定义数据数量
        int y;
        int day,d=0;    //判断数据
        for (int i=0;i<T;i++) {
            y = sc.nextInt();
            d=0;
            float t=y;
            if (t/4%1==0&&t/100%1!=0){
                System.out.println("Yes");
                while (t>0){
                    if (t/4%1==0&&t/100%1!=0){
                        d=d+1;
                        t=t-4;
                    }
                    else if (t/400%1==0){
                        d=d+1;
                        t=t-4;
                    }
                    else {
                        t=t-4;
                    }
                }
                day =(2000-y)*365-60+1+(485-d);
                System.out.println(day);
            }
            else if (t/400%1==0){
                System.out.println("Yes");
                while (t>0){
                    if (t/4%1==0&&t/100%1!=0){
                        d=d+1;
                        t=t-4;
                    }
                    else if (t/400%1==0){
                        d=d+1;
                        t=t-4;
                    }
                    else {
                        t=t-4;
                    }
                }
                day =(2000-y)*365-60+1+(485-d);
                System.out.println(day);
            }
            else {
                System.out.println("No");
            }
        }
    }
}