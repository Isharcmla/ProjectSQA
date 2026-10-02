import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.MatrixDimensionMismatchException;

public class OpenMapRealMatrixTest {

    private OpenMapRealMatrix matrix;

    @Before
    public void setUp() {
        matrix = new OpenMapRealMatrix(3, 3);
    }

    // ---------- Constructor tests ----------

    @Test
    public void testConstructor_normalDimensions_createsMatrix() {
        OpenMapRealMatrix m = new OpenMapRealMatrix(4, 5);
        Assert.assertEquals(4, m.getRowDimension());
        Assert.assertEquals(5, m.getColumnDimension());
    }

    @Test
    public void testConstructor_copy_createsEqualMatrix() {
        matrix.setEntry(0, 0, 5.0);
        matrix.setEntry(1, 1, 3.0);
        OpenMapRealMatrix copyMatrix = new OpenMapRealMatrix(matrix);
        Assert.assertEquals(5.0, copyMatrix.getEntry(0, 0), 0.0);
        Assert.assertEquals(3.0, copyMatrix.getEntry(1, 1), 0.0);
        Assert.assertEquals(matrix.getRowDimension(), copyMatrix.getRowDimension());
        Assert.assertEquals(matrix.getColumnDimension(), copyMatrix.getColumnDimension());
    }

    @Test
    public void testConstructor_copyIsIndependent_originalUnaffected() {
        matrix.setEntry(0, 0, 5.0);
        OpenMapRealMatrix copyMatrix = new OpenMapRealMatrix(matrix);
        copyMatrix.setEntry(0, 0, 10.0);
        Assert.assertEquals(5.0, matrix.getEntry(0, 0), 0.0);
        Assert.assertEquals(10.0, copyMatrix.getEntry(0, 0), 0.0);
    }

    // ---------- copy() ----------

    @Test
    public void testCopy_returnsEqualButIndependentMatrix() {
        matrix.setEntry(1, 1, 7.0);
        OpenMapRealMatrix copyMatrix = matrix.copy();
        Assert.assertEquals(7.0, copyMatrix.getEntry(1, 1), 0.0);
        copyMatrix.setEntry(1, 1, 0.0);
        Assert.assertEquals(7.0, matrix.getEntry(1, 1), 0.0);
        Assert.assertEquals(0.0, copyMatrix.getEntry(1, 1), 0.0);
    }

    // ---------- createMatrix() ----------

    @Test
    public void testCreateMatrix_normalDimensions_createsEmptyMatrix() {
        OpenMapRealMatrix created = matrix.createMatrix(2, 2);
        Assert.assertEquals(2, created.getRowDimension());
        Assert.assertEquals(2, created.getColumnDimension());
        Assert.assertEquals(0.0, created.getEntry(0, 0), 0.0);
    }

    // ---------- getColumnDimension() / getRowDimension() ----------

    @Test
    public void testGetColumnDimension_normalMatrix_returnsCorrectValue() {
        Assert.assertEquals(3, matrix.getColumnDimension());
    }

    @Test
    public void testGetRowDimension_normalMatrix_returnsCorrectValue() {
        Assert.assertEquals(3, matrix.getRowDimension());
    }

    // ---------- getEntry() / setEntry() ----------

    @Test
    public void testSetEntryAndGetEntry_normalValue_returnsSetValue() {
        matrix.setEntry(0, 1, 4.5);
        Assert.assertEquals(4.5, matrix.getEntry(0, 1), 0.0);
    }

    @Test
    public void testSetEntry_zeroValue_removesEntry() {
        matrix.setEntry(0, 1, 4.5);
        matrix.setEntry(0, 1, 0.0);
        Assert.assertEquals(0.0, matrix.getEntry(0, 1), 0.0);
    }

