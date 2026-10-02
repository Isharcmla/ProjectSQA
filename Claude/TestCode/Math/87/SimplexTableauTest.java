package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Test;

public class SimplexTableauTest {

    private static final double EPSILON = 1.0e-6;

    // ---------- helper builders ----------

    private SimplexTableau buildLeqOnlyTableau() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));
        return new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
    }

    private SimplexTableau buildGeqTableau() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 2));
        return new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);
    }

    private SimplexTableau buildEqTableau() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 2));
        return new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);
    }

    private SimplexTableau buildNonNegativeFalseTableau() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.LEQ, 5));
        return new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, EPSILON);
    }

    // ---------- constructor / normal cases ----------

    @Test
    public void testConstructor_leqConstraint_normalCase() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(5, tableau.getWidth());
        assertEquals(2, tableau.getHeight());
    }

    @Test
    public void testConstructor_geqConstraint_hasArtificialVariable() {
        SimplexTableau tableau = buildGeqTableau();
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(2, tableau.getNumObjectiveFunctions());
    }

    @Test
    public void testConstructor_eqConstraint_hasArtificialVariable() {
        SimplexTableau tableau = buildEqTableau();
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(2, tableau.getNumObjectiveFunctions());
    }

    @Test
    public void testConstructor_restrictToNonNegativeFalse_addsExtraVariable() {
        SimplexTableau tableau = buildNonNegativeFalseTableau();
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(1, tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testConstructor_maximizeGoal_setsUpProperly() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 10));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 10));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        assertNotNull(tableau.getData());
        assertEquals(1, tableau.getNumObjectiveFunctions());
    }

    // ---------- getNumVariables ----------

    @Test
    public void testGetNumVariables_returnsCorrectCount() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        assertEquals(2, tableau.getNumVariables());
    }

    // ---------- getNormalizedConstraints ----------

    @Test
    public void testGetNormalizedConstraints_negativeValue_normalizesToPositive() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, -3));
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);

        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        LinearConstraint normalizedConstraint = normalized.get(0);
        assertEquals(3.0, normalizedConstraint.getValue(), EPSILON);
        assertEquals(Relationship.GEQ, normalizedConstraint.getRelationship());
        assertEquals(-1.0, normalizedConstraint.getCoefficients().getEntry(0), EPSILON);
        assertEquals(-1.0, normalizedConstraint.getCoefficients().getEntry(1), EPSILON);
    }

    @Test
    public void testGetNormalizedConstraints_positiveValue_unchanged() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        assertEquals(4.0, normalized.get(0).getValue(), EPSILON);
        assertEquals(Relationship.LEQ, normalized.get(0).getRelationship());
    }

    // ---------- offsets / width / height ----------

    @Test
    public void testGetSlackVariableOffset_computesCorrectly() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        int expected = tableau.getNumObjectiveFunctions() + tableau.getNumDecisionVariables();
        assertEquals(expected, tableau.getSlackVariableOffset());
    }

    @Test
    public void testGetArtificialVariableOffset_computesCorrectly() {
        SimplexTableau tableau = buildGeqTableau();
        int expected = tableau.getNumObjectiveFunctions() + tableau.getNumDecisionVariables()
                + tableau.getNumSlackVariables();
        assertEquals(expected, tableau.getArtificialVariableOffset());
    }

    @Test
    public void testGetRhsOffset_isLastColumn() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        assertEquals(tableau.getWidth() - 1, tableau.getRhsOffset());
    }

    @Test
    public void testGetWidthAndHeight_matchesData() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        double[][] data = tableau.getData();
        assertEquals(data.length, tableau.getHeight());
        assertEquals(data[0].length, tableau.getWidth());
    }

    // ---------- getEntry / setEntry ----------

    @Test
    public void testGetSetEntry_setsAndRetrievesValue() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        tableau.setEntry(0, 0, 99.0);
        assertEquals(99.0, tableau.getEntry(0, 0), EPSILON);
    }

    // ---------- divideRow / subtractRow ----------

    @Test
    public void testDivideRow_dividesAllEntriesInRow() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        double originalValue = tableau.getEntry(1, 0);
        tableau.divideRow(1, 2.0);
        assertEquals(originalValue / 2.0, tableau.getEntry(1, 0), EPSILON);
    }

    @Test
    public void testSubtractRow_subtractsMultipleOfRow() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        double minuendBefore = tableau.getEntry(0, 0);
        double subtrahendValue = tableau.getEntry(1, 0);
        tableau.subtractRow(0, 1, 1.0);
        assertEquals(minuendBefore - subtrahendValue, tableau.getEntry(0, 0), EPSILON);
    }

    // ---------- discardArtificialVariables ----------

    @Test
    public void testDiscardArtificialVariables_noArtificialVariables_noChange() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        int widthBefore = tableau.getWidth();
        int heightBefore = tableau.getHeight();
        tableau.discardArtificialVariables();
        assertEquals(widthBefore, tableau.getWidth());
        assertEquals(heightBefore, tableau.getHeight());
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testDiscardArtificialVariables_withArtificialVariables_removesThem() {
        SimplexTableau tableau = buildGeqTableau();
        int widthBefore = tableau.getWidth();
        int heightBefore = tableau.getHeight();
        int numArtificialBefore = tableau.getNumArtificialVariables();
        assertTrue(numArtificialBefore > 0);

        tableau.discardArtificialVariables();

        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(widthBefore - numArtificialBefore - 1, tableau.getWidth());
        assertEquals(heightBefore - 1, tableau.getHeight());
    }

    // ---------- getSolution ----------

    @Test
    public void testGetSolution_returnsCorrectLengthPoint() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(tableau.getOriginalNumDecisionVariables(), solution.getPoint().length);
    }

    @Test
    public void testGetSolution_withNonNegativeFalse_returnsCorrectLengthPoint() {
        SimplexTableau tableau = buildNonNegativeFalseTableau();
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(tableau.getOriginalNumDecisionVariables(), solution.getPoint().length);
    }

    // ---------- getNumSlackVariables / getNumArtificialVariables / getNumDecisionVariables ----------

    @Test
    public void testGetNumSlackVariables_returnsCorrectValue() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        assertEquals(1, tableau.getNumSlackVariables());
    }

    @Test
    public void testGetNumArtificialVariables_returnsCorrectValue() {
        SimplexTableau tableau = buildGeqTableau();
        assertEquals(1, tableau.getNumArtificialVariables());
    }

    @Test
    public void testGetOriginalNumDecisionVariables_restrictTrue_equalsNumDecisionVariables() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        assertEquals(tableau.getNumDecisionVariables(), tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testGetOriginalNumDecisionVariables_restrictFalse_isOneLess() {
        SimplexTableau tableau = buildNonNegativeFalseTableau();
        assertEquals(tableau.getNumDecisionVariables() - 1, tableau.getOriginalNumDecisionVariables());
    }

    // ---------- getData ----------

    @Test
    public void testGetData_returnsNonNullMatrix() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        double[][] data = tableau.getData();
        assertNotNull(data);
        assertEquals(tableau.getHeight(), data.length);
    }

    // ---------- createTableau (protected, direct call) ----------

    @Test
    public void testCreateTableau_maximizeTrue_returnsMatrixOfExpectedSize() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        double[][] matrix = tableau.createTableau(true);
        assertNotNull(matrix);
        assertEquals(tableau.getHeight(), matrix.length);
        assertEquals(tableau.getWidth(), matrix[0].length);
    }

    @Test
    public void testCreateTableau_maximizeFalse_returnsMatrixOfExpectedSize() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        double[][] matrix = tableau.createTableau(false);
        assertNotNull(matrix);
        assertEquals(tableau.getHeight(), matrix.length);
    }

    // ---------- equals ----------

    @Test
    public void testEquals_sameObjectReference_returnsTrue() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        assertTrue(tableau.equals(tableau));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        assertFalse(tableau.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        assertFalse(tableau.equals("not a tableau"));
    }

    @Test
    public void testEquals_equivalentTableaus_returnsTrue() {
        SimplexTableau tableau1 = buildLeqOnlyTableau();
        SimplexTableau tableau2 = buildLeqOnlyTableau();
        assertTrue(tableau1.equals(tableau2));
    }

    @Test
    public void testEquals_differentEpsilon_returnsFalse() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, 4));
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, EPSILON);
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1.0e-3);
        assertFalse(tableau1.equals(tableau2));
    }

    @Test
    public void testEquals_differentRestrictFlag_returnsFalse() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[]{1}, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.LEQ, 5));
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, EPSILON);
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, EPSILON);
        assertFalse(tableau1.equals(tableau2));
    }

    // ---------- hashCode ----------

    @Test
    public void testHashCode_equalObjects_haveSameHashCode() {
        SimplexTableau tableau1 = buildLeqOnlyTableau();
        SimplexTableau tableau2 = buildLeqOnlyTableau();
        assertEquals(tableau1.hashCode(), tableau2.hashCode());
    }

    @Test
    public void testHashCode_isConsistent() {
        SimplexTableau tableau = buildLeqOnlyTableau();
        int hash1 = tableau.hashCode();
        int hash2 = tableau.hashCode();
        assertEquals(hash1, hash2);
    }

    // ---------- serialization ----------

    @Test
    public void testSerialization_writeAndReadObject_preservesEquality() throws Exception {
        SimplexTableau original = buildLeqOnlyTableau();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();
        ois.close();

        assertTrue(original.equals(deserialized));
        assertEquals(original.getWidth(), deserialized.getWidth());
        assertEquals(original.getHeight(), deserialized.getHeight());
    }

    @Test
    public void testSerialization_withArtificialVariables_preservesData() throws Exception {
        SimplexTableau original = buildGeqTableau();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();
        ois.close();

        assertEquals(original.getNumArtificialVariables(), deserialized.getNumArtificialVariables());
        assertEquals(original.getData().length, deserialized.getData().length);
    }
}
