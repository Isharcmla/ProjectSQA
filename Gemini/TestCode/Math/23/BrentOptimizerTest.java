package org.apache.commons.math3.optimization.univariate;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.junit.Assert;
import org.junit.Test;

public class BrentOptimizerTest {

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_relativeThresholdTooSmall_throwsException() {
        new BrentOptimizer(1e-17, 1e-10);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absoluteThresholdZero_throwsException() {
        new BrentOptimizer(1e-10, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absoluteThresholdNegative_throwsException() {
        new BrentOptimizer(1e-10, -1e-5);
    }

    @Test
    public void testOptimize_minimizeParabola_foundCorrectMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 2.5) * (x - 2.5) + 3.0;
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 5.0, 1.0);
        Assert.assertEquals(2.5, result.getPoint(), 1e-6);
        Assert.assertEquals(3.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_maximizeParabola_foundCorrectMaximum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return -(x - 1.5) * (x - 1.5) + 4.0;
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MAXIMIZE, -2.0, 4.0, 0.0);
        Assert.assertEquals(1.5, result.getPoint(), 1e-6);
        Assert.assertEquals(4.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_invertedBounds_reordersBoundsCorrectly() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 3.0) * (x - 3.0);
            }
        };

        // lo > hi (min > max)
        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 5.0, 1.0, 2.0);
        Assert.assertEquals(3.0, result.getPoint(), 1e-6);
        Assert.assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_withCustomConvergenceChecker_terminatesEarly() {
        ConvergenceChecker<UnivariatePointValuePair> checker = new ConvergenceChecker<UnivariatePointValuePair>() {
            public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
                return iteration >= 2;
            }
        };

        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 4.0) * (x - 4.0);
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 10.0, 1.0);
        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_withCustomConvergenceCheckerMaximize_terminatesEarly() {
        ConvergenceChecker<UnivariatePointValuePair> checker = new ConvergenceChecker<UnivariatePointValuePair>() {
            public boolean converged(int iteration, UnivariatePointValuePair previous, UnivariatePointValuePair current) {
                return iteration >= 1;
            }
        };

        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return -(x - 4.0) * (x - 4.0);
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MAXIMIZE, 0.0, 10.0, 1.0);
        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_flatFunction_handlesIdenticalValues() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return 7.0;
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, -1.0, 1.0, 0.0);
        Assert.assertEquals(7.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_flatFunctionMaximize_handlesIdenticalValues() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return 7.0;
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MAXIMIZE, -1.0, 1.0, 0.0);
        Assert.assertEquals(7.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_minimumAtBound_handlesNearBoundCase() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x;
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 5.0, 4.0);
        Assert.assertEquals(0.0, result.getPoint(), 1e-4);
    }

    @Test
    public void testOptimize_sineFunction_convergesToExtremum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return Math.sin(x);
            }
        };

        UnivariatePointValuePair resultMin = optimizer.optimize(100, f, GoalType.MINIMIZE, 3.0, 6.0, 4.0);
        Assert.assertEquals(3.0 * Math.PI / 2.0, resultMin.getPoint(), 1e-6);

        UnivariatePointValuePair resultMax = optimizer.optimize(100, f, GoalType.MAXIMIZE, 0.0, 3.0, 1.0);
        Assert.assertEquals(Math.PI / 2.0, resultMax.getPoint(), 1e-6);
    }

    @Test
    public void testOptimize_complexNonlinearFunction_exercisesParabolaAndGoldenSection() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 2.0) * (x - 3.0) * (x - 4.0);
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.5, 2.5, 0.6);
        Assert.assertTrue(result.getPoint() > 1.0 && result.getPoint() < 2.0);
    }

    @Test
    public void testOptimize_startValueLargerThanMidpoint_exercisesDifferentIntervalBranch() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return Math.cos(x);
            }
        };

        UnivariatePointValuePair result = optimizer.optimize(100, f, GoalType.MINIMIZE, 0.0, 6.0, 5.0);
        Assert.assertEquals(Math.PI, result.getPoint(), 1e-6);
    }
}
