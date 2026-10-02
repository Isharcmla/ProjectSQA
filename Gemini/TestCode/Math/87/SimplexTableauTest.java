package org.apache.commons.math.optimization.linear;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class SimplexTableauTest {

    @Test
    public void testTableauInitialization_maximizeNonNegativeLEQ() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3.0, 5.0 }, 10.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 4.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 2.0 }, Relationship.LEQ, 12.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);

        Assert.assertEquals(2, tableau.getNumVariables());
        Assert.assertEquals(2, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(2, tableau.getNumSlackVariables());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(3, tableau.getHeight());
        Assert.assertEquals(6, tableau.getWidth());
        Assert.assertEquals(3, tableau.getSlackVariableOffset());
        Assert.assertEquals(5, tableau.getArtificialVariableOffset());
        Assert.assertEquals(5, tableau.getRhsOffset());

        double[][] data = tableau.getData();
        Assert.assertNotNull(data);
        Assert.assertEquals(3, data.length);
        Assert.assertEquals(6, data[0].length);

        // Discarding artificial variables when there are 0 should be a no-op
        tableau.discardArtificialVariables();
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(6, tableau.getWidth());
    }

    @Test
    public void testTableauInitialization_minimizeNegativeAllowedGEQAndEQ() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, -1.0 }, -5.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.GEQ, 2.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, -2.0 }, Relationship.EQ, 3.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, 1.0e-6);

        // Decision variables = 2 original + 1 (for negative allowed) = 3
        Assert.assertEquals(2, tableau.getNumVariables());
        Assert.assertEquals(3, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(1, tableau.getNumSlackVariables()); // 1 GEQ
        Assert.assertEquals(2, tableau.getNumArtificialVariables()); // 1 GEQ + 1 EQ
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());

        // Test discarding artificial variables
        int oldWidth = tableau.getWidth();
        tableau.discardArtificialVariables();
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(oldWidth - 2 - 1, tableau.getWidth());
    }

    @Test
    public void testNormalizeConstraints_negativeRhs() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, -1.0 }, Relationship.LEQ, -10.0));
        constraints.add(new LinearConstraint(new double[] { -2.0, 3.0 }, Relationship.GEQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();

        Assert.assertEquals(2, normalized.size());
        // First constraint: 1*x1 - 1*x2 <= -10 -> -1*x1 + 1*x2 >= 10
        Assert.assertEquals(10.0, normalized.get(0).getValue(), 1.0e-6);
        Assert.assertEquals(Relationship.GEQ, normalized.get(0).getRelationship());
        Assert.assertEquals(-1.0, normalized.get(0).getCoefficients().getEntry(0), 1.0e-6);
        Assert.assertEquals(1.0, normalized.get(0).getCoefficients().getEntry(1), 1.0e-6);

        // Second constraint: -2*x1 + 3*x2 >= 5 (remains unchanged)
        Assert.assertEquals(5.0, normalized.get(1).getValue(), 1.0e-6);
        Assert.assertEquals(Relationship.GEQ, normalized.get(1).getRelationship());
    }

    @Test
    public void testRowOperations_divideSubtractSetAndGetEntry() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2.0, 4.0 }, Relationship.LEQ, 8.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);

        tableau.setEntry(1, 0, 4.0);
        Assert.assertEquals(4.0, tableau.getEntry(1, 0), 1.0e-6);

        tableau.divideRow(1, 2.0);
        Assert.assertEquals(2.0, tableau.getEntry(1, 0), 1.0e-6);

        tableau.setEntry(0, 0, 10.0);
        tableau.subtractRow(0, 1, 3.0); // 10.0 - 3.0 * 2.0 = 4.0
        Assert.assertEquals(4.0, tableau.getEntry(0, 0), 1.0e-6);
    }

    @Test
    public void testGetInvertedCoeffiecientSum() {
        RealVector vector = new ArrayRealVector(new double[] { 1.5, -2.5, 4.0 });
        double sum = SimplexTableau.getInvertedCoeffiecientSum(vector);
        // -(1.5 + (-2.5) + 4.0) = -3.0
        Assert.assertEquals(-3.0, sum, 1.0e-6);

        RealVector emptyVector = new ArrayRealVector(new double[] {});
        Assert.assertEquals(0.0, SimplexTableau.getInvertedCoeffiecientSum(emptyVector), 1.0e-6);
    }

    @Test
    public void testGetSolution_nonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, 3.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 5.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 7.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        Assert.assertEquals(2, solution.getPoint().length);
        Assert.assertEquals(5.0, solution.getPoint()[0], 1.0e-6);
        Assert.assertEquals(7.0, solution.getPoint()[1], 1.0e-6);
        Assert.assertEquals(31.0, solution.getValue(), 1.0e-6);
    }

    @Test
    public void testGetSolution_negativeAllowed() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, -1.0 }, 5.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 2.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 3.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6);

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        Assert.assertEquals(2, solution.getPoint().length);
    }

    @Test
    public void testGetSolution_withDuplicateBasicRowsAndNonBasicColumns() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        // Both variables share identity coefficients in the same row
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 10.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);

        // Make both columns basic in row 1
        tableau.setEntry(1, 1, 1.0);
        tableau.setEntry(1, 2, 1.0);

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        // The second variable should take 0 because basic row is already used
        Assert.assertEquals(10.0, solution.getPoint()[0], 1.0e-6);
        Assert.assertEquals(0.0, solution.getPoint()[1], 1.0e-6);

        // Make column non-basic by having multiple non-zeros across rows
        LinearConstraint c2 = new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 5.0);
        constraints.add(c2);
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-6);
        tableau2.setEntry(1, 1, 1.0);
        tableau2.setEntry(2, 1, 2.0); // Now col 1 is not basic
        RealPointValuePair solution2 = tableau2.getSolution();
        Assert.assertEquals(0.0, solution2.getPoint()[0], 1.0e-6);
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 3.0);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 4.0);
        List<LinearConstraint> c1 = new ArrayList<LinearConstraint>();
        c1.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 5.0));
        List<LinearConstraint> c2 = new ArrayList<LinearConstraint>();
        c2.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 6.0));

        SimplexTableau t1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau t1Same = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau tDifferentGoal = new SimplexTableau(f1, c1, GoalType.MINIMIZE, true, 1.0e-6);
        SimplexTableau tDifferentRestrict = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, false, 1.0e-6);
        SimplexTableau tDifferentEpsilon = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1.0e-4);
        SimplexTableau tDifferentF = new SimplexTableau(f2, c1, GoalType.MAXIMIZE, true, 1.0e-6);
        SimplexTableau tDifferentC = new SimplexTableau(f1, c2, GoalType.MAXIMIZE, true, 1.0e-6);

        // Same reference
        Assert.assertTrue(t1.equals(t1));
        // Null & different class
        Assert.assertFalse(t1.equals(null));
        Assert.assertFalse(t1.equals("Some String"));

        // Equal instances
        Assert.assertTrue(t1.equals(t1Same));
        Assert.assertEquals(t1.hashCode(), t1Same.hashCode());

        // Different properties
        Assert.assertFalse(t1.equals(tDifferentGoal));
        Assert.assertFalse(t1.equals(tDifferentRestrict));
        Assert.assertFalse(t1.equals(tDifferentEpsilon));
        Assert.assertFalse(t1.equals(tDifferentF));
        Assert.assertFalse(t1.equals(tDifferentC));
    }

    @Test
    public void testSerialization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, -1.0 }, 3.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 10.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, -1.0 }, Relationship.GEQ, 2.0));

        SimplexTableau original = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1.0e-6);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();
        ois.close();

        Assert.assertEquals(original, deserialized);
        Assert.assertEquals(original.hashCode(), deserialized.hashCode());
        Assert.assertEquals(original.getWidth(), deserialized.getWidth());
        Assert.assertEquals(original.getHeight(), deserialized.getHeight());
    }
}