    @Test
    public void testGetEntry_unsetEntry_returnsZero() {
        Assert.assertEquals(0.0, matrix.getEntry(2, 2), 0.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_invalidRow_throwsOutOfRangeException() {
        matrix.getEntry(5, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_invalidColumn_throwsOutOfRangeException() {
        matrix.getEntry(0, 5);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_negativeRow_throwsOutOfRangeException() {
        matrix.getEntry(-1, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_invalidRow_throwsOutOfRangeException() {
        matrix.setEntry(10, 0, 1.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_invalidColumn_throwsOutOfRangeException() {
        matrix.setEntry(0, 10, 1.0);
    }

    // ---------- addToEntry() ----------

    @Test
    public void testAddToEntry_normalIncrement_updatesValue() {
        matrix.setEntry(0, 0, 2.0);
        matrix.addToEntry(0, 0, 3.0);
        Assert.assertEquals(5.0, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testAddToEntry_resultZero_removesEntry() {
        matrix.setEntry(0, 0, 5.0);
        matrix.addToEntry(0, 0, -5.0);
        Assert.assertEquals(0.0, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testAddToEntry_onEmptyEntry_setsValue() {
        matrix.addToEntry(1, 1, 2.0);
        Assert.assertEquals(2.0, matrix.getEntry(1, 1), 0.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testAddToEntry_invalidRow_throwsOutOfRangeException() {
        matrix.addToEntry(10, 0, 1.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testAddToEntry_invalidColumn_throwsOutOfRangeException() {
        matrix.addToEntry(0, 10, 1.0);
    }

    // ---------- multiplyEntry() ----------

    @Test
    public void testMultiplyEntry_normalFactor_updatesValue() {
        matrix.setEntry(0, 0, 3.0);
        matrix.multiplyEntry(0, 0, 2.0);
        Assert.assertEquals(6.0, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testMultiplyEntry_resultZero_removesEntry() {
        matrix.setEntry(0, 0, 3.0);
        matrix.multiplyEntry(0, 0, 0.0);
        Assert.assertEquals(0.0, matrix.getEntry(0, 0), 0.0);
    }

    @Test
    public void testMultiplyEntry_onEmptyEntry_remainsZero() {
        matrix.multiplyEntry(1, 1, 5.0);
        Assert.assertEquals(0.0, matrix.getEntry(1, 1), 0.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testMultiplyEntry_invalidRow_throwsOutOfRangeException() {
        matrix.multiplyEntry(10, 0, 1.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testMultiplyEntry_invalidColumn_throwsOutOfRangeException() {
        matrix.multiplyEntry(0, 10, 1.0);
    }

    // ---------- add(OpenMapRealMatrix) ----------

    @Test
    public void testAdd_normalMatrices_returnsCorrectSum() {
        matrix.setEntry(0, 0, 2.0);
        matrix.setEntry(1, 1, 3.0);

        OpenMapRealMatrix other = new OpenMapRealMatrix(3, 3);
        other.setEntry(0, 0, 1.0);
        other.setEntry(2, 2, 4.0);

        OpenMapRealMatrix result = matrix.add(other);

        Assert.assertEquals(3.0, result.getEntry(0, 0), 0.0);
        Assert.assertEquals(3.0, result.getEntry(1, 1), 0.0);
        Assert.assertEquals(4.0, result.getEntry(2, 2), 0.0);
    }

    @Test
    public void testAdd_emptyMatrices_returnsEmptyMatrix() {
        OpenMapRealMatrix other = new OpenMapRealMatrix(3, 3);
        OpenMapRealMatrix result = matrix.add(other);
        Assert.assertEquals(0.0, result.getEntry(0, 0), 0.0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAdd_mismatchedDimensions_throwsDimensionMismatchException() {
        OpenMapRealMatrix other = new OpenMapRealMatrix(2, 2);
        matrix.add(other);
    }

    // ---------- subtract(OpenMapRealMatrix) ----------

    @Test
    public void testSubtractOpenMap_normalMatrices_returnsCorrectDifference() {
        matrix.setEntry(0, 0, 5.0);
        matrix.setEntry(1, 1, 3.0);

        OpenMapRealMatrix other = new OpenMapRealMatrix(3, 3);
        other.setEntry(0, 0, 2.0);
        other.setEntry(2, 2, 1.0);

        OpenMapRealMatrix result = matrix.subtract(other);

        Assert.assertEquals(3.0, result.getEntry(0, 0), 0.0);
        Assert.assertEquals(3.0, result.getEntry(1, 1), 0.0);
        Assert.assertEquals(-1.0, result.getEntry(2, 2), 0.0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSubtractOpenMap_mismatchedDimensions_throwsDimensionMismatchException() {
        OpenMapRealMatrix other = new OpenMapRealMatrix(2, 2);
        matrix.subtract(other);
    }

    // ---------- subtract(RealMatrix) ----------

    @Test
    public void testSubtractRealMatrix_withOpenMapRealMatrix_returnsCorrectDifference() {
        matrix.setEntry(0, 0, 5.0);

        RealMatrix other = new OpenMapRealMatrix(3, 3);
        other.setEntry(0, 0, 2.0);

        RealMatrix result = matrix.subtract(other);
        Assert.assertEquals(3.0, result.getEntry(0, 0), 0.0);
    }

    @Test
    public void testSubtractRealMatrix_withNonOpenMapMatrix_fallbacksToSuper() {
        matrix.setEntry(0, 0, 5.0);
        matrix.setEntry(1, 1, 3.0);

        RealMatrix other = new BlockRealMatrix(3, 3);
        other.setEntry(0, 0, 2.0);

        RealMatrix result = matrix.subtract(other);
        Assert.assertEquals(3.0, result.getEntry(0, 0), 0.0);
        Assert.assertEquals(3.0, result.getEntry(1, 1), 0.0);
    }

    // ---------- multiply(OpenMapRealMatrix) ----------

    @Test
    public void testMultiplyOpenMap_normalMatrices_returnsCorrectProduct() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 1.0);
        a.setEntry(0, 1, 2.0);
        a.setEntry(1, 0, 3.0);
        a.setEntry(1, 1, 4.0);

        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2);
        b.setEntry(0, 0, 5.0);
        b.setEntry(0, 1, 6.0);
        b.setEntry(1, 0, 7.0);
        b.setEntry(1, 1, 8.0);

        OpenMapRealMatrix result = a.multiply(b);

        Assert.assertEquals(19.0, result.getEntry(0, 0), 0.0);
        Assert.assertEquals(22.0, result.getEntry(0, 1), 0.0);
        Assert.assertEquals(43.0, result.getEntry(1, 0), 0.0);
        Assert.assertEquals(50.0, result.getEntry(1, 1), 0.0);
    }

    @Test
    public void testMultiplyOpenMap_withEmptyMatrix_returnsZeroMatrix() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 1.0);

        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2);

        OpenMapRealMatrix result = a.multiply(b);
        Assert.assertEquals(0.0, result.getEntry(0, 0), 0.0);
    }

    @Test
    public void testMultiplyOpenMap_resultingInZeroValue_removesEntry() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(1, 2);
        a.setEntry(0, 0, 1.0);
        a.setEntry(0, 1, -1.0);

        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 1);
        b.setEntry(0, 0, 1.0);
        b.setEntry(1, 0, 1.0);

        OpenMapRealMatrix result = a.multiply(b);
        Assert.assertEquals(0.0, result.getEntry(0, 0), 0.0);
    }

    @Test(expected = MatrixDimensionMismatchException.class)
    public void testMultiplyOpenMap_mismatchedDimensions_throwsMatrixDimensionMismatchException() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 3);
        OpenMapRealMatrix b = new OpenMapRealMatrix(2, 2);
        a.multiply(b);
    }

    // ---------- multiply(RealMatrix) ----------

    @Test
    public void testMultiplyRealMatrix_withOpenMapRealMatrix_returnsCorrectProduct() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 1.0);
        a.setEntry(1, 1, 2.0);

        RealMatrix b = new OpenMapRealMatrix(2, 2);
        b.setEntry(0, 0, 3.0);
        b.setEntry(1, 1, 4.0);

        RealMatrix result = a.multiply(b);
        Assert.assertEquals(3.0, result.getEntry(0, 0), 0.0);
        Assert.assertEquals(8.0, result.getEntry(1, 1), 0.0);
    }

    @Test
    public void testMultiplyRealMatrix_withNonOpenMapMatrix_fallbacksToBlockRealMatrix() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 2);
        a.setEntry(0, 0, 1.0);
        a.setEntry(1, 1, 2.0);

        RealMatrix b = new BlockRealMatrix(2, 2);
        b.setEntry(0, 0, 3.0);
        b.setEntry(1, 1, 4.0);

        RealMatrix result = a.multiply(b);
        Assert.assertEquals(3.0, result.getEntry(0, 0), 0.0);
        Assert.assertEquals(8.0, result.getEntry(1, 1), 0.0);
    }

    @Test(expected = MatrixDimensionMismatchException.class)
    public void testMultiplyRealMatrix_withNonOpenMapMismatchedDimensions_throwsException() {
        OpenMapRealMatrix a = new OpenMapRealMatrix(2, 3);
        RealMatrix b = new BlockRealMatrix(2, 2);
        a.multiply(b);
    }
}
