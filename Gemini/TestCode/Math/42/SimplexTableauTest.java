package org.apache.commons.math.optimization.linear;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.math.linear.ArrayRealVector;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double DEFAULT_EPSILON = 1.0e-6;

    @Test
    public void testConstructor_5Params_Maximize_RestrictNonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, 3.0 }, 10.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 4.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);

        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(2, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(1, tableau.getNumSlackVariables());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(2, tableau.getHeight());
        Assert.assertEquals(5, tableau.getWidth()); // Z, x0, x1, s0, RHS
    }

    @Test
    public void testConstructor_6Params_Minimize_UnrestrictedVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, -2.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 2.0 }, Relationship.GEQ, 2.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, DEFAULT_EPSILON, 10);

        Assert.assertEquals(2, tableau.getNumObjectiveFunctions()); // 1 artificial -> Phase 1 & 2
        Assert.assertEquals(3, tableau.getNumDecisionVariables()); // 2 + 1 for negative var
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(1, tableau.getNumSlackVariables());
        Assert.assertEquals(1, tableau.getNumArtificialVariables());
    }

    @Test
    public void testNormalizeConstraints_NegativeRHS() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2.0, -1.0 }, Relationship.LEQ, -4.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, 3.0 }, Relationship.GEQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);
        List<LinearConstraint> normalized = tableau.normalizeConstraints(constraints);

        Assert.assertEquals(2, normalized.size());
        Assert.assertEquals(4.0, normalized.get(0).getValue(), 1.0e-9);
        Assert.assertEquals(Relationship.GEQ, normalized.get(0).getRelationship());
        Assert.assertEquals(-2.0, normalized.get(0).getCoefficients().getEntry(0), 1.0e-9);
        Assert.assertEquals(1.0, normalized.get(0).getCoefficients().getEntry(1), 1.0e-9);

        Assert.assertEquals(5.0, normalized.get(1).getValue(), 1.0e-9);
        Assert.assertEquals(Relationship.GEQ, normalized.get(1).getRelationship());
    }

    @Test
    public void testConstraintTypesAndOffsets() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 1.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.GEQ, 2.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.EQ, 3.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);

        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(2, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getNumSlackVariables()); // 1 LEQ + 1 GEQ
        Assert.assertEquals(2, tableau.getNumArtificialVariables()); // 1 GEQ + 1 EQ

        Assert.assertEquals(4, tableau.getSlackVariableOffset()); // 2 Obj + 2 Decision
        Assert.assertEquals(6, tableau.getArtificialVariableOffset()); // 4 + 2 Slack
        Assert.assertEquals(tableau.getWidth() - 1, tableau.getRhsOffset());
    }

    @Test
    public void testGetInvertedCoefficientSum() {
        RealVector vector = new ArrayRealVector(new double[] { 1.0, -3.5, 4.2 });
        double sum = SimplexTableau.getInvertedCoefficientSum(vector);
        Assert.assertEquals(-1.7, sum, 1.0e-9);

        RealVector emptyVector = new ArrayRealVector(new double[] {});
        Assert.assertEquals(0.0, SimplexTableau.getInvertedCoefficientSum(emptyVector), 1.0e-9);
    }

    @Test
    public void testBasicRowDetection() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 2.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 3.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);

        int slack0Col = tableau.getSlackVariableOffset();
        int slack1Col = tableau.getSlackVariableOffset() + 1;

        Assert.assertEquals(Integer.valueOf(1), tableau.getBasicRow(slack0Col));
        Assert.assertEquals(Integer.valueOf(2), tableau.getBasicRow(slack1Col));

        tableau.setEntry(0, slack0Col, 0.5);
        Assert.assertNull(tableau.getBasicRow(slack0Col));

        tableau.setEntry(0, slack0Col, 1.0);
        Assert.assertNull(tableau.getBasicRow(slack0Col));

        tableau.setEntry(0, slack0Col, 0.0);
        tableau.setEntry(1, slack0Col, 0.0);
        Assert.assertNull(tableau.getBasicRow(slack0Col));
    }

    @Test
    public void testDropPhase1Objective_NoPhase1() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0 }, Relationship.LEQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);
        int initialHeight = tableau.getHeight();
        int initialWidth = tableau.getWidth();

        tableau.dropPhase1Objective();

        Assert.assertEquals(initialHeight, tableau.getHeight());
        Assert.assertEquals(initialWidth, tableau.getWidth());
    }

    @Test
    public void testDropPhase1Objective_WithArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.EQ, 3.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(1, tableau.getNumArtificialVariables());

        tableau.setEntry(0, tableau.getNumObjectiveFunctions(), 1.0);

        tableau.dropPhase1Objective();

        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testIsOptimal() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2.0, -3.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 4.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);
        Assert.assertTrue(tableau.isOptimal());

        tableau.setEntry(0, 1, -1.0);
        Assert.assertFalse(tableau.isOptimal());
    }

    @Test
    public void testGetSolution_RestrictedNonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3.0, 5.0 }, 10.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 2.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 4.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);

        int x0Col = 1;
        int x1Col = 2;
        tableau.setEntry(1, x0Col, 1.0);
        tableau.setEntry(2, x0Col, 0.0);
        tableau.setEntry(1, tableau.getSlackVariableOffset(), 0.0);

        tableau.setEntry(2, x1Col, 1.0);
        tableau.setEntry(1, x1Col, 0.0);
        tableau.setEntry(2, tableau.getSlackVariableOffset() + 1, 0.0);

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertEquals(2.0, solution.getPoint()[0], 1.0e-9);
        Assert.assertEquals(4.0, solution.getPoint()[1], 1.0e-9);
        Assert.assertEquals(36.0, solution.getValue(), 1.0e-9); // 3*2 + 5*4 + 10
    }

    @Test
    public void testGetSolution_UnrestrictedVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0 }, Relationship.LEQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, DEFAULT_EPSILON);

        int negCol = tableau.getSlackVariableOffset() - 1;
        tableau.setEntry(1, negCol, 1.0);
        tableau.setEntry(1, tableau.getSlackVariableOffset(), 0.0);
        tableau.setEntry(1, tableau.getRhsOffset(), 3.0);

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertEquals(-3.0, solution.getPoint()[0], 1.0e-9);
        Assert.assertEquals(-6.0, solution.getValue(), 1.0e-9);
    }

    @Test
    public void testGetSolution_DuplicateBasicRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);
        int x0Col = 1;
        int x1Col = 2;

        tableau.setEntry(0, x0Col, 0.0);
        tableau.setEntry(1, x0Col, 1.0);
        tableau.setEntry(0, x1Col, 0.0);
        tableau.setEntry(1, x1Col, 1.0);

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertEquals(5.0, solution.getPoint()[0], 1.0e-9);
        Assert.assertEquals(0.0, solution.getPoint()[1], 1.0e-9);
    }

    @Test
    public void testRowOperations() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2.0 }, Relationship.LEQ, 4.0));
        constraints.add(new LinearConstraint(new double[] { 4.0 }, Relationship.LEQ, 8.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);

        tableau.divideRow(1, 2.0);
        Assert.assertEquals(1.0, tableau.getEntry(1, 1), 1.0e-9);
        Assert.assertEquals(2.0, tableau.getEntry(1, tableau.getRhsOffset()), 1.0e-9);

        tableau.subtractRow(2, 1, 4.0);
        Assert.assertEquals(0.0, tableau.getEntry(2, 1), 1.0e-9);
        Assert.assertEquals(0.0, tableau.getEntry(2, tableau.getRhsOffset()), 1.0e-9);
    }

    @Test
    public void testGetData() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0 }, 5.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 3.0 }, Relationship.LEQ, 6.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);
        double[][] data = tableau.getData();

        Assert.assertEquals(tableau.getHeight(), data.length);
        Assert.assertEquals(tableau.getWidth(), data[0].length);
        Assert.assertEquals(tableau.getEntry(0, 0), data[0][0], 1.0e-9);
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] { 1.0, 3.0 }, 0.0);

        List<LinearConstraint> c1 = Arrays.asList(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 1.0));
        List<LinearConstraint> c2 = Arrays.asList(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 1.0));

        SimplexTableau t1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, DEFAULT_EPSILON, 10);
        SimplexTableau t1Clone = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, DEFAULT_EPSILON, 10);
        SimplexTableau t2 = new SimplexTableau(f2, c1, GoalType.MAXIMIZE, true, DEFAULT_EPSILON, 10);
        SimplexTableau t3 = new SimplexTableau(f1, c2, GoalType.MAXIMIZE, true, DEFAULT_EPSILON, 10);
        SimplexTableau t4 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, false, DEFAULT_EPSILON, 10);
        SimplexTableau t5 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1.0e-4, 10);
        SimplexTableau t6 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, DEFAULT_EPSILON, 20);

        Assert.assertTrue(t1.equals(t1));
        Assert.assertTrue(t1.equals(t1Clone));
        Assert.assertEquals(t1.hashCode(), t1Clone.hashCode());

        Assert.assertFalse(t1.equals(null));
        Assert.assertFalse(t1.equals("different object type"));
        Assert.assertFalse(t1.equals(t2));
        Assert.assertFalse(t1.equals(t3));
        Assert.assertFalse(t1.equals(t4));
        Assert.assertFalse(t1.equals(t5));
        Assert.assertFalse(t1.equals(t6));
    }

    @Test
    public void testSerialization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, -1.0 }, 3.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 2.0 }, Relationship.LEQ, 10.0));
        constraints.add(new LinearConstraint(new double[] { 2.0, 1.0 }, Relationship.GEQ, 4.0));

        SimplexTableau original = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);

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
    }
}
