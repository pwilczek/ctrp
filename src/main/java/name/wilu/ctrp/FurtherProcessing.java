package name.wilu.ctrp;

import java.util.Collection;
import java.util.Iterator;

import static java.util.Arrays.asList;

/**
 * Do not change.
 */
public class FurtherProcessing {
    //
    public static void take(PopulationGrowthModel populationGrowthModel) {
        Collection<Integer> result = populationGrowthModel.populationAtDay(
                asList(3, 4, 3, 1, 2), 15
        );
        assert result.size() == 20;
        Iterator<Integer> i = result.iterator();
        assert i.next() == 2;
        assert i.next() == 3;
        assert i.next() == 2;
        assert i.next() == 0;
        assert i.next() == 1;
    }
}
