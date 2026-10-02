package org.apache.commons.math.optimization.direct;

import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.exception.MathIllegalStateException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.junit.Assert;
import org.junit.Test;

public class BOBYQAOptimizerTest {

    private static final double EPSILON = 1e-4;

    @Test
    public void testConstructor_singleArg() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(7);
        Assert.assertNotNull(optimizer);
    }

    @Test
    public void testConstructor_threeArgs() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(7, 5.0, 1e-6);
        Assert.assertNotNull(optimizer);
    }

    @Test(expected = NumberIsTooSmallException.class)
    public void testOptimize_dimensionTooSmall_throwsException() {
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(5);
        MultivariateFunction function = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0];
            }
        };
        optimizer.optimize(100, function, GoalType.MINIMIZE, new double[] { 1.0 }, new double[] { -10.0 }, new double[] { 10.0 });
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimize_interpolationPointsTooSmall_throwsException() {
        int dim = 2;
        int npt = dim + 1; // Lower bound is dim + 2 = 4
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);
        MultivariateFunction function = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        optimizer.optimize(100, function, GoalType.MINIMIZE, new double[] { 1.0, 1.0 }, new double[] { -10.0, -10.0 }, new double[] { 10.0, 10.0 });
    }

    @Test(expected = OutOfRangeException.class)
    public void testOptimize_interpolationPointsTooLarge_throwsException() {
        int dim = 2;
        int npt = (dim + 2) * (dim + 1) / 2 + 1; // Upper bound is 4 * 3 / 2 = 6, so 7 is too large
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt);
        MultivariateFunction function = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };
        optimizer.optimize(100, function, GoalType.MINIMIZE, new double[] { 1.0, 1.0 }, new double[] { -10.0, -10.0 }, new double[] { 10.0, 10.0 });
    }

    @Test
    public void testOptimize_sphereFunctionMinimize_findsOptimum() {
        int dim = 2;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6);
        MultivariateFunction sphere = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                double sum = 0;
                for (double v : point) {
                    sum += v * v;
                }
                return sum;
            }
        };

        double[] start = new double[] { 3.0, 4.0 };
        double[] lower = new double[] { -10.0, -10.0 };
        double[] upper = new double[] { 10.0, 10.0 };

        RealPointValuePair result = optimizer.optimize(200, sphere, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertEquals(0.0, result.getPoint()[0], EPSILON);
        Assert.assertEquals(0.0, result.getPoint()[1], EPSILON);
        Assert.assertEquals(0.0, result.getValue(), EPSILON);
    }

    @Test
    public void testOptimize_sphereFunctionMaximize_findsOptimum() {
        int dim = 2;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6);
        MultivariateFunction invertedSphere = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                double sum = 0;
                for (double v : point) {
                    sum += (v - 1.0) * (v - 1.0);
                }
                return 10.0 - sum;
            }
        };

        double[] start = new double[] { 3.0, -2.0 };
        double[] lower = new double[] { -10.0, -10.0 };
        double[] upper = new double[] { 10.0, 10.0 };

        RealPointValuePair result = optimizer.optimize(200, invertedSphere, GoalType.MAXIMIZE, start, lower, upper);
        Assert.assertEquals(1.0, result.getPoint()[0], EPSILON);
        Assert.assertEquals(1.0, result.getPoint()[1], EPSILON);
        Assert.assertEquals(10.0, result.getValue(), EPSILON);
    }

    @Test
    public void testOptimize_rosenbrock_findsMinimum() {
        int dim = 2;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6, 2.0, 1e-8);
        MultivariateFunction rosenbrock = new MultivariateFunction() {
            @Override
            public double value(double[] x) {
                double a = x[1] - x[0] * x[0];
                double b = 1.0 - x[0];
                return 100.0 * a * a + b * b;
            }
        };

        double[] start = new double[] { -1.2, 1.0 };
        double[] lower = new double[] { -5.0, -5.0 };
        double[] upper = new double[] { 5.0, 5.0 };

        RealPointValuePair result = optimizer.optimize(1000, rosenbrock, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertEquals(1.0, result.getPoint()[0], 1e-2);
        Assert.assertEquals(1.0, result.getPoint()[1], 1e-2);
        Assert.assertEquals(0.0, result.getValue(), 1e-2);
    }

    @Test
    public void testOptimize_narrowBounds_adjustsInitialRadius() {
        int dim = 2;
        // Default initial radius is 10.0, requiredMinDiff = 20.0
        // Upper - Lower = 2.0 < 20.0, triggers initialTrustRegionRadius = minDiff / 3.0
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6);
        MultivariateFunction sphere = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return (point[0] - 0.5) * (point[0] - 0.5) + (point[1] - 0.5) * (point[1] - 0.5);
            }
        };

        double[] start = new double[] { 0.2, 0.2 };
        double[] lower = new double[] { 0.0, 0.0 };
        double[] upper = new double[] { 1.0, 1.0 };

        RealPointValuePair result = optimizer.optimize(300, sphere, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertEquals(0.5, result.getPoint()[0], EPSILON);
        Assert.assertEquals(0.5, result.getPoint()[1], EPSILON);
        Assert.assertEquals(0.0, result.getValue(), EPSILON);
    }

    @Test
    public void testOptimize_startAtLowerBound_handlesBoundConstraints() {
        int dim = 2;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6, 1.0, 1e-6);
        MultivariateFunction sphere = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return (point[0] - 2.0) * (point[0] - 2.0) + (point[1] - 2.0) * (point[1] - 2.0);
            }
        };

        double[] start = new double[] { 0.0, 0.0 };
        double[] lower = new double[] { 0.0, 0.0 };
        double[] upper = new double[] { 5.0, 5.0 };

        RealPointValuePair result = optimizer.optimize(300, sphere, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertEquals(2.0, result.getPoint()[0], EPSILON);
        Assert.assertEquals(2.0, result.getPoint()[1], EPSILON);
    }

    @Test
    public void testOptimize_startAtUpperBound_handlesBoundConstraints() {
        int dim = 2;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6, 1.0, 1e-6);
        MultivariateFunction sphere = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return (point[0] - 3.0) * (point[0] - 3.0) + (point[1] - 3.0) * (point[1] - 3.0);
            }
        };

        double[] start = new double[] { 5.0, 5.0 };
        double[] lower = new double[] { 0.0, 0.0 };
        double[] upper = new double[] { 5.0, 5.0 };

        RealPointValuePair result = optimizer.optimize(300, sphere, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertEquals(3.0, result.getPoint()[0], EPSILON);
        Assert.assertEquals(3.0, result.getPoint()[1], EPSILON);
    }

    @Test
    public void testOptimize_constrainedMinimumOnBound() {
        int dim = 2;
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6, 1.0, 1e-6);
        // Minimum is at (-2, -2) which is outside bounds [0, 5]
        MultivariateFunction sphere = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return (point[0] + 2.0) * (point[0] + 2.0) + (point[1] + 2.0) * (point[1] + 2.0);
            }
        };

        double[] start = new double[] { 2.0, 2.0 };
        double[] lower = new double[] { 0.0, 0.0 };
        double[] upper = new double[] { 5.0, 5.0 };

        RealPointValuePair result = optimizer.optimize(300, sphere, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertEquals(0.0, result.getPoint()[0], EPSILON);
        Assert.assertEquals(0.0, result.getPoint()[1], EPSILON);
        Assert.assertEquals(8.0, result.getValue(), EPSILON);
    }

    @Test
    public void testOptimize_higherDimension3D() {
        int dim = 3;
        int npt = (dim + 2); // 5 points
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(npt, 2.0, 1e-6);
        MultivariateFunction function = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return (point[0] - 1.0) * (point[0] - 1.0) +
                       (point[1] - 2.0) * (point[1] - 2.0) +
                       (point[2] - 3.0) * (point[2] - 3.0);
            }
        };

        double[] start = new double[] { 0.0, 0.0, 0.0 };
        double[] lower = new double[] { -10.0, -10.0, -10.0 };
        double[] upper = new double[] { 10.0, 10.0, 10.0 };

        RealPointValuePair result = optimizer.optimize(500, function, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertEquals(1.0, result.getPoint()[0], EPSILON);
        Assert.assertEquals(2.0, result.getPoint()[1], EPSILON);
        Assert.assertEquals(3.0, result.getPoint()[2], EPSILON);
        Assert.assertEquals(0.0, result.getValue(), EPSILON);
    }

    @Test
    public void testOptimize_radiusReductionBranches() {
        int dim = 2;
        // Test stoppingTrustRegionRadius where ratio rho/stoppingTrustRegionRadius goes through various branches
        BOBYQAOptimizer optimizer = new BOBYQAOptimizer(6, 10.0, 1.0); // ratio = 10 <= 16
        MultivariateFunction sphere = new MultivariateFunction() {
            @Override
            public double value(double[] point) {
                return point[0] * point[0] + point[1] * point[1];
            }
        };

        double[] start = new double[] { 3.0, 3.0 };
        double[] lower = new double[] { -100.0, -100.0 };
        double[] upper = new double[] { 100.0, 100.0 };

        RealPointValuePair result = optimizer.optimize(300, sphere, GoalType.MINIMIZE, start, lower, upper);
        Assert.assertNotNull(result);
    }
}
