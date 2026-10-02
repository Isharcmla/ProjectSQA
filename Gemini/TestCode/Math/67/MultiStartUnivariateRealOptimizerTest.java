package org.apache.commons.math.optimization;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

public class MultiStartUnivariateRealOptimizerTest {

    private static class DummyOptimizer implements UnivariateRealOptimizer {
        private int maxIterations = 100;
        private int maxEvaluations = 100;
        private int iterationCount = 10;
        private int evaluations = 15;
        private double absoluteAccuracy = 1e-6;
        private double relativeAccuracy = 1e-6;
        private double result = 2.0;
        private double functionValue = 4.0;

        private double[] returnValues;
        private double[] returnFunctionValues;
        private int callIndex = 0;
        private boolean throwConvergenceException = false;
        private boolean throwFunctionEvaluationException = false;
        private int throwOnCallIndex = -1;

        public DummyOptimizer() {
        }

        public DummyOptimizer(double[] returnValues, double[] returnFunctionValues) {
            this.returnValues = returnValues;
            this.returnFunctionValues = returnFunctionValues;
        }

        public double getFunctionValue() {
            return functionValue;
        }

        public double getResult() {
            return result;
        }

        public double getAbsoluteAccuracy() {
            return absoluteAccuracy;
        }

        public int getIterationCount() {
            return iterationCount;
        }

        public int getMaximalIterationCount() {
            return maxIterations;
        }

        public int getMaxEvaluations() {
            return maxEvaluations;
        }

        public int getEvaluations() {
            return evaluations;
        }

        public double getRelativeAccuracy() {
            return relativeAccuracy;
        }

        public void resetAbsoluteAccuracy() {
            this.absoluteAccuracy = 1e-10;
        }

        public void resetMaximalIterationCount() {
            this.maxIterations = 1000;
        }

        public void resetRelativeAccuracy() {
            this.relativeAccuracy = 1e-14;
        }

        public void setAbsoluteAccuracy(double accuracy) {
            this.absoluteAccuracy = accuracy;
        }

        public void setMaximalIterationCount(int count) {
            this.maxIterations = count;
        }

        public void setMaxEvaluations(int maxEvaluations) {
            this.maxEvaluations = maxEvaluations;
        }

        public void setRelativeAccuracy(double accuracy) {
            this.relativeAccuracy = accuracy;
        }

        public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max)
                throws ConvergenceException, FunctionEvaluationException {
            if (throwConvergenceException || callIndex == throwOnCallIndex) {
                callIndex++;
                throw new ConvergenceException();
            }
            if (throwFunctionEvaluationException) {
                callIndex++;
                throw new FunctionEvaluationException(min);
            }
            if (returnValues != null && callIndex < returnValues.length) {
                result = returnValues[callIndex];
                functionValue = returnFunctionValues[callIndex];
            }
            callIndex++;
            return result;
        }

