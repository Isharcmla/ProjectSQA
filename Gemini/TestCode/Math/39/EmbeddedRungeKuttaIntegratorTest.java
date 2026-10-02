package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.MathIllegalArgumentException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.junit.Assert;
import org.junit.Test;

public class EmbeddedRungeKuttaIntegratorTest {

    private static class DummyStepInterpolator extends RungeKuttaStepInterpolator {
        public DummyStepInterpolator() {
            super();
        }

        public DummyStepInterpolator(final DummyStepInterpolator interpolator) {
            super(interpolator);
        }

        @Override
        protected StepInterpolator doCopy() {
            return new DummyStepInterpolator(this);
        }

        @Override
        protected void computeInterpolatedStateAndDerivatives(final double theta, final double oneMinusThetaH) {
            for (int i = 0; i < interpolatedState.length; ++i) {
                interpolatedState[i] = currentState[i];
                interpolatedDerivatives[i] = (yDotK != null && yDotK.length > 0 && yDotK[0] != null) ? yDotK[0][i] : 0.0;
            }
        }
    }

    private static class DummyEmbeddedRungeKuttaIntegrator extends EmbeddedRungeKuttaIntegrator {
        private final int order;
        private double fixedError = 0.5;
        private int errorCount = 0;
        private int rejectFirstNSteps = 0;

        public DummyEmbeddedRungeKuttaIntegrator(final String name, final boolean fsal,
                                                 final double[] c, final double[][] a, final double[] b,
                                                 final RungeKuttaStepInterpolator prototype,
                                                 final double minStep, final double maxStep,
                                                 final double scalAbsoluteTolerance,
                                                 final double scalRelativeTolerance,
                                                 final int order) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
            this.order = order;
        }

        public DummyEmbeddedRungeKuttaIntegrator(final String name, final boolean fsal,
                                                 final double[] c, final double[][] a, final double[] b,
                                                 final RungeKuttaStepInterpolator prototype,
                                                 final double minStep, final double maxStep,
                                                 final double[] vecAbsoluteTolerance,
                                                 final double[] vecRelativeTolerance,
                                                 final int order) {
            super(name, fsal, c, a, b, prototype, minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
            this.order = order;
        }

        public void setFixedError(double error) {
            this.fixedError = error;
        }

        public void setRejectFirstNSteps(int count) {
            this.rejectFirstNSteps = count;
        }

        @Override
        public int getOrder() {
            return order;
        }

        @Override
        protected double estimateError(double[][] yDotK, double[] y0, double[] y1, double h) {
            if (errorCount < rejectFirstNSteps) {
                errorCount++;
                return 2.5; // reject step
            }
            errorCount++;
            return fixedError;
        }
    }

    private static class LinearODE implements FirstOrderDifferentialEquations {
        private final int dimension;

        public LinearODE(int dimension) {
            this.dimension = dimension;
        }

        @Override
        public int getDimension() {
            return dimension;
        }

        @Override
        public void computeDerivatives(double t, double[] y, double[] yDot) {
            for (int i = 0; i < dimension; ++i) {
                yDot[i] = -0.5 * y[i];
            }
        }
    }

    private DummyEmbeddedRungeKuttaIntegrator createScalarIntegrator(boolean fsal) {
        double[] c = new double[]{ 0.5, 1.0 };
        double[][] a = new double[][]{ { 0.5 }, { -1.0, 2.0 } };
        double[] b = new double[]{ 1.0 / 6.0, 2.0 / 3.0, 1.0 / 6.0 };
        return new DummyEmbeddedRungeKuttaIntegrator(
                "DummyScalar", fsal, c, a, b,
                new DummyStepInterpolator(),
                0.001, 1.0, 1.0e-6, 1.0e-6, 3
        );
    }

    private DummyEmbeddedRungeKuttaIntegrator createVectorIntegrator(boolean fsal, int dim) {
        double[] c = new double[]{ 0.5, 1.0 };
        double[][] a = new double[][]{ { 0.5 }, { -1.0, 2.0 } };
        double[] b = new double[]{ 1.0 / 6.0, 2.0 / 3.0, 1.0 / 6.0 };
        double[] absTol = new double[dim];
        double[] relTol = new double[dim];
        for (int i = 0; i < dim; ++i) {
            absTol[i] = 1.0e-6;
            relTol[i] = 1.0e-6;
        }
        return new DummyEmbeddedRungeKuttaIntegrator(
                "DummyVector", fsal, c, a, b,
                new DummyStepInterpolator(),
                0.001, 1.0, absTol, relTol, 3
        );
    }

    @Test
    public void testGettersAndSetters_defaultAndModifiedValues_expectedResults() {
        DummyEmbeddedRungeKuttaIntegrator integrator = createScalarIntegrator(false);

        Assert.assertEquals(0.9, integrator.getSafety(), 1.0e-12);
        Assert.assertEquals(0.2, integrator.getMinReduction(), 1.0e-12);
        Assert.assertEquals(10.0, integrator.getMaxGrowth(), 1.0e-12);
        Assert.assertEquals(3, integrator.getOrder());

        integrator.setSafety(0.85);
        Assert.assertEquals(0.85, integrator.getSafety(), 1.0e-12);

        integrator.setMinReduction(0.1);
        Assert.assertEquals(0.1, integrator.getMinReduction(), 1.0e-12);

        integrator.setMaxGrowth(5.0);
        Assert.assertEquals(5.0, integrator.getMaxGrowth(), 1.0e-12);
    }

