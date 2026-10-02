package org.apache.commons.math.geometry;

import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class Vector3DTest {

    private static final double EPSILON = 1e-12;

    @Test
    public void testConstants_coordinatesAndFlags_expectedValues() {
        Assert.assertEquals(0.0, Vector3D.ZERO.getX(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.ZERO.getY(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.ZERO.getZ(), EPSILON);

        Assert.assertEquals(1.0, Vector3D.PLUS_I.getX(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.PLUS_I.getY(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.PLUS_I.getZ(), EPSILON);

        Assert.assertEquals(-1.0, Vector3D.MINUS_I.getX(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.MINUS_I.getY(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.MINUS_I.getZ(), EPSILON);

        Assert.assertEquals(0.0, Vector3D.PLUS_J.getX(), EPSILON);
        Assert.assertEquals(1.0, Vector3D.PLUS_J.getY(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.PLUS_J.getZ(), EPSILON);

        Assert.assertEquals(0.0, Vector3D.MINUS_J.getX(), EPSILON);
        Assert.assertEquals(-1.0, Vector3D.MINUS_J.getY(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.MINUS_J.getZ(), EPSILON);

        Assert.assertEquals(0.0, Vector3D.PLUS_K.getX(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.PLUS_K.getY(), EPSILON);
        Assert.assertEquals(1.0, Vector3D.PLUS_K.getZ(), EPSILON);

        Assert.assertEquals(0.0, Vector3D.MINUS_K.getX(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.MINUS_K.getY(), EPSILON);
        Assert.assertEquals(-1.0, Vector3D.MINUS_K.getZ(), EPSILON);

        Assert.assertTrue(Vector3D.NaN.isNaN());
        Assert.assertTrue(Vector3D.POSITIVE_INFINITY.isInfinite());
        Assert.assertTrue(Vector3D.NEGATIVE_INFINITY.isInfinite());
    }

    @Test
    public void testConstructor_cartesianCoordinates_correctProperties() {
        Vector3D v = new Vector3D(1.5, -2.5, 3.5);
        Assert.assertEquals(1.5, v.getX(), EPSILON);
        Assert.assertEquals(-2.5, v.getY(), EPSILON);
        Assert.assertEquals(3.5, v.getZ(), EPSILON);
    }

    @Test
    public void testConstructor_azimuthAndElevation_correctCartesian() {
        double alpha = FastMath.PI / 4.0;
        double delta = FastMath.PI / 6.0;
        Vector3D v = new Vector3D(alpha, delta);

        double cosDelta = FastMath.cos(delta);
        Assert.assertEquals(FastMath.cos(alpha) * cosDelta, v.getX(), EPSILON);
        Assert.assertEquals(FastMath.sin(alpha) * cosDelta, v.getY(), EPSILON);
        Assert.assertEquals(FastMath.sin(delta), v.getZ(), EPSILON);
        Assert.assertEquals(1.0, v.getNorm(), EPSILON);
    }

    @Test
    public void testConstructor_multiplicative_scalesCorrectly() {
        Vector3D u = new Vector3D(1.0, -2.0, 3.0);
        Vector3D v = new Vector3D(2.5, u);
        Assert.assertEquals(2.5, v.getX(), EPSILON);
        Assert.assertEquals(-5.0, v.getY(), EPSILON);
        Assert.assertEquals(7.5, v.getZ(), EPSILON);
    }

    @Test
    public void testConstructor_linearCombinationTwoVectors_correctResult() {
        Vector3D u1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D u2 = new Vector3D(4.0, 5.0, 6.0);
        Vector3D v = new Vector3D(2.0, u1, -3.0, u2);
        Assert.assertEquals(2.0 * 1.0 - 3.0 * 4.0, v.getX(), EPSILON);
        Assert.assertEquals(2.0 * 2.0 - 3.0 * 5.0, v.getY(), EPSILON);
        Assert.assertEquals(2.0 * 3.0 - 3.0 * 6.0, v.getZ(), EPSILON);
    }

    @Test
    public void testConstructor_linearCombinationThreeVectors_correctResult() {
        Vector3D u1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D u2 = new Vector3D(4.0, 5.0, 6.0);
        Vector3D u3 = new Vector3D(7.0, 8.0, 9.0);
        Vector3D v = new Vector3D(2.0, u1, -3.0, u2, 4.0, u3);
        Assert.assertEquals(2.0 * 1.0 - 3.0 * 4.0 + 4.0 * 7.0, v.getX(), EPSILON);
        Assert.assertEquals(2.0 * 2.0 - 3.0 * 5.0 + 4.0 * 8.0, v.getY(), EPSILON);
        Assert.assertEquals(2.0 * 3.0 - 3.0 * 6.0 + 4.0 * 9.0, v.getZ(), EPSILON);
    }

    @Test
    public void testConstructor_linearCombinationFourVectors_correctResult() {
        Vector3D u1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D u2 = new Vector3D(4.0, 5.0, 6.0);
        Vector3D u3 = new Vector3D(7.0, 8.0, 9.0);
        Vector3D u4 = new Vector3D(1.0, -1.0, 1.0);
        Vector3D v = new Vector3D(2.0, u1, -3.0, u2, 4.0, u3, -2.0, u4);
        Assert.assertEquals(2.0 * 1.0 - 3.0 * 4.0 + 4.0 * 7.0 - 2.0 * 1.0, v.getX(), EPSILON);
        Assert.assertEquals(2.0 * 2.0 - 3.0 * 5.0 + 4.0 * 8.0 - 2.0 * -1.0, v.getY(), EPSILON);
        Assert.assertEquals(2.0 * 3.0 - 3.0 * 6.0 + 4.0 * 9.0 - 2.0 * 1.0, v.getZ(), EPSILON);
    }

    @Test
    public void testNorms_variousVectors_computesCorrectly() {
        Vector3D v = new Vector3D(1.0, -2.0, 2.0);
        Assert.assertEquals(5.0, v.getNorm1(), EPSILON);
        Assert.assertEquals(3.0, v.getNorm(), EPSILON);
        Assert.assertEquals(9.0, v.getNormSq(), EPSILON);
        Assert.assertEquals(2.0, v.getNormInf(), EPSILON);

        Vector3D v2 = new Vector3D(-5.0, 2.0, 1.0);
        Assert.assertEquals(5.0, v2.getNormInf(), EPSILON);

        Vector3D v3 = new Vector3D(1.0, 7.0, -2.0);
        Assert.assertEquals(7.0, v3.getNormInf(), EPSILON);
    }

    @Test
    public void testAngles_alphaAndDelta_computesCorrectly() {
        Vector3D v = new Vector3D(0.0, 2.0, 0.0);
        Assert.assertEquals(FastMath.PI / 2.0, v.getAlpha(), EPSILON);
        Assert.assertEquals(0.0, v.getDelta(), EPSILON);

        Vector3D vZ = new Vector3D(0.0, 0.0, 3.0);
        Assert.assertEquals(0.0, vZ.getAlpha(), EPSILON);
        Assert.assertEquals(FastMath.PI / 2.0, vZ.getDelta(), EPSILON);

        Vector3D vNegativeZ = new Vector3D(0.0, 0.0, -3.0);
        Assert.assertEquals(-FastMath.PI / 2.0, vNegativeZ.getDelta(), EPSILON);
    }

    @Test
    public void testAddAndSubtract_vectorsAndScaled_returnsCorrectVector() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(-4.0, 5.0, -6.0);

        Vector3D add = v1.add(v2);
        Assert.assertEquals(-3.0, add.getX(), EPSILON);
        Assert.assertEquals(7.0, add.getY(), EPSILON);
        Assert.assertEquals(-3.0, add.getZ(), EPSILON);

        Vector3D addScaled = v1.add(2.0, v2);
        Assert.assertEquals(-7.0, addScaled.getX(), EPSILON);
        Assert.assertEquals(12.0, addScaled.getY(), EPSILON);
        Assert.assertEquals(-9.0, addScaled.getZ(), EPSILON);

        Vector3D sub = v1.subtract(v2);
        Assert.assertEquals(5.0, sub.getX(), EPSILON);
        Assert.assertEquals(-3.0, sub.getY(), EPSILON);
        Assert.assertEquals(9.0, sub.getZ(), EPSILON);

        Vector3D subScaled = v1.subtract(2.0, v2);
        Assert.assertEquals(9.0, subScaled.getX(), EPSILON);
        Assert.assertEquals(-8.0, subScaled.getY(), EPSILON);
        Assert.assertEquals(15.0, subScaled.getZ(), EPSILON);
    }

    @Test
    public void testNegateAndScalarMultiply_validInputs_returnsExpectedVector() {
        Vector3D v = new Vector3D(1.0, -2.0, 3.0);
        Vector3D neg = v.negate();
        Assert.assertEquals(-1.0, neg.getX(), EPSILON);
        Assert.assertEquals(2.0, neg.getY(), EPSILON);
        Assert.assertEquals(-3.0, neg.getZ(), EPSILON);

        Vector3D scaled = v.scalarMultiply(3.0);
        Assert.assertEquals(3.0, scaled.getX(), EPSILON);
        Assert.assertEquals(-6.0, scaled.getY(), EPSILON);
        Assert.assertEquals(9.0, scaled.getZ(), EPSILON);
    }

    @Test
    public void testNormalize_nonZeroVector_normalizedCorrectly() {
        Vector3D v = new Vector3D(3.0, -4.0, 0.0);
        Vector3D norm = v.normalize();
        Assert.assertEquals(1.0, norm.getNorm(), EPSILON);
        Assert.assertEquals(0.6, norm.getX(), EPSILON);
        Assert.assertEquals(-0.8, norm.getY(), EPSILON);
        Assert.assertEquals(0.0, norm.getZ(), EPSILON);
    }

    @Test(expected = MathArithmeticException.class)
    public void testNormalize_zeroVector_throwsException() {
        Vector3D.ZERO.normalize();
    }

    @Test
    public void testOrthogonal_branchXInThreshold_returnsOrthogonalVector() {
        Vector3D v = new Vector3D(0.0, 3.0, 4.0);
        Vector3D ortho = v.orthogonal();
        Assert.assertEquals(1.0, ortho.getNorm(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.dotProduct(v, ortho), EPSILON);
    }

    @Test
    public void testOrthogonal_branchYInThreshold_returnsOrthogonalVector() {
        Vector3D v = new Vector3D(3.0, 0.0, 4.0);
        Vector3D ortho = v.orthogonal();
        Assert.assertEquals(1.0, ortho.getNorm(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.dotProduct(v, ortho), EPSILON);
    }

    @Test
    public void testOrthogonal_branchElse_returnsOrthogonalVector() {
        Vector3D v = new Vector3D(1.0, 1.0, 0.0);
        Vector3D ortho = v.orthogonal();
        Assert.assertEquals(1.0, ortho.getNorm(), EPSILON);
        Assert.assertEquals(0.0, Vector3D.dotProduct(v, ortho), EPSILON);
    }

    @Test(expected = MathArithmeticException.class)
    public void testOrthogonal_zeroVector_throwsException() {
        Vector3D.ZERO.orthogonal();
    }

    @Test
    public void testAngle_perpendicularAndGeneral_computesCorrectly() {
        Assert.assertEquals(FastMath.PI / 2.0, Vector3D.angle(Vector3D.PLUS_I, Vector3D.PLUS_J), EPSILON);
        Assert.assertEquals(FastMath.PI / 3.0, Vector3D.angle(new Vector3D(1, 0, 0), new Vector3D(1, FastMath.sqrt(3), 0)), EPSILON);
    }

    @Test
    public void testAngle_almostAlignedPositiveDot_computesSineBranch() {
        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D v2 = new Vector3D(1.0, 1e-5, 0.0);
        double angle = Vector3D.angle(v1, v2);
        Assert.assertTrue(angle > 0.0 && angle < 1e-4);
    }

    @Test
    public void testAngle_almostAlignedNegativeDot_computesSineBranch() {
        Vector3D v1 = new Vector3D(1.0, 0.0, 0.0);
        Vector3D v2 = new Vector3D(-1.0, 1e-5, 0.0);
        double angle = Vector3D.angle(v1, v2);
        Assert.assertTrue(angle < FastMath.PI && angle > FastMath.PI - 1e-4);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAngle_firstVectorZero_throwsException() {
        Vector3D.angle(Vector3D.ZERO, Vector3D.PLUS_I);
    }

    @Test(expected = MathArithmeticException.class)
    public void testAngle_secondVectorZero_throwsException() {
        Vector3D.angle(Vector3D.PLUS_I, Vector3D.ZERO);
    }

    @Test
    public void testIsNaN_variousInputs_expectedOutput() {
        Assert.assertFalse(new Vector3D(1.0, 2.0, 3.0).isNaN());
        Assert.assertTrue(new Vector3D(Double.NaN, 2.0, 3.0).isNaN());
        Assert.assertTrue(new Vector3D(1.0, Double.NaN, 3.0).isNaN());
        Assert.assertTrue(new Vector3D(1.0, 2.0, Double.NaN).isNaN());
    }

    @Test
    public void testIsInfinite_variousInputs_expectedOutput() {
        Assert.assertFalse(new Vector3D(1.0, 2.0, 3.0).isInfinite());
        Assert.assertTrue(new Vector3D(Double.POSITIVE_INFINITY, 2.0, 3.0).isInfinite());
        Assert.assertTrue(new Vector3D(1.0, Double.NEGATIVE_INFINITY, 3.0).isInfinite());
        Assert.assertTrue(new Vector3D(1.0, 2.0, Double.POSITIVE_INFINITY).isInfinite());
        Assert.assertFalse(new Vector3D(Double.NaN, Double.POSITIVE_INFINITY, 3.0).isInfinite());
    }

    @Test
    public void testEqualsAndHashCode_comprehensiveBranchCoverage() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v3 = new Vector3D(1.1, 2.0, 3.0);
        Vector3D v4 = new Vector3D(1.0, 2.1, 3.0);
        Vector3D v5 = new Vector3D(1.0, 2.0, 3.1);

        Assert.assertTrue(v1.equals(v1));
        Assert.assertTrue(v1.equals(v2));
        Assert.assertEquals(v1.hashCode(), v2.hashCode());

        Assert.assertFalse(v1.equals(null));
        Assert.assertFalse(v1.equals("Not a Vector3D"));

        Assert.assertFalse(v1.equals(v3));
        Assert.assertFalse(v1.equals(v4));
        Assert.assertFalse(v1.equals(v5));

        Vector3D nan1 = new Vector3D(Double.NaN, 1.0, 2.0);
        Vector3D nan2 = new Vector3D(1.0, Double.NaN, 2.0);
        Assert.assertTrue(nan1.equals(nan2));
        Assert.assertTrue(nan1.equals(Vector3D.NaN));
        Assert.assertFalse(v1.equals(nan1));
        Assert.assertFalse(nan1.equals(v1));
        Assert.assertEquals(8, nan1.hashCode());
        Assert.assertEquals(8, Vector3D.NaN.hashCode());
    }

    @Test
    public void testDotAndCrossProduct_standardVectors_correctResults() {
        Vector3D v1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, -5.0, 6.0);

        Assert.assertEquals(1.0 * 4.0 - 2.0 * 5.0 + 3.0 * 6.0, Vector3D.dotProduct(v1, v2), EPSILON);

        Vector3D k = Vector3D.crossProduct(Vector3D.PLUS_I, Vector3D.PLUS_J);
        Assert.assertEquals(Vector3D.PLUS_K.getX(), k.getX(), EPSILON);
        Assert.assertEquals(Vector3D.PLUS_K.getY(), k.getY(), EPSILON);
        Assert.assertEquals(Vector3D.PLUS_K.getZ(), k.getZ(), EPSILON);
    }

    @Test
    public void testDistances_allMetrics_correctValues() {
        Vector3D v1 = new Vector3D(1.0, -2.0, 3.0);
        Vector3D v2 = new Vector3D(4.0, 2.0, -1.0);

        Assert.assertEquals(3.0 + 4.0 + 4.0, Vector3D.distance1(v1, v2), EPSILON);
        Assert.assertEquals(FastMath.sqrt(9.0 + 16.0 + 16.0), Vector3D.distance(v1, v2), EPSILON);
        Assert.assertEquals(41.0, Vector3D.distanceSq(v1, v2), EPSILON);
        Assert.assertEquals(4.0, Vector3D.distanceInf(v1, v2), EPSILON);

        Vector3D v3 = new Vector3D(10.0, 0.0, 0.0);
        Vector3D v4 = new Vector3D(0.0, 0.0, 0.0);
        Assert.assertEquals(10.0, Vector3D.distanceInf(v3, v4), EPSILON);

        Vector3D v5 = new Vector3D(0.0, 0.0, 15.0);
        Assert.assertEquals(15.0, Vector3D.distanceInf(v5, v4), EPSILON);
    }

    @Test
    public void testToString_validVector_returnsNonEmptyFormattedString() {
        Vector3D v = new Vector3D(1.0, 2.0, 3.0);
        String str = v.toString();
        Assert.assertNotNull(str);
        Assert.assertFalse(str.trim().isEmpty());
    }
}
