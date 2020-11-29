public class methodoverloading {
    void m1(char ch){
        System.out.println("char const");
    }
    void m1(int i){
        System.out.println("int const");
    }
    void m1(int i,int j){
        System.out.println(i+" "+j);
    }
    public static void main(String[] args) {
        methodoverloading m = new methodoverloading();
        m.m1('a');
        m.m1(3);
        m.m1(6,9);
    }
}
