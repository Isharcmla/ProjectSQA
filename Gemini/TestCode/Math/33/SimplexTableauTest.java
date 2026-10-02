package org.apache.commons.math3.optimization.linear;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double EPSILON = 1e-6;

    @Test
    public void testConstructorAndGetters_maximizeWithSlackAndArtificial() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 5.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4.0));
        constraints.add(new LinearConstraint(new double[]{1, 2}, Relationship.GEQ, 2.0));
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.EQ, 3.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(2, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getNumSlackVariables());
        Assert.assertEquals(2, tableau.getNumArtificialVariables());

        Assert.assertEquals(4, tableau.getSlackVariableOffset());
        Assert.assertEquals(6, tableau.getArtificialVariableOffset());
        Assert.assertEquals(8, tableau.getRhsOffset());
        Assert.assertEquals(9, tableau.getWidth());
        Assert.assertEquals(5, tableau.getHeight());

        double[][] data = tableau.getData();
        Assert.assertNotNull(data);
        Assert.assertEquals(5, data.length);
        Assert.assertEquals(9, data[0].length);
    }

    @Test
    public void testConstructor_minimizeNonRestricted() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-1, 4}, -2.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 10.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, EPSILON, 10);

        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(3, tableau.getNumDecisionVariables());
        Assert.assertEquals(1, tableau.getNumSlackVariables());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());

        Assert.assertEquals(4, tableau.getSlackVariableOffset());
        Assert.assertEquals(4, tableau.getArtificialVariableOffset());
        Assert.assertEquals(5, tableau.getRhsOffset());
        Assert.assertEquals(6, tableau.getWidth());
        Assert.assertEquals(2, tableau.getHeight());
    }

    @Test
    public void testNormalizeConstraints_negativeRhs() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{2, -3}, Relationship.LEQ, -5.0));
        constraints.add(new LinearConstraint(new double[]{-1, 2}, Relationship.GEQ, -4.0));
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, -2.0));
        constraints.add(new LinearConstraint(new double[]{3, 4}, Relationship.LEQ, 10.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        List<LinearConstraint> normalized = tableau.normalizeConstraints(constraints);

        Assert.assertEquals(4, normalized.size());

        LinearConstraint c0 = normalized.get(0);
        Assert.assertEquals(5.0, c0.getValue(), EPSILON);
        Assert.assertEquals(Relationship.GEQ, c0.getRelationship());
        Assert.assertArrayEquals(new double[]{-2, 3}, c0.getCoefficients().toArray(), EPSILON);

        LinearConstraint c1 = normalized.get(1);
        Assert.assertEquals(4.0, c1.getValue(), EPSILON);
        Assert.assertEquals(Relationship.LEQ, c1.getRelationship());
        Assert.assertArrayEquals(new double[]{1, -2}, c1.getCoefficients().toArray(), EPSILON);

        LinearConstraint c2 = normalized.get(2);
        Assert.assertEquals(2.0, c2.getValue(), EPSILON);
        Assert.assertEquals(Relationship.EQ, c2.getRelationship());
        Assert.assertArrayEquals(new double[]{-1, -1}, c2.getCoefficients().toArray(), EPSILON);

        LinearConstraint c3 = normalized.get(3);
        Assert.assertEquals(10.0, c3.getValue(), EPSILON);
        Assert.assertEquals(Relationship.LEQ, c3.getRelationship());
        Assert.assertArrayEquals(new double[]{3, 4}, c3.getCoefficients().toArray(), EPSILON);
    }

    @Test
    public void testGetInvertedCoefficientSum() {
        RealVector v = new ArrayRealVector(new double[]{1.5, -2.5, 4.0});
        double sum = SimplexTableau.getInvertedCoefficientSum(v);
        Assert.assertEquals(-3.0, sum, EPSILON);

        RealVector empty = new ArrayRealVector(new double[]{});
        Assert.assertEquals(0.0, SimplexTableau.getInvertedCoefficientSum(empty), EPSILON);
    }

    @Test
    public void testGetBasicRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        int slackOffset = tableau.getSlackVariableOffset();
        Assert.assertEquals(Integer.valueOf(1), tableau.getBasicRow(slackOffset));
        Assert.assertEquals(Integer.valueOf(2), tableau.getBasicRow(slackOffset + 1));

        tableau.setEntry(0, slackOffset, 2.0);
        Assert.assertNull(tableau.getBasicRow(slackOffset));

        tableau.setEntry(0, slackOffset, 1.0);
        tableau.setEntry(1, slackOffset, 1.0);
        Assert.assertNull(tableau.getBasicRow(slackOffset));
    }

    @Test
    public void testDropPhase1Objective_whenTwoPhase() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        int originalHeight = tableau.getHeight();

        tableau.dropPhase1Objective();

        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(originalHeight - 1, tableau.getHeight());
    }

    @Test
    public void testDropPhase1Objective_whenAlreadySinglePhase() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        int initialHeight = tableau.getHeight();
        int initialWidth = tableau.getWidth();

        tableau.dropPhase1Objective();

        Assert.assertEquals(initialHeight, tableau.getHeight());
        Assert.assertEquals(initialWidth, tableau.getWidth());
    }

    @Test
    public void testIsOptimal() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{-2, -3}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);

        boolean optimal = tableau.isOptimal();
        Assert.assertFalse(optimal);

        for (int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++) {
            tableau.setEntry(0, i, 1.0);
        }
        Assert.assertTrue(tableau.isOptimal());
    }

    @Test
    public void testGetSolution_standardNonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{3, 5}, 10);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        PointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        Assert.assertEquals(2, solution.getPoint().length);
        Assert.assertEquals(10.0, solution.getValue(), EPSILON);
    }

    @Test
    public void testGetSolution_unrestrictedVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, -1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);

        int colX0 = 1;
        tableau.setEntry(1, colX0, 1.0);
        tableau.setEntry(0, colX0, 0.0);
        tableau.setEntry(1, tableau.getRhsOffset(), 5.0);

        PointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        Assert.assertEquals(2, solution.getPoint().length);
        Assert.assertEquals(5.0, solution.getPoint()[0], EPSILON);
    }

    @Test
    public void testGetSolution_basicRowIsZeroRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        tableau.setEntry(0, 1, 1.0);
        tableau.setEntry(1, 1, 0.0);

        PointValuePair solution = tableau.getSolution();
        Assert.assertEquals(0.0, solution.getPoint()[0], EPSILON);
    }

    @Test
    public void testDivideRowAndSubtractRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{2, 4}, Relationship.LEQ, 8));
        constraints.add(new LinearConstraint(new double[]{3, 6}, Relationship.LEQ, 9));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        tableau.divideRow(1, 2.0);
        Assert.assertEquals(4.0, tableau.getEntry(1, tableau.getRhsOffset()), EPSILON);

        tableau.subtractRow(2, 1, 3.0);
        Assert.assertEquals(-3.0, tableau.getEntry(2, tableau.getRhsOffset()), EPSILON);
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[]{1, 2}, 0);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[]{1, 2}, 0);
        LinearObjectiveFunction f3 = new LinearObjectiveFunction(new double[]{2, 1}, 0);

        List<LinearConstraint> c1 = Arrays.asList(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        List<LinearConstraint> c2 = Arrays.asList(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 1));
        List<LinearConstraint> c3 = Arrays.asList(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 1));

        SimplexTableau tab1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tab2 = new SimplexTableau(f2, c2, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tab3 = new SimplexTableau(f3, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tab4 = new SimplexTableau(f1, c3, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tab5 = new SimplexTableau(f1, c1, GoalType.MINIMIZE, true, EPSILON);
        SimplexTableau tab6 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, false, EPSILON);
        SimplexTableau tab7 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1e-4);
        SimplexTableau tab8 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON, 20);

        Assert.assertTrue(tab1.equals(tab1));
        Assert.assertTrue(tab1.equals(tab2));
        Assert.assertEquals(tab1.hashCode(), tab2.hashCode());

        Assert.assertFalse(tab1.equals(null));
        Assert.assertFalse(tab1.equals("Some String"));
        Assert.assertFalse(tab1.equals(tab3));
        Assert.assertFalse(tab1.equals(tab4));
        Assert.assertFalse(tab1.equals(tab5));
        Assert.assertFalse(tab1.equals(tab6));
        Assert.assertFalse(tab1.equals(tab7));
        Assert.assertFalse(tab1.equals(tab8));
    }

    @Test
    public void testSerialization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 1);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 2}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[]{2, 1}, Relationship.GEQ, 2));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(tableau);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();

        Assert.assertEquals(tableau, deserialized);
        Assert.assertEquals(tableau.getHeight(), deserialized.getHeight());
        Assert.assertEquals(tableau.getWidth(), deserialized.getWidth());
        for (int r = 0; r < tableau.getHeight(); r++) {
            for (int c = 0; c < tableau.getWidth(); c++) {
                Assert.assertEquals(tableau.getEntry(r, c), deserialized.getEntry(r, c), EPSILON);
            }
        }
    }

    @Test
    public void testEmptyConstraints() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(0, tableau.getNumSlackVariables());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(1, tableau.getHeight());
        Assert.assertEquals(5, tableau.getWidth());
    }

    @Test
    public void testMultipleVariablesTakingSameRowInSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 5));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);

        int x0Col = 1;
        int x1Col = 2;
        tableau.setEntry(0, x0Col, 0);
        tableau.setEntry(1, x0Col, 1);
        tableau.setEntry(0, x1Col, 0);
        tableau.setEntry(1, x1Col, 1);
        tableau.setEntry(1, tableau.getRhsOffset(), 5.0);

        PointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        Assert.assertEquals(5.0, solution.getPoint()[0], EPSILON);
        Assert.assertEquals(0.0, solution.getPoint()[1], EPSILON);
    }
}
