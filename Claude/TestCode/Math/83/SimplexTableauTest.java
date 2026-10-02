import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;

public class SimplexTableauTest {

    private LinearObjectiveFunction simpleObjective;
    private Collection<LinearConstraint> simpleConstraints;
    private SimplexTableau simpleTableau;

    @Before
    public void setUp() {
        // Simple LP: maximize x1 + x2, s.t. x1 <= 4, x2 <= 3, restrict to non-negative
        simpleObjective = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        simpleConstraints = new ArrayList<LinearConstraint>();
        simpleConstraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        simpleConstraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
        simpleTableau = new SimplexTableau(simpleObjective, simpleConstraints,
                GoalType.MAXIMIZE, true, 1.0e-6);
    }

    // ---------- Normal / Typical cases ----------

    @Test
    public void testGetNumVariables_typicalInput_returnsCorrectCount() {
        assertEquals(2, simpleTableau.getNumVariables());
    }

    @Test
    public void testConstructor_simpleLEQConstraints_createsValidTableau() {
        // numDecisionVariables = 2 (restrictToNonNegative = true)
        assertEquals(2, simpleTableau.getNumDecisionVariables());
        // numSlackVariables = 2 (two LEQ constraints)
        assertEquals(2, simpleTableau.getNumSlackVariables());
        // numArtificialVariables = 0 (no EQ/GEQ constraints)
        assertEquals(0, simpleTableau.getNumArtificialVariables());
        // width = numDecision + numSlack + numArtificial + numObjFunctions + 1
        assertEquals(6, simpleTableau.getWidth());
        // height = constraints.size() + numObjFunctions
        assertEquals(3, simpleTableau.getHeight());
    }

    @Test
    public void testGetSlackVariableOffset_typicalInput_returnsCorrectOffset() {
        assertEquals(3, simpleTableau.getSlackVariableOffset());
    }

    @Test
    public void testGetArtificialVariableOffset_typicalInput_returnsCorrectOffset() {
        assertEquals(5, simpleTableau.getArtificialVariableOffset());
    }

    @Test
    public void testGetRhsOffset_typicalInput_returnsCorrectOffset() {
        assertEquals(5, simpleTableau.getRhsOffset());
    }