    @Test
    public void testIntegrate_scalarToleranceForwardNonFsal_success() {
        DummyEmbeddedRungeKuttaIntegrator integrator = createScalarIntegrator(false);
        LinearODE ode = new LinearODE(1);
        ExpandableStatefulODE stateful = new ExpandableStatefulODE(ode);
        stateful.setTime(0.0);
        stateful.setPrimaryState(new double[]{ 10.0 });

        integrator.integrate(stateful, 2.0);

        Assert.assertEquals(2.0, stateful.getTime(), 1.0e-10);
        Assert.assertTrue(stateful.getPrimaryState()[0] < 10.0);
    }

    @Test
    public void testIntegrate_vectorToleranceForwardFsal_success() {
        DummyEmbeddedRungeKuttaIntegrator integrator = createVectorIntegrator(true, 2);
        LinearODE ode = new LinearODE(2);
        ExpandableStatefulODE stateful = new ExpandableStatefulODE(ode);
        stateful.setTime(0.0);
        stateful.setPrimaryState(new double[]{ 5.0, -5.0 });

        integrator.integrate(stateful, 3.0);

        Assert.assertEquals(3.0, stateful.getTime(), 1.0e-10);
        Assert.assertTrue(stateful.getPrimaryState()[0] < 5.0);
        Assert.assertTrue(stateful.getPrimaryState()[1] > -5.0);
    }

    @Test
    public void testIntegrate_backwardIntegration_success() {
        DummyEmbeddedRungeKuttaIntegrator integrator = createScalarIntegrator(true);
        LinearODE ode = new LinearODE(1);
        ExpandableStatefulODE stateful = new ExpandableStatefulODE(ode);
        stateful.setTime(2.0);
        stateful.setPrimaryState(new double[]{ 10.0 });

        integrator.integrate(stateful, 0.0);

        Assert.assertEquals(0.0, stateful.getTime(), 1.0e-10);
        Assert.assertTrue(stateful.getPrimaryState()[0] > 10.0);
    }

    @Test
    public void testIntegrate_stepRejectionHandling_recoversAndFinishes() {
        DummyEmbeddedRungeKuttaIntegrator integrator = createScalarIntegrator(false);
        integrator.setRejectFirstNSteps(2);

        LinearODE ode = new LinearODE(1);
        ExpandableStatefulODE stateful = new ExpandableStatefulODE(ode);
        stateful.setTime(0.0);
        stateful.setPrimaryState(new double[]{ 1.0 });

        integrator.integrate(stateful, 1.0);

        Assert.assertEquals(1.0, stateful.getTime(), 1.0e-10);
    }

    @Test
    public void testIntegrate_multipleStepsToReachEnd_filteredNextIsLastTriggered() {
        DummyEmbeddedRungeKuttaIntegrator integrator = createScalarIntegrator(true);
        integrator.setMaxGrowth(1.1);
        integrator.setSafety(0.5);

        LinearODE ode = new LinearODE(1);
        ExpandableStatefulODE stateful = new ExpandableStatefulODE(ode);
        stateful.setTime(0.0);
        stateful.setPrimaryState(new double[]{ 2.0 });

        integrator.integrate(stateful, 5.0);

        Assert.assertEquals(5.0, stateful.getTime(), 1.0e-10);
    }

    @Test
    public void testIntegrate_backwardWithStepRejection_success() {
        DummyEmbeddedRungeKuttaIntegrator integrator = createVectorIntegrator(false, 1);
        integrator.setRejectFirstNSteps(1);

        LinearODE ode = new LinearODE(1);
        ExpandableStatefulODE stateful = new ExpandableStatefulODE(ode);
        stateful.setTime(5.0);
        stateful.setPrimaryState(new double[]{ 2.0 });

        integrator.integrate(stateful, 0.0);

        Assert.assertEquals(0.0, stateful.getTime(), 1.0e-10);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testIntegrate_intervalTooSmall_throwsException() {
        DummyEmbeddedRungeKuttaIntegrator integrator = createScalarIntegrator(false);
        LinearODE ode = new LinearODE(1);
        ExpandableStatefulODE stateful = new ExpandableStatefulODE(ode);
        stateful.setTime(1.0);
        stateful.setPrimaryState(new double[]{ 1.0 });

        integrator.integrate(stateful, 1.0 + 1.0e-15);
    }

    @Test(expected = DimensionMismatchException.class)
    public void testIntegrate_vectorToleranceDimensionMismatch_throwsException() {
        DummyEmbeddedRungeKuttaIntegrator integrator = createVectorIntegrator(false, 2);
        LinearODE ode = new LinearODE(1); // Mismatch dimension
        ExpandableStatefulODE stateful = new ExpandableStatefulODE(ode);
        stateful.setTime(0.0);
        stateful.setPrimaryState(new double[]{ 1.0 });

        integrator.integrate(stateful, 1.0);
    }
}
