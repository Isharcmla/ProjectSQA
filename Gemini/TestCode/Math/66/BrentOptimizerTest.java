package org.apache.commons.math.optimization.univariate;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.optimization.GoalType;
import org.junit.Assert;
import org.junit.Test;

public class BrentOptimizerTest {

    private static class SubBrentOptimizer extends BrentOptimizer {
        public double callDoOptimize() throws MaxIterationsExceededException, FunctionEvaluationException {
            return doOptimize();
        }
    }

    @Test
    public void testConstructor_defaultSettings() {
        BrentOptimizer optimizer = new BrentOptimizer();
        Assert.assertEquals(Integer.MAX_VALUE, optimizer.getMaxEvaluations());
        Assert.assertEquals(100, optimizer.getMaximalIterationCount());
        Assert.assertEquals(1E-10, optimizer.getAbsoluteAccuracy(), 1E-15);
        Assert.assertEquals(1.0e-14, optimizer.getRelativeAccuracy(), 1E-15);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDoOptimize_throwsUnsupportedOperationException() throws Exception {
        SubBrentOptimizer optimizer = new SubBrentOptimizer();
        optimizer.callDoOptimize();
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_nonPositiveRelativeAccuracy_throwsException() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setRelativeAccuracy(0.0);
        UnivariateRealFunction f = new SinFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 5.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_negativeRelativeAccuracy_throwsException() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setRelativeAccuracy(-1.0e-5);
        UnivariateRealFunction f = new SinFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 5.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_nonPositiveAbsoluteAccuracy_throwsException() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(0.0);
        UnivariateRealFunction f = new SinFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 5.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testOptimize_negativeAbsoluteAccuracy_throwsException() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setAbsoluteAccuracy(-1.0e-5);
        UnivariateRealFunction f = new SinFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 5.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testOptimize_exceedMaxIterations_throwsException() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        optimizer.setMaximalIterationCount(1);
        UnivariateRealFunction f = new SinFunction();
        optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 5.0);
    }

    @Test
    public void testOptimize_sinFunctionMinimize_fourArgs() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        UnivariateRealFunction f = new SinFunction();
        double min = optimizer.optimize(f, GoalType.MINIMIZE, 3.0, 6.0);
        Assert.assertEquals(1.5 * Math.PI, min, 1e-8);
        Assert.assertEquals(-1.0, optimizer.getFunctionValue(), 1e-8);
        Assert.assertEquals(min, optimizer.getResult(), 1e-8);
        Assert.assertTrue(optimizer.getIterationCount() > 0);
        Assert.assertTrue(optimizer.getEvaluations() > 0);
    }

    @Test
    public void testOptimize_sinFunctionMaximize_fiveArgs() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        UnivariateRealFunction f = new SinFunction();
        double max = optimizer.optimize(f, GoalType.MAXIMIZE, 0.0, 3.0, 1.0);
        Assert.assertEquals(0.5 * Math.PI, max, 1e-8);
        Assert.assertEquals(1.0, optimizer.getFunctionValue(), 1e-8);
        Assert.assertEquals(max, optimizer.getResult(), 1e-8);
    }

    @Test
    public void testOptimize_invertedBounds_loGreaterThanHi() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        double min = optimizer.optimize(f, GoalType.MINIMIZE, 4.0, 0.0, 3.0);
        Assert.assertEquals(2.0, min, 1e-8);
        Assert.assertEquals(0.0, optimizer.getFunctionValue(), 1e-8);
    }

    @Test
    public void testOptimize_parabolicStepBranchCoverage() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 1.5) * (x - 1.5) + 3.0;
            }
        };
        double min = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 3.0, 0.5);
        Assert.assertEquals(1.5, min, 1e-7);
        Assert.assertEquals(3.0, optimizer.getFunctionValue(), 1e-7);
    }

    @Test
    public void testOptimize_maximizeQuadratic() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return -(x + 1.23) * (x + 1.23) + 7.5;
            }
        };
        double max = optimizer.optimize(f, GoalType.MAXIMIZE, -3.0, 1.0, 0.0);
        Assert.assertEquals(-1.23, max, 1e-7);
        Assert.assertEquals(7.5, optimizer.getFunctionValue(), 1e-7);
    }

    @Test
    public void testOptimize_complexPolynomialForBranchUpdates() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return Math.pow(x, 4) - 3 * Math.pow(x, 3) + 2 * x;
            }
        };
        double min = optimizer.optimize(f, GoalType.MINIMIZE, -1.0, 3.0, 2.5);
        Assert.assertTrue(min > 1.5 && min < 2.5);
    }

    @Test
    public void testOptimize_boundaryNearPoint() throws Exception {
        BrentOptimizer optimizer = new BrentOptimizer();
        UnivariateRealFunction f = new UnivariateRealFunction() {
            public double value(double x) {
                return (x - 0.0001) * (x - 0.0001);
            }
        };
        double min = optimizer.optimize(f, GoalType.MINIMIZE, 0.0, 1.0, 0.0002);
        Assert.assertEquals(0.0001, min, 1e-6);
    }
}
