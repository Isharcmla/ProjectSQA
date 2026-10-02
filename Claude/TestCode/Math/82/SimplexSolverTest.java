import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class SimplexSolverTest {

    private SimplexSolver solver;

    @Before
    public void setUp() {
        solver = new SimplexSolver();
    }

    // ---------------------------------------------------------------
    // Constructor tests
    // ---------------------------------------------------------------

    @Test
    public void testConstructor_defaultEpsilon_usesDefaultValue() {
        SimplexSolver defaultSolver = new SimplexSolver();
        Assert.assertEquals(1.0e-6, defaultSolver.epsilon, 0d);
    }

    @Test
    public void testConstructor_customEpsilon_usesProvidedValue() {
        SimplexSolver customSolver = new SimplexSolver(1.0e-3);
        Assert.assertEquals(1.0e-3, customSolver.epsilon, 0d);
    }

    // ---------------------------------------------------------------
    // Normal / typical input tests via optimize() (public API)
    // ---------------------------------------------------------------

    @Test
    public void testOptimize_simpleMaximization_returnsCorrectSolution() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] {1, 3}, Relationship.LEQ, 6));

        RealPointValuePair result = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertEquals(9.0, result.getValue(), 1.0e-6);
        Assert.assertArrayEquals(new double[] {3.0, 1.0}, result.getPoint(), 1.0e-6);
    }

    @Test
    public void testOptimize_simpleMinimization_returnsCorrectSolution() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.GEQ, 2));

        RealPointValuePair result = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertEquals(2.0, result.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_withEqualityConstraintPhase1_returnsCorrectSolution() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.EQ, 4));

        RealPointValuePair result = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertEquals(4.0, result.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_withCustomEpsilon_returnsCorrectSolution() throws OptimizationException {
        SimplexSolver customSolver = new SimplexSolver(1.0e-4);
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] {1, 3}, Relationship.LEQ, 6));

        RealPointValuePair result = customSolver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertEquals(9.0, result.getValue(), 1.0e-6);
    }

    // ---------------------------------------------------------------
    // Edge cases
    // ---------------------------------------------------------------

    @Test
    public void testOptimize_zeroObjectiveCoefficients_returnsZeroValue() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {0, 0}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 10));

        RealPointValuePair result = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertEquals(0.0, result.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_negativeCoefficients_returnsCorrectSolution() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {-1, -1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));

        RealPointValuePair result = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertEquals(0.0, result.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_restrictToNonNegativeFalse_returnsCorrectSolution() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 10));
        constraints.add(new LinearConstraint(new double[] {0, 1}, Relationship.LEQ, 10));
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.GEQ, -5));
        constraints.add(new LinearConstraint(new double[] {0, 1}, Relationship.GEQ, -5));

        RealPointValuePair result = solver.optimize(f, constraints, GoalType.MINIMIZE, false);

        Assert.assertEquals(-10.0, result.getValue(), 1.0e-6);
    }

    // ---------------------------------------------------------------
    // Exception cases
    // ---------------------------------------------------------------

    @Test(expected = UnboundedSolutionException.class)
    public void testOptimize_unboundedProblem_throwsUnboundedSolutionException() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.GEQ, 0));

        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test(expected = NoFeasibleSolutionException.class)
    public void testOptimize_infeasibleProblem_throwsNoFeasibleSolutionException() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.GEQ, 5));
        constraints.add(new LinearConstraint(new double[] {1, 0}, Relationship.LEQ, 2));

        solver.optimize(f, constraints, GoalType.MINIMIZE, true);
    }

    // ---------------------------------------------------------------
    // isOptimal() public method tests (direct tableau manipulation)
    // ---------------------------------------------------------------

    @Test
    public void testIsOptimal_initialUnsolvedTableau_returnsFalse() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] {1, 3}, Relationship.LEQ, 6));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon);

        boolean result = solver.isOptimal(tableau);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsOptimal_afterFullSolve_returnsTrue() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] {1, 3}, Relationship.LEQ, 6));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon);

        solver.solvePhase1(tableau);
        tableau.discardArtificialVariables();
        while (!solver.isOptimal(tableau)) {
            solver.doIteration(tableau);
        }

        Assert.assertTrue(solver.isOptimal(tableau));
    }

    @Test
    public void testSolvePhase1_noArtificialVariables_returnsImmediately() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {1, 1}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon);
        Assert.assertEquals(0, tableau.getNumArtificialVariables());

        // Should return without throwing since there are no artificial variables
        solver.solvePhase1(tableau);
    }

    @Test
    public void testDoIteration_singleIteration_updatesTableauWithoutException() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] {2, 3}, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] {1, 1}, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] {1, 3}, Relationship.LEQ, 6));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, solver.epsilon);

        // Should not throw, as this problem has a bounded feasible solution
        solver.doIteration(tableau);
    }
}
