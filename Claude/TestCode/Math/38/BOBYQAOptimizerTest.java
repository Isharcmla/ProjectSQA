package org.apache.commons.math.optimization.direct;

import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BOBYQAOptimizerTest {

    /** Simple sphere function: f(x) = sum(x_i^2). */
    private static final MultivariateFunction SPHERE = new MultivariateFunction() {
        public double value(double[] x) {
            double sum = 0;
            for (double v : x) {
                sum += v * v;
            }
            return sum;
        }
    };

    /** Rosenbrock-like function for 2 dimensions. */
    private static final MultivariateFunction ROSENBROCK = new MultivariateFunction() {
        public double value(double[] x) {
            double sum = 0;
            for (int i = 0; i < x.length - 1; i++) {
                final double t1 = x[i + 1] - x[i] * x[i];
                final double t2 = 1 - x[i];
                sum += 100 * t1 * t1 + t2 * t2;
            }
            return sum;
        }
    };

    // --------------------------------------------------------------------
    // Constructors
    // --------------------------------------------------------------------

    @Test
    public void testConstructor_singleArgument_createsInstance() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_threeArguments_createsInstance() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5, 10.0, 1e-8);
        assertNotNull(optimizer);
    }

    // --------------------------------------------------------------------
    // Normal / typical input cases
    // --------------------------------------------------------------------

    @Test
    public void testOptimize_sphereDimension2_minimize_returnsNearZero() {
        int dim = 2;
        int npt = 2 * dim + 1; // 5
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] startPoint = {1.0, 1.0};
        double[] lower = {-20.0, -20.0};
        double[] upper = {20.0, 20.0};

        RealPointValuePair result =
            optimizer.optimize(10000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-3);
        for (double v : result.getPoint()) {
            assertTrue(Math.abs(v) < 1e-2);
        }
    }

    @Test
    public void testOptimize_sphereDimension3_minimize_returnsNearZero() {
        int dim = 3;
        int npt = 2 * dim + 1; // 7
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] startPoint = {0.5, -0.5, 0.3};
        double[] lower = {-20.0, -20.0, -20.0};
        double[] upper = {20.0, 20.0, 20.0};

        RealPointValuePair result =
            optimizer.optimize(10000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test
    public void testOptimize_sphereDimension2_maximize_returnsBoundedResult() {
        int dim = 2;
        int npt = 2 * dim + 1; // 5
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] startPoint = {1.0, 1.0};
        double[] lower = {-5.0, -5.0};
        double[] upper = {5.0, 5.0};

        RealPointValuePair result =
            optimizer.optimize(10000, SPHERE, GoalType.MAXIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        // Maximum of sum(x_i^2) in [-5,5]^2 is at a corner (value 50).
        assertTrue(result.getValue() > 0.0);
        assertTrue(result.getValue() <= 50.0 + 1e-6);
    }

    @Test
    public void testOptimize_rosenbrockFunction_doesNotThrow() {
        int dim = 2;
        int npt = 2 * dim + 1; // 5
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] startPoint = {-1.2, 1.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};

        RealPointValuePair result =
            optimizer.optimize(20000, ROSENBROCK, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertTrue(result.getValue() >= 0.0);
    }

    @Test
    public void testOptimize_higherDimension5_minimize_returnsFiniteValue() {
        int dim = 5;
        int npt = 2 * dim + 1; // 11
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] startPoint = {1.0, -1.0, 0.5, -0.5, 0.2};
        double[] lower = {-20.0, -20.0, -20.0, -20.0, -20.0};
        double[] upper = {20.0, 20.0, 20.0, 20.0, 20.0};

        RealPointValuePair result =
            optimizer.optimize(20000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertTrue(Double.isFinite(result.getValue()));
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    @Test
    public void testOptimize_defaultRadii_minimize_sphere() {
        // Using the single-argument constructor (default radii).
        int dim = 2;
        int npt = 2 * dim + 1;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] startPoint = {2.0, -2.0};
        double[] lower = {-50.0, -50.0};
        double[] upper = {50.0, 50.0};

        RealPointValuePair result =
            optimizer.optimize(10000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-3);
    }

    @Test
    public void testOptimize_reuseOptimizerInstance_multipleCalls() {
        int dim = 2;
        int npt = 2 * dim + 1;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};

        RealPointValuePair result1 =
            optimizer.optimize(5000, SPHERE, GoalType.MINIMIZE, new double[]{1.0, 1.0}, lower, upper);
        assertNotNull(result1);

        RealPointValuePair result2 =
            optimizer.optimize(5000, SPHERE, GoalType.MINIMIZE, new double[]{-2.0, 3.0}, lower, upper);
        assertNotNull(result2);

        assertEquals(0.0, result1.getValue(), 1e-3);
        assertEquals(0.0, result2.getValue(), 1e-3);
    }

    // --------------------------------------------------------------------
    // Edge cases: boundary values
    // --------------------------------------------------------------------

    @Test
    public void testOptimize_startPointAtLowerBound_doesNotThrow() {
        int dim = 2;
        int npt = 2 * dim + 1;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        // Start exactly at the lower bound.
        double[] startPoint = {-10.0, -10.0};

        RealPointValuePair result =
            optimizer.optimize(10000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertTrue(Double.isFinite(result.getValue()));
    }

    @Test
    public void testOptimize_startPointAtUpperBound_doesNotThrow() {
        int dim = 2;
        int npt = 2 * dim + 1;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        // Start exactly at the upper bound.
        double[] startPoint = {10.0, 10.0};

        RealPointValuePair result =
            optimizer.optimize(10000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertTrue(Double.isFinite(result.getValue()));
    }

    @Test
    public void testOptimize_tightBounds_adjustsInitialRadiusAndDoesNotThrow() {
        int dim = 2;
        int npt = 2 * dim + 1;
        // Default initial radius is 10.0, but bound difference here is only 2,
        // which is less than 2 * radius, forcing an internal radius adjustment.
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] lower = {-1.0, -1.0};
        double[] upper = {1.0, 1.0};
        double[] startPoint = {0.5, -0.5};

        RealPointValuePair result =
            optimizer.optimize(10000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1e-2);
    }

    @Test
    public void testOptimize_minimumAllowedInterpolationPoints_doesNotThrow() {
        int dim = 2;
        int npt = dim + 2; // minimum allowed value: 4
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] startPoint = {1.0, 1.0};

        RealPointValuePair result =
            optimizer.optimize(10000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertTrue(Double.isFinite(result.getValue()));
    }

    @Test
    public void testOptimize_maximumAllowedInterpolationPoints_doesNotThrow() {
        int dim = 2;
        int npt = (dim + 2) * (dim + 1) / 2; // maximum allowed value: 6
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);

        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};
        double[] startPoint = {1.0, 1.0};

        RealPointValuePair result =
            optimizer.optimize(10000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);

        assertNotNull(result);
        assertTrue(Double.isFinite(result.getValue()));
    }

    // --------------------------------------------------------------------
    // Exception cases
    // --------------------------------------------------------------------

    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize_dimensionTooSmall_throwsNumberIsTooSmallException() {
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] x) {
                return x[0] * x[0];
            }
        };
        // Dimension 1 is below the minimum required dimension of 2.
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(3);

        double[] startPoint = {1.0};
        double[] lower = {-10.0};
        double[] upper = {10.0};

        optimizer.optimize(1000, f, GoalType.MINIMIZE, startPoint, lower, upper);
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimize_tooFewInterpolationPoints_throwsOutOfRangeException() {
        // For dimension 2, minimum required interpolation points is 4.
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(3);

        double[] startPoint = {1.0, 1.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};

        optimizer.optimize(1000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimize_tooManyInterpolationPoints_throwsOutOfRangeException() {
        // For dimension 2, maximum allowed interpolation points is 6.
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(7);

        double[] startPoint = {1.0, 1.0};
        double[] lower = {-10.0, -10.0};
        double[] upper = {10.0, 10.0};

        optimizer.optimize(1000, SPHERE, GoalType.MINIMIZE, startPoint, lower, upper);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize_zeroDimension_throwsNumberIsTooSmallException() {
        MultivariateFunction f = new MultivariateFunction() {
            public double value(double[] x) {
                return 0.0;
            }
        };
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(4);

        double[] startPoint = {};
        double[] lower = {};
        double[] upper = {};

        optimizer.optimize(1000, f, GoalType.MINIMIZE, startPoint, lower, upper);
    }
}
