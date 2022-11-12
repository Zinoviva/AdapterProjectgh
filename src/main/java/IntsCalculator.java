public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {  //сумма
        //считаем через target
        return (arg0 + arg1);
    }

    @Override
    public int mult(int arg0, int arg1) {  //умножение
        //считаем через target
        return arg0*arg1;
    }

    @Override
    public int pow(int a, int b) {  //степень
        //считаем через target
        return (int) Math.pow(a, b);
    }
}
