import java.util.List;
import java.util.ArrayList;

/**
 * Main
 * main() instantiates MachineLearningPrediction, StatisticalPrediction and calls predict() on each of them.
 *
 * @author Hudson Miller
 */

public class Main {
    public static void main(String[] args) {

        // Both prediction types are instantiated
        MachineLearningPrediction mlp = new MachineLearningPrediction();
        StatisticalPrediction stp = new StatisticalPrediction();
        System.out.println();

        // Calling MLP's predict()
        System.out.println("Machine Learning Prediction");
        mlp.predict();

        // Calling STP's predict()
        System.out.println("Statistical Prediction");
        stp.predict();

        // Viola
    }
}