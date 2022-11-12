public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {  //сумма
        //считаем через target
        return target.newFormula().calculate(Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {  //умножение
        //считаем через target
        return target.newFormula().calculate(Calculator.Operation.MULT);
    }

    @Override
    public int pow(int a, int b) {  //степень
        //считаем через target
        return new int(target.newFormula().calculate(Calculator.Operation.POW));
    }
}
