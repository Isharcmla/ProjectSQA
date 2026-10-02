package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.optim.ConvergenceChecker;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimplePointChecker;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.util.Precision;
import org.junit.Assert;
import org.junit.Test;

public class LevenbergMarquardtOptimizerTest {

    private static class LinearProblem {
        final double[][] a;
        final double[] b;

        LinearProblem(double[][] a, double[] b) {
            this.a = a;
            this.b = b;
        }

        ModelFunction getModelFunction() {
            return new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] point) {
                    double[] result = new double[a.length];
                    for (int i = 0; i < a.length; ++i) {
                        double sum = 0;
                        for (int j = 0; j < point.length; ++j) {
                            sum += a[i][j] * point[j];
                        }
                        result[i] = sum;
                    }
                    return result;
                }
            });
        }

        ModelFunctionJacobian getModelFunctionJacobian() {
            return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return a;
                }
            });
        }
    }

    private static class CircleProblem {
        final double[][] points;

        CircleProblem(double[][] points) {
            this.points = points;
        }

        ModelFunction getModelFunction() {
            return new ModelFunction(new MultivariateVectorFunction() {
                public double[] value(double[] p) {
                    double[] values = new double[points.length];
                    for (int i = 0; i < points.length; ++i) {
                        double dx = points[i][0] - p[0];
                        double dy = points[i][1] - p[1];
                        values[i] = Math.sqrt(dx * dx + dy * dy) - p[2];
                    }
                    return values;
                }
            });
        }

        ModelFunctionJacobian getModelFunctionJacobian() {
            return new ModelFunctionJacobian(new MultivariateMatrixFunction() {
                public double[][] value(double[] p) {
                    double[][] jac = new double[points.length][3];
                    for (int i = 0; i < points.length; ++i) {
                        double dx = points[i][0] - p[0];
                        double dy = points[i][1] - p[1];
                        double d = Math.sqrt(dx * dx + dy * dy);
                        if (d == 0) {
                            jac[i][0] = 0;
                            jac[i][1] = 0;
                        } else {
                            jac[i][0] = -dx / d;
                            jac[i][1] = -dy / d;
                        }
                        jac[i][2] = -1.0;
                    }
                    return jac;
                }
            });
        }
    }

    @Test
    public void testDefaultConstructor_optimizeSimpleCircle_findsCorrectParameters() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        double[][] points = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 },
            { -1.0, 0.0 },
            { 0.0, -1.0 }
        };

        CircleProblem problem = new CircleProblem(points);
        double[] target = new double[4];
        double[] weights = new double[] { 1.0, 1.0, 1.0, 1.0 };
        double[] initialGuess = new double[] { 0.1, 0.1, 0.8 };

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(target),
            new Weight(weights),
            new InitialGuess(initialGuess)
        );

        double[] point = optimum.getPoint();
        Assert.assertEquals(0.0, point[0], 1e-6);
        Assert.assertEquals(0.0, point[1], 1e-6);
        Assert.assertEquals(1.0, point[2], 1e-6);
        Assert.assertEquals(0.0, optimizer.getCost(), 1e-6);
    }

    @Test
    public void testConstructorWithChecker_optimize_convergesUsingCustomChecker() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimplePointChecker<PointVectorValuePair>(1e-4, 1e-4);
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(checker);

        LinearProblem problem = new LinearProblem(
            new double[][] { { 1.0, 2.0 }, { 3.0, 4.0 } },
            new double[] { 5.0, 11.0 }
        );

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(50),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(new double[] { 5.0, 11.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { 0.0, 0.0 })
        );

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-3);
        Assert.assertEquals(2.0, optimum.getPoint()[1], 1e-3);
    }

    @Test
    public void testConstructorWithTolerances_optimize_converges() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(1e-8, 1e-8, 1e-8);

        LinearProblem problem = new LinearProblem(
            new double[][] { { 2.0, 0.0 }, { 0.0, 3.0 } },
            new double[] { 4.0, 9.0 }
        );

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(50),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(new double[] { 4.0, 9.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { 1.0, 1.0 })
        );

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-6);
        Assert.assertEquals(3.0, optimum.getPoint()[1], 1e-6);
    }

    @Test
    public void testConstructorAllParamsWithoutChecker_optimize_converges() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(
            50.0, 1e-9, 1e-9, 1e-9, Precision.SAFE_MIN
        );

        LinearProblem problem = new LinearProblem(
            new double[][] { { 1.0, 0.0 }, { 0.0, 1.0 } },
            new double[] { 3.0, 4.0 }
        );

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(50),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(new double[] { 3.0, 4.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { 0.0, 0.0 })
        );

        Assert.assertEquals(3.0, optimum.getPoint()[0], 1e-6);
        Assert.assertEquals(4.0, optimum.getPoint()[1], 1e-6);
    }

    @Test
    public void testConstructorAllParamsWithChecker_optimize_converges() {
        ConvergenceChecker<PointVectorValuePair> checker = new SimpleVectorValueChecker(1e-5, 1e-5);
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(
            100.0, checker, 1e-8, 1e-8, 1e-8, 1e-12
        );

        LinearProblem problem = new LinearProblem(
            new double[][] { { 2.0, -1.0 }, { 1.0, 1.0 } },
            new double[] { 1.0, 5.0 }
        );

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(50),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(new double[] { 1.0, 5.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { 0.0, 0.0 })
        );

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-4);
        Assert.assertEquals(3.0, optimum.getPoint()[1], 1e-4);
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testCheckParameters_withBounds_throwsMathUnsupportedOperationException() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        LinearProblem problem = new LinearProblem(
            new double[][] { { 1.0 } },
            new double[] { 2.0 }
        );

        optimizer.optimize(
            new MaxEval(10),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(new double[] { 2.0 }),
            new Weight(new double[] { 1.0 }),
            new InitialGuess(new double[] { 0.0 }),
            new SimpleBounds(new double[] { -1.0 }, new double[] { 1.0 })
        );
    }

    @Test
    public void testOptimize_alreadyAtOptimumZeroCost_returnsImmediately() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        LinearProblem problem = new LinearProblem(
            new double[][] { { 1.0, 0.0 }, { 0.0, 1.0 } },
            new double[] { 2.0, 3.0 }
        );

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(10),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(new double[] { 2.0, 3.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { 2.0, 3.0 })
        );

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-10);
        Assert.assertEquals(3.0, optimum.getPoint()[1], 1e-10);
        Assert.assertEquals(0.0, optimizer.getCost(), 1e-10);
    }

    @Test
    public void testOptimize_rankDeficientJacobian_solvesLeastSquares() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer(100.0, 1e-10, 1e-10, 1e-10, 1e-10);

        LinearProblem problem = new LinearProblem(
            new double[][] {
                { 1.0, 1.0 },
                { 1.0, 1.0 },
                { 0.0, 0.0 }
            },
            new double[] { 2.0, 2.0, 0.0 }
        );

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(50),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(new double[] { 2.0, 2.0, 0.0 }),
            new Weight(new double[] { 1.0, 1.0, 1.0 }),
            new InitialGuess(new double[] { 0.0, 0.0 })
        );

        double sum = optimum.getPoint()[0] + optimum.getPoint()[1];
        Assert.assertEquals(2.0, sum, 1e-4);
    }

    @Test
    public void testOptimize_overDeterminedSystem_solvesCorrectly() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        double[][] a = new double[][] {
            { 1.0, 1.0 },
            { 1.0, -1.0 },
            { 2.0, 0.0 }
        };
        double[] b = new double[] { 2.0, 0.0, 2.0 };
        LinearProblem problem = new LinearProblem(a, b);

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(50),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(b),
            new Weight(new double[] { 1.0, 1.0, 1.0 }),
            new InitialGuess(new double[] { 0.5, 0.5 })
        );

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-6);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-6);
    }

    @Test
    public void testOptimize_underDeterminedSystem_findsSolution() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        double[][] a = new double[][] {
            { 1.0, 2.0, 3.0 }
        };
        double[] b = new double[] { 6.0 };
        LinearProblem problem = new LinearProblem(a, b);

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(50),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(b),
            new Weight(new double[] { 1.0 }),
            new InitialGuess(new double[] { 0.0, 0.0, 0.0 })
        );

        double[] pt = optimum.getPoint();
        double val = pt[0] * 1.0 + pt[1] * 2.0 + pt[2] * 3.0;
        Assert.assertEquals(6.0, val, 1e-5);
    }

    @Test(expected = ConvergenceException.class)
    public void testQrDecomposition_withNaNInJacobian_throwsConvergenceException() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        ModelFunction model = new ModelFunction(new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] };
            }
        });

        ModelFunctionJacobian jacobian = new ModelFunctionJacobian(new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] { { Double.NaN } };
            }
        });

        optimizer.optimize(
            new MaxEval(10),
            model,
            jacobian,
            new Target(new double[] { 1.0 }),
            new Weight(new double[] { 1.0 }),
            new InitialGuess(new double[] { 0.0 })
        );
    }

    @Test(expected = ConvergenceException.class)
    public void testQrDecomposition_withInfiniteInJacobian_throwsConvergenceException() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        ModelFunction model = new ModelFunction(new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] };
            }
        });

        ModelFunctionJacobian jacobian = new ModelFunctionJacobian(new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] { { Double.POSITIVE_INFINITY } };
            }
        });

        optimizer.optimize(
            new MaxEval(10),
            model,
            jacobian,
            new Target(new double[] { 1.0 }),
            new Weight(new double[] { 1.0 }),
            new InitialGuess(new double[] { 0.0 })
        );
    }

    @Test(expected = TooManyEvaluationsException.class)
    public void testOptimize_exceedingMaxEvaluations_throwsTooManyEvaluationsException() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        double[][] points = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 },
            { -1.0, 0.0 },
            { 0.0, -1.0 }
        };

        CircleProblem problem = new CircleProblem(points);

        optimizer.optimize(
            new MaxEval(1),
            problem.getModelFunction(),
            problem.getModelFunctionJacobian(),
            new Target(new double[] { 0.0, 0.0, 0.0, 0.0 }),
            new Weight(new double[] { 1.0, 1.0, 1.0, 1.0 }),
            new InitialGuess(new double[] { 50.0, -50.0, 0.1 })
        );
    }

    @Test
    public void testOptimize_zeroInitialGuessAndZeroJacobianColumnNorm_handlesGracefully() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        ModelFunction model = new ModelFunction(new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0], 0.0 };
            }
        });

        ModelFunctionJacobian jacobian = new ModelFunctionJacobian(new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                return new double[][] {
                    { 1.0, 0.0 },
                    { 0.0, 0.0 }
                };
            }
        });

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(50),
            model,
            jacobian,
            new Target(new double[] { 3.0, 0.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { 0.0, 0.0 })
        );

        Assert.assertEquals(3.0, optimum.getPoint()[0], 1e-5);
    }

    @Test
    public void testNonlinearFitting_rosenbrockFunction() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        ModelFunction model = new ModelFunction(new MultivariateVectorFunction() {
            public double[] value(double[] point) {
                double x = point[0];
                double y = point[1];
                return new double[] {
                    10.0 * (y - x * x),
                    1.0 - x
                };
            }
        });

        ModelFunctionJacobian jacobian = new ModelFunctionJacobian(new MultivariateMatrixFunction() {
            public double[][] value(double[] point) {
                double x = point[0];
                return new double[][] {
                    { -20.0 * x, 10.0 },
                    { -1.0,       0.0 }
                };
            }
        });

        PointVectorValuePair optimum = optimizer.optimize(
            new MaxEval(100),
            model,
            jacobian,
            new Target(new double[] { 0.0, 0.0 }),
            new Weight(new double[] { 1.0, 1.0 }),
            new InitialGuess(new double[] { -1.2, 1.0 })
        );

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-5);
    }
}
