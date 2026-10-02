package org.apache.commons.math.analysis.solvers;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for {@link UnivariateRealSolverUtils}.
 */
public class UnivariateRealSolverUtilsTest {

    private final UnivariateRealFunction identity = new UnivariateRealFunction() {
        public double value(double x) {
            return x;
        }
    };

    private final UnivariateRealFunction linear = new UnivariateRealFunction() {
        public double value(double x) {
            return 2.0 * x - 4.0;
        }
    };

    private final UnivariateRealFunction quadratic = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x - 4.0;
        }
    };

    private final UnivariateRealFunction alwaysPositive = new UnivariateRealFunction() {
        public double value(double x) {
            return x * x + 1.0;
        }
    };

    @Test
    public void testPrivateConstructor() throws Exception {
        Constructor<UnivariateRealSolverUtils> constructor = UnivariateRealSolverUtils.class.getDeclaredConstructor();
        Assert.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        constructor.setAccessible(true);
        UnivariateRealSolverUtils instance = constructor.newInstance();
        Assert.assertNotNull(instance);
    }

    @Test
    public void testMidpoint_positiveNumbers_returnsCorrectMidpoint() {
        Assert.assertEquals(2.0, UnivariateRealSolverUtils.midpoint(1.0, 3.0), 1e-15);
    }

    @Test
    public void testMidpoint_negativeNumbers_returnsCorrectMidpoint() {
        Assert.assertEquals(-3.0, UnivariateRealSolverUtils.midpoint(-5.0, -1.0), 1e-15);
    }

    @Test
    public void testMidpoint_mixedNumbers_returnsZero() {
        Assert.assertEquals(0.0, UnivariateRealSolverUtils.midpoint(-2.5, 2.5), 1e-15);
    }

    @Test
    public void testMidpoint_sameValues_returnsValue() {
        Assert.assertEquals(5.5, UnivariateRealSolverUtils.midpoint(5.5, 5.5), 1e-15);
    }

    @Test
    public void testSolve_validFunctionAndInterval_findsRoot() throws Exception {
        double root = UnivariateRealSolverUtils.solve(linear, 1.0, 3.0);
        Assert.assertEquals(2.0, root, 1e-4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_nullFunction_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.solve(null, 1.0, 3.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_invalidInterval_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.solve(linear, 3.0, 1.0);
    }

    @Test
    public void testSolveWithAccuracy_validParameters_findsRootAccurately() throws Exception {
        double root = UnivariateRealSolverUtils.solve(quadratic, 1.0, 3.0, 1e-6);
        Assert.assertEquals(2.0, root, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithAccuracy_nullFunction_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.solve(null, 1.0, 3.0, 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveWithAccuracy_invalidInterval_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.solve(quadratic, 3.0, 1.0, 1e-6);
    }

    @Test
    public void testBracket_defaultMaxIterations_findsBracket() throws Exception {
        double[] result = UnivariateRealSolverUtils.bracket(identity, 0.5, -10.0, 10.0);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.length);
        Assert.assertTrue(result[0] <= 0.5);
        Assert.assertTrue(result[1] >= 0.5);
        Assert.assertTrue(identity.value(result[0]) * identity.value(result[1]) < 0.0);
    }

    @Test
    public void testBracket_customMaxIterations_findsBracket() throws Exception {
        double[] result = UnivariateRealSolverUtils.bracket(linear, 1.5, 0.0, 5.0, 10);
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result.length);
        Assert.assertEquals(0.5, result[0], 1e-15);
        Assert.assertEquals(2.5, result[1], 1e-15);
        Assert.assertTrue(linear.value(result[0]) * linear.value(result[1]) < 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_nullFunction_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.bracket(null, 1.0, 0.0, 2.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_zeroMaxIterations_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.bracket(identity, 1.0, 0.0, 2.0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_negativeMaxIterations_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.bracket(identity, 1.0, 0.0, 2.0, -5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_initialLessThanLowerBound_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.bracket(identity, -1.0, 0.0, 2.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_initialGreaterThanUpperBound_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.bracket(identity, 3.0, 0.0, 2.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_lowerBoundEqualsUpperBound_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.bracket(identity, 1.0, 1.0, 1.0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBracket_lowerBoundGreaterThanUpperBound_throwsIllegalArgumentException() throws Exception {
        UnivariateRealSolverUtils.bracket(identity, 1.0, 2.0, 0.0, 10);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracket_iterationExceeded_throwsConvergenceException() throws Exception {
        UnivariateRealSolverUtils.bracket(identity, 10.0, -20.0, 20.0, 2);
    }

    @Test(expected = ConvergenceException.class)
    public void testBracket_intervalExhaustedWithoutRoot_throwsConvergenceException() throws Exception {
        UnivariateRealSolverUtils.bracket(alwaysPositive, 0.0, -2.0, 2.0, 10);
    }

    @Test
    public void testBracket_asymmetricBoundsHittingLowerFirst() throws Exception {
        double[] result = UnivariateRealSolverUtils.bracket(linear, 1.0, 0.5, 10.0, 10);
        Assert.assertNotNull(result);
        Assert.assertEquals(0.5, result[0], 1e-15);
        Assert.assertEquals(3.0, result[1], 1e-15);
        Assert.assertTrue(linear.value(result[0]) * linear.value(result[1]) < 0.0);
    }

    @Test
    public void testBracket_asymmetricBoundsHittingUpperFirst() throws Exception {
        UnivariateRealFunction decreasingLinear = new UnivariateRealFunction() {
            public double value(double x) {
                return 4.0 - 2.0 * x;
            }
        };
        double[] result = UnivariateRealSolverUtils.bracket(decreasingLinear, 3.0, -10.0, 3.5, 10);
        Assert.assertNotNull(result);
        Assert.assertEquals(1.0, result[0], 1e-15);
        Assert.assertEquals(3.5, result[1], 1e-15);
        Assert.assertTrue(decreasingLinear.value(result[0]) * decreasingLinear.value(result[1]) < 0.0);
    }
}
