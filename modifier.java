package jay_pr_1;


public class modifier {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        myClass.publicField = 10;
        myClass.publicMethod();
        

        myClass.protectedField = 20;
        myClass.protectedMethod();
        
        //myClass.privateField = 30;
        //myClass.privateMethod();
    }
}

class MyClass {
    public int publicField;
    protected int protectedField;
    public void publicMethod() {
        System.out.println("This is a public method");
    }
    
    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }
    

	private void privateMethod() {
        System.out.println("This is a private method");
    }
}