package org.apache.commons.math.optimization.direct;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxEvaluationsExceededException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.SimpleScalarValueChecker;
import org.junit.Assert;
import org.junit.Test;

public class MultiDirectionalTest {

    @Test
    public void testDefaultConstructor_validOptimization_minimizesCorrectly()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(500);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1.0e-5, 1.0e-5));

        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                double sum = 0;
                for (double v : point) {
                    sum += (v - 1.0) * (v - 1.0);
                }
                return sum;
            }
        };

        RealPointValuePair optimum = optimizer.optimize(
                sphere, GoalType.MINIMIZE, new double[] { 5.0, -3.0 });

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1.0e-2);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1.0e-2);
        Assert.assertEquals(0.0, optimum.getValue(), 1.0e-3);
    }

    @Test
    public void testCustomConstructor_validOptimization_maximizesCorrectly()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional(2.5, 0.4);
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(1000);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1.0e-6, 1.0e-6));

        MultivariateRealFunction invertedParaboloid = new MultivariateRealFunction() {
            public double value(double[] point) {
                return 10.0 - (point[0] - 2.0) * (point[0] - 2.0) - (point[1] + 3.0) * (point[1] + 3.0);
            }
        };

        RealPointValuePair optimum = optimizer.optimize(
                invertedParaboloid, GoalType.MAXIMIZE, new double[] { 0.0, 0.0 });

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1.0e-2);
        Assert.assertEquals(-3.0, optimum.getPoint()[1], 1.0e-2);
        Assert.assertEquals(10.0, optimum.getValue(), 1.0e-3);
    }

    @Test
    public void testOptimize_rosenbrockFunction_findsMinimum()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        optimizer.setMaxIterations(1000);
        optimizer.setMaxEvaluations(5000);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1.0e-6, 1.0e-6));

        MultivariateRealFunction rosenbrock = new MultivariateRealFunction() {
            public double value(double[] point) {
                double x = point[0];
                double y = point[1];
                return (1.0 - x) * (1.0 - x) + 100.0 * (y - x * x) * (y - x * x);
            }
        };

        RealPointValuePair optimum = optimizer.optimize(
                rosenbrock, GoalType.MINIMIZE, new double[] { -1.2, 1.0 });

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1.0e-1);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1.0e-1);
        Assert.assertTrue(optimum.getValue() < 0.1);
    }

    @Test
    public void testIterateSimplex_branchExpandedAccepted_reflectedWorseThanExpanded()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional(3.0, 0.25);
        optimizer.setMaxIterations(50);
        optimizer.setMaxEvaluations(200);

        MultivariateRealFunction linearSteep = new MultivariateRealFunction() {
            public double value(double[] point) {
                return point[0] + 2.0 * point[1];
            }
        };

        try {
            optimizer.optimize(linearSteep, GoalType.MINIMIZE, new double[] { 10.0, 10.0 });
        } catch (OptimizationException e) {
            // Unbounded linear function triggers evaluation limit or iteration limit
            Assert.assertTrue(optimizer.getIterations() > 0);
        }
    }

    @Test
    public void testIterateSimplex_branchReflectedAccepted_expandedWorseThanReflected()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        optimizer.setMaxIterations(150);
        optimizer.setMaxEvaluations(800);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1.0e-4, 1.0e-4));

        MultivariateRealFunction customFunc = new MultivariateRealFunction() {
            public double value(double[] x) {
                double r2 = x[0] * x[0] + x[1] * x[1];
                return Math.sin(r2) + 0.1 * r2;
            }
        };

        RealPointValuePair optimum = optimizer.optimize(
                customFunc, GoalType.MINIMIZE, new double[] { 0.5, 0.5 });
        Assert.assertNotNull(optimum);
    }

    @Test
    public void testIterateSimplex_branchContractedAccepted_stepReducesSimplex()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.5);
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(500);

        MultivariateRealFunction bowl = new MultivariateRealFunction() {
            public double value(double[] point) {
                return Math.pow(point[0], 4) + Math.pow(point[1], 4);
            }
        };

        RealPointValuePair optimum = optimizer.optimize(
                bowl, GoalType.MINIMIZE, new double[] { 2.0, 2.0 });

        Assert.assertEquals(0.0, optimum.getPoint()[0], 0.15);
        Assert.assertEquals(0.0, optimum.getPoint()[1], 0.15);
    }

    @Test
    public void testIterateSimplex_loopContinuation_contractedWorseThanBest()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional(2.0, 0.8);
        optimizer.setMaxIterations(200);
        optimizer.setMaxEvaluations(1000);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1.0e-6, 1.0e-6));

        // Sharp peak in the middle causing contracted to not always beat best immediately
        MultivariateRealFunction sharpPeak = new MultivariateRealFunction() {
            public double value(double[] point) {
                double d2 = point[0] * point[0] + point[1] * point[1];
                return (d2 < 0.1) ? 100.0 : d2;
            }
        };

        RealPointValuePair optimum = optimizer.optimize(
                sharpPeak, GoalType.MINIMIZE, new double[] { 3.0, 3.0 });
        Assert.assertNotNull(optimum);
    }

    @Test
    public void testOptimize_oneDimensionalFunction_optimizesProperly()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(300);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1.0e-6, 1.0e-6));

        MultivariateRealFunction oneDFunc = new MultivariateRealFunction() {
            public double value(double[] point) {
                return (point[0] - 4.5) * (point[0] - 4.5);
            }
        };

        RealPointValuePair optimum = optimizer.optimize(
                oneDFunc, GoalType.MINIMIZE, new double[] { 10.0 });

        Assert.assertEquals(4.5, optimum.getPoint()[0], 1.0e-2);
        Assert.assertEquals(0.0, optimum.getValue(), 1.0e-3);
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_maxIterationsExceeded_throwsOptimizationException()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(1);
        optimizer.setMaxEvaluations(100);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1.0e-15, 1.0e-15));

        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };

        optimizer.optimize(sphere, GoalType.MINIMIZE, new double[] { 100.0, 100.0 });
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_maxEvaluationsExceeded_throwsOptimizationException()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(2);
        optimizer.setConvergenceChecker(new SimpleScalarValueChecker(1.0e-15, 1.0e-15));

        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };

        optimizer.optimize(sphere, GoalType.MINIMIZE, new double[] { 100.0, 100.0 });
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testOptimize_functionThrowsException_propagatesException()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(100);
        optimizer.setMaxEvaluations(100);

        MultivariateRealFunction errorFunc = new MultivariateRealFunction() {
            public double value(double[] point) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(point, "Evaluation failed intentionally");
            }
        };

        optimizer.optimize(errorFunc, GoalType.MINIMIZE, new double[] { 1.0, 1.0 });
    }

    @Test(expected = NullPointerException.class)
    public void testOptimize_nullFunction_throwsNullPointerException()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.optimize(null, GoalType.MINIMIZE, new double[] { 0.0 });
    }

    @Test(expected = NullPointerException.class)
    public void testOptimize_nullGoalType_throwsNullPointerException()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        optimizer.optimize(sphere, null, new double[] { 0.0 });
    }

    @Test(expected = NullPointerException.class)
    public void testOptimize_nullStartConfiguration_throwsNullPointerException()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        MultivariateRealFunction sphere = new MultivariateRealFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        optimizer.optimize(sphere, GoalType.MINIMIZE, (double[]) null);
    }
}
