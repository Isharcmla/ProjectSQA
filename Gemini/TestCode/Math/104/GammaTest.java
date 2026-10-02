package org.apache.commons.math.special;

import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.junit.Assert;
import org.junit.Test;

public class GammaTest {

    private static final double DELTA = 1e-8;

    @Test
    public void testLogGamma_nanInput_returnsNaN() {
        Assert.assertTrue(Double.isNaN(Gamma.logGamma(Double.NaN)));
    }

    @Test
    public void testLogGamma_zeroInput_returnsNaN() {
        Assert.assertTrue(Double.isNaN(Gamma.logGamma(0.0)));
    }

    @Test
    public void testLogGamma_negativeInput_returnsNaN() {
        Assert.assertTrue(Double.isNaN(Gamma.logGamma(-1.0)));
        Assert.assertTrue(Double.isNaN(Gamma.logGamma(-5.5)));
    }

    @Test
    public void testLogGamma_positiveValues_success() {
        // Gamma(1) = 1 => logGamma(1) = 0
        Assert.assertEquals(0.0, Gamma.logGamma(1.0), DELTA);

        // Gamma(2) = 1 => logGamma(2) = 0
        Assert.assertEquals(0.0, Gamma.logGamma(2.0), DELTA);

        // Gamma(3) = 2! = 2 => logGamma(3) = ln(2)
        Assert.assertEquals(Math.log(2.0), Gamma.logGamma(3.0), DELTA);

        // Gamma(4) = 3! = 6 => logGamma(4) = ln(6)
        Assert.assertEquals(Math.log(6.0), Gamma.logGamma(4.0), DELTA);

        // Gamma(0.5) = sqrt(pi) => logGamma(0.5) = ln(sqrt(pi)) = 0.5 * ln(pi)
        Assert.assertEquals(0.5 * Math.log(Math.PI), Gamma.logGamma(0.5), DELTA);
    }

    @Test
    public void testRegularizedGammaP_nanInputs_returnsNaN() throws MathException {
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaP(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaP(1.0, Double.NaN)));
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaP(Double.NaN, Double.NaN)));
    }

    @Test
    public void testRegularizedGammaP_negativeAndZeroA_returnsNaN() throws MathException {
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaP(0.0, 1.0)));
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaP(-1.0, 1.0)));
    }

    @Test
    public void testRegularizedGammaP_negativeX_returnsNaN() throws MathException {
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaP(1.0, -1.0)));
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaP(0.5, -0.5)));
    }

    @Test
    public void testRegularizedGammaP_zeroX_returnsZero() throws MathException {
        Assert.assertEquals(0.0, Gamma.regularizedGammaP(1.0, 0.0), DELTA);
        Assert.assertEquals(0.0, Gamma.regularizedGammaP(0.5, 0.0), DELTA);
        Assert.assertEquals(0.0, Gamma.regularizedGammaP(2.0, 0.0, 1e-9, 100), DELTA);
    }

    @Test
    public void testRegularizedGammaP_seriesBranch_success() throws MathException {
        // Case: x < a (with a >= 1.0) and Case: a < 1.0
        double result1 = Gamma.regularizedGammaP(2.0, 1.0);
        // For a=2, x=1: P(2,1) = 1 - e^(-1)*(1+1) = 1 - 2/e approx 0.26424111765711533
        Assert.assertEquals(1.0 - (2.0 * Math.exp(-1.0)), result1, DELTA);

        double result2 = Gamma.regularizedGammaP(0.5, 0.5);
        Assert.assertTrue(result2 > 0.0 && result2 < 1.0);
    }

    @Test
    public void testRegularizedGammaP_continuedFractionBranch_success() throws MathException {
        // Case: a >= 1.0 and x > a (calls regularizedGammaQ)
        double result = Gamma.regularizedGammaP(2.0, 4.0);
        // For a=2, x=4: P(2,4) = 1 - e^(-4)*(1+4) = 1 - 5/e^4 approx 0.9084218
        Assert.assertEquals(1.0 - (5.0 * Math.exp(-4.0)), result, DELTA);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaP_maxIterationsExceeded_throwsException() throws MathException {
        // Force series to not converge within 1 iteration
        Gamma.regularizedGammaP(2.0, 1.0, 1e-15, 1);
    }

    @Test
    public void testRegularizedGammaQ_nanInputs_returnsNaN() throws MathException {
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaQ(Double.NaN, 1.0)));
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaQ(1.0, Double.NaN)));
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaQ(Double.NaN, Double.NaN)));
    }

    @Test
    public void testRegularizedGammaQ_negativeAndZeroA_returnsNaN() throws MathException {
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaQ(0.0, 1.0)));
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaQ(-2.0, 1.0)));
    }

    @Test
    public void testRegularizedGammaQ_negativeX_returnsNaN() throws MathException {
        Assert.assertTrue(Double.isNaN(Gamma.regularizedGammaQ(1.0, -1.0)));
    }

    @Test
    public void testRegularizedGammaQ_zeroX_returnsOne() throws MathException {
        Assert.assertEquals(1.0, Gamma.regularizedGammaQ(1.0, 0.0), DELTA);
        Assert.assertEquals(1.0, Gamma.regularizedGammaQ(0.5, 0.0), DELTA);
        Assert.assertEquals(1.0, Gamma.regularizedGammaQ(2.0, 0.0, 1e-9, 100), DELTA);
    }

    @Test
    public void testRegularizedGammaQ_seriesBranch_success() throws MathException {
        // Case: x < a or a < 1.0 (calls regularizedGammaP)
        double result1 = Gamma.regularizedGammaQ(2.0, 1.0);
        Assert.assertEquals(2.0 * Math.exp(-1.0), result1, DELTA);

        double result2 = Gamma.regularizedGammaQ(0.5, 0.5);
        double pResult = Gamma.regularizedGammaP(0.5, 0.5);
        Assert.assertEquals(1.0 - pResult, result2, DELTA);
    }

    @Test
    public void testRegularizedGammaQ_continuedFractionBranch_success() throws MathException {
        // Case: a >= 1.0 and x >= a (evaluates ContinuedFraction)
        double result = Gamma.regularizedGammaQ(2.0, 4.0);
        Assert.assertEquals(5.0 * Math.exp(-4.0), result, DELTA);

        // Test boundary where x == a
        double resultEqual = Gamma.regularizedGammaQ(3.0, 3.0);
        double pEqual = Gamma.regularizedGammaP(3.0, 3.0);
        Assert.assertEquals(1.0 - pEqual, resultEqual, DELTA);
    }

    @Test
    public void testRegularizedGamma_sumOfPAndQEqualsOne() throws MathException {
        double a = 5.0;
        double x = 4.0;
        double p = Gamma.regularizedGammaP(a, x);
        double q = Gamma.regularizedGammaQ(a, x);
        Assert.assertEquals(1.0, p + q, DELTA);

        a = 3.0;
        x = 6.0;
        p = Gamma.regularizedGammaP(a, x);
        q = Gamma.regularizedGammaQ(a, x);
        Assert.assertEquals(1.0, p + q, DELTA);
    }
}
