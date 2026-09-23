package org.apache.commons.math.optimization.general;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class LevenbergMarquardtOptimizer_determineLMParameter_203154176918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1064;
     Object term1136;
     Object term1138;
     Object term1140;
     Object term1141;
     Object term1148;
     Object term1152;

    public LevenbergMarquardtOptimizer_determineLMParameter_203154176918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1064 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term1066 = (double[]) newDoubleArray(4);
        double[] term1071 = (double[]) newDoubleArray(1);
        double[] term1073 = (double[]) newDoubleArray(0);
        int[] term1074 = (int[]) newIntArray(1);
        double[] term1078 = (double[]) newDoubleArray(5);
        Object[] term1089 = (Object[]) newArray("[D", 3);
        double[] term1090 = (double[]) newDoubleArray(2);
        double[] term1093 = (double[]) newDoubleArray(2);
        double[] term1096 = (double[]) newDoubleArray(5);
        double[] term1104 = (double[]) newDoubleArray(4);
        double[] term1109 = (double[]) newDoubleArray(8);
        double[] term1118 = (double[]) newDoubleArray(0);
        double[] term1119 = (double[]) newDoubleArray(5);
        double[] term1125 = (double[]) newDoubleArray(4);
        setIntField(term1064, term1064.getClass(), "solvedCols", 458147407);
        setDoubleElement(term1066, 0, 0.9214187038380094);
        setDoubleElement(term1066, 1, 0.1240028694334625);
        setDoubleElement(term1066, 2, 0.9336699309532178);
        setDoubleElement(term1066, 3, 0.18721227989825073);
        setField(term1064, term1064.getClass(), "diagR", term1066);
        setDoubleElement(term1071, 0, 0.2131256081762306);
        setField(term1064, term1064.getClass(), "jacNorm", term1071);
        setField(term1064, term1064.getClass(), "beta", term1073);
        setIntElement(term1074, 0, -184153539);
        setField(term1064, term1064.getClass(), "permutation", term1074);
        setIntField(term1064, term1064.getClass(), "rank", 493620644);
        setDoubleField(term1064, term1064.getClass(), "lmPar", 0.03588195391803095);
        setDoubleElement(term1078, 0, 0.7965158013308613);
        setDoubleElement(term1078, 1, 0.2875565287844002);
        setDoubleElement(term1078, 2, 0.18556961666156768);
        setDoubleElement(term1078, 3, 0.41801713209224123);
        setDoubleElement(term1078, 4, 0.010058361776520197);
        setField(term1064, term1064.getClass(), "lmDir", term1078);
        setDoubleField(term1064, term1064.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term1064, term1064.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term1064, term1064.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term1064, term1064.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term1064, term1064.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setField(term1064, term1064.getClass(), "checker", null);
        setDoubleElement(term1090, 0, 0.22206025307636057);
        setDoubleElement(term1090, 1, 0.3762445362551795);
        setElement(term1089, 0, term1090);
        setDoubleElement(term1093, 0, 0.6004517527698794);
        setDoubleElement(term1093, 1, 0.9412219458975137);
        setElement(term1089, 1, term1093);
        setDoubleElement(term1096, 0, 0.06469331916225318);
        setDoubleElement(term1096, 1, 0.9259830415214885);
        setDoubleElement(term1096, 2, 0.6688842921741369);
        setDoubleElement(term1096, 3, 0.8067108928296716);
        setDoubleElement(term1096, 4, 0.6293118636954493);
        setElement(term1089, 2, term1096);
        setField(term1064, term1064.getClass(), "jacobian", term1089);
        setIntField(term1064, term1064.getClass(), "cols", 1328271830);
        setIntField(term1064, term1064.getClass(), "rows", 1596070772);
        setDoubleElement(term1104, 0, 0.7705839211434976);
        setDoubleElement(term1104, 1, 0.08858836329417497);
        setDoubleElement(term1104, 2, 0.8582456540284578);
        setDoubleElement(term1104, 3, 0.061434557058998585);
        setField(term1064, term1064.getClass(), "targetValues", term1104);
        setDoubleElement(term1109, 0, 0.1621025751381594);
        setDoubleElement(term1109, 1, 0.8809657273235505);
        setDoubleElement(term1109, 2, 0.33296332053567956);
        setDoubleElement(term1109, 3, 0.593079122289713);
        setDoubleElement(term1109, 4, 0.7455431255888774);
        setDoubleElement(term1109, 5, 0.9459012738750242);
        setDoubleElement(term1109, 6, 0.967474946781822);
        setDoubleElement(term1109, 7, 0.4429892630967539);
        setField(term1064, term1064.getClass(), "residualsWeights", term1109);
        setField(term1064, term1064.getClass(), "point", term1118);
        setDoubleElement(term1119, 0, 0.10126144382177782);
        setDoubleElement(term1119, 1, 0.5029736700336335);
        setDoubleElement(term1119, 2, 0.2617673558897229);
        setDoubleElement(term1119, 3, 0.052590327313127294);
        setDoubleElement(term1119, 4, 0.004207750553928968);
        setField(term1064, term1064.getClass(), "objective", term1119);
        setDoubleElement(term1125, 0, 0.9107074560109533);
        setDoubleElement(term1125, 1, 0.22308265923522352);
        setDoubleElement(term1125, 2, 0.46226950865842764);
        setDoubleElement(term1125, 3, 0.6482086250011448);
        setField(term1064, term1064.getClass(), "residuals", term1125);
        setDoubleField(term1064, term1064.getClass(), "cost", 0.3154346482211354);
        setIntField(term1064, term1064.getClass(), "maxIterations", 1000);
        setIntField(term1064, term1064.getClass(), "iterations", 97029295);
        setIntField(term1064, term1064.getClass(), "maxEvaluations", 2147483647);
        setIntField(term1064, term1064.getClass(), "objectiveEvaluations", -1371869594);
        setIntField(term1064, term1064.getClass(), "jacobianEvaluations", -2095575670);
        setField(term1064, term1064.getClass(), "function", null);
        setField(term1064, term1064.getClass(), "jF", null);
        term1136 = (double[]) newDoubleArray(1);
        setDoubleElement(term1136, 0, 0.020103660328398276);
        term1138 = new Double(0.6530844366661772);
        term1140 = (double[]) newDoubleArray(0);
        term1141 = (double[]) newDoubleArray(6);
        setDoubleElement(term1141, 0, 0.7368078667856154);
        setDoubleElement(term1141, 1, 0.6799679189320558);
        setDoubleElement(term1141, 2, 0.8342190257129791);
        setDoubleElement(term1141, 3, 0.1057616236613994);
        setDoubleElement(term1141, 4, 0.6517567007639319);
        setDoubleElement(term1141, 5, 0.7471692213461502);
        term1148 = (double[]) newDoubleArray(3);
        setDoubleElement(term1148, 0, 0.20733693951275556);
        setDoubleElement(term1148, 1, 0.6618543228332953);
        setDoubleElement(term1148, 2, 0.8760632597672348);
        term1152 = (double[]) newDoubleArray(4);
        setDoubleElement(term1152, 0, 0.4046308665116508);
        setDoubleElement(term1152, 1, 0.3546618953364844);
        setDoubleElement(term1152, 2, 0.011186829850474256);
        setDoubleElement(term1152, 3, 0.47058253607311484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        argTypes[5] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[6];
        args[0] = term1136;
        args[1] = term1138;
        args[2] = term1140;
        args[3] = term1141;
        args[4] = term1148;
        args[5] = term1152;
        try {
            callMethod(klass, "determineLMParameter", argTypes, term1064, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


