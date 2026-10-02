package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RealMatrixImplTest {

    private static final double TOLERANCE = 10e-12;

    @Test
    public void testDefaultConstructor() {
        RealMatrixImpl m = new RealMatrixImpl();
        Assert.assertNull(m.getDataRef());
        Assert.assertEquals("RealMatrixImpl{}", m.toString());
    }

    @Test
    public void testDimensionConstructor_validDimensions() {
        RealMatrixImpl m = new RealMatrixImpl(2, 3);
        Assert.assertEquals(2, m.getRowDimension());
        Assert.assertEquals(3, m.getColumnDimension());
        Assert.assertEquals(0.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructor_invalidRowDimension_throwsException() {
        new RealMatrixImpl(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructor_negativeRowDimension_throwsException() {
        new RealMatrixImpl(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructor_invalidColumnDimension_throwsException() {
        new RealMatrixImpl(2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructor_negativeColumnDimension_throwsException() {
        new RealMatrixImpl(2, -1);
    }

    @Test
    public void test2DArrayConstructor_validData() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrixImpl m = new RealMatrixImpl(data);
        Assert.assertEquals(2, m.getRowDimension());
        Assert.assertEquals(2, m.getColumnDimension());
        Assert.assertEquals(1.0, m.getEntry(0, 0), TOLERANCE);

        // Verify array is copied
        data[0][0] = 99.0;
        Assert.assertEquals(1.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test(expected = NullPointerException.class)
    public void test2DArrayConstructor_nullArray_throwsException() {
        new RealMatrixImpl((double[][]) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2DArrayConstructor_emptyRows_throwsException() {
        new RealMatrixImpl(new double[][]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2DArrayConstructor_emptyColumns_throwsException() {
        new RealMatrixImpl(new double[][]{{}, {}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2DArrayConstructor_nonRectangular_throwsException() {
        new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0}});
    }

    @Test
    public void test2DArrayCopyFlagConstructor_copyTrue() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrixImpl m = new RealMatrixImpl(data, true);
        data[0][0] = 99.0;
        Assert.assertEquals(1.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test
    public void test2DArrayCopyFlagConstructor_copyFalse() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrixImpl m = new RealMatrixImpl(data, false);
        data[0][0] = 99.0;
        Assert.assertEquals(99.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test(expected = NullPointerException.class)
    public void test2DArrayCopyFlagConstructor_nullArrayCopyFalse_throwsException() {
        new RealMatrixImpl((double[][]) null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2DArrayCopyFlagConstructor_emptyRowsCopyFalse_throwsException() {
        new RealMatrixImpl(new double[][]{}, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2DArrayCopyFlagConstructor_emptyColumnsCopyFalse_throwsException() {
        new RealMatrixImpl(new double[][]{{}, {}}, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2DArrayCopyFlagConstructor_nonRectangularCopyFalse_throwsException() {
        new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0}}, false);
    }

    @Test
    public void test1DArrayConstructor_createsColumnMatrix() {
        double[] v = {1.0, 2.0, 3.0};
        RealMatrixImpl m = new RealMatrixImpl(v);
        Assert.assertEquals(3, m.getRowDimension());
        Assert.assertEquals(1, m.getColumnDimension());
        Assert.assertEquals(1.0, m.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(2.0, m.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(3.0, m.getEntry(2, 0), TOLERANCE);

        // Verify array is copied
        v[0] = 99.0;
        Assert.assertEquals(1.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test
    public void testCopy() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix copy = m.copy();
        Assert.assertEquals(m, copy);
        Assert.assertNotSame(m.getDataRef(), ((RealMatrixImpl) copy).getDataRef());
    }

    @Test
    public void testAdd_RealMatrixImpl() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{5.0, 6.0}, {7.0, 8.0}});
        RealMatrix result = m1.add(m2);
        Assert.assertEquals(6.0, result.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(8.0, result.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(10.0, result.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(12.0, result.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_dimensionMismatch_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{5.0, 6.0}});
        m1.add(m2);
    }

    private static class CustomRealMatrix implements RealMatrix {
        private final double[][] data;

        public CustomRealMatrix(double[][] data) {
            this.data = data;
        }

        public RealMatrix copy() { return new CustomRealMatrix(data); }
        public RealMatrix add(RealMatrix m) { return null; }
        public RealMatrix subtract(RealMatrix m) { return null; }
        public RealMatrix multiply(RealMatrix m) { return null; }
        public RealMatrix preMultiply(RealMatrix m) { return null; }
        public double[][] getData() { return data; }
        public double getNorm() { return 0; }
        public RealMatrix getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) { return null; }
        public RealMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns) { return null; }
        public RealMatrix getRowMatrix(int row) { return null; }
        public RealMatrix getColumnMatrix(int column) { return null; }
        public double[] getRow(int row) { return data[row]; }
        public double[] getColumn(int column) { return null; }
        public double getEntry(int row, int column) { return data[row][column]; }
        public RealMatrix transpose() { return null; }
        public RealMatrix inverse() { return null; }
        public double getDeterminant() { return 0; }
        public boolean isSquare() { return data.length == data[0].length; }
        public boolean isSingular() { return false; }
        public int getRowDimension() { return data.length; }
        public int getColumnDimension() { return data[0].length; }
        public double getTrace() { return 0; }
        public double[] operate(double[] v) { return null; }
        public double[] preMultiply(double[] v) { return null; }
        public double[] solve(double[] b) { return null; }
        public RealMatrix solve(RealMatrix b) { return null; }
        public RealMatrix scalarAdd(double d) { return null; }
        public RealMatrix scalarMultiply(double d) { return null; }
    }

    @Test
    public void testAdd_customRealMatrix() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix custom = new CustomRealMatrix(new double[][]{{5.0, 6.0}, {7.0, 8.0}});
        RealMatrix result = m1.add(custom);
        Assert.assertEquals(6.0, result.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(8.0, result.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(10.0, result.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(12.0, result.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAdd_customRealMatrixDimensionMismatch_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix custom = new CustomRealMatrix(new double[][]{{5.0, 6.0}});
        m1.add(custom);
    }

    @Test
    public void testSubtract_RealMatrixImpl() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{5.0, 6.0}, {7.0, 8.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix result = m1.subtract(m2);
        Assert.assertEquals(4.0, result.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, result.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(4.0, result.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(4.0, result.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_dimensionMismatch_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}});
        m1.subtract(m2);
    }

    @Test
    public void testSubtract_customRealMatrix() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{5.0, 6.0}, {7.0, 8.0}});
        RealMatrix custom = new CustomRealMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix result = m1.subtract(custom);
        Assert.assertEquals(4.0, result.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, result.getEntry(0, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_customRealMatrixDimensionMismatch_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix custom = new CustomRealMatrix(new double[][]{{1.0, 2.0, 3.0}});
        m1.subtract(custom);
    }

    @Test
    public void testScalarAdd() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix result = m.scalarAdd(2.5);
        Assert.assertEquals(3.5, result.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.5, result.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(5.5, result.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(6.5, result.getEntry(1, 1), TOLERANCE);
    }

    @Test
    public void testScalarMultiply() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, -2.0}, {3.0, 4.0}});
        RealMatrix result = m.scalarMultiply(2.0);
        Assert.assertEquals(2.0, result.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(-4.0, result.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(6.0, result.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(8.0, result.getEntry(1, 1), TOLERANCE);
    }

    @Test
    public void testMultiply_RealMatrixImpl() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{2.0, 0.0}, {1.0, 2.0}});
        RealMatrix result = m1.multiply(m2);
        Assert.assertEquals(4.0, result.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, result.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(10.0, result.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(8.0, result.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_dimensionMismatch_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{2.0, 0.0, 1.0}});
        m1.multiply(m2);
    }

    @Test
    public void testMultiply_customRealMatrix() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix custom = new CustomRealMatrix(new double[][]{{2.0, 0.0}, {1.0, 2.0}});
        RealMatrix result = m1.multiply(custom);
        Assert.assertEquals(4.0, result.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, result.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(10.0, result.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(8.0, result.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_customRealMatrixDimensionMismatch_throwsException() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix custom = new CustomRealMatrix(new double[][]{{2.0, 0.0, 1.0}});
        m1.multiply(custom);
    }

    @Test
    public void testPreMultiply_RealMatrix() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{2.0, 0.0}, {1.0, 2.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrix result = m1.preMultiply(m2);
        Assert.assertEquals(4.0, result.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, result.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(10.0, result.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(8.0, result.getEntry(1, 1), TOLERANCE);
    }

    @Test
    public void testGetData() {
        double[][] raw = {{1.0, 2.0}, {3.0, 4.0}};
        RealMatrixImpl m = new RealMatrixImpl(raw);
        double[][] data = m.getData();
        Assert.assertEquals(1.0, data[0][0], TOLERANCE);
        data[0][0] = 99.0;
        Assert.assertEquals(1.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test
    public void testGetNorm() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, -4.0}, {-3.0, 2.0}});
        // Column 0 abs sum: 1 + 3 = 4
        // Column 1 abs sum: 4 + 2 = 6
        Assert.assertEquals(6.0, m.getNorm(), TOLERANCE);
    }

    @Test
    public void testGetSubMatrix_rowColIndices() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        });
        RealMatrix sub = m.getSubMatrix(1, 2, 0, 1);
        Assert.assertEquals(2, sub.getRowDimension());
        Assert.assertEquals(2, sub.getColumnDimension());
        Assert.assertEquals(4.0, sub.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(5.0, sub.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(7.0, sub.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(8.0, sub.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_invalidRowRange_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        m.getSubMatrix(1, 0, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_outOfBoundsEndRow_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        m.getSubMatrix(0, 3, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_negativeStartColumn_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        m.getSubMatrix(0, 1, -1, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_invalidColumnRange_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        m.getSubMatrix(0, 1, 1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_outOfBoundsEndColumn_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        m.getSubMatrix(0, 1, 0, 3);
    }

    @Test
    public void testGetSubMatrix_selectedArrays() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        });
        RealMatrix sub = m.getSubMatrix(new int[]{0, 2}, new int[]{1, 2});
        Assert.assertEquals(2, sub.getRowDimension());
        Assert.assertEquals(2, sub.getColumnDimension());
        Assert.assertEquals(2.0, sub.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(3.0, sub.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(8.0, sub.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(9.0, sub.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_emptySelectedArrays_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        m.getSubMatrix(new int[]{}, new int[]{0});
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_outOfBoundsSelectedArrays_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        m.getSubMatrix(new int[]{0, 5}, new int[]{0, 1});
    }

    @Test
    public void testSetSubMatrix_valid() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        });
        m.setSubMatrix(new double[][]{{99.0, 98.0}, {97.0, 96.0}}, 1, 1);
        Assert.assertEquals(99.0, m.getEntry(1, 1), TOLERANCE);
        Assert.assertEquals(98.0, m.getEntry(1, 2), TOLERANCE);
        Assert.assertEquals(97.0, m.getEntry(2, 1), TOLERANCE);
        Assert.assertEquals(96.0, m.getEntry(2, 2), TOLERANCE);
        Assert.assertEquals(1.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test
    public void testSetSubMatrix_onUninitializedMatrix() {
        RealMatrixImpl m = new RealMatrixImpl();
        m.setSubMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}}, 0, 0);
        Assert.assertEquals(2, m.getRowDimension());
        Assert.assertEquals(2, m.getColumnDimension());
        Assert.assertEquals(1.0, m.getEntry(0, 0), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_negativeIndex_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.setSubMatrix(new double[][]{{1.0}}, -1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_emptyRows_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.setSubMatrix(new double[][]{}, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_emptyColumns_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.setSubMatrix(new double[][]{{}, {}}, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_nonRectangular_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.setSubMatrix(new double[][]{{1.0, 2.0}, {3.0}}, 0, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_uninitializedWithNonZeroOffset_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl();
        m.setSubMatrix(new double[][]{{1.0}}, 1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_exceedsDimension_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.setSubMatrix(new double[][]{{1.0, 2.0}, {3.0, 4.0}}, 1, 1);
    }

    @Test
    public void testGetRowMatrix() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}});
        RealMatrix row = m.getRowMatrix(1);
        Assert.assertEquals(1, row.getRowDimension());
        Assert.assertEquals(3, row.getColumnDimension());
        Assert.assertEquals(4.0, row.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(5.0, row.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(6.0, row.getEntry(0, 2), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_invalidRow_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getRowMatrix(2);
    }

    @Test
    public void testGetColumnMatrix() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}, {5.0, 6.0}});
        RealMatrix col = m.getColumnMatrix(1);
        Assert.assertEquals(3, col.getRowDimension());
        Assert.assertEquals(1, col.getColumnDimension());
        Assert.assertEquals(2.0, col.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, col.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(6.0, col.getEntry(2, 0), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrix_invalidColumn_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getColumnMatrix(2);
    }

    @Test
    public void testGetRow() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        double[] row = m.getRow(1);
        Assert.assertArrayEquals(new double[]{3.0, 4.0}, row, TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRow_invalidRow_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getRow(-1);
    }

    @Test
    public void testGetColumn() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        double[] col = m.getColumn(1);
        Assert.assertArrayEquals(new double[]{2.0, 4.0}, col, TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumn_invalidColumn_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getColumn(2);
    }

    @Test
    public void testGetEntry() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        Assert.assertEquals(3.0, m.getEntry(1, 0), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_invalidIndex_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(2, 2);
        m.getEntry(2, 0);
    }

    @Test
    public void testTranspose() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}});
        RealMatrix t = m.transpose();
        Assert.assertEquals(3, t.getRowDimension());
        Assert.assertEquals(2, t.getColumnDimension());
        Assert.assertEquals(1.0, t.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, t.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(2.0, t.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(5.0, t.getEntry(1, 1), TOLERANCE);
        Assert.assertEquals(3.0, t.getEntry(2, 0), TOLERANCE);
        Assert.assertEquals(6.0, t.getEntry(2, 1), TOLERANCE);
    }

    @Test
    public void testInverse() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{4.0, 7.0}, {2.0, 6.0}});
        RealMatrix inv = m.inverse();
        RealMatrix identity = m.multiply(inv);
        Assert.assertEquals(1.0, identity.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(0.0, identity.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(0.0, identity.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(1.0, identity.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testInverse_singular_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {2.0, 4.0}});
        m.inverse();
    }

    @Test
    public void testGetDeterminant_nonSingular() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        // det = 1*4 - 2*3 = -2
        Assert.assertEquals(-2.0, m.getDeterminant(), TOLERANCE);
        // Cached branch
        Assert.assertEquals(-2.0, m.getDeterminant(), TOLERANCE);
    }

    @Test
    public void testGetDeterminant_singular() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {2.0, 4.0}});
        Assert.assertEquals(0.0, m.getDeterminant(), TOLERANCE);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testGetDeterminant_nonSquare_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}});
        m.getDeterminant();
    }

    @Test
    public void testIsSquare() {
        Assert.assertTrue(new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}}).isSquare());
        Assert.assertFalse(new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}}).isSquare());
    }

    @Test
    public void testIsSingular() {
        RealMatrixImpl singular = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {2.0, 4.0}});
        Assert.assertTrue(singular.isSingular());

        RealMatrixImpl nonSingular = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        Assert.assertFalse(nonSingular.isSingular());
        // Verify branch when LU is already cached
        Assert.assertFalse(nonSingular.isSingular());
    }

    @Test
    public void testGetTrace() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        Assert.assertEquals(5.0, m.getTrace(), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTrace_nonSquare_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}});
        m.getTrace();
    }

    @Test
    public void testOperate() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        double[] v = {2.0, 3.0};
        double[] result = m.operate(v);
        Assert.assertArrayEquals(new double[]{8.0, 18.0}, result, TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperate_dimensionMismatch_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        m.operate(new double[]{1.0});
    }

    @Test
    public void testPreMultiply_Vector() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        double[] v = {2.0, 3.0};
        double[] result = m.preMultiply(v);
        // v * m = [2*1 + 3*3, 2*2 + 3*4] = [11, 16]
        Assert.assertArrayEquals(new double[]{11.0, 16.0}, result, TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiply_VectorDimensionMismatch_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        m.preMultiply(new double[]{1.0});
    }

    @Test
    public void testSolve_Vector() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{2.0, 1.0}, {1.0, 3.0}});
        double[] b = {5.0, 10.0};
        double[] solution = m.solve(b);
        Assert.assertEquals(1.0, solution[0], TOLERANCE);
        Assert.assertEquals(3.0, solution[1], TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_VectorDimensionMismatch_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{2.0, 1.0}, {1.0, 3.0}});
        m.solve(new double[]{5.0});
    }

    @Test
    public void testSolve_Matrix() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{2.0, 1.0}, {1.0, 3.0}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{5.0, 2.0}, {10.0, 1.0}});
        RealMatrix solution = m.solve(b);
        Assert.assertEquals(1.0, solution.getEntry(0, 0), TOLERANCE);
        Assert.assertEquals(3.0, solution.getEntry(1, 0), TOLERANCE);
        Assert.assertEquals(1.0, solution.getEntry(0, 1), TOLERANCE);
        Assert.assertEquals(0.0, solution.getEntry(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolve_MatrixRowDimensionMismatch_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{2.0, 1.0}, {1.0, 3.0}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{5.0}});
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolve_nonSquare_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{2.0, 1.0, 0.0}, {1.0, 3.0, 0.0}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{5.0}, {10.0}});
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolve_singularMatrix_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {2.0, 4.0}});
        RealMatrixImpl b = new RealMatrixImpl(new double[][]{{1.0}, {2.0}});
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecompose_nonSquare_throwsException() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}});
        m.luDecompose();
    }

    @Test
    public void testProtectedLUMatrixAndPermutation() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{0.0, 1.0}, {1.0, 0.0}});
        RealMatrix lu = m.getLUMatrix();
        Assert.assertNotNull(lu);
        int[] perm = m.getPermutation();
        Assert.assertEquals(1, perm[0]);
        Assert.assertEquals(0, perm[1]);

        // Second call tests cached branch of getLUMatrix
        RealMatrix luCached = m.getLUMatrix();
        Assert.assertEquals(lu, luCached);
    }

    @Test
    public void testToString() {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        Assert.assertEquals("RealMatrixImpl{{1.0,2.0},{3.0,4.0}}", m.toString());
    }

    @Test
    public void testEqualsAndHashCode() {
        RealMatrixImpl m1 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrixImpl m2 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        RealMatrixImpl m3 = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 5.0}});
        RealMatrixImpl m4 = new RealMatrixImpl(new double[][]{{1.0, 2.0, 3.0}});

        Assert.assertTrue(m1.equals(m1));
        Assert.assertTrue(m1.equals(m2));
        Assert.assertEquals(m1.hashCode(), m2.hashCode());

        Assert.assertFalse(m1.equals(null));
        Assert.assertFalse(m1.equals("string"));
        Assert.assertFalse(m1.equals(m3));
        Assert.assertFalse(m1.equals(m4));
    }

    @Test
    public void testSerialization() throws Exception {
        RealMatrixImpl m = new RealMatrixImpl(new double[][]{{1.0, 2.0}, {3.0, 4.0}});
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(m);
        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        RealMatrixImpl deserialized = (RealMatrixImpl) ois.readObject();

        Assert.assertEquals(m, deserialized);
    }
}
