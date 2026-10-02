package org.apache.commons.math.optimization.general;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction;
import org.apache.commons.math.analysis.MultivariateMatrixFunction;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.optimization.SimpleVectorialValueChecker;
import org.apache.commons.math.optimization.VectorialPointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class LevenbergMarquardtOptimizerTest {

    private static class LinearProblem implements DifferentiableMultivariateVectorialFunction {
        private final double[][] factors;
        private final double[] target;

        public LinearProblem(double[][] factors, double[] target) {
            this.factors = factors;
            this.target = target;
        }

        public double[] value(double[] variables) {
            double[] values = new double[factors.length];
            for (int i = 0; i < values.length; ++i) {
                values[i] = 0;
                for (int j = 0; j < variables.length; ++j) {
                    values[i] += factors[i][j] * variables[j];
                }
            }
            return values;
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return factors;
                }
            };
        }

        public double[] getTarget() {
            return target;
        }
    }

    private static class QuadraticProblem implements DifferentiableMultivariateVectorialFunction {
        public double[] value(double[] variables) {
            return new double[] {
                variables[0] * variables[0] + variables[1] * variables[1],
                variables[0] - variables[1]
            };
        }

        public MultivariateMatrixFunction jacobian() {
            return new MultivariateMatrixFunction() {
                public double[][] value(double[] point) {
                    return new double[][] {
                        { 2 * point[0], 2 * point[1] },
                        { 1.0, -1.0 }
                    };
                }
            };
        }
    }

    @Test
    public void testSettersAndGetters_defaultAndCustomValues_executedSuccessfully() {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(50.0);
        optimizer.setCostRelativeTolerance(1e-8);
        optimizer.setParRelativeTolerance(1e-8);
        optimizer.setOrthoTolerance(1e-8);
        optimizer.setMaxIterations(500);

        Assert.assertEquals(500, optimizer.getMaxIterations());
    }

    @Test
    public void testOptimize_simpleLinearProblem_convergesToExactSolution() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[][] factors = new double[][] {
            { 2.0, 1.0 },
            { 1.0, -1.0 }
        };
        double[] target = new double[] { 3.0, 0.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        LinearProblem problem = new LinearProblem(factors, target);
        VectorialPointValuePair optimum = optimizer.optimize(problem, target, weights, startPoint);

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-6);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-6);
        Assert.assertEquals(0.0, optimizer.getRMS(), 1e-6);
    }

    @Test
    public void testOptimize_nonlinearProblem_converges() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        QuadraticProblem problem = new QuadraticProblem();
        double[] target = new double[] { 2.0, 0.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 0.5, 0.5 };

        VectorialPointValuePair optimum = optimizer.optimize(problem, target, weights, startPoint);
        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-5);
    }

    @Test
    public void testOptimize_withConvergenceChecker_reachesConvergence() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setConvergenceChecker(new SimpleVectorialValueChecker(1e-6, 1e-6));

        double[][] factors = new double[][] { { 1.0, 0.0 }, { 0.0, 1.0 } };
        double[] target = new double[] { 5.0, 7.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        LinearProblem problem = new LinearProblem(factors, target);
        VectorialPointValuePair optimum = optimizer.optimize(problem, target, weights, startPoint);

        Assert.assertEquals(5.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(7.0, optimum.getPoint()[1], 1e-5);
    }

    @Test
    public void testOptimize_alreadyAtOptimumZeroCost_returnsImmediately() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[][] factors = new double[][] { { 1.0, 0.0 }, { 0.0, 1.0 } };
        double[] target = new double[] { 2.0, 3.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 2.0, 3.0 };

        LinearProblem problem = new LinearProblem(factors, target);
        VectorialPointValuePair optimum = optimizer.optimize(problem, target, weights, startPoint);

        Assert.assertEquals(2.0, optimum.getPoint()[0], 1e-8);
        Assert.assertEquals(3.0, optimum.getPoint()[1], 1e-8);
    }

    @Test
    public void testOptimize_rankDeficientJacobian_handlesRankDeficiency() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[][] factors = new double[][] {
            { 1.0, 2.0 },
            { 2.0, 4.0 }
        };
        double[] target = new double[] { 3.0, 6.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        LinearProblem problem = new LinearProblem(factors, target);
        VectorialPointValuePair optimum = optimizer.optimize(problem, target, weights, startPoint);

        double[] point = optimum.getPoint();
        Assert.assertEquals(3.0, 1.0 * point[0] + 2.0 * point[1], 1e-5);
    }

    @Test
    public void testOptimize_overDeterminedSystem_solvesCorrectly() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[][] factors = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 },
            { 1.0, 1.0 }
        };
        double[] target = new double[] { 1.0, 1.0, 2.0 };
        double[] weights = new double[] { 1.0, 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        LinearProblem problem = new LinearProblem(factors, target);
        VectorialPointValuePair optimum = optimizer.optimize(problem, target, weights, startPoint);

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-5);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-5);
    }

    @Test
    public void testOptimize_zeroInitialJacobianColumn_handlesZeroNormColumn() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        double[][] factors = new double[][] {
            { 1.0, 0.0 },
            { 2.0, 0.0 }
        };
        double[] target = new double[] { 1.0, 2.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 0.0, 0.0 };

        LinearProblem problem = new LinearProblem(factors, target);
        VectorialPointValuePair optimum = optimizer.optimize(problem, target, weights, startPoint);

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-5);
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_infiniteJacobian_throwsOptimizationException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        DifferentiableMultivariateVectorialFunction problem = new DifferentiableMultivariateVectorialFunction() {
            public double[] value(double[] variables) {
                return new double[] { variables[0] };
            }

            public MultivariateMatrixFunction jacobian() {
                return new MultivariateMatrixFunction() {
                    public double[][] value(double[] point) {
                        return new double[][] { { Double.POSITIVE_INFINITY } };
                    }
                };
            }
        };

        optimizer.optimize(problem, new double[] { 1.0 }, new double[] { 1.0 }, new double[] { 0.0 });
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_maxIterationsExceeded_throwsOptimizationException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setMaxIterations(1);
        optimizer.setCostRelativeTolerance(1e-20);
        optimizer.setParRelativeTolerance(1e-20);
        optimizer.setOrthoTolerance(1e-20);

        QuadraticProblem problem = new QuadraticProblem();
        optimizer.optimize(problem, new double[] { 10.0, 5.0 }, new double[] { 1.0, 1.0 }, new double[] { 0.1, 0.1 });
    }

    @Test(expected = OptimizationException.class)
    public void testOptimize_costToleranceTooSmall_throwsOptimizationException() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setCostRelativeTolerance(0.0);
        optimizer.setParRelativeTolerance(0.0);
        optimizer.setOrthoTolerance(0.0);

        double[][] factors = new double[][] {
            { 1.0, 0.0 },
            { 0.0, 1.0 }
        };
        double[] target = new double[] { 1.0, 1.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 1.0, 1.0 };

        LinearProblem problem = new LinearProblem(factors, target);
        optimizer.optimize(problem, target, weights, startPoint);
    }

    @Test
    public void testOptimize_stepBoundAdjustments_recoversAndConverges() throws Exception {
        LevenbergMarquardtOptimizer optimizer = new LevenbergMarquardtOptimizer();
        optimizer.setInitialStepBoundFactor(1e-4);

        double[][] factors = new double[][] {
            { 10.0, 1.0 },
            { 1.0, 10.0 }
        };
        double[] target = new double[] { 11.0, 11.0 };
        double[] weights = new double[] { 1.0, 1.0 };
        double[] startPoint = new double[] { 100.0, -100.0 };

        LinearProblem problem = new LinearProblem(factors, target);
        VectorialPointValuePair optimum = optimizer.optimize(problem, target, weights, startPoint);

        Assert.assertEquals(1.0, optimum.getPoint()[0], 1e-4);
        Assert.assertEquals(1.0, optimum.getPoint()[1], 1e-4);
    }
}
