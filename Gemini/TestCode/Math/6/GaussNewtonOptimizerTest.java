package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.Model;
import org.apache.commons.math3.optim.nonlinear.vector.ModelJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.junit.Assert;
import org.junit.Test;

public class GaussNewtonOptimizerTest {

    @Test(expected = NullArgumentException.class)
    public void testOptimize_nullChecker_throwsNullArgumentException() {
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(null);

        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] };
            }
        };

        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] { { 1.0 } };
            }
        };

        optimizer.optimize(
            new MaxEval(100),
            new Target(new double[] { 1.0 }),
            new Weight(new double[] { 1.0 }),
            new InitialGuess(new double[] { 0.0 }),
            new Model(model),
            new ModelJacobian(jacobian)
        );
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_withLowerBound_throwsMathUnsupportedOperationException() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimpleVectorValueChecker(1e-6, 1e-6);
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(checker);

        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] };
            }
        };

        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] { { 1.0 } };
            }
        };

        optimizer.optimize(
            new MaxEval(100),
            new Target(new double[] { 1.0 }),
            new Weight(new double[] { 1.0 }),
            new InitialGuess(new double[] { 0.0 }),
            new Model(model),
            new ModelJacobian(jacobian),
            new SimpleBounds(new double[] { 0.0 }, new double[] { Double.POSITIVE_INFINITY })
        );
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_withUpperBoundOnly_throwsMathUnsupportedOperationException() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimpleVectorValueChecker(1e-6, 1e-6);
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(checker);

        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] };
            }
        };

        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] { { 1.0 } };
            }
        };

        optimizer.optimize(
            new MaxEval(100),
            new Target(new double[] { 1.0 }),
            new Weight(new double[] { 1.0 }),
            new InitialGuess(new double[] { 0.0 }),
            new Model(model),
            new ModelJacobian(jacobian),
            new SimpleBounds(new double[] { Double.NEGATIVE_INFINITY }, new double[] { 10.0 })
        );
    }

    @Test(expected = ConvergenceException.class)
    public void testOptimize_singularMatrix_throwsConvergenceException() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimpleVectorValueChecker(1e-6, 1e-6);
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true, checker);

        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { 0.0, 0.0 };
            }
        };

        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] {
                    { 0.0, 0.0 },
                    { 0.0, 0.0 }
                };
            }
        };

        optimizer.optimize(
            new MaxEval(100),
            new Target(new double[] { 1.0, 2.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { 0.0, 0.0 }),
            new Model(model),
            new ModelJacobian(jacobian)
        );
    }

    @Test
    public void testOptimize_usingLU_convergesSuccessfully() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimpleVectorValueChecker(1e-6, 1e-6);
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true, checker);

        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] {
                    point[0],
                    point[0] + point[1]
                };
            }
        };

        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] {
                    { 1.0, 0.0 },
                    { 1.0, 1.0 }
                };
            }
        };

        double[] target = new double[] { 2.0, 5.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new Target(target),
            new Weight(weights),
            new InitialGuess(startPoint),
            new Model(model),
            new ModelJacobian(jacobian)
        );

        Assert.assertNotNull(optimum);
        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(3.0, optimum.getPoint()[1], 1e-5);
        Assert.assertEquals(0.0, optimizer.getCost(), 1e-5);
    }

    @Test
    public void testOptimize_usingQR_convergesSuccessfully() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimpleVectorValueChecker(1e-6, 1e-6);
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(false, checker);

        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] {
                    point[0] * 2.0,
                    point[1] * 3.0
                };
            }
        };

        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] {
                    { 2.0, 0.0 },
                    { 0.0, 3.0 }
                };
            }
        };

        double[] target = new double[] { 4.0, 9.0 };
        double[] weights = new double[] { 2.0, 2.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new Target(target),
            new Weight(weights),
            new InitialGuess(startPoint),
            new Model(model),
            new ModelJacobian(jacobian)
        );

        Assert.assertNotNull(optimum);
        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(3.0, optimum.getPoint()[1], 1e-5);
        Assert.assertEquals(0.0, optimizer.getCost(), 1e-5);
    }

    @Test
    public void testConstructor_defaultLU_optimizesSuccessfully() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimpleVectorValueChecker(1e-6, 1e-6);
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(checker);

        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] + 1.0 };
            }
        };

        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] { { 1.0 } };
            }
        };

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new Target(new double[] { 5.0 }),
            new Weight(new double[] { 1.0 }),
            new InitialGuess(new double[] { 0.0 }),
            new Model(model),
            new ModelJacobian(jacobian)
        );

        Assert.assertNotNull(optimum);
        Assert.assertEquals(4.0, optimum.getPoint()[0], 1e-5);
    }

    @Test
    public void testOptimize_nonLinearFunction_multipleIterationsConverges() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimpleVectorValueChecker(1e-8, 1e-8);
        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true, checker);

        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] {
                    point[0] * point[0],
                    point[1] * point[1]
                };
            }
        };

        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] {
                    { 2.0 * point[0], 0.0 },
                    { 0.0, 2.0 * point[1] }
                };
            }
        };

        double[] target = new double[] { 4.0, 9.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 2.0 };

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            new Target(target),
            new Weight(weights),
            new InitialGuess(startPoint),
            new Model(model),
            new ModelJacobian(jacobian)
        );

        Assert.assertNotNull(optimum);
        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-4);
        Assert.assertEquals(3.0, optimum.getPoint()[1], 1e-4);
    }
}
