import java.util.Scanner;

public class Month {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();    //定义数据数量

        int t;                     //判断数据
        for (int i=0;i<T;i++){
            t = sc.nextInt();
            if (t==1 || t==3 || t==5 || t==7 || t==8 || t==10 ||t==12){
                System.out.println("yes");
            }
            else if (t==2 || t==4 || t==6 || t==9 || t==11) {
                System.out.println("no");
            }
            else {
                System.out.println("It is a wrong number");
            }
        }
    }
}
