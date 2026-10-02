package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonLinearConjugateGradientOptimizerTest {

    private MultivariateFunction quadratic;
    private MultivariateVectorFunction quadraticGradient;

    @Before
    public void setUp() {
        quadratic = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0] - 2;
                double y = point[1] - 3;
                return x * x + y * y;
            }
        };
        quadraticGradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] {
                    2 * (point[0] - 2),
                    2 * (point[1] - 3)
                };
            }
        };
    }

    @Test
    public void testConstructor_twoArgs_createsInstance() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10));
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_threeArgs_createsInstance() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.FLETCHER_REEVES,
                new SimpleValueChecker(1e-10, 1e-10),
                new BrentSolver());
        assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_fourArgs_createsInstance() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10),
                new BrentSolver(),
                new IdentityPreconditioner());
        assertNotNull(optimizer);
    }

    @Test
    public void testOptimize_polakRibiereMinimize_findsMinimum() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(quadratic),
            new ObjectiveFunctionGradient(quadraticGradient),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0, 0}));

        assertEquals(2.0, result.getPoint()[0], 1e-4);
        assertEquals(3.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testOptimize_fletcherReevesMinimize_findsMinimum() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.FLETCHER_REEVES,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(quadratic),
            new ObjectiveFunctionGradient(quadraticGradient),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0, 0}));

        assertEquals(2.0, result.getPoint()[0], 1e-4);
        assertEquals(3.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testOptimize_maximizeGoal_findsMaximum() {
        MultivariateFunction negQuadratic = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0] - 2;
                double y = point[1] - 3;
                return -(x * x + y * y);
            }
        };
        MultivariateVectorFunction negGradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] {
                    -2 * (point[0] - 2),
                    -2 * (point[1] - 3)
                };
            }
        };

        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(negQuadratic),
            new ObjectiveFunctionGradient(negGradient),
            GoalType.MAXIMIZE,
            new InitialGuess(new double[]{0, 0}));

        assertEquals(2.0, result.getPoint()[0], 1e-4);
        assertEquals(3.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testOptimize_withBracketingStep_findsMinimum() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(quadratic),
            new ObjectiveFunctionGradient(quadraticGradient),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0, 0}),
            new BracketingStep(0.5));

        assertEquals(2.0, result.getPoint()[0], 1e-4);
        assertEquals(3.0, result.getPoint()[1], 1e-4);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_withBounds_throwsUnsupportedOperationException() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10));

        optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(quadratic),
            new ObjectiveFunctionGradient(quadraticGradient),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0, 0}),
            new SimpleBounds(new double[]{-10, -10}, new double[]{10, 10}));
    }

    @Test
    public void testBracketingStep_getBracketingStep_returnsCorrectValue() {
        BracketingStep step = new BracketingStep(2.5);
        assertEquals(2.5, step.getBracketingStep(), 1e-15);
    }

    @Test
    public void testBracketingStep_negativeValue_returnsNegativeValue() {
        BracketingStep step = new BracketingStep(-1.5);
        assertEquals(-1.5, step.getBracketingStep(), 1e-15);
    }

    @Test
    public void testBracketingStep_zeroValue_returnsZero() {
        BracketingStep step = new BracketingStep(0.0);
        assertEquals(0.0, step.getBracketingStep(), 1e-15);
    }

    @Test
    public void testIdentityPreconditioner_precondition_returnsClonedArray() {
        IdentityPreconditioner preconditioner = new IdentityPreconditioner();
        double[] variables = {1.0, 2.0};
        double[] r = {3.0, 4.0};
        double[] result = preconditioner.precondition(variables, r);
        assertArrayEquals(r, result, 1e-15);
        assertNotSame(r, result);
    }

    @Test
    public void testFormula_values_containsExpectedEnums() {
        Formula[] formulas = Formula.values();
        assertEquals(2, formulas.length);
        assertEquals(Formula.FLETCHER_REEVES, formulas[0]);
        assertEquals(Formula.POLAK_RIBIERE, formulas[1]);
    }

    @Test
    public void testFormula_valueOf_returnsCorrectEnum() {
        assertEquals(Formula.FLETCHER_REEVES, Formula.valueOf("FLETCHER_REEVES"));
        assertEquals(Formula.POLAK_RIBIERE, Formula.valueOf("POLAK_RIBIERE"));
    }

    @Test
    public void testOptimize_highDimensional_findsMinimum() {
        MultivariateFunction func = new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0;
                for (double v : point) {
                    sum += v * v;
                }
                return sum;
            }
        };
        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                double[] g = new double[point.length];
                for (int i = 0; i < point.length; i++) {
                    g[i] = 2 * point[i];
                }
                return g;
            }
        };

        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.FLETCHER_REEVES,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
            new MaxEval(2000),
            new ObjectiveFunction(func),
            new ObjectiveFunctionGradient(gradient),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{5, 5, 5}));

        for (double v : result.getPoint()) {
            assertEquals(0.0, v, 1e-3);
        }
    }

    @Test
    public void testOptimize_withCustomPreconditioner_findsMinimum() {
        Preconditioner customPreconditioner = new Preconditioner() {
            public double[] precondition(double[] variables, double[] r) {
                return r.clone();
            }
        };

        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10),
                new BrentSolver(),
                customPreconditioner);

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(quadratic),
            new ObjectiveFunctionGradient(quadraticGradient),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0, 0}));

        assertEquals(2.0, result.getPoint()[0], 1e-4);
        assertEquals(3.0, result.getPoint()[1], 1e-4);
    }

    @Test
    public void testOptimize_singleDimension_findsMinimum() {
        MultivariateFunction func = new MultivariateFunction() {
            public double value(double[] point) {
                double x = point[0] - 5;
                return x * x;
            }
        };
        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { 2 * (point[0] - 5) };
            }
        };

        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(func),
            new ObjectiveFunctionGradient(gradient),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{0}));

        assertEquals(5.0, result.getPoint()[0], 1e-4);
    }

    @Test
    public void testOptimize_startAtMinimum_convergesImmediately() {
        NonLinearConjugateGradientOptimizer optimizer =
            new NonLinearConjugateGradientOptimizer(
                Formula.POLAK_RIBIERE,
                new SimpleValueChecker(1e-10, 1e-10));

        PointValuePair result = optimizer.optimize(
            new MaxEval(1000),
            new ObjectiveFunction(quadratic),
            new ObjectiveFunctionGradient(quadraticGradient),
            GoalType.MINIMIZE,
            new InitialGuess(new double[]{2, 3}));

        assertEquals(2.0, result.getPoint()[0], 1e-3);
        assertEquals(3.0, result.getPoint()[1], 1e-3);
    }
}
