package org.apache.commons.math.optimization.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.Collection;
import java.io.*;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;

public class SimplexTableauTest {

    private LinearObjectiveFunction f;
    private Collection<LinearConstraint> constraints;

    @Before
    public void setUp() {
        f = new LinearObjectiveFunction(new double[]{-15, -10}, 0);
        constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.LEQ, 3));
    }

    @Test
    public void testConstructor_typicalInput_createsTableau() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertNotNull(tableau);
        assertEquals(2, tableau.getNumDecisionVariables());
    }

    @Test
    public void testGetNumVariables_returnsCorrectCount() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumVariables());
    }

    @Test
    public void testGetNormalizedConstraints_positiveValue_unchanged() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNormalizedConstraints().size());
    }

    @Test
    public void testGetNormalizedConstraints_negativeValue_normalized() {
        Collection<LinearConstraint> negConstraints = new ArrayList<LinearConstraint>();
        negConstraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, -2));
        SimplexTableau tableau = new SimplexTableau(f, negConstraints, GoalType.MAXIMIZE, true, 1e-6);
        LinearConstraint normalized = tableau.getNormalizedConstraints().get(0);
        assertTrue(normalized.getValue() >= 0);
    }

    @Test
    public void testGetNormalizedConstraints_negativeValueEqRelationship_staysEq() {
        Collection<LinearConstraint> negConstraints = new ArrayList<LinearConstraint>();
        negConstraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, -3));
        SimplexTableau tableau = new SimplexTableau(f, negConstraints, GoalType.MAXIMIZE, true, 1e-6);
        LinearConstraint normalized = tableau.getNormalizedConstraints().get(0);
        assertEquals(Relationship.EQ, normalized.getRelationship());
        assertEquals(3.0, normalized.getValue(), 1e-9);
    }

    @Test
    public void testConstructor_withEqConstraint_hasArtificialVariables() {
        Collection<LinearConstraint> eqConstraints = new ArrayList<LinearConstraint>();
        eqConstraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, eqConstraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(1, tableau.getNumArtificialVariables());
    }

    @Test
    public void testConstructor_withGeqConstraint_hasArtificialAndSlack() {
        Collection<LinearConstraint> geqConstraints = new ArrayList<LinearConstraint>();
        geqConstraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.GEQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, geqConstraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(1, tableau.getNumArtificialVariables());
        assertEquals(1, tableau.getNumSlackVariables());
    }

    @Test
    public void testConstructor_restrictToNonNegativeFalse_extraDecisionVariable() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertEquals(3, tableau.getNumDecisionVariables());
        assertEquals(2, tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testConstructor_minimizeGoal_createsTableau() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, 1e-6);
        assertNotNull(tableau);
    }

    @Test
    public void testConstructor_restrictToNonNegativeTrue_noExtraVariable() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(tableau.getNumDecisionVariables(), tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testDiscardArtificialVariables_withArtificialVars_removesThem() {
        Collection<LinearConstraint> eqConstraints = new ArrayList<LinearConstraint>();
        eqConstraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, eqConstraints, GoalType.MAXIMIZE, true, 1e-6);
        tableau.discardArtificialVariables();
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testDiscardArtificialVariables_noArtificialVars_noChange() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        int widthBefore = tableau.getWidth();
        tableau.discardArtificialVariables();
        assertEquals(widthBefore, tableau.getWidth());
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testGetSolution_returnsValidPair() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
    }

    @Test
    public void testGetSolution_withRestrictToNonNegativeFalse_handlesNegativeVariable() {
        LinearObjectiveFunction negF = new LinearObjectiveFunction(new double[]{1, 1}, 0);
        Collection<LinearConstraint> negConstraints = new ArrayList<LinearConstraint>();
        negConstraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, -5));
        SimplexTableau tableau = new SimplexTableau(negF, negConstraints, GoalType.MINIMIZE, false, 1e-6);
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution);
        assertEquals(2, solution.getPoint().length);
    }

    @Test
    public void testDivideRow_dividesCorrectly() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        double originalValue = tableau.getEntry(2, 0);
        tableau.divideRow(2, 2.0);
        assertEquals(originalValue / 2.0, tableau.getEntry(2, 0), 1e-9);
    }

    @Test
    public void testSubtractRow_subtractsCorrectly() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        double row0Val = tableau.getEntry(0, 0);
        double row1Val = tableau.getEntry(1, 0);
        tableau.subtractRow(0, 1, 1.0);
        assertEquals(row0Val - row1Val, tableau.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testGetWidth_returnsCorrectWidth() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertTrue(tableau.getWidth() > 0);
    }

    @Test
    public void testGetHeight_returnsCorrectHeight() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertTrue(tableau.getHeight() > 0);
    }

    @Test
    public void testGetSetEntry_setsAndGetsCorrectly() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        tableau.setEntry(0, 0, 5.0);
        assertEquals(5.0, tableau.getEntry(0, 0), 1e-9);
    }

    @Test
    public void testGetSetEntry_zeroValue_setsCorrectly() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        tableau.setEntry(1, 1, 0.0);
        assertEquals(0.0, tableau.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testGetSetEntry_negativeValue_setsCorrectly() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        tableau.setEntry(1, 1, -5.0);
        assertEquals(-5.0, tableau.getEntry(1, 1), 1e-9);
    }

    @Test
    public void testGetSlackVariableOffset_returnsCorrectOffset() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        int offset = tableau.getSlackVariableOffset();
        assertTrue(offset > 0);
    }

    @Test
    public void testGetArtificialVariableOffset_returnsCorrectOffset() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        int offset = tableau.getArtificialVariableOffset();
        assertTrue(offset >= tableau.getSlackVariableOffset());
    }

    @Test
    public void testGetRhsOffset_returnsWidthMinus1() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(tableau.getWidth() - 1, tableau.getRhsOffset());
    }

    @Test
    public void testGetNumDecisionVariables_restrictTrue_returnsOriginal() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumDecisionVariables());
    }

    @Test
    public void testGetOriginalNumDecisionVariables_restrictFalse_returnsMinusOne() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertEquals(tableau.getNumDecisionVariables() - 1, tableau.getOriginalNumDecisionVariables());
    }

    @Test
    public void testGetNumSlackVariables_withLeqConstraints_returnsCount() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumSlackVariables());
    }

    @Test
    public void testGetNumArtificialVariables_noEqGeq_returnsZero() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testGetData_returnsMatrixData() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        double[][] data = tableau.getData();
        assertNotNull(data);
        assertEquals(tableau.getHeight(), data.length);
        assertEquals(tableau.getWidth(), data[0].length);
    }

    @Test
    public void testEquals_sameObject_returnsTrue() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertTrue(tableau.equals(tableau));
    }

    @Test
    public void testEquals_null_returnsFalse() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertFalse(tableau.equals(null));
    }

    @Test
    public void testEquals_differentType_returnsFalse() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertFalse(tableau.equals("not a tableau"));
    }

    @Test
    public void testEquals_equalTableaus_returnsTrue() {
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertTrue(tableau1.equals(tableau2));
    }

    @Test
    public void testEquals_differentRestrictToNonNegative_returnsFalse() {
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, false, 1e-6);
        assertFalse(tableau1.equals(tableau2));
    }

    @Test
    public void testEquals_differentEpsilon_returnsFalse() {
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-5);
        assertFalse(tableau1.equals(tableau2));
    }

    @Test
    public void testEquals_differentConstraints_returnsFalse() {
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        Collection<LinearConstraint> otherConstraints = new ArrayList<LinearConstraint>();
        otherConstraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 10));
        SimplexTableau tableau2 = new SimplexTableau(f, otherConstraints, GoalType.MAXIMIZE, true, 1e-6);
        assertFalse(tableau1.equals(tableau2));
    }

    @Test
    public void testHashCode_sameObject_sameHashCode() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(tableau.hashCode(), tableau.hashCode());
    }

    @Test
    public void testHashCode_equalObjects_sameHashCode() {
        SimplexTableau tableau1 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        SimplexTableau tableau2 = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(tableau1.hashCode(), tableau2.hashCode());
    }

    @Test
    public void testSerialization_roundTrip_preservesData() throws Exception {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(tableau);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        SimplexTableau deserialized = (SimplexTableau) ois.readObject();
        ois.close();

        assertEquals(tableau, deserialized);
    }

    @Test
    public void testConstructor_withEqGeqLeqMixed_correctCounts() {
        Collection<LinearConstraint> mixedConstraints = new ArrayList<LinearConstraint>();
        mixedConstraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        mixedConstraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, 1));
        mixedConstraints.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, mixedConstraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumArtificialVariables());
        assertEquals(2, tableau.getNumSlackVariables());
    }

    @Test
    public void testConstructor_negativeConstraintValue_normalizedCorrectly() {
        Collection<LinearConstraint> negConstraints = new ArrayList<LinearConstraint>();
        negConstraints.add(new LinearConstraint(new double[]{1, -1}, Relationship.LEQ, -5));
        SimplexTableau tableau = new SimplexTableau(f, negConstraints, GoalType.MAXIMIZE, true, 1e-6);
        assertNotNull(tableau);
    }

    @Test
    public void testConstructor_minimizeWithRestrictFalse_createsCorrectTableau() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, false, 1e-6);
        assertEquals(3, tableau.getNumDecisionVariables());
    }

    @Test
    public void testGetBasicRow_viaGetSolution_worksCorrectly() {
        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, 1e-6);
        RealPointValuePair solution = tableau.getSolution();
        assertNotNull(solution.getPoint());
    }

    @Test
    public void testConstructor_emptyConstraints_noSlackOrArtificial() {
        Collection<LinearConstraint> emptyConstraints = new ArrayList<LinearConstraint>();
        SimplexTableau tableau = new SimplexTableau(f, emptyConstraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(0, tableau.getNumSlackVariables());
        assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testConstructor_zeroConstantTerm_handledCorrectly() {
        LinearObjectiveFunction zeroF = new LinearObjectiveFunction(new double[]{1, 2}, 0.0);
        SimplexTableau tableau = new SimplexTableau(zeroF, constraints, GoalType.MAXIMIZE, true, 1e-6);
        assertNotNull(tableau);
    }

    @Test
    public void testConstructor_multipleEqConstraints_artificialCountCorrect() {
        Collection<LinearConstraint> eqConstraints = new ArrayList<LinearConstraint>();
        eqConstraints.add(new LinearConstraint(new double[]{1, 0}, Relationship.EQ, 2));
        eqConstraints.add(new LinearConstraint(new double[]{0, 1}, Relationship.EQ, 3));
        SimplexTableau tableau = new SimplexTableau(f, eqConstraints, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(2, tableau.getNumArtificialVariables());
    }

    @Test
    public void testGetNormalizedConstraints_multipleConstraints_allReturned() {
        Collection<LinearConstraint> multi = new ArrayList<LinearConstraint>();
        multi.add(new LinearConstraint(new double[]{1, 0}, Relationship.LEQ, 2));
        multi.add(new LinearConstraint(new double[]{0, 1}, Relationship.GEQ, -3));
        multi.add(new LinearConstraint(new double[]{1, 1}, Relationship.EQ, 4));
        SimplexTableau tableau = new SimplexTableau(f, multi, GoalType.MAXIMIZE, true, 1e-6);
        assertEquals(3, tableau.getNormalizedConstraints().size());
    }
}
