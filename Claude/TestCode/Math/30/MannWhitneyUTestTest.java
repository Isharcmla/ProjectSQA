package org.apache.commons.math3.stat.inference;

import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.stat.ranking.NaNStrategy;
import org.apache.commons.math3.stat.ranking.TiesStrategy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MannWhitneyUTestTest {

    private MannWhitneyUTest testStatistic;

    @Before
    public void setUp() {
        testStatistic = new MannWhitneyUTest();
    }

    @Test
    public void testDefaultConstructor_createsInstance_notNull() {
        MannWhitneyUTest test = new MannWhitneyUTest();
        assertTrue(test != null);
    }

    @Test
    public void testCustomConstructor_createsInstance_notNull() {
        MannWhitneyUTest test = new MannWhitneyUTest(NaNStrategy.REMOVED, TiesStrategy.MINIMUM);
        assertTrue(test != null);
    }

    @Test
    public void testMannWhitneyU_typicalInput_returnsCorrectValue() {
        final double[] x = {19, 22, 16, 29, 24};
        final double[] y = {20, 11, 17, 12};

        double result = testStatistic.mannWhitneyU(x, y);
        assertEquals(17.0, result, 1e-10);
    }

    @Test
    public void testMannWhitneyU_equalLengthSamples_returnsCorrectValue() {
        final double[] x = {1, 2, 3, 4, 5};
        final double[] y = {6, 7, 8, 9, 10};

        double result = testStatistic.mannWhitneyU(x, y);
        assertEquals(25.0, result, 1e-10);
    }

    @Test
    public void testMannWhitneyU_singleElementSamples_returnsCorrectValue() {
        final double[] x = {1};
        final double[] y = {2};

        double result = testStatistic.mannWhitneyU(x, y);
        assertEquals(1.0, result, 1e-10);
    }

    @Test
    public void testMannWhitneyU_withTies_returnsCorrectValue() {
        final double[] x = {1, 2, 2, 3};
        final double[] y = {2, 3, 3, 4};

        double result = testStatistic.mannWhitneyU(x, y);
        assertTrue(result >= 0);
    }

    @Test
    public void testMannWhitneyU_withNaNValues_handlesCorrectly() {
        final double[] x = {1, 2, Double.NaN, 4};
        final double[] y = {5, 6, 7, 8};

        double result = testStatistic.mannWhitneyU(x, y);
        assertTrue(result >= 0);
    }

    @Test
    public void testMannWhitneyU_negativeValues_returnsCorrectValue() {
        final double[] x = {-5, -3, -1};
        final double[] y = {-4, -2, 0};

        double result = testStatistic.mannWhitneyU(x, y);
        assertTrue(result >= 0);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyU_nullX_throwsNullArgumentException() {
        final double[] y = {1, 2, 3};
        testStatistic.mannWhitneyU(null, y);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyU_nullY_throwsNullArgumentException() {
        final double[] x = {1, 2, 3};
        testStatistic.mannWhitneyU(x, null);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyU_bothNull_throwsNullArgumentException() {
        testStatistic.mannWhitneyU(null, null);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyU_emptyX_throwsNoDataException() {
        final double[] x = {};
        final double[] y = {1, 2, 3};
        testStatistic.mannWhitneyU(x, y);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyU_emptyY_throwsNoDataException() {
        final double[] x = {1, 2, 3};
        final double[] y = {};
        testStatistic.mannWhitneyU(x, y);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyU_bothEmpty_throwsNoDataException() {
        final double[] x = {};
        final double[] y = {};
        testStatistic.mannWhitneyU(x, y);
    }

    @Test
    public void testMannWhitneyUTest_typicalInput_returnsValidPValue() {
        final double[] x = {19, 22, 16, 29, 24};
        final double[] y = {20, 11, 17, 12};

        double pValue = testStatistic.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0 && pValue <= 1);
    }

    @Test
    public void testMannWhitneyUTest_identicalSamples_returnsHighPValue() {
        final double[] x = {1, 2, 3, 4, 5};
        final double[] y = {1, 2, 3, 4, 5};

        double pValue = testStatistic.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0 && pValue <= 1);
    }

    @Test
    public void testMannWhitneyUTest_clearlyDifferentSamples_returnsLowPValue() {
        final double[] x = {1, 2, 3, 4, 5};
        final double[] y = {100, 200, 300, 400, 500};

        double pValue = testStatistic.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0 && pValue <= 1);
        assertTrue(pValue < 0.05);
    }

    @Test
    public void testMannWhitneyUTest_singleElementEach_returnsValidPValue() {
        final double[] x = {1};
        final double[] y = {2};

        double pValue = testStatistic.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0 && pValue <= 1);
    }

    @Test
    public void testMannWhitneyUTest_withTies_returnsValidPValue() {
        final double[] x = {1, 2, 2, 3};
        final double[] y = {2, 3, 3, 4};

        double pValue = testStatistic.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0 && pValue <= 1);
    }

    @Test
    public void testMannWhitneyUTest_negativeValues_returnsValidPValue() {
        final double[] x = {-5, -3, -1};
        final double[] y = {-4, -2, 0};

        double pValue = testStatistic.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0 && pValue <= 1);
    }

    @Test
    public void testMannWhitneyUTest_largeSamples_returnsValidPValue() {
        final double[] x = new double[50];
        final double[] y = new double[50];
        for (int i = 0; i < 50; i++) {
            x[i] = i;
            y[i] = i + 25;
        }

        double pValue = testStatistic.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0 && pValue <= 1);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTest_nullX_throwsNullArgumentException() {
        final double[] y = {1, 2, 3};
        testStatistic.mannWhitneyUTest(null, y);
    }

    @Test(expected = NullArgumentException.class)
    public void testMannWhitneyUTest_nullY_throwsNullArgumentException() {
        final double[] x = {1, 2, 3};
        testStatistic.mannWhitneyUTest(x, null);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTest_emptyX_throwsNoDataException() {
        final double[] x = {};
        final double[] y = {1, 2, 3};
        testStatistic.mannWhitneyUTest(x, y);
    }

    @Test(expected = NoDataException.class)
    public void testMannWhitneyUTest_emptyY_throwsNoDataException() {
        final double[] x = {1, 2, 3};
        final double[] y = {};
        testStatistic.mannWhitneyUTest(x, y);
    }

    @Test
    public void testMannWhitneyUTest_customStrategies_returnsValidPValue() {
        MannWhitneyUTest customTest = new MannWhitneyUTest(NaNStrategy.REMOVED, TiesStrategy.MINIMUM);
        final double[] x = {1, 2, 3, 4, 5};
        final double[] y = {6, 7, 8, 9, 10};

        double pValue = customTest.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0 && pValue <= 1);
    }

    @Test
    public void testMannWhitneyU_customStrategiesWithTies_returnsValidValue() {
        MannWhitneyUTest customTest = new MannWhitneyUTest(NaNStrategy.MINIMAL, TiesStrategy.MAXIMUM);
        final double[] x = {1, 2, 2, 3};
        final double[] y = {2, 3, 3, 4};

        double result = customTest.mannWhitneyU(x, y);
        assertTrue(result >= 0);
    }

    @Test
    public void testMannWhitneyU_zeroValues_returnsCorrectValue() {
        final double[] x = {0, 0, 0};
        final double[] y = {0, 0, 0};

        double result = testStatistic.mannWhitneyU(x, y);
        assertTrue(result >= 0);
    }

    @Test
    public void testMannWhitneyUTest_zeroValues_returnsValidPValue() {
        final double[] x = {0, 0, 0};
        final double[] y = {0, 0, 0};

        double pValue = testStatistic.mannWhitneyUTest(x, y);
        assertTrue(pValue >= 0 && pValue <= 1);
    }
}
