package javacore.ZZAclassesinternas;

public class OuterClassesTest01 {
    private String name = "Monkey D Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClasses = new OuterClassesTest01();
        Inner inner = outerClasses.new Inner();
        inner.printOuterClassAttribute();
    }
}
