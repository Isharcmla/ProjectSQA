import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.util.FastMath;

public class BrentOptimizerTest {

    private static final double MIN_RELATIVE_TOLERANCE = 2 * FastMath.ulp(1d);

    // -----------------------------------------------------------------
    // Constructor tests
    // -----------------------------------------------------------------

    @Test
    public void testConstructor_validParameters_noException() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_withChecker_noException() {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    return false;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_withNullChecker_noException() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, null);
        Assert.assertNotNull(optimizer);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_relTooSmall_throwsException() {
        new BrentOptimizer(MIN_RELATIVE_TOLERANCE / 2, 1e-14);
    }

    @Test
    public void testConstructor_relAtMinimumThreshold_noException() {
        BrentOptimizer optimizer = new BrentOptimizer(MIN_RELATIVE_TOLERANCE, 1e-14);
        Assert.assertNotNull(optimizer);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absZero_throwsException() {
        new BrentOptimizer(1e-10, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absNegative_throwsException() {
        new BrentOptimizer(1e-10, -1e-14);
    }

    // -----------------------------------------------------------------
    // doOptimize via public optimize() - normal cases
    // -----------------------------------------------------------------

    @Test
    public void testOptimize_minimize_simpleQuadratic_findsMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
        Assert.assertEquals(2.0, result.getPoint(), 1e-6);
        Assert.assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_maximize_simpleQuadratic_findsMaximum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return -(x - 3.0) * (x - 3.0) + 5.0;
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MAXIMIZE, -10.0, 10.0, 0.0);
        Assert.assertEquals(3.0, result.getPoint(), 1e-6);
        Assert.assertEquals(5.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_minimize_withoutStartValue_findsMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x + 1.0) * (x + 1.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -10.0, 10.0);
        Assert.assertEquals(-1.0, result.getPoint(), 1e-6);
    }

    @Test
    public void testOptimize_negativeRange_findsMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x + 5.0) * (x + 5.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -20.0, -1.0, -10.0);
        Assert.assertEquals(-5.0, result.getPoint(), 1e-6);
    }

    @Test
    public void testOptimize_startValueAtLowerBoundary_edgeCase() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 1.0) * (x - 1.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(500, f, GoalType.MINIMIZE, 0.0, 5.0, 0.0);
        Assert.assertEquals(1.0, result.getPoint(), 1e-5);
    }

    @Test
    public void testOptimize_startValueAtUpperBoundary_edgeCase() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 4.0) * (x - 4.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(500, f, GoalType.MINIMIZE, 0.0, 5.0, 5.0);
        Assert.assertEquals(4.0, result.getPoint(), 1e-5);
    }

    @Test
    public void testOptimize_minAndMaxEqualToStart_edgeCase() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return x * x;
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, 2.0, 2.0, 2.0);
        Assert.assertEquals(2.0, result.getPoint(), 1e-10);
    }

    @Test
    public void testOptimize_withConvergenceChecker_stopsEarly() {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    return true;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_withConvergenceCheckerNeverConverges_findsMinimum() {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    return false;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(500, f, GoalType.MINIMIZE, -10.0, 10.0, 0.0);
        Assert.assertEquals(2.0, result.getPoint(), 1e-6);
    }

    @Test
    public void testOptimize_asymmetricFunction_findsMinimumWithParabolicStep() {
        // Function with asymmetry to exercise parabolic interpolation branch.
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return FastMath.sin(x) + 0.1 * x * x;
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(500, f, GoalType.MINIMIZE, -5.0, 5.0, -2.0);
        Assert.assertNotNull(result);
        Assert.assertTrue(result.getValue() <= f.value(-2.0));
    }

    @Test
    public void testOptimize_flatRegionFunction_noExceptionAndValidResult() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-10);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return 5.0; // Constant function - flat everywhere.
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -3.0, 3.0, 0.0);
        Assert.assertEquals(5.0, result.getValue(), 1e-10);
        Assert.assertTrue(result.getPoint() >= -3.0 && result.getPoint() <= 3.0);
    }

    @Test
    public void testOptimize_narrowInterval_convergesQuickly() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 0.0001) * (x - 0.0001);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -0.001, 0.001, 0.0);
        Assert.assertEquals(0.0001, result.getPoint(), 1e-5);
    }

    @Test
    public void testOptimize_largeRange_findsMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            public double value(double x) {
                return (x - 1000.0) * (x - 1000.0);
            }
        };
        UnivariatePointValuePair result =
            optimizer.optimize(1000, f, GoalType.MINIMIZE, -10000.0, 10000.0, 0.0);
        Assert.assertEquals(1000.0, result.getPoint(), 1e-3);
    }
}
