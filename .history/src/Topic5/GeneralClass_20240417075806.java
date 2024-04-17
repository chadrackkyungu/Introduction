package Topic5;

public class GeneralClass {
    // Fields (Attributes)
    int field1;
    String fields2;

    // Constructors ( a special methods)
    public GeneralClass(int field1, String fields) {
        this.field1 = field1; // initialize
        this.fields2 = fields; // initialize
    }

    // Methods (define the behavior of a class)
    void method1() {
        System.out.println(" This function return nothing");
    }

    int method2() {
        return field1; // return
    }
}
