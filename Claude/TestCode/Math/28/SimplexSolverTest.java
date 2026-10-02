import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.apache.commons.math3.optimization.linear.LinearConstraint;
import org.apache.commons.math3.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math3.optimization.linear.Relationship;
import org.apache.commons.math3.optimization.linear.SimplexSolver;
import org.apache.commons.math3.optimization.linear.UnboundedSolutionException;
import org.apache.commons.math3.optimization.linear.NoFeasibleSolutionException;

public class SimplexSolverTest {

    private SimplexSolver solver;

    @Before
    public void setUp() {
        solver = new SimplexSolver();
    }

    @Test
    public void testDefaultConstructor_normalUsage_createsSolver() {
        SimplexSolver s = new SimplexSolver();
        assertNotNull(s);
    }

    @Test
    public void testParameterizedConstructor_customValues_createsSolver() {
        SimplexSolver s = new SimplexSolver(1.0e-8, 5);
        assertNotNull(s);
    }

    @Test
    public void testOptimize_simpleMaximizationProblem_returnsCorrectSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 2 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 4));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);

        assertNotNull(solution);
        assertEquals(8.0, solution.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_simpleMinimizationProblem_returnsCorrectSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 1));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, 1));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        assertNotNull(solution);
        assertEquals(2.0, solution.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_withMultipleConstraints_returnsOptimalSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 15, 10 }, 7);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 3));
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 4));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);

        assertNotNull(solution);
        assertEquals(2.0, solution.getPoint()[0], 1.0e-6);
        assertEquals(2.0, solution.getPoint()[1], 1.0e-6);
        assertEquals(57.0, solution.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_restrictToNonNegativeFalse_allowsNegativeValues() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.EQ, -1));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.EQ, -1));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, false);

        assertNotNull(solution);
        assertEquals(-1.0, solution.getPoint()[0], 1.0e-6);
        assertEquals(-1.0, solution.getPoint()[1], 1.0e-6);
    }

    @Test(expected = UnboundedSolutionException.class)
    public void testOptimize_unboundedProblem_throwsUnboundedSolutionException() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, 0));

        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test(expected = NoFeasibleSolutionException.class)
    public void testOptimize_infeasibleProblem_throwsNoFeasibleSolutionException() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.EQ, 1));
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.EQ, 2));

        solver.optimize(f, constraints, GoalType.MINIMIZE, true);
    }

    @Test
    public void testOptimize_withZeroCoefficients_returnsValidSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 0, 0 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 10));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertEquals(0.0, solution.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_boundaryValueConstraint_returnsCorrectSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 0));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertEquals(0.0, solution.getPoint()[0], 1.0e-6);
        assertEquals(0.0, solution.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_withLessThanEqualConstraints_returnsCorrectSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 2 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 2, 1 }, Relationship.LEQ, 18));
        constraints.add(new LinearConstraint(new double[] { 2, 3 }, Relationship.LEQ, 42));
        constraints.add(new LinearConstraint(new double[] { 3, 1 }, Relationship.LEQ, 24));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertEquals(41.0, solution.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_withCustomEpsilonAndUlps_returnsSolution() {
        SimplexSolver customSolver = new SimplexSolver(1.0e-8, 5);
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 10));

        PointValuePair solution = customSolver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertEquals(10.0, solution.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_degenerateTieInMinRatioTest_returnsSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0, 0 }, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[] { 0, 1, 0 }, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[] { 0, 0, 1 }, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[] { 1, 1, 0 }, Relationship.LEQ, 5));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertTrue(solution.getValue() >= 0);
    }

    @Test
    public void testOptimize_multipleEqualityConstraints_returnsFeasibleSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 3, -1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1, 1 }, Relationship.EQ, 4));
        constraints.add(new LinearConstraint(new double[] { 2, -1, 1 }, Relationship.EQ, 2));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
    }

    @Test
    public void testOptimize_singleVariableProblem_returnsExpectedResult() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 5 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 10));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        assertNotNull(solution);
        assertEquals(10.0, solution.getPoint()[0], 1.0e-6);
        assertEquals(50.0, solution.getValue(), 1.0e-6);
    }

    @Test
    public void testOptimize_withGreaterThanOrEqualConstraints_returnsCorrectSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 6));
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.LEQ, 4));

        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        assertNotNull(solution);
        assertEquals(6.0, solution.getValue(), 1.0e-6);
    }
}
