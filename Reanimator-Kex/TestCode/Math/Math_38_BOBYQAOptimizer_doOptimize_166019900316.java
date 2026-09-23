package org.apache.commons.math.optimization.direct;

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
import org.apache.commons.math.exception.OutOfRangeException;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BOBYQAOptimizer_doOptimize_166019900316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public BOBYQAOptimizer_doOptimize_166019900316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5679 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term5678 = ((Class) term5679).getDeclaredField((String) "MAXIMIZE");
        ((Field) term5678).setAccessible(true);
        Object enum8 = ((Field) term5678).get((Object) null);
        term9 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        Object term14 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term15 = (double[]) newDoubleArray(0);
        double[] term16 = (double[]) newDoubleArray(5);
        Object term23 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term24 = (Object[]) newArray("[D", 4);
        double[] term25 = (double[]) newDoubleArray(3);
        double[] term29 = (double[]) newDoubleArray(4);
        double[] term34 = (double[]) newDoubleArray(1);
        double[] term36 = (double[]) newDoubleArray(6);
        Object term43 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term44 = (Object[]) newArray("[D", 2);
        double[] term45 = (double[]) newDoubleArray(6);
        double[] term52 = (double[]) newDoubleArray(7);
        Object term60 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term61 = (Object[]) newArray("[D", 1);
        double[] term62 = (double[]) newDoubleArray(6);
        Object term69 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term70 = (double[]) newDoubleArray(0);
        Object term71 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term72 = (double[]) newDoubleArray(0);
        Object term73 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term74 = (double[]) newDoubleArray(0);
        Object term75 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term76 = (double[]) newDoubleArray(0);
        Object term77 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term78 = (double[]) newDoubleArray(0);
        Object term79 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term80 = (double[]) newDoubleArray(0);
        Object term81 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term82 = (double[]) newDoubleArray(0);
        Object term83 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term84 = (double[]) newDoubleArray(0);
        Object term85 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term86 = (double[]) newDoubleArray(0);
        double[] term87 = (double[]) newDoubleArray(5);
        double[] term93 = (double[]) newDoubleArray(5);
        Object term99 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term102 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        double[] term115 = (double[]) newDoubleArray(2);
        setIntField(term9, term9.getClass(), "numberOfInterpolationPoints", 1484323161);
        setDoubleField(term9, term9.getClass(), "initialTrustRegionRadius", 0.544608645520025);
        setDoubleField(term9, term9.getClass(), "stoppingTrustRegionRadius", 0.28570734989730284);
        setBooleanField(term9, term9.getClass(), "isMinimize", false);
        setField(term14, term14.getClass(), "data", term15);
        setField(term9, term9.getClass(), "currentBest", term14);
        setDoubleElement(term16, 0, 0.40176586625454525);
        setDoubleElement(term16, 1, 0.2641345529914265);
        setDoubleElement(term16, 2, 0.36923381893433327);
        setDoubleElement(term16, 3, 0.6076495596892013);
        setDoubleElement(term16, 4, 0.37773193782763337);
        setField(term9, term9.getClass(), "boundDifference", term16);
        setIntField(term9, term9.getClass(), "trustRegionCenterInterpolationPointIndex", 391863371);
        setDoubleElement(term25, 0, 0.8474802076607362);
        setDoubleElement(term25, 1, 0.5183269973490326);
        setDoubleElement(term25, 2, 0.7655020693602768);
        setElement(term24, 0, term25);
        setDoubleElement(term29, 0, 0.1374549299694151);
        setDoubleElement(term29, 1, 0.7031006357544823);
        setDoubleElement(term29, 2, 0.9527281779865117);
        setDoubleElement(term29, 3, 0.9828442029246764);
        setElement(term24, 1, term29);
        setDoubleElement(term34, 0, 0.2779719046761513);
        setElement(term24, 2, term34);
        setDoubleElement(term36, 0, 0.6436713023569729);
        setDoubleElement(term36, 1, 0.7332741045694002);
        setDoubleElement(term36, 2, 0.4569171842750229);
        setDoubleElement(term36, 3, 0.8598297828918529);
        setDoubleElement(term36, 4, 0.43692187681405226);
        setDoubleElement(term36, 5, 0.7633268466829064);
        setElement(term24, 3, term36);
        setField(term23, term23.getClass(), "data", term24);
        setField(term9, term9.getClass(), "bMatrix", term23);
        setDoubleElement(term45, 0, 0.13481025392611334);
        setDoubleElement(term45, 1, 0.3800088629986428);
        setDoubleElement(term45, 2, 0.5840714198152577);
        setDoubleElement(term45, 3, 0.7559240768573477);
        setDoubleElement(term45, 4, 0.10667076642995188);
        setDoubleElement(term45, 5, 0.11493000848982304);
        setElement(term44, 0, term45);
        setDoubleElement(term52, 0, 0.37161417339133307);
        setDoubleElement(term52, 1, 0.6805867182029153);
        setDoubleElement(term52, 2, 0.2852810965221698);
        setDoubleElement(term52, 3, 0.6300849762307866);
        setDoubleElement(term52, 4, 0.9737083944266686);
        setDoubleElement(term52, 5, 0.0668892744806211);
        setDoubleElement(term52, 6, 0.3587267442738795);
        setElement(term44, 1, term52);
        setField(term43, term43.getClass(), "data", term44);
        setField(term9, term9.getClass(), "zMatrix", term43);
        setDoubleElement(term62, 0, 0.07802449704920456);
        setDoubleElement(term62, 1, 0.5279279537140873);
        setDoubleElement(term62, 2, 0.3202192021706908);
        setDoubleElement(term62, 3, 0.22651340641904605);
        setDoubleElement(term62, 4, 0.8878841294187743);
        setDoubleElement(term62, 5, 0.6588948704887806);
        setElement(term61, 0, term62);
        setField(term60, term60.getClass(), "data", term61);
        setField(term9, term9.getClass(), "interpolationPoints", term60);
        setField(term69, term69.getClass(), "data", term70);
        setField(term9, term9.getClass(), "originShift", term69);
        setField(term71, term71.getClass(), "data", term72);
        setField(term9, term9.getClass(), "fAtInterpolationPoints", term71);
        setField(term73, term73.getClass(), "data", term74);
        setField(term9, term9.getClass(), "trustRegionCenterOffset", term73);
        setField(term75, term75.getClass(), "data", term76);
        setField(term9, term9.getClass(), "gradientAtTrustRegionCenter", term75);
        setField(term77, term77.getClass(), "data", term78);
        setField(term9, term9.getClass(), "lowerDifference", term77);
        setField(term79, term79.getClass(), "data", term80);
        setField(term9, term9.getClass(), "upperDifference", term79);
        setField(term81, term81.getClass(), "data", term82);
        setField(term9, term9.getClass(), "modelSecondDerivativesParameters", term81);
        setField(term83, term83.getClass(), "data", term84);
        setField(term9, term9.getClass(), "newPoint", term83);
        setField(term85, term85.getClass(), "data", term86);
        setField(term9, term9.getClass(), "alternativeNewPoint", term85);
        setField(term9, term9.getClass(), "trialStepPoint", term81);
        setField(term9, term9.getClass(), "lagrangeValuesAtNewPoint", term83);
        setField(term9, term9.getClass(), "modelSecondDerivativesValues", term14);
        setDoubleElement(term87, 0, 0.6397214730945112);
        setDoubleElement(term87, 1, 0.25937345430928016);
        setDoubleElement(term87, 2, 0.5873228247510078);
        setDoubleElement(term87, 3, 0.8823181080774973);
        setDoubleElement(term87, 4, 0.2192450926212024);
        setField(term9, term9.getClass(), "lowerBound", term87);
        setDoubleElement(term93, 0, 0.7591353014991907);
        setDoubleElement(term93, 1, 0.791695029600875);
        setDoubleElement(term93, 2, 0.6862221294683138);
        setDoubleElement(term93, 3, 0.15917839663695388);
        setDoubleElement(term93, 4, 0.9374115574082594);
        setField(term9, term9.getClass(), "upperBound", term93);
        setIntField(term99, term99.getClass(), "maximalCount", -1922583790);
        setIntField(term99, term99.getClass(), "count", -616727354);
        setField(term99, term99.getClass(), "maxCountCallback", term102);
        setField(term9, term9.getClass(), "evaluations", term99);
        setField(term9, term9.getClass(), "checker", null);
        setField(term9, term9.getClass(), "goal", enum8);
        setDoubleElement(term115, 0, 0.8454723071922143);
        setDoubleElement(term115, 1, 0.8566567697571895);
        setField(term9, term9.getClass(), "start", term115);
        setField(term9, term9.getClass(), "function", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term9, args);
            assertTrue(false);
        }
        catch (OutOfRangeException e) {
        }

    }

};


