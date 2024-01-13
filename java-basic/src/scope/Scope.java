package scope;

public class Scope {

    //세션 분리하고 각 기능을 구현할 때 , 변수 처리(범위)가 유연하지 않아 실수를 많이 함
    public static void main(String[] args) {
        int m = 0; //psvm 코드블럭 내
        if(true){
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 종료
            System.out.println("psvm m = " + m);
//            System.out.println("psvm x = " + x); cannot find symbol
        int x = 0;
        if(x> 0 ){
            int y = 10;
            if(y > 5){
                int z = x+y ;
                System.out.println("z = " + z);
            }
//            System.out.println("z = " + z); cannot find symbol
        }
//        System.out.println("y = " + y); cannot find symbol

    } //m 종료


}
