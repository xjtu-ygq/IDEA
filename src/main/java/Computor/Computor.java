package Computor;

public class Computor {

    public int compute(int num1, int num2, String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computable computable = ComputeFactoy.getCompute(symbol);
        return computable.compute(num1, num2);
    }
}