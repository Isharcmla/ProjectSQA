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

    private static final double EPSILON = 1e-6;

    @Test
    public void testConstructorAndBasicGetters_maximize_restrictNonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, 3.0 }, 5.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 10.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        Assert.assertEquals(2, tableau.getNumVariables());
        Assert.assertEquals(2, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(1, tableau.getNumSlackVariables());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());

        // Width = numDecision(2) + numSlack(1) + numArtificial(0) + numObj(1) + RHS(1) = 5
        // Height = constraints(1) + numObj(1) = 2
        Assert.assertEquals(5, tableau.getWidth());
        Assert.assertEquals(2, tableau.getHeight());

        Assert.assertEquals(3, tableau.getSlackVariableOffset());
        Assert.assertEquals(4, tableau.getArtificialVariableOffset());
        Assert.assertEquals(4, tableau.getRhsOffset());
        Assert.assertEquals(3, tableau.getNegativeDecisionVariableOffset());

        double[][] data = tableau.getData();
        Assert.assertNotNull(data);
        Assert.assertEquals(2, data.length);
        Assert.assertEquals(5, data[0].length);

        // Check objective row (zIndex = 0)
        Assert.assertEquals(1.0, tableau.getEntry(0, 0), EPSILON);
        Assert.assertEquals(-2.0, tableau.getEntry(0, 1), EPSILON);
        Assert.assertEquals(-3.0, tableau.getEntry(0, 2), EPSILON);
        Assert.assertEquals(0.0, tableau.getEntry(0, 3), EPSILON);
        Assert.assertEquals(5.0, tableau.getEntry(0, 4), EPSILON);

        // Check constraint row
        Assert.assertEquals(1.0, tableau.getEntry(1, 1), EPSILON);
        Assert.assertEquals(1.0, tableau.getEntry(1, 2), EPSILON);
        Assert.assertEquals(1.0, tableau.getEntry(1, 3), EPSILON);
        Assert.assertEquals(10.0, tableau.getEntry(1, 4), EPSILON);
    }

    @Test
    public void testConstructor_minimize_unrestricted_withArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, -2.0 }, -4.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.GEQ, 2.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.EQ, 3.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, EPSILON);

        Assert.assertEquals(2, tableau.getNumVariables());
        Assert.assertEquals(3, tableau.getNumDecisionVariables()); // 2 + 1 for unrestricted
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(1, tableau.getNumSlackVariables()); // 1 GEQ
        Assert.assertEquals(2, tableau.getNumArtificialVariables()); // 1 GEQ + 1 EQ
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());

        // Width = 3 (decision) + 1 (slack) + 2 (artificial) + 2 (obj) + 1 (RHS) = 9
        // Height = 2 (constraints) + 2 (obj) = 4
        Assert.assertEquals(9, tableau.getWidth());
        Assert.assertEquals(4, tableau.getHeight());

        Assert.assertEquals(5, tableau.getSlackVariableOffset());
        Assert.assertEquals(6, tableau.getArtificialVariableOffset());
        Assert.assertEquals(8, tableau.getRhsOffset());
        Assert.assertEquals(4, tableau.getNegativeDecisionVariableOffset());
    }

    @Test
    public void testNormalizeConstraints_negativeRhs() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2.0, -1.0 }, Relationship.LEQ, -5.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, 3.0 }, Relationship.GEQ, 4.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();

        Assert.assertEquals(2, normalized.size());
        LinearConstraint firstNorm = normalized.get(0);
        Assert.assertEquals(5.0, firstNorm.getValue(), EPSILON);
        Assert.assertEquals(Relationship.GEQ, firstNorm.getRelationship());
        Assert.assertEquals(-2.0, firstNorm.getCoefficients().getEntry(0), EPSILON);
        Assert.assertEquals(1.0, firstNorm.getCoefficients().getEntry(1), EPSILON);

        LinearConstraint secondNorm = normalized.get(1);
        Assert.assertEquals(4.0, secondNorm.getValue(), EPSILON);
        Assert.assertEquals(Relationship.GEQ, secondNorm.getRelationship());
        Assert.assertEquals(1.0, secondNorm.getCoefficients().getEntry(0), EPSILON);
        Assert.assertEquals(3.0, secondNorm.getCoefficients().getEntry(1), EPSILON);
    }

    @Test
    public void testGetInvertedCoeffiecientSum() {
        RealVector vector = new ArrayRealVector(new double[] { 1.5, -2.5, 4.0 });
        double sum = SimplexTableau.getInvertedCoeffiecientSum(vector);
        Assert.assertEquals(-3.0, sum, EPSILON);

        RealVector emptyVector = new ArrayRealVector(new double[] {});
        Assert.assertEquals(0.0, SimplexTableau.getInvertedCoeffiecientSum(emptyVector), EPSILON);
    }

    @Test
    public void testDiscardArtificialVariables_whenPresent() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 2.0 }, Relationship.EQ, 6.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);
        Assert.assertEquals(1, tableau.getNumArtificialVariables());
        int originalWidth = tableau.getWidth();
        int originalHeight = tableau.getHeight();

        tableau.discardArtificialVariables();

        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(originalWidth - 2, tableau.getWidth());
        Assert.assertEquals(originalHeight - 1, tableau.getHeight());

        // Calling it again when numArtificialVariables is 0 should return early and do nothing
        tableau.discardArtificialVariables();
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testDiscardArtificialVariables_whenNone() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 2.0 }, Relationship.LEQ, 6.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        int originalWidth = tableau.getWidth();
        int originalHeight = tableau.getHeight();

        tableau.discardArtificialVariables();

        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(originalWidth, tableau.getWidth());
        Assert.assertEquals(originalHeight, tableau.getHeight());
    }

    @Test
    public void testRowOperations_divideRowAndSubtractRow() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2.0, 4.0 }, Relationship.LEQ, 8.0));
        constraints.add(new LinearConstraint(new double[] { 1.0, 3.0 }, Relationship.LEQ, 9.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Divide row 1 by 2.0
        tableau.divideRow(1, 2.0);
        Assert.assertEquals(1.0, tableau.getEntry(1, 1), EPSILON);
        Assert.assertEquals(2.0, tableau.getEntry(1, 2), EPSILON);
        Assert.assertEquals(4.0, tableau.getEntry(1, tableau.getRhsOffset()), EPSILON);

        // Subtract row 1 from row 2 with multiple 1.0
        tableau.subtractRow(2, 1, 1.0);
        Assert.assertEquals(0.0, tableau.getEntry(2, 1), EPSILON);
        Assert.assertEquals(1.0, tableau.getEntry(2, 2), EPSILON);
        Assert.assertEquals(5.0, tableau.getEntry(2, tableau.getRhsOffset()), EPSILON);

        // Set and get entry
        tableau.setEntry(2, 2, 99.5);
        Assert.assertEquals(99.5, tableau.getEntry(2, 2), EPSILON);
    }

    @Test
    public void testGetSolution_nonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3.0, 5.0 }, 10.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 4.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 6.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        RealPointValuePair solution = tableau.getSolution();

        Assert.assertNotNull(solution);
        double[] point = solution.getPoint();
        Assert.assertEquals(2, point.length);
        Assert.assertEquals(4.0, point[0], EPSILON);
        Assert.assertEquals(6.0, point[1], EPSILON);
        Assert.assertEquals(3.0 * 4.0 + 5.0 * 6.0 + 10.0, solution.getValue(), EPSILON);
    }

    @Test
    public void testGetSolution_unrestrictedVariables_withNegativeOffset() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2.0, -1.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 5.0));
        constraints.add(new LinearConstraint(new double[] { 0.0, 1.0 }, Relationship.LEQ, 2.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);

        // Manually configure negativeVar column to simulate basic negativeVar
        int negVarCol = tableau.getNegativeDecisionVariableOffset();
        for (int r = 0; r < tableau.getHeight(); r++) {
            tableau.setEntry(r, negVarCol, 0.0);
        }
        tableau.setEntry(2, negVarCol, 1.0); // Basic in row 2 where RHS is 2.0

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        double[] point = solution.getPoint();
        Assert.assertEquals(2, point.length);
    }

    @Test
    public void testGetSolution_duplicateBasicRowHandled() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 0.0 }, Relationship.LEQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Make variable 2 have the exact same basic column profile as variable 1
        int col1 = tableau.getNumObjectiveFunctions();
        int col2 = tableau.getNumObjectiveFunctions() + 1;
        for (int r = 0; r < tableau.getHeight(); r++) {
            tableau.setEntry(r, col2, tableau.getEntry(r, col1));
        }

        RealPointValuePair solution = tableau.getSolution();
        double[] point = solution.getPoint();
        Assert.assertEquals(5.0, point[0], EPSILON);
        // Duplicate basic row causes subsequent variable to be set to 0
        Assert.assertEquals(0.0, point[1], EPSILON);
    }

    @Test
    public void testGetSolution_nonBasicVariableYieldsZero() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 2.0 }, Relationship.LEQ, 5.0));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // Make variable 2 non-basic by having multiple non-zeroes in its column
        int col2 = tableau.getNumObjectiveFunctions() + 1;
        tableau.setEntry(0, col2, 2.0);
        tableau.setEntry(1, col2, 3.0);

        RealPointValuePair solution = tableau.getSolution();
        double[] point = solution.getPoint();
        Assert.assertEquals(0.0, point[1], EPSILON);
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 0.0);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] { 2.0, 3.0 }, 0.0);

        List<LinearConstraint> c1 = new ArrayList<LinearConstraint>();
        c1.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 10.0));

        List<LinearConstraint> c2 = new ArrayList<LinearConstraint>();
        c2.add(new LinearConstraint(new double[] { 2.0, 1.0 }, Relationship.LEQ, 15.0));

        SimplexTableau t1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau t1Clone = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau t2DiffFunc = new SimplexTableau(f2, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau t3DiffConst = new SimplexTableau(f1, c2, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau t4DiffGoal = new SimplexTableau(f1, c1, GoalType.MINIMIZE, true, EPSILON);
        SimplexTableau t5DiffRestrict = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, false, EPSILON);
        SimplexTableau t6DiffEps = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1e-4);

        // Reflexivity
        Assert.assertTrue(t1.equals(t1));

        // Symmetry & equality
        Assert.assertTrue(t1.equals(t1Clone));
        Assert.assertTrue(t1Clone.equals(t1));
        Assert.assertEquals(t1.hashCode(), t1Clone.hashCode());

        // Null and different type
        Assert.assertFalse(t1.equals(null));
        Assert.assertFalse(t1.equals("SomeString"));

        // Differences
        Assert.assertFalse(t1.equals(t2DiffFunc));
        Assert.assertFalse(t1.equals(t3DiffConst));
        Assert.assertFalse(t1.equals(t4DiffGoal));
        Assert.assertFalse(t1.equals(t5DiffRestrict));
        Assert.assertFalse(t1.equals(t6DiffEps));
    }

    @Test
    public void testSerialization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1.0, 2.0 }, 3.0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1.0, 1.0 }, Relationship.LEQ, 10.0));
        constraints.add(new LinearConstraint(new double[] { 2.0, 0.0 }, Relationship.GEQ, 4.0));

        SimplexTableau original = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);

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
        for (int r = 0; r < original.getHeight(); r++) {
            for (int c = 0; c < original.getWidth(); c++) {
                Assert.assertEquals(original.getEntry(r, c), deserialized.getEntry(r, c), EPSILON);
            }
        }
    }
}
