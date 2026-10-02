package org.apache.commons.math.optimization.univariate;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.RandomGenerator;
import org.junit.Assert;
import org.junit.Test;

public class MultiStartUnivariateRealOptimizerTest {

    private static class StubOptimizer implements BaseUnivariateRealOptimizer<UnivariateRealFunction> {
        private ConvergenceChecker<UnivariateRealPointValuePair> checker;
        private int maxEvaluations;
        private int evaluations = 10;
        private int callCount = 0;
        private boolean throwConvergenceException = false;
        private boolean throwFunctionEvaluationException = false;
        private int failOnCall = -1;
        private double fixedPoint = 2.0;
        private double fixedValue = 4.0;
        private boolean alternateValues = false;

        public void setConvergenceChecker(ConvergenceChecker<UnivariateRealPointValuePair> checker) {
            this.checker = checker;
        }

        public ConvergenceChecker<UnivariateRealPointValuePair> getConvergenceChecker() {
            return checker;
        }

        public int getMaxEvaluations() {
            return maxEvaluations;
        }

        public int getEvaluations() {
            return evaluations;
        }

        public void setMaxEvaluations(int maxEvaluations) {
            this.maxEvaluations = maxEvaluations;
        }

        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goalType, double min, double max)
                throws FunctionEvaluationException {
            return optimize(f, goalType, min, max, 0);
        }