    @Test
    public void testGetOriginalNumDecisionVariables_restrictToNonNegativeTrue_returnsSameAsNumDecisionVariables() {
        assertEquals(2, simpleTableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testGetEntry_setEntry_typicalInput_worksCorrectly() {
        double original = simpleTableau.getEntry(1, 1);
        simpleTableau.setEntry(1, 1, 99.0);
        assertEquals(99.0, simpleTableau.getEntry(1, 1), 1e-9);
        // restore
        simpleTableau.setEntry(1, 1, original);
    }

    @Test
    public void testGetData_typicalInput_returnsCorrectDimensions() {
        double[][] data = simpleTableau.getData();
        assertEquals(simpleTableau.getHeight(), data.length);
        assertEquals(simpleTableau.getWidth(), data[0].length);
    }

    @Test
    public void testGetNormalizedConstraints_typicalInput_returnsCorrectSize() {
        assertEquals(2, simpleTableau.getNormalizedConstraints().size());
    }

    @Test
    public void testGetSolution_simpleLEQProblem_returnsCorrectValues() {
        RealPointValuePair solution = simpleTableau.getSolution();
        double[] point = solution.getPoint();
        assertEquals(2, point.length);
        assertEquals(4.0, point[0], 1e-6);
        assertEquals(3.0, point[1], 1e-6);
        assertEquals(7.0, solution.getValue(), 1e-6);
    }

    @Test
    public void testDivideRow_typicalInput_dividesCorrectly() {
        double before = simpleTableau.getEntry(1, 5);
        simpleTableau.divideRow(1, 2.0);
        assertEquals(before / 2.0, simpleTableau.getEntry(1, 5), 1e-9);
    }

    @Test
    public void testSubtractRow_typicalInput_subtractsCorrectly() {
        double minuendBefore = simpleTableau.getEntry(0, 5);
        double subtrahendValue = simpleTableau.getEntry(1, 5);
        simpleTableau.subtractRow(0, 1, 1.0);
        assertEquals(minuendBefore - subtrahendValue, simpleTableau.getEntry(0, 5), 1e-9);
    }

    @Test
    public void testDiscardArtificialVariables_noArtificialVariables_returnsImmediately() {
        int widthBefore = simpleTableau.getWidth();
        int heightBefore = simpleTableau.getHeight();
        simpleTableau.discardArtificialVariables();
        // no change since numArtificialVariables == 0
        assertEquals(widthBefore, simpleTableau.getWidth());
        assertEquals(heightBefore, simpleTableau.getHeight());
        assertEquals(0, simpleTableau.getNumArtificialVariables());
    }

    // ---------- Edge cases ----------

    @Test
    public void testConstructor_withGEQAndEQConstraints_createsArtificialVariables() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 10));
        constraints.add(new LinearConstraint(new double[]{1, -1}, Relationship.EQ, 2));

        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MINIMIZE, true, 1.0e-6);

        assertEquals(1, tableau.getNumSlackVariables());
        assertEquals(2, tableau.getNumArtificialVariables());
        assertEquals(2, tableau.getNumDecisionVariables());
    }

    @Test
    public void testDiscardArtificialVariables_withArtificialVariables_removesThem() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 10));
        constraints.add(new LinearConstraint(new double[]{1, -1}, Relationship.EQ, 2));

        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MINIMIZE, true, 1.0e-6);

        int widthBefore = tableau.getWidth();
        int heightBefore = tableau.getHeight();

        tableau.discardArtificialVariables();

        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(widthBefore - 2 - 1, tableau.getWidth());
        assertEquals(heightBefore - 1, tableau.getHeight());
    }

    @Test
    public void testConstructor_restrictToNonNegativeFalse_includesExtraDecisionVariable() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.LEQ, 10));

        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, false, 1.0e-6);

        // numDecisionVariables = getNumVariables() + 1 (extra x- variable)
        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(1, tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testGetSolution_restrictToNonNegativeFalse_returnsValidDimension() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.LEQ, 10));

        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, false, 1.0e-6);

        RealPointValuePair solution = tableau.getSolution();
        assertEquals(1, solution.getPoint().length);
    }

    @Test
    public void testGetNormalizedConstraints_negativeValue_flipsRelationshipAndSign() {
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.LEQ, -5));
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{1, 1}, 0);

        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, true, 1.0e-6);

        java.util.List<LinearConstraint> normalized = tableau.getNormalizedConstraints();
        assertEquals(1, normalized.size());
        LinearConstraint normalizedConstraint = normalized.get(0);
        assertEquals(Relationship.GEQ, normalizedConstraint.getRelationship());
        assertEquals(5.0, normalizedConstraint.getValue(), 1e-9);
    }

    @Test
    public void testConstructor_emptyConstraints_createsMinimalTableau() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();

        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getHeight()); // only objective row
    }

    @Test
    public void testEquals_sameInstance_returnsTrue() {
        assertTrue(simpleTableau.equals(simpleTableau));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        assertFalse(simpleTableau.equals(null));
    }

    @Test
    public void testEquals_differentClass_returnsFalse() {
        assertFalse(simpleTableau.equals("not a tableau"));
    }

    @Test
    public void testEquals_equivalentTableau_returnsTrue() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));

        SimplexTableau other = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertTrue(simpleTableau.equals(other));
    }

    @Test
    public void testEquals_differentTableau_returnsFalse() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{2, 2}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 10));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 20));

        SimplexTableau other = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertFalse(simpleTableau.equals(other));
    }

    @Test
    public void testHashCode_equivalentTableau_returnsSameHashCode() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));

        SimplexTableau other = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertEquals(simpleTableau.hashCode(), other.hashCode());
    }

    @Test
    public void testHashCode_callWithoutException_returnsValue() {
        // just ensure hashCode executes without throwing
        int hash = simpleTableau.hashCode();
        assertTrue(hash == simpleTableau.hashCode());
    }

    @Test
    public void testSerialization_roundTrip_restoresTableau() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(simpleTableau);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();
        ois.close();

        assertEquals(simpleTableau.getWidth(), deserialized.getWidth());
        assertEquals(simpleTableau.getHeight(), deserialized.getHeight());
        assertEquals(simpleTableau.getNumDecisionVariables(), deserialized.getNumDecisionVariables());
        assertEquals(simpleTableau.getNumSlackVariables(), deserialized.getNumSlackVariables());
        assertEquals(simpleTableau.getNumArtificialVariables(), deserialized.getNumArtificialVariables());

        for (int i = 0; i < simpleTableau.getHeight(); i++) {
            for (int j = 0; j < simpleTableau.getWidth(); j++) {
                assertEquals(simpleTableau.getEntry(i, j), deserialized.getEntry(i, j), 1e-9);
            }
        }
    }

    @Test
    public void testGetNegativeDecisionVariableOffset_typicalInput_returnsCorrectOffset() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1}, Relationship.LEQ, 10));

        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, false, 1.0e-6);

        int expectedOffset = 1 /* numObjFunctions */ + tableau.getOriginalNumDecisionVariables();
        assertEquals(expectedOffset, tableau.getNegativeDecisionVariableOffset());
    }

    @Test
    public void testMinimizeGoalType_typicalInput_createsCorrectTableau() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));

        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MINIMIZE, true, 1.0e-6);

        assertEquals(2, tableau.getNumDecisionVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testCreateTableau_withEQConstraintOnly_createsArtificialVariable() {
        LinearObjectiveFunction objective = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 5));

        SimplexTableau tableau = new SimplexTableau(objective, constraints,
                GoalType.MAXIMIZE, true, 1.0e-6);

        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(0, tableau.getNumSlackVariables());
    }

    // ---------- Exception cases ----------

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullObjectiveFunction_throwsNullPointerException() {
        new SimplexTableau(null, simpleConstraints, GoalType.MAXIMIZE, true, 1.0e-6);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullConstraints_throwsNullPointerException() {
        new SimplexTableau(simpleObjective, null, GoalType.MAXIMIZE, true, 1.0e-6);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructor_nullGoalType_throwsNullPointerException() {
        new SimplexTableau(simpleObjective, simpleConstraints, null, true, 1.0e-6);
    }

    @Test
    public void testGetEntry_outOfBoundsRow_throwsException() {
        boolean caught = false;
        try {
            simpleTableau.getEntry(999, 0);
        } catch (Exception e) {
            caught = true;
        }
        assertTrue(caught);
    }

    @Test
    public void testGetEntry_outOfBoundsColumn_throwsException() {
        boolean caught = false;
        try {
            simpleTableau.getEntry(0, 999);
        } catch (Exception e) {
            caught = true;
        }
        assertTrue(caught);
    }
}
