package org.apache.commons.math.linear;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.junit.Assert;
import org.junit.Test;

public class OpenMapRealMatrixTest {

    private static final double EPSILON = 1e-15;

    @Test
    public void testConstructor_validDimensions() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 4);
        Assert.assertEquals(3, matrix.getRowDimension());
        Assert.assertEquals(4, matrix.getColumnDimension());
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 4; c++) {
                Assert.assertEquals(0.0, matrix.getEntry(r, c), EPSILON);
            }
        }
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_invalidRowDimension_throwsException() {
        new OpenMapRealMatrix(0, 4);
    }

    @Test(expected = NotStrictlyPositiveException.class)
    public void testConstructor_invalidColumnDimension_throwsException() {
        new OpenMapRealMatrix(3, 0);
    }

    @Test
    public void testCopyConstructor() {
        OpenMapRealMatrix original = new OpenMapRealMatrix(2, 2);
        original.setEntry(0, 0, 1.5);
        original.setEntry(1, 1, 2.5);

        OpenMapRealMatrix copy = new OpenMapRealMatrix(original);
        Assert.assertEquals(2, copy.getRowDimension());
        Assert.assertEquals(2, copy.getColumnDimension());
        Assert.assertEquals(1.5, copy.getEntry(0, 0), EPSILON);
        Assert.assertEquals(0.0, copy.getEntry(0, 1), EPSILON);
        Assert.assertEquals(0.0, copy.getEntry(1, 0), EPSILON);
        Assert.assertEquals(2.5, copy.getEntry(1, 1), EPSILON);

        // Verify independence
        original.setEntry(0, 0, 9.9);
        Assert.assertEquals(1.5, copy.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testCopy() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.setEntry(0, 1, 4.0);
        matrix.setEntry(2, 2, 8.0);

        OpenMapRealMatrix copy = matrix.copy();
        Assert.assertEquals(3, copy.getRowDimension());
        Assert.assertEquals(3, copy.getColumnDimension());
        Assert.assertEquals(4.0, copy.getEntry(0, 1), EPSILON);
        Assert.assertEquals(8.0, copy.getEntry(2, 2), EPSILON);

        matrix.setEntry(0, 1, 100.0);
        Assert.assertEquals(4.0, copy.getEntry(0, 1), EPSILON);
    }

    @Test
    public void testCreateMatrix() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix created = matrix.createMatrix(4, 5);

        Assert.assertNotNull(created);
        Assert.assertEquals(4, created.getRowDimension());
        Assert.assertEquals(5, created.getColumnDimension());
        Assert.assertEquals(0.0, created.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testGetRowAndColumnDimension() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(5, 7);
        Assert.assertEquals(5, matrix.getRowDimension());
        Assert.assertEquals(7, matrix.getColumnDimension());
    }

    @Test
    public void testSetEntry_and_GetEntry() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);

        matrix.setEntry(1, 2, 5.5);
        Assert.assertEquals(5.5, matrix.getEntry(1, 2), EPSILON);

        // Setting entry to 0.0 removes it from the map
        matrix.setEntry(1, 2, 0.0);
        Assert.assertEquals(0.0, matrix.getEntry(1, 2), EPSILON);

        // Setting a zero entry to non-zero
        matrix.setEntry(0, 0, -3.2);
        Assert.assertEquals(-3.2, matrix.getEntry(0, 0), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_negativeRow_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.getEntry(-1, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_rowOutOfBounds_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.getEntry(2, 0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_negativeColumn_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.getEntry(0, -1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_columnOutOfBounds_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.getEntry(0, 2);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_invalidRow_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(3, 0, 1.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_invalidColumn_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.setEntry(0, -1, 1.0);
    }

    @Test
    public void testAddToEntry() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);

        // Add to unset entry
        matrix.addToEntry(1, 1, 4.0);
        Assert.assertEquals(4.0, matrix.getEntry(1, 1), EPSILON);

        // Add to existing entry
        matrix.addToEntry(1, 1, 2.5);
        Assert.assertEquals(6.5, matrix.getEntry(1, 1), EPSILON);

        // Add to make it zero (removes from map)
        matrix.addToEntry(1, 1, -6.5);
        Assert.assertEquals(0.0, matrix.getEntry(1, 1), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testAddToEntry_invalidRow_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.addToEntry(-1, 0, 1.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testAddToEntry_invalidColumn_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.addToEntry(0, 2, 1.0);
    }

    @Test
    public void testMultiplyEntry() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.setEntry(1, 1, 4.0);

        // Multiply existing non-zero
        matrix.multiplyEntry(1, 1, 2.5);
        Assert.assertEquals(10.0, matrix.getEntry(1, 1), EPSILON);

        // Multiply to make zero (removes from map)
        matrix.multiplyEntry(1, 1, 0.0);
        Assert.assertEquals(0.0, matrix.getEntry(1, 1), EPSILON);

        // Multiply zero entry
        matrix.multiplyEntry(0, 0, 5.0);
        Assert.assertEquals(0.0, matrix.getEntry(0, 0), EPSILON);
    }

    @Test(expected = OutOfRangeException.class)
    public void testMultiplyEntry_invalidRow_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.multiplyEntry(2, 0, 1.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testMultiplyEntry_invalidColumn_throwsException() {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(2, 2);
        matrix.multiplyEntry(0, -1, 1.0);
    }

    @Test
    public void testAdd_openMapRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 1.0);
        m1.setEntry(0, 1, 2.0);

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m2.setEntry(0, 1, 3.0);
        m2.setEntry(1, 1, 4.0);

        OpenMapRealMatrix sum = m1.add(m2);

        Assert.assertEquals(1.0, sum.getEntry(0, 0), EPSILON);
        Assert.assertEquals(5.0, sum.getEntry(0, 1), EPSILON);
        Assert.assertEquals(0.0, sum.getEntry(1, 0), EPSILON);
        Assert.assertEquals(4.0, sum.getEntry(1, 1), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAdd_dimensionMismatch_throwsException() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 3);
        m1.add(m2);
    }

    @Test
    public void testSubtract_openMapRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 5.0);
        m1.setEntry(0, 1, 2.0);

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m2.setEntry(0, 1, 3.0);
        m2.setEntry(1, 1, 4.0);

        OpenMapRealMatrix diff = m1.subtract(m2);

        Assert.assertEquals(5.0, diff.getEntry(0, 0), EPSILON);
        Assert.assertEquals(-1.0, diff.getEntry(0, 1), EPSILON);
        Assert.assertEquals(0.0, diff.getEntry(1, 0), EPSILON);
        Assert.assertEquals(-4.0, diff.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testSubtract_genericRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        m1.setEntry(0, 0, 5.0);
        m1.setEntry(0, 1, 2.0);

        Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(new double[][] {
            { 1.0, 3.0 },
            { 2.0, 4.0 }
        });

        RealMatrix diff = m1.subtract(m2);

        Assert.assertEquals(4.0, diff.getEntry(0, 0), EPSILON);
        Assert.assertEquals(-1.0, diff.getEntry(0, 1), EPSILON);
        Assert.assertEquals(-2.0, diff.getEntry(1, 0), EPSILON);
        Assert.assertEquals(-4.0, diff.getEntry(1, 1), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_dimensionMismatch_throwsException() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 2);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(3, 2);
        m1.subtract(m2);
    }

    @Test
    public void testMultiply_openMapRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 3);
        m1.setEntry(0, 0, 1.0);
        m1.setEntry(0, 2, 2.0);
        m1.setEntry(1, 1, 3.0);

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(3, 2);
        m2.setEntry(0, 0, 4.0);
        m2.setEntry(2, 0, 5.0);
        m2.setEntry(1, 1, 6.0);

        OpenMapRealMatrix product = m1.multiply(m2);

        Assert.assertEquals(2, product.getRowDimension());
        Assert.assertEquals(2, product.getColumnDimension());
        // (0,0) = 1*4 + 2*5 = 14
        Assert.assertEquals(14.0, product.getEntry(0, 0), EPSILON);
        // (0,1) = 0
        Assert.assertEquals(0.0, product.getEntry(0, 1), EPSILON);
        // (1,0) = 0
        Assert.assertEquals(0.0, product.getEntry(1, 0), EPSILON);
        // (1,1) = 3*6 = 18
        Assert.assertEquals(18.0, product.getEntry(1, 1), EPSILON);
    }

    @Test
    public void testMultiply_openMapRealMatrix_accumulateToZero() {
        // Test branch where outValue == 0.0 in OpenMapRealMatrix multiply
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(1, 2);
        m1.setEntry(0, 0, 2.0);
        m1.setEntry(0, 1, -1.0);

        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 1);
        m2.setEntry(0, 0, 3.0);
        m2.setEntry(1, 0, 6.0);

        // m1 * m2 = 2*3 + (-1)*6 = 6 - 6 = 0
        OpenMapRealMatrix product = m1.multiply(m2);
        Assert.assertEquals(0.0, product.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testMultiply_genericRealMatrix() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 3);
        m1.setEntry(0, 0, 1.0);
        m1.setEntry(0, 2, 2.0);
        m1.setEntry(1, 1, 3.0);

        Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(new double[][] {
            { 4.0, 0.0 },
            { 0.0, 6.0 },
            { 5.0, 0.0 }
        });

        RealMatrix product = m1.multiply(m2);

        Assert.assertTrue(product instanceof BlockRealMatrix);
        Assert.assertEquals(2, product.getRowDimension());
        Assert.assertEquals(2, product.getColumnDimension());
        Assert.assertEquals(14.0, product.getEntry(0, 0), EPSILON);
        Assert.assertEquals(0.0, product.getEntry(0, 1), EPSILON);
        Assert.assertEquals(0.0, product.getEntry(1, 0), EPSILON);
        Assert.assertEquals(18.0, product.getEntry(1, 1), EPSILON);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testMultiply_openMapRealMatrix_dimensionMismatch_throwsException() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 3);
        OpenMapRealMatrix m2 = new OpenMapRealMatrix(2, 2);
        m1.multiply(m2);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testMultiply_genericRealMatrix_dimensionMismatch_throwsException() {
        OpenMapRealMatrix m1 = new OpenMapRealMatrix(2, 3);
        Array2DRowRealMatrix m2 = new Array2DRowRealMatrix(new double[][] {
            { 1.0, 2.0 }
        });
        m1.multiply(m2);
    }

    @Test
    public void testSerialization() throws Exception {
        OpenMapRealMatrix matrix = new OpenMapRealMatrix(3, 3);
        matrix.setEntry(0, 1, 2.5);
        matrix.setEntry(2, 0, -4.75);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(matrix);
        oos.flush();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        OpenMapRealMatrix deserialized = (OpenMapRealMatrix) ois.readObject();

        Assert.assertEquals(matrix.getRowDimension(), deserialized.getRowDimension());
        Assert.assertEquals(matrix.getColumnDimension(), deserialized.getColumnDimension());
        Assert.assertEquals(2.5, deserialized.getEntry(0, 1), EPSILON);
        Assert.assertEquals(-4.75, deserialized.getEntry(2, 0), EPSILON);
        Assert.assertEquals(0.0, deserialized.getEntry(0, 0), EPSILON);
    }
}
