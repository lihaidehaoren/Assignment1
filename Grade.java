import java.util.Scanner;

public class Grade {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();    //定义数据数量
        int A=0,B=0,C=0,D=0;
        for (int i=0;i<T;i++){
            int s;
            s = sc.nextInt();

            if (s<=100&&s>=90){
                A=A+1;
            }
            if (s<90&&s>=80){
                B=B+1;
            }
            if (s<80&&s>=70){
                C=C+1;
            }
            if (s<70&&s>=60){
                D=D+1;
            }
        }
        System.out.printf("A: %d\nB: %d\nC: %d\nD: %d",A,B,C,D);
    }
}
