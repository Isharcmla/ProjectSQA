import org.apache.commons.math3.optimization.fitting.HarmonicFitter;
import org.apache.commons.math3.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import org.apache.commons.math3.exception.ZeroException;
import org.apache.commons.math3.exception.MathIllegalStateException;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarmonicFitterTest {

    private HarmonicFitter fitter;

    @Before
    public void setUp() {
        fitter = new HarmonicFitter(new LevenbergMarquardtOptimizer());
    }

    // ---------------------------------------------------------------
    // Normal / typical input cases
    // ---------------------------------------------------------------

    @Test
    public void testFit_withInitialGuess_returnsCorrectParameters() {
        final double a = 2.0;
        final double omega = 1.5;
        final double phi = 0.3;

        for (double x = 0; x < 10; x += 0.1) {
            double y = a * Math.cos(omega * x + phi);
            fitter.addObservedPoint(1.0, x, y);
        }

        double[] fitted = fitter.fit(new double[] { 1.8, 1.4, 0.2 });

        assertNotNull(fitted);
        assertEquals(3, fitted.length);
        assertEquals(a, fitted[0], 1e-4);
        assertEquals(omega, fitted[1], 1e-4);
        assertEquals(phi, fitted[2], 1e-4);
    }

    @Test
    public void testFit_withoutInitialGuess_returnsParameters() {
        final double a = 3.0;
        final double omega = 2.0;
        final double phi = 0.5;

        for (double x = 0; x < 5; x += 0.05) {
            double y = a * Math.cos(omega * x + phi);
            fitter.addObservedPoint(1.0, x, y);
        }

        double[] fitted = fitter.fit();

        assertNotNull(fitted);
        assertEquals(3, fitted.length);
        assertEquals(a, fitted[0], 1e-3);
        assertEquals(omega, fitted[1], 1e-3);
    }

    @Test
    public void testFit_withSimpleAddObservedPointOverload_producesParameters() {
        final double a = 1.0;
        final double omega = 1.0;
        final double phi = 0.0;

        for (double x = 0; x < 6; x += 0.1) {
            double y = a * Math.cos(omega * x + phi);
            // using overload without explicit weight (default weight = 1.0)
            fitter.addObservedPoint(x, y);
        }

        double[] fitted = fitter.fit(new double[] { 0.9, 0.9, 0.1 });

        assertNotNull(fitted);
        assertEquals(3, fitted.length);
        assertEquals(a, fitted[0], 1e-2);
        assertEquals(omega, fitted[1], 1e-2);
    }

    @Test
    public void testParameterGuesser_guess_typicalSineData_returnsReasonableGuess() {
        final double a = 2.0;
        final double omega = 1.0;
        final double phi = 0.0;

        WeightedObservedPoint[] points = new WeightedObservedPoint[20];
        for (int i = 0; i < 20; i++) {
            double x = i * 0.1;
            double y = a * Math.cos(omega * x + phi);
            points[i] = new WeightedObservedPoint(1.0, x, y);
        }

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        assertNotNull(guess);
        assertEquals(3, guess.length);
        assertTrue("amplitude guess should be positive", guess[0] > 0);
        assertTrue("omega guess should be positive", guess[1] > 0);
    }

    // ---------------------------------------------------------------
    // Edge cases: boundary values, unsorted data, minimal data size
    // ---------------------------------------------------------------

    @Test
    public void testParameterGuesser_guess_unsortedData_sortsAndGuessesWithoutError() {
        final double a = 1.0;
        final double omega = 1.0;
        final double phi = 0.0;

        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.3, a * Math.cos(omega * 0.3 + phi)),
            new WeightedObservedPoint(1.0, 0.0, a * Math.cos(omega * 0.0 + phi)),
            new WeightedObservedPoint(1.0, 0.2, a * Math.cos(omega * 0.2 + phi)),
            new WeightedObservedPoint(1.0, 0.1, a * Math.cos(omega * 0.1 + phi)),
            new WeightedObservedPoint(1.0, 0.4, a * Math.cos(omega * 0.4 + phi))
        };

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        assertNotNull(guess);
        assertEquals(3, guess.length);
    }

    @Test
    public void testParameterGuesser_constructor_exactlyMinimumFourPoints_doesNotThrow() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 1.0),
            new WeightedObservedPoint(1.0, 1.0, 0.5),
            new WeightedObservedPoint(1.0, 2.0, -0.5),
            new WeightedObservedPoint(1.0, 3.0, -1.0)
        };

        // Should not throw since the minimum number of observations (4) is met.
        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        assertNotNull(guesser);
    }

    @Test
    public void testParameterGuesser_guess_negativeAndZeroYValues_handledWithoutException() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 0.5, -1.0),
            new WeightedObservedPoint(1.0, 1.0, 0.0),
            new WeightedObservedPoint(1.0, 1.5, 1.0),
            new WeightedObservedPoint(1.0, 2.0, 0.0)
        };

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        assertNotNull(guess);
        assertEquals(3, guess.length);
    }

    @Test
    public void testHarmonicFitter_constructor_createsNonNullInstance() {
        assertNotNull(fitter);
    }

    // ---------------------------------------------------------------
    // Exception cases
    // ---------------------------------------------------------------

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserConstructor_tooFewPoints_throwsException() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 0.0),
            new WeightedObservedPoint(1.0, 1.0, 1.0),
            new WeightedObservedPoint(1.0, 2.0, 0.0)
        };
        new HarmonicFitter.ParameterGuesser(points);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testParameterGuesserConstructor_emptyArray_throwsException() {
        WeightedObservedPoint[] points = new WeightedObservedPoint[0];
        new HarmonicFitter.ParameterGuesser(points);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testFit_withoutInitialGuess_tooFewObservations_throwsException() {
        fitter.addObservedPoint(1.0, 0.0, 0.0);
        fitter.addObservedPoint(1.0, 1.0, 1.0);
        // Only 2 observations added; ParameterGuesser requires at least 4.
        fitter.fit();
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testFit_withoutInitialGuess_noObservations_throwsException() {
        // No observations added at all.
        fitter.fit();
    }

    @Test
    public void testParameterGuesser_guess_illConditionedData_doesNotThrowUnexpectedException() {
        // This data is intentionally irregular to try exercising the
        // alternative branch inside guessAOmega() (the "if" branch) that
        // computes amplitude/omega from the min/max range instead of the
        // closed-form ratio. Note: forcing the ZeroException branch
        // deterministically (xRange == 0 while the ratio condition is also
        // true) is not reliably reproducible from the public API because
        // identical abscissas cause division by zero earlier in the
        // computation (yielding NaN/Infinity), which in turn make the
        // ratio-based condition evaluate to false. Hence that specific
        // branch is effectively unreachable through normal usage and is not
        // tested here.
        WeightedObservedPoint[] points = new WeightedObservedPoint[] {
            new WeightedObservedPoint(1.0, 0.0, 5.0),
            new WeightedObservedPoint(1.0, 1.0, -3.0),
            new WeightedObservedPoint(1.0, 2.0, 5.0),
            new WeightedObservedPoint(1.0, 3.0, -3.0),
            new WeightedObservedPoint(1.0, 4.0, 5.0)
        };

        HarmonicFitter.ParameterGuesser guesser = new HarmonicFitter.ParameterGuesser(points);
        double[] guess = guesser.guess();

        assertNotNull(guess);
        assertEquals(3, guess.length);
    }
}
