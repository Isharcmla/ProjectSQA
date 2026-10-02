import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer;

public class PowellOptimizerTest {

    private static final double EPS = 1e-6;

    @Before
    public void setUp() {
        // no shared state needed
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_validParameters_noException() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_withChecker_valid() {
        ConvergenceChecker<PointValuePair> checker =
            new SimplePointChecker<PointValuePair>(1e-10, 1e-10);
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10, checker);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_fourArgs_valid() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10, 1e-8, 1e-8);
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_fourArgsWithChecker_valid() {
        ConvergenceChecker<PointValuePair> checker =
            new SimplePointChecker<PointValuePair>(1e-10, 1e-10);
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10, 1e-8, 1e-8, checker);
        assertNotNull(optimizer);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_relTooSmall_throwsNumberIsTooSmallException() {
        new PowellOptimizer(1e-20, 1e-10);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absNotPositive_throwsNotStrictlyPositiveException() {
        new PowellOptimizer(1e-10, 0.0);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_absNegative_throwsNotStrictlyPositiveException() {
        new PowellOptimizer(1e-10, -1.0);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testConstructor_fourArgs_relTooSmall_throwsException() {
        new PowellOptimizer(0.0, 1e-10, 1e-8, 1e-8);
    }

    // ---------- Optimize tests ----------

    @Test
    public void testOptimize_simpleQuadratic1D_findsMinimum() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0] - 5.0;
                return x * x;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(function),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0.0}));

        assertEquals(5.0, result.getPoint()[0], 1e-4);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_quadratic2D_findsMinimum() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                double dx = point[0] - 2.0;
                double dy = point[1] - 3.0;
                return dx * dx + dy * dy;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(5000),
            new ObjectiveFunction(function),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0.0, 0.0}));

        assertEquals(2.0, result.getPoint()[0], 1e-3);
        assertEquals(3.0, result.getPoint()[1], 1e-3);
        assertEquals(0.0, result.getValue(), 1e-5);
    }

    @Test
    public void testOptimize_maximize_findsMaximum() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                double dx = point[0] - 1.0;
                return -(dx * dx);
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(function),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[]{5.0}));

        assertEquals(1.0, result.getPoint()[0], 1e-4);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_negativeStartPoint_findsMinimum() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0] + 3.0;
                return x * x;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(function),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{-10.0}));

        assertEquals(-3.0, result.getPoint()[0], 1e-4);
        assertEquals(0.0, result.getValue(), 1e-6);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_withBounds_throwsMathUnsupportedOperationException() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };

        optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(function),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0.0}),
            new SimpleBounds(new double[]{-10.0}, new double[]{10.0}));
    }

    @Test
    public void testOptimize_withConvergenceChecker_usesCheckerAndFindsMinimum() {
        ConvergenceChecker<PointValuePair> checker =
            new SimplePointChecker<PointValuePair>(1e-6, 1e-6);
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10, checker);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                double dx = point[0] - 4.0;
                double dy = point[1] + 2.0;
                return dx * dx + dy * dy;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(5000),
            new ObjectiveFunction(function),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0.0, 0.0}));

        assertEquals(4.0, result.getPoint()[0], 1e-2);
        assertEquals(-2.0, result.getPoint()[1], 1e-2);
    }

    @Test
    public void testOptimize_multiDimensional3D_findsMinimum() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                double dx = point[0] - 1.0;
                double dy = point[1] - 2.0;
                double dz = point[2] - 3.0;
                return dx * dx + dy * dy + dz * dz;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(10000),
            new ObjectiveFunction(function),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0.0, 0.0, 0.0}));

        assertEquals(1.0, result.getPoint()[0], 1e-3);
        assertEquals(2.0, result.getPoint()[1], 1e-3);
        assertEquals(3.0, result.getPoint()[2], 1e-3);
        assertEquals(0.0, result.getValue(), 1e-5);
    }

    @Test
    public void testOptimize_startAtMinimum_returnsSameOrBetterValue() {
        PowellOptimizer optimizer = new PowellOptimizer(1e-10, 1e-10);
        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0];
                return x * x;
            }
        };

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(function),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0.0}));

        assertEquals(0.0, result.getValue(), 1e-9);
    }
}
