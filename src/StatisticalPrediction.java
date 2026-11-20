/**
 * StatisticalPrediction
 * Counterpart of MachineLearningPrediction. Leaves the template method intact, works by using
 * commands, except for preprocessData(), which it implements a unique version of.
 * Extends HurricanePredictionTemplate.
 * Part of the Template pattern.
 *
 * @author Hudson Miller
 */

public class StatisticalPrediction extends HurricanePredictionTemplate {

    public void fetchData(){
        invoker.addCommand(new FetchDataCommand());
    }
    public void preprocessData(){
        System.out.println("Getting Statistical Model -> Pre-processing data...");
    }
    public void applyPredictionModel(){
        invoker.addCommand(new PredictionCommand());
    }
    public void postprocessResults(){
        invoker.addCommand(new SaveResultsCommand());
    }
}
