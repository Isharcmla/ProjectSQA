import org.junit.Test;
import org.junit.Assert;
import org.apache.commons.math.special.Gamma;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;

public class GammaTest {

    private static final double DELTA = 1e-8;

    // ---------------------- logGamma tests ----------------------

    @Test
    public void testLogGamma_oneInput_returnsZero() {
        double result = Gamma.logGamma(1.0);
        Assert.assertEquals(0.0, result, DELTA);
    }

    @Test
    public void testLogGamma_normalValue_returnsExpected() {
        // logGamma(5) = ln(4!) = ln(24)
        double result = Gamma.logGamma(5.0);
        double expected = Math.log(24.0);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testLogGamma_halfValue_returnsExpected() {
        // logGamma(0.5) = 0.5 * ln(pi)
        double result = Gamma.logGamma(0.5);
        double expected = 0.5 * Math.log(Math.PI);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testLogGamma_largeValue_returnsFiniteValue() {
        double result = Gamma.logGamma(100.0);
        Assert.assertFalse(Double.isNaN(result));
        Assert.assertFalse(Double.isInfinite(result));
    }

    @Test
    public void testLogGamma_NaNInput_returnsNaN() {
        double result = Gamma.logGamma(Double.NaN);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testLogGamma_zeroInput_returnsNaN() {
        double result = Gamma.logGamma(0.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testLogGamma_negativeInput_returnsNaN() {
        double result = Gamma.logGamma(-1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testLogGamma_negativeLargeInput_returnsNaN() {
        double result = Gamma.logGamma(-100.5);
        Assert.assertTrue(Double.isNaN(result));
    }

    // ---------------------- regularizedGammaP tests ----------------------

    @Test
    public void testRegularizedGammaP_NaNInputA_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaP(Double.NaN, 1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_NaNInputX_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaP(1.0, Double.NaN);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_aLessOrEqualZero_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaP(0.0, 1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_aNegative_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaP(-1.0, 1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_xNegative_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaP(1.0, -1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaP_xZero_returnsZero() throws MathException {
        double result = Gamma.regularizedGammaP(1.0, 0.0);
        Assert.assertEquals(0.0, result, DELTA);
    }

    @Test
    public void testRegularizedGammaP_aGreaterEqualOneAndXGreaterThanA_returnsExpected() throws MathException {
        // a >= 1 && x > a branch - uses regularizedGammaQ internally
        double result = Gamma.regularizedGammaP(2.0, 5.0);
        Assert.assertTrue(result > 0.0 && result < 1.0);
    }

    @Test
    public void testRegularizedGammaP_seriesBranch_returnsExpected() throws MathException {
        // else branch: series calculation, a=2, x=1 (x <= a)
        double result = Gamma.regularizedGammaP(2.0, 1.0);
        Assert.assertTrue(result > 0.0 && result < 1.0);
    }

    @Test
    public void testRegularizedGammaP_aLessThanOne_returnsExpected() throws MathException {
        double result = Gamma.regularizedGammaP(0.5, 0.5);
        Assert.assertTrue(result > 0.0 && result < 1.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaP_maxIterationsExceeded_throwsException() throws MathException {
        Gamma.regularizedGammaP(1.0, 1.0, 1e-9, 0);
    }

    @Test
    public void testRegularizedGammaP_withCustomEpsilonAndIterations_returnsExpected() throws MathException {
        double result = Gamma.regularizedGammaP(2.0, 1.0, 1e-6, 10000);
        Assert.assertTrue(result > 0.0 && result < 1.0);
    }

    // ---------------------- regularizedGammaQ tests ----------------------

    @Test
    public void testRegularizedGammaQ_NaNInputA_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaQ(Double.NaN, 1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_NaNInputX_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaQ(1.0, Double.NaN);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_aLessOrEqualZero_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaQ(0.0, 1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_aNegative_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaQ(-1.0, 1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_xNegative_returnsNaN() throws MathException {
        double result = Gamma.regularizedGammaQ(1.0, -1.0);
        Assert.assertTrue(Double.isNaN(result));
    }

    @Test
    public void testRegularizedGammaQ_xZero_returnsOne() throws MathException {
        double result = Gamma.regularizedGammaQ(1.0, 0.0);
        Assert.assertEquals(1.0, result, DELTA);
    }

    @Test
    public void testRegularizedGammaQ_xLessThanA_usesRegularizedGammaP_returnsExpected() throws MathException {
        // x < a branch
        double result = Gamma.regularizedGammaQ(5.0, 1.0);
        Assert.assertTrue(result > 0.0 && result < 1.0);
    }

    @Test
    public void testRegularizedGammaQ_aLessThanOne_usesRegularizedGammaP_returnsExpected() throws MathException {
        // a < 1 branch
        double result = Gamma.regularizedGammaQ(0.5, 2.0);
        Assert.assertTrue(result > 0.0 && result < 1.0);
    }

    @Test
    public void testRegularizedGammaQ_continuedFractionBranch_returnsExpected() throws MathException {
        // else branch: continued fraction, a >= 1 and x >= a
        double result = Gamma.regularizedGammaQ(2.0, 5.0);
        Assert.assertTrue(result > 0.0 && result < 1.0);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaQ_maxIterationsExceeded_throwsException() throws MathException {
        // routes to regularizedGammaP (a < 1 branch) with maxIterations = 0
        Gamma.regularizedGammaQ(0.5, 1.0, 1e-9, 0);
    }

    @Test
    public void testRegularizedGammaQ_withCustomEpsilonAndIterations_returnsExpected() throws MathException {
        double result = Gamma.regularizedGammaQ(2.0, 5.0, 1e-6, 10000);
        Assert.assertTrue(result > 0.0 && result < 1.0);
    }

    @Test
    public void testRegularizedGammaP_plusRegularizedGammaQ_sumsToOne() throws MathException {
        double a = 3.0;
        double x = 2.5;
        double p = Gamma.regularizedGammaP(a, x);
        double q = Gamma.regularizedGammaQ(a, x);
        Assert.assertEquals(1.0, p + q, DELTA);
    }
}
