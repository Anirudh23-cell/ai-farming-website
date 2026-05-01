class Sn2{
    int a=20;
    int b= 2;
    void add(){
        int c = a+b;
        System.out.println(c);
    }
    void sub(){
        int c = a-b;
        System.out.println(c);
    }
    void mul(int a,int b){
        int c = a*b;
        System.out.println(c);
    }
    void divi(){
        int c = a/b;
        System.out.println(c);
    }
}
class main{
    public static void main(String args []){
        Sn2 v = new Sn2();
        v.mul(3,4);
    }
}