import org.junit.Test;
import org.junit.Assert;

import org.apache.commons.math3.analysis.MultivariateVectorFunction;
import org.apache.commons.math3.analysis.MultivariateMatrixFunction;
import org.apache.commons.math3.exception.ConvergenceException;
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.optim.InitialGuess;
import org.apache.commons.math3.optim.MaxEval;
import org.apache.commons.math3.optim.PointVectorValuePair;
import org.apache.commons.math3.optim.SimpleBounds;
import org.apache.commons.math3.optim.SimpleVectorValueChecker;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunction;
import org.apache.commons.math3.optim.nonlinear.vector.ModelFunctionJacobian;
import org.apache.commons.math3.optim.nonlinear.vector.Target;
import org.apache.commons.math3.optim.nonlinear.vector.Weight;
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer;

public class GaussNewtonOptimizerTest {

    // x-values used for a simple linear model: y = a*x + b
    private static final double[] XS = {1.0, 2.0, 3.0};

    private MultivariateVectorFunction linearModel() {
        return new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                double[] result = new double[XS.length];
                for (int i = 0; i < XS.length; i++) {
                    result[i] = point[0] * XS[i] + point[1];
                }
                return result;
            }
        };
    }

    private MultivariateMatrixFunction linearJacobian() {
        return new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                double[][] jac = new double[XS.length][2];
                for (int i = 0; i < XS.length; i++) {
                    jac[i][0] = XS[i];
                    jac[i][1] = 1.0;
                }
                return jac;
            }
        };
    }

    @Test
    public void testOptimize_LinearFitWithLU_ConvergesToExpectedSolution() {
        // a_true = 2, b_true = 3 -> y = 2x + 3
        double[] target = {5.0, 7.0, 9.0};

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
                true, new SimpleVectorValueChecker(1e-8, 1e-8));

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new Target(target),
                new Weight(new double[] {1.0, 1.0, 1.0}),
                new InitialGuess(new double[] {0.0, 0.0}),
                new ModelFunction(linearModel()),
                new ModelFunctionJacobian(linearJacobian()));

        double[] point = result.getPoint();
        Assert.assertEquals(2.0, point[0], 1e-6);
        Assert.assertEquals(3.0, point[1], 1e-6);
        Assert.assertEquals(0.0, optimizer.getRMS(), 1e-6);
    }

    @Test
    public void testOptimize_LinearFitWithQR_ConvergesToExpectedSolution() {
        // a_true = -1, b_true = 4 -> y = -x + 4
        double[] target = {3.0, 2.0, 1.0};

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
                false, new SimpleVectorValueChecker(1e-8, 1e-8));

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new Target(target),
                new Weight(new double[] {1.0, 1.0, 1.0}),
                new InitialGuess(new double[] {0.0, 0.0}),
                new ModelFunction(linearModel()),
                new ModelFunctionJacobian(linearJacobian()));

        double[] point = result.getPoint();
        Assert.assertEquals(-1.0, point[0], 1e-6);
        Assert.assertEquals(4.0, point[1], 1e-6);
    }

    @Test
    public void testConstructor_DefaultUsesLU_ProducesSameResultAsExplicitLU() {
        double[] target = {5.0, 7.0, 9.0};

        GaussNewtonOptimizer defaultOptimizer =
                new GaussNewtonOptimizer(new SimpleVectorValueChecker(1e-8, 1e-8));

        PointVectorValuePair result = defaultOptimizer.optimize(
                new MaxEval(1000),
                new Target(target),
                new Weight(new double[] {1.0, 1.0, 1.0}),
                new InitialGuess(new double[] {0.0, 0.0}),
                new ModelFunction(linearModel()),
                new ModelFunctionJacobian(linearJacobian()));

        double[] point = result.getPoint();
        Assert.assertEquals(2.0, point[0], 1e-6);
        Assert.assertEquals(3.0, point[1], 1e-6);
    }

    @Test
    public void testOptimize_InitialGuessAlreadyOptimal_ConvergesImmediately() {
        // Initial guess equals the exact solution; target is consistent with it.
        double[] target = {5.0, 7.0, 9.0}; // matches a=2, b=3

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
                true, new SimpleVectorValueChecker(1e-8, 1e-8));

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new Target(target),
                new Weight(new double[] {1.0, 1.0, 1.0}),
                new InitialGuess(new double[] {2.0, 3.0}),
                new ModelFunction(linearModel()),
                new ModelFunctionJacobian(linearJacobian()));

        double[] point = result.getPoint();
        Assert.assertEquals(2.0, point[0], 1e-9);
        Assert.assertEquals(3.0, point[1], 1e-9);
        Assert.assertEquals(0.0, optimizer.getCost(), 1e-9);
    }

    @Test(expected = ConvergenceException.class)
    public void testOptimize_SingularNormalMatrix_ThrowsConvergenceException() {
        // A model whose jacobian rows are always identical for both parameters
        // leads to a rank-deficient (singular) normal matrix.
        MultivariateVectorFunction model = new MultivariateVectorFunction() {
            @Override
            public double[] value(double[] point) {
                double[] result = new double[3];
                for (int i = 0; i < 3; i++) {
                    result[i] = point[0] + point[1];
                }
                return result;
            }
        };

        MultivariateMatrixFunction jacobian = new MultivariateMatrixFunction() {
            @Override
            public double[][] value(double[] point) {
                double[][] jac = new double[3][2];
                for (int i = 0; i < 3; i++) {
                    jac[i][0] = 1.0;
                    jac[i][1] = 1.0;
                }
                return jac;
            }
        };

        double[] target = {1.0, 2.0, 3.0};

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
                true, new SimpleVectorValueChecker(1e-8, 1e-8));

        optimizer.optimize(
                new MaxEval(1000),
                new Target(target),
                new Weight(new double[] {1.0, 1.0, 1.0}),
                new InitialGuess(new double[] {0.0, 0.0}),
                new ModelFunction(model),
                new ModelFunctionJacobian(jacobian));
    }

    @Test(expected = MathUnsupportedOperationException.class)
    public void testOptimize_WithBounds_ThrowsMathUnsupportedOperationException() {
        double[] target = {5.0, 7.0, 9.0};

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
                true, new SimpleVectorValueChecker(1e-8, 1e-8));

        optimizer.optimize(
                new MaxEval(1000),
                new Target(target),
                new Weight(new double[] {1.0, 1.0, 1.0}),
                new InitialGuess(new double[] {0.0, 0.0}),
                new ModelFunction(linearModel()),
                new ModelFunctionJacobian(linearJacobian()),
                new SimpleBounds(new double[] {-10.0, -10.0}, new double[] {10.0, 10.0}));
    }

    @Test(expected = NullArgumentException.class)
    public void testOptimize_NullConvergenceChecker_ThrowsNullArgumentException() {
        double[] target = {5.0, 7.0, 9.0};

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(true, null);

        optimizer.optimize(
                new MaxEval(1000),
                new Target(target),
                new Weight(new double[] {1.0, 1.0, 1.0}),
                new InitialGuess(new double[] {0.0, 0.0}),
                new ModelFunction(linearModel()),
                new ModelFunctionJacobian(linearJacobian()));
    }

    @Test
    public void testOptimize_NegativeTargetValues_ConvergesCorrectly() {
        // a_true = 3, b_true = -5 -> y = 3x - 5
        double[] target = {-2.0, 1.0, 4.0};

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
                true, new SimpleVectorValueChecker(1e-8, 1e-8));

        PointVectorValuePair result = optimizer.optimize(
                new MaxEval(1000),
                new Target(target),
                new Weight(new double[] {1.0, 1.0, 1.0}),
                new InitialGuess(new double[] {0.0, 0.0}),
                new ModelFunction(linearModel()),
                new ModelFunctionJacobian(linearJacobian()));

        double[] point = result.getPoint();
        Assert.assertEquals(3.0, point[0], 1e-6);
        Assert.assertEquals(-5.0, point[1], 1e-6);
    }

    @Test
    public void testGetRMS_AfterSuccessfulOptimization_ReturnsNonNegativeValue() {
        double[] target = {5.0, 7.0, 9.0};

        GaussNewtonOptimizer optimizer = new GaussNewtonOptimizer(
                true, new SimpleVectorValueChecker(1e-8, 1e-8));

        optimizer.optimize(
                new MaxEval(1000),
                new Target(target),
                new Weight(new double[] {1.0, 1.0, 1.0}),
                new InitialGuess(new double[] {0.0, 0.0}),
                new ModelFunction(linearModel()),
                new ModelFunctionJacobian(linearJacobian()));

        Assert.assertTrue(optimizer.getRMS() >= 0.0);
        Assert.assertTrue(optimizer.getCost() >= 0.0);
    }
}
