package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_qrDecomposition_98326828119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605;

    public LevenbergMarquardtOptimizer_qrDecomposition_98326828119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term605 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term607 = (double[]) newDoubleArray(9);
        double[] term617 = (double[]) newDoubleArray(7);
        double[] term625 = (double[]) newDoubleArray(6);
        int[] term632 = (int[]) newIntArray(7);
        double[] term642 = (double[]) newDoubleArray(9);
        double[] term657 = (double[]) newDoubleArray(7);
        Object[] term665 = (Object[]) newArray("[D", 6);
        double[] term666 = (double[]) newDoubleArray(6);
        double[] term673 = (double[]) newDoubleArray(0);
        double[] term674 = (double[]) newDoubleArray(6);
        double[] term681 = (double[]) newDoubleArray(5);
        double[] term687 = (double[]) newDoubleArray(1);
        double[] term689 = (double[]) newDoubleArray(0);
        double[] term691 = (double[]) newDoubleArray(6);
        double[] term698 = (double[]) newDoubleArray(5);
        double[] term704 = (double[]) newDoubleArray(1);
        double[] term706 = (double[]) newDoubleArray(4);
        Object term711 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term714 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term715 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term718 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term605, term605.getClass(), "solvedCols", 1725571209);
        setDoubleElement(term607, 0, 0.3147638130628596);
        setDoubleElement(term607, 1, 0.24810335047389354);
        setDoubleElement(term607, 2, 0.9113409083257852);
        setDoubleElement(term607, 3, 0.7444535250398684);
        setDoubleElement(term607, 4, 0.37439559220953034);
        setDoubleElement(term607, 5, 0.5010337159337968);
        setDoubleElement(term607, 6, 0.33871772875627537);
        setDoubleElement(term607, 7, 0.9952003100858836);
        setDoubleElement(term607, 8, 0.22059525284415726);
        setField(term605, term605.getClass(), "diagR", term607);
        setDoubleElement(term617, 0, 0.281059649526194);
        setDoubleElement(term617, 1, 0.049786419821445604);
        setDoubleElement(term617, 2, 0.8814078959581401);
        setDoubleElement(term617, 3, 0.47210750955444725);
        setDoubleElement(term617, 4, 0.8381176594884352);
        setDoubleElement(term617, 5, 0.23070800524236523);
        setDoubleElement(term617, 6, 0.4337266793917268);
        setField(term605, term605.getClass(), "jacNorm", term617);
        setDoubleElement(term625, 0, 0.11979392765421404);
        setDoubleElement(term625, 1, 0.4555542221910589);
        setDoubleElement(term625, 2, 0.9938727080758785);
        setDoubleElement(term625, 3, 0.39416780533640805);
        setDoubleElement(term625, 4, 0.5384156574050297);
        setDoubleElement(term625, 5, 0.28813953022653416);
        setField(term605, term605.getClass(), "beta", term625);
        setIntElement(term632, 0, -522618178);
        setIntElement(term632, 1, 1134449235);
        setIntElement(term632, 2, -883034806);
        setIntElement(term632, 3, 1585847225);
        setIntElement(term632, 4, 597278769);
        setIntElement(term632, 5, -1685132342);
        setIntElement(term632, 6, -1456670397);
        setField(term605, term605.getClass(), "permutation", term632);
        setIntField(term605, term605.getClass(), "rank", 1622346318);
        setDoubleField(term605, term605.getClass(), "lmPar", 0.6221715730666386);
        setDoubleElement(term642, 0, 0.6375926466054153);
        setDoubleElement(term642, 1, 0.6933516214415875);
        setDoubleElement(term642, 2, 0.7039847711405768);
        setDoubleElement(term642, 3, 0.7157998497507287);
        setDoubleElement(term642, 4, 0.8399796378537906);
        setDoubleElement(term642, 5, 0.009446329384675933);
        setDoubleElement(term642, 6, 0.20131600000037786);
        setDoubleElement(term642, 7, 0.332320568233212);
        setDoubleElement(term642, 8, 0.18561351983828822);
        setField(term605, term605.getClass(), "lmDir", term642);
        setDoubleField(term605, term605.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term605, term605.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term605, term605.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term605, term605.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term605, term605.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setDoubleElement(term657, 0, 0.9678135126533798);
        setDoubleElement(term657, 1, 0.3275035827937727);
        setDoubleElement(term657, 2, 0.13747524521333288);
        setDoubleElement(term657, 3, 0.7149120009558162);
        setDoubleElement(term657, 4, 0.0013046823258857643);
        setDoubleElement(term657, 5, 0.5404409545293147);
        setDoubleElement(term657, 6, 0.9172358414700745);
        setField(term605, term605.getClass(), "weightedResidual", term657);
        setDoubleElement(term666, 0, 0.3804251745476508);
        setDoubleElement(term666, 1, 0.6704848280926606);
        setDoubleElement(term666, 2, 0.6213122016266206);
        setDoubleElement(term666, 3, 0.540850203722707);
        setDoubleElement(term666, 4, 6.134294677928587E-4);
        setDoubleElement(term666, 5, 0.41934015614685227);
        setElement(term665, 0, term666);
        setElement(term665, 1, term673);
        setDoubleElement(term674, 0, 0.07298304401683597);
        setDoubleElement(term674, 1, 0.6101411757610665);
        setDoubleElement(term674, 2, 0.07932996853888874);
        setDoubleElement(term674, 3, 0.4335752168808029);
        setDoubleElement(term674, 4, 0.9196949182738653);
        setDoubleElement(term674, 5, 0.5820770579753712);
        setElement(term665, 2, term674);
        setDoubleElement(term681, 0, 0.8935041663395363);
        setDoubleElement(term681, 1, 0.2542403704113868);
        setDoubleElement(term681, 2, 0.4614378239284842);
        setDoubleElement(term681, 3, 0.10963898027157926);
        setDoubleElement(term681, 4, 0.34234234602085223);
        setElement(term665, 3, term681);
        setDoubleElement(term687, 0, 0.8355624480198577);
        setElement(term665, 4, term687);
        setElement(term665, 5, term689);
        setField(term605, term605.getClass(), "weightedJacobian", term665);
        setField(term605, term605.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term605, term605.getClass(), "cost", 0.8303221706066055);
        setField(term605, term605.getClass(), "jacobian", null);
        setDoubleElement(term691, 0, 0.7102687477135848);
        setDoubleElement(term691, 1, 0.7984332537471793);
        setDoubleElement(term691, 2, 0.6782349539183316);
        setDoubleElement(term691, 3, 0.6464654528667407);
        setDoubleElement(term691, 4, 0.6416885379658445);
        setDoubleElement(term691, 5, 0.604465128384297);
        setField(term605, term605.getClass(), "target", term691);
        setField(term605, term605.getClass(), "weightMatrix", null);
        setField(term605, term605.getClass(), "model", null);
        setDoubleElement(term698, 0, 0.5180566811475131);
        setDoubleElement(term698, 1, 0.6773553630262286);
        setDoubleElement(term698, 2, 0.0416412064984476);
        setDoubleElement(term698, 3, 0.9188322321077216);
        setDoubleElement(term698, 4, 0.8046904246652031);
        setField(term605, term605.getClass(), "start", term698);
        setDoubleElement(term704, 0, 0.16734523112870836);
        setField(term605, term605.getClass(), "lowerBound", term704);
        setDoubleElement(term706, 0, 0.9711083796772954);
        setDoubleElement(term706, 1, 0.329228491476264);
        setDoubleElement(term706, 2, 0.8664463700873805);
        setDoubleElement(term706, 3, 0.4228841212022646);
        setField(term605, term605.getClass(), "upperBound", term706);
        setIntField(term711, term711.getClass(), "maximalCount", 0);
        setIntField(term711, term711.getClass(), "count", 0);
        setField(term711, term711.getClass(), "maxCountCallback", term714);
        setField(term605, term605.getClass(), "evaluations", term711);
        setIntField(term715, term715.getClass(), "maximalCount", 0);
        setIntField(term715, term715.getClass(), "count", 0);
        setField(term715, term715.getClass(), "maxCountCallback", term718);
        setField(term605, term605.getClass(), "iterations", term715);
        setField(term605, term605.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "qrDecomposition", argTypes, term605, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