        public double optimize(UnivariateRealFunction f, GoalType goalType, double min, double max, double startValue)
                throws ConvergenceException, FunctionEvaluationException {
            return optimize(f, goalType, min, max);
        }
    }

    private static class DummyFunction implements UnivariateRealFunction {
        public double value(double x) {
            return (x - 2.0) * (x - 2.0) + 1.0;
        }
    }

    @Test
    public void testGetOptima_beforeOptimize_throwsIllegalStateException() {
        DummyOptimizer underlying = new DummyOptimizer();
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 3, generator);

        try {
            optimizer.getOptima();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testGetOptimaValues_beforeOptimize_throwsIllegalStateException() {
        DummyOptimizer underlying = new DummyOptimizer();
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 3, generator);

        try {
            optimizer.getOptimaValues();
            Assert.fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // Expected
        }
    }

    @Test
    public void testDelegatedMethodsAndGettersSetters() {
        DummyOptimizer underlying = new DummyOptimizer();
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 3, generator);

        optimizer.setMaxEvaluations(500);
        Assert.assertEquals(500, optimizer.getMaxEvaluations());

        optimizer.setMaximalIterationCount(300);
        Assert.assertEquals(300, optimizer.getMaximalIterationCount());

        optimizer.setAbsoluteAccuracy(1e-5);
        Assert.assertEquals(1e-5, optimizer.getAbsoluteAccuracy(), 1e-12);

        optimizer.resetAbsoluteAccuracy();
        Assert.assertEquals(1e-10, optimizer.getAbsoluteAccuracy(), 1e-12);

        optimizer.setRelativeAccuracy(1e-7);
        Assert.assertEquals(1e-7, optimizer.getRelativeAccuracy(), 1e-12);

        optimizer.resetRelativeAccuracy();
        Assert.assertEquals(1e-14, optimizer.getRelativeAccuracy(), 1e-12);

        optimizer.resetMaximalIterationCount();
        Assert.assertEquals(1000, underlying.getMaximalIterationCount());

        Assert.assertEquals(2.0, optimizer.getResult(), 1e-12);
        Assert.assertEquals(4.0, optimizer.getFunctionValue(), 1e-12);
        Assert.assertEquals(0, optimizer.getIterationCount());
        Assert.assertEquals(0, optimizer.getEvaluations());
    }

    @Test
    public void testOptimize_minimize_sortsAscending() throws Exception {
        double[] xVals = {10.0, 5.0, 2.0, 8.0};
        double[] yVals = {100.0, 25.0, 4.0, 64.0};

        DummyOptimizer underlying = new DummyOptimizer(xVals, yVals);
        RandomGenerator generator = new JDKRandomGenerator();
        generator.setSeed(123456L);

        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 4, generator);
        double result = optimizer.optimize(new DummyFunction(), GoalType.MINIMIZE, -10.0, 10.0);

        Assert.assertEquals(2.0, result, 1e-12);
        Assert.assertEquals(40, optimizer.getIterationCount());
        Assert.assertEquals(60, optimizer.getEvaluations());

        double[] optima = optimizer.getOptima();
        double[] optimaValues = optimizer.getOptimaValues();

        Assert.assertEquals(4, optima.length);
        Assert.assertEquals(2.0, optima[0], 1e-12);
        Assert.assertEquals(5.0, optima[1], 1e-12);
        Assert.assertEquals(8.0, optima[2], 1e-12);
        Assert.assertEquals(10.0, optima[3], 1e-12);

        Assert.assertEquals(4.0, optimaValues[0], 1e-12);
        Assert.assertEquals(25.0, optimaValues[1], 1e-12);
        Assert.assertEquals(64.0, optimaValues[2], 1e-12);
        Assert.assertEquals(100.0, optimaValues[3], 1e-12);
    }

    @Test
    public void testOptimize_maximize_sortsDescending() throws Exception {
        double[] xVals = {2.0, 5.0, 10.0, 8.0};
        double[] yVals = {4.0, 25.0, 100.0, 64.0};

        DummyOptimizer underlying = new DummyOptimizer(xVals, yVals);
        RandomGenerator generator = new JDKRandomGenerator();
        generator.setSeed(123456L);

        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 4, generator);
        double result = optimizer.optimize(new DummyFunction(), GoalType.MAXIMIZE, -10.0, 10.0, 0.0);

        Assert.assertEquals(10.0, result, 1e-12);

        double[] optima = optimizer.getOptima();
        double[] optimaValues = optimizer.getOptimaValues();

        Assert.assertEquals(4, optima.length);
        Assert.assertEquals(10.0, optima[0], 1e-12);
        Assert.assertEquals(8.0, optima[1], 1e-12);
        Assert.assertEquals(5.0, optima[2], 1e-12);
        Assert.assertEquals(2.0, optima[3], 1e-12);

        Assert.assertEquals(100.0, optimaValues[0], 1e-12);
        Assert.assertEquals(64.0, optimaValues[1], 1e-12);
        Assert.assertEquals(25.0, optimaValues[2], 1e-12);
        Assert.assertEquals(4.0, optimaValues[3], 1e-12);
    }

    @Test
    public void testOptimize_alreadySorted_minimize() throws Exception {
        double[] xVals = {1.0, 2.0, 3.0};
        double[] yVals = {10.0, 20.0, 30.0};

        DummyOptimizer underlying = new DummyOptimizer(xVals, yVals);
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 3, generator);

        double result = optimizer.optimize(new DummyFunction(), GoalType.MINIMIZE, -10.0, 10.0);
        Assert.assertEquals(1.0, result, 1e-12);

        double[] optima = optimizer.getOptima();
        Assert.assertEquals(1.0, optima[0], 1e-12);
        Assert.assertEquals(2.0, optima[1], 1e-12);
        Assert.assertEquals(3.0, optima[2], 1e-12);
    }

    @Test
    public void testOptimize_alreadySorted_maximize() throws Exception {
        double[] xVals = {3.0, 2.0, 1.0};
        double[] yVals = {30.0, 20.0, 10.0};

        DummyOptimizer underlying = new DummyOptimizer(xVals, yVals);
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 3, generator);

        double result = optimizer.optimize(new DummyFunction(), GoalType.MAXIMIZE, -10.0, 10.0);
        Assert.assertEquals(3.0, result, 1e-12);

        double[] optima = optimizer.getOptima();
        Assert.assertEquals(3.0, optima[0], 1e-12);
        Assert.assertEquals(2.0, optima[1], 1e-12);
        Assert.assertEquals(1.0, optima[2], 1e-12);
    }

    @Test
    public void testOptimize_insertInMiddle_minimize() throws Exception {
        double[] xVals = {1.0, 5.0, 3.0};
        double[] yVals = {10.0, 50.0, 30.0};

        DummyOptimizer underlying = new DummyOptimizer(xVals, yVals);
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 3, generator);

        double result = optimizer.optimize(new DummyFunction(), GoalType.MINIMIZE, -10.0, 10.0);
        Assert.assertEquals(1.0, result, 1e-12);

        double[] optima = optimizer.getOptima();
        Assert.assertEquals(1.0, optima[0], 1e-12);
        Assert.assertEquals(3.0, optima[1], 1e-12);
        Assert.assertEquals(5.0, optima[2], 1e-12);
    }

    @Test
    public void testOptimize_insertInMiddle_maximize() throws Exception {
        double[] xVals = {5.0, 1.0, 3.0};
        double[] yVals = {50.0, 10.0, 30.0};

        DummyOptimizer underlying = new DummyOptimizer(xVals, yVals);
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 3, generator);

        double result = optimizer.optimize(new DummyFunction(), GoalType.MAXIMIZE, -10.0, 10.0);
        Assert.assertEquals(5.0, result, 1e-12);

        double[] optima = optimizer.getOptima();
        Assert.assertEquals(5.0, optima[0], 1e-12);
        Assert.assertEquals(3.0, optima[1], 1e-12);
        Assert.assertEquals(1.0, optima[2], 1e-12);
    }

    @Test
    public void testOptimize_withExceptionsDuringSomeStarts() throws Exception {
        double[] xVals = {1.0, 2.0, 3.0};
        double[] yVals = {10.0, 20.0, 30.0};

        DummyOptimizer underlying = new DummyOptimizer(xVals, yVals);
        underlying.throwOnCallIndex = 1;

        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 3, generator);

        double result = optimizer.optimize(new DummyFunction(), GoalType.MINIMIZE, -10.0, 10.0);
        Assert.assertEquals(1.0, result, 1e-12);

        double[] optima = optimizer.getOptima();
        Assert.assertEquals(1.0, optima[0], 1e-12);
    }

    @Test
    public void testOptimize_allStartsThrowConvergenceException_throwsOptimizationException() {
        DummyOptimizer underlying = new DummyOptimizer();
        underlying.throwConvergenceException = true;
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 3, generator);

        try {
            optimizer.optimize(new DummyFunction(), GoalType.MINIMIZE, -10.0, 10.0);
            Assert.fail("Expected OptimizationException");
        } catch (OptimizationException e) {
            // Expected
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testOptimize_allStartsThrowFunctionEvaluationException_throwsOptimizationException() {
        DummyOptimizer underlying = new DummyOptimizer();
        underlying.throwFunctionEvaluationException = true;
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 2, generator);

        try {
            optimizer.optimize(new DummyFunction(), GoalType.MINIMIZE, -10.0, 10.0);
            Assert.fail("Expected OptimizationException");
        } catch (OptimizationException e) {
            // Expected
        } catch (Exception e) {
            Assert.fail("Unexpected exception: " + e);
        }
    }

    @Test
    public void testOptimize_singleStartDisabled() throws Exception {
        double[] xVals = {5.0};
        double[] yVals = {25.0};

        DummyOptimizer underlying = new DummyOptimizer(xVals, yVals);
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer optimizer = new MultiStartUnivariateRealOptimizer(underlying, 1, generator);

        double result = optimizer.optimize(new DummyFunction(), GoalType.MINIMIZE, -10.0, 10.0);
        Assert.assertEquals(5.0, result, 1e-12);

        double[] optima = optimizer.getOptima();
        double[] optimaValues = optimizer.getOptimaValues();
        Assert.assertEquals(1, optima.length);
        Assert.assertEquals(5.0, optima[0], 1e-12);
        Assert.assertEquals(25.0, optimaValues[0], 1e-12);
    }
}
