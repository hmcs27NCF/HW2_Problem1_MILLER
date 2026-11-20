/**
 * HurricanePredictionTemplate (Abstract)
 * Main class of the Template pattern. predict() is the template method, calling each of the abstract methods
 * in order and printing console messages for bug fixing purposes. Instantiates PredictionInvoker to connect
 * it to the Command pattern.
 *
 * @author Hudson Miller
 */

public abstract class HurricanePredictionTemplate {
    protected PredictionInvoker invoker = new PredictionInvoker();

    public void predict(){
        System.out.println();
        System.out.println("RUNNING PREDICTION");
        fetchData();
        preprocessData();
        applyPredictionModel();
        postprocessResults();
        invoker.executeCommands();
        System.out.println("PREDICTION SUCCESS");
        System.out.println();
    }

    abstract void fetchData();
    abstract void preprocessData();
    abstract void applyPredictionModel();
    abstract void postprocessResults();
}
