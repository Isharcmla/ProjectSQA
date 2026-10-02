package org.apache.commons.math.geometry.euclidean.threed;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.commons.math.util.FastMath;
import org.junit.Assert;
import org.junit.Test;

public class RotationTest {

    private static final double EPSILON = 1.0e-10;

    @Test
    public void testConstructorQuaternion_needsNormalizationTrue_normalizesComponents() {
        Rotation r = new Rotation(2.0, 0.0, 0.0, 0.0, true);
        Assert.assertEquals(1.0, r.getQ0(), EPSILON);
        Assert.assertEquals(0.0, r.getQ1(), EPSILON);
        Assert.assertEquals(0.0, r.getQ2(), EPSILON);
        Assert.assertEquals(0.0, r.getQ3(), EPSILON);
    }

    @Test
    public void testConstructorQuaternion_needsNormalizationFalse_retainsExactComponents() {
        Rotation r = new Rotation(0.5, 0.5, 0.5, 0.5, false);
        Assert.assertEquals(0.5, r.getQ0(), EPSILON);
        Assert.assertEquals(0.5, r.getQ1(), EPSILON);
        Assert.assertEquals(0.5, r.getQ2(), EPSILON);
        Assert.assertEquals(0.5, r.getQ3(), EPSILON);
    }

    @Test
    public void testConstructorAxisAngle_validInput_createsCorrectRotation() {
        Rotation r = new Rotation(new Vector3D(0, 0, 1), FastMath.PI / 2);
        Vector3D v = r.applyTo(Vector3D.PLUS_I);
        Assert.assertEquals(0.0, v.getX(), EPSILON);
        Assert.assertEquals(1.0, v.getY(), EPSILON);
        Assert.assertEquals(0.0, v.getZ(), EPSILON);
    }

    @Test(expected = ArithmeticException.class)
    public void testConstructorAxisAngle_zeroNormAxis_throwsArithmeticException() {
        new Rotation(Vector3D.ZERO, FastMath.PI / 2);
    }

    @Test
    public void testConstructorMatrix_validRotationMatrix_constructsSuccessfully() throws NotARotationMatrixException {
        double[][] m = new double[][] {
            { 1.0, 0.0, 0.0 },
            { 0.0, 1.0, 0.0 },
            { 0.0, 0.0, 1.0 }
        };
        Rotation r = new Rotation(m, 1.0e-10);
        Assert.assertEquals(1.0, r.getQ0(), EPSILON);
        Assert.assertEquals(0.0, r.getQ1(), EPSILON);
        Assert.assertEquals(0.0, r.getQ2(), EPSILON);
        Assert.assertEquals(0.0, r.getQ3(), EPSILON);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_invalidDimensions_throwsException() throws NotARotationMatrixException {
        double[][] m = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };
        new Rotation(m, 1.0e-10);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_negativeDeterminant_throwsException() throws NotARotationMatrixException {
        double[][] reflectionMatrix = new double[][] {
            { -1.0, 0.0, 0.0 },
            { 0.0, 1.0, 0.0 },
            { 0.0, 0.0, 1.0 }
        };
        new Rotation(reflectionMatrix, 1.0e-10);
    }

    @Test(expected = NotARotationMatrixException.class)
    public void testConstructorMatrix_notOrthogonalExceedsThreshold_throwsException() throws NotARotationMatrixException {
        double[][] nonOrthogonal = new double[][] {
            { 1.0, 2.0, 3.0 },
            { 4.0, 5.0, 6.0 },
            { 7.0, 8.0, 9.0 }
        };
        new Rotation(nonOrthogonal, 1.0e-15);
    }

    @Test
    public void testConstructorMatrix_branchesForDifferentDominantQuaternionComponents() throws NotARotationMatrixException {
        // Branch 1: dominant q0 (Identity)
        Rotation r0 = new Rotation(new double[][] {
            { 1.0, 0.0, 0.0 },
            { 0.0, 1.0, 0.0 },
            { 0.0, 0.0, 1.0 }
        }, 1.0e-10);
        Assert.assertTrue(FastMath.abs(r0.getQ0()) > 0.45);

        // Branch 2: dominant q1 (180 deg around X)
        Rotation r1 = new Rotation(new double[][] {
            { 1.0, 0.0, 0.0 },
            { 0.0, -1.0, 0.0 },
            { 0.0, 0.0, -1.0 }
        }, 1.0e-10);
        Assert.assertTrue(FastMath.abs(r1.getQ1()) > 0.45);

        // Branch 3: dominant q2 (180 deg around Y)
        Rotation r2 = new Rotation(new double[][] {
            { -1.0, 0.0, 0.0 },
            { 0.0, 1.0, 0.0 },
            { 0.0, 0.0, -1.0 }
        }, 1.0e-10);
        Assert.assertTrue(FastMath.abs(r2.getQ2()) > 0.45);

        // Branch 4: dominant q3 (180 deg around Z)
        Rotation r3 = new Rotation(new double[][] {
            { -1.0, 0.0, 0.0 },
            { 0.0, -1.0, 0.0 },
            { 0.0, 0.0, 1.0 }
        }, 1.0e-10);
        Assert.assertTrue(FastMath.abs(r3.getQ3()) > 0.45);
    }

    @Test
    public void testConstructorTwoVectorPairs_validInputs_constructsCorrectRotation() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D v1 = new Vector3D(0, 1, 0);
        Vector3D v2 = new Vector3D(-1, 0, 0);

        Rotation r = new Rotation(u1, u2, v1, v2);
        Vector3D res1 = r.applyTo(u1);
        Vector3D res2 = r.applyTo(u2);

        Assert.assertEquals(0.0, res1.getX(), EPSILON);
        Assert.assertEquals(1.0, res1.getY(), EPSILON);
        Assert.assertEquals(0.0, res1.getZ(), EPSILON);

        Assert.assertEquals(-1.0, res2.getX(), EPSILON);
        Assert.assertEquals(0.0, res2.getY(), EPSILON);
        Assert.assertEquals(0.0, res2.getZ(), EPSILON);
    }

