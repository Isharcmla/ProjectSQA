import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.OutOfRangeException;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class OpenMapRealVectorTest {

    private static final double DELTA = 1e-9;

    private OpenMapRealVector v1;
    private OpenMapRealVector v2;

    @Before
    public void setUp() {
        v1 = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        v2 = new OpenMapRealVector(new double[]{4.0, 5.0, 6.0});
    }

    // ---------------- Constructors ----------------

    @Test
    public void testDefaultConstructor_zeroDimension() {
        OpenMapRealVector v = new OpenMapRealVector();
        assertEquals(0, v.getDimension());
    }

    @Test
    public void testDimensionConstructor_normal() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        assertEquals(5, v.getDimension());
        for (int i = 0; i < 5; i++) {
            assertEquals(0.0, v.getEntry(i), DELTA);
        }
    }

    @Test
    public void testDimensionEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(3, 0.5);
        assertEquals(3, v.getDimension());
    }

    @Test
    public void testDimensionExpectedSizeConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(4, 2);
        assertEquals(4, v.getDimension());
    }

    @Test
    public void testDimensionExpectedSizeEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(4, 2, 0.1);
        assertEquals(4, v.getDimension());
    }

    @Test
    public void testDoubleArrayConstructor_normal() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 1.0, 0.0, 2.0});
        assertEquals(4, v.getDimension());
        assertEquals(0.0, v.getEntry(0), DELTA);
        assertEquals(1.0, v.getEntry(1), DELTA);
        assertEquals(2.0, v.getEntry(3), DELTA);
    }

    @Test
    public void testDoubleArrayEpsilonConstructor() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0001, 2.0}, 0.001);
        // 0.0001 is within epsilon so should be treated as zero (not stored)
        assertEquals(0.0, v.getEntry(0), DELTA);
        assertEquals(2.0, v.getEntry(1), DELTA);
    }

    @Test
    public void testDoubleObjectArrayConstructor() {
        Double[] values = {0.0, 1.5, 0.0};
        OpenMapRealVector v = new OpenMapRealVector(values);
        assertEquals(3, v.getDimension());
        assertEquals(1.5, v.getEntry(1), DELTA);
    }

    @Test
    public void testDoubleObjectArrayEpsilonConstructor() {
        Double[] values = {0.0, 1.5, 0.0};
        OpenMapRealVector v = new OpenMapRealVector(values, 2.0);
        // 1.5 is within epsilon(2.0) so treated as zero
        assertEquals(0.0, v.getEntry(1), DELTA);
    }

    @Test
    public void testCopyConstructor() {
        OpenMapRealVector copy = new OpenMapRealVector(v1);
        assertEquals(v1.getDimension(), copy.getDimension());
        for (int i = 0; i < v1.getDimension(); i++) {
            assertEquals(v1.getEntry(i), copy.getEntry(i), DELTA);
        }
    }

    @Test
    public void testGenericConstructor_fromArrayRealVector() {
        RealVector arv = new ArrayRealVector(new double[]{1.0, 0.0, 3.0});
        OpenMapRealVector v = new OpenMapRealVector(arv);
        assertEquals(3, v.getDimension());
        assertEquals(1.0, v.getEntry(0), DELTA);
        assertEquals(0.0, v.getEntry(1), DELTA);
        assertEquals(3.0, v.getEntry(2), DELTA);
    }

    // ---------------- getDimension / getEntry / setEntry ----------------

    @Test
    public void testGetDimension_returnsCorrectSize() {
        assertEquals(3, v1.getDimension());
    }

    @Test
    public void testGetEntry_normal() {
        assertEquals(2.0, v1.getEntry(1), DELTA);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_outOfRange_throwsException() {
        v1.getEntry(10);
    }

    @Test
    public void testSetEntry_normal() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        assertEquals(5.0, v.getEntry(1), DELTA);
    }

    @Test
    public void testSetEntry_zeroValue_removesEntry() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(1, 5.0);
        v.setEntry(1, 0.0);
        assertEquals(0.0, v.getEntry(1), DELTA);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_outOfRange_throwsException() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(-1, 1.0);
    }

    // ---------------- getData / toArray ----------------

    @Test
    public void testGetData_returnsCorrectArray() {
        double[] data = v1.getData();
        assertArrayEquals(new double[]{1.0, 2.0, 3.0}, data, DELTA);
    }

    @Test
    public void testToArray_sameAsGetData() {
        assertArrayEquals(v1.getData(), v1.toArray(), DELTA);
    }

    // ---------------- add ----------------

    @Test
    public void testAdd_withOpenMapRealVector() {
        OpenMapRealVector result = v1.add(v2);
        assertEquals(5.0, result.getEntry(0), DELTA);
        assertEquals(7.0, result.getEntry(1), DELTA);
        assertEquals(9.0, result.getEntry(2), DELTA);
    }

    @Test
    public void testAdd_withGenericRealVector() {
        RealVector arv = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector result = v1.add(arv);
        assertEquals(5.0, result.getEntry(0), DELTA);
        assertEquals(7.0, result.getEntry(1), DELTA);
        assertEquals(9.0, result.getEntry(2), DELTA);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testAdd_dimensionMismatch_throwsException() {
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0, 2.0});
        v1.add(v3);
    }

    // ---------------- append ----------------

    @Test
    public void testAppend_openMapRealVector() {
        OpenMapRealVector appended = v1.append(v2);
        assertEquals(6, appended.getDimension());
        assertEquals(1.0, appended.getEntry(0), DELTA);
        assertEquals(4.0, appended.getEntry(3), DELTA);
    }

    @Test
    public void testAppend_genericRealVector() {
        RealVector arv = new ArrayRealVector(new double[]{7.0, 8.0});
        OpenMapRealVector appended = v1.append(arv);
        assertEquals(5, appended.getDimension());
        assertEquals(7.0, appended.getEntry(3), DELTA);
        assertEquals(8.0, appended.getEntry(4), DELTA);
    }

    @Test
    public void testAppend_double() {
        OpenMapRealVector appended = v1.append(9.0);
        assertEquals(4, appended.getDimension());
        assertEquals(9.0, appended.getEntry(3), DELTA);
    }

    @Test
    public void testAppend_doubleArray() {
        OpenMapRealVector appended = v1.append(new double[]{10.0, 11.0});
        assertEquals(5, appended.getDimension());
        assertEquals(10.0, appended.getEntry(3), DELTA);
        assertEquals(11.0, appended.getEntry(4), DELTA);
    }

    @Test
    public void testAppend_toZeroLengthVector() {
        OpenMapRealVector empty = new OpenMapRealVector();
        OpenMapRealVector appended = empty.append(3.0);
        assertEquals(1, appended.getDimension());
        assertEquals(3.0, appended.getEntry(0), DELTA);
    }

    // ---------------- copy ----------------

    @Test
    public void testCopy_returnsEqualButIndependentVector() {
        OpenMapRealVector copy = v1.copy();
        assertEquals(v1, copy);
        copy.setEntry(0, 100.0);
        assertEquals(1.0, v1.getEntry(0), DELTA);
    }

    // ---------------- dotProduct ----------------

    @Test
    public void testDotProduct_openMap() {
        assertEquals(32.0, v1.dotProduct(v2), DELTA);
    }

    @Test
    public void testDotProduct_genericRealVector() {
        RealVector arv = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        assertEquals(32.0, v1.dotProduct(arv), DELTA);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testDotProduct_dimensionMismatch_throwsException() {
        OpenMapRealVector v3 = new OpenMapRealVector(new double[]{1.0});
        v1.dotProduct(v3);
    }

    // ---------------- ebeDivide ----------------

    @Test
    public void testEbeDivide_realVector() {
        RealVector result = v1.ebeDivide((RealVector) v2);
        assertEquals(0.25, result.getEntry(0), DELTA);
        assertEquals(0.4, result.getEntry(1), DELTA);
        assertEquals(0.5, result.getEntry(2), DELTA);
    }

    @Test
    public void testEbeDivide_doubleArray() {
        OpenMapRealVector result = v1.ebeDivide(new double[]{4.0, 5.0, 6.0});
        assertEquals(0.25, result.getEntry(0), DELTA);
        assertEquals(0.4, result.getEntry(1), DELTA);
        assertEquals(0.5, result.getEntry(2), DELTA);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_dimensionMismatch_throwsException() {
        v1.ebeDivide(new double[]{1.0, 2.0});
    }

    // ---------------- ebeMultiply ----------------

    @Test
    public void testEbeMultiply_realVector() {
        RealVector result = v1.ebeMultiply((RealVector) v2);
        assertEquals(4.0, result.getEntry(0), DELTA);
        assertEquals(10.0, result.getEntry(1), DELTA);
        assertEquals(18.0, result.getEntry(2), DELTA);
    }

    @Test
    public void testEbeMultiply_doubleArray() {
        OpenMapRealVector result = v1.ebeMultiply(new double[]{4.0, 5.0, 6.0});
        assertEquals(4.0, result.getEntry(0), DELTA);
        assertEquals(10.0, result.getEntry(1), DELTA);
        assertEquals(18.0, result.getEntry(2), DELTA);
    }

    // ---------------- getSubVector ----------------

    @Test
    public void testGetSubVector_normal() {
        OpenMapRealVector sub = v1.getSubVector(1, 2);
        assertEquals(2, sub.getDimension());
        assertEquals(2.0, sub.getEntry(0), DELTA);
        assertEquals(3.0, sub.getEntry(1), DELTA);
    }

    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_outOfRange_throwsException() {
        v1.getSubVector(2, 5);
    }

    // ---------------- getDistance ----------------

    @Test
    public void testGetDistance_openMap() {
        double expected = Math.sqrt(27.0);
        assertEquals(expected, v1.getDistance(v2), DELTA);
    }

    @Test
    public void testGetDistance_genericRealVector() {
        RealVector arv = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        double expected = Math.sqrt(27.0);
        assertEquals(expected, v1.getDistance(arv), DELTA);
    }

    @Test
    public void testGetDistance_doubleArray() {
        double expected = Math.sqrt(27.0);
        assertEquals(expected, v1.getDistance(new double[]{4.0, 5.0, 6.0}), DELTA);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testGetDistance_dimensionMismatch_throwsException() {
        RealVector arv = new ArrayRealVector(new double[]{1.0});
        v1.getDistance(arv);
    }

    // ---------------- getL1Distance ----------------

    @Test
    public void testGetL1Distance_openMap() {
        assertEquals(9.0, v1.getL1Distance(v2), DELTA);
    }

    @Test
    public void testGetL1Distance_genericRealVector() {
        RealVector arv = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        assertEquals(9.0, v1.getL1Distance(arv), DELTA);
    }

    @Test
    public void testGetL1Distance_doubleArray() {
        assertEquals(9.0, v1.getL1Distance(new double[]{4.0, 5.0, 6.0}), DELTA);
    }

    // ---------------- getLInfDistance ----------------

    @Test
    public void testGetLInfDistance_openMap() {
        assertEquals(3.0, v1.getLInfDistance(v2), DELTA);
    }

    @Test
    public void testGetLInfDistance_genericRealVector() {
        RealVector arv = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        assertEquals(3.0, v1.getLInfDistance(arv), DELTA);
    }

    @Test
    public void testGetLInfDistance_doubleArray() {
        assertEquals(3.0, v1.getLInfDistance(new double[]{4.0, 5.0, 6.0}), DELTA);
    }

    // ---------------- isInfinite / isNaN ----------------

    @Test
    public void testIsInfinite_true() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, Double.POSITIVE_INFINITY});
        assertTrue(v.isInfinite());
    }

    @Test
    public void testIsInfinite_falseNormal() {
        assertFalse(v1.isInfinite());
    }

    @Test
    public void testIsInfinite_falseWhenNaNPresent() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, Double.NaN);
        v.setEntry(1, Double.POSITIVE_INFINITY);
        assertFalse(v.isInfinite());
    }

    @Test
    public void testIsNaN_true() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setEntry(0, Double.NaN);
        assertTrue(v.isNaN());
    }

    @Test
    public void testIsNaN_false() {
        assertFalse(v1.isNaN());
    }

    // ---------------- mapAdd / mapAddToSelf ----------------

    @Test
    public void testMapAdd_returnsNewVectorWithAddedValue() {
        OpenMapRealVector result = v1.mapAdd(10.0);
        assertEquals(11.0, result.getEntry(0), DELTA);
        assertEquals(1.0, v1.getEntry(0), DELTA);
    }

    @Test
    public void testMapAddToSelf_modifiesInPlace() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{1.0, 2.0});
        v.mapAddToSelf(5.0);
        assertEquals(6.0, v.getEntry(0), DELTA);
        assertEquals(7.0, v.getEntry(1), DELTA);
    }

    // ---------------- outerProduct ----------------

    @Test
    public void testOuterProduct_normal() {
        RealMatrix result = v1.outerProduct(new double[]{1.0, 2.0});
        assertEquals(3, result.getRowDimension());
        assertEquals(2, result.getColumnDimension());
        assertEquals(1.0, result.getEntry(0, 0), DELTA);
        assertEquals(2.0, result.getEntry(0, 1), DELTA);
        assertEquals(3.0, result.getEntry(2, 0), DELTA);
        assertEquals(6.0, result.getEntry(2, 1), DELTA);
    }

    // ---------------- projection ----------------

    @Test
    public void testProjection_realVector() {
        RealVector result = v1.projection(v2);
        double scale = 32.0 / 77.0;
        assertEquals(scale * 4.0, result.getEntry(0), DELTA);
        assertEquals(scale * 5.0, result.getEntry(1), DELTA);
        assertEquals(scale * 6.0, result.getEntry(2), DELTA);
    }

    @Test
    public void testProjection_doubleArray() {
        OpenMapRealVector result = v1.projection(new double[]{4.0, 5.0, 6.0});
        double scale = 32.0 / 77.0;
        assertEquals(scale * 4.0, result.getEntry(0), DELTA);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testProjection_dimensionMismatch_throwsException() {
        v1.projection(new double[]{1.0, 2.0});
    }

    // ---------------- setSubVector ----------------

    @Test
    public void testSetSubVector_withRealVector() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        RealVector arv = new ArrayRealVector(new double[]{9.0, 8.0});
        v.setSubVector(1, arv);
        assertEquals(9.0, v.getEntry(1), DELTA);
        assertEquals(8.0, v.getEntry(2), DELTA);
    }

    @Test
    public void testSetSubVector_withDoubleArray() {
        OpenMapRealVector v = new OpenMapRealVector(5);
        v.setSubVector(1, new double[]{9.0, 8.0});
        assertEquals(9.0, v.getEntry(1), DELTA);
        assertEquals(8.0, v.getEntry(2), DELTA);
    }

    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_outOfRange_throwsException() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.setSubVector(2, new double[]{1.0, 2.0, 3.0});
    }

    // ---------------- set ----------------

    @Test
    public void testSet_allEntriesToValue() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.set(7.0);
        for (int i = 0; i < 3; i++) {
            assertEquals(7.0, v.getEntry(i), DELTA);
        }
    }

    // ---------------- subtract ----------------

    @Test
    public void testSubtract_openMap() {
        OpenMapRealVector result = v1.subtract(v2);
        assertEquals(-3.0, result.getEntry(0), DELTA);
        assertEquals(-3.0, result.getEntry(1), DELTA);
        assertEquals(-3.0, result.getEntry(2), DELTA);
    }

    @Test
    public void testSubtract_genericRealVector() {
        RealVector arv = new ArrayRealVector(new double[]{4.0, 5.0, 6.0});
        RealVector result = v1.subtract(arv);
        assertEquals(-3.0, result.getEntry(0), DELTA);
    }

    @Test
    public void testSubtract_doubleArray() {
        OpenMapRealVector result = v1.subtract(new double[]{4.0, 5.0, 6.0});
        assertEquals(-3.0, result.getEntry(0), DELTA);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_dimensionMismatch_throwsException() {
        v1.subtract(new double[]{1.0});
    }

    // ---------------- unitVector / unitize ----------------

    @Test
    public void testUnitVector_normal() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        OpenMapRealVector unit = v.unitVector();
        assertEquals(0.6, unit.getEntry(0), DELTA);
        assertEquals(0.8, unit.getEntry(1), DELTA);
        // original unmodified
        assertEquals(3.0, v.getEntry(0), DELTA);
    }

    @Test
    public void testUnitize_normal() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{3.0, 4.0});
        v.unitize();
        assertEquals(0.6, v.getEntry(0), DELTA);
        assertEquals(0.8, v.getEntry(1), DELTA);
    }

    @Test(expected = MathArithmeticException.class)
    public void testUnitize_zeroVector_throwsException() {
        OpenMapRealVector v = new OpenMapRealVector(3);
        v.unitize();
    }

    // ---------------- hashCode / equals ----------------

    @Test
    public void testHashCode_consistentForEqualVectors() {
        OpenMapRealVector copy = v1.copy();
        assertEquals(v1.hashCode(), copy.hashCode());
    }

    @Test
    public void testEquals_sameInstance_true() {
        assertTrue(v1.equals(v1));
    }

    @Test
    public void testEquals_differentClass_false() {
        assertFalse(v1.equals("not a vector"));
    }

    @Test
    public void testEquals_differentDimension_false() {
        OpenMapRealVector other = new OpenMapRealVector(new double[]{1.0, 2.0});
        assertFalse(v1.equals(other));
    }

    @Test
    public void testEquals_differentEpsilon_false() {
        OpenMapRealVector other = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0}, 0.5);
        assertFalse(v1.equals(other));
    }

    @Test
    public void testEquals_differentValues_false() {
        OpenMapRealVector other = new OpenMapRealVector(new double[]{1.0, 2.0, 99.0});
        assertFalse(v1.equals(other));
    }

    @Test
    public void testEquals_equalVectors_true() {
        OpenMapRealVector other = new OpenMapRealVector(new double[]{1.0, 2.0, 3.0});
        assertTrue(v1.equals(other));
    }

    @Test
    public void testEquals_null_false() {
        assertFalse(v1.equals(null));
    }

    // ---------------- getSparsity ----------------

    @Test
    public void testGetSparsity_allNonZero() {
        assertEquals(1.0, v1.getSparsity(), DELTA);
    }

    @Test
    public void testGetSparsity_partiallyZero() {
        OpenMapRealVector v = new OpenMapRealVector(new double[]{0.0, 1.0, 0.0, 2.0});
        assertEquals(0.5, v.getSparsity(), DELTA);
    }

    // ---------------- sparseIterator ----------------

    @Test
    public void testSparseIterator_iteratesOverNonZeroEntries() {
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = v1.sparseIterator();
        int count = 0;
        while (it.hasNext()) {
            org.apache.commons.math.linear.RealVector.Entry entry = it.next();
            assertNotNull(entry);
            count++;
        }
        assertEquals(3, count);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSparseIterator_remove_throwsException() {
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = v1.sparseIterator();
        it.remove();
    }

    @Test
    public void testSparseIterator_entryGetAndSetValue() {
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = v1.sparseIterator();
        assertTrue(it.hasNext());
        org.apache.commons.math.linear.RealVector.Entry entry = it.next();
        double originalValue = entry.getValue();
        int index = entry.getIndex();
        entry.setValue(originalValue + 100.0);
        assertEquals(originalValue + 100.0, v1.getEntry(index), DELTA);
    }
}
