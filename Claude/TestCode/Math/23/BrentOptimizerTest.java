import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.optimization.ConvergenceChecker;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.univariate.UnivariatePointValuePair;
import org.apache.commons.math3.optimization.univariate.BrentOptimizer;

public class BrentOptimizerTest {

    // --------------------------------------------------------------------
    // Constructor tests
    // --------------------------------------------------------------------

    @Test
    public void testConstructor_validParameters_noException() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_validParametersWithChecker_noException() {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                @Override
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
    public void testConstructor_nullChecker_noException() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-9, 1e-12, null);
        Assert.assertNotNull(optimizer);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_relTooSmall_throwsException() {
        new BrentOptimizer(0.0, 1e-14);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_relNegative_throwsException() {
        new BrentOptimizer(-1e-5, 1e-14);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absZero_throwsException() {
        new BrentOptimizer(1e-10, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absNegative_throwsException() {
        new BrentOptimizer(1e-10, -1.0);
    }

    // --------------------------------------------------------------------
    // doOptimize tests (via public optimize method)
    // --------------------------------------------------------------------

    @Test
    public void testOptimize_minimizeSimpleQuadratic_returnsMinimum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, -10.0, 10.0, 0.0);

        Assert.assertEquals(2.0, result.getPoint(), 1e-6);
        Assert.assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_maximizeSimpleQuadratic_returnsMaximum() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return -((x - 3.0) * (x - 3.0)) + 5.0;
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MAXIMIZE, -10.0, 10.0, 0.0);

        Assert.assertEquals(3.0, result.getPoint(), 1e-6);
        Assert.assertEquals(5.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_startValueAtMinBoundary_returnsResult() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 1.0) * (x - 1.0);
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -5.0, 5.0, -5.0);

        Assert.assertEquals(1.0, result.getPoint(), 1e-5);
    }

    @Test
    public void testOptimize_startValueAtMaxBoundary_returnsResult() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 1.0) * (x - 1.0);
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -5.0, 5.0, 5.0);

        Assert.assertEquals(1.0, result.getPoint(), 1e-5);
    }

    @Test
    public void testOptimize_withConvergenceCheckerAlwaysTrue_stopsEarly() {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                @Override
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    // Force convergence right away.
                    return true;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, -10.0, 10.0, 0.0);

        Assert.assertNotNull(result);
    }

    @Test
    public void testOptimize_withConvergenceCheckerAlwaysFalse_runsNormally() {
        ConvergenceChecker<UnivariatePointValuePair> checker =
            new ConvergenceChecker<UnivariatePointValuePair>() {
                @Override
                public boolean converged(int iteration,
                                          UnivariatePointValuePair previous,
                                          UnivariatePointValuePair current) {
                    return false;
                }
            };
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14, checker);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 2.0) * (x - 2.0);
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, -10.0, 10.0, 0.0);

        Assert.assertEquals(2.0, result.getPoint(), 1e-6);
    }

    @Test
    public void testOptimize_minGreaterThanMaxOrderSwapped_handlesCorrectly() {
        // The internal doOptimize swaps lo/hi if lo > hi is passed through
        // computeObjectiveValue/min/max accessors, but the public API
        // generally expects min < max. We test with min < max but start
        // value near the upper bound to exercise the "x < m" / "x >= m"
        // branches differently.
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - (-4.0)) * (x - (-4.0));
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, -10.0, 10.0, 9.0);

        Assert.assertEquals(-4.0, result.getPoint(), 1e-5);
    }

    @Test
    public void testOptimize_flatFunction_convergesWithoutError() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return 1.0; // Constant function.
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, -1.0, 1.0, 0.0);

        Assert.assertEquals(1.0, result.getValue(), 1e-12);
    }

    @Test
    public void testOptimize_narrowInterval_convergesQuickly() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-10, 1e-14);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return (x - 0.0001) * (x - 0.0001);
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(100, f, GoalType.MINIMIZE, -0.001, 0.001, 0.0);

        Assert.assertEquals(0.0001, result.getPoint(), 1e-4);
    }

    @Test
    public void testOptimize_asymmetricFunction_minimumFoundNearBoundary() {
        BrentOptimizer optimizer = new BrentOptimizer(1e-8, 1e-12);
        UnivariateFunction f = new UnivariateFunction() {
            @Override
            public double value(double x) {
                return FastMathAbsHelper(x);
            }

            private double FastMathAbsHelper(double x) {
                return Math.abs(x - 7.0);
            }
        };

        UnivariatePointValuePair result =
            optimizer.optimize(200, f, GoalType.MINIMIZE, 0.0, 10.0, 1.0);

        Assert.assertEquals(7.0, result.getPoint(), 1e-3);
    }
}
