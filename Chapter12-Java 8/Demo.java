public class Demo implements Interface2 {
    @Override
    public String getHello() {
        return "Hello";
    }

    @Override
    public void print() {
        System.out.println("Print");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.print();
        d.getHello();
        System.out.println(d.getHello());
    }
}
