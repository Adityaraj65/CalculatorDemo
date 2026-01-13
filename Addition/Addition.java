public class Addition{
    int a ;
    int b;
    Addition(int a , int b){
        this.a=a;
        this.b=b;
    }
    public int  addition(){
        return a+b;
    }
    public static void main(String[] args) {
        Addition add=new Addition(25, 45);
        System.out.println(add.addition());
    }
}