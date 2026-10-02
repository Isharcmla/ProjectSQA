package org.apache.commons.math3.optimization.linear;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.exception.MaxCountExceededException;
import org.apache.commons.math3.optimization.GoalType;
import org.apache.commons.math3.optimization.PointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class SimplexSolverTest {

    private static final double DEFAULT_EPSILON = 1.0e-6;

    @Test
    public void testConstructors() {
        SimplexSolver defaultSolver = new SimplexSolver();
        Assert.assertNotNull(defaultSolver);

        SimplexSolver customSolver = new SimplexSolver(1.0e-5, 20);
        Assert.assertNotNull(customSolver);
    }

    @Test
    public void testOptimize_maximizeStandardProblem_returnsOptimalSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 5 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 0, 2 }, Relationship.LEQ, 12));
        constraints.add(new LinearConstraint(new double[] { 3, 2 }, Relationship.LEQ, 18));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(2.0, solution.getPoint()[0], DEFAULT_EPSILON);
        Assert.assertEquals(6.0, solution.getPoint()[1], DEFAULT_EPSILON);
        Assert.assertEquals(36.0, solution.getValue(), DEFAULT_EPSILON);
        Assert.assertTrue(solver.getIterations() > 0);
    }

    @Test
    public void testOptimize_minimizeStandardProblem_returnsOptimalSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { -2, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 2 }, Relationship.LEQ, 6));
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));

        SimplexSolver solver = new SimplexSolver(1e-6, 10);
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(4.0, solution.getPoint()[0], DEFAULT_EPSILON);
        Assert.assertEquals(0.0, solution.getPoint()[1], DEFAULT_EPSILON);
        Assert.assertEquals(-8.0, solution.getValue(), DEFAULT_EPSILON);
    }

    @Test(expected = UnboundedSolutionException.class)
    public void testOptimize_unboundedProblem_throwsUnboundedSolutionException() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, -1 }, Relationship.LEQ, 10));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test(expected = NoFeasibleSolutionException.class)
    public void testOptimize_infeasibleProblem_throwsNoFeasibleSolutionException() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 2));
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.GEQ, 5));

        SimplexSolver solver = new SimplexSolver();
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test(expected = MaxCountExceededException.class)
    public void testOptimize_maxIterationsExceeded_throwsMaxCountExceededException() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 3, 5 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 0, 2 }, Relationship.LEQ, 12));
        constraints.add(new LinearConstraint(new double[] { 3, 2 }, Relationship.LEQ, 18));

        SimplexSolver solver = new SimplexSolver();
        solver.setMaxIterations(0);
        solver.optimize(f, constraints, GoalType.MAXIMIZE, true);
    }

    @Test
    public void testOptimize_negativeVariablesAllowed_returnsCorrectSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.GEQ, -10));
        constraints.add(new LinearConstraint(new double[] { 0, 1 }, Relationship.GEQ, -5));
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 10));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, false);

        Assert.assertNotNull(solution);
        Assert.assertEquals(-10.0, solution.getPoint()[0], DEFAULT_EPSILON);
        Assert.assertEquals(-5.0, solution.getPoint()[1], DEFAULT_EPSILON);
        Assert.assertEquals(-15.0, solution.getValue(), DEFAULT_EPSILON);
    }

    @Test
    public void testOptimize_equalityConstraintsRequiringPhase1_returnsOptimalSolution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 2, 3 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1, 1 }, Relationship.EQ, 10));
        constraints.add(new LinearConstraint(new double[] { 1, 0, 0 }, Relationship.GEQ, 1));
        constraints.add(new LinearConstraint(new double[] { 0, 1, 0 }, Relationship.GEQ, 2));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(1.0, solution.getPoint()[0], DEFAULT_EPSILON);
        Assert.assertEquals(2.0, solution.getPoint()[1], DEFAULT_EPSILON);
        Assert.assertEquals(7.0, solution.getPoint()[2], DEFAULT_EPSILON);
        Assert.assertEquals(26.0, solution.getValue(), DEFAULT_EPSILON);
    }

    @Test
    public void testOptimize_degenerateTieInRatioTest_resolvesViaBlandsRule() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, 3 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 4));
        constraints.add(new LinearConstraint(new double[] { 2, 2 }, Relationship.LEQ, 8));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(0.0, solution.getPoint()[0], DEFAULT_EPSILON);
        Assert.assertEquals(4.0, solution.getPoint()[1], DEFAULT_EPSILON);
        Assert.assertEquals(12.0, solution.getValue(), DEFAULT_EPSILON);
    }

    @Test
    public void testOptimize_degenerateTieWithArtificialVariables() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.EQ, 5));
        constraints.add(new LinearConstraint(new double[] { 2, 2 }, Relationship.EQ, 10));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MINIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(5.0, solution.getValue(), DEFAULT_EPSILON);
    }

    @Test
    public void testSolvePhase1_alreadyOptimalNoArtificialVariables_returnsImmediately() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 1 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 1));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON, 10);
        SimplexSolver solver = new SimplexSolver();

        solver.solvePhase1(tableau);
        Assert.assertEquals(0, tableau.getNumArtificialVariables());
    }

    @Test
    public void testDoIteration_singleStepExecution() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 1, 2 }, 0);
        Collection<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 1 }, Relationship.LEQ, 5));

        SimplexTableau tableau = new SimplexTableau(f, constraints, GoalType.MAXIMIZE, true, DEFAULT_EPSILON, 10);
        SimplexSolver solver = new SimplexSolver();

        Assert.assertFalse(tableau.isOptimal());
        solver.doIteration(tableau);
        Assert.assertTrue(tableau.isOptimal());
    }

    @Test
    public void testOptimize_constantTermInObjectiveFunction() {
        LinearObjectiveFunction f = new LinearObjectiveFunction(new double[] { 2, -1 }, 15);
        List<LinearConstraint> constraints = new ArrayList<LinearConstraint>();
        constraints.add(new LinearConstraint(new double[] { 1, 0 }, Relationship.LEQ, 5));

        SimplexSolver solver = new SimplexSolver();
        PointValuePair solution = solver.optimize(f, constraints, GoalType.MAXIMIZE, true);

        Assert.assertNotNull(solution);
        Assert.assertEquals(5.0, solution.getPoint()[0], DEFAULT_EPSILON);
        Assert.assertEquals(0.0, solution.getPoint()[1], DEFAULT_EPSILON);
        Assert.assertEquals(25.0, solution.getValue(), DEFAULT_EPSILON);
    }
}
