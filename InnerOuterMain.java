package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // Inner의 참조를 알아야 되서
        inner.print();

        System.out.println("inner Class : " + inner);
    }
}
