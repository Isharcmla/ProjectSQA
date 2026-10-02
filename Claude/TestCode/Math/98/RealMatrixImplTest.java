import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.MatrixIndexException;
import org.apache.commons.math.linear.InvalidMatrixException;

public class RealMatrixImplTest {

    private double[][] testData;
    private double[][] testDataSquare;
    private double[][] singularData;

    @Before
    public void setUp() {
        testData = new double[][] {
            {1d, 2d, 3d},
            {4d, 5d, 6d}
        };
        testDataSquare = new double[][] {
            {2d, 3d, 1d},
            {5d, 4d, 6d},
            {1d, 7d, 8d}
        };
        singularData = new double[][] {
            {1d, 2d},
            {2d, 4d}
        };
    }

    // ---------- Constructor tests ----------

    @Test
    public void testDefaultConstructor_noData_ok() {
        RealMatrixImpl m = new RealMatrixImpl();
        assertNotNull(m);
        assertNull(m.getDataRef());
    }

    @Test
    public void testDimensionConstructor_validDimensions_ok() {
        RealMatrixImpl m = new RealMatrixImpl(3, 4);
        assertEquals(3, m.getRowDimension());
        assertEquals(4, m.getColumnDimension());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructor_zeroRow_throwsException() {
        new RealMatrixImpl(0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructor_negativeColumn_throwsException() {
        new RealMatrixImpl(3, -1);
    }

    @Test
    public void testArrayConstructor_validData_ok() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        assertEquals(2, m.getRowDimension());
        assertEquals(3, m.getColumnDimension());
        assertEquals(1d, m.getEntry(0, 0), 0d);
    }

    @Test(expected = NullPointerException.class)
    public void testArrayConstructor_nullData_throwsException() {
        double[][] nullData = null;
        new RealMatrixImpl(nullData);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructor_nonRectangular_throwsException() {
        double[][] bad = {{1d, 2d}, {3d}};
        new RealMatrixImpl(bad);
    }

    @Test
    public void testArrayConstructorWithCopyFlag_copyTrue_copiesData() {
        double[][] original = {{1d, 2d}, {3d, 4d}};
        RealMatrixImpl m = new RealMatrixImpl(original, true);
        original[0][0] = 99d;
        assertEquals(1d, m.getEntry(0, 0), 0d);
    }

    @Test
    public void testArrayConstructorWithCopyFlag_copyFalse_referencesData() {
        double[][] original = {{1d, 2d}, {3d, 4d}};
        RealMatrixImpl m = new RealMatrixImpl(original, false);
        original[0][0] = 99d;
        assertEquals(99d, m.getEntry(0, 0), 0d);
    }

    @Test(expected = NullPointerException.class)
    public void testArrayConstructorWithCopyFlag_falseNullData_throwsException() {
        double[][] nullData = null;
        new RealMatrixImpl(nullData, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorWithCopyFlag_falseEmptyRows_throwsException() {
        double[][] empty = new double[0][0];
        new RealMatrixImpl(empty, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorWithCopyFlag_falseEmptyColumns_throwsException() {
        double[][] empty = new double[][] { {} };
        new RealMatrixImpl(empty, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArrayConstructorWithCopyFlag_falseNonRectangular_throwsException() {
        double[][] bad = {{1d, 2d}, {3d}};
        new RealMatrixImpl(bad, false);
    }

    @Test
    public void testVectorConstructor_validVector_createsColumnMatrix() {
        double[] v = {1d, 2d, 3d};
        RealMatrixImpl m = new RealMatrixImpl(v);
        assertEquals(3, m.getRowDimension());
        assertEquals(1, m.getColumnDimension());
        assertEquals(2d, m.getEntry(1, 0), 0d);
    }

    // ---------- copy ----------

    @Test
    public void testCopy_normalMatrix_returnsEqualButIndependentCopy() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        RealMatrix copy = m.copy();
        assertTrue(copy.getRowDimension() == m.getRowDimension());
        assertEquals(m.getEntry(0, 0), copy.getEntry(0, 0), 0d);
        m.getDataRef()[0][0] = 100d;
        assertEquals(1d, copy.getEntry(0, 0), 0d);
    }

    // ---------- add ----------

    @Test
    public void testAddRealMatrixImpl_sameDimensions_returnsSum() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(testData);
        RealMatrixImpl sum = m1.add(m2);
        assertEquals(2d, sum.getEntry(0, 0), 0d);
        assertEquals(12d, sum.getEntry(1, 2), 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRealMatrixImpl_differentDimensions_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(testDataSquare);
        m1.add(m2);
    }

    @Test
    public void testAddRealMatrix_nonRealMatrixImplSubclass_returnsSum() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrix m2 = new AnonymousRealMatrix(testData);
        RealMatrix sum = m1.add(m2);
        assertEquals(2d, sum.getEntry(0, 0), 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRealMatrix_nonRealMatrixImplMismatchedDims_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrix m2 = new AnonymousRealMatrix(testDataSquare);
        m1.add(m2);
    }

    // ---------- subtract ----------

    @Test
    public void testSubtractRealMatrixImpl_sameDimensions_returnsDifference() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(testData);
        RealMatrixImpl diff = m1.subtract(m2);
        assertEquals(0d, diff.getEntry(0, 0), 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractRealMatrixImpl_differentDimensions_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(testDataSquare);
        m1.subtract(m2);
    }

    @Test
    public void testSubtractRealMatrix_nonRealMatrixImplSubclass_returnsDifference() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrix m2 = new AnonymousRealMatrix(testData);
        RealMatrix diff = m1.subtract(m2);
        assertEquals(0d, diff.getEntry(0, 0), 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractRealMatrix_nonRealMatrixImplMismatchedDims_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrix m2 = new AnonymousRealMatrix(testDataSquare);
        m1.subtract(m2);
    }

    // ---------- scalarAdd ----------

    @Test
    public void testScalarAdd_normalValue_addsToAllEntries() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        RealMatrix result = m.scalarAdd(5d);
        assertEquals(6d, result.getEntry(0, 0), 0d);
        assertEquals(11d, result.getEntry(1, 2), 0d);
    }

    // ---------- scalarMultiply ----------

    @Test
    public void testScalarMultiply_normalValue_multipliesAllEntries() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        RealMatrix result = m.scalarMultiply(2d);
        assertEquals(2d, result.getEntry(0, 0), 0d);
        assertEquals(12d, result.getEntry(1, 2), 0d);
    }

    // ---------- multiply ----------

    @Test
    public void testMultiplyRealMatrixImpl_compatibleDimensions_returnsProduct() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][] {{1d, 2d}, {3d, 4d}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][] {{5d, 6d}, {7d, 8d}});
        RealMatrixImpl product = m1.multiply(m2);
        assertEquals(19d, product.getEntry(0, 0), 0d);
        assertEquals(22d, product.getEntry(0, 1), 0d);
        assertEquals(43d, product.getEntry(1, 0), 0d);
        assertEquals(50d, product.getEntry(1, 1), 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyRealMatrixImpl_incompatibleDimensions_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(testData);
        m1.multiply(m2);
    }

    @Test
    public void testMultiplyRealMatrix_nonRealMatrixImplSubclass_returnsProduct() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][] {{1d, 2d}, {3d, 4d}});
        RealMatrix m2 = new AnonymousRealMatrix(new double[][] {{5d, 6d}, {7d, 8d}});
        RealMatrix product = m1.multiply(m2);
        assertEquals(19d, product.getEntry(0, 0), 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyRealMatrix_nonRealMatrixImplIncompatible_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrix m2 = new AnonymousRealMatrix(testData);
        m1.multiply(m2);
    }

    // ---------- preMultiply (RealMatrix) ----------

    @Test
    public void testPreMultiplyRealMatrix_compatibleDimensions_returnsProduct() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][] {{1d, 2d}, {3d, 4d}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][] {{5d, 6d}, {7d, 8d}});
        RealMatrix result = m1.preMultiply(m2);
        RealMatrix expected = m2.multiply(m1);
        assertEquals(expected.getEntry(0, 0), result.getEntry(0, 0), 0d);
    }

    // ---------- getData / getDataRef ----------

    @Test
    public void testGetData_normalMatrix_returnsIndependentCopy() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        double[][] data = m.getData();
        data[0][0] = 999d;
        assertEquals(1d, m.getEntry(0, 0), 0d);
    }

    @Test
    public void testGetDataRef_normalMatrix_returnsReference() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        double[][] ref = m.getDataRef();
        ref[0][0] = 999d;
        assertEquals(999d, m.getEntry(0, 0), 0d);
    }

    // ---------- getNorm ----------

    @Test
    public void testGetNorm_normalMatrix_returnsMaxColumnSum() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][] {{1d, -2d}, {-3d, 4d}});
        double norm = m.getNorm();
        assertEquals(6d, norm, 0d);
    }

    // ---------- getSubMatrix(int,int,int,int) ----------

    @Test
    public void testGetSubMatrixByRange_validRange_returnsSubMatrix() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        RealMatrix sub = m.getSubMatrix(0, 1, 0, 1);
        assertEquals(2, sub.getRowDimension());
        assertEquals(2, sub.getColumnDimension());
        assertEquals(2d, sub.getEntry(0, 0), 0d);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixByRange_invalidRange_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        m.getSubMatrix(2, 1, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixByRange_outOfBounds_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        m.getSubMatrix(0, 10, 0, 1);
    }

    // ---------- getSubMatrix(int[], int[]) ----------

    @Test
    public void testGetSubMatrixByIndices_validIndices_returnsSubMatrix() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        int[] rows = {0, 2};
        int[] cols = {0, 1};
        RealMatrix sub = m.getSubMatrix(rows, cols);
        assertEquals(2, sub.getRowDimension());
        assertEquals(2, sub.getColumnDimension());
        assertEquals(2d, sub.getEntry(0, 0), 0d);
        assertEquals(1d, sub.getEntry(1, 0), 0d);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixByIndices_emptyArray_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        int[] rows = {};
        int[] cols = {0, 1};
        m.getSubMatrix(rows, cols);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrixByIndices_outOfBoundsIndex_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        int[] rows = {0, 10};
        int[] cols = {0, 1};
        m.getSubMatrix(rows, cols);
    }

    // ---------- setSubMatrix ----------

    @Test
    public void testSetSubMatrix_validInput_replacesData() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][] {
            {1d, 2d, 3d, 4d},
            {5d, 6d, 7d, 8d},
            {9d, 0d, 1d, 2d}
        });
        double[][] subMatrix = {{3d, 4d}, {5d, 6d}};
        m.setSubMatrix(subMatrix, 1, 1);
        assertEquals(3d, m.getEntry(1, 1), 0d);
        assertEquals(4d, m.getEntry(1, 2), 0d);
        assertEquals(5d, m.getEntry(2, 1), 0d);
        assertEquals(6d, m.getEntry(2, 2), 0d);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_negativeRow_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        double[][] subMatrix = {{1d}};
        m.setSubMatrix(subMatrix, -1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_negativeColumn_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        double[][] subMatrix = {{1d}};
        m.setSubMatrix(subMatrix, 0, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_emptyRows_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        double[][] subMatrix = new double[0][0];
        m.setSubMatrix(subMatrix, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_emptyColumns_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        double[][] subMatrix = new double[][] { {} };
        m.setSubMatrix(subMatrix, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_nonRectangular_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        double[][] subMatrix = {{1d, 2d}, {3d}};
        m.setSubMatrix(subMatrix, 0, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_initNullDataWithNonZeroRow_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl();
        double[][] subMatrix = {{1d, 2d}};
        m.setSubMatrix(subMatrix, 1, 0);
    }

    @Test
    public void testSetSubMatrix_initNullData_setsData() {
        RealMatrixImpl m = new RealMatrixImpl();
        double[][] subMatrix = {{1d, 2d}, {3d, 4d}};
        m.setSubMatrix(subMatrix, 0, 0);
        assertEquals(1d, m.getEntry(0, 0), 0d);
        assertEquals(4d, m.getEntry(1, 1), 0d);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_exceedsDimensions_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        double[][] subMatrix = {{1d, 2d, 3d, 4d}};
        m.setSubMatrix(subMatrix, 0, 0);
    }

    // ---------- getRowMatrix ----------

    @Test
    public void testGetRowMatrix_validRow_returnsRowMatrix() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        RealMatrix row = m.getRowMatrix(1);
        assertEquals(1, row.getRowDimension());
        assertEquals(3, row.getColumnDimension());
        assertEquals(4d, row.getEntry(0, 0), 0d);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_invalidRow_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        m.getRowMatrix(10);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_negativeRow_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        m.getRowMatrix(-1);
    }

    // ---------- getColumnMatrix ----------

    @Test
    public void testGetColumnMatrix_validColumn_returnsColumnMatrix() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        RealMatrix col = m.getColumnMatrix(1);
        assertEquals(2, col.getRowDimension());
        assertEquals(1, col.getColumnDimension());
        assertEquals(2d, col.getEntry(0, 0), 0d);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrix_invalidColumn_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        m.getColumnMatrix(10);
    }

    // ---------- getRow ----------

    @Test
    public void testGetRow_validRow_returnsArray() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        double[] row = m.getRow(0);
        assertArrayEquals(new double[] {1d, 2d, 3d}, row, 0d);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRow_invalidRow_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        m.getRow(-1);
    }

    // ---------- getColumn ----------

    @Test
    public void testGetColumn_validColumn_returnsArray() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        double[] col = m.getColumn(0);
        assertArrayEquals(new double[] {1d, 4d}, col, 0d);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumn_invalidColumn_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        m.getColumn(10);
    }

    // ---------- getEntry ----------

    @Test
    public void testGetEntry_validIndices_returnsValue() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        assertEquals(5d, m.getEntry(1, 1), 0d);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_invalidIndices_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        m.getEntry(10, 10);
    }

    // ---------- transpose ----------

    @Test
    public void testTranspose_normalMatrix_returnsTransposed() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        RealMatrix t = m.transpose();
        assertEquals(3, t.getRowDimension());
        assertEquals(2, t.getColumnDimension());
        assertEquals(4d, t.getEntry(0, 1), 0d);
    }

    // ---------- inverse ----------

    @Test
    public void testInverse_invertibleMatrix_returnsInverse() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][] {{1d, 2d}, {3d, 4d}});
        RealMatrix inv = m.inverse();
        RealMatrix identity = m.multiply(inv);
        assertEquals(1d, identity.getEntry(0, 0), 1e-9);
        assertEquals(0d, identity.getEntry(0, 1), 1e-9);
        assertEquals(0d, identity.getEntry(1, 0), 1e-9);
        assertEquals(1d, identity.getEntry(1, 1), 1e-9);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testInverse_singularMatrix_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(singularData);
        m.inverse();
    }

    // ---------- getDeterminant ----------

    @Test
    public void testGetDeterminant_squareMatrix_returnsCorrectValue() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][] {{1d, 2d}, {3d, 4d}});
        double det = m.getDeterminant();
        assertEquals(-2d, det, 1e-9);
    }

    @Test
    public void testGetDeterminant_singularMatrix_returnsZero() {
        RealMatrixImpl m = new RealMatrixImpl(singularData);
        double det = m.getDeterminant();
        assertEquals(0d, det, 0d);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetDeterminant_nonSquareMatrix_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        m.getDeterminant();
    }

    // ---------- isSquare ----------

    @Test
    public void testIsSquare_squareMatrix_returnsTrue() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        assertTrue(m.isSquare());
    }

    @Test
    public void testIsSquare_nonSquareMatrix_returnsFalse() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        assertFalse(m.isSquare());
    }

    // ---------- isSingular ----------

    @Test
    public void testIsSingular_nonSingularMatrix_returnsFalse() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        assertFalse(m.isSingular());
    }

    @Test
    public void testIsSingular_singularMatrix_returnsTrue() {
        RealMatrixImpl m = new RealMatrixImpl(singularData);
        assertTrue(m.isSingular());
    }

    @Test
    public void testIsSingular_alreadyDecomposed_returnsFalse() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        m.luDecompose();
        assertFalse(m.isSingular());
    }

    // ---------- getRowDimension / getColumnDimension ----------

    @Test
    public void testGetRowDimension_normalMatrix_returnsCorrectValue() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        assertEquals(2, m.getRowDimension());
    }

    @Test
    public void testGetColumnDimension_normalMatrix_returnsCorrectValue() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        assertEquals(3, m.getColumnDimension());
    }

    // ---------- getTrace ----------

    @Test
    public void testGetTrace_squareMatrix_returnsCorrectValue() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        double trace = m.getTrace();
        assertEquals(14d, trace, 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTrace_nonSquareMatrix_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        m.getTrace();
    }

    // ---------- operate ----------

    @Test
    public void testOperate_validVector_returnsResultVector() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][] {{1d, 2d}, {3d, 4d}});
        double[] v = {1d, 1d};
        double[] result = m.operate(v);
        assertArrayEquals(new double[] {3d, 7d}, result, 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperate_wrongLengthVector_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        double[] v = {1d};
        m.operate(v);
    }

    // ---------- preMultiply(double[]) ----------

    @Test
    public void testPreMultiplyVector_validVector_returnsResultVector() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][] {{1d, 2d}, {3d, 4d}});
        double[] v = {1d, 1d};
        double[] result = m.preMultiply(v);
        assertArrayEquals(new double[] {4d, 6d}, result, 0d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiplyVector_wrongLengthVector_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        double[] v = {1d};
        m.preMultiply(v);
    }

    // ---------- solve(double[]) ----------

    @Test
    public void testSolveVector_validSystem_returnsSolution() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][] {{1d, 2d}, {3d, 4d}});
        double[] b = {5d, 6d};
        double[] x = m.solve(b);
        double[] check = m.operate(x);
        assertArrayEquals(b, check, 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveVector_wrongLengthVector_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        double[] b = {1d};
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveVector_singularMatrix_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(singularData);
        double[] b = {1d, 2d};
        m.solve(b);
    }

    // ---------- solve(RealMatrix) ----------

    @Test
    public void testSolveMatrix_validSystem_returnsSolution() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][] {{1d, 2d}, {3d, 4d}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][] {{5d}, {6d}});
        RealMatrix x = m.solve(b);
        RealMatrix check = m.multiply(x);
        assertEquals(5d, check.getEntry(0, 0), 1e-9);
        assertEquals(6d, check.getEntry(1, 0), 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveMatrix_wrongRowDimension_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        RealMatrixImpl b = new RealMatrixImpl(new double[][] {{1d}});
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveMatrix_nonSquareCoefficient_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        RealMatrixImpl b = new RealMatrixImpl(new double[][] {{1d}, {2d}});
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveMatrix_singularCoefficient_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(singularData);
        RealMatrixImpl b = new RealMatrixImpl(new double[][] {{1d}, {2d}});
        m.solve(b);
    }

    // ---------- luDecompose ----------

    @Test
    public void testLuDecompose_squareNonSingularMatrix_decomposesSuccessfully() {
        RealMatrixImpl m = new RealMatrixImpl(testDataSquare);
        m.luDecompose();
        assertFalse(m.isSingular());
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecompose_nonSquareMatrix_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        m.luDecompose();
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecompose_singularMatrix_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(singularData);
        m.luDecompose();
    }

    // ---------- toString ----------

    @Test
    public void testToString_normalMatrix_returnsNonEmptyString() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        String s = m.toString();
        assertNotNull(s);
        assertTrue(s.startsWith("RealMatrixImpl{"));
        assertTrue(s.contains("1.0"));
    }

    @Test
    public void testToString_nullData_returnsEmptyBraces() {
        RealMatrixImpl m = new RealMatrixImpl();
        String s = m.toString();
        assertEquals("RealMatrixImpl{}", s);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObject_returnsTrue() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        assertTrue(m.equals(m));
    }

    @Test
    public void testEquals_equalMatrices_returnsTrue() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(testData);
        assertTrue(m1.equals(m2));
    }

    @Test
    public void testEquals_differentDimensions_returnsFalse() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(testDataSquare);
        assertFalse(m1.equals(m2));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][] {{9d, 9d, 9d}, {9d, 9d, 9d}});
        assertFalse(m1.equals(m2));
    }

    @Test
    public void testEquals_notRealMatrixImplInstance_returnsFalse() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        assertFalse(m.equals("not a matrix"));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        RealMatrixImpl m = new RealMatrixImpl(testData);
        assertFalse(m.equals(null));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalMatrices_haveSameHashCode() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(testData);
        assertEquals(m1.hashCode(), m2.hashCode());
    }

    @Test
    public void testHashCode_differentMatrices_mayDifferHashCode() {
        RealMatrixImpl m1 = new RealMatrixImpl(testData);
        RealMatrixImpl m2 = new RealMatrixImpl(testDataSquare);
        assertNotEquals(m1.hashCode(), m2.hashCode());
    }

    // ---------- helper class: a RealMatrix implementation not extending RealMatrixImpl ----------

    private static class AnonymousRealMatrix implements RealMatrix, java.io.Serializable {
        private double[][] data;

        AnonymousRealMatrix(double[][] d) {
            data = new double[d.length][d[0].length];
            for (int i = 0; i < d.length; i++) {
                System.arraycopy(d[i], 0, data[i], 0, d[i].length);
            }
        }

        public RealMatrix copy() {
            return new AnonymousRealMatrix(data);
        }

        public RealMatrix add(RealMatrix m) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix subtract(RealMatrix m) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix scalarAdd(double d) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix scalarMultiply(double d) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix multiply(RealMatrix m) throws IllegalArgumentException {
            if (this.getColumnDimension() != m.getRowDimension()) {
                throw new IllegalArgumentException("incompatible");
            }
            int nRows = this.getRowDimension();
            int nCols = m.getColumnDimension();
            int nSum = this.getColumnDimension();
            double[][] out = new double[nRows][nCols];
            for (int r = 0; r < nRows; r++) {
                for (int c = 0; c < nCols; c++) {
                    double sum = 0;
                    for (int i = 0; i < nSum; i++) {
                        sum += data[r][i] * m.getEntry(i, c);
                    }
                    out[r][c] = sum;
                }
            }
            return new AnonymousRealMatrix(out);
        }

        public RealMatrix preMultiply(RealMatrix m) {
            return m.multiply(this);
        }

        public double[][] getData() {
            return data;
        }

        public double[][] getDataRef() {
            return data;
        }

        public double getNorm() {
            return 0;
        }

        public RealMatrix getSubMatrix(int sr, int er, int sc, int ec) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix getSubMatrix(int[] sr, int[] sc) {
            throw new UnsupportedOperationException();
        }

        public void setSubMatrix(double[][] sub, int r, int c) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix getRowMatrix(int row) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix getColumnMatrix(int col) {
            throw new UnsupportedOperationException();
        }

        public double[] getRow(int row) {
            throw new UnsupportedOperationException();
        }

        public double[] getColumn(int col) {
            throw new UnsupportedOperationException();
        }

        public double getEntry(int row, int column) {
            return data[row][column];
        }

        public RealMatrix transpose() {
            throw new UnsupportedOperationException();
        }

        public RealMatrix inverse() {
            throw new UnsupportedOperationException();
        }

        public double getDeterminant() {
            throw new UnsupportedOperationException();
        }

        public boolean isSquare() {
            return getRowDimension() == getColumnDimension();
        }

        public boolean isSingular() {
            throw new UnsupportedOperationException();
        }

        public int getRowDimension() {
            return data.length;
        }

        public int getColumnDimension() {
            return data[0].length;
        }

        public double getTrace() {
            throw new UnsupportedOperationException();
        }

        public double[] operate(double[] v) {
            throw new UnsupportedOperationException();
        }

        public double[] preMultiply(double[] v) {
            throw new UnsupportedOperationException();
        }

        public double[] solve(double[] b) {
            throw new UnsupportedOperationException();
        }

        public RealMatrix solve(RealMatrix b) {
            throw new UnsupportedOperationException();
        }
    }
}
