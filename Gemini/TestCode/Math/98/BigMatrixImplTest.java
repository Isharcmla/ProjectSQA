package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class BigMatrixImplTest {

    private static final double TOLERANCE = 1e-9;

    @Test
    public void testDefaultConstructor() {
        BigMatrixImpl m = new BigMatrixImpl();
        Assert.assertNull(m.getDataRef());
        Assert.assertEquals("BigMatrixImpl{}", m.toString());
    }

    @Test
    public void testDimensionConstructor_validDimensions() {
        BigMatrixImpl m = new BigMatrixImpl(3, 4);
        Assert.assertEquals(3, m.getRowDimension());
        Assert.assertEquals(4, m.getColumnDimension());
        Assert.assertNull(m.getEntry(0, 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructor_invalidRow() {
        new BigMatrixImpl(0, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDimensionConstructor_invalidColumn() {
        new BigMatrixImpl(2, -1);
    }

    @Test
    public void testBigDecimal2DConstructor_copyArrayTrue() {
        BigDecimal[][] data = new BigDecimal[][]{
                {new BigDecimal("1"), new BigDecimal("2")},
                {new BigDecimal("3"), new BigDecimal("4")}
        };
        BigMatrixImpl m = new BigMatrixImpl(data, true);
        Assert.assertEquals(new BigDecimal("1"), m.getEntry(0, 0));
        data[0][0] = new BigDecimal("99");
        Assert.assertEquals(new BigDecimal("1"), m.getEntry(0, 0));
    }

    @Test
    public void testBigDecimal2DConstructor_copyArrayFalse() {
        BigDecimal[][] data = new BigDecimal[][]{
                {new BigDecimal("1"), new BigDecimal("2")},
                {new BigDecimal("3"), new BigDecimal("4")}
        };
        BigMatrixImpl m = new BigMatrixImpl(data, false);
        Assert.assertSame(data, m.getDataRef());
    }

    @Test(expected = NullPointerException.class)
    public void testBigDecimal2DConstructor_nullArrayFalse() {
        new BigMatrixImpl((BigDecimal[][]) null, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigDecimal2DConstructor_emptyRowsFalse() {
        new BigMatrixImpl(new BigDecimal[][]{}, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigDecimal2DConstructor_emptyColsFalse() {
        new BigMatrixImpl(new BigDecimal[][]{{}}, false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigDecimal2DConstructor_raggedFalse() {
        BigDecimal[][] data = new BigDecimal[][]{
                {new BigDecimal("1"), new BigDecimal("2")},
                {new BigDecimal("3")}
        };
        new BigMatrixImpl(data, false);
    }

    @Test
    public void testDouble2DConstructor_valid() {
        double[][] data = new double[][]{
                {1.0, 2.0},
                {3.0, 4.0}
        };
        BigMatrixImpl m = new BigMatrixImpl(data);
        Assert.assertEquals(2, m.getRowDimension());
        Assert.assertEquals(2, m.getColumnDimension());
        Assert.assertEquals(1.0, m.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, m.getEntryAsDouble(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDouble2DConstructor_emptyRows() {
        new BigMatrixImpl(new double[][]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDouble2DConstructor_emptyCols() {
        new BigMatrixImpl(new double[][]{{}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDouble2DConstructor_ragged() {
        new double[][]{{1.0, 2.0}, {3.0}};
        new BigMatrixImpl(new double[][]{{1.0, 2.0}, {3.0}});
    }

    @Test
    public void testString2DConstructor_valid() {
        String[][] data = new String[][]{
                {"1.5", "2.5"},
                {"3.5", "4.5"}
        };
        BigMatrixImpl m = new BigMatrixImpl(data);
        Assert.assertEquals(new BigDecimal("1.5"), m.getEntry(0, 0));
        Assert.assertEquals(new BigDecimal("4.5"), m.getEntry(1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testString2DConstructor_emptyRows() {
        new BigMatrixImpl(new String[][]{});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testString2DConstructor_emptyCols() {
        new BigMatrixImpl(new String[][]{{}});
    }

    @Test(expected = IllegalArgumentException.class)
    public void testString2DConstructor_ragged() {
        new BigMatrixImpl(new String[][]{{"1", "2"}, {"3"}});
    }

    @Test
    public void testBigDecimalVectorConstructor() {
        BigDecimal[] v = new BigDecimal[]{new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3")};
        BigMatrixImpl m = new BigMatrixImpl(v);
        Assert.assertEquals(3, m.getRowDimension());
        Assert.assertEquals(1, m.getColumnDimension());
        Assert.assertEquals(new BigDecimal("1"), m.getEntry(0, 0));
        Assert.assertEquals(new BigDecimal("2"), m.getEntry(1, 0));
        Assert.assertEquals(new BigDecimal("3"), m.getEntry(2, 0));
    }

    @Test
    public void testCopy() {
        double[][] data = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(data);
        BigMatrix copy = m.copy();
        Assert.assertEquals(m, copy);
        Assert.assertNotSame(m.getDataRef(), ((BigMatrixImpl) copy).getDataRef());
    }

    @Test
    public void testAddBigMatrixImpl() {
        double[][] d1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] d2 = {{5.0, 6.0}, {7.0, 8.0}};
        BigMatrixImpl m1 = new BigMatrixImpl(d1);
        BigMatrixImpl m2 = new BigMatrixImpl(d2);
        BigMatrixImpl res = m1.add(m2);

        Assert.assertEquals(6.0, res.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(8.0, res.getEntryAsDouble(0, 1), TOLERANCE);
        Assert.assertEquals(10.0, res.getEntryAsDouble(1, 0), TOLERANCE);
        Assert.assertEquals(12.0, res.getEntryAsDouble(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddBigMatrixImpl_dimensionMismatch() {
        BigMatrixImpl m1 = new BigMatrixImpl(2, 2);
        BigMatrixImpl m2 = new BigMatrixImpl(2, 3);
        m1.add(m2);
    }

    @Test
    public void testAddCustomBigMatrixInterface() {
        final double[][] d1 = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m1 = new BigMatrixImpl(d1);

        BigMatrix custom = new DummyBigMatrix(2, 2, new BigDecimal("2.0"));
        BigMatrix res = m1.add(custom);
        Assert.assertEquals(new BigDecimal("3.0"), res.getEntry(0, 0));
        Assert.assertEquals(new BigDecimal("4.0"), res.getEntry(0, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddCustomBigMatrixInterface_dimensionMismatch() {
        BigMatrixImpl m1 = new BigMatrixImpl(2, 2);
        BigMatrix custom = new DummyBigMatrix(3, 2, new BigDecimal("1.0"));
        m1.add(custom);
    }

    @Test
    public void testSubtractBigMatrixImpl() {
        double[][] d1 = {{5.0, 6.0}, {7.0, 8.0}};
        double[][] d2 = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m1 = new BigMatrixImpl(d1);
        BigMatrixImpl m2 = new BigMatrixImpl(d2);
        BigMatrixImpl res = m1.subtract(m2);

        Assert.assertEquals(4.0, res.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, res.getEntryAsDouble(0, 1), TOLERANCE);
        Assert.assertEquals(4.0, res.getEntryAsDouble(1, 0), TOLERANCE);
        Assert.assertEquals(4.0, res.getEntryAsDouble(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractBigMatrixImpl_dimensionMismatch() {
        BigMatrixImpl m1 = new BigMatrixImpl(2, 2);
        BigMatrixImpl m2 = new BigMatrixImpl(3, 2);
        m1.subtract(m2);
    }

    @Test
    public void testSubtractCustomBigMatrixInterface() {
        double[][] d1 = {{5.0, 6.0}, {7.0, 8.0}};
        BigMatrixImpl m1 = new BigMatrixImpl(d1);
        BigMatrix custom = new DummyBigMatrix(2, 2, new BigDecimal("1.0"));
        BigMatrix res = m1.subtract(custom);

        Assert.assertEquals(new BigDecimal("4.0"), res.getEntry(0, 0));
        Assert.assertEquals(new BigDecimal("7.0"), res.getEntry(1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSubtractCustomBigMatrixInterface_dimensionMismatch() {
        BigMatrixImpl m1 = new BigMatrixImpl(2, 2);
        BigMatrix custom = new DummyBigMatrix(2, 3, new BigDecimal("1.0"));
        m1.subtract(custom);
    }

    @Test
    public void testScalarAdd() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);
        BigMatrix res = m.scalarAdd(new BigDecimal("10"));
        Assert.assertEquals(11.0, res.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(14.0, res.getEntryAsDouble(1, 1), TOLERANCE);
    }

    @Test
    public void testScalarMultiply() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);
        BigMatrix res = m.scalarMultiply(new BigDecimal("2"));
        Assert.assertEquals(2.0, res.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(8.0, res.getEntryAsDouble(1, 1), TOLERANCE);
    }

    @Test
    public void testMultiplyBigMatrixImpl() {
        double[][] d1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] d2 = {{2.0, 0.0}, {1.0, 2.0}};
        BigMatrixImpl m1 = new BigMatrixImpl(d1);
        BigMatrixImpl m2 = new BigMatrixImpl(d2);
        BigMatrixImpl res = m1.multiply(m2);

        Assert.assertEquals(4.0, res.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, res.getEntryAsDouble(0, 1), TOLERANCE);
        Assert.assertEquals(10.0, res.getEntryAsDouble(1, 0), TOLERANCE);
        Assert.assertEquals(8.0, res.getEntryAsDouble(1, 1), TOLERANCE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyBigMatrixImpl_incompatible() {
        BigMatrixImpl m1 = new BigMatrixImpl(2, 3);
        BigMatrixImpl m2 = new BigMatrixImpl(2, 2);
        m1.multiply(m2);
    }

    @Test
    public void testMultiplyCustomBigMatrixInterface() {
        double[][] d1 = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m1 = new BigMatrixImpl(d1);
        BigMatrix custom = new DummyBigMatrix(2, 2, new BigDecimal("1.0"));
        BigMatrix res = m1.multiply(custom);

        Assert.assertEquals(new BigDecimal("3.0"), res.getEntry(0, 0));
        Assert.assertEquals(new BigDecimal("7.0"), res.getEntry(1, 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplyCustomBigMatrixInterface_incompatible() {
        BigMatrixImpl m1 = new BigMatrixImpl(2, 3);
        BigMatrix custom = new DummyBigMatrix(2, 2, new BigDecimal("1.0"));
        m1.multiply(custom);
    }

    @Test
    public void testPreMultiplyBigMatrix() {
        double[][] d1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] d2 = {{2.0, 0.0}, {1.0, 2.0}};
        BigMatrixImpl m1 = new BigMatrixImpl(d1);
        BigMatrixImpl m2 = new BigMatrixImpl(d2);
        BigMatrix res = m1.preMultiply(m2);

        Assert.assertEquals(2.0, res.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, res.getEntryAsDouble(0, 1), TOLERANCE);
        Assert.assertEquals(7.0, res.getEntryAsDouble(1, 0), TOLERANCE);
        Assert.assertEquals(10.0, res.getEntryAsDouble(1, 1), TOLERANCE);
    }

    @Test
    public void testGetDataAndGetDataAsDoubleArray() {
        double[][] d = {{1.5, 2.5}, {3.5, 4.5}};
        BigMatrixImpl m = new BigMatrixImpl(d);
        BigDecimal[][] bd = m.getData();
        Assert.assertEquals(new BigDecimal("1.5"), bd[0][0]);
        Assert.assertNotSame(bd, m.getDataRef());

        double[][] doubleArr = m.getDataAsDoubleArray();
        Assert.assertEquals(1.5, doubleArr[0][0], TOLERANCE);
        Assert.assertEquals(4.5, doubleArr[1][1], TOLERANCE);
    }

    @Test
    public void testRoundingModeAndScale() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        Assert.assertEquals(BigDecimal.ROUND_HALF_UP, m.getRoundingMode());
        m.setRoundingMode(BigDecimal.ROUND_DOWN);
        Assert.assertEquals(BigDecimal.ROUND_DOWN, m.getRoundingMode());

        Assert.assertEquals(64, m.getScale());
        m.setScale(32);
        Assert.assertEquals(32, m.getScale());
    }

    @Test
    public void testGetNorm() {
        double[][] d = {{1.0, -5.0}, {-2.0, 3.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);
        BigDecimal norm = m.getNorm();
        Assert.assertEquals(new BigDecimal("8.0"), norm);
    }

    @Test
    public void testGetSubMatrix_rowColIndices() {
        double[][] d = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };
        BigMatrixImpl m = new BigMatrixImpl(d);
        BigMatrix sub = m.getSubMatrix(0, 1, 1, 2);
        Assert.assertEquals(2, sub.getRowDimension());
        Assert.assertEquals(2, sub.getColumnDimension());
        Assert.assertEquals(2.0, sub.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(3.0, sub.getEntryAsDouble(0, 1), TOLERANCE);
        Assert.assertEquals(5.0, sub.getEntryAsDouble(1, 0), TOLERANCE);
        Assert.assertEquals(6.0, sub.getEntryAsDouble(1, 1), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_invalidIndices() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        m.getSubMatrix(-1, 2, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_startGreaterThanEnd() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        m.getSubMatrix(2, 1, 0, 1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_outOfBounds() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        m.getSubMatrix(0, 3, 0, 1);
    }

    @Test
    public void testGetSubMatrix_selectedArrays() {
        double[][] d = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };
        BigMatrixImpl m = new BigMatrixImpl(d);
        BigMatrix sub = m.getSubMatrix(new int[]{0, 2}, new int[]{1, 2});
        Assert.assertEquals(2.0, sub.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(3.0, sub.getEntryAsDouble(0, 1), TOLERANCE);
        Assert.assertEquals(8.0, sub.getEntryAsDouble(1, 0), TOLERANCE);
        Assert.assertEquals(9.0, sub.getEntryAsDouble(1, 1), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_emptySelectionArrays() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        m.getSubMatrix(new int[]{}, new int[]{0});
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_selectedArraysOutOfBounds() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        m.getSubMatrix(new int[]{0, 5}, new int[]{0, 1});
    }

    @Test
    public void testSetSubMatrix_valid() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m.getDataRef()[i][j] = BigDecimal.ZERO;
            }
        }
        BigDecimal[][] sub = new BigDecimal[][]{
                {new BigDecimal("8"), new BigDecimal("9")},
                {new BigDecimal("10"), new BigDecimal("11")}
        };
        m.setSubMatrix(sub, 1, 1);
        Assert.assertEquals(new BigDecimal("8"), m.getEntry(1, 1));
        Assert.assertEquals(new BigDecimal("11"), m.getEntry(2, 2));
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_negativeIndex() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        m.setSubMatrix(new BigDecimal[][]{{new BigDecimal("1")}}, -1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_emptyRows() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        m.setSubMatrix(new BigDecimal[][]{}, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_emptyCols() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        m.setSubMatrix(new BigDecimal[][]{{}}, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_ragged() {
        BigMatrixImpl m = new BigMatrixImpl(3, 3);
        BigDecimal[][] sub = new BigDecimal[][]{
                {new BigDecimal("1"), new BigDecimal("2")},
                {new BigDecimal("3")}
        };
        m.setSubMatrix(sub, 0, 0);
    }

    @Test
    public void testSetSubMatrix_nullDataInit() {
        BigMatrixImpl m = new BigMatrixImpl();
        BigDecimal[][] sub = new BigDecimal[][]{
                {new BigDecimal("1"), new BigDecimal("2")},
                {new BigDecimal("3"), new BigDecimal("4")}
        };
        m.setSubMatrix(sub, 0, 0);
        Assert.assertEquals(2, m.getRowDimension());
        Assert.assertEquals(2, m.getColumnDimension());
        Assert.assertEquals(new BigDecimal("4"), m.getEntry(1, 1));
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_nullDataInitOffsetException() {
        BigMatrixImpl m = new BigMatrixImpl();
        BigDecimal[][] sub = new BigDecimal[][]{{new BigDecimal("1")}};
        m.setSubMatrix(sub, 1, 0);
    }

    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_exceedDimensions() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        BigDecimal[][] sub = new BigDecimal[][]{
                {new BigDecimal("1"), new BigDecimal("2")},
                {new BigDecimal("3"), new BigDecimal("4")}
        };
        m.setSubMatrix(sub, 1, 1);
    }

    @Test
    public void testGetRowMatrixAndColumnMatrix() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);

        BigMatrix rowMat = m.getRowMatrix(1);
        Assert.assertEquals(1, rowMat.getRowDimension());
        Assert.assertEquals(2, rowMat.getColumnDimension());
        Assert.assertEquals(3.0, rowMat.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, rowMat.getEntryAsDouble(0, 1), TOLERANCE);

        BigMatrix colMat = m.getColumnMatrix(0);
        Assert.assertEquals(2, colMat.getRowDimension());
        Assert.assertEquals(1, colMat.getColumnDimension());
        Assert.assertEquals(1.0, colMat.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(3.0, colMat.getEntryAsDouble(1, 0), TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_invalidRow() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.getRowMatrix(2);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrix_invalidCol() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.getColumnMatrix(-1);
    }

    @Test
    public void testGetRowAndColumnArrays() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);

        BigDecimal[] row0 = m.getRow(0);
        Assert.assertEquals(2, row0.length);
        Assert.assertEquals(1.0, row0[0].doubleValue(), TOLERANCE);
        Assert.assertEquals(2.0, row0[1].doubleValue(), TOLERANCE);

        double[] row0d = m.getRowAsDoubleArray(0);
        Assert.assertEquals(1.0, row0d[0], TOLERANCE);
        Assert.assertEquals(2.0, row0d[1], TOLERANCE);

        BigDecimal[] col1 = m.getColumn(1);
        Assert.assertEquals(2, col1.length);
        Assert.assertEquals(2.0, col1[0].doubleValue(), TOLERANCE);
        Assert.assertEquals(4.0, col1[1].doubleValue(), TOLERANCE);

        double[] col1d = m.getColumnAsDoubleArray(1);
        Assert.assertEquals(2.0, col1d[0], TOLERANCE);
        Assert.assertEquals(4.0, col1d[1], TOLERANCE);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRow_invalid() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.getRow(2);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetRowAsDoubleArray_invalid() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.getRowAsDoubleArray(-1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumn_invalid() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.getColumn(2);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetColumnAsDoubleArray_invalid() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.getColumnAsDoubleArray(-1);
    }

    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_invalid() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.getEntry(5, 5);
    }

    @Test
    public void testTranspose() {
        double[][] d = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);
        BigMatrix t = m.transpose();

        Assert.assertEquals(3, t.getRowDimension());
        Assert.assertEquals(2, t.getColumnDimension());
        Assert.assertEquals(1.0, t.getEntryAsDouble(0, 0), TOLERANCE);
        Assert.assertEquals(4.0, t.getEntryAsDouble(0, 1), TOLERANCE);
        Assert.assertEquals(2.0, t.getEntryAsDouble(1, 0), TOLERANCE);
        Assert.assertEquals(5.0, t.getEntryAsDouble(1, 1), TOLERANCE);
        Assert.assertEquals(3.0, t.getEntryAsDouble(2, 0), TOLERANCE);
        Assert.assertEquals(6.0, t.getEntryAsDouble(2, 1), TOLERANCE);
    }

    @Test
    public void testDeterminantAndIsSquareAndIsSingular() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);

        Assert.assertTrue(m.isSquare());
        Assert.assertFalse(m.isSingular());
        BigDecimal det = m.getDeterminant();
        Assert.assertEquals(-2.0, det.doubleValue(), TOLERANCE);

        // Singular matrix
        double[][] sing = {{1.0, 2.0}, {2.0, 4.0}};
        BigMatrixImpl mSing = new BigMatrixImpl(sing);
        Assert.assertTrue(mSing.isSingular());
        Assert.assertEquals(BigDecimal.ZERO, mSing.getDeterminant());
    }

    @Test(expected = InvalidMatrixException.class)
    public void testDeterminant_nonSquare() {
        BigMatrixImpl m = new BigMatrixImpl(2, 3);
        m.getDeterminant();
    }

    @Test
    public void testGetTrace() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);
        Assert.assertEquals(new BigDecimal("5.0"), m.getTrace());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetTrace_nonSquare() {
        BigMatrixImpl m = new BigMatrixImpl(2, 3);
        m.getTrace();
    }

    @Test
    public void testOperateBigDecimalAndDouble() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);

        double[] vDouble = {2.0, 3.0};
        BigDecimal[] resDouble = m.operate(vDouble);
        Assert.assertEquals(8.0, resDouble[0].doubleValue(), TOLERANCE);
        Assert.assertEquals(18.0, resDouble[1].doubleValue(), TOLERANCE);

        BigDecimal[] vBD = {new BigDecimal("2.0"), new BigDecimal("3.0")};
        BigDecimal[] resBD = m.operate(vBD);
        Assert.assertEquals(new BigDecimal("8.00"), resBD[0]);
        Assert.assertEquals(new BigDecimal("18.00"), resBD[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperate_wrongLength() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.operate(new BigDecimal[]{BigDecimal.ONE});
    }

    @Test
    public void testPreMultiplyVector() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);
        BigDecimal[] v = {new BigDecimal("2.0"), new BigDecimal("3.0")};
        BigDecimal[] res = m.preMultiply(v);

        Assert.assertEquals(new BigDecimal("11.00"), res[0]);
        Assert.assertEquals(new BigDecimal("16.00"), res[1]);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiplyVector_wrongLength() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.preMultiply(new BigDecimal[]{BigDecimal.ONE, BigDecimal.ONE, BigDecimal.ONE});
    }

    @Test
    public void testSolveVectorAndDoubleVector() {
        double[][] d = {{2.0, 1.0}, {1.0, 3.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);

        double[] bDouble = {4.0, 7.0};
        BigDecimal[] xDouble = m.solve(bDouble);
        Assert.assertEquals(1.0, xDouble[0].doubleValue(), 1e-6);
        Assert.assertEquals(2.0, xDouble[1].doubleValue(), 1e-6);

        BigDecimal[] bBD = {new BigDecimal("4.0"), new BigDecimal("7.0")};
        BigDecimal[] xBD = m.solve(bBD);
        Assert.assertEquals(1.0, xBD[0].doubleValue(), 1e-6);
        Assert.assertEquals(2.0, xBD[1].doubleValue(), 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveVector_wrongLength() {
        BigMatrixImpl m = new BigMatrixImpl(2, 2);
        m.solve(new BigDecimal[]{BigDecimal.ONE});
    }

    @Test
    public void testSolveMatrixAndInverse() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);
        BigMatrix inv = m.inverse();

        BigMatrix identity = m.multiply(inv);
        Assert.assertEquals(1.0, identity.getEntryAsDouble(0, 0), 1e-6);
        Assert.assertEquals(0.0, identity.getEntryAsDouble(0, 1), 1e-6);
        Assert.assertEquals(0.0, identity.getEntryAsDouble(1, 0), 1e-6);
        Assert.assertEquals(1.0, identity.getEntryAsDouble(1, 1), 1e-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSolveMatrix_dimensionMismatch() {
        BigMatrixImpl m1 = new BigMatrixImpl(2, 2);
        BigMatrixImpl m2 = new BigMatrixImpl(3, 2);
        m1.solve(m2);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveMatrix_nonSquare() {
        BigMatrixImpl m1 = new BigMatrixImpl(2, 3);
        BigMatrixImpl m2 = new BigMatrixImpl(2, 2);
        m1.solve(m2);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testSolveMatrix_singular() {
        double[][] sing = {{1.0, 2.0}, {2.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(sing);
        BigMatrixImpl b = new BigMatrixImpl(new double[][]{{1.0}, {2.0}});
        m.solve(b);
    }

    @Test(expected = InvalidMatrixException.class)
    public void testLuDecompose_nonSquare() {
        BigMatrixImpl m = new BigMatrixImpl(2, 3);
        m.luDecompose();
    }

    @Test
    public void testLuDecomposeWithPivoting() {
        // Pivot necessary matrix
        double[][] d = {
                {0.0, 2.0, 1.0},
                {2.0, 1.0, 3.0},
                {1.0, 4.0, 2.0}
        };
        BigMatrixImpl m = new BigMatrixImpl(d);
        m.luDecompose();
        BigMatrix lu = m.getLUMatrix();
        Assert.assertNotNull(lu);
        int[] perm = m.getPermutation();
        Assert.assertEquals(3, perm.length);
    }

    @Test
    public void testEqualsAndHashCode() {
        double[][] d1 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] d2 = {{1.0, 2.0}, {3.0, 4.0}};
        double[][] d3 = {{1.0, 2.0}, {3.0, 5.0}};
        BigMatrixImpl m1 = new BigMatrixImpl(d1);
        BigMatrixImpl m2 = new BigMatrixImpl(d2);
        BigMatrixImpl m3 = new BigMatrixImpl(d3);

        Assert.assertTrue(m1.equals(m1));
        Assert.assertTrue(m1.equals(m2));
        Assert.assertEquals(m1.hashCode(), m2.hashCode());

        Assert.assertFalse(m1.equals(null));
        Assert.assertFalse(m1.equals("Not a matrix"));
        Assert.assertFalse(m1.equals(m3));

        BigMatrixImpl diffDim = new BigMatrixImpl(2, 3);
        Assert.assertFalse(m1.equals(diffDim));
        BigMatrixImpl diffDim2 = new BigMatrixImpl(3, 2);
        Assert.assertFalse(m1.equals(diffDim2));
    }

    @Test
    public void testToString() {
        double[][] d = {{1.0, 2.0}, {3.0, 4.0}};
        BigMatrixImpl m = new BigMatrixImpl(d);
        String s = m.toString();
        Assert.assertTrue(s.startsWith("BigMatrixImpl{"));
        Assert.assertTrue(s.contains("1.0"));
        Assert.assertTrue(s.contains("4.0"));
    }

    /**
     * Helper dummy implementation of BigMatrix for interface testing.
     */
    private static class DummyBigMatrix implements BigMatrix {
        private final int rows;
        private final int cols;
        private final BigDecimal val;

        DummyBigMatrix(int rows, int cols, BigDecimal val) {
            this.rows = rows;
            this.cols = cols;
            this.val = val;
        }

        public BigMatrix copy() { return this; }
        public BigMatrix add(BigMatrix m) { return null; }
        public BigMatrix subtract(BigMatrix m) { return null; }
        public BigMatrix scalarAdd(BigDecimal d) { return null; }
        public BigMatrix scalarMultiply(BigDecimal d) { return null; }
        public BigMatrix multiply(BigMatrix m) { return null; }
        public BigMatrix preMultiply(BigMatrix m) { return null; }
        public BigDecimal[][] getData() { return new BigDecimal[0][0]; }
        public double[][] getDataAsDoubleArray() { return new double[0][0]; }
        public int getRoundingMode() { return 0; }
        public void setRoundingMode(int roundingMode) {}
        public int getScale() { return 0; }
        public void setScale(int scale) {}
        public BigDecimal getNorm() { return null; }
        public BigMatrix getSubMatrix(int startRow, int endRow, int startColumn, int endColumn) { return null; }
        public BigMatrix getSubMatrix(int[] selectedRows, int[] selectedColumns) { return null; }
        public BigMatrix getRowMatrix(int row) { return null; }
        public BigMatrix getColumnMatrix(int column) { return null; }
        public BigDecimal[] getRow(int row) { return new BigDecimal[0]; }
        public double[] getRowAsDoubleArray(int row) { return new double[0]; }
        public BigDecimal[] getColumn(int col) { return new BigDecimal[0]; }
        public double[] getColumnAsDoubleArray(int col) { return new double[0]; }
        public BigDecimal getEntry(int row, int column) { return val; }
        public double getEntryAsDouble(int row, int column) { return val.doubleValue(); }
        public BigMatrix transpose() { return null; }
        public BigMatrix inverse() { return null; }
        public BigDecimal getDeterminant() { return null; }
        public boolean isSquare() { return rows == cols; }
        public boolean isSingular() { return false; }
        public int getRowDimension() { return rows; }
        public int getColumnDimension() { return cols; }
        public BigDecimal getTrace() { return null; }
        public BigDecimal[] operate(BigDecimal[] v) { return new BigDecimal[0]; }
        public BigDecimal[] operate(double[] v) { return new BigDecimal[0]; }
        public BigDecimal[] preMultiply(BigDecimal[] v) { return new BigDecimal[0]; }
        public BigDecimal[] solve(BigDecimal[] b) { return new BigDecimal[0]; }
        public BigDecimal[] solve(double[] b) { return new BigDecimal[0]; }
        public BigMatrix solve(BigMatrix b) { return null; }
    }
}