    @Test
    public void testConstructorTwoVectorPairs_alignedWithEverything_returnsIdentity() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Rotation r = new Rotation(u1, u2, u1, u2);
        Assert.assertEquals(1.0, r.getQ0(), EPSILON);
        Assert.assertEquals(0.0, r.getQ1(), EPSILON);
        Assert.assertEquals(0.0, r.getQ2(), EPSILON);
        Assert.assertEquals(0.0, r.getQ3(), EPSILON);
    }

    @Test
    public void testConstructorTwoVectorPairs_cZeroBranch2_computesScalarPartFromU2V2() {
        Vector3D u1 = new Vector3D(1, 0, 0);
        Vector3D u2 = new Vector3D(0, 1, 0);
        Vector3D v1 = new Vector3D(1, 0, 0);
        Vector3D v2 = new Vector3D(0, -1, 0);
        Rotation r = new Rotation(u1, u2, v1, v2);
        Vector3D res1 = r.applyTo(u1);
        Vector3D res2 = r.applyTo(u2);
        Assert.assertEquals(1.0, res1.getX(), EPSILON);
        Assert.assertEquals(-1.0, res2.getY(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTwoVectorPairs_zeroNormVector_throwsIllegalArgumentException() {
        new Rotation(Vector3D.ZERO, Vector3D.PLUS_I, Vector3D.PLUS_J, Vector3D.PLUS_K);
    }

    @Test
    public void testConstructorTwoVectors_generalCase_correctRotation() {
        Vector3D u = new Vector3D(1, 0, 0);
        Vector3D v = new Vector3D(0, 1, 0);
        Rotation r = new Rotation(u, v);
        Vector3D res = r.applyTo(u);
        Assert.assertEquals(0.0, res.getX(), EPSILON);
        Assert.assertEquals(1.0, res.getY(), EPSILON);
        Assert.assertEquals(0.0, res.getZ(), EPSILON);
    }

    @Test
    public void testConstructorTwoVectors_oppositeVectors_rotatesPI() {
        Vector3D u = new Vector3D(1, 0, 0);
        Vector3D v = new Vector3D(-1, 0, 0);
        Rotation r = new Rotation(u, v);
        Vector3D res = r.applyTo(u);
        Assert.assertEquals(-1.0, res.getX(), EPSILON);
        Assert.assertEquals(0.0, res.getY(), EPSILON);
        Assert.assertEquals(0.0, res.getZ(), EPSILON);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTwoVectors_zeroNorm_throwsIllegalArgumentException() {
        new Rotation(Vector3D.ZERO, Vector3D.PLUS_I);
    }

    @Test
    public void testConstructorRotationOrder_validAngles_composesProperly() {
        Rotation r = new Rotation(RotationOrder.XYZ, 0.1, 0.2, 0.3);
        Assert.assertNotNull(r);
        Assert.assertEquals(1.0, r.getQ0() * r.getQ0() + r.getQ1() * r.getQ1() + r.getQ2() * r.getQ2() + r.getQ3() * r.getQ3(), EPSILON);
    }

    @Test
    public void testRevert_appliedToVector_reversesTransformation() {
        Rotation r = new Rotation(new Vector3D(1, 1, 1), 1.2);
        Rotation rev = r.revert();
        Vector3D v = new Vector3D(2, -3, 4);
        Vector3D transformed = r.applyTo(v);
        Vector3D back = rev.applyTo(transformed);
        Assert.assertEquals(v.getX(), back.getX(), EPSILON);
        Assert.assertEquals(v.getY(), back.getY(), EPSILON);
        Assert.assertEquals(v.getZ(), back.getZ(), EPSILON);
    }

    @Test
    public void testGetAxis_identityRotation_returnsDefaultAxis() {
        Rotation r = Rotation.IDENTITY;
        Vector3D axis = r.getAxis();
        Assert.assertEquals(1.0, axis.getX(), EPSILON);
        Assert.assertEquals(0.0, axis.getY(), EPSILON);
        Assert.assertEquals(0.0, axis.getZ(), EPSILON);
    }

    @Test
    public void testGetAxisAndAngle_negativeAndPositiveQ0_handledCorrectly() {
        Rotation rPos = new Rotation(new Vector3D(0, 0, 1), 0.5);
        Assert.assertTrue(rPos.getQ0() > 0);
        Assert.assertEquals(0.5, rPos.getAngle(), EPSILON);
        Assert.assertEquals(1.0, FastMath.abs(rPos.getAxis().getZ()), EPSILON);

        Rotation rNeg = new Rotation(-0.05, FastMath.sqrt(1 - 0.05 * 0.05), 0, 0, false);
        Assert.assertTrue(rNeg.getQ0() < 0 && rNeg.getQ0() > -0.1);
        Assert.assertEquals(2 * FastMath.acos(0.05), rNeg.getAngle(), EPSILON);
        Assert.assertEquals(1.0, rNeg.getAxis().getX(), EPSILON);

        Rotation rPosSmall = new Rotation(0.05, FastMath.sqrt(1 - 0.05 * 0.05), 0, 0, false);
        Assert.assertEquals(2 * FastMath.acos(0.05), rPosSmall.getAngle(), EPSILON);
    }

    @Test
    public void testGetAngles_allRotationOrders_nonSingularAnglesReturned() throws CardanEulerSingularityException {
        RotationOrder[] orders = new RotationOrder[] {
            RotationOrder.XYZ, RotationOrder.XZY, RotationOrder.YXZ,
            RotationOrder.YZX, RotationOrder.ZXY, RotationOrder.ZYX,
            RotationOrder.XYX, RotationOrder.XZX, RotationOrder.YXY,
            RotationOrder.YZY, RotationOrder.ZXZ, RotationOrder.ZYZ
        };

        for (RotationOrder order : orders) {
            double a1 = 0.2;
            double a2 = (order.toString().charAt(0) == order.toString().charAt(2)) ? 0.7 : 0.3;
            double a3 = 0.4;
            Rotation r = new Rotation(order, a1, a2, a3);
            double[] angles = r.getAngles(order);
            Assert.assertEquals(a1, angles[0], 1.0e-7);
            Assert.assertEquals(a2, angles[1], 1.0e-7);
            Assert.assertEquals(a3, angles[2], 1.0e-7);
        }
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityCardanXYZ_throwsException() throws CardanEulerSingularityException {
        Rotation r = new Rotation(RotationOrder.XYZ, 0.1, FastMath.PI / 2, 0.3);
        r.getAngles(RotationOrder.XYZ);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityCardanXZY_throwsException() throws CardanEulerSingularityException {
        Rotation r = new Rotation(RotationOrder.XZY, 0.1, FastMath.PI / 2, 0.3);
        r.getAngles(RotationOrder.XZY);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityCardanYXZ_throwsException() throws CardanEulerSingularityException {
        Rotation r = new Rotation(RotationOrder.YXZ, 0.1, FastMath.PI / 2, 0.3);
        r.getAngles(RotationOrder.YXZ);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityCardanYZX_throwsException() throws CardanEulerSingularityException {
        Rotation r = new Rotation(RotationOrder.YZX, 0.1, FastMath.PI / 2, 0.3);
        r.getAngles(RotationOrder.YZX);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityCardanZXY_throwsException() throws CardanEulerSingularityException {
        Rotation r = new Rotation(RotationOrder.ZXY, 0.1, FastMath.PI / 2, 0.3);
        r.getAngles(RotationOrder.ZXY);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityCardanZYX_throwsException() throws CardanEulerSingularityException {
        Rotation r = new Rotation(RotationOrder.ZYX, 0.1, FastMath.PI / 2, 0.3);
        r.getAngles(RotationOrder.ZYX);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityEulerXYX_throwsException() throws CardanEulerSingularityException {
        Rotation.IDENTITY.getAngles(RotationOrder.XYX);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityEulerXZX_throwsException() throws CardanEulerSingularityException {
        Rotation.IDENTITY.getAngles(RotationOrder.XZX);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityEulerYXY_throwsException() throws CardanEulerSingularityException {
        Rotation.IDENTITY.getAngles(RotationOrder.YXY);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityEulerYZY_throwsException() throws CardanEulerSingularityException {
        Rotation.IDENTITY.getAngles(RotationOrder.YZY);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityEulerZXZ_throwsException() throws CardanEulerSingularityException {
        Rotation.IDENTITY.getAngles(RotationOrder.ZXZ);
    }

    @Test(expected = CardanEulerSingularityException.class)
    public void testGetAngles_singularityEulerZYZ_throwsException() throws CardanEulerSingularityException {
        Rotation.IDENTITY.getAngles(RotationOrder.ZYZ);
    }

    @Test
    public void testGetMatrix_identityRotation_returnsIdentityMatrix() {
        double[][] m = Rotation.IDENTITY.getMatrix();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Assert.assertEquals(i == j ? 1.0 : 0.0, m[i][j], EPSILON);
            }
        }
    }

    @Test
    public void testApplyInverseTo_vector_matchesInverseTransformation() {
        Rotation r = new Rotation(new Vector3D(1, 2, 3), 0.8);
        Vector3D v = new Vector3D(3, -2, 1);
        Vector3D transformed = r.applyTo(v);
        Vector3D inverted = r.applyInverseTo(transformed);
        Assert.assertEquals(v.getX(), inverted.getX(), EPSILON);
        Assert.assertEquals(v.getY(), inverted.getY(), EPSILON);
        Assert.assertEquals(v.getZ(), inverted.getZ(), EPSILON);
    }

    @Test
    public void testApplyToAndApplyInverseTo_rotationComposition_behavesCorrectly() {
        Rotation r1 = new Rotation(new Vector3D(1, 0, 0), 0.5);
        Rotation r2 = new Rotation(new Vector3D(0, 1, 0), 0.7);

        Rotation composed = r1.applyTo(r2);
        Vector3D v = new Vector3D(1, 2, 3);
        Vector3D expected = r1.applyTo(r2.applyTo(v));
        Vector3D actual = composed.applyTo(v);
        Assert.assertEquals(expected.getX(), actual.getX(), EPSILON);
        Assert.assertEquals(expected.getY(), actual.getY(), EPSILON);
        Assert.assertEquals(expected.getZ(), actual.getZ(), EPSILON);

        Rotation invComposed = r1.applyInverseTo(r2);
        Vector3D expectedInv = r1.applyInverseTo(r2.applyTo(v));
        Vector3D actualInv = invComposed.applyTo(v);
        Assert.assertEquals(expectedInv.getX(), actualInv.getX(), EPSILON);
        Assert.assertEquals(expectedInv.getY(), actualInv.getY(), EPSILON);
        Assert.assertEquals(expectedInv.getZ(), actualInv.getZ(), EPSILON);
    }

    @Test
    public void testDistance_sameAndDifferentRotations_computesCorrectDistance() {
        Rotation r1 = new Rotation(new Vector3D(1, 0, 0), 0.5);
        Rotation r2 = new Rotation(new Vector3D(1, 0, 0), 0.5);
        Rotation r3 = new Rotation(new Vector3D(1, 0, 0), 1.0);

        Assert.assertEquals(0.0, Rotation.distance(r1, r2), EPSILON);
        Assert.assertEquals(0.5, Rotation.distance(r1, r3), EPSILON);
    }

    @Test
    public void testSerialization_rotationInstance_maintainsState() throws Exception {
        Rotation r = new Rotation(new Vector3D(1, 2, 3), 0.7);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(r);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        Rotation deserialized = (Rotation) ois.readObject();
        ois.close();

        Assert.assertEquals(r.getQ0(), deserialized.getQ0(), EPSILON);
        Assert.assertEquals(r.getQ1(), deserialized.getQ1(), EPSILON);
        Assert.assertEquals(r.getQ2(), deserialized.getQ2(), EPSILON);
        Assert.assertEquals(r.getQ3(), deserialized.getQ3(), EPSILON);
    }
}
