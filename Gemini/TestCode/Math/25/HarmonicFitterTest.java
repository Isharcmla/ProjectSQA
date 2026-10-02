package org.apache.commons.math3.optimization.fitting;

import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class HarmonicFitterTest {

    @Test
    public void testFit_withInitialGuess_convergesToExpectedValues() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());

        final double a = 2.5;
        final double omega = 1.2;
        final double phi = 0.7;

        for (int i = 0; i < 20; ++i) {
            double t = 0.2 * i;
            double y = a * FastMath.cos(omega * t + phi);
            fitter.addObservedPoint(1.0, t, y);
        }

        double[] initialGuess = new double[] { 2.0, 1.0, 0.5 };
        double[] fitted = fitter.fit(initialGuess);

        Assert.assertNotNull(fitted);
        Assert.assertEquals(3, fitted.length);
        Assert.assertEquals(a, fitted[0], 1e-4);
        Assert.assertEquals(omega, fitted[1], 1e-4);
        Assert.assertEquals(phi, fitted[2], 1e-4);
    }

    @Test
    public void testFit_withoutInitialGuess_convergesToExpectedValues() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());

        final double a = 4.0;
        final double omega = 0.8;
        final double phi = 0.3;

        for (int i = 0; i < 50; ++i) {
            double t = 0.1 * i;
            double y = a * FastMath.cos(omega * t + phi);
            fitter.addObservedPoint(1.0, t, y);
        }

        double[] fitted = fitter.fit();

        Assert.assertNotNull(fitted);
        Assert.assertEquals(3, fitted.length);
        Assert.assertEquals(a, fitted[0], 1e-3);
        Assert.assertEquals(omega, fitted[1], 1e-3);
        Assert.assertEquals(phi, fitted[2], 1e-3);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testFit_insufficientObservedPoints_throwsNumberIsTooSmallException() {
        HarmonicFitter fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());
        fitter.addObservedPoint(1.0, 0.0, 1.0);
        fitter.addObservedPoint(1.0, 1.0, 2.0);
        fitter.addObservedPoint(1.0, 2.0, 1.0);

        fitter.fit();
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesser_lessThanFourPoints_throwsNumberIsTooSmallException() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 1.0, 1.0),
            new WeightedObservedPoint(1.0, 2.0, 0.0)
        };
        new HarmonicFitter.ParameterGuesser(points);
    }

    @Test
    public void testParameterGuesser_unsortedPoints_sortsAndGuessesCorrectly() {
        final double a = 3.0;
        final double omega = 0.5;
        final double phi = 1.0;

        WeightedObservedPoint[] points = new WeightedObservedPoint[30];
        for (int i = 0; i < points.length; ++i) {
            double t = 0.3 * i;
            double y = a * FastMath.cos(omega * t + phi);
            points[i] = new WeightedObservedPoint(1.0, t, y);
        }

        // Shuffle / reverse the array to trigger insertion sort branches
        for (int i = 0; i < points.length / 2; ++i) {
            WeightedObservedPoint temp = points[i];
            points[i] = points[points.length - 1 - i];
            points[points.length - 1 - i] = temp;
        }

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        Assert.assertEquals(3, guess.length);
        Assert.assertEquals(a, guess[0], 0.5);
        Assert.assertEquals(omega, guess[1], 0.2);
    }

    @Test
    public void testParameterGuesser_fallbackBranch_computesValidGuess() {
        // Points designed to trigger ill-conditioned / fallback branch (c1/c2 < 0 or c2/c3 < 0)
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 10.0),
            new WeightedObservedPoint(1.0, 1.0, 2.0),
            new WeightedObservedPoint(1.0, 2.0, 15.0),
            new WeightedObservedPoint(1.0, 3.0, 1.0),
            new WeightedObservedPoint(1.0, 4.0, 8.0)
        };

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        Assert.assertNotNull(guess);
        Assert.assertEquals(3, guess.length);
        Assert.assertTrue(guess[0] > 0);
        Assert.assertTrue(guess[1] > 0);
        Assert.assertFalse(Double.isNaN(guess[2]));
    }

    @Test(expected = ZeroException.class)
    public void testParameterGuesser_zeroAbscissaRangeInFallback_throwsZeroException() {
        // Construct points where dx is very small to avoid NaN in dy^2/dx but xRange rounds to 0
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1e-15, -1.0),
            new WeightedObservedPoint(1.0, 2e-15, 2.0),
            new WeightedObservedPoint(1.0, 0.0, -2.0)
        };

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        guesser.guess();
    }

    @Test
    public void testParameterGuesser_perfectSineWave() {
        final double a = 1.5;
        final double omega = 2.0;
        final double phi = 0.5;

        WeightedObservedPoint[] points = new WeightedObservedPoint[100];
        for (int i = 0; i < points.length; ++i) {
            double t = 0.05 * i;
            double y = a * FastMath.cos(omega * t + phi);
            points[i] = new WeightedObservedPoint(1.0, t, y);
        }

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        Assert.assertEquals(a, guess[0], 0.1);
        Assert.assertEquals(omega, guess[1], 0.1);
        Assert.assertEquals(phi, guess[2], 0.1);
    }
}
