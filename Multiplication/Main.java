package Multiplication;

public class Main{
    int a ;
    int b;
    Main(int a , int b){
        this.a=a;
        this.b=b;
    }
    public int  multiplication(){
        return a*b;
    }
    public static void main(String[] args) {
        Main m=new Main(25, 45);
        System.out.println(m.multiplication());
    }
}