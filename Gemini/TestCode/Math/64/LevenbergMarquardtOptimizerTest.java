package org.apache.commons.math.optimization.general;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialConvergenceChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class LevenbergMarquardtOptimizerTest {

    @Test
    public void testConstructorAndSetters() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(50.0);
        optimizer.setCostRelativeTolerance(1e-8);
        optimizer.setParRelativeTolerance(1e-8);
        optimizer.setOrthoTolerance(1e-8);
        optimizer.setQRRankingThreshold(1e-12);
        optimizer.setMaxIterations(500);

        Assert.assertEquals(500, optimizer.getMaxIterations());
    }

    @Test
    public void testOptimize_linearProblem_exactSolution() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] {
                    2.0 * point[0] + point[1],
                    point[0] - 3.0 * point[1]
                };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { 2.0, 1.0 },
                            { 1.0, -3.0 }
                        };
                    }
                };
            }
        };

        double[] target = new double[] { 5.0, -1.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        VectorialPointValuePair optimum = optimizer.optimize(function, target, weights, startPoint);

        Assert.assertArrayEquals(new double[] { 2.0, 1.0 }, optimum.getPoint(), 1e-6);
        Assert.assertArrayEquals(target, optimum.getValue(), 1e-6);
    }

    @Test
    public void testOptimize_withCustomConvergenceChecker() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        VectorialConvergenceChecker checker = new SimpleVectorialValueChecker(1e-4, 1e-4);
        optimizer.setConvergenceChecker(checker);

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] {
                    point[0] * point[0],
                    point[1] * point[1]
                };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { 2.0 * point[0], 0.0 },
                            { 0.0, 2.0 * point[1] }
                        };
                    }
                };
            }
        };

        double[] target = new double[] { 4.0, 9.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        VectorialPointValuePair optimum = optimizer.optimize(function, target, weights, startPoint);

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-3);
        Assert.assertEquals(3.0, optimum.getPoint()[1], 1e-3);
    }

    @Test
    public void testOptimize_alreadyAtOptimum_returnsImmediately() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] + point[1] };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] { { 1.0, 1.0 } };
                    }
                };
            }
        };

        double[] target = new double[] { 3.0 };
        double[] weights = new double[] { 1.0 };
        double[] startPoint = new double[] { 1.0, 2.0 };

        VectorialPointValuePair optimum = optimizer.optimize(function, target, weights, startPoint);

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-9);
        Assert.assertEquals(2.0, optimum.getPoint()[1], 1e-9);
    }

    @Test
    public void testOptimize_zeroInitialStepBoundFactor_startsAtOrigin() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(1.0);

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] - 3.0 };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] { { 1.0 } };
                    }
                };
            }
        };

        double[] target = new double[] { 0.0 };
        double[] weights = new double[] { 1.0 };
        double[] startPoint = new double[] { 0.0 };

        VectorialPointValuePair optimum = optimizer.optimize(function, target, weights, startPoint);
        Assert.assertEquals(3.0, optimum.getPoint()[0], 1e-6);
    }

    @Test
    public void testOptimize_overDeterminedProblem_nonLinearConvergence() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(1e-10);
        optimizer.setParRelativeTolerance(1e-10);

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                double a = point[0];
                double b = point[1];
                return new double[] {
                    10.0 * (b - a * a),
                    1.0 - a
                };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        double a = point[0];
                        return new double[][] {
                            { -20.0 * a, 10.0 },
                            { -1.0, 0.0 }
                        };
                    }
                };
            }
        };

        double[] target = new double[] { 0.0, 0.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { -1.2, 1.0 };

        VectorialPointValuePair optimum = optimizer.optimize(function, target, weights, startPoint);

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-5);
    }

    @Test
    public void testOptimize_rankDeficientJacobian_success() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setQRRankingThreshold(1e-3);

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] {
                    point[0] + point[1],
                    point[0] + point[1],
                    point[0] + point[1]
                };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { 1.0, 0.0 },
                            { 1.0, 0.0 },
                            { 1.0, 0.0 }
                        };
                    }
                };
            }
        };

        double[] target = new double[] { 2.0, 2.0, 2.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        VectorialPointValuePair optimum = optimizer.optimize(function, target, weights, startPoint);
        Assert.assertNotNull(optimum);
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_infiniteJacobian_throwsOptimizationException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] { { Double.POSITIVE_INFINITY } };
                    }
                };
            }
        };

        double[] target = new double[] { 1.0 };
        double[] weights = new double[] { 1.0 };
        double[] startPoint = new double[] { 0.0 };

        optimizer.optimize(function, target, weights, startPoint);
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_nanJacobian_throwsOptimizationException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] { { Double.NaN } };
                    }
                };
            }
        };

        double[] target = new double[] { 1.0 };
        double[] weights = new double[] { 1.0 };
        double[] startPoint = new double[] { 0.0 };

        optimizer.optimize(function, target, weights, startPoint);
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_tooSmallMaxIterations_throwsOptimizationException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1);

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] {
                    Math.sin(point[0]) + Math.cos(point[1]),
                    Math.cos(point[0]) - Math.sin(point[1])
                };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { Math.cos(point[0]), -Math.sin(point[1]) },
                            { -Math.sin(point[0]), -Math.cos(point[1]) }
                        };
                    }
                };
            }
        };

        double[] target = new double[] { 0.0, 0.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 10.0, 10.0 };

        optimizer.optimize(function, target, weights, startPoint);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOptimize_mismatchedTargetAndWeights_throwsIllegalArgumentException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] { { 1.0 } };
                    }
                };
            }
        };

        double[] target = new double[] { 1.0, 2.0 };
        double[] weights = new double[] { 1.0 };
        double[] startPoint = new double[] { 0.0 };

        optimizer.optimize(function, target, weights, startPoint);
    }

    @Test(expected = FunctionEvaluationException.class)
    public void testOptimize_functionThrowsException_propagatesException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) throws FunctionEvaluationException {
                throw new FunctionEvaluationException(point[0]);
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] { { 1.0 } };
                    }
                };
            }
        };

        double[] target = new double[] { 1.0 };
        double[] weights = new double[] { 1.0 };
        double[] startPoint = new double[] { 0.0 };

        optimizer.optimize(function, target, weights, startPoint);
    }

    @Test
    public void testOptimize_zeroNormColumnHandling() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();

        DifferentiableMultivariateVectorialFunction function = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] point) {
                return new double[] { point[0] - 2.0, 0.0 };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] {
                            { 1.0, 0.0 },
                            { 0.0, 0.0 }
                        };
                    }
                };
            }
        };

        double[] target = new double[] { 0.0, 0.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        VectorialPointValuePair optimum = optimizer.optimize(function, target, weights, startPoint);
        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-6);
    }
}
