package org.apache.commons.math.geometry;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.util.FastMath;

public class Vector3DTest {

    private static final double EPS = 1e-10;

    private Vector3D v1;
    private Vector3D v2;

    @Before
    public void setUp() {
        v1 = new Vector3D(1, 2, 3);
        v2 = new Vector3D(4, 5, 6);
    }

    // Constructor tests

    @Test
    public void testConstructor_xyz_valuesSetCorrectly() {
        Vector3D v = new Vector3D(1.0, 2.0, 3.0);
        assertEquals(1.0, v.getX(), EPS);
        assertEquals(2.0, v.getY(), EPS);
        assertEquals(3.0, v.getZ(), EPS);
    }

    @Test
    public void testConstructor_alphaDelta_valuesSetCorrectly() {
        double alpha = FastMath.PI / 4;
        double delta = FastMath.PI / 6;
        Vector3D v = new Vector3D(alpha, delta);
        double cosDelta = FastMath.cos(delta);
        assertEquals(FastMath.cos(alpha) * cosDelta, v.getX(), EPS);
        assertEquals(FastMath.sin(alpha) * cosDelta, v.getY(), EPS);
        assertEquals(FastMath.sin(delta), v.getZ(), EPS);
    }

    @Test
    public void testConstructor_scaleFactor_valuesScaledCorrectly() {
        Vector3D base = new Vector3D(1, 2, 3);
        Vector3D v = new Vector3D(2.0, base);
        assertEquals(2.0, v.getX(), EPS);
        assertEquals(4.0, v.getY(), EPS);
        assertEquals(6.0, v.getZ(), EPS);
    }

