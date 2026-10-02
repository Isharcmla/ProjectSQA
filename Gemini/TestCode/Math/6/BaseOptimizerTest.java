package org.apache.commons.math3.optim;

import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;
import org.junit.Assert;
import org.junit.Test;

public class BaseOptimizerTest {

    private static class DummyChecker implements ConvergenceChecker<String> {
        public boolean converged(int iteration, String previous, String current) {
            return true;
        }
    }

    private static class OtherOptimizationData implements OptimizationData {
    }

    private static class ConcreteOptimizer extends BaseOptimizer<String> {
        private int evaluationsToPerform = 0;
        private int iterationsToPerform = 0;
        private String returnResult = "success";

        public ConcreteOptimizer(ConvergenceChecker<String> checker) {
            super(checker);
        }

        public void setSteps(int evaluations, int iterations) {
            this.evaluationsToPerform = evaluations;
            this.iterationsToPerform = iterations;
        }

        public void setReturnResult(String returnResult) {
            this.returnResult = returnResult;
        }

        @Override
        protected String doOptimize() {
            for (int i = 0; i < evaluationsToPerform; i++) {
                incrementEvaluationCount();
            }
            for (int i = 0; i < iterationsToPerform; i++) {
                incrementIterationCount();
            }
            return returnResult;
        }

        public void performEvaluationIncrement() {
            incrementEvaluationCount();
        }

        public void performIterationIncrement() {
            incrementIterationCount();
        }
    }

    @Test
    public void testConstructorAndGetters_withNullChecker_initialStateCorrect() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);

        Assert.assertNull(optimizer.getConvergenceChecker());
        Assert.assertEquals(0, optimizer.getMaxEvaluations());
        Assert.assertEquals(0, optimizer.getEvaluations());
        Assert.assertEquals(0, optimizer.getMaxIterations());
        Assert.assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testConstructorAndGetters_withNonNullChecker_returnsChecker() {
        ConvergenceChecker<String> checker = new DummyChecker();
        ConcreteOptimizer optimizer = new ConcreteOptimizer(checker);

        Assert.assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testOptimize_emptyOptimizationData_runsSuccessfully() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);
        optimizer.setSteps(0, 0);

        String result = optimizer.optimize();

        Assert.assertEquals("success", result);
        Assert.assertEquals(0, optimizer.getEvaluations());
        Assert.assertEquals(0, optimizer.getIterations());
    }

    @Test
    public void testOptimize_withMaxEvalAndMaxIter_setsLimitsAndCountsCorrectly() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);
        optimizer.setSteps(3, 2);

        String result = optimizer.optimize(new MaxEval(10), new MaxIter(5));

        Assert.assertEquals("success", result);
        Assert.assertEquals(10, optimizer.getMaxEvaluations());
        Assert.assertEquals(3, optimizer.getEvaluations());
        Assert.assertEquals(5, optimizer.getMaxIterations());
        Assert.assertEquals(2, optimizer.getIterations());
    }

    @Test
    public void testOptimize_withUnknownOptimizationData_ignoresUnknownData() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);
        optimizer.setSteps(1, 1);

        String result = optimizer.optimize(new OtherOptimizationData(), new MaxEval(5), new MaxIter(5));

        Assert.assertEquals("success", result);
        Assert.assertEquals(5, optimizer.getMaxEvaluations());
        Assert.assertEquals(5, optimizer.getMaxIterations());
        Assert.assertEquals(1, optimizer.getEvaluations());
        Assert.assertEquals(1, optimizer.getIterations());
    }

    @Test
    public void testOptimize_exceedingMaxEvaluations_throwsTooManyEvaluationsException() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);
        optimizer.setSteps(4, 0);

        try {
            optimizer.optimize(new MaxEval(3), new MaxIter(10));
            Assert.fail("Expected TooManyEvaluationsException was not thrown");
        } catch (TooManyEvaluationsException e) {
            Assert.assertEquals(3, e.getMax());
        }
    }

    @Test
    public void testOptimize_exceedingMaxIterations_throwsTooManyIterationsException() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);
        optimizer.setSteps(0, 4);

        try {
            optimizer.optimize(new MaxEval(10), new MaxIter(3));
            Assert.fail("Expected TooManyIterationsException was not thrown");
        } catch (TooManyIterationsException e) {
            Assert.assertEquals(3, e.getMax());
        }
    }

    @Test
    public void testOptimize_subsequentCalls_preservesPreviousOptimizationData() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);
        optimizer.setSteps(2, 2);

        optimizer.optimize(new MaxEval(10), new MaxIter(8));
        Assert.assertEquals(10, optimizer.getMaxEvaluations());
        Assert.assertEquals(8, optimizer.getMaxIterations());
        Assert.assertEquals(2, optimizer.getEvaluations());
        Assert.assertEquals(2, optimizer.getIterations());

        // Subsequent call without passing MaxEval or MaxIter should reuse previously set limits
        optimizer.setSteps(1, 1);
        optimizer.optimize();

        Assert.assertEquals(10, optimizer.getMaxEvaluations());
        Assert.assertEquals(8, optimizer.getMaxIterations());
        Assert.assertEquals(1, optimizer.getEvaluations());
        Assert.assertEquals(1, optimizer.getIterations());
    }

    @Test
    public void testOptimize_subsequentCalls_overwritesOnlySpecifiedOptimizationData() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);
        optimizer.setSteps(1, 1);

        optimizer.optimize(new MaxEval(10), new MaxIter(8));
        Assert.assertEquals(10, optimizer.getMaxEvaluations());
        Assert.assertEquals(8, optimizer.getMaxIterations());

        optimizer.optimize(new MaxEval(20));
        Assert.assertEquals(20, optimizer.getMaxEvaluations());
        Assert.assertEquals(8, optimizer.getMaxIterations());

        optimizer.optimize(new MaxIter(15));
        Assert.assertEquals(20, optimizer.getMaxEvaluations());
        Assert.assertEquals(15, optimizer.getMaxIterations());
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testIncrementEvaluationCount_zeroLimit_throwsException() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);
        optimizer.performEvaluationIncrement();
    }

    @Test(expected = TooManyIterationsException.class)
    public void testIncrementIterationCount_zeroLimit_throwsException() {
        ConcreteOptimizer optimizer = new ConcreteOptimizer(null);
        optimizer.performIterationIncrement();
    }
}
