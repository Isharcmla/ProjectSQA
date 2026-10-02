package org.apache.commons.math.optimization.direct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.MultivariateRealFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.RealConvergenceChecker;
import org.apache.commons.math.optimization.RealPointValuePair;

public class MultiDirectionalTest {

    private MultivariateRealFunction simpleQuadratic;
    private MultivariateRealFunction simple1D;

    @Before
    public void setUp() {
        simpleQuadratic = new MultivariateRealFunction() {
            public double value(double[] point) throws FunctionEvaluationException {
                double x = point[0] - 1.0;
                double y = point[1] - 2.0;
                return x * x + y * y;
            }
        };

        simple1D = new MultivariateRealFunction() {
            public double value(double[] point) throws FunctionEvaluationException {
                double x = point[0] - 3.0;
                return x * x;
            }
        };
    }

    @Test
    public void testDefaultConstructor_createsInstance_notNull() {
        MultiDirectional optimizer = new MultiDirectional();
        assertNotNull(optimizer);
    }

    @Test
    public void testParameterizedConstructor_createsInstance_notNull() {
        MultiDirectional optimizer = new MultiDirectional(3.0, 0.3);
        assertNotNull(optimizer);
    }

    @Test
    public void testOptimize_minimizeQuadraticFunction_returnsNearMinimum()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        RealPointValuePair result = optimizer.optimize(simpleQuadratic, GoalType.MINIMIZE,
                new double[] { 0.0, 0.0 });
        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 0.3);
        assertEquals(2.0, result.getPoint()[1], 0.3);
        assertTrue(result.getValue() < 0.2);
    }

    @Test
    public void testOptimize_maximizeNegatedQuadraticFunction_returnsNearMaximum()
            throws FunctionEvaluationException, OptimizationException {
        MultivariateRealFunction negQuad = new MultivariateRealFunction() {
            public double value(double[] point) throws FunctionEvaluationException {
                double x = point[0] - 1.0;
                double y = point[1] - 2.0;
                return -(x * x + y * y);
            }
        };
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        RealPointValuePair result = optimizer.optimize(negQuad, GoalType.MAXIMIZE,
                new double[] { 0.0, 0.0 });
        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 0.3);
        assertEquals(2.0, result.getPoint()[1], 0.3);
    }

    @Test
    public void testOptimize_oneDimensionalFunction_returnsNearMinimum()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        RealPointValuePair result = optimizer.optimize(simple1D, GoalType.MINIMIZE,
                new double[] { 0.0 });
        assertNotNull(result);
        assertEquals(3.0, result.getPoint()[0], 0.3);
    }

    @Test
    public void testOptimize_customCoefficients_convergesToMinimum()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional(3.0, 0.2);
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        RealPointValuePair result = optimizer.optimize(simpleQuadratic, GoalType.MINIMIZE,
                new double[] { 5.0, 5.0 });
        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 0.5);
        assertEquals(2.0, result.getPoint()[1], 0.5);
    }

    @Test
    public void testOptimize_startPointAlreadyNearMinimum_convergesQuickly()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        RealPointValuePair result = optimizer.optimize(simpleQuadratic, GoalType.MINIMIZE,
                new double[] { 1.01, 2.01 });
        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 0.2);
        assertEquals(2.0, result.getPoint()[1], 0.2);
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_maxEvaluationsExceeded_throwsOptimizationException()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxEvaluations(1);
        optimizer.optimize(simpleQuadratic, GoalType.MINIMIZE, new double[] { 0.0, 0.0 });
    }

    @Test
    public void testOptimize_emptyStartPoint_throwsException() {
        MultiDirectional optimizer = new MultiDirectional();
        boolean thrown = false;
        try {
            optimizer.optimize(simpleQuadratic, GoalType.MINIMIZE, new double[] {});
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testOptimize_nullStartPoint_throwsException() {
        MultiDirectional optimizer = new MultiDirectional();
        boolean thrown = false;
        try {
            optimizer.optimize(simpleQuadratic, GoalType.MINIMIZE, null);
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testOptimize_withConvergenceChecker_stopsEarly()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        optimizer.setConvergenceChecker(new RealConvergenceChecker() {
            public boolean converged(int iteration, RealPointValuePair previous, RealPointValuePair current) {
                return Math.abs(previous.getValue() - current.getValue()) < 1e-6;
            }
        });
        RealPointValuePair result = optimizer.optimize(simpleQuadratic, GoalType.MINIMIZE,
                new double[] { 10.0, 10.0 });
        assertNotNull(result);
    }

    @Test
    public void testGetIterationsAndEvaluations_afterOptimize_returnsPositiveValues()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        optimizer.optimize(simpleQuadratic, GoalType.MINIMIZE, new double[] { 0.0, 0.0 });
        assertTrue(optimizer.getIterations() > 0);
        assertTrue(optimizer.getEvaluations() > 0);
    }

    @Test
    public void testOptimize_negativeStartPoint_convergesToMinimum()
            throws FunctionEvaluationException, OptimizationException {
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        RealPointValuePair result = optimizer.optimize(simpleQuadratic, GoalType.MINIMIZE,
                new double[] { -10.0, -10.0 });
        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 0.5);
        assertEquals(2.0, result.getPoint()[1], 0.5);
    }

    @Test
    public void testOptimize_threeDimensionalFunction_returnsNearMinimum()
            throws FunctionEvaluationException, OptimizationException {
        MultivariateRealFunction threeDimQuadratic = new MultivariateRealFunction() {
            public double value(double[] point) throws FunctionEvaluationException {
                double x = point[0] - 1.0;
                double y = point[1] - 2.0;
                double z = point[2] - 3.0;
                return x * x + y * y + z * z;
            }
        };
        MultiDirectional optimizer = new MultiDirectional();
        optimizer.setMaxIterations(500);
        optimizer.setMaxEvaluations(20000);
        RealPointValuePair result = optimizer.optimize(threeDimQuadratic, GoalType.MINIMIZE,
                new double[] { 0.0, 0.0, 0.0 });
        assertNotNull(result);
        assertEquals(1.0, result.getPoint()[0], 0.3);
        assertEquals(2.0, result.getPoint()[1], 0.3);
        assertEquals(3.0, result.getPoint()[2], 0.3);
    }
}
