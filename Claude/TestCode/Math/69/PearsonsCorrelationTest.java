import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.stat.correlation.Covariance;
import org.apache.commons.math.stat.correlation.PearsonsCorrelation;
import org.junit.Test;
import static org.junit.Assert.*;

public class PearsonsCorrelationTest {

    private double[][] sampleData = {
        {1.0, 2.0, 3.0},
        {2.0, 4.0, 6.0},
        {3.0, 6.0, 9.0},
        {4.0, 8.0, 12.0},
        {5.0, 10.0, 15.0}
    };

    private double[][] sampleData2 = {
        {1.0, 5.0},
        {2.0, 4.0},
        {3.0, 3.0},
        {4.0, 2.0},
        {5.0, 1.0}
    };

    // -------------------- Constructor Tests --------------------

    @Test
    public void testDefaultConstructor_noData_correlationMatrixNull() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        assertNull(pc.getCorrelationMatrix());
    }

    @Test
    public void testConstructorDoubleArray_normalInput_correlationMatrixComputed() {
        PearsonsCorrelation pc = new PearsonsCorrelation(sampleData);
        RealMatrix corr = pc.getCorrelationMatrix();
        assertNotNull(corr);
        assertEquals(3, corr.getRowDimension());
        assertEquals(3, corr.getColumnDimension());
        // Diagonal should be 1
        for (int i = 0; i < 3; i++) {
            assertEquals(1d, corr.getEntry(i, i), 1e-9);
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDoubleArray_insufficientRows_throwsException() {
        double[][] data = {
            {1.0, 2.0}
        };
        new PearsonsCorrelation(data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDoubleArray_insufficientColumns_throwsException() {
        double[][] data = {
            {1.0},
            {2.0},
            {3.0}
        };
        new PearsonsCorrelation(data);
    }

    @Test
    public void testConstructorRealMatrix_normalInput_correlationMatrixComputed() {
        RealMatrix matrix = new BlockRealMatrix(sampleData2);
        PearsonsCorrelation pc = new PearsonsCorrelation(matrix);
        RealMatrix corr = pc.getCorrelationMatrix();
        assertNotNull(corr);
        assertEquals(2, corr.getRowDimension());
        assertEquals(2, corr.getColumnDimension());
        assertEquals(1d, corr.getEntry(0, 0), 1e-9);
        assertEquals(1d, corr.getEntry(1, 1), 1e-9);
        // Perfect negative correlation expected
        assertEquals(-1d, corr.getEntry(0, 1), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRealMatrix_insufficientData_throwsException() {
        double[][] data = {
            {1.0, 2.0}
        };
        RealMatrix matrix = new BlockRealMatrix(data);
        new PearsonsCorrelation(matrix);
    }

    @Test
    public void testConstructorCovariance_normalInput_correlationMatrixComputed() {
        Covariance covariance = new Covariance(sampleData2);
        PearsonsCorrelation pc = new PearsonsCorrelation(covariance);
        RealMatrix corr = pc.getCorrelationMatrix();
        assertNotNull(corr);
        assertEquals(2, corr.getRowDimension());
        assertEquals(2, corr.getColumnDimension());
    }

    @Test
    public void testConstructorRealMatrixWithNObs_normalInput_correlationMatrixComputed() {
        double[][] covData = {
            {4.0, 2.0},
            {2.0, 3.0}
        };
        RealMatrix covMatrix = new BlockRealMatrix(covData);
        PearsonsCorrelation pc = new PearsonsCorrelation(covMatrix, 10);
        RealMatrix corr = pc.getCorrelationMatrix();
        assertNotNull(corr);
        assertEquals(1d, corr.getEntry(0, 0), 1e-9);
        assertEquals(1d, corr.getEntry(1, 1), 1e-9);
    }

    // -------------------- getCorrelationMatrix --------------------

    @Test
    public void testGetCorrelationMatrix_afterConstruction_returnsSameMatrix() {
        PearsonsCorrelation pc = new PearsonsCorrelation(sampleData2);
        RealMatrix corr1 = pc.getCorrelationMatrix();
        RealMatrix corr2 = pc.getCorrelationMatrix();
        assertSame(corr1, corr2);
    }

    // -------------------- getCorrelationStandardErrors --------------------

    @Test
    public void testGetCorrelationStandardErrors_normalInput_returnsValidMatrix() {
        PearsonsCorrelation pc = new PearsonsCorrelation(sampleData2);
        RealMatrix errors = pc.getCorrelationStandardErrors();
        assertNotNull(errors);
        assertEquals(2, errors.getRowDimension());
        assertEquals(2, errors.getColumnDimension());
        // r=1 on diagonal leads to 0 under sqrt => standard error 0
        assertEquals(0d, errors.getEntry(0, 0), 1e-9);
        assertEquals(0d, errors.getEntry(1, 1), 1e-9);
    }

    // -------------------- getCorrelationPValues --------------------

    @Test
    public void testGetCorrelationPValues_normalInput_returnsValidMatrix() throws Exception {
        PearsonsCorrelation pc = new PearsonsCorrelation(sampleData);
        RealMatrix pValues = pc.getCorrelationPValues();
        assertNotNull(pValues);
        assertEquals(3, pValues.getRowDimension());
        assertEquals(3, pValues.getColumnDimension());
        // Diagonal should be 0
        for (int i = 0; i < 3; i++) {
            assertEquals(0d, pValues.getEntry(i, i), 1e-9);
        }
    }

    // -------------------- computeCorrelationMatrix(RealMatrix) --------------------

    @Test
    public void testComputeCorrelationMatrixRealMatrix_normalInput_correctMatrix() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        RealMatrix matrix = new BlockRealMatrix(sampleData2);
        RealMatrix corr = pc.computeCorrelationMatrix(matrix);
        assertNotNull(corr);
        assertEquals(2, corr.getRowDimension());
        assertEquals(1d, corr.getEntry(0, 0), 1e-9);
        assertEquals(-1d, corr.getEntry(0, 1), 1e-9);
    }

    // -------------------- computeCorrelationMatrix(double[][]) --------------------

    @Test
    public void testComputeCorrelationMatrixDoubleArray_normalInput_correctMatrix() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        RealMatrix corr = pc.computeCorrelationMatrix(sampleData2);
        assertNotNull(corr);
        assertEquals(2, corr.getRowDimension());
        assertEquals(1d, corr.getEntry(0, 0), 1e-9);
    }

    // -------------------- correlation(double[], double[]) --------------------

    @Test
    public void testCorrelation_normalInput_returnsCorrectCoefficient() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 4, 6, 8, 10};
        double r = pc.correlation(x, y);
        assertEquals(1d, r, 1e-9);
    }

    @Test
    public void testCorrelation_negativeCorrelation_returnsNegativeOne() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {5, 4, 3, 2, 1};
        double r = pc.correlation(x, y);
        assertEquals(-1d, r, 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_mismatchedArrayLengths_throwsException() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1, 2, 3};
        double[] y = {1, 2};
        pc.correlation(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_insufficientDataLength_throwsException() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1};
        double[] y = {1};
        pc.correlation(x, y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCorrelation_emptyArrays_throwsException() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {};
        double[] y = {};
        pc.correlation(x, y);
    }

    // -------------------- covarianceToCorrelation --------------------

    @Test
    public void testCovarianceToCorrelation_normalInput_correctMatrix() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[][] covData = {
            {4.0, 2.0},
            {2.0, 9.0}
        };
        RealMatrix covMatrix = new BlockRealMatrix(covData);
        RealMatrix corr = pc.covarianceToCorrelation(covMatrix);
        assertNotNull(corr);
        assertEquals(1d, corr.getEntry(0, 0), 1e-9);
        assertEquals(1d, corr.getEntry(1, 1), 1e-9);
        double expected = 2.0 / (Math.sqrt(4.0) * Math.sqrt(9.0));
        assertEquals(expected, corr.getEntry(0, 1), 1e-9);
        assertEquals(expected, corr.getEntry(1, 0), 1e-9);
    }

    @Test
    public void testCovarianceToCorrelation_zeroOffDiagonal_zeroCorrelation() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[][] covData = {
            {4.0, 0.0},
            {0.0, 9.0}
        };
        RealMatrix covMatrix = new BlockRealMatrix(covData);
        RealMatrix corr = pc.covarianceToCorrelation(covMatrix);
        assertEquals(0d, corr.getEntry(0, 1), 1e-9);
        assertEquals(0d, corr.getEntry(1, 0), 1e-9);
    }

    // -------------------- Boundary / edge cases --------------------

    @Test
    public void testConstructorDoubleArray_minimumValidData_correlationMatrixComputed() {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        PearsonsCorrelation pc = new PearsonsCorrelation(data);
        RealMatrix corr = pc.getCorrelationMatrix();
        assertNotNull(corr);
        assertEquals(2, corr.getRowDimension());
    }

    @Test
    public void testCorrelation_minimumValidArrayLength_returnsValue() {
        PearsonsCorrelation pc = new PearsonsCorrelation();
        double[] x = {1, 2};
        double[] y = {3, 4};
        double r = pc.correlation(x, y);
        assertEquals(1d, r, 1e-9);
    }
}
