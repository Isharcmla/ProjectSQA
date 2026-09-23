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

public class LevenbergMarquardtOptimizer_determineLMDirection_73090103719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1212;
     Object term1301;
     Object term1305;
     Object term1308;
     Object term1314;

    public LevenbergMarquardtOptimizer_determineLMDirection_73090103719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1212 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term1214 = (double[]) newDoubleArray(5);
        double[] term1220 = (double[]) newDoubleArray(8);
        double[] term1229 = (double[]) newDoubleArray(8);
        int[] term1238 = (int[]) newIntArray(5);
        double[] term1246 = (double[]) newDoubleArray(6);
        Object[] term1258 = (Object[]) newArray("[D", 3);
        double[] term1259 = (double[]) newDoubleArray(0);
        double[] term1260 = (double[]) newDoubleArray(5);
        double[] term1266 = (double[]) newDoubleArray(6);
        double[] term1275 = (double[]) newDoubleArray(0);
        double[] term1276 = (double[]) newDoubleArray(3);
        double[] term1280 = (double[]) newDoubleArray(1);
        double[] term1282 = (double[]) newDoubleArray(9);
        double[] term1292 = (double[]) newDoubleArray(2);
        setIntField(term1212, term1212.getClass(), "solvedCols", 1225272962);
        setDoubleElement(term1214, 0, 0.7340691331467901);
        setDoubleElement(term1214, 1, 0.23604395020255575);
        setDoubleElement(term1214, 2, 0.7752202944026838);
        setDoubleElement(term1214, 3, 0.6814473488244137);
        setDoubleElement(term1214, 4, 0.7526628774283542);
        setField(term1212, term1212.getClass(), "diagR", term1214);
        setDoubleElement(term1220, 0, 0.6609555690482892);
        setDoubleElement(term1220, 1, 0.20773286305836303);
        setDoubleElement(term1220, 2, 0.6902120717646517);
        setDoubleElement(term1220, 3, 0.483452767365532);
        setDoubleElement(term1220, 4, 0.33984612849066775);
        setDoubleElement(term1220, 5, 0.992214897936456);
        setDoubleElement(term1220, 6, 0.10940058061451474);
        setDoubleElement(term1220, 7, 0.5280493395446559);
        setField(term1212, term1212.getClass(), "jacNorm", term1220);
        setDoubleElement(term1229, 0, 0.5885698341309811);
        setDoubleElement(term1229, 1, 0.47963743635149814);
        setDoubleElement(term1229, 2, 0.07322031754051816);
        setDoubleElement(term1229, 3, 0.7572808992551947);
        setDoubleElement(term1229, 4, 0.34277768712445844);
        setDoubleElement(term1229, 5, 0.9807605245238011);
        setDoubleElement(term1229, 6, 0.6765249801226639);
        setDoubleElement(term1229, 7, 0.08404543279803334);
        setField(term1212, term1212.getClass(), "beta", term1229);
        setIntElement(term1238, 0, 1324040357);
        setIntElement(term1238, 1, -1588772968);
        setIntElement(term1238, 2, -93135961);
        setIntElement(term1238, 3, -112921587);
        setIntElement(term1238, 4, 933028652);
        setField(term1212, term1212.getClass(), "permutation", term1238);
        setIntField(term1212, term1212.getClass(), "rank", 287287233);
        setDoubleField(term1212, term1212.getClass(), "lmPar", 0.2456100607115369);
        setDoubleElement(term1246, 0, 0.40390514476233974);
        setDoubleElement(term1246, 1, 0.07467808093133665);
        setDoubleElement(term1246, 2, 0.5375131002500685);
        setDoubleElement(term1246, 3, 0.8347207486220592);
        setDoubleElement(term1246, 4, 0.6121208871391735);
        setDoubleElement(term1246, 5, 0.7727907711525114);
        setField(term1212, term1212.getClass(), "lmDir", term1246);
        setDoubleField(term1212, term1212.getClass(), "initialStepBoundFactor", 100.0);
        setDoubleField(term1212, term1212.getClass(), "costRelativeTolerance", 1.0E-10);
        setDoubleField(term1212, term1212.getClass(), "parRelativeTolerance", 1.0E-10);
        setDoubleField(term1212, term1212.getClass(), "orthoTolerance", 1.0E-10);
        setDoubleField(term1212, term1212.getClass(), "qrRankingThreshold", 2.2250738585072014E-308);
        setField(term1212, term1212.getClass(), "checker", null);
        setElement(term1258, 0, term1259);
        setDoubleElement(term1260, 0, 0.01895872020734357);
        setDoubleElement(term1260, 1, 0.2736100778332827);
        setDoubleElement(term1260, 2, 0.3629389093951403);
        setDoubleElement(term1260, 3, 0.5048764503874877);
        setDoubleElement(term1260, 4, 0.18688693015118896);
        setElement(term1258, 1, term1260);
        setDoubleElement(term1266, 0, 0.6474385034713966);
        setDoubleElement(term1266, 1, 0.589407706873697);
        setDoubleElement(term1266, 2, 0.6317865333680911);
        setDoubleElement(term1266, 3, 0.8927448424561988);
        setDoubleElement(term1266, 4, 0.5749385818274158);
        setDoubleElement(term1266, 5, 0.08286713692323);
        setElement(term1258, 2, term1266);
        setField(term1212, term1212.getClass(), "jacobian", term1258);
        setIntField(term1212, term1212.getClass(), "cols", 962840079);
        setIntField(term1212, term1212.getClass(), "rows", 1540719661);
        setField(term1212, term1212.getClass(), "targetValues", term1275);
        setDoubleElement(term1276, 0, 0.1713603524061028);
        setDoubleElement(term1276, 1, 0.46840044557462845);
        setDoubleElement(term1276, 2, 0.7757378334599976);
        setField(term1212, term1212.getClass(), "residualsWeights", term1276);
        setDoubleElement(term1280, 0, 0.3459237114146855);
        setField(term1212, term1212.getClass(), "point", term1280);
        setDoubleElement(term1282, 0, 0.41504405374405495);
        setDoubleElement(term1282, 1, 0.9526973682054863);
        setDoubleElement(term1282, 2, 0.27635065300519635);
        setDoubleElement(term1282, 3, 0.49834805734323884);
        setDoubleElement(term1282, 4, 0.5823024616231472);
        setDoubleElement(term1282, 5, 0.036779689625219825);
        setDoubleElement(term1282, 6, 0.13829257568797448);
        setDoubleElement(term1282, 7, 0.63912351480947);
        setDoubleElement(term1282, 8, 0.11746904890800369);
        setField(term1212, term1212.getClass(), "objective", term1282);
        setDoubleElement(term1292, 0, 0.1065132285415139);
        setDoubleElement(term1292, 1, 0.9482156027893403);
        setField(term1212, term1212.getClass(), "residuals", term1292);
        setDoubleField(term1212, term1212.getClass(), "cost", 0.9946322297398043);
        setIntField(term1212, term1212.getClass(), "maxIterations", 1000);
        setIntField(term1212, term1212.getClass(), "iterations", 1265463001);
        setIntField(term1212, term1212.getClass(), "maxEvaluations", 2147483647);
        setIntField(term1212, term1212.getClass(), "objectiveEvaluations", 335112684);
        setIntField(term1212, term1212.getClass(), "jacobianEvaluations", 1551099402);
        setField(term1212, term1212.getClass(), "function", null);
        setField(term1212, term1212.getClass(), "jF", null);
        term1301 = (double[]) newDoubleArray(3);
        setDoubleElement(term1301, 0, 0.04324873162392873);
        setDoubleElement(term1301, 1, 0.2652123546462597);
        setDoubleElement(term1301, 2, 0.8226586214430401);
        term1305 = (double[]) newDoubleArray(2);
        setDoubleElement(term1305, 0, 0.5159732360192749);
        setDoubleElement(term1305, 1, 0.250909266409475);
        term1308 = (double[]) newDoubleArray(5);
        setDoubleElement(term1308, 0, 0.6310147355578756);
        setDoubleElement(term1308, 1, 0.3489522132156603);
        setDoubleElement(term1308, 2, 0.32766470127792047);
        setDoubleElement(term1308, 3, 0.7292666689390468);
        setDoubleElement(term1308, 4, 0.5206285603012875);
        term1314 = (double[]) newDoubleArray(1);
        setDoubleElement(term1314, 0, 0.7090123011614375);
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
        args[0] = term1301;
        args[1] = term1305;
        args[2] = term1308;
        args[3] = term1314;
        try {
            callMethod(klass, "determineLMDirection", argTypes, term1212, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


