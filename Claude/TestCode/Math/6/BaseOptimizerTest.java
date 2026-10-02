package org.apache.commons.math3.optim;

import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BaseOptimizerTest {

    /**
     * Simple concrete implementation of BaseOptimizer for testing purposes.
     * Allows controlling how many evaluations/iterations are consumed
     * during doOptimize().
     */
    private static class SimpleOptimizer extends BaseOptimizer<String> {
        private int evalCountToConsume = 0;
        private int iterCountToConsume = 0;

        SimpleOptimizer(ConvergenceChecker<String> checker) {
            super(checker);
        }

        void setEvalCountToConsume(int n) {
            evalCountToConsume = n;
        }

        void setIterCountToConsume(int n) {
            iterCountToConsume = n;
        }

        @Override
        protected String doOptimize() {
            for (int i = 0; i < evalCountToConsume; i++) {
                incrementEvaluationCount();
            }
            for (int i = 0; i < iterCountToConsume; i++) {
                incrementIterationCount();
            }
            return "result";
        }
    }

    /**
     * Simple convergence checker implementation (not actually used for
     * logic in BaseOptimizer itself, but required since the field is
     * stored and returned by getConvergenceChecker()).
     */
    private static class SimpleConvergenceChecker implements ConvergenceChecker<String> {
        public boolean converged(int iteration, String previous, String current) {
            return true;
        }
    }

    /**
     * Dummy OptimizationData implementation that is neither MaxEval nor
     * MaxIter, used to test that parseOptimizationData ignores irrelevant
     * data without error.
     */
    private static class DummyOptimizationData implements OptimizationData {
        // Marker implementation, no additional members.
    }

    private SimpleOptimizer optimizer;
    private SimpleConvergenceChecker checker;

    @Before
    public void setUp() {
        checker = new SimpleConvergenceChecker();
        optimizer = new SimpleOptimizer(checker);
    }

    @Test
    public void testGetMaxEvaluations_beforeAnyCall_returnsZero() {
        assertEquals(0, optimizer.getMaxEvaluations());
    }

    @Test
    public void testGetMaxIterations_beforeAnyCall_returnsZero() {
        assertEquals(0, optimizer.getMaxIterations());
    }

    @Test
    public void testGetEvaluations_beforeOptimizeCall_returnsZero() {
        assertEquals(0, optimizer.getEvaluations());
    }

    @Test
    public void testGetIterations_beforeOptimizeCall_returnsZero() {
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testGetConvergenceChecker_returnsSameInstancePassedInConstructor() {
        assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testGetConvergenceChecker_nullChecker_returnsNull() {
        SimpleOptimizer nullCheckerOptimizer = new SimpleOptimizer(null);
        assertNull(nullCheckerOptimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimize_withMaxEvalAndMaxIter_setsMaxValuesCorrectly() {
        optimizer.setEvalCountToConsume(5);
        optimizer.setIterCountToConsume(3);

        String result = optimizer.optimize(new MaxEval(10), new MaxIter(10));

        assertEquals("result", result);
        assertEquals(10, optimizer.getMaxEvaluations());
        assertEquals(10, optimizer.getMaxIterations());
        assertEquals(5, optimizer.getEvaluations());
        assertEquals(3, optimizer.getIterations());
    }

    @Test
    public void testOptimize_withoutNewMaxData_retainsPreviousValues() {
        optimizer.setEvalCountToConsume(2);
        optimizer.setIterCountToConsume(1);

        optimizer.optimize(new MaxEval(20), new MaxIter(15));
        assertEquals(20, optimizer.getMaxEvaluations());
        assertEquals(15, optimizer.getMaxIterations());

        // Second call without specifying MaxEval/MaxIter - previous values retained.
        optimizer.setEvalCountToConsume(1);
        optimizer.setIterCountToConsume(1);
        optimizer.optimize();

        assertEquals(20, optimizer.getMaxEvaluations());
        assertEquals(15, optimizer.getMaxIterations());
        assertEquals(1, optimizer.getEvaluations());
        assertEquals(1, optimizer.getIterations());
    }

    @Test
    public void testOptimize_withIrrelevantOptimizationData_ignoresDataAndDoesNotThrow() {
        optimizer.setEvalCountToConsume(1);
        optimizer.setIterCountToConsume(1);

        String result = optimizer.optimize(new MaxEval(5), new MaxIter(5), new DummyOptimizationData());

        assertEquals("result", result);
        assertEquals(5, optimizer.getMaxEvaluations());
        assertEquals(5, optimizer.getMaxIterations());
    }

    @Test
    public void testOptimize_noOptimizationDataArgs_doesNotThrow() {
        optimizer.setEvalCountToConsume(0);
        optimizer.setIterCountToConsume(0);

        String result = optimizer.optimize();

        assertEquals("result", result);
        // Max values remain at their default (0) since never set.
        assertEquals(0, optimizer.getMaxEvaluations());
        assertEquals(0, optimizer.getMaxIterations());
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_exceedsMaxEvaluations_throwsTooManyEvaluationsException() {
        optimizer.setEvalCountToConsume(10);
        optimizer.setIterCountToConsume(0);

        optimizer.optimize(new MaxEval(5), new MaxIter(100));
    }

    @Test(expected = TooManyIterationsException.class)
    public void testOptimize_exceedsMaxIterations_throwsTooManyIterationsException() {
        optimizer.setEvalCountToConsume(0);
        optimizer.setIterCountToConsume(10);

        optimizer.optimize(new MaxEval(100), new MaxIter(5));
    }

    @Test
    public void testOptimize_resetsCountersBetweenCalls() {
        optimizer.setEvalCountToConsume(4);
        optimizer.setIterCountToConsume(2);
        optimizer.optimize(new MaxEval(50), new MaxIter(50));
        assertEquals(4, optimizer.getEvaluations());
        assertEquals(2, optimizer.getIterations());

        // Second call with fewer consumed counts - should reset, not accumulate.
        optimizer.setEvalCountToConsume(1);
        optimizer.setIterCountToConsume(1);
        optimizer.optimize();
        assertEquals(1, optimizer.getEvaluations());
        assertEquals(1, optimizer.getIterations());
    }

    @Test
    public void testOptimize_zeroMaxEvalAndZeroConsumption_doesNotThrow() {
        optimizer.setEvalCountToConsume(0);
        optimizer.setIterCountToConsume(0);

        String result = optimizer.optimize(new MaxEval(0), new MaxIter(0));

        assertEquals("result", result);
        assertEquals(0, optimizer.getEvaluations());
        assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testOptimize_withEmptyOptimizationDataArray_doesNotThrow() {
        OptimizationData[] emptyArray = new OptimizationData[0];
        optimizer.setEvalCountToConsume(0);
        optimizer.setIterCountToConsume(0);

        String result = optimizer.optimize(emptyArray);

        assertEquals("result", result);
    }
}