        public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goalType, double min, double max, double startValue)
                throws FunctionEvaluationException {
            callCount++;
            if (throwConvergenceException || callCount == failOnCall) {
                throw new ConvergenceException();
            }
            if (throwFunctionEvaluationException) {
                throw new FunctionEvaluationException(min);
            }
            if (alternateValues) {
                return new UnivariateRealPointValuePair(callCount, (callCount % 2 == 0) ? 10.0 : 20.0);
            }
            return new UnivariateRealPointValuePair(fixedPoint + callCount, fixedValue + callCount);
        }
    }

    private static class DummyFunction implements UnivariateRealFunction {
        public double value(double x) {
            return x * x;
        }
    }

    @Test
    public void testSetAndGetConvergenceChecker_validChecker_returnsConfiguredChecker() {
        StubOptimizer stub = new StubOptimizer();
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, generator);

        ConvergenceChecker<UnivariateRealPointValuePair> checker = new ConvergenceChecker<UnivariateRealPointValuePair>() {
            public boolean converged(int iteration, UnivariateRealPointValuePair previous, UnivariateRealPointValuePair current) {
                return true;
            }
        };

        optimizer.setConvergenceChecker(checker);
        Assert.assertSame(checker, optimizer.getConvergenceChecker());
    }

    @Test
    public void testSetAndGetMaxEvaluations_validInput_returnsConfiguredEvaluations() {
        StubOptimizer stub = new StubOptimizer();
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, generator);

        optimizer.setMaxEvaluations(100);
        Assert.assertEquals(100, optimizer.getMaxEvaluations());
        Assert.assertEquals(100, stub.getMaxEvaluations());
    }

    @Test(expected = MathIllegalStateException.class)
    public void testGetOptima_beforeOptimizeCalled_throwsMathIllegalStateException() {
        StubOptimizer stub = new StubOptimizer();
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, generator);

        optimizer.getOptima();
    }

    @Test
    public void testOptimize_minimizeGoal_sortsAscendingAndReturnsBestPoint() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.evaluations = 5;
        RandomGenerator generator = new JDKRandomGenerator();
        generator.setSeed(42);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, generator);
        optimizer.setMaxEvaluations(100);

        DummyFunction f = new DummyFunction();
        UnivariateRealPointValuePair optimum = optimizer.optimize(f, GoalType.MINIMIZE, -10.0, 10.0);

        Assert.assertNotNull(optimum);
        Assert.assertEquals(15, optimizer.getEvaluations());
        Assert.assertEquals(85, stub.getMaxEvaluations());

        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        Assert.assertEquals(3, optima.length);
        Assert.assertSame(optimum, optima[0]);
        Assert.assertTrue(optima[0].getValue() <= optima[1].getValue());
        Assert.assertTrue(optima[1].getValue() <= optima[2].getValue());

        // Verify clone isolation
        optima[0] = null;
        Assert.assertNotNull(optimizer.getOptima()[0]);
    }

    @Test
    public void testOptimize_maximizeGoal_sortsDescendingAndReturnsBestPoint() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.evaluations = 2;
        RandomGenerator generator = new JDKRandomGenerator();
        generator.setSeed(42);
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, generator);

        DummyFunction f = new DummyFunction();
        UnivariateRealPointValuePair optimum = optimizer.optimize(f, GoalType.MAXIMIZE, -5.0, 5.0, 0.0);

        Assert.assertNotNull(optimum);
        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        Assert.assertEquals(3, optima.length);
        Assert.assertSame(optimum, optima[0]);
        Assert.assertTrue(optima[0].getValue() >= optima[1].getValue());
        Assert.assertTrue(optima[1].getValue() >= optima[2].getValue());
    }

    @Test
    public void testOptimize_partialConvergence_nullElementsSortedToEnd() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.failOnCall = 2;
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, generator);

        DummyFunction f = new DummyFunction();
        UnivariateRealPointValuePair optimum = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 10.0);

        Assert.assertNotNull(optimum);
        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        Assert.assertEquals(3, optima.length);
        Assert.assertNotNull(optima[0]);
        Assert.assertNotNull(optima[1]);
        Assert.assertNull(optima[2]);
    }

    @Test
    public void testOptimize_partialFunctionEvaluationException_nullElementsHandled() throws Exception {
        StubOptimizer stub = new StubOptimizer() {
            @Override
            public UnivariateRealPointValuePair optimize(UnivariateRealFunction f, GoalType goalType, double min, double max, double startValue)
                    throws FunctionEvaluationException {
                super.optimize(f, goalType, min, max, startValue);
                if (callCount == 1) {
                    throw new FunctionEvaluationException(min);
                }
                return new UnivariateRealPointValuePair(1.0, 2.0);
            }
        };
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 3, generator);

        DummyFunction f = new DummyFunction();
        UnivariateRealPointValuePair optimum = optimizer.optimize(f, GoalType.MINIMIZE, -1.0, 1.0);

        Assert.assertNotNull(optimum);
        UnivariateRealPointValuePair[] optima = optimizer.getOptima();
        Assert.assertEquals(3, optima.length);
        Assert.assertNotNull(optima[0]);
        Assert.assertNotNull(optima[1]);
        Assert.assertNull(optima[2]);
    }

    @Test(expected = ConvergenceException.class)
    public void testOptimize_allStartsFailWithConvergenceException_throwsConvergenceException() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.throwConvergenceException = true;
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 2, generator);

        DummyFunction f = new DummyFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 10.0);
    }

    @Test(expected = ConvergenceException.class)
    public void testOptimize_allStartsFailWithFunctionEvaluationException_throwsConvergenceException() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.throwFunctionEvaluationException = true;
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 2, generator);

        DummyFunction f = new DummyFunction();
        optimizer.optimize(f, GoalType.MAXIMIZE, -5.0, 5.0);
    }

    @Test
    public void testOptimize_comparatorEqualValues_handledProperly() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        stub.alternateValues = true;
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 4, generator);

        DummyFunction f = new DummyFunction();
        UnivariateRealPointValuePair optimum = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 10.0);
        Assert.assertNotNull(optimum);
        Assert.assertEquals(10.0, optimum.getValue(), 1e-9);

        UnivariateRealPointValuePair optimumMax = optimizer.optimize(f, GoalType.MAXIMIZE, 0.0, 10.0);
        Assert.assertNotNull(optimumMax);
        Assert.assertEquals(20.0, optimumMax.getValue(), 1e-9);
    }

    @Test
    public void testOptimize_singleStart_success() throws Exception {
        StubOptimizer stub = new StubOptimizer();
        RandomGenerator generator = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer<UnivariateRealFunction> optimizer =
                new MultiStartUnivariateRealOptimizer<UnivariateRealFunction>(stub, 1, generator);

        DummyFunction f = new DummyFunction();
        UnivariateRealPointValuePair optimum = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 1.0);

        Assert.assertNotNull(optimum);
        Assert.assertEquals(1, optimizer.getOptima().length);
    }
}
