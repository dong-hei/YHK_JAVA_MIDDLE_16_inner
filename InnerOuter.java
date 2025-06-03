package nested.inner;

public class InnerOuter {
    private static int outClassVal = 3;
    private int outInstanceVal = 2;
    
    class Inner {
        private int innerInstanceVal = 1;
        
        public void print(){
            //자기 자신에 접근
            System.out.println(innerInstanceVal);
            
            //외부 클래스의 인스턴스 멤버에 접근 가능, private도 가능
            System.out.println(outInstanceVal);
            
            //외부 클래스의 클래스 멤버에 접근 가능, private도 가능
            System.out.println(outClassVal);
        }
    }
}
