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

    private static final double EPSILON = 1.0e-6;

    @Test
    public void testConstructor_Maximize_RestrictedToNonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 3 }, 5);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        Assert.assertEquals(2, tableau.getNumVariables());
        Assert.assertEquals(2, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        Assert.assertEquals(1, tableau.getNumSlackVariables());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(1, tableau.getNumObjectiveFunctions());

        Assert.assertEquals(2, tableau.getHeight());
        // width = 2(decision) + 1(slack) + 0(art) + 1(obj) + 1(rhs) = 5
        Assert.assertEquals(5, tableau.getWidth());
        Assert.assertEquals(3, tableau.getSlackVariableOffset());
        Assert.assertEquals(4, tableau.getArtificialVariableOffset());
        Assert.assertEquals(4, tableau.getRhsOffset());

        // Check objective row
        Assert.assertEquals(1.0, tableau.getEntry(0, 0), EPSILON);
        Assert.assertEquals(-2.0, tableau.getEntry(0, 1), EPSILON);
        Assert.assertEquals(-3.0, tableau.getEntry(0, 2), EPSILON);
        Assert.assertEquals(5.0, tableau.getEntry(0, 4), EPSILON);

        // Check constraint row
        Assert.assertEquals(1.0, tableau.getEntry(1, 1), EPSILON);
        Assert.assertEquals(1.0, tableau.getEntry(1, 2), EPSILON);
        Assert.assertEquals(1.0, tableau.getEntry(1, 3), EPSILON);
        Assert.assertEquals(4.0, tableau.getEntry(1, 4), EPSILON);

        double[][] data = tableau.getData();
        Assert.assertEquals(2, data.length);
        Assert.assertEquals(5, data[0].length);
    }

    @Test
    public void testConstructor_Minimize_UnrestrictedVariables_NegativeRhs() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -1, 4 }, -2);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        // Negative RHS should be normalized (multiplied by -1 and inverted relationship)
        constraints.add(new LinearConstraint(new double[] { 1, -2 }, Relationship.LEQ, -3));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, EPSILON);

        // numDecisionVariables = 2 + 1 (for unrestricted x-) = 3
        Assert.assertEquals(2, tableau.getNumVariables());
        Assert.assertEquals(3, tableau.getNumDecisionVariables());
        Assert.assertEquals(2, tableau.getOriginalNumDecisionVariables());
        // normalized constraint becomes: -1*x1 + 2*x2 >= 3 (Relationship.GEQ)
        // GEQ gives 1 slack and 1 artificial
        Assert.assertEquals(1, tableau.getNumSlackVariables());
        Assert.assertEquals(1, tableau.getNumArtificialVariables());
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());

        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        Assert.assertEquals(1, normalized.size());
        LinearConstraint normC = normalized.get(0);
        Assert.assertEquals(3.0, normC.getValue(), EPSILON);
        Assert.assertEquals(Relationship.GEQ, normC.getRelationship());
        Assert.assertEquals(-1.0, normC.getCoefficients().getEntry(0), EPSILON);
        Assert.assertEquals(2.0, normC.getCoefficients().getEntry(1), EPSILON);
    }

    @Test
    public void testConstraintsWithAllRelationships() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 10));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 5));
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 12));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        // LEQ (1 slack) + GEQ (1 slack, 1 art) + EQ (1 art) => 2 slack, 2 artificial
        Assert.assertEquals(2, tableau.getNumSlackVariables());
        Assert.assertEquals(2, tableau.getNumArtificialVariables());
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
    }

    @Test
    public void testDiscardArtificialVariables_WhenNone() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 10));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        int initialHeight = tableau.getHeight();
        int initialWidth = tableau.getWidth();

        tableau.discardArtificialVariables();

        Assert.assertEquals(initialHeight, tableau.getHeight());
        Assert.assertEquals(initialWidth, tableau.getWidth());
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testDiscardArtificialVariables_WhenPresent() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 5));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        Assert.assertEquals(1, tableau.getNumArtificialVariables());
        Assert.assertEquals(2, tableau.getNumObjectiveFunctions());
        int initialWidth = tableau.getWidth();
        int initialHeight = tableau.getHeight();

        tableau.discardArtificialVariables();

        Assert.assertEquals(0, tableau.getNumArtificialVariables());
        Assert.assertEquals(initialHeight - 1, tableau.getHeight());
        Assert.assertEquals(initialWidth - 1 - 1, tableau.getWidth());
    }

    @Test
    public void testGetInvertedCoeffiecientSum() {
        RealVector vector = new ArrayRealVector(new double[] { 1.5, -2.5, 3.0 });
        double sum = SimplexTableau.getInvertedCoeffiecientSum(vector);
        // -(1.5 - 2.5 + 3.0) = -2.0
        Assert.assertEquals(-2.0, sum, EPSILON);

        RealVector emptyVector = new ArrayRealVector(new double[] {});
        Assert.assertEquals(0.0, SimplexTableau.getInvertedCoeffiecientSum(emptyVector), EPSILON);
    }

    @Test
    public void testDivideRow_and_SubtractRow_and_SetEntry() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 2 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2, 4 }, Relationship.LEQ, 8));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        tableau.divideRow(1, 2.0);
        Assert.assertEquals(1.0, tableau.getEntry(1, 1), EPSILON);
        Assert.assertEquals(2.0, tableau.getEntry(1, 2), EPSILON);
        Assert.assertEquals(0.5, tableau.getEntry(1, 3), EPSILON);
        Assert.assertEquals(4.0, tableau.getEntry(1, 4), EPSILON);

        tableau.subtractRow(0, 1, 1.0);
        Assert.assertEquals(1.0, tableau.getEntry(0, 0), EPSILON);
        Assert.assertEquals(-3.0, tableau.getEntry(0, 1), EPSILON);

        tableau.setEntry(0, 0, 99.0);
        Assert.assertEquals(99.0, tableau.getEntry(0, 0), EPSILON);
    }

    @Test
    public void testGetSolution_RestrictedToNonNegative() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 5 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 6));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        double[] point = solution.getPoint();
        Assert.assertEquals(2, point.length);
        Assert.assertEquals(4.0, point[0], EPSILON);
        Assert.assertEquals(6.0, point[1], EPSILON);
        Assert.assertEquals(3 * 4.0 + 5 * 6.0, solution.getValue(), EPSILON);
    }

    @Test
    public void testGetSolution_UnrestrictedVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 7));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, EPSILON);

        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        double[] point = solution.getPoint();
        Assert.assertEquals(2, point.length);
    }

    @Test
    public void testGetSolution_MultipleVariablesTakingSameBasicRow() {
        // Construct a problem where two decision columns share a basic column structure in tableau
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        // Force basic variable condition
        // Row 1 has coefficients 1 for x0 and 1 for x1
        // getSolution() inner loop checks tableau.getEntry(basicRow, j) == 1
        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        double[] point = solution.getPoint();
        Assert.assertEquals(5.0, point[0], EPSILON);
        Assert.assertEquals(0.0, point[1], EPSILON);
    }

    @Test
    public void testEqualsAndHashCode() {
        LinearObjectiveFunction f1 = new LinearObjectiveFunction(new double[] { 1, 2 }, 0);
        LinearObjectiveFunction f2 = new LinearObjectiveFunction(new double[] { 1, 2 }, 0);
        LinearObjectiveFunction f3 = new LinearObjectiveFunction(new double[] { 2, 1 }, 0);

        List<LinearConstraint> c1 = new ArrayList<LinearConstraint>();
        c1.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5));

        List<LinearConstraint> c2 = new ArrayList<LinearConstraint>();
        c2.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5));

        List<LinearConstraint> c3 = new ArrayList<LinearConstraint>();
        c3.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 5));

        SimplexTableau t1 = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau t1Clone = new SimplexTableau(f2, c2, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tDifferentF = new SimplexTableau(f3, c1, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tDifferentC = new SimplexTableau(f1, c3, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tDifferentRestr = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, false, EPSILON);
        SimplexTableau tDifferentEps = new SimplexTableau(f1, c1, GoalType.MAXIMIZE, true, 1.0e-4);

        // Reflexive
        Assert.assertEquals(t1, t1);
        Assert.assertEquals(t1.hashCode(), t1.hashCode());

        // Symmetric and equal
        Assert.assertEquals(t1, t1Clone);
        Assert.assertEquals(t1Clone, t1);
        Assert.assertEquals(t1.hashCode(), t1Clone.hashCode());

        // Null and different type
        Assert.assertFalse(t1.equals(null));
        Assert.assertFalse(t1.equals("Not a tableau"));

        // Differences
        Assert.assertFalse(t1.equals(tDifferentF));
        Assert.assertFalse(t1.equals(tDifferentC));
        Assert.assertFalse(t1.equals(tDifferentRestr));
        Assert.assertFalse(t1.equals(tDifferentEps));
    }

    @Test
    public void testSerialization() throws Exception {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, -1, 3 }, 10);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 2, 0 }, Relationship.LEQ, 15));
        constraints.add(new LinearConstraint(new double[] { 0, 1, 1 }, Relationship.GEQ, 2));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(tableau);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();
        ois.close();

        Assert.assertEquals(tableau, deserialized);
        Assert.assertEquals(tableau.hashCode(), deserialized.hashCode());
        Assert.assertEquals(tableau.getWidth(), deserialized.getWidth());
        Assert.assertEquals(tableau.getHeight(), deserialized.getHeight());
        Assert.assertEquals(tableau.getNumDecisionVariables(), deserialized.getNumDecisionVariables());
        Assert.assertEquals(tableau.getNumSlackVariables(), deserialized.getNumSlackVariables());
        Assert.assertEquals(tableau.getNumArtificialVariables(), deserialized.getNumArtificialVariables());

        for (int r = 0; r < tableau.getHeight(); r++) {
            for (int c = 0; c < tableau.getWidth(); c++) {
                Assert.assertEquals(tableau.getEntry(r, c), deserialized.getEntry(r, c), EPSILON);
            }
        }
    }
}
