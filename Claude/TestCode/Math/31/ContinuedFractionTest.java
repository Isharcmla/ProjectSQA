import org.junit.Assert;
import org.junit.Test;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MaxCountExceededException;

public class ContinuedFractionTest {

    // Continued fraction representing sqrt(2): a0=1, a_n=2 (n>=1), b_n=1 (n>=1)
    private static class Sqrt2ContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            return (n == 0) ? 1.0 : 2.0;
        }

        @Override
        protected double getB(int n, double x) {
            return 1.0;
        }
    }

    // Continued fraction where a0 = 0 to trigger the "hPrev == 0" branch
    private static class ZeroA0ContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            return (n == 0) ? 0.0 : 1.0;
        }

        @Override
        protected double getB(int n, double x) {
            return 1.0;
        }
    }

    // Forces cN or q2 to be infinite, with scale <= 0 -> throws ConvergenceException "Can't scale"
    private static class NegativeScaleContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 0) {
                return Double.MAX_VALUE;
            }
            return -1.0;
        }

        @Override
        protected double getB(int n, double x) {
            return -1.0;
        }
    }

    // Forces cN infinite initially, but scale > 0 and a > b branch succeeds in rescaling
    private static class ScaleSuccessAGreaterBContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 0) {
                return Double.MAX_VALUE;
            }
            return 2.0;
        }

        @Override
        protected double getB(int n, double x) {
            return 0.0;
        }
    }

    // Forces cN infinite initially, but scale > 0 and a <= b (b != 0) branch succeeds in rescaling
    private static class ScaleSuccessBBranchContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 0) {
                return Double.MAX_VALUE;
            }
            return 2.0;
        }

        @Override
        protected double getB(int n, double x) {
            return 2.0;
        }
    }

    // Produces q2 == 0 with cN != 0, causing hN to become Infinite directly
    private static class InfinityDivergenceContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            if (n == 0) {
                return 1.0;
            }
            return 0.0;
        }

        @Override
        protected double getB(int n, double x) {
            if (n == 0) {
                return 0.0;
            }
            return 5.0;
        }
    }

    // Produces 0/0 causing NaN divergence
    private static class NanDivergenceContinuedFraction extends ContinuedFraction {
        @Override
        protected double getA(int n, double x) {
            return 0.0;
        }

        @Override
        protected double getB(int n, double x) {
            return 0.0;
        }
    }

    @Test
    public void testEvaluate_normalInput_convergesToSqrt2() {
        ContinuedFraction cf = new Sqrt2ContinuedFraction();
        double result = cf.evaluate(0.0);
        Assert.assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testEvaluateWithEpsilon_normalInput_convergesToSqrt2() {
        ContinuedFraction cf = new Sqrt2ContinuedFraction();
        double result = cf.evaluate(0.0, 1e-10);
        Assert.assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testEvaluateWithMaxIterations_normalInput_convergesToSqrt2() {
        ContinuedFraction cf = new Sqrt2ContinuedFraction();
        double result = cf.evaluate(0.0, 1000);
        Assert.assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testEvaluateWithEpsilonAndMaxIterations_normalInput_convergesToSqrt2() {
        ContinuedFraction cf = new Sqrt2ContinuedFraction();
        double result = cf.evaluate(0.0, 1e-9, 1000);
        Assert.assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testEvaluate_a0IsZero_handledCorrectly() {
        ContinuedFraction cf = new ZeroA0ContinuedFraction();
        double result = cf.evaluate(0.0, 1e-9, 1000);
        Assert.assertFalse(Double.isNaN(result));
        Assert.assertFalse(Double.isInfinite(result));
    }

    @Test(expected = MaxCountExceededException.class)
    public void testEvaluate_maxIterationsTooSmall_throwsMaxCountExceededException() {
        ContinuedFraction cf = new Sqrt2ContinuedFraction();
        cf.evaluate(0.0, 1);
    }

    @Test(expected = ConvergenceException.class)
    public void testEvaluate_negativeScale_throwsConvergenceException() {
        ContinuedFraction cf = new NegativeScaleContinuedFraction();
        cf.evaluate(0.0);
    }

    @Test
    public void testEvaluate_scaleSuccessAGreaterB_returnsFiniteValue() {
        ContinuedFraction cf = new ScaleSuccessAGreaterBContinuedFraction();
        double result = cf.evaluate(0.0);
        Assert.assertFalse(Double.isNaN(result));
        Assert.assertFalse(Double.isInfinite(result));
    }

    @Test
    public void testEvaluate_scaleSuccessBBranch_returnsFiniteValue() {
        ContinuedFraction cf = new ScaleSuccessBBranchContinuedFraction();
        double result = cf.evaluate(0.0);
        Assert.assertFalse(Double.isNaN(result));
        Assert.assertFalse(Double.isInfinite(result));
    }

    @Test(expected = ConvergenceException.class)
    public void testEvaluate_infinityDivergence_throwsConvergenceException() {
        ContinuedFraction cf = new InfinityDivergenceContinuedFraction();
        cf.evaluate(0.0);
    }

    @Test(expected = ConvergenceException.class)
    public void testEvaluate_nanDivergence_throwsConvergenceException() {
        ContinuedFraction cf = new NanDivergenceContinuedFraction();
        cf.evaluate(0.0);
    }

    @Test
    public void testEvaluate_negativeXInput_doesNotAffectConstantCoefficients() {
        ContinuedFraction cf = new Sqrt2ContinuedFraction();
        double result = cf.evaluate(-5.0);
        Assert.assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testEvaluate_zeroXInput_convergesToSqrt2() {
        ContinuedFraction cf = new Sqrt2ContinuedFraction();
        double result = cf.evaluate(0.0);
        Assert.assertEquals(Math.sqrt(2.0), result, 1e-6);
    }

    @Test
    public void testEvaluate_largeMaxIterations_convergesSuccessfully() {
        ContinuedFraction cf = new Sqrt2ContinuedFraction();
        double result = cf.evaluate(0.0, Integer.MAX_VALUE);
        Assert.assertEquals(Math.sqrt(2.0), result, 1e-6);
    }
}
