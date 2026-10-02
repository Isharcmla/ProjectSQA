package org.apache.commons.math3.optim.nonlinear.vector;

import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.NonSquareMatrixException;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class WeightTest {

    @Before
    public void setUp() {
    }

    // ---------- Constructor with double[] ----------

    @Test
    public void testConstructorArray_normalInput_createsDiagonalMatrix() {
        double[] weights = {1.0, 2.0, 3.0};
        Weight w = new Weight(weights);
        RealMatrix matrix = w.getWeight();

        assertEquals(3, matrix.getRowDimension());
        assertEquals(3, matrix.getColumnDimension());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    assertEquals(weights[i], matrix.getEntry(i, j), 1e-12);
                } else {
                    assertEquals(0.0, matrix.getEntry(i, j), 1e-12);
                }
            }
        }
    }

    @Test
    public void testConstructorArray_emptyArray_createsZeroDimensionMatrix() {
        double[] weights = {};
        Weight w = new Weight(weights);
        RealMatrix matrix = w.getWeight();

        assertEquals(0, matrix.getRowDimension());
        assertEquals(0, matrix.getColumnDimension());
    }

    @Test
    public void testConstructorArray_singleElement_createsOneByOneMatrix() {
        double[] weights = {5.0};
        Weight w = new Weight(weights);
        RealMatrix matrix = w.getWeight();

        assertEquals(1, matrix.getRowDimension());
        assertEquals(1, matrix.getColumnDimension());
        assertEquals(5.0, matrix.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testConstructorArray_negativeValues_createsDiagonalMatrixWithNegatives() {
        double[] weights = {-1.0, -2.5, 0.0};
        Weight w = new Weight(weights);
        RealMatrix matrix = w.getWeight();

        assertEquals(-1.0, matrix.getEntry(0, 0), 1e-12);
        assertEquals(-2.5, matrix.getEntry(1, 1), 1e-12);
        assertEquals(0.0, matrix.getEntry(2, 2), 1e-12);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorArray_nullInput_throwsNullPointerException() {
        double[] weights = null;
        new Weight(weights);
    }

    // ---------- Constructor with RealMatrix ----------

    @Test
    public void testConstructorMatrix_squareMatrix_copiesMatrixCorrectly() {
        double[][] data = {
            {1.0, 2.0},
            {3.0, 4.0}
        };
        RealMatrix input = new Array2DRowRealMatrix(data);
        Weight w = new Weight(input);
        RealMatrix result = w.getWeight();

        assertEquals(2, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                assertEquals(data[i][j], result.getEntry(i, j), 1e-12);
            }
        }
    }

    @Test
    public void testConstructorMatrix_diagonalMatrix_copiesCorrectly() {
        double[] diag = {1.0, 2.0, 3.0};
        DiagonalMatrix input = new DiagonalMatrix(diag);
        Weight w = new Weight(input);
        RealMatrix result = w.getWeight();

        assertEquals(3, result.getRowDimension());
        assertEquals(3, result.getColumnDimension());
        for (int i = 0; i < 3; i++) {
            assertEquals(diag[i], result.getEntry(i, i), 1e-12);
        }
    }

    @Test
    public void testConstructorMatrix_oneByOneMatrix_copiesCorrectly() {
        double[][] data = {{7.0}};
        RealMatrix input = new Array2DRowRealMatrix(data);
        Weight w = new Weight(input);
        RealMatrix result = w.getWeight();

        assertEquals(1, result.getRowDimension());
        assertEquals(1, result.getColumnDimension());
        assertEquals(7.0, result.getEntry(0, 0), 1e-12);
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructorMatrix_nonSquareMatrix_throwsNonSquareMatrixException() {
        double[][] data = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0}
        };
        RealMatrix input = new Array2DRowRealMatrix(data);
        new Weight(input);
    }

    @Test(expected = NonSquareMatrixException.class)
    public void testConstructorMatrix_moreRowsThanColumns_throwsNonSquareMatrixException() {
        double[][] data = {
            {1.0},
            {2.0},
            {3.0}
        };
        RealMatrix input = new Array2DRowRealMatrix(data);
        new Weight(input);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorMatrix_nullInput_throwsNullPointerException() {
        RealMatrix input = null;
        new Weight(input);
    }

    // ---------- getWeight() ----------

    @Test
    public void testGetWeight_returnsIndependentCopy_notSameReference() {
        double[] weights = {1.0, 2.0};
        Weight w = new Weight(weights);
        RealMatrix first = w.getWeight();
        RealMatrix second = w.getWeight();

        assertNotSame(first, second);
        assertEquals(first.getEntry(0, 0), second.getEntry(0, 0), 1e-12);
    }

    @Test
    public void testGetWeight_modifyingReturnedMatrix_doesNotAffectInternalState() {
        double[] weights = {1.0, 2.0};
        Weight w = new Weight(weights);
        RealMatrix matrix = w.getWeight();
        matrix.setEntry(0, 0, 999.0);

        RealMatrix freshCopy = w.getWeight();
        assertEquals(1.0, freshCopy.getEntry(0, 0), 1e-12);
    }
}
