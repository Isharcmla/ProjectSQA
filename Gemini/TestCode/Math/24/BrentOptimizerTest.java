package org.apache.commons.math3.optimization.univariate;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.Sin;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class BrentOptimizerTest {

    @Test
    public void testConstructor_validParameters_success() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-8);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_withChecker_success() {
        ConvergenceChecker<UnivariatePointValuePair> checker = new SimpleUnivariateValueChecker(1e-6, 1e-8);
        BrentOptimizer optimizer = new BrentOptimizer(1e-6, 1e-8, checker);
        Assert.assertNotNull(optimizer);
        Assert.assertEquals(checker, optimizer.getConvergenceChecker());
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_relativeThresholdTooSmall_throwsException() {
        new BrentOptimizer(1e-20, 1e-8);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absoluteThresholdZero_throwsException() {
        new BrentOptimizer(1e-6, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absoluteThresholdNegative_throwsException() {
        new BrentOptimizer(1e-6, -1.0);
    }

    @Test
    public void testOptimize_minimizeParabola_findsMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 2.5) * (x - 2.5) + 1.0;
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 5.0, 1.0);
        Assert.assertEquals(2.5, result.getPoint(), 1e-7);
        Assert.assertEquals(1.0, result.getValue(), 1e-7);
    }

    @Test
    public void testOptimize_maximizeParabola_findsMaximum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return -(x - 3.0) * (x - 3.0) + 5.0;
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MAXIMIZE, 0.0, 6.0, 2.0);
        Assert.assertEquals(3.0, result.getPoint(), 1e-7);
        Assert.assertEquals(5.0, result.getValue(), 1e-7);
    }

    @Test
    public void testOptimize_minGreaterThanMax_findsMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 1.0);
            }
        };

        // lo > hi branch check (min = 4.0, max = -2.0)
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 4.0, -2.0, 0.5);
        Assert.assertEquals(1.0, result.getPoint(), 1e-7);
        Assert.assertEquals(0.0, result.getValue(), 1e-7);
    }

    @Test
    public void testOptimize_sinFunction_findsExtrema() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new Sin();

        // Minimum of sin(x) near 3*pi/2 = 4.71238898
        UnivariatePointValuePair min = optimizer.optimize(100, f, GoalType.MINIMIZE, 3.0, 6.0, 4.0);
        Assert.assertEquals(1.5 * FastMath.PI, min.getPoint(), 1e-7);
        Assert.assertEquals(-1.0, min.getValue(), 1e-7);

        // Maximum of sin(x) near pi/2 = 1.5707963
        UnivariatePointValuePair max = optimizer.optimize(100, f, GoalType.MAXIMIZE, 0.0, 3.0, 1.0);
        Assert.assertEquals(0.5 * FastMath.PI, max.getPoint(), 1e-7);
        Assert.assertEquals(1.0, max.getValue(), 1e-7);
    }

    @Test
    public void testOptimize_withConvergenceChecker_earlyExit() {
        ConvergenceChecker<UnivariatePointValuePair> checker = new ConvergenceChecker<UnivariatePointValuePair>() {
            public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
                return iteration >= 2;
            }
        };

        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x;
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, -5.0, 5.0, 2.0);
        Assert.assertNotNull(result);
        Assert.assertTrue(optimizer.getIterations() <= 3);
    }

    @Test
    public void testOptimize_fourBranchesUpdateCovered_quarticFunction() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * (x - 1.0) * (x - 2.0) * (x - 3.0);
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, -0.5, 3.5, 0.1);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.getPoint() >= -0.5 && result.getPoint() <= 3.5);
    }

    @Test
    public void testOptimize_narrowIntervalGoldenSection_converges() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.abs(x - 1.234567);
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(200, f, GoalType.MINIMIZE, 0.0, 2.0, 0.5);
        Assert.assertEquals(1.234567, result.getPoint(), 1e-5);
    }

    @Test
    public void testOptimize_nonDifferentiableStepFunction_converges() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x < 0.5) ? -x : x * x;
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, -1.0, 2.0, 0.2);
        Assert.assertNotNull(result);
    }
}
