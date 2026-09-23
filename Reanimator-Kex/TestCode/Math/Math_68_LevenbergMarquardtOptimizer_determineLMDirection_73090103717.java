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

public class LevenbergMarquardtOptimizer_determineLMDirection_73090103717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103;
     Object term1212;
     Object term1216;
     Object term1217;
     Object term1223;

    public LevenbergMarquardtOptimizer_determineLMDirection_73090103717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1103 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term1105 = (double[]) newDoubleArray(3);
        double[] term1109 = (double[]) newDoubleArray(2);
        double[] term1112 = (double[]) newDoubleArray(2);
        int[] term1115 = (int[]) newIntArray(5);
        double[] term1123 = (double[]) newDoubleArray(4);
        Object term1132 = newInstance(Class.forName("org.apache.commons.math.optimization.SimpleVectorialValueChecker"));
        Object[] term1135 = (Object[]) newArray("[D", 8);
        double[] term1136 = (double[]) newDoubleArray(0);
        double[] term1137 = (double[]) newDoubleArray(5);
        double[] term1143 = (double[]) newDoubleArray(4);
        double[] term1148 = (double[]) newDoubleArray(1);
        double[] term1150 = (double[]) newDoubleArray(0);
        double[] term1151 = (double[]) newDoubleArray(6);
        double[] term1158 = (double[]) newDoubleArray(3);
        double[] term1162 = (double[]) newDoubleArray(4);
        double[] term1169 = (double[]) newDoubleArray(5);
        double[] term1175 = (double[]) newDoubleArray(8);
        double[] term1184 = (double[]) newDoubleArray(8);
        double[] term1193 = (double[]) newDoubleArray(5);
        double[] term1199 = (double[]) newDoubleArray(6);
        setIntField(term1103, term1103.getClass(), "solvedCols", 458147407);
        setDoubleElement(term1105, 0, 0.22206025307636057);
        setDoubleElement(term1105, 1, 0.3762445362551795);
        setDoubleElement(term1105, 2, 0.6004517527698794);
        setField(term1103, term1103.getClass(), "diagR", term1105);
        setDoubleElement(term1109, 0, 0.9412219458975137);
        setDoubleElement(term1109, 1, 0.06469331916225318);
        setField(term1103, term1103.getClass(), "jacNorm", term1109);
        setDoubleElement(term1112, 0, 0.9259830415214885);
        setDoubleElement(term1112, 1, 0.6688842921741369);
        setField(term1103, term1103.getClass(), "beta", term1112);
        setIntElement(term1115, 0, -184153539);
        setIntElement(term1115, 1, 493620644);
        setIntElement(term1115, 2, 1328271830);
        setIntElement(term1115, 3, 1596070772);
        setIntElement(term1115, 4, 97029295);
        setField(term1103, term1103.getClass(), "permutation", term1115);
        setIntField(term1103, term1103.getClass(), "rank", -1371869594);
        setDoubleField(term1103, term1103.getClass(), "lmPar", 0.8067108928296716);
        setDoubleElement(term1123, 0, 0.6293118636954493);
        setDoubleElement(term1123, 1, 0.7705839211434976);
        setDoubleElement(term1123, 2, 0.08858836329417497);
        setDoubleElement(term1123, 3, 0.8582456540284578);
        setField(term1103, term1103.getClass(), "lmDir", term1123);
        setDoubleField(term1103, term1103.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term1103, term1103.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term1103, term1103.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term1103, term1103.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term1132, term1132.getClass(), "relativeThreshold", 1.1102230246251565E-14);
        setDoubleField(term1132, term1132.getClass(), "absoluteThreshold", 2.2250738585072014E-306);
        setField(term1103, term1103.getClass(), "checker", term1132);
        setElement(term1135, 0, term1136);
        setDoubleElement(term1137, 0, 0.061434557058998585);
        setDoubleElement(term1137, 1, 0.1621025751381594);
        setDoubleElement(term1137, 2, 0.8809657273235505);
        setDoubleElement(term1137, 3, 0.33296332053567956);
        setDoubleElement(term1137, 4, 0.593079122289713);
        setElement(term1135, 1, term1137);
        setDoubleElement(term1143, 0, 0.7455431255888774);
        setDoubleElement(term1143, 1, 0.9459012738750242);
        setDoubleElement(term1143, 2, 0.967474946781822);
        setDoubleElement(term1143, 3, 0.4429892630967539);
        setElement(term1135, 2, term1143);
        setDoubleElement(term1148, 0, 0.10126144382177782);
        setElement(term1135, 3, term1148);
        setElement(term1135, 4, term1150);
        setDoubleElement(term1151, 0, 0.5029736700336335);
        setDoubleElement(term1151, 1, 0.2617673558897229);
        setDoubleElement(term1151, 2, 0.052590327313127294);
        setDoubleElement(term1151, 3, 0.004207750553928968);
        setDoubleElement(term1151, 4, 0.9107074560109533);
        setDoubleElement(term1151, 5, 0.22308265923522352);
        setElement(term1135, 5, term1151);
        setDoubleElement(term1158, 0, 0.46226950865842764);
        setDoubleElement(term1158, 1, 0.6482086250011448);
        setDoubleElement(term1158, 2, 0.3154346482211354);
        setElement(term1135, 6, term1158);
        setDoubleElement(term1162, 0, 0.020103660328398276);
        setDoubleElement(term1162, 1, 0.6530844366661772);
        setDoubleElement(term1162, 2, 0.7368078667856154);
        setDoubleElement(term1162, 3, 0.6799679189320558);
        setElement(term1135, 7, term1162);
        setField(term1103, term1103.getClass(), "jacobian", term1135);
        setIntField(term1103, term1103.getClass(), "cols", -2095575670);
        setIntField(term1103, term1103.getClass(), "rows", 1225272962);
        setDoubleElement(term1169, 0, 0.8342190257129791);
        setDoubleElement(term1169, 1, 0.1057616236613994);
        setDoubleElement(term1169, 2, 0.6517567007639319);
        setDoubleElement(term1169, 3, 0.7471692213461502);
        setDoubleElement(term1169, 4, 0.20733693951275556);
        setField(term1103, term1103.getClass(), "targetValues", term1169);
        setDoubleElement(term1175, 0, 0.6618543228332953);
        setDoubleElement(term1175, 1, 0.8760632597672348);
        setDoubleElement(term1175, 2, 0.4046308665116508);
        setDoubleElement(term1175, 3, 0.3546618953364844);
        setDoubleElement(term1175, 4, 0.011186829850474256);
        setDoubleElement(term1175, 5, 0.47058253607311484);
        setDoubleElement(term1175, 6, 0.7340691331467901);
        setDoubleElement(term1175, 7, 0.23604395020255575);
        setField(term1103, term1103.getClass(), "residualsWeights", term1175);
        setDoubleElement(term1184, 0, 0.7752202944026838);
        setDoubleElement(term1184, 1, 0.6814473488244137);
        setDoubleElement(term1184, 2, 0.7526628774283542);
        setDoubleElement(term1184, 3, 0.6609555690482892);
        setDoubleElement(term1184, 4, 0.20773286305836303);
        setDoubleElement(term1184, 5, 0.6902120717646517);
        setDoubleElement(term1184, 6, 0.483452767365532);
        setDoubleElement(term1184, 7, 0.33984612849066775);
        setField(term1103, term1103.getClass(), "point", term1184);
        setDoubleElement(term1193, 0, 0.992214897936456);
        setDoubleElement(term1193, 1, 0.10940058061451474);
        setDoubleElement(term1193, 2, 0.5280493395446559);
        setDoubleElement(term1193, 3, 0.5885698341309811);
        setDoubleElement(term1193, 4, 0.47963743635149814);
        setField(term1103, term1103.getClass(), "objective", term1193);
        setDoubleElement(term1199, 0, 0.07322031754051816);
        setDoubleElement(term1199, 1, 0.7572808992551947);
        setDoubleElement(term1199, 2, 0.34277768712445844);
        setDoubleElement(term1199, 3, 0.9807605245238011);
        setDoubleElement(term1199, 4, 0.6765249801226639);
        setDoubleElement(term1199, 5, 0.08404543279803334);
        setField(term1103, term1103.getClass(), "residuals", term1199);
        setDoubleField(term1103, term1103.getClass(), "cost", 0.2456100607115369);
        setIntField(term1103, term1103.getClass(), "maxIterations", 1000);
        setIntField(term1103, term1103.getClass(), "iterations", 1324040357);
        setIntField(term1103, term1103.getClass(), "maxEvaluations", 2147483647);
        setIntField(term1103, term1103.getClass(), "objectiveEvaluations", -1588772968);
        setIntField(term1103, term1103.getClass(), "jacobianEvaluations", -93135961);
        setField(term1103, term1103.getClass(), "function", null);
        setField(term1103, term1103.getClass(), "jF", null);
        term1212 = (double[]) newDoubleArray(3);
        setDoubleElement(term1212, 0, 0.40390514476233974);
        setDoubleElement(term1212, 1, 0.07467808093133665);
        setDoubleElement(term1212, 2, 0.5375131002500685);
        term1216 = (double[]) newDoubleArray(0);
        term1217 = (double[]) newDoubleArray(5);
        setDoubleElement(term1217, 0, 0.8347207486220592);
        setDoubleElement(term1217, 1, 0.6121208871391735);
        setDoubleElement(term1217, 2, 0.7727907711525114);
        setDoubleElement(term1217, 3, 0.01895872020734357);
        setDoubleElement(term1217, 4, 0.2736100778332827);
        term1223 = (double[]) newDoubleArray(6);
        setDoubleElement(term1223, 0, 0.3629389093951403);
        setDoubleElement(term1223, 1, 0.5048764503874877);
        setDoubleElement(term1223, 2, 0.18688693015118896);
        setDoubleElement(term1223, 3, 0.6474385034713966);
        setDoubleElement(term1223, 4, 0.589407706873697);
        setDoubleElement(term1223, 5, 0.6317865333680911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = term1212;
        args[1] = term1216;
        args[2] = term1217;
        args[3] = term1223;
        try {
            callMethod(klass, "determineLMDirection", argTypes, term1103, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


