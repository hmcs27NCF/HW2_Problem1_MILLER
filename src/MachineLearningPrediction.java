/**
 * MachineLearningPrediction
 * Counterpart of StatisticalPrediction. Leaves the template method intact, works by using
 * commands, except for preprocessData(), which it implements a unique version of. I didn't think
 * I had to actually implement a real prediction / machine learning algorithm because the UML solution
 * had a lack of data variables / classes and there was no actual predicting in the sample output.
 * Part of the Template pattern.
 * Implements HurricanePredictionTemplate.
 *
 * @author Hudson Miller
 */

public class MachineLearningPrediction extends HurricanePredictionTemplate {
    public void fetchData(){
        invoker.addCommand(new FetchDataCommand());
    }
    public void preprocessData(){
        System.out.println("Getting Machine Learning Model + Statistical Model -> Pre-processing data...");
    }
    public void applyPredictionModel(){
        invoker.addCommand(new PredictionCommand());
    }
    public void postprocessResults(){
        invoker.addCommand(new SaveResultsCommand());
    }
}
