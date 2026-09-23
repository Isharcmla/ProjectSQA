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
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LevenbergMarquardtOptimizer_doOptimize_151110600616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;

    public LevenbergMarquardtOptimizer_doOptimize_151110600616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer"));
        double[] term29 = (double[]) newDoubleArray(5);
        double[] term35 = (double[]) newDoubleArray(4);
        double[] term40 = (double[]) newDoubleArray(3);
        int[] term44 = (int[]) newIntArray(4);
        double[] term51 = (double[]) newDoubleArray(1);
        double[] term58 = (double[]) newDoubleArray(6);
        Object[] term65 = (Object[]) newArray("[D", 2);
        double[] term66 = (double[]) newDoubleArray(6);
        double[] term73 = (double[]) newDoubleArray(7);
        double[] term82 = (double[]) newDoubleArray(1);
        double[] term84 = (double[]) newDoubleArray(6);
        double[] term91 = (double[]) newDoubleArray(5);
        double[] term97 = (double[]) newDoubleArray(5);
        Object term103 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term106 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback"));
        Object term107 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term110 = newInstance(Class.forName("org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback"));
        setIntField(term27, term27.getClass(), "solvedCols", 568599855);
        setDoubleElement(term29, 0, 0.1374549299694151);
        setDoubleElement(term29, 1, 0.7031006357544823);
        setDoubleElement(term29, 2, 0.9527281779865117);
        setDoubleElement(term29, 3, 0.9828442029246764);
        setDoubleElement(term29, 4, 0.2779719046761513);
        setField(term27, term27.getClass(), "diagR", term29);
        setDoubleElement(term35, 0, 0.6436713023569729);
        setDoubleElement(term35, 1, 0.7332741045694002);
        setDoubleElement(term35, 2, 0.4569171842750229);
        setDoubleElement(term35, 3, 0.8598297828918529);
        setField(term27, term27.getClass(), "jacNorm", term35);
        setDoubleElement(term40, 0, 0.43692187681405226);
        setDoubleElement(term40, 1, 0.7633268466829064);
        setDoubleElement(term40, 2, 0.13481025392611334);
        setField(term27, term27.getClass(), "beta", term40);
        setIntElement(term44, 0, 1162663216);
        setIntElement(term44, 1, 1484323161);
        setIntElement(term44, 2, 391863371);
        setIntElement(term44, 3, -1922583790);
        setField(term27, term27.getClass(), "permutation", term44);
        setIntField(term27, term27.getClass(), "rank", -616727354);
        setDoubleField(term27, term27.getClass(), "lmPar", 0.3800088629986428);
        setDoubleElement(term51, 0, 0.5840714198152577);
        setField(term27, term27.getClass(), "lmDir", term51);
        setDoubleField(term27, term27.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term27, term27.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term27, term27.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term27, term27.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term27, term27.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setDoubleElement(term58, 0, 0.7559240768573477);
        setDoubleElement(term58, 1, 0.10667076642995188);
        setDoubleElement(term58, 2, 0.11493000848982304);
        setDoubleElement(term58, 3, 0.37161417339133307);
        setDoubleElement(term58, 4, 0.6805867182029153);
        setDoubleElement(term58, 5, 0.2852810965221698);
        setField(term27, term27.getClass(), "weightedResidual", term58);
        setDoubleElement(term66, 0, 0.6300849762307866);
        setDoubleElement(term66, 1, 0.9737083944266686);
        setDoubleElement(term66, 2, 0.0668892744806211);
        setDoubleElement(term66, 3, 0.3587267442738795);
        setDoubleElement(term66, 4, 0.07802449704920456);
        setDoubleElement(term66, 5, 0.5279279537140873);
        setElement(term65, 0, term66);
        setDoubleElement(term73, 0, 0.3202192021706908);
        setDoubleElement(term73, 1, 0.22651340641904605);
        setDoubleElement(term73, 2, 0.8878841294187743);
        setDoubleElement(term73, 3, 0.6588948704887806);
        setDoubleElement(term73, 4, 0.6397214730945112);
        setDoubleElement(term73, 5, 0.25937345430928016);
        setDoubleElement(term73, 6, 0.5873228247510078);
        setElement(term65, 1, term73);
        setField(term27, term27.getClass(), "weightedJacobian", term65);
        setField(term27, term27.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term27, term27.getClass(), "cost", 0.8823181080774973);
        setField(term27, term27.getClass(), "jacobian", null);
        setDoubleElement(term82, 0, 0.2192450926212024);
        setField(term27, term27.getClass(), "target", term82);
        setField(term27, term27.getClass(), "weightMatrix", null);
        setField(term27, term27.getClass(), "model", null);
        setDoubleElement(term84, 0, 0.7591353014991907);
        setDoubleElement(term84, 1, 0.791695029600875);
        setDoubleElement(term84, 2, 0.6862221294683138);
        setDoubleElement(term84, 3, 0.15917839663695388);
        setDoubleElement(term84, 4, 0.9374115574082594);
        setDoubleElement(term84, 5, 0.8454723071922143);
        setField(term27, term27.getClass(), "start", term84);
        setDoubleElement(term91, 0, 0.8566567697571895);
        setDoubleElement(term91, 1, 0.9203805380592256);
        setDoubleElement(term91, 2, 0.5804948995371725);
        setDoubleElement(term91, 3, 0.20737514139742264);
        setDoubleElement(term91, 4, 0.7919370314903882);
        setField(term27, term27.getClass(), "lowerBound", term91);
        setDoubleElement(term97, 0, 0.2109867221632754);
        setDoubleElement(term97, 1, 0.3227335400819148);
        setDoubleElement(term97, 2, 0.43337207054070237);
        setDoubleElement(term97, 3, 0.13246999699526574);
        setDoubleElement(term97, 4, 0.9126850255993704);
        setField(term27, term27.getClass(), "upperBound", term97);
        setIntField(term103, term103.getClass(), "maximalCount", 0);
        setIntField(term103, term103.getClass(), "count", 0);
        setField(term103, term103.getClass(), "maxCountCallback", term106);
        setField(term27, term27.getClass(), "evaluations", term103);
        setIntField(term107, term107.getClass(), "maximalCount", 0);
        setIntField(term107, term107.getClass(), "count", 0);
        setField(term107, term107.getClass(), "maxCountCallback", term110);
        setField(term27, term27.getClass(), "iterations", term107);
        setField(term27, term27.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term27, args);
            assertTrue(false);
        }
        catch (MathUnsupportedOperationException e) {
        }

    }

};


