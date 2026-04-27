public class Pariksha {
    int a;
    Pariksha(int i){
     a = i;
    } 

    Pariksha incrByTen(){
      Pariksha temp = new Pariksha(a+10);
      return temp;

}
public static void main(String[] args) {
    Pariksha ob1 = new Pariksha(2);
    Pariksha ob2;
    ob2 = ob1.incrByTen();
    System.out.println("ob1.a"+ob1.a);
    System.out.println("ob2.a"+ob2.a);
}
}
