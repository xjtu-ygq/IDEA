public class ComputeFactoy {

    public static Computable getCompute(String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
