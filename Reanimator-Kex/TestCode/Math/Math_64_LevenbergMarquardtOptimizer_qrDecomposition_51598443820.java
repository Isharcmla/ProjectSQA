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

public class LevenbergMarquardtOptimizer_qrDecomposition_51598443820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1385;

    public LevenbergMarquardtOptimizer_qrDecomposition_51598443820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1385 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term1387 = (double[]) newDoubleArray(8);
        double[] term1396 = (double[]) newDoubleArray(7);
        double[] term1404 = (double[]) newDoubleArray(2);
        int[] term1407 = (int[]) newIntArray(2);
        double[] term1412 = (double[]) newDoubleArray(8);
        Object[] term1426 = (Object[]) newArray("[D", 5);
        double[] term1427 = (double[]) newDoubleArray(6);
        double[] term1434 = (double[]) newDoubleArray(6);
        double[] term1441 = (double[]) newDoubleArray(7);
        double[] term1449 = (double[]) newDoubleArray(5);
        double[] term1455 = (double[]) newDoubleArray(2);
        double[] term1460 = (double[]) newDoubleArray(6);
        double[] term1467 = (double[]) newDoubleArray(1);
        double[] term1469 = (double[]) newDoubleArray(6);
        double[] term1476 = (double[]) newDoubleArray(8);
        double[] term1485 = (double[]) newDoubleArray(5);
        setIntField(term1385, term1385.getClass(), "solvedCols", -2027534003);
        setDoubleElement(term1387, 0, 0.5754903433429454);
        setDoubleElement(term1387, 1, 0.5128908508266724);
        setDoubleElement(term1387, 2, 0.3548098444455199);
        setDoubleElement(term1387, 3, 0.21420289639728962);
        setDoubleElement(term1387, 4, 0.7730078762317051);
        setDoubleElement(term1387, 5, 0.5645277595401526);
        setDoubleElement(term1387, 6, 0.25081064664364316);
        setDoubleElement(term1387, 7, 0.6171429441798344);
        setField(term1385, term1385.getClass(), "diagR", term1387);
        setDoubleElement(term1396, 0, 0.7042450068993633);
        setDoubleElement(term1396, 1, 0.8975545796030406);
        setDoubleElement(term1396, 2, 0.3031712642083415);
        setDoubleElement(term1396, 3, 0.8602777539261507);
        setDoubleElement(term1396, 4, 0.3043665728161581);
        setDoubleElement(term1396, 5, 0.9913552224565947);
        setDoubleElement(term1396, 6, 0.4966124252410027);
        setField(term1385, term1385.getClass(), "jacNorm", term1396);
        setDoubleElement(term1404, 0, 0.37123128056890065);
        setDoubleElement(term1404, 1, 0.7106040066640994);
        setField(term1385, term1385.getClass(), "beta", term1404);
        setIntElement(term1407, 0, 1063420942);
        setIntElement(term1407, 1, 1375330971);
        setField(term1385, term1385.getClass(), "permutation", term1407);
        setIntField(term1385, term1385.getClass(), "rank", -478195677);
        setDoubleField(term1385, term1385.getClass(), "lmPar", 0.9558229513823179);
        setDoubleElement(term1412, 0, 0.04341654576535725);
        setDoubleElement(term1412, 1, 0.6213999222429707);
        setDoubleElement(term1412, 2, 0.8524962128719791);
        setDoubleElement(term1412, 3, 0.9607682688593241);
        setDoubleElement(term1412, 4, 0.6925697954611718);
        setDoubleElement(term1412, 5, 0.4269446855123301);
        setDoubleElement(term1412, 6, 0.5334986794148128);
        setDoubleElement(term1412, 7, 0.16182948586501322);
        setField(term1385, term1385.getClass(), "lmDir", term1412);
        setDoubleField(term1385, term1385.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term1385, term1385.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term1385, term1385.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term1385, term1385.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term1385, term1385.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setField(term1385, term1385.getClass(), "checker", null);
        setDoubleElement(term1427, 0, 0.2190694321818214);
        setDoubleElement(term1427, 1, 0.39028347452315004);
        setDoubleElement(term1427, 2, 0.9452756892252447);
        setDoubleElement(term1427, 3, 0.7265543616081012);
        setDoubleElement(term1427, 4, 0.8691836681752382);
        setDoubleElement(term1427, 5, 0.9553804492342851);
        setElement(term1426, 0, term1427);
        setDoubleElement(term1434, 0, 0.951497914828045);
        setDoubleElement(term1434, 1, 0.5926415532310654);
        setDoubleElement(term1434, 2, 0.011084532735115116);
        setDoubleElement(term1434, 3, 0.7815751235487547);
        setDoubleElement(term1434, 4, 0.27972598243188085);
        setDoubleElement(term1434, 5, 0.2749003034310852);
        setElement(term1426, 1, term1434);
        setDoubleElement(term1441, 0, 0.6201564110803683);
        setDoubleElement(term1441, 1, 0.5283886615348917);
        setDoubleElement(term1441, 2, 0.9679677362359832);
        setDoubleElement(term1441, 3, 0.37830789098595463);
        setDoubleElement(term1441, 4, 0.5144161196478283);
        setDoubleElement(term1441, 5, 0.687690824750583);
        setDoubleElement(term1441, 6, 0.026755796057250425);
        setElement(term1426, 2, term1441);
        setDoubleElement(term1449, 0, 0.47161396910781994);
        setDoubleElement(term1449, 1, 0.4478633017907302);
        setDoubleElement(term1449, 2, 0.7998055139571558);
        setDoubleElement(term1449, 3, 0.2980983794282903);
        setDoubleElement(term1449, 4, 0.6292619847139933);
        setElement(term1426, 3, term1449);
        setDoubleElement(term1455, 0, 0.2682123119817419);
        setDoubleElement(term1455, 1, 0.2465788293643847);
        setElement(term1426, 4, term1455);
        setField(term1385, term1385.getClass(), "jacobian", term1426);
        setIntField(term1385, term1385.getClass(), "cols", 972867650);
        setIntField(term1385, term1385.getClass(), "rows", 1655935355);
        setDoubleElement(term1460, 0, 0.9194156323780788);
        setDoubleElement(term1460, 1, 0.2589672937578553);
        setDoubleElement(term1460, 2, 0.3503400017331547);
        setDoubleElement(term1460, 3, 0.8271286757001508);
        setDoubleElement(term1460, 4, 0.6335804422604819);
        setDoubleElement(term1460, 5, 0.7981127611687099);
        setField(term1385, term1385.getClass(), "targetValues", term1460);
        setDoubleElement(term1467, 0, 0.4279162427372558);
        setField(term1385, term1385.getClass(), "residualsWeights", term1467);
        setDoubleElement(term1469, 0, 0.49094002611486065);
        setDoubleElement(term1469, 1, 0.42544116787510533);
        setDoubleElement(term1469, 2, 0.4841923400566003);
        setDoubleElement(term1469, 3, 0.7630673805338225);
        setDoubleElement(term1469, 4, 0.9281656729617184);
        setDoubleElement(term1469, 5, 0.6107111302126562);
        setField(term1385, term1385.getClass(), "point", term1469);
        setDoubleElement(term1476, 0, 0.682853703128826);
        setDoubleElement(term1476, 1, 0.3175549148584229);
        setDoubleElement(term1476, 2, 0.19843723313022976);
        setDoubleElement(term1476, 3, 0.5548677303832933);
        setDoubleElement(term1476, 4, 0.1916613619544515);
        setDoubleElement(term1476, 5, 0.21883508391220008);
        setDoubleElement(term1476, 6, 0.21718677136334108);
        setDoubleElement(term1476, 7, 0.6577119694943789);
        setField(term1385, term1385.getClass(), "objective", term1476);
        setDoubleElement(term1485, 0, 0.5285216928887116);
        setDoubleElement(term1485, 1, 0.35049760295845667);
        setDoubleElement(term1485, 2, 0.7124244945678292);
        setDoubleElement(term1485, 3, 0.10349659570695524);
        setDoubleElement(term1485, 4, 0.46078217363073126);
        setField(term1385, term1385.getClass(), "residuals", term1485);
        setDoubleField(term1385, term1385.getClass(), "cost", 0.3389647053819348);
        setIntField(term1385, term1385.getClass(), "maxIterations", 1000);
        setIntField(term1385, term1385.getClass(), "iterations", -481533957);
        setIntField(term1385, term1385.getClass(), "maxEvaluations", 2147483647);
        setIntField(term1385, term1385.getClass(), "objectiveEvaluations", 1240914516);
        setIntField(term1385, term1385.getClass(), "jacobianEvaluations", -1465035361);
        setField(term1385, term1385.getClass(), "function", null);
        setField(term1385, term1385.getClass(), "jF", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "qrDecomposition", argTypes, term1385, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


