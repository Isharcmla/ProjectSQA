package org.apache.commons.math3.util;

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import org.junit.Assert;
import org.junit.Test;

public class ContinuedFractionTest {

    @Test
    public void testEvaluate_singleParam_convergesGoldenRatio() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        double expected = (1.0 + FastMath.sqrt(5.0)) / 2.0;
        double actual = cf.evaluate(0.0);
        Assert.assertEquals(expected, actual, 1e-8);
    }

    @Test
    public void testEvaluate_withEpsilon_convergesGoldenRatio() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        double expected = (1.0 + FastMath.sqrt(5.0)) / 2.0;
        double actual = cf.evaluate(0.0, 1e-10);
        Assert.assertEquals(expected, actual, 1e-9);
    }

    @Test
    public void testEvaluate_withMaxIterations_convergesGoldenRatio() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        double expected = (1.0 + FastMath.sqrt(5.0)) / 2.0;
        double actual = cf.evaluate(0.0, 50);
        Assert.assertEquals(expected, actual, 1e-8);
    }

    @Test
    public void testEvaluate_hPrevZero_convergesCorrectly() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                if (n == 0) {
                    return 0.0;
                }
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        double expected = 1.0 / ((1.0 + FastMath.sqrt(5.0)) / 2.0);
        double actual = cf.evaluate(0.0, 1e-9, 100);
        Assert.assertEquals(expected, actual, 1e-8);
    }

    @Test(expected = MaxCountExceededException.class)
    public void testEvaluate_exceedsMaxIterations_throwsMaxCountExceededException() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return 1.0;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        cf.evaluate(0.0, 1e-15, 2);
    }

    @Test(expected = ConvergenceException.class)
    public void testEvaluate_nanDivergence_throwsConvergenceException() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                return Double.NaN;
            }

            @Override
            protected double getB(int n, double x) {
                return 1.0;
            }
        };

        cf.evaluate(1.0, 1e-9, 10);
    }

    @Test(expected = ConvergenceException.class)
    public void testEvaluate_infiniteHN_throwsConvergenceException() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                if (n == 0) {
                    return 1.0;
                }
                return Double.POSITIVE_INFINITY;
            }

            @Override
            protected double getB(int n, double x) {
                return 0.0;
            }
        };

        cf.evaluate(1.0, 1e-9, 10);
    }

    @Test(expected = ConvergenceException.class)
    public void testEvaluate_infiniteCNWithNonPositiveScale_throwsConvergenceException() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                if (n == 0) {
                    return 1e200;
                }
                return -1e200;
            }

            @Override
            protected double getB(int n, double x) {
                return -1e200;
            }
        };

        cf.evaluate(1.0, 1e-9, 10);
    }

    @Test
    public void testEvaluate_infiniteCNWithScaling_aGreaterThanB() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                if (n == 0) {
                    return 1e200;
                }
                return 1e200;
            }

            @Override
            protected double getB(int n, double x) {
                return 1e100;
            }
        };

        double actual = cf.evaluate(1.0, 1e-9, 10);
        Assert.assertFalse(Double.isNaN(actual));
        Assert.assertFalse(Double.isInfinite(actual));
    }

    @Test
    public void testEvaluate_infiniteCNWithScaling_bGreaterThanA() {
        ContinuedFraction cf = new ContinuedFraction() {
            @Override
            protected double getA(int n, double x) {
                if (n == 0) {
                    return 1e200;
                }
                return 1e150;
            }

            @Override
            protected double getB(int n, double x) {
                return 1e200;
            }
        };

        double actual = cf.evaluate(1.0, 1e-9, 10);
        Assert.assertFalse(Double.isNaN(actual));
        Assert.assertFalse(Double.isInfinite(actual));
    }
}
