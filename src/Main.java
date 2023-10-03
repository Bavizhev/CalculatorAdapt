public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 12));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 10));
        System.out.println();

        BinOps bins = new BinOps();
        System.out.println(bins.sum("10", "10"));
        System.out.println(bins.mult("10", "101"));
    }
}