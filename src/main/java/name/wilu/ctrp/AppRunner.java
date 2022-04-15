package name.wilu.ctrp;

import java.util.Collection;
import java.util.List;

/**
 * Add -ea to VM options before running to enable assertions
 */
public class AppRunner {
    //
    public static void main(String[] args) {
        PopulationGrowthAlgo algo = null;
        FurtherProcessing.take(new PopulationGrowthModel(algo));
    }
}

class PopulationGrowthModel {
    //
    private final PopulationGrowthAlgo algo;

    PopulationGrowthModel(PopulationGrowthAlgo algo) {
        this.algo = algo;
    }

    Collection<Integer> populationAtDay(Collection<Integer> initial, int day) {
        return algo.calculate(initial, day);
    }
}

/**
 * For initial populations returns predicted population at given day
 */
interface PopulationGrowthAlgo{
    List<Integer> calculate(Collection<Integer> initial, int day);
}
