package org.apache.commons.math.geometry.euclidean.threed;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class RotationTest {

    private static final double EPS = 1.0e-9;

    private Vector3D i;
    private Vector3D j;
    private Vector3D k;

    @Before
    public void setUp() {
        i = Vector3D.PLUS_I;
        j = Vector3D.PLUS_J;
        k = Vector3D.PLUS_K;
    }

    // ---------- Constructor: quaternion ----------

    @Test
    public void testConstructorQuaternion_normalized_valuesCorrect() {
        Rotation r = new Rotation(1.0, 0.0, 0.0, 0.0, false);
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(0.0, r.getQ3(), EPS);
    }

    @Test
    public void testConstructorQuaternion_needsNormalization_normalizedCorrectly() {
        Rotation r = new Rotation(2.0, 0.0, 0.0, 0.0, true);
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
    }

    // ---------- Constructor: axis and angle ----------

    @Test
    public void testConstructorAxisAngle_normalCase() {
        Rotation r = new Rotation(k, Math.PI / 2);
        Vector3D result = r.applyTo(i);
        assertEquals(0.0, result.getX(), EPS);
        assertEquals(1.0, result.getY(), EPS);
        assertEquals(0.0, result.getZ(), EPS);
    }

    @Test(expected = ArithmeticException.class)
    public void testConstructorAxisAngle_zeroNorm_throwsException() {
        new Rotation(new Vector3D(0, 0, 0), Math.PI / 2);
    }

    // ---------- Constructor: matrix ----------

    @Test
    public void testConstructorMatrix_identity() {
        double[][] m = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        Rotation r = new Rotation(m, 1.0e-10);
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(0.0, r.getQ3(), EPS);
    }

    @Test
    public void testConstructorMatrix_branchQ1() {
        double[][] m = {
            {1, 0, 0},
            {0, -1, 0},
            {0, 0, -1}
        };
        Rotation r = new Rotation(m, 1.0e-10);
        assertEquals(1.0, r.getQ1() * r.getQ1() * 4
                + (r.getQ0() * r.getQ0() + r.getQ2() * r.getQ2() + r.getQ3() * r.getQ3()) * 0, 1.0, EPS);
        // basic sanity: norm of quaternion is 1
        double norm = r.getQ0() * r.getQ0() + r.getQ1() * r.getQ1()
                + r.getQ2() * r.getQ2() + r.getQ3() * r.getQ3();
        assertEquals(1.0, norm, EPS);
    }

    @Test
    public void testConstructorMatrix_branchQ2() {
        double[][] m = {
            {-1, 0, 0},
            {0, 1, 0},
            {0, 0, -1}
        };
        Rotation r = new Rotation(m, 1.0e-10);
        double norm = r.getQ0() * r.getQ0() + r.getQ1() * r.getQ1()
                + r.getQ2() * r.getQ2() + r.getQ3() * r.getQ3();
        assertEquals(1.0, norm, EPS);
    }

    @Test
    public void testConstructorMatrix_branchQ3() {
        double[][] m = {
            {-1, 0, 0},
            {0, -1, 0},
            {0, 0, 1}
        };
        Rotation r = new Rotation(m, 1.0e-10);
        double norm = r.getQ0() * r.getQ0() + r.getQ1() * r.getQ1()
                + r.getQ2() * r.getQ2() + r.getQ3() * r.getQ3();
        assertEquals(1.0, norm, EPS);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_wrongDimensions_throwsException() {
        double[][] m = new double[2][3];
        new Rotation(m, 1.0e-10);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_negativeDeterminant_throwsException() {
        double[][] m = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, -1}
        };
        new Rotation(m, 1.0e-10);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_notConverging_throwsException() {
        double[][] m = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        new Rotation(m, -1.0);
    }

    // ---------- Constructor: two vector pairs ----------

    @Test
    public void testConstructorVectorPairs_normalCase() {
        Rotation r = new Rotation(i, j, j, k);
        Vector3D resI = r.applyTo(i);
        Vector3D resJ = r.applyTo(j);
        assertEquals(j.getX(), resI.getX(), EPS);
        assertEquals(j.getY(), resI.getY(), EPS);
        assertEquals(j.getZ(), resI.getZ(), EPS);
        assertEquals(k.getX(), resJ.getX(), EPS);
        assertEquals(k.getY(), resJ.getY(), EPS);
        assertEquals(k.getZ(), resJ.getZ(), EPS);
    }

    @Test
    public void testConstructorVectorPairs_sameVectors_identityLike() {
        Rotation r = new Rotation(i, j, i, j);
        Vector3D resI = r.applyTo(i);
        assertEquals(i.getX(), resI.getX(), EPS);
        assertEquals(i.getY(), resI.getY(), EPS);
        assertEquals(i.getZ(), resI.getZ(), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorVectorPairs_zeroNorm_throwsException() {
        new Rotation(new Vector3D(0, 0, 0), j, i, k);
    }

    // ---------- Constructor: single vector pair ----------

    @Test
    public void testConstructorSingleVectorPair_normalCase() {
        Rotation r = new Rotation(i, j);
        Vector3D result = r.applyTo(i);
        assertEquals(j.getX(), result.getX(), EPS);
        assertEquals(j.getY(), result.getY(), EPS);
        assertEquals(j.getZ(), result.getZ(), EPS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorSingleVectorPair_zeroNorm_throwsException() {
        new Rotation(new Vector3D(0, 0, 0), j);
    }

    @Test
    public void testConstructorSingleVectorPair_oppositeVectors() {
        Vector3D negI = new Vector3D(-1, 0, 0);
        Rotation r = new Rotation(i, negI);
        Vector3D result = r.applyTo(i);
        assertEquals(negI.getX(), result.getX(), EPS);
        assertEquals(negI.getY(), result.getY(), EPS);
        assertEquals(negI.getZ(), result.getZ(), EPS);
    }

    // ---------- Constructor: RotationOrder + angles ----------

    @Test
    public void testConstructorRotationOrder_normalCase() {
        Rotation r = new Rotation(RotationOrder.XYZ, 0.1, 0.2, 0.3);
        double norm = r.getQ0() * r.getQ0() + r.getQ1() * r.getQ1()
                + r.getQ2() * r.getQ2() + r.getQ3() * r.getQ3();
        assertEquals(1.0, norm, EPS);
    }

    // ---------- revert ----------

    @Test
    public void testRevert_normalCase() {
        Rotation r = new Rotation(k, Math.PI / 2);
        Rotation reverted = r.revert();
        Vector3D v = r.applyTo(i);
        Vector3D back = reverted.applyTo(v);
        assertEquals(i.getX(), back.getX(), EPS);
        assertEquals(i.getY(), back.getY(), EPS);
        assertEquals(i.getZ(), back.getZ(), EPS);
    }

    // ---------- getters ----------

    @Test
    public void testGetters_identity() {
        Rotation r = Rotation.IDENTITY;
        assertEquals(1.0, r.getQ0(), EPS);
        assertEquals(0.0, r.getQ1(), EPS);
        assertEquals(0.0, r.getQ2(), EPS);
        assertEquals(0.0, r.getQ3(), EPS);
    }

    // ---------- getAxis ----------

    @Test
    public void testGetAxis_zeroSine_returnsPlusI() {
        Rotation r = new Rotation(1.0, 0.0, 0.0, 0.0, false);
        Vector3D axis = r.getAxis();
        assertEquals(1.0, axis.getX(), EPS);
        assertEquals(0.0, axis.getY(), EPS);
        assertEquals(0.0, axis.getZ(), EPS);
    }

    @Test
    public void testGetAxis_q0Negative() {
        Rotation r = new Rotation(-0.6, 0.6, 0.6, 0.6, true);
        Vector3D axis = r.getAxis();
        assertEquals(1.0, axis.getNorm(), EPS);
    }

    @Test
    public void testGetAxis_q0Positive() {
        Rotation r = new Rotation(0.6, 0.6, 0.6, 0.6, true);
        Vector3D axis = r.getAxis();
        assertEquals(1.0, axis.getNorm(), EPS);
    }

    // ---------- getAngle ----------

    @Test
    public void testGetAngle_firstBranch_q0GreaterThan0p1() {
        Rotation r = new Rotation(0.5, 0.5, 0.5, 0.5, false);
        double angle = r.getAngle();
        assertTrue(angle > 0);
    }

    @Test
    public void testGetAngle_secondBranch_q0NegativeSmall() {
        double q3 = Math.sqrt(1 - 0.05 * 0.05);
        Rotation r = new Rotation(-0.05, 0.0, 0.0, q3, false);
        double angle = r.getAngle();
        assertEquals(2 * Math.acos(0.05), angle, 1.0e-6);
    }

    @Test
    public void testGetAngle_thirdBranch_q0PositiveSmall() {
        double q3 = Math.sqrt(1 - 0.05 * 0.05);
        Rotation r = new Rotation(0.05, 0.0, 0.0, q3, false);
        double angle = r.getAngle();
        assertEquals(2 * Math.acos(0.05), angle, 1.0e-6);
    }

    // ---------- getAngles ----------

    @Test
    public void testGetAngles_cardanOrders_identity_noException() {
        RotationOrder[] cardanOrders = {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX
        };
        for (RotationOrder order : cardanOrders) {
            double[] angles = Rotation.IDENTITY.getAngles(order);
            assertEquals(3, angles.length);
            assertEquals(0.0, angles[0], EPS);
            assertEquals(0.0, angles[1], EPS);
            assertEquals(0.0, angles[2], EPS);
        }
    }

    @Test
    public void testGetAngles_eulerOrders_identity_throwsSingularity() {
        RotationOrder[] eulerOrders = {
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };
        for (RotationOrder order : eulerOrders) {
            try {
                Rotation.IDENTITY.getAngles(order);
                fail("expected CardanEulerSingularityException for order " + order);
            } catch (CardanEulerSingularityException expected) {
                // ok
            }
        }
    }

    @Test
    public void testGetAngles_xyz_normalRotation() {
        Rotation r = new Rotation(k, Math.PI / 6);
        double[] angles = r.getAngles(RotationOrder.XYZ);
        assertEquals(3, angles.length);
    }

    // ---------- getMatrix ----------

    @Test
    public void testGetMatrix_identity() {
        double[][] m = Rotation.IDENTITY.getMatrix();
        assertEquals(1.0, m[0][0], EPS);
        assertEquals(0.0, m[0][1], EPS);
        assertEquals(0.0, m[0][2], EPS);
        assertEquals(0.0, m[1][0], EPS);
        assertEquals(1.0, m[1][1], EPS);
        assertEquals(0.0, m[1][2], EPS);
        assertEquals(0.0, m[2][0], EPS);
        assertEquals(0.0, m[2][1], EPS);
        assertEquals(1.0, m[2][2], EPS);
    }

    @Test
    public void testGetMatrix_rotationAroundZ() {
        Rotation r = new Rotation(k, Math.PI / 2);
        double[][] m = r.getMatrix();
        // applying matrix to I should give J
        double x = m[0][0] * 1 + m[0][1] * 0 + m[0][2] * 0;
        double y = m[1][0] * 1 + m[1][1] * 0 + m[1][2] * 0;
        double z = m[2][0] * 1 + m[2][1] * 0 + m[2][2] * 0;
        assertEquals(0.0, x, EPS);
        assertEquals(1.0, y, EPS);
        assertEquals(0.0, z, EPS);
    }

    // ---------- applyTo(Vector3D) ----------

    @Test
    public void testApplyTo_vector_identity() {
        Vector3D result = Rotation.IDENTITY.applyTo(i);
        assertEquals(i.getX(), result.getX(), EPS);
        assertEquals(i.getY(), result.getY(), EPS);
        assertEquals(i.getZ(), result.getZ(), EPS);
    }

    @Test
    public void testApplyTo_vector_rotationAroundZ() {
        Rotation r = new Rotation(k, Math.PI / 2);
        Vector3D result = r.applyTo(i);
        assertEquals(0.0, result.getX(), EPS);
        assertEquals(1.0, result.getY(), EPS);
        assertEquals(0.0, result.getZ(), EPS);
    }

    // ---------- applyInverseTo(Vector3D) ----------

    @Test
    public void testApplyInverseTo_vector_rotationAroundZ() {
        Rotation r = new Rotation(k, Math.PI / 2);
        Vector3D result = r.applyInverseTo(j);
        assertEquals(1.0, result.getX(), EPS);
        assertEquals(0.0, result.getY(), EPS);
        assertEquals(0.0, result.getZ(), EPS);
    }

    @Test
    public void testApplyInverseTo_vector_isInverseOfApplyTo() {
        Rotation r = new Rotation(k, 0.7);
        Vector3D v = new Vector3D(1, 2, 3);
        Vector3D applied = r.applyTo(v);
        Vector3D back = r.applyInverseTo(applied);
        assertEquals(v.getX(), back.getX(), EPS);
        assertEquals(v.getY(), back.getY(), EPS);
        assertEquals(v.getZ(), back.getZ(), EPS);
    }

    // ---------- applyTo(Rotation) ----------

    @Test
    public void testApplyTo_rotation_composition() {
        Rotation r1 = new Rotation(k, Math.PI / 2);
        Rotation r2 = new Rotation(k, Math.PI / 2);
        Rotation composed = r1.applyTo(r2);
        Vector3D result = composed.applyTo(i);
        // two 90 degree rotations around Z = 180 degree rotation
        assertEquals(-1.0, result.getX(), EPS);
        assertEquals(0.0, result.getY(), EPS);
        assertEquals(0.0, result.getZ(), EPS);
    }

    @Test
    public void testApplyTo_rotation_withIdentity() {
        Rotation r = new Rotation(k, Math.PI / 3);
        Rotation composed = Rotation.IDENTITY.applyTo(r);
        assertEquals(r.getQ0(), composed.getQ0(), EPS);
        assertEquals(r.getQ1(), composed.getQ1(), EPS);
        assertEquals(r.getQ2(), composed.getQ2(), EPS);
        assertEquals(r.getQ3(), composed.getQ3(), EPS);
    }

    // ---------- applyInverseTo(Rotation) ----------

    @Test
    public void testApplyInverseTo_rotation_withSelf_givesIdentity() {
        Rotation r = new Rotation(k, Math.PI / 4);
        Rotation result = r.applyInverseTo(r);
        assertEquals(1.0, Math.abs(result.getQ0()), EPS);
    }

    @Test
    public void testApplyInverseTo_rotation_normalCase() {
        Rotation r1 = new Rotation(k, Math.PI / 2);
        Rotation r2 = new Rotation(k, Math.PI / 4);
        Rotation result = r1.applyInverseTo(r2);
        double norm = result.getQ0() * result.getQ0() + result.getQ1() * result.getQ1()
                + result.getQ2() * result.getQ2() + result.getQ3() * result.getQ3();
        assertEquals(1.0, norm, EPS);
    }

    // ---------- distance ----------

    @Test
    public void testDistance_sameRotation_zero() {
        Rotation r = new Rotation(k, Math.PI / 3);
        double d = Rotation.distance(r, r);
        assertEquals(0.0, d, EPS);
    }

    @Test
    public void testDistance_differentRotations_positive() {
        Rotation r1 = new Rotation(k, Math.PI / 2);
        Rotation r2 = new Rotation(k, Math.PI / 4);
        double d = Rotation.distance(r1, r2);
        assertEquals(Math.PI / 4, d, 1.0e-6);
    }

    @Test
    public void testDistance_identityAndSelf_zero() {
        double d = Rotation.distance(Rotation.IDENTITY, Rotation.IDENTITY);
        assertEquals(0.0, d, EPS);
    }
}
