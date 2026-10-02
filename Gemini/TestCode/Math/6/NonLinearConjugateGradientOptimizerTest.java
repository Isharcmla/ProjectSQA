package org.apache.commons.math3.optim.nonlinear.scalar.gradient;

import org.apache.commons.math3.analysis.MultivariateFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.exception.MathIllegalStateException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleValueChecker;
import org.apache.commons.math3.optim.nonlinear.scalar.GoalType;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunctionGradient;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.BracketingStep;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.Formula;
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.NonLinearConjugateGradientOptimizer.IdentityPreconditioner;
import org.junit.Assert;
import org.junit.Test;

public class NonLinearConjugateGradientOptimizerTest {

    @Test
    public void testBracketingStep_getter_returnsCorrectValue() {
        BracketingStep step = new BracketingStep(2.5);
        Assert.assertEquals(2.5, step.getBracketingStep(), 1e-15);

        BracketingStep negativeStep = new BracketingStep(-1.0);
        Assert.assertEquals(-1.0, negativeStep.getBracketingStep(), 1e-15);

        BracketingStep zeroStep = new BracketingStep(0.0);
        Assert.assertEquals(0.0, zeroStep.getBracketingStep(), 1e-15);
    }

    @Test
    public void testFormula_enumValues_correct() {
        Formula[] formulas = Formula.values();
        Assert.assertEquals(2, formulas.length);
        Assert.assertEquals(Formula.FLETCHER_REEVES, Formula.valueOf("FLETCHER_REEVES"));
        Assert.assertEquals(Formula.POLAK_RIBIERE, Formula.valueOf("POLAK_RIBIERE"));
    }

    @Test
    public void testIdentityPreconditioner_precondition_clonesArray() {
        IdentityPreconditioner preconditioner = new IdentityPreconditioner();
        double[] variables = new double[] { 1.0, 2.0 };
        double[] r = new double[] { 3.0, 4.0 };
        double[] result = preconditioner.precondition(variables, r);

        Assert.assertArrayEquals(r, result, 1e-15);
        Assert.assertNotSame(r, result);

        double[] empty = new double[0];
        Assert.assertArrayEquals(empty, preconditioner.precondition(empty, empty), 1e-15);
    }