    @Test
    public void testConstructor_twoVectorsLinear_valuesCorrect() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D v = new Vector3D(2.0, u1, 3.0, u2);
        assertEquals(2.0, v.getX(), EPS);
        assertEquals(3.0, v.getY(), EPS);
        assertEquals(0.0, v.getZ(), EPS);
    }

    @Test
    public void testConstructor_threeVectorsLinear_valuesCorrect() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D u3 = new Vector3D(0, 0, 1);
        Vector3D v = new Vector3D(1.0, u1, 2.0, u2, 3.0, u3);
        assertEquals(1.0, v.getX(), EPS);
        assertEquals(2.0, v.getY(), EPS);
        assertEquals(3.0, v.getZ(), EPS);
    }

    @Test
    public void testConstructor_fourVectorsLinear_valuesCorrect() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D u3 = new Vector3D(0, 0, 1);
        Vector3D u4 = new Vector3D(1, 1, 1);
        Vector3D v = new Vector3D(1.0, u1, 2.0, u2, 3.0, u3, 1.0, u4);
        assertEquals(2.0, v.getX(), EPS);
        assertEquals(3.0, v.getY(), EPS);
        assertEquals(4.0, v.getZ(), EPS);
    }

    // Getter tests

    @Test
    public void testGetX_normalVector_returnsCorrectValue() {
        assertEquals(1.0, v1.getX(), EPS);
    }

    @Test
    public void testGetY_normalVector_returnsCorrectValue() {
        assertEquals(2.0, v1.getY(), EPS);
    }

    @Test
    public void testGetZ_normalVector_returnsCorrectValue() {
        assertEquals(3.0, v1.getZ(), EPS);
    }

    // Norm tests

    @Test
    public void testGetNorm1_normalVector_returnsSumOfAbs() {
        Vector3D v = new Vector3D(-1, 2, -3);
        assertEquals(6.0, v.getNorm1(), EPS);
    }

    @Test
    public void testGetNorm1_zeroVector_returnsZero() {
        assertEquals(0.0, Vector3D.ZERO.getNorm1(), EPS);
    }

    @Test
    public void testGetNorm_normalVector_returnsEuclideanNorm() {
        Vector3D v = new Vector3D(3, 4, 0);
        assertEquals(5.0, v.getNorm(), EPS);
    }

    @Test
    public void testGetNorm_zeroVector_returnsZero() {
        assertEquals(0.0, Vector3D.ZERO.getNorm(), EPS);
    }

    @Test
    public void testGetNormSq_normalVector_returnsSquareOfNorm() {
        Vector3D v = new Vector3D(3, 4, 0);
        assertEquals(25.0, v.getNormSq(), EPS);
    }

    @Test
    public void testGetNormInf_normalVector_returnsMaxAbs() {
        Vector3D v = new Vector3D(-5, 3, 4);
        assertEquals(5.0, v.getNormInf(), EPS);
    }

    @Test
    public void testGetNormInf_allPositive_returnsMaxValue() {
        Vector3D v = new Vector3D(1, 2, 10);
        assertEquals(10.0, v.getNormInf(), EPS);
    }

    // Alpha/Delta tests

    @Test
    public void testGetAlpha_plusI_returnsZero() {
        assertEquals(0.0, Vector3D.PLUS_I.getAlpha(), EPS);
    }

    @Test
    public void testGetAlpha_plusJ_returnsHalfPi() {
        assertEquals(FastMath.PI / 2, Vector3D.PLUS_J.getAlpha(), EPS);
    }

    @Test
    public void testGetDelta_plusK_returnsHalfPi() {
        assertEquals(FastMath.PI / 2, Vector3D.PLUS_K.getAlpha() == 0 ? Vector3D.PLUS_K.getDelta() : Vector3D.PLUS_K.getDelta(), EPS);
    }

    @Test
    public void testGetDelta_plusI_returnsZero() {
        assertEquals(0.0, Vector3D.PLUS_I.getDelta(), EPS);
    }

    // Add tests

    @Test
    public void testAdd_vector_returnsSumVector() {
        Vector3D result = v1.add(v2);
        assertEquals(5.0, result.getX(), EPS);
        assertEquals(7.0, result.getY(), EPS);
        assertEquals(9.0, result.getZ(), EPS);
    }

    @Test
    public void testAdd_withFactor_returnsScaledSum() {
        Vector3D result = v1.add(2.0, v2);
        assertEquals(9.0, result.getX(), EPS);
        assertEquals(12.0, result.getY(), EPS);
        assertEquals(15.0, result.getZ(), EPS);
    }

    @Test
    public void testAdd_negativeFactor_returnsCorrectResult() {
        Vector3D result = v1.add(-1.0, v2);
        assertEquals(-3.0, result.getX(), EPS);
        assertEquals(-3.0, result.getY(), EPS);
        assertEquals(-3.0, result.getZ(), EPS);
    }

    // Subtract tests

    @Test
    public void testSubtract_vector_returnsDifferenceVector() {
        Vector3D result = v2.subtract(v1);
        assertEquals(3.0, result.getX(), EPS);
        assertEquals(3.0, result.getY(), EPS);
        assertEquals(3.0, result.getZ(), EPS);
    }

    @Test
    public void testSubtract_withFactor_returnsScaledDifference() {
        Vector3D result = v1.subtract(2.0, v2);
        assertEquals(-7.0, result.getX(), EPS);
        assertEquals(-8.0, result.getY(), EPS);
        assertEquals(-9.0, result.getZ(), EPS);
    }

    // Normalize tests

    @Test
    public void testNormalize_normalVector_returnsUnitVector() {
        Vector3D v = new Vector3D(3, 4, 0);
        Vector3D normalized = v.normalize();
        assertEquals(1.0, normalized.getNorm(), EPS);
        assertEquals(0.6, normalized.getX(), EPS);
        assertEquals(0.8, normalized.getY(), EPS);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalize_zeroVector_throwsException() {
        Vector3D.ZERO.normalize();
    }

    // Orthogonal tests

    @Test
    public void testOrthogonal_vectorWithSmallX_returnsOrthogonalVector() {
        Vector3D v = new Vector3D(0.1, 5, 5);
        Vector3D ortho = v.orthogonal();
        assertEquals(0.0, Vector3D.dotProduct(v, ortho), 1e-9);
    }

    @Test
    public void testOrthogonal_vectorWithSmallY_returnsOrthogonalVector() {
        Vector3D v = new Vector3D(5, 0.1, 5);
        Vector3D ortho = v.orthogonal();
        assertEquals(0.0, Vector3D.dotProduct(v, ortho), 1e-9);
    }

    @Test
    public void testOrthogonal_vectorWithLargeXY_returnsOrthogonalVector() {
        Vector3D v = new Vector3D(5, 5, 0.1);
        Vector3D ortho = v.orthogonal();
        assertEquals(0.0, Vector3D.dotProduct(v, ortho), 1e-9);
    }

    @Test(expected = MathArithmeticException.class)
    public void testOrthogonal_zeroVector_throwsException() {
        Vector3D.ZERO.orthogonal();
    }

    // Angle tests

    @Test
    public void testAngle_perpendicularVectors_returnsHalfPi() {
        Vector3D a = new Vector3D(1, 0, 0);
        Vector3D b = new Vector3D(0, 1, 0);
        assertEquals(FastMath.PI / 2, Vector3D.angle(a, b), EPS);
    }

    @Test
    public void testAngle_parallelVectors_returnsZero() {
        Vector3D a = new Vector3D(1, 0, 0);
        Vector3D b = new Vector3D(2, 0, 0);
        assertEquals(0.0, Vector3D.angle(a, b), EPS);
    }

    @Test
    public void testAngle_oppositeVectors_returnsPi() {
        Vector3D a = new Vector3D(1, 0, 0);
        Vector3D b = new Vector3D(-1, 0, 0);
        assertEquals(FastMath.PI, Vector3D.angle(a, b), EPS);
    }

    @Test
    public void testAngle_almostAlignedWithNegativeDot_returnsCorrectAngle() {
        Vector3D a = new Vector3D(1, 0, 0);
        Vector3D b = new Vector3D(-0.9999999, 0.0001, 0);
        double angle = Vector3D.angle(a, b);
        assertTrue(angle > FastMath.PI / 2);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAngle_zeroNormVector_throwsException() {
        Vector3D.angle(Vector3D.ZERO, v1);
    }

    // Negate test

    @Test
    public void testNegate_normalVector_returnsOppositeVector() {
        Vector3D result = v1.negate();
        assertEquals(-1.0, result.getX(), EPS);
        assertEquals(-2.0, result.getY(), EPS);
        assertEquals(-3.0, result.getZ(), EPS);
    }

    // ScalarMultiply test

    @Test
    public void testScalarMultiply_positiveScalar_returnsScaledVector() {
        Vector3D result = v1.scalarMultiply(2.0);
        assertEquals(2.0, result.getX(), EPS);
        assertEquals(4.0, result.getY(), EPS);
        assertEquals(6.0, result.getZ(), EPS);
    }

    @Test
    public void testScalarMultiply_zeroScalar_returnsZeroVector() {
        Vector3D result = v1.scalarMultiply(0.0);
        assertEquals(0.0, result.getX(), EPS);
        assertEquals(0.0, result.getY(), EPS);
        assertEquals(0.0, result.getZ(), EPS);
    }

    // isNaN tests

    @Test
    public void testIsNaN_normalVector_returnsFalse() {
        assertFalse(v1.isNaN());
    }

    @Test
    public void testIsNaN_nanVector_returnsTrue() {
        assertTrue(Vector3D.NaN.isNaN());
    }

    @Test
    public void testIsNaN_partialNaN_returnsTrue() {
        Vector3D v = new Vector3D(Double.NaN, 1, 2);
        assertTrue(v.isNaN());
        Vector3D v2 = new Vector3D(1, Double.NaN, 2);
        assertTrue(v2.isNaN());
        Vector3D v3 = new Vector3D(1, 2, Double.NaN);
        assertTrue(v3.isNaN());
    }

    // isInfinite tests

    @Test
    public void testIsInfinite_normalVector_returnsFalse() {
        assertFalse(v1.isInfinite());
    }

    @Test
    public void testIsInfinite_infiniteVector_returnsTrue() {
        assertTrue(Vector3D.POSITIVE_INFINITY.isInfinite());
        assertTrue(Vector3D.NEGATIVE_INFINITY.isInfinite());
    }

    @Test
    public void testIsInfinite_nanVector_returnsFalse() {
        assertFalse(Vector3D.NaN.isInfinite());
    }

    @Test
    public void testIsInfinite_infiniteAndNaNMixed_returnsFalse() {
        Vector3D v = new Vector3D(Double.POSITIVE_INFINITY, Double.NaN, 1);
        assertFalse(v.isInfinite());
    }

    // equals tests

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(v1.equals(v1));
    }

    @Test
    public void testEquals_equalVectors_returnsTrue() {
        Vector3D other = new Vector3D(1, 2, 3);
        assertTrue(v1.equals(other));
    }

    @Test
    public void testEquals_differentVectors_returnsFalse() {
        assertFalse(v1.equals(v2));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(v1.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        assertFalse(v1.equals("not a vector"));
    }

    @Test
    public void testEquals_bothNaN_returnsTrue() {
        Vector3D nanVector = new Vector3D(Double.NaN, Double.NaN, Double.NaN);
        assertTrue(v1.equals(Vector3D.NaN) == false);
        assertTrue(Vector3D.NaN.equals(nanVector));
    }

    @Test
    public void testEquals_otherIsNaNThisIsNot_returnsFalse() {
        assertFalse(v1.equals(Vector3D.NaN));
    }

    @Test
    public void testEquals_thisIsNaNOtherIsNot_usesIsNaNCheck() {
        Vector3D partialNaN = new Vector3D(Double.NaN, 1, 2);
        assertTrue(partialNaN.equals(Vector3D.NaN));
    }

    // hashCode tests

    @Test
    public void testHashCode_nanVector_returnsEight() {
        assertEquals(8, Vector3D.NaN.hashCode());
    }

    @Test
    public void testHashCode_equalVectors_sameHashCode() {
        Vector3D other = new Vector3D(1, 2, 3);
        assertEquals(v1.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_differentVectors_mayDifferHashCode() {
        assertNotEquals(v1.hashCode(), v2.hashCode());
    }

    // dotProduct tests

    @Test
    public void testDotProduct_normalVectors_returnsCorrectValue() {
        double result = Vector3D.dotProduct(v1, v2);
        assertEquals(1 * 4 + 2 * 5 + 3 * 6, result, EPS);
    }

    @Test
    public void testDotProduct_perpendicularVectors_returnsZero() {
        Vector3D a = new Vector3D(1, 0, 0);
        Vector3D b = new Vector3D(0, 1, 0);
        assertEquals(0.0, Vector3D.dotProduct(a, b), EPS);
    }

    // crossProduct tests

    @Test
    public void testCrossProduct_standardBasisVectors_returnsCorrectResult() {
        Vector3D result = Vector3D.crossProduct(Vector3D.PLUS_I, Vector3D.PLUS_J);
        assertEquals(0.0, result.getX(), EPS);
        assertEquals(0.0, result.getY(), EPS);
        assertEquals(1.0, result.getZ(), EPS);
    }

    @Test
    public void testCrossProduct_parallelVectors_returnsZeroVector() {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(2, 4, 6);
        Vector3D result = Vector3D.crossProduct(a, b);
        assertEquals(0.0, result.getX(), EPS);
        assertEquals(0.0, result.getY(), EPS);
        assertEquals(0.0, result.getZ(), EPS);
    }

    // distance1 tests

    @Test
    public void testDistance1_normalVectors_returnsCorrectValue() {
        double result = Vector3D.distance1(v1, v2);
        assertEquals(3 + 3 + 3, result, EPS);
    }

    @Test
    public void testDistance1_sameVector_returnsZero() {
        assertEquals(0.0, Vector3D.distance1(v1, v1), EPS);
    }

    // distance tests

    @Test
    public void testDistance_normalVectors_returnsEuclideanDistance() {
        Vector3D a = new Vector3D(0, 0, 0);
        Vector3D b = new Vector3D(3, 4, 0);
        assertEquals(5.0, Vector3D.distance(a, b), EPS);
    }

    @Test
    public void testDistance_sameVector_returnsZero() {
        assertEquals(0.0, Vector3D.distance(v1, v1), EPS);
    }

    // distanceInf tests

    @Test
    public void testDistanceInf_normalVectors_returnsMaxAbsDifference() {
        Vector3D a = new Vector3D(0, 0, 0);
        Vector3D b = new Vector3D(3, 4, 10);
        assertEquals(10.0, Vector3D.distanceInf(a, b), EPS);
    }

    @Test
    public void testDistanceInf_sameVector_returnsZero() {
        assertEquals(0.0, Vector3D.distanceInf(v1, v1), EPS);
    }

    // distanceSq tests

    @Test
    public void testDistanceSq_normalVectors_returnsSquaredDistance() {
        Vector3D a = new Vector3D(0, 0, 0);
        Vector3D b = new Vector3D(3, 4, 0);
        assertEquals(25.0, Vector3D.distanceSq(a, b), EPS);
    }

    @Test
    public void testDistanceSq_sameVector_returnsZero() {
        assertEquals(0.0, Vector3D.distanceSq(v1, v1), EPS);
    }

    // toString test

    @Test
    public void testToString_normalVector_returnsNonNullString() {
        String str = v1.toString();
        assertNotNull(str);
        assertTrue(str.length() > 0);
    }

    @Test
    public void testToString_zeroVector_returnsNonNullString() {
        String str = Vector3D.ZERO.toString();
        assertNotNull(str);
    }

    // Static constants tests

    @Test
    public void testStaticConstants_zero_hasCorrectValues() {
        assertEquals(0.0, Vector3D.ZERO.getX(), EPS);
        assertEquals(0.0, Vector3D.ZERO.getY(), EPS);
        assertEquals(0.0, Vector3D.ZERO.getZ(), EPS);
    }

    @Test
    public void testStaticConstants_plusI_hasCorrectValues() {
        assertEquals(1.0, Vector3D.PLUS_I.getX(), EPS);
        assertEquals(0.0, Vector3D.PLUS_I.getY(), EPS);
        assertEquals(0.0, Vector3D.PLUS_I.getZ(), EPS);
    }

    @Test
    public void testStaticConstants_minusI_hasCorrectValues() {
        assertEquals(-1.0, Vector3D.MINUS_I.getX(), EPS);
    }

    @Test
    public void testStaticConstants_plusJ_hasCorrectValues() {
        assertEquals(1.0, Vector3D.PLUS_J.getY(), EPS);
    }

    @Test
    public void testStaticConstants_minusJ_hasCorrectValues() {
        assertEquals(-1.0, Vector3D.MINUS_J.getY(), EPS);
    }

    @Test
    public void testStaticConstants_plusK_hasCorrectValues() {
        assertEquals(1.0, Vector3D.PLUS_K.getZ(), EPS);
    }

    @Test
    public void testStaticConstants_minusK_hasCorrectValues() {
        assertEquals(-1.0, Vector3D.MINUS_K.getZ(), EPS);
    }

    @Test
    public void testStaticConstants_nan_isNaN() {
        assertTrue(Vector3D.NaN.isNaN());
    }

    @Test
    public void testStaticConstants_positiveInfinity_isInfinite() {
        assertTrue(Vector3D.POSITIVE_INFINITY.isInfinite());
    }

    @Test
    public void testStaticConstants_negativeInfinity_isInfinite() {
        assertTrue(Vector3D.NEGATIVE_INFINITY.isInfinite());
    }

    // Negative value edge cases

    @Test
    public void testGetNorm1_negativeValues_returnsPositiveSum() {
        Vector3D v = new Vector3D(-1, -2, -3);
        assertEquals(6.0, v.getNorm1(), EPS);
    }

    @Test
    public void testAdd_negativeVectors_returnsCorrectSum() {
        Vector3D a = new Vector3D(-1, -2, -3);
        Vector3D b = new Vector3D(-4, -5, -6);
        Vector3D result = a.add(b);
        assertEquals(-5.0, result.getX(), EPS);
        assertEquals(-7.0, result.getY(), EPS);
        assertEquals(-9.0, result.getZ(), EPS);
    }

    @Test
    public void testScalarMultiply_negativeScalar_returnsNegatedScaledVector() {
        Vector3D result = v1.scalarMultiply(-1.0);
        assertEquals(-1.0, result.getX(), EPS);
        assertEquals(-2.0, result.getY(), EPS);
        assertEquals(-3.0, result.getZ(), EPS);
    }
}
