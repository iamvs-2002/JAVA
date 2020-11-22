public class constructoroverloading {
    constructoroverloading(){
        System.out.println("0 argument constructor");
    }
    constructoroverloading(int i){
        System.out.println("int argument constructor");
    }
    constructoroverloading(char ch, int i){
        System.out.println(ch+" "+i);
    }
    public static void main(String[] args) {
        constructoroverloading c1 = new constructoroverloading();
        constructoroverloading c2 = new constructoroverloading(3);
        constructoroverloading c3 = new constructoroverloading('x',69);
    }
}
