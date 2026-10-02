package org.apache.commons.math.optimization.linear;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.MaxIterationsExceededException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class SimplexSolverTest {

    private static final double DEFAULT_EPSILON = 1.0e-6;

    @Test
    public void testConstructor_default() {
        SimplexSolver solver = new SimplexSolver();
        Assert.assertEquals(DEFAULT_EPSILON, solver.epsilon, 1e-15);
        Assert.assertEquals(100, solver.getMaxIterations());
    }

    @Test
    public void testConstructor_customEpsilon() {
        double customEpsilon = 1.0e-4;
        SimplexSolver solver = new SimplexSolver(customEpsilon);
        Assert.assertEquals(customEpsilon, solver.epsilon, 1e-15);
    }

    @Test
    public void testOptimize_maximizeSimpleBounded() throws OptimizationException {
        // Maximize z = 3x + 5y
        // Subject to:
        // x + y <= 4
        // x + 3y <= 6
        // x, y >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 5 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 1, 3 }, Relationship.LEQ, 6));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(3.0, solution.getPoint()[0], 1e-6);
        Assert.assertEquals(1.0, solution.getPoint()[1], 1e-6);
        Assert.assertEquals(14.0, solution.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_minimizeSimpleBounded() throws OptimizationException {
        // Minimize z = -2x + y
        // Subject to:
        // x + 2y <= 6
        // x <= 4
        // x, y >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 6));
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(4.0, solution.getPoint()[0], 1e-6);
        Assert.assertEquals(0.0, solution.getPoint()[1], 1e-6);
        Assert.assertEquals(-8.0, solution.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_withConstantInObjective() throws OptimizationException {
        // Maximize z = 2x + 10 (with constant = 10)
        // Subject to: x <= 5, x >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2 }, 10);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1 }, Relationship.LEQ, 5));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(5.0, solution.getPoint()[0], 1e-6);
        Assert.assertEquals(20.0, solution.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_twoPhaseFeasibleWithEqualityAndGeq() throws OptimizationException {
        // Minimize z = x + y
        // Subject to:
        // x + 2y >= 3
        // 2x + y = 3
        // x, y >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.GEQ, 3));
        constraints.add(new LinearConstraint(new double[] { 2, 1 }, Relationship.EQ, 3));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(1.0, solution.getPoint()[0], 1e-6);
        Assert.assertEquals(1.0, solution.getPoint()[1], 1e-6);
        Assert.assertEquals(2.0, solution.getValue(), 1e-6);
    }

    @Test(expected = NoFeasibleSolutionException.class)
    public void testOptimize_infeasibleProblem_throwsNoFeasibleSolutionException() throws OptimizationException {
        // Subject to contradictory constraints:
        // x + y <= 2
        // x + y >= 5
        // x, y >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 5));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test(expected = UnboundedSolutionException.class)
    public void testOptimize_unboundedProblem_throwsUnboundedSolutionException() throws OptimizationException {
        // Maximize z = 2x + y
        // Subject to:
        // x - y <= 10
        // x, y >= 0
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, -1 }, Relationship.LEQ, 10));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test(expected = MaxIterationsExceededException.class)
    public void testOptimize_maxIterationsExceeded_throwsMaxIterationsExceededException() throws OptimizationException {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 6));

        SimplexSolver solver = new SimplexSolver();
        solver.setMaxIterations(0);
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test
    public void testOptimize_negativeVariablesAllowed() throws OptimizationException {
        // Maximize z = x - 2y
        // Subject to:
        // x + y <= 5
        // x - y >= 1
        // x, y unrestricted (can be negative)
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, -2 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5));
        constraints.add(new LinearConstraint(new double[] { 1, -1 }, Relationship.GEQ, 1));

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, false);

        Assert.assertNotNull(solution);
        Assert.assertTrue(solution.getValue() > Double.NEGATIVE_INFINITY);
    }

    @Test
    public void testOptimize_emptyConstraints() throws OptimizationException {
        // Objective with no constraints, bounded by non-negativity to 0 when minimizing
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 3 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();

        SimplexSolver solver = new SimplexSolver();
        RealPointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(0.0, solution.getPoint()[0], 1e-6);
        Assert.assertEquals(0.0, solution.getPoint()[1], 1e-6);
        Assert.assertEquals(0.0, solution.getValue(), 1e-6);
    }

    @Test
    public void testIsOptimal_withArtificialVariablesPresent_returnsFalse() {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 5));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MINIMIZE, true, DEFAULT_EPSILON);
        Assert.assertTrue(tableau.getNumArtificialVariables() > 0);
        Assert.assertFalse(solver.isOptimal(tableau));
    }

    @Test
    public void testIsOptimal_whenOptimal_returnsTrue() throws OptimizationException {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 5 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);
        solver.solvePhase1(tableau);
        tableau.discardArtificialVariables();

        while (!solver.isOptimal(tableau)) {
            solver.doIteration(tableau);
        }

        Assert.assertTrue(solver.isOptimal(tableau));
    }

    @Test
    public void testSolvePhase1_withoutArtificialVariables_returnsImmediately() throws OptimizationException {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);
        Assert.assertEquals(0, tableau.getNumArtificialVariables());

        // Should return immediately without throwing exception
        solver.solvePhase1(tableau);
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testDoIteration_andMultiplePivots() throws OptimizationException {
        SimplexSolver solver = new SimplexSolver();
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 3, 4 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 3, 2, 1 }, Relationship.LEQ, 10));
        constraints.add(new LinearConstraint(new double[] { 2, 5, 3 }, Relationship.LEQ, 15));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON);
        int iterations = 0;
        while (!solver.isOptimal(tableau) && iterations < 10) {
            solver.doIteration(tableau);
            iterations++;
        }

        Assert.assertTrue(solver.isOptimal(tableau));
        RealPointValuePair solution = tableau.getSolution();
        Assert.assertNotNull(solution);
        Assert.assertEquals(20.0, solution.getValue(), 1e-6);
    }
}
