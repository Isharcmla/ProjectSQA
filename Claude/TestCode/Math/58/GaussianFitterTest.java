package org.apache.commons.math.optimization.fitting;

import static org.junit.Assert.*;

import org.junit.Test;

import org.apache.commons.math.exception.NullArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer;

public class GaussianFitterTest {

    @Test
    public void testConstructor_withValidOptimizer_createsInstance() {
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        assertNotNull(fitter);
    }

    @Test
    public void testFitWithInitialGuess_typicalData_returnsParameters() {
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        fitter.addObservedPoint(1, 1.0);
        fitter.addObservedPoint(2, 5.0);
        fitter.addObservedPoint(3, 10.0);
        fitter.addObservedPoint(4, 5.0);
        fitter.addObservedPoint(5, 1.0);

        double[] initialGuess = {10.0, 3.0, 1.0};
        double[] result = fitter.fit(initialGuess);

        assertNotNull(result);
        assertEquals(3, result.length);
    }

    @Test
    public void testFitWithoutGuess_typicalData_returnsParameters() {
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        fitter.addObservedPoint(1, 1.0);
        fitter.addObservedPoint(2, 5.0);
        fitter.addObservedPoint(3, 10.0);
        fitter.addObservedPoint(4, 5.0);
        fitter.addObservedPoint(5, 1.0);

        double[] result = fitter.fit();

        assertNotNull(result);
        assertEquals(3, result.length);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testFit_lessThanThreeObservations_throwsException() {
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        fitter.addObservedPoint(1, 1.0);
        fitter.addObservedPoint(2, 5.0);
        fitter.fit();
    }

    @Test(expected = NullArgumentException.class)
    public void testParameterGuesserConstructor_nullObservations_throwsException() {
        new GaussianFitter.ParameterGuesser(null);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserConstructor_tooFewObservations_throwsException() {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 1.0, 1.0),
            new WeightedObservedPoint(1.0, 2.0, 2.0)
        };
        new GaussianFitter.ParameterGuesser(points);
    }

    @Test
    public void testParameterGuesserGuess_typicalData_returnsGuess() {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 1.0, 1.0),
            new WeightedObservedPoint(1.0, 2.0, 5.0),
            new WeightedObservedPoint(1.0, 3.0, 10.0),
            new WeightedObservedPoint(1.0, 4.0, 5.0),
            new WeightedObservedPoint(1.0, 5.0, 1.0)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        assertNotNull(guess);
        assertEquals(3, guess.length);
        assertEquals(10.0, guess[0], 1e-6);
        assertEquals(3.0, guess[1], 1e-6);
    }

    @Test
    public void testParameterGuesserGuess_calledTwice_returnsClonedConsistentResult() {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 1.0, 1.0),
            new WeightedObservedPoint(1.0, 2.0, 5.0),
            new WeightedObservedPoint(1.0, 3.0, 10.0),
            new WeightedObservedPoint(1.0, 4.0, 5.0),
            new WeightedObservedPoint(1.0, 5.0, 1.0)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess1 = guesser.guess();
        double[] guess2 = guesser.guess();

        assertArrayEquals(guess1, guess2, 1e-9);
        assertNotSame(guess1, guess2);
    }

    @Test
    public void testParameterGuesserGuess_maxAtEdge_triggersFallbackBranch() {
        // Max Y located at the leftmost index so interpolation to the left
        // throws OutOfRangeException internally, triggering the fallback
        // calculation path in basicGuess().
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 1.0, 5.0),
            new WeightedObservedPoint(1.0, 2.0, 5.0),
            new WeightedObservedPoint(1.0, 3.0, 0.0)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        assertNotNull(guess);
        assertEquals(3, guess.length);
    }

    @Test
    public void testParameterGuesserGuess_unsortedData_sortsBeforeGuessing() {
        WeightedObservedPoint[] points = {
            new WeightedObservedPoint(1.0, 5.0, 1.0),
            new WeightedObservedPoint(1.0, 3.0, 10.0),
            new WeightedObservedPoint(1.0, 1.0, 1.0),
            new WeightedObservedPoint(1.0, 4.0, 5.0),
            new WeightedObservedPoint(1.0, 2.0, 5.0)
        };
        GaussianFitter.ParameterGuesser guesser = new GaussianFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        assertNotNull(guess);
        assertEquals(3, guess.length);
        assertEquals(10.0, guess[0], 1e-6);
        assertEquals(3.0, guess[1], 1e-6);
    }

    @Test
    public void testFitWithInitialGuess_coversInnerFunctionTryCatch_returnsResult() {
        // This also covers the try/catch logic in the inner
        // ParametricUnivariateRealFunction used by fit(double[]).
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        fitter.addObservedPoint(1, 1.0);
        fitter.addObservedPoint(2, 5.0);
        fitter.addObservedPoint(3, 10.0);
        fitter.addObservedPoint(4, 5.0);
        fitter.addObservedPoint(5, 1.0);

        double[] initialGuess = {10.0, 3.0, 1.0};
        double[] result = fitter.fit(initialGuess);

        assertNotNull(result);
    }

    @Test
    public void testAddObservedPoint_withWeight_increasesObservationCount() {
        GaussianFitter fitter = new GaussianFitter(new LevenbergMarquardtOptimizer());
        fitter.addObservedPoint(1.0, 1.0, 1.0);
        fitter.addObservedPoint(1.0, 2.0, 5.0);
        fitter.addObservedPoint(1.0, 3.0, 10.0);

        assertEquals(3, fitter.getObservations().length);
    }
}