    @Test
    public void testConstructor_twoArgs_minimizationFletcherReeves() {
        SimpleValueChecker checker = new SimpleValueChecker(1e-10, 1e-10);
        NonLinearConjugateGradientOptimizer optimizer =
                new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, checker);

        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 3.0) * (point[0] - 3.0) + (point[1] + 2.0) * (point[1] + 2.0);
            }
        };

        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { 2.0 * (point[0] - 3.0), 2.0 * (point[1] + 2.0) };
            }
        };

        PointValuePair optimum = optimizer.optimize(
                new MaxEval(100),
                new ObjectiveFunction(function),
                new ObjectiveFunctionGradient(gradient),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] { 0.0, 0.0 })
        );

        Assert.assertEquals(3.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(-2.0, optimum.getPoint()[1], 1e-5);
        Assert.assertEquals(0.0, optimum.getValue(), 1e-8);
    }

    @Test
    public void testConstructor_threeArgs_maximizationPolakRibiere() {
        SimpleValueChecker checker = new SimpleValueChecker(1e-10, 1e-10);
        BrentSolver solver = new BrentSolver(1e-12, 1e-12);
        NonLinearConjugateGradientOptimizer optimizer =
                new NonLinearConjugateGradientOptimizer(Formula.POLAK_RIBIERE, checker, solver);

        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return 10.0 - (point[0] - 1.0) * (point[0] - 1.0) - (point[1] - 4.0) * (point[1] - 4.0);
            }
        };

        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { -2.0 * (point[0] - 1.0), -2.0 * (point[1] - 4.0) };
            }
        };

        PointValuePair optimum = optimizer.optimize(
                new MaxEval(100),
                new ObjectiveFunction(function),
                new ObjectiveFunctionGradient(gradient),
                GoalType.MAXIMIZE,
                new InitialGuess(new double[] { 5.0, -5.0 }),
                new BracketingStep(0.5)
        );

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(4.0, optimum.getPoint()[1], 1e-5);
        Assert.assertEquals(10.0, optimum.getValue(), 1e-8);
    }

    @Test
    public void testConstructor_fourArgs_customPreconditioner() {
        SimplePointChecker<PointValuePair> checker = new SimplePointChecker<PointValuePair>(1e-8, 1e-8);
        BrentSolver solver = new BrentSolver(1e-10);
        Preconditioner diagonalPreconditioner = new Preconditioner() {
            public double[] precondition(double[] variables, double[] r) {
                double[] res = new double[r.length];
                for (int i = 0; i < r.length; ++i) {
                    res[i] = r[i] * 0.5;
                }
                return res;
            }
        };

        NonLinearConjugateGradientOptimizer optimizer =
                new NonLinearConjugateGradientOptimizer(Formula.POLAK_RIBIERE, checker, solver, diagonalPreconditioner);

        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 1.0) * (point[0] - 1.0) + 2.0 * (point[1] - 2.0) * (point[1] - 2.0);
            }
        };

        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { 2.0 * (point[0] - 1.0), 4.0 * (point[1] - 2.0) };
            }
        };

        PointValuePair optimum = optimizer.optimize(
                new MaxEval(200),
                new ObjectiveFunction(function),
                new ObjectiveFunctionGradient(gradient),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] { 10.0, 10.0 })
        );

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(2.0, optimum.getPoint()[1], 1e-5);
    }

    @Test
    public void testOptimize_higherDimensionsMultipleIterations_fletcherReeves() {
        SimpleValueChecker checker = new SimpleValueChecker(1e-12, 1e-12);
        NonLinearConjugateGradientOptimizer optimizer =
                new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, checker);

        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                double sum = 0.0;
                for (int i = 0; i < point.length; i++) {
                    sum += (i + 1) * (point[i] - (i + 1)) * (point[i] - (i + 1));
                }
                return sum;
            }
        };

        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                double[] grad = new double[point.length];
                for (int i = 0; i < point.length; i++) {
                    grad[i] = 2.0 * (i + 1) * (point[i] - (i + 1));
                }
                return grad;
            }
        };

        double[] start = new double[] { -1.0, 0.0, 1.0, 2.0 };
        PointValuePair optimum = optimizer.optimize(
                new MaxEval(500),
                new ObjectiveFunction(function),
                new ObjectiveFunctionGradient(gradient),
                GoalType.MINIMIZE,
                new InitialGuess(start),
                new BracketingStep(1.5)
        );

        for (int i = 0; i < start.length; i++) {
            Assert.assertEquals((double) (i + 1), optimum.getPoint()[i], 1e-5);
        }
    }

    @Test
    public void testOptimize_higherDimensionsMultipleIterations_polakRibiere() {
        SimpleValueChecker checker = new SimpleValueChecker(1e-12, 1e-12);
        NonLinearConjugateGradientOptimizer optimizer =
                new NonLinearConjugateGradientOptimizer(Formula.POLAK_RIBIERE, checker);

        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return (point[0] - 1.0) * (point[0] - 1.0) +
                        (point[1] - 2.0) * (point[1] - 2.0) +
                        (point[2] - 3.0) * (point[2] - 3.0);
            }
        };

        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] {
                        2.0 * (point[0] - 1.0),
                        2.0 * (point[1] - 2.0),
                        2.0 * (point[2] - 3.0)
                };
            }
        };

        PointValuePair optimum = optimizer.optimize(
                new MaxEval(200),
                new ObjectiveFunction(function),
                new ObjectiveFunctionGradient(gradient),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] { 10.0, -10.0, 5.0 })
        );

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(2.0, optimum.getPoint()[1], 1e-5);
        Assert.assertEquals(3.0, optimum.getPoint()[2], 1e-5);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_withBounds_throwsMathUnsupportedOperationException() {
        SimpleValueChecker checker = new SimpleValueChecker(1e-6, 1e-6);
        NonLinearConjugateGradientOptimizer optimizer =
                new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, checker);

        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { 2.0 * point[0] };
            }
        };

        optimizer.optimize(
                new MaxEval(100),
                new ObjectiveFunction(function),
                new ObjectiveFunctionGradient(gradient),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] { 1.0 }),
                new SimpleBounds(new double[] { 0.0 }, new double[] { 2.0 })
        );
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_maxEvaluationsExceeded_throwsTooManyEvaluationsException() {
        SimpleValueChecker checker = new SimpleValueChecker(1e-15, 1e-15);
        NonLinearConjugateGradientOptimizer optimizer =
                new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, checker);

        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return Math.pow(point[0] - 1.0, 4) + Math.pow(point[1] - 2.0, 4);
            }
        };
        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] {
                        4.0 * Math.pow(point[0] - 1.0, 3),
                        4.0 * Math.pow(point[1] - 2.0, 3)
                };
            }
        };

        optimizer.optimize(
                new MaxEval(2),
                new ObjectiveFunction(function),
                new ObjectiveFunctionGradient(gradient),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] { 10.0, 10.0 })
        );
    }

    @Test(expected = MathIllegalStateException.class)
    public void testOptimize_unboundedLineSearch_throwsMathIllegalStateException() {
        SimpleValueChecker checker = new SimpleValueChecker(1e-6, 1e-6);
        NonLinearConjugateGradientOptimizer optimizer =
                new NonLinearConjugateGradientOptimizer(Formula.FLETCHER_REEVES, checker);

        MultivariateFunction function = new MultivariateFunction() {
            public double value(double[] point) {
                return point[0];
            }
        };
        MultivariateVectorFunction gradient = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { 1.0 };
            }
        };

        optimizer.optimize(
                new MaxEval(100),
                new ObjectiveFunction(function),
                new ObjectiveFunctionGradient(gradient),
                GoalType.MINIMIZE,
                new InitialGuess(new double[] { 0.0 })
        );
    }
}
