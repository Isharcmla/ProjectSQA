package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class PowellOptimizerTest {

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_relativeThresholdTooSmall_throwsNumberIsTooSmallException() {
        new PowellOptimizer(1e-20, 1e-8);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absoluteThresholdZero_throwsNotStrictlyPositiveException() {
        new PowellOptimizer(1e-6, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absoluteThresholdNegative_throwsNotStrictlyPositiveException() {
        new PowellOptimizer(1e-6, -1.0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorWithChecker_relativeThresholdTooSmall_throwsNumberIsTooSmallException() {
        new PowellOptimizer(0.0, 1e-8, new SimpleValueChecker(1e-4, 1e-4));
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorWithChecker_absoluteThresholdNegative_throwsNotStrictlyPositiveException() {
        new PowellOptimizer(1e-6, -0.5, new SimpleValueChecker(1e-4, 1e-4));
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorFourArgs_relativeThresholdTooSmall_throwsNumberIsTooSmallException() {
        new PowellOptimizer(1e-20, 1e-8, 1e-4, 1e-4);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorFourArgs_absoluteThresholdNegative_throwsNotStrictlyPositiveException() {
        new PowellOptimizer(1e-6, -1e-8, 1e-4, 1e-4);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructorFiveArgs_relativeThresholdTooSmall_throwsNumberIsTooSmallException() {
        new PowellOptimizer(1e-20, 1e-8, 1e-4, 1e-4, new SimpleValueChecker(1e-4, 1e-4));
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructorFiveArgs_absoluteThresholdNegative_throwsNotStrictlyPositiveException() {
        new PowellOptimizer(1e-6, -1.0, 1e-4, 1e-4, new SimpleValueChecker(1e-4, 1e-4));
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_withBounds_throwsMathUnsupportedOperationException() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-6, 1e-8);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };

        optimizer.optimize(
            new MaxEval(100),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 1.0 }),
            new SimpleBounds(new double[] { 0.0 }, new double[] { 2.0 })
        );
    }

    @Test
    public void testOptimize_quadraticMinimization_findsMinimum() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-8, 1e-8);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0] - 2.0;
                double y = point[1] + 3.0;
                return x * x + y * y;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0.0, 0.0 })
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(2.0, result.getPoint()[0], 1e-4);
        Assert.assertEquals(-3.0, result.getPoint()[1], 1e-4);
        Assert.assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_quadraticMaximization_findsMaximum() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-8, 1e-8, 1e-8, 1e-8);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0] - 1.0;
                double y = point[1] - 4.0;
                return 10.0 - (x * x + y * y);
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(f),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[] { 0.0, 0.0 })
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(1.0, result.getPoint()[0], 1e-4);
        Assert.assertEquals(4.0, result.getPoint()[1], 1e-4);
        Assert.assertEquals(10.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_withCustomConvergenceChecker_terminatesCorrectly() {
        ConvergenceChecker<PointValuePair> customChecker = new ConvergenceChecker<PointValuePair>() {
            public boolean converged(int iteration, PointValuePair previous, PointValuePair current) {
                return iteration >= 2;
            }
        };

        PowellOptimizer optimizer = new PowellOptimizer(1e-13, 1e-13, customChecker);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return FastMath.pow(point[0] - 5.0, 2) + FastMath.pow(point[1] - 5.0, 2);
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(500),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0.0, 0.0 })
        );

        Assert.assertNotNull(result);
        Assert.assertTrue(result.getValue() < 50.0);
    }

    @Test
    public void testOptimize_powellSingularFunction_exercisesDirectionUpdate() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-7, 1e-7, 1e-7, 1e-7, (ConvergenceChecker<PointValuePair>) null);

        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] x) {
                double f1 = x[0] + 10 * x[1];
                double f2 = FastMath.sqrt(5.0) * (x[2] - x[3]);
                double f3 = FastMath.pow(x[1] - 2 * x[2], 2);
                double f4 = FastMath.sqrt(10.0) * FastMath.pow(x[0] - x[3], 2);
                return f1 * f1 + f2 * f2 + f3 * f3 + f4 * f4;
            }
        };

        double[] startPoint = new double[] { 3.0, -1.0, 0.0, 1.0 };
        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(startPoint)
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(0.0, result.getValue(), 1e-3);
        Assert.assertEquals(0.0, result.getPoint()[0], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[1], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[2], 0.1);
        Assert.assertEquals(0.0, result.getPoint()[3], 0.1);
    }

    @Test
    public void testOptimize_oneDimensionalFunction_findsMinimum() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-8, 1e-8);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 7.0) * (point[0] - 7.0) + 3.0;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(200),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 0.0 })
        );

        Assert.assertNotNull(result);
        Assert.assertEquals(7.0, result.getPoint()[0], 1e-4);
        Assert.assertEquals(3.0, result.getValue(), 1e-6);
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_maxEvaluationsExceeded_throwsTooManyEvaluationsException() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-12, 1e-12);
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] point) {
                return FastMath.sin(point[0]) + FastMath.cos(point[1]);
            }
        };

        optimizer.optimize(
            new MaxEval(5),
            new ObjectiveFunction(f),
            GoalType.MINIMIZE,
            new InitialGuess(new double[] { 10.0, 10.0 })
        );
    }
}
