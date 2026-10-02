package org.apache.commons.math.optimization.fitting;

import org.apache.commons.math.analysis.function.Gaussian;
import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;
import org.junit.Assert;
import org.junit.Test;

public class GaussianFitterTest {

    @Test
    public void testFitWithInitialGuess_normalData_returnsAccurateParameters() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        GaussianFitter fitter = new GaussianFitter(optimizer);

        Gaussian.Parametric f = new Gaussian.Parametric();
        double norm = 4.0;
        double mean = 2.0;
        double sigma = 1.5;
        double[] expectedParams = new double[] { norm, mean, sigma };

        for (double x = -2.0; x <= 6.0; x += 0.5) {
            double y = f.value(x, expectedParams);
            fitter.addObservedPoint(1.0, x, y);
        }

        double[] initialGuess = new double[] { 3.5, 1.8, 1.2 };
        double[] actualParams = fitter.fit(initialGuess);

        Assert.assertEquals(norm, actualParams[0], 1e-4);
        Assert.assertEquals(mean, actualParams[1], 1e-4);
        Assert.assertEquals(sigma, actualParams[2], 1e-4);
    }

    @Test
    public void testFitWithoutInitialGuess_normalData_returnsAccurateParameters() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        GaussianFitter fitter = new GaussianFitter(optimizer);

        double[] xValues = {
            4.0254623, 4.03128248, 4.03839603, 4.04421621, 4.05132976,
            4.05326982, 4.05779662, 4.0636168, 4.06943698, 4.07525716,
            4.08237071, 4.08366408
        };
        double[] yValues = {
            531026.0, 984167.0, 1887233.0, 2687152.0, 3461228.0,
            3580526.0, 3439750.0, 2877648.0, 2175960.0, 1447024.0,
            717104.0, 620014.0
        };

        for (int i = 0; i < xValues.length; i++) {
            fitter.addObservedPoint(xValues[i], yValues[i]);
        }

        double[] parameters = fitter.fit();
        Assert.assertNotNull(parameters);
        Assert.assertEquals(3, parameters.length);
        Assert.assertEquals(3580526.0, parameters[0], 500000.0);
        Assert.assertEquals(4.053, parameters[1], 0.01);
        Assert.assertTrue(parameters[2] > 0);
    }

    @Test
    public void testFitWithInitialGuess_handlesNegativeSigmaGracefully() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        GaussianFitter fitter = new GaussianFitter(optimizer);

        fitter.addObservedPoint(1.0, 1.0);
        fitter.addObservedPoint(2.0, 5.0);
        fitter.addObservedPoint(3.0, 1.0);

        // Initial guess with non-strictly positive sigma triggers NotStrictlyPositiveException in inner function
        double[] initialGuess = new double[] { 5.0, 2.0, -1.0 };
        double[] fitResult = fitter.fit(initialGuess);
        Assert.assertNotNull(fitResult);
    }

    @Test(expected = NullArgumentException.class)
    public void testParameterGuesserConstructor_nullArray_throwsNullArgumentException() {
        new GaussianFitter.ParameterGuesser(null);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserConstructor_emptyArray_throwsNumberIsTooSmallException() {
        new GaussianFitter.ParameterGuesser(new WeightedObservedPoint[0]);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserConstructor_lessThanThreePoints_throwsNumberIsTooSmallException() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 1.0, 1.0),
            new WeightedObservedPoint(1.0, 2.0, 2.0)
        };
        new GaussianFitter.ParameterGuesser(points);
    }

    @Test
    public void testParameterGuesser_guessValidPoints_returnsExpectedParameters() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 0.1),
            new WeightedObservedPoint(1.0, 1.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, 4.0),
            new WeightedObservedPoint(1.0, 3.0, 2.0),
            new WeightedObservedPoint(1.0, 4.0, 0.1)
        };

        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess1 = guesser.guess();
        double[] guess2 = guesser.guess();

        Assert.assertNotNull(guess1);
        Assert.assertEquals(3, guess1.length);
        Assert.assertArrayEquals(guess1, guess2, 1e-10);
        Assert.assertNotSame(guess1, guess2);
        Assert.assertEquals(4.0, guess1[0], 1e-6); // norm is max Y
        Assert.assertEquals(2.0, guess1[1], 1e-6); // mean is X at max Y
        Assert.assertTrue(guess1[2] > 0.0);         // sigma
    }

    @Test
    public void testParameterGuesser_interpolationFallbackToTotalRange_whenHalfYOutOfRange() {
        // Construct points where halfY triggers OutOfRangeException in interpolation
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 10.0, 10.0),
            new WeightedObservedPoint(1.0, 20.0, 100.0),
            new WeightedObservedPoint(1.0, 30.0, 10.0)
        };

        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();
        Assert.assertNotNull(guess);
        Assert.assertEquals(100.0, guess[0], 1e-6);
        Assert.assertEquals(20.0, guess[1], 1e-6);
        Assert.assertTrue(guess[2] > 0.0);
    }

    @Test
    public void testParameterGuesser_pointsWithExactHalfYValues() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 1.0, 0.5),
            new WeightedObservedPoint(1.0, 2.0, 1.0),
            new WeightedObservedPoint(1.0, 3.0, 0.5)
        };

        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();
        Assert.assertNotNull(guess);
        Assert.assertEquals(1.0, guess[0], 1e-6);
        Assert.assertEquals(2.0, guess[1], 1e-6);
        Assert.assertTrue(guess[2] > 0.0);
    }

    @Test
    public void testParameterGuesser_comparatorBranchesCoverage() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 2.0, 3.0),
            new WeightedObservedPoint(1.0, 2.0, 4.0),
            new WeightedObservedPoint(1.0, 2.0, 2.0),
            new WeightedObservedPoint(2.0, 2.0, 3.0),
            new WeightedObservedPoint(0.5, 2.0, 3.0),
            new WeightedObservedPoint(1.0, 1.0, 3.0),
            new WeightedObservedPoint(1.0, 3.0, 3.0),
            new WeightedObservedPoint(1.0, 2.0, 3.0)
        };

        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();
        Assert.assertNotNull(guess);
        Assert.assertEquals(3, guess.length);
    }
}
