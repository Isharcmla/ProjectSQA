import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.exception.DimensionMismatchException;

import java.util.Iterator;

public class OpenMapRealVectorTest {

    private OpenMapRealVector vec1;
    private OpenMapRealVector vec2;

    @Before
    public void setUp() {
        vec1 = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0, 0.0, 5.0});
        vec2 = new OpenMapRealVector(new double[]{0.0, 2.0, 3.0, 0.0, 0.0});
    }

    // ----------- Constructors -----------

    @Test
    public void testDefaultConstructor_zeroDimension_dimensionIsZero() {
        OpenMapRealVector v = new OpenMapRealVector();
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testDimensionConstructor_normal_allZeros() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        assertEquals(5, v.getDimension());
        for (int i = 0; i < 5; i++) {
            assertEquals(0.0, v.getEntry(i), 0.0);
        }
    }

    @Test
    public void testDimensionEpsilonConstructor_normal_correctDimension() {
        OpenMapRealVector v = new OpenMapRealVector(3, 0.5);
        assertEquals(3, v.getDimension());
    }

    @Test
    public void testDimensionExpectedSizeConstructor_normal_correctDimension() {
        OpenMapRealVector v = new OpenMapRealVector(10, 2);
        assertEquals(10, v.getDimension());
    }

    @Test
    public void testDimensionExpectedSizeEpsilonConstructor_normal_correctDimension() {
        OpenMapRealVector v = new OpenMapRealVector(10, 2, 1.0e-6);
        assertEquals(10, v.getDimension());
    }

    @Test
    public void testDoubleArrayConstructor_normal_nonZeroEntriesStored() {
        double[] values = {1.0, 0.0, 2.0};
        OpenMapRealVector v = new OpenMapRealVector(values);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 0.0);
        assertEquals(0.0, v.getEntry(1), 0.0);
        assertEquals(2.0, v.getEntry(2), 0.0);
    }

    @Test
    public void testDoubleArrayEpsilonConstructor_normal_correctValues() {
        double[] values = {1.0, 0.0001, 2.0};
        OpenMapRealVector v = new OpenMapRealVector(values, 0.01);
        assertEquals(0.0, v.getEntry(1), 0.0);
    }

    @Test
    public void testDoubleObjectArrayConstructor_normal_nonZeroEntriesStored() {
        Double[] values = {1.0, 0.0, 2.0};
        OpenMapRealVector v = new OpenMapRealVector(values);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 0.0);
        assertEquals(2.0, v.getEntry(2), 0.0);
    }

    @Test
    public void testDoubleObjectArrayEpsilonConstructor_normal_correctValues() {
        Double[] values = {1.0, 0.0001, 2.0};
        OpenMapRealVector v = new OpenMapRealVector(values, 0.01);
        assertEquals(0.0, v.getEntry(1), 0.0);
    }

    @Test
    public void testCopyConstructor_normal_equalsOriginal() {
        OpenMapRealVector copy = new OpenMapRealVector(vec1);
        assertEquals(vec1, copy);
    }

    @Test
    public void testGenericRealVectorConstructor_normal_correctValues() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v = new OpenMapRealVector(arv);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), 0.0);
        assertEquals(3.0, v.getEntry(2), 0.0);
    }

    // ----------- add -----------

    @Test
    public void testAddOpenMapRealVector_normal_correctSum() {
        OpenMapRealVector result = vec1.add(vec2);
        assertEquals(1.0, result.getEntry(0), 0.0);
        assertEquals(2.0, result.getEntry(1), 0.0);
        assertEquals(6.0, result.getEntry(2), 0.0);
        assertEquals(0.0, result.getEntry(3), 0.0);
        assertEquals(5.0, result.getEntry(4), 0.0);
    }

    @Test
    public void testAddRealVector_withOpenMapRealVector_correctSum() {
        RealVector result = vec1.add((RealVector) vec2);
        assertEquals(1.0, result.getEntry(0), 0.0);
        assertEquals(2.0, result.getEntry(1), 0.0);
    }

    @Test
    public void testAddRealVector_withArrayRealVector_correctSum() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{1.0, 1.0, 1.0, 1.0, 1.0});
        RealVector result = vec1.add(arv);
        assertEquals(2.0, result.getEntry(0), 0.0);
        assertEquals(1.0, result.getEntry(1), 0.0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAddOpenMapRealVector_dimensionMismatch_throwsException() {
        OpenMapRealVector other = new OpenMapRealVector(2);
        vec1.add(other);
    }

    @Test
    public void testAddOpenMapRealVector_copyThisBranch_correctSum() {
        // vec1 has more entries than other small vector so copyThis branch triggered
        OpenMapRealVector small = new OpenMapRealVector(5);
        small.setEntry(1, 10.0);
        OpenMapRealVector result = vec1.add(small);
        assertEquals(10.0, result.getEntry(1), 0.0);
    }

    // ----------- append -----------

    @Test
    public void testAppendOpenMapRealVector_normal_correctDimensionAndValues() {
        OpenMapRealVector result = vec1.append(vec2);
        assertEquals(10, result.getDimension());
        assertEquals(1.0, result.getEntry(0), 0.0);
        assertEquals(2.0, result.getEntry(6), 0.0);
    }

    @Test
    public void testAppendRealVector_withOpenMapRealVector_correctDimension() {
        OpenMapRealVector result = vec1.append((RealVector) vec2);
        assertEquals(10, result.getDimension());
    }

    @Test
    public void testAppendRealVector_withArrayRealVector_correctDimension() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{1.0, 2.0});
        OpenMapRealVector result = vec1.append((RealVector) arv);
        assertEquals(7, result.getDimension());
        assertEquals(1.0, result.getEntry(5), 0.0);
        assertEquals(2.0, result.getEntry(6), 0.0);
    }

    @Test
    public void testAppendDouble_normal_correctDimensionAndValue() {
        OpenMapRealVector result = vec1.append(9.0);
        assertEquals(6, result.getDimension());
        assertEquals(9.0, result.getEntry(5), 0.0);
    }

    // ----------- copy -----------

    @Test
    public void testCopy_normal_equalsOriginalButDifferentInstance() {
        OpenMapRealVector copy = vec1.copy();
        assertEquals(vec1, copy);
        assertNotSame(vec1, copy);
    }

    // ----------- dotProduct -----------

    @Test
    public void testDotProductOpenMapRealVector_normal_correctValue() {
        double result = vec1.dotProduct(vec2);
        assertEquals(9.0, result, 1.0e-9); // 3*3=9, others zero overlap
    }

    @Test
    public void testDotProductRealVector_withOpenMapRealVector_correctValue() {
        double result = vec1.dotProduct((RealVector) vec2);
        assertEquals(9.0, result, 1.0e-9);
    }

    @Test
    public void testDotProductRealVector_withArrayRealVector_correctValue() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{1.0, 1.0, 1.0, 1.0, 1.0});
        double result = vec1.dotProduct(arv);
        assertEquals(9.0, result, 1.0e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDotProductOpenMapRealVector_dimensionMismatch_throwsException() {
        OpenMapRealVector other = new OpenMapRealVector(2);
        vec1.dotProduct(other);
    }

    // ----------- ebeDivide -----------

    @Test
    public void testEbeDivide_normal_correctValues() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{2.0, 0.0, 6.0});
        ArrayRealVector b = new ArrayRealVector(new double[]{2.0, 1.0, 3.0});
        OpenMapRealVector result = a.ebeDivide(b);
        assertEquals(1.0, result.getEntry(0), 0.0);
        assertEquals(0.0, result.getEntry(1), 0.0);
        assertEquals(2.0, result.getEntry(2), 0.0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_dimensionMismatch_throwsException() {
        ArrayRealVector b = new ArrayRealVector(new double[]{2.0, 1.0});
        vec1.ebeDivide(b);
    }

    // ----------- ebeMultiply -----------

    @Test
    public void testEbeMultiply_normal_correctValues() {
        ArrayRealVector b = new ArrayRealVector(new double[]{2.0, 1.0, 3.0, 1.0, 2.0});
        OpenMapRealVector result = vec1.ebeMultiply(b);
        assertEquals(2.0, result.getEntry(0), 0.0);
        assertEquals(0.0, result.getEntry(1), 0.0);
        assertEquals(9.0, result.getEntry(2), 0.0);
        assertEquals(10.0, result.getEntry(4), 0.0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_dimensionMismatch_throwsException() {
        ArrayRealVector b = new ArrayRealVector(new double[]{2.0, 1.0});
        vec1.ebeMultiply(b);
    }

    // ----------- getSubVector -----------

    @Test
    public void testGetSubVector_normal_correctSubVector() {
        OpenMapRealVector sub = vec1.getSubVector(1, 3);
        assertEquals(3, sub.getDimension());
        assertEquals(0.0, sub.getEntry(0), 0.0);
        assertEquals(3.0, sub.getEntry(1), 0.0);
        assertEquals(0.0, sub.getEntry(2), 0.0);
    }

    @Test(expected = NotPositiveException.class)
    public void testGetSubVector_negativeN_throwsException() {
        vec1.getSubVector(1, -1);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_indexOutOfRange_throwsException() {
        vec1.getSubVector(1, 10);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_negativeIndex_throwsException() {
        vec1.getSubVector(-1, 2);
    }

    // ----------- getDimension -----------

    @Test
    public void testGetDimension_normal_correctValue() {
        assertEquals(5, vec1.getDimension());
    }

    // ----------- getDistance -----------

    @Test
    public void testGetDistanceOpenMapRealVector_normal_correctValue() {
        double d = vec1.getDistance(vec2);
        // differences: (1-0)^2 + (0-2)^2 + (3-3)^2 + (0-0)^2 + (5-0)^2 = 1+4+0+0+25=30
        assertEquals(Math.sqrt(30), d, 1.0e-9);
    }

    @Test
    public void testGetDistanceRealVector_withArrayRealVector_correctValue() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{0.0, 2.0, 3.0, 0.0, 0.0});
        double d = vec1.getDistance(arv);
        assertEquals(Math.sqrt(30), d, 1.0e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetDistanceRealVector_dimensionMismatch_throwsException() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{1.0});
        vec1.getDistance(arv);
    }

    // ----------- getEntry -----------

    @Test
    public void testGetEntry_normal_correctValue() {
        assertEquals(3.0, vec1.getEntry(2), 0.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_indexOutOfRange_throwsException() {
        vec1.getEntry(100);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_negativeIndex_throwsException() {
        vec1.getEntry(-1);
    }

    // ----------- getL1Distance -----------

    @Test
    public void testGetL1DistanceOpenMapRealVector_normal_correctValue() {
        double d = vec1.getL1Distance(vec2);
        // |1-0|+|0-2|+|3-3|+|0-0|+|5-0| = 1+2+0+0+5=8
        assertEquals(8.0, d, 1.0e-9);
    }

    @Test
    public void testGetL1DistanceRealVector_withArrayRealVector_correctValue() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{0.0, 2.0, 3.0, 0.0, 0.0});
        double d = vec1.getL1Distance(arv);
        assertEquals(8.0, d, 1.0e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetL1Distance_dimensionMismatch_throwsException() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{1.0});
        vec1.getL1Distance(arv);
    }

    // ----------- getLInfDistance -----------

    @Test
    public void testGetLInfDistanceRealVector_withOpenMapRealVector_correctValue() {
        double d = vec1.getLInfDistance(vec2);
        // max delta among overlaps and non-overlaps = 5 (from index4: |5-0|=5)
        assertEquals(5.0, d, 1.0e-9);
    }

    @Test
    public void testGetLInfDistanceRealVector_withArrayRealVector_correctValue() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{0.0, 2.0, 3.0, 0.0, 0.0});
        double d = vec1.getLInfDistance(arv);
        assertEquals(5.0, d, 1.0e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetLInfDistance_dimensionMismatch_throwsException() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{1.0});
        vec1.getLInfDistance(arv);
    }

    // ----------- isInfinite -----------

    @Test
    public void testIsInfinite_normalFiniteValues_returnsFalse() {
        assertFalse(vec1.isInfinite());
    }

    @Test
    public void testIsInfinite_withInfiniteValue_returnsTrue() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, Double.POSITIVE_INFINITY);
        assertTrue(v.isInfinite());
    }

    @Test
    public void testIsInfinite_withNaNValue_returnsFalse() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, Double.NaN);
        assertFalse(v.isInfinite());
    }

    // ----------- isNaN -----------

    @Test
    public void testIsNaN_normalValues_returnsFalse() {
        assertFalse(vec1.isNaN());
    }

    @Test
    public void testIsNaN_withNaNValue_returnsTrue() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, Double.NaN);
        assertTrue(v.isNaN());
    }

    // ----------- mapAdd / mapAddToSelf -----------

    @Test
    public void testMapAdd_normal_returnsNewVectorWithAddedValue() {
        OpenMapRealVector result = vec1.mapAdd(2.0);
        assertEquals(3.0, result.getEntry(0), 0.0);
        assertEquals(2.0, result.getEntry(1), 0.0);
        // original unchanged
        assertEquals(1.0, vec1.getEntry(0), 0.0);
    }

    @Test
    public void testMapAddToSelf_normal_modifiesInPlace() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 0.0, 3.0});
        v.mapAddToSelf(2.0);
        assertEquals(3.0, v.getEntry(0), 0.0);
        assertEquals(2.0, v.getEntry(1), 0.0);
        assertEquals(5.0, v.getEntry(2), 0.0);
    }

    // ----------- projection -----------

    @Test
    public void testProjection_normal_correctResult() {
        OpenMapRealVector a = new OpenMapRealVector(new double[]{1.0, 0.0});
        OpenMapRealVector b = new OpenMapRealVector(new double[]{1.0, 1.0});
        RealVector result = a.projection(b);
        assertEquals(0.5, result.getEntry(0), 1.0e-9);
        assertEquals(0.5, result.getEntry(1), 1.0e-9);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testProjection_dimensionMismatch_throwsException() {
        OpenMapRealVector other = new OpenMapRealVector(2);
        vec1.projection(other);
    }

    // ----------- setEntry -----------

    @Test
    public void testSetEntry_nonZeroValue_storesEntry() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        assertEquals(5.0, v.getEntry(1), 0.0);
    }

    @Test
    public void testSetEntry_zeroValueAfterNonZero_removesEntry() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        v.setEntry(1, 0.0);
        assertEquals(0.0, v.getEntry(1), 0.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_indexOutOfRange_throwsException() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(10, 5.0);
    }

    // ----------- setSubVector -----------

    @Test
    public void testSetSubVector_normal_correctValuesSet() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        ArrayRealVector arv = new ArrayRealVector(new double[]{7.0, 8.0});
        v.setSubVector(1, arv);
        assertEquals(7.0, v.getEntry(1), 0.0);
        assertEquals(8.0, v.getEntry(2), 0.0);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_indexOutOfRange_throwsException() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        ArrayRealVector arv = new ArrayRealVector(new double[]{1.0, 2.0});
        v.setSubVector(2, arv);
    }

    // ----------- set -----------

    @Test
    public void testSet_normal_allEntriesSetToValue() {
        OpenMapRealVector v = new OpenMapRealVector(4);
        v.set(9.0);
        for (int i = 0; i < 4; i++) {
            assertEquals(9.0, v.getEntry(i), 0.0);
        }
    }

    // ----------- subtract -----------

    @Test
    public void testSubtractOpenMapRealVector_normal_correctValues() {
        OpenMapRealVector result = vec1.subtract(vec2);
        assertEquals(1.0, result.getEntry(0), 0.0);
        assertEquals(-2.0, result.getEntry(1), 0.0);
        assertEquals(0.0, result.getEntry(2), 0.0);
        assertEquals(5.0, result.getEntry(4), 0.0);
    }

    @Test
    public void testSubtractRealVector_withOpenMapRealVector_correctValues() {
        RealVector result = vec1.subtract((RealVector) vec2);
        assertEquals(1.0, result.getEntry(0), 0.0);
    }

    @Test
    public void testSubtractRealVector_withArrayRealVector_correctValues() {
        ArrayRealVector arv = new ArrayRealVector(new double[]{1.0, 1.0, 1.0, 1.0, 1.0});
        RealVector result = vec1.subtract(arv);
        assertEquals(0.0, result.getEntry(0), 0.0);
        assertEquals(-1.0, result.getEntry(1), 0.0);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSubtractOpenMapRealVector_dimensionMismatch_throwsException() {
        OpenMapRealVector other = new OpenMapRealVector(2);
        vec1.subtract(other);
    }

    // ----------- unitVector / unitize -----------

    @Test
    public void testUnitVector_normal_resultHasNormOne() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector unit = v.unitVector();
        assertEquals(1.0, unit.getNorm(), 1.0e-9);
        // original should remain unchanged
        assertEquals(3.0, v.getEntry(0), 0.0);
    }

    @Test
    public void testUnitize_normal_vectorBecomesUnit() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        v.unitize();
        assertEquals(1.0, v.getNorm(), 1.0e-9);
    }

    @Test(expected = MathArithmeticException.class)
    public void testUnitize_zeroVector_throwsException() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.unitize();
    }

    // ----------- toArray -----------

    @Test
    public void testToArray_normal_correctArray() {
        double[] arr = vec1.toArray();
        assertArrayEquals(new double[]{1.0, 0.0, 3.0, 0.0, 5.0}, arr, 0.0);
    }

    // ----------- hashCode -----------

    @Test
    public void testHashCode_equalVectors_sameHashCode() {
        OpenMapRealVector copy = vec1.copy();
        assertEquals(vec1.hashCode(), copy.hashCode());
    }

    @Test
    public void testHashCode_differentVectors_notNecessarilyEqualButNoException() {
        int h1 = vec1.hashCode();
        int h2 = vec2.hashCode();
        // just ensure no exception thrown, values can differ
        assertNotNull(h1);
        assertNotNull(h2);
    }

    // ----------- equals -----------

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(vec1.equals(vec1));
    }

    @Test
    public void testEquals_notOpenMapRealVectorInstance_returnsFalse() {
        assertFalse(vec1.equals("not a vector"));
    }

    @Test
    public void testEquals_differentDimension_returnsFalse() {
        OpenMapRealVector other = new OpenMapRealVector(2);
        assertFalse(vec1.equals(other));
    }

    @Test
    public void testEquals_differentEpsilon_returnsFalse() {
        OpenMapRealVector a = new OpenMapRealVector(3, 0.1);
        OpenMapRealVector b = new OpenMapRealVector(3, 0.2);
        assertFalse(a.equals(b));
    }

    @Test
    public void testEquals_equalVectors_returnsTrue() {
        OpenMapRealVector copy = vec1.copy();
        assertTrue(vec1.equals(copy));
    }

    @Test
    public void testEquals_differentValues_returnsFalse() {
        OpenMapRealVector other = vec1.copy();
        other.setEntry(0, 999.0);
        assertFalse(vec1.equals(other));
    }

    @Test
    public void testEquals_differentValuesInOther_returnsFalse() {
        OpenMapRealVector other = vec1.copy();
        other.setEntry(1, 999.0);
        assertFalse(vec1.equals(other));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(vec1.equals(null));
    }

    // ----------- getSparsity -----------

    @Test
    public void testGetSparsity_normal_correctRatio() {
        // vec1 has 3 non-zero entries out of 5
        assertEquals(3.0 / 5.0, vec1.getSparsity(), 1.0e-9);
    }

    // ----------- sparseIterator -----------

    @Test
    public void testSparseIterator_normal_iteratesOverNonZeroEntries() {
        Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = vec1.sparseIterator();
        int count = 0;
        while (it.hasNext()) {
            org.apache.commons.math3.linear.RealVector.Entry entry = it.next();
            assertNotNull(entry);
            double val = entry.getValue();
            int idx = entry.getIndex();
            assertTrue(idx >= 0 && idx < vec1.getDimension());
            assertTrue(val != 0.0);
            count++;
        }
        assertEquals(3, count);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIterator_remove_throwsUnsupportedOperationException() {
        Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = vec1.sparseIterator();
        it.remove();
    }

    @Test
    public void testSparseIterator_entrySetValue_updatesUnderlyingMap() {
        Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = vec1.sparseIterator();
        if (it.hasNext()) {
            org.apache.commons.math3.linear.RealVector.Entry entry = it.next();
            int idx = entry.getIndex();
            entry.setValue(42.0);
            assertEquals(42.0, vec1.getEntry(idx), 0.0);
        }
    }

    // ----------- Additional edge cases -----------

    @Test
    public void testGetEntry_zeroVectorEntry_returnsZero() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        assertEquals(0.0, v.getEntry(3), 0.0);
    }

    @Test
    public void testAppend_emptyVectorPlusAppend_correctResult() {
        OpenMapRealVector v = new OpenMapRealVector();
        OpenMapRealVector result = v.append(5.0);
        assertEquals(1, result.getDimension());
        assertEquals(5.0, result.getEntry(0), 0.0);
    }

    @Test
    public void testGetDistance_sameVector_returnsZero() {
        double d = vec1.getDistance(vec1);
        assertEquals(0.0, d, 1.0e-9);
    }
}
