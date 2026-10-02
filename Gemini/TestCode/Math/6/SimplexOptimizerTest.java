package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.junit.Assert;
import org.junit.Test;

public class SimplexOptimizerTest {

    @Test
    public void testConstructorWithConvergenceChecker_minimization_success() {
        SimplexOptimizer optimizer = new SimplexOptimizer(new SimpleValueChecker(1e-10, 1e-10));

        MultivariateFunction parabolic = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 2.0) * (point[0] - 2.0) + (point[1] + 3.0) * (point[1] + 3.0);
            }
        };

        PointValuePair optimum = optimizer.optimize(
                new MaxEval(1000),
                new ObjectiveFunction(parabolic),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{0.0, 0.0}),
                new NelderMeadSimplex(new double[]{0.2, 0.2})
        );

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-3);
        Assert.assertEquals(-3.0, optimum.getPoint()[1], 1e-3);
        Assert.assertEquals(0.0, optimum.getValue(), 1e-4);
    }

    @Test
    public void testConstructorWithThresholds_maximization_success() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        MultivariateFunction invertedParabolic = new MultivariateFunction() {
            public double value(double[] point) {
                return -((point[0] - 1.0) * (point[0] - 1.0) + (point[1] - 4.0) * (point[1] - 4.0)) + 10.0;
            }
        };

        PointValuePair optimum = optimizer.optimize(
                new MaxEval(1000),
                new ObjectiveFunction(invertedParabolic),
                GoalType.MAXIMIZE,
                new InitialGuess(new double[]{0.0, 0.0}),
                new MultiDirectionalSimplex(new double[]{0.5, 0.5})
        );

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-3);
        Assert.assertEquals(4.0, optimum.getPoint()[1], 1e-3);
        Assert.assertEquals(10.0, optimum.getValue(), 1e-4);
    }

    @Test
    public void testOptimize_reuseSimplexAcrossCalls_success() {
        SimplexOptimizer optimizer = new SimplexOptimizer(new SimplePointChecker<PointValuePair>(1e-6, 1e-6));

        MultivariateFunction sphere = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };

        PointValuePair result1 = optimizer.optimize(
                new MaxEval(500),
                new ObjectiveFunction(sphere),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0, 1.0}),
                new NelderMeadSimplex(2)
        );

        Assert.assertEquals(0.0, result1.getPoint()[0], 1e-2);
        Assert.assertEquals(0.0, result1.getPoint()[1], 1e-2);

        PointValuePair result2 = optimizer.optimize(
                new MaxEval(500),
                new ObjectiveFunction(sphere),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{0.5, 0.5})
        );

        Assert.assertEquals(0.0, result2.getPoint()[0], 1e-2);
        Assert.assertEquals(0.0, result2.getPoint()[1], 1e-2);
    }

    @Test(expected = NullArgumentException.class)
    public void testCheckParameters_missingSimplex_throwsNullArgumentException() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };

        optimizer.optimize(
                new MaxEval(100),
                new ObjectiveFunction(function),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0})
        );
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_boundsProvided_throwsMathUnsupportedOperationException() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };

        optimizer.optimize(
                new MaxEval(100),
                new ObjectiveFunction(function),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{1.0}),
                new NelderMeadSimplex(1),
                new SimpleBounds(new double[]{0.0}, new double[]{2.0})
        );
    }

    @Test
    public void testOptimize_fourDimensionalRosenbrock_success() {
        SimplexOptimizer optimizer = new SimplexOptimizer(1e-10, 1e-10);

        MultivariateFunction rosenbrock = new MultivariateFunction() {
            public double value(double[] x) {
                double f = 0;
                for (int i = 0; i < x.length - 1; ++i) {
                    f += 100 * Math.pow(x[i + 1] - x[i] * x[i], 2) + Math.pow(x[i] - 1, 2);
                }
                return f;
            }
        };

        PointValuePair optimum = optimizer.optimize(
                new MaxEval(5000),
                new ObjectiveFunction(rosenbrock),
                GoalType.MINIMIZE,
                new InitialGuess(new double[]{-1.2, 1.0, -1.2, 1.0}),
                new NelderMeadSimplex(4)
        );

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-1);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-1);
        Assert.assertEquals(1.0, optimum.getPoint()[2], 1e-1);
        Assert.assertEquals(1.0, optimum.getPoint()[3], 1e-1);
        Assert.assertEquals(0.0, optimum.getValue(), 1e-1);
    }
}
