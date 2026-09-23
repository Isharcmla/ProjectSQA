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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class BOBYQAOptimizer_bobyqb_154039895818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861;
     Object term984;
     Object term993;

    public BOBYQAOptimizer_bobyqb_154039895818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30424 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term30423 = ((Class) term30424).getDeclaredField((String) "MAXIMIZE");
        ((Field) term30423).setAccessible(true);
        Object enum12 = ((Field) term30423).get((Object) null);
        term861 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        Object term866 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term867 = (double[]) newDoubleArray(0);
        double[] term868 = (double[]) newDoubleArray(7);
        Object term877 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term878 = (Object[]) newArray("[D", 2);
        double[] term879 = (double[]) newDoubleArray(6);
        double[] term886 = (double[]) newDoubleArray(6);
        Object term893 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term894 = (Object[]) newArray("[D", 2);
        double[] term895 = (double[]) newDoubleArray(5);
        double[] term901 = (double[]) newDoubleArray(3);
        Object term905 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term906 = (Object[]) newArray("[D", 5);
        double[] term907 = (double[]) newDoubleArray(5);
        double[] term913 = (double[]) newDoubleArray(1);
        double[] term915 = (double[]) newDoubleArray(0);
        double[] term916 = (double[]) newDoubleArray(9);
        double[] term926 = (double[]) newDoubleArray(4);
        Object term931 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term932 = (double[]) newDoubleArray(0);
        Object term933 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term934 = (double[]) newDoubleArray(0);
        Object term935 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term936 = (double[]) newDoubleArray(0);
        Object term937 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term938 = (double[]) newDoubleArray(0);
        Object term939 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term940 = (double[]) newDoubleArray(0);
        Object term941 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term942 = (double[]) newDoubleArray(0);
        Object term943 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term944 = (double[]) newDoubleArray(0);
        Object term945 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term946 = (double[]) newDoubleArray(0);
        Object term947 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term948 = (double[]) newDoubleArray(0);
        double[] term949 = (double[]) newDoubleArray(8);
        double[] term958 = (double[]) newDoubleArray(6);
        Object term965 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term968 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        double[] term981 = (double[]) newDoubleArray(2);
        setIntField(term861, term861.getClass(), "numberOfInterpolationPoints", 1725571209);
        setDoubleField(term861, term861.getClass(), "initialTrustRegionRadius", 0.7865909711092062);
        setDoubleField(term861, term861.getClass(), "stoppingTrustRegionRadius", 0.06587158449170749);
        setBooleanField(term861, term861.getClass(), "isMinimize", false);
        setField(term866, term866.getClass(), "data", term867);
        setField(term861, term861.getClass(), "currentBest", term866);
        setDoubleElement(term868, 0, 0.0865998004187658);
        setDoubleElement(term868, 1, 0.9628647861255637);
        setDoubleElement(term868, 2, 0.623231822150205);
        setDoubleElement(term868, 3, 0.09037487793444521);
        setDoubleElement(term868, 4, 0.6561919196821765);
        setDoubleElement(term868, 5, 0.7330178886612495);
        setDoubleElement(term868, 6, 0.7618164754425794);
        setField(term861, term861.getClass(), "boundDifference", term868);
        setIntField(term861, term861.getClass(), "trustRegionCenterInterpolationPointIndex", -522618178);
        setDoubleElement(term879, 0, 0.7385589312559342);
        setDoubleElement(term879, 1, 0.7080134263823477);
        setDoubleElement(term879, 2, 0.6059734092898602);
        setDoubleElement(term879, 3, 0.3074693824288357);
        setDoubleElement(term879, 4, 0.1245258965512791);
        setDoubleElement(term879, 5, 0.9511861072660375);
        setElement(term878, 0, term879);
        setDoubleElement(term886, 0, 0.05880719443135807);
        setDoubleElement(term886, 1, 0.34010089048558567);
        setDoubleElement(term886, 2, 0.19625398866403143);
        setDoubleElement(term886, 3, 0.45069204793711093);
        setDoubleElement(term886, 4, 0.9341364461850963);
        setDoubleElement(term886, 5, 0.9022041121474429);
        setElement(term878, 1, term886);
        setField(term877, term877.getClass(), "data", term878);
        setField(term861, term861.getClass(), "bMatrix", term877);
        setDoubleElement(term895, 0, 0.6512870939318848);
        setDoubleElement(term895, 1, 0.8777038609128434);
        setDoubleElement(term895, 2, 0.008025683154629148);
        setDoubleElement(term895, 3, 0.40598298281353484);
        setDoubleElement(term895, 4, 0.3710067290060264);
        setElement(term894, 0, term895);
        setDoubleElement(term901, 0, 0.7818620200430967);
        setDoubleElement(term901, 1, 0.04640022995603543);
        setDoubleElement(term901, 2, 0.9123572866833729);
        setElement(term894, 1, term901);
        setField(term893, term893.getClass(), "data", term894);
        setField(term861, term861.getClass(), "zMatrix", term893);
        setDoubleElement(term907, 0, 0.40635376375558196);
        setDoubleElement(term907, 1, 0.4772043271031934);
        setDoubleElement(term907, 2, 0.2446504549754045);
        setDoubleElement(term907, 3, 0.6142723998707854);
        setDoubleElement(term907, 4, 0.4355627280318103);
        setElement(term906, 0, term907);
        setDoubleElement(term913, 0, 0.841460835734741);
        setElement(term906, 1, term913);
        setElement(term906, 2, term915);
        setDoubleElement(term916, 0, 0.7859316615744082);
        setDoubleElement(term916, 1, 0.6428742553484879);
        setDoubleElement(term916, 2, 0.6584165706677267);
        setDoubleElement(term916, 3, 0.44268490778872205);
        setDoubleElement(term916, 4, 0.7507333108648018);
        setDoubleElement(term916, 5, 0.007493740494434409);
        setDoubleElement(term916, 6, 0.29172553321356776);
        setDoubleElement(term916, 7, 0.9276995636844321);
        setDoubleElement(term916, 8, 0.7636130748477434);
        setElement(term906, 3, term916);
        setDoubleElement(term926, 0, 0.07901636960861558);
        setDoubleElement(term926, 1, 0.18717846301066243);
        setDoubleElement(term926, 2, 0.5335953039331021);
        setDoubleElement(term926, 3, 0.5725602309856443);
        setElement(term906, 4, term926);
        setField(term905, term905.getClass(), "data", term906);
        setField(term861, term861.getClass(), "interpolationPoints", term905);
        setField(term931, term931.getClass(), "data", term932);
        setField(term861, term861.getClass(), "originShift", term931);
        setField(term933, term933.getClass(), "data", term934);
        setField(term861, term861.getClass(), "fAtInterpolationPoints", term933);
        setField(term935, term935.getClass(), "data", term936);
        setField(term861, term861.getClass(), "trustRegionCenterOffset", term935);
        setField(term937, term937.getClass(), "data", term938);
        setField(term861, term861.getClass(), "gradientAtTrustRegionCenter", term937);
        setField(term939, term939.getClass(), "data", term940);
        setField(term861, term861.getClass(), "lowerDifference", term939);
        setField(term941, term941.getClass(), "data", term942);
        setField(term861, term861.getClass(), "upperDifference", term941);
        setField(term943, term943.getClass(), "data", term944);
        setField(term861, term861.getClass(), "modelSecondDerivativesParameters", term943);
        setField(term945, term945.getClass(), "data", term946);
        setField(term861, term861.getClass(), "newPoint", term945);
        setField(term947, term947.getClass(), "data", term948);
        setField(term861, term861.getClass(), "alternativeNewPoint", term947);
        setField(term861, term861.getClass(), "trialStepPoint", term943);
        setField(term861, term861.getClass(), "lagrangeValuesAtNewPoint", term945);
        setField(term861, term861.getClass(), "modelSecondDerivativesValues", term866);
        setDoubleElement(term949, 0, 0.5310967137636303);
        setDoubleElement(term949, 1, 0.6054109236809134);
        setDoubleElement(term949, 2, 0.9165240441138934);
        setDoubleElement(term949, 3, 0.22227423914231126);
        setDoubleElement(term949, 4, 0.06480976831423468);
        setDoubleElement(term949, 5, 0.8490790645379176);
        setDoubleElement(term949, 6, 0.23129126164078717);
        setDoubleElement(term949, 7, 0.6047138318674447);
        setField(term861, term861.getClass(), "lowerBound", term949);
        setDoubleElement(term958, 0, 0.5597136413549945);
        setDoubleElement(term958, 1, 0.28292420012823627);
        setDoubleElement(term958, 2, 0.5407563152320285);
        setDoubleElement(term958, 3, 0.9485929668765458);
        setDoubleElement(term958, 4, 0.5179319342588155);
        setDoubleElement(term958, 5, 0.25025774487844066);
        setField(term861, term861.getClass(), "upperBound", term958);
        setIntField(term965, term965.getClass(), "maximalCount", 1134449235);
        setIntField(term965, term965.getClass(), "count", -883034806);
        setField(term965, term965.getClass(), "maxCountCallback", term968);
        setField(term861, term861.getClass(), "evaluations", term965);
        setField(term861, term861.getClass(), "checker", null);
        setField(term861, term861.getClass(), "goal", enum12);
        setDoubleElement(term981, 0, 0.1858089882752998);
        setDoubleElement(term981, 1, 0.2440697646709713);
        setField(term861, term861.getClass(), "start", term981);
        setField(term861, term861.getClass(), "function", null);
        term984 = (double[]) newDoubleArray(8);
        setDoubleElement(term984, 0, 0.7977455176064363);
        setDoubleElement(term984, 1, 0.5329919447422633);
        setDoubleElement(term984, 2, 0.7046974927834232);
        setDoubleElement(term984, 3, 0.6896952303224777);
        setDoubleElement(term984, 4, 0.6693176553622628);
        setDoubleElement(term984, 5, 0.2962868255626906);
        setDoubleElement(term984, 6, 0.25474180574060834);
        setDoubleElement(term984, 7, 0.9957585718901875);
        term993 = (double[]) newDoubleArray(3);
        setDoubleElement(term993, 0, 0.16755811343784477);
        setDoubleElement(term993, 1, 0.9090793968999221);
        setDoubleElement(term993, 2, 0.25997329921466494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term984;
        args[1] = term993;
        try {
            callMethod(klass, "bobyqb", argTypes, term861, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


