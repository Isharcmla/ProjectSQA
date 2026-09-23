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
import java.lang.Double;
import java.lang.Integer;

public class BOBYQAOptimizer_update_111017853922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2798;
     Object term2925;
     Object term2927;
     Object term2929;

    public BOBYQAOptimizer_update_111017853922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33346 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term33345 = ((Class) term33346).getDeclaredField((String) "MINIMIZE");
        ((Field) term33345).setAccessible(true);
        Object enum16 = ((Field) term33345).get((Object) null);
        term2798 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        Object term2803 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2804 = (double[]) newDoubleArray(0);
        double[] term2805 = (double[]) newDoubleArray(5);
        Object term2812 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term2813 = (Object[]) newArray("[D", 4);
        double[] term2814 = (double[]) newDoubleArray(8);
        double[] term2823 = (double[]) newDoubleArray(0);
        double[] term2824 = (double[]) newDoubleArray(5);
        double[] term2830 = (double[]) newDoubleArray(4);
        Object term2835 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term2836 = (Object[]) newArray("[D", 1);
        double[] term2837 = (double[]) newDoubleArray(0);
        Object term2838 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term2839 = (Object[]) newArray("[D", 6);
        double[] term2840 = (double[]) newDoubleArray(3);
        double[] term2844 = (double[]) newDoubleArray(4);
        double[] term2849 = (double[]) newDoubleArray(5);
        double[] term2855 = (double[]) newDoubleArray(8);
        double[] term2864 = (double[]) newDoubleArray(8);
        double[] term2873 = (double[]) newDoubleArray(5);
        Object term2879 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2880 = (double[]) newDoubleArray(0);
        Object term2881 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2882 = (double[]) newDoubleArray(0);
        Object term2883 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2884 = (double[]) newDoubleArray(0);
        Object term2885 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2886 = (double[]) newDoubleArray(0);
        Object term2887 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2888 = (double[]) newDoubleArray(0);
        Object term2889 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2890 = (double[]) newDoubleArray(0);
        Object term2891 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2892 = (double[]) newDoubleArray(0);
        Object term2893 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2894 = (double[]) newDoubleArray(0);
        Object term2895 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term2896 = (double[]) newDoubleArray(0);
        double[] term2897 = (double[]) newDoubleArray(6);
        double[] term2904 = (double[]) newDoubleArray(3);
        Object term2908 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term2911 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        double[] term2924 = (double[]) newDoubleArray(0);
        setIntField(term2798, term2798.getClass(), "numberOfInterpolationPoints", 865208305);
        setDoubleField(term2798, term2798.getClass(), "initialTrustRegionRadius", 0.3762445362551795);
        setDoubleField(term2798, term2798.getClass(), "stoppingTrustRegionRadius", 0.6004517527698794);
        setBooleanField(term2798, term2798.getClass(), "isMinimize", true);
        setField(term2803, term2803.getClass(), "data", term2804);
        setField(term2798, term2798.getClass(), "currentBest", term2803);
        setDoubleElement(term2805, 0, 0.9412219458975137);
        setDoubleElement(term2805, 1, 0.06469331916225318);
        setDoubleElement(term2805, 2, 0.9259830415214885);
        setDoubleElement(term2805, 3, 0.6688842921741369);
        setDoubleElement(term2805, 4, 0.8067108928296716);
        setField(term2798, term2798.getClass(), "boundDifference", term2805);
        setIntField(term2798, term2798.getClass(), "trustRegionCenterInterpolationPointIndex", -1275173084);
        setDoubleElement(term2814, 0, 0.6293118636954493);
        setDoubleElement(term2814, 1, 0.7705839211434976);
        setDoubleElement(term2814, 2, 0.08858836329417497);
        setDoubleElement(term2814, 3, 0.8582456540284578);
        setDoubleElement(term2814, 4, 0.061434557058998585);
        setDoubleElement(term2814, 5, 0.1621025751381594);
        setDoubleElement(term2814, 6, 0.8809657273235505);
        setDoubleElement(term2814, 7, 0.33296332053567956);
        setElement(term2813, 0, term2814);
        setElement(term2813, 1, term2823);
        setDoubleElement(term2824, 0, 0.593079122289713);
        setDoubleElement(term2824, 1, 0.7455431255888774);
        setDoubleElement(term2824, 2, 0.9459012738750242);
        setDoubleElement(term2824, 3, 0.967474946781822);
        setDoubleElement(term2824, 4, 0.4429892630967539);
        setElement(term2813, 2, term2824);
        setDoubleElement(term2830, 0, 0.10126144382177782);
        setDoubleElement(term2830, 1, 0.5029736700336335);
        setDoubleElement(term2830, 2, 0.2617673558897229);
        setDoubleElement(term2830, 3, 0.052590327313127294);
        setElement(term2813, 3, term2830);
        setField(term2812, term2812.getClass(), "data", term2813);
        setField(term2798, term2798.getClass(), "bMatrix", term2812);
        setElement(term2836, 0, term2837);
        setField(term2835, term2835.getClass(), "data", term2836);
        setField(term2798, term2798.getClass(), "zMatrix", term2835);
        setDoubleElement(term2840, 0, 0.004207750553928968);
        setDoubleElement(term2840, 1, 0.9107074560109533);
        setDoubleElement(term2840, 2, 0.22308265923522352);
        setElement(term2839, 0, term2840);
        setDoubleElement(term2844, 0, 0.46226950865842764);
        setDoubleElement(term2844, 1, 0.6482086250011448);
        setDoubleElement(term2844, 2, 0.3154346482211354);
        setDoubleElement(term2844, 3, 0.020103660328398276);
        setElement(term2839, 1, term2844);
        setDoubleElement(term2849, 0, 0.6530844366661772);
        setDoubleElement(term2849, 1, 0.7368078667856154);
        setDoubleElement(term2849, 2, 0.6799679189320558);
        setDoubleElement(term2849, 3, 0.8342190257129791);
        setDoubleElement(term2849, 4, 0.1057616236613994);
        setElement(term2839, 2, term2849);
        setDoubleElement(term2855, 0, 0.6517567007639319);
        setDoubleElement(term2855, 1, 0.7471692213461502);
        setDoubleElement(term2855, 2, 0.20733693951275556);
        setDoubleElement(term2855, 3, 0.6618543228332953);
        setDoubleElement(term2855, 4, 0.8760632597672348);
        setDoubleElement(term2855, 5, 0.4046308665116508);
        setDoubleElement(term2855, 6, 0.3546618953364844);
        setDoubleElement(term2855, 7, 0.011186829850474256);
        setElement(term2839, 3, term2855);
        setDoubleElement(term2864, 0, 0.47058253607311484);
        setDoubleElement(term2864, 1, 0.7340691331467901);
        setDoubleElement(term2864, 2, 0.23604395020255575);
        setDoubleElement(term2864, 3, 0.7752202944026838);
        setDoubleElement(term2864, 4, 0.6814473488244137);
        setDoubleElement(term2864, 5, 0.7526628774283542);
        setDoubleElement(term2864, 6, 0.6609555690482892);
        setDoubleElement(term2864, 7, 0.20773286305836303);
        setElement(term2839, 4, term2864);
        setDoubleElement(term2873, 0, 0.6902120717646517);
        setDoubleElement(term2873, 1, 0.483452767365532);
        setDoubleElement(term2873, 2, 0.33984612849066775);
        setDoubleElement(term2873, 3, 0.992214897936456);
        setDoubleElement(term2873, 4, 0.10940058061451474);
        setElement(term2839, 5, term2873);
        setField(term2838, term2838.getClass(), "data", term2839);
        setField(term2798, term2798.getClass(), "interpolationPoints", term2838);
        setField(term2879, term2879.getClass(), "data", term2880);
        setField(term2798, term2798.getClass(), "originShift", term2879);
        setField(term2881, term2881.getClass(), "data", term2882);
        setField(term2798, term2798.getClass(), "fAtInterpolationPoints", term2881);
        setField(term2883, term2883.getClass(), "data", term2884);
        setField(term2798, term2798.getClass(), "trustRegionCenterOffset", term2883);
        setField(term2885, term2885.getClass(), "data", term2886);
        setField(term2798, term2798.getClass(), "gradientAtTrustRegionCenter", term2885);
        setField(term2887, term2887.getClass(), "data", term2888);
        setField(term2798, term2798.getClass(), "lowerDifference", term2887);
        setField(term2889, term2889.getClass(), "data", term2890);
        setField(term2798, term2798.getClass(), "upperDifference", term2889);
        setField(term2891, term2891.getClass(), "data", term2892);
        setField(term2798, term2798.getClass(), "modelSecondDerivativesParameters", term2891);
        setField(term2893, term2893.getClass(), "data", term2894);
        setField(term2798, term2798.getClass(), "newPoint", term2893);
        setField(term2895, term2895.getClass(), "data", term2896);
        setField(term2798, term2798.getClass(), "alternativeNewPoint", term2895);
        setField(term2798, term2798.getClass(), "trialStepPoint", term2891);
        setField(term2798, term2798.getClass(), "lagrangeValuesAtNewPoint", term2893);
        setField(term2798, term2798.getClass(), "modelSecondDerivativesValues", term2803);
        setDoubleElement(term2897, 0, 0.5280493395446559);
        setDoubleElement(term2897, 1, 0.5885698341309811);
        setDoubleElement(term2897, 2, 0.47963743635149814);
        setDoubleElement(term2897, 3, 0.07322031754051816);
        setDoubleElement(term2897, 4, 0.7572808992551947);
        setDoubleElement(term2897, 5, 0.34277768712445844);
        setField(term2798, term2798.getClass(), "lowerBound", term2897);
        setDoubleElement(term2904, 0, 0.9807605245238011);
        setDoubleElement(term2904, 1, 0.6765249801226639);
        setDoubleElement(term2904, 2, 0.08404543279803334);
        setField(term2798, term2798.getClass(), "upperBound", term2904);
        setIntField(term2908, term2908.getClass(), "maximalCount", -244121226);
        setIntField(term2908, term2908.getClass(), "count", -203030934);
        setField(term2908, term2908.getClass(), "maxCountCallback", term2911);
        setField(term2798, term2798.getClass(), "evaluations", term2908);
        setField(term2798, term2798.getClass(), "checker", null);
        setField(term2798, term2798.getClass(), "goal", enum16);
        setField(term2798, term2798.getClass(), "start", term2924);
        setField(term2798, term2798.getClass(), "function", null);
        term2925 = new Double(0.2456100607115369);
        term2927 = new Double(0.40390514476233974);
        term2929 = new Integer(-1179120542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2925;
        args[1] = term2927;
        args[2] = term2929;
        try {
            callMethod(klass, "update", argTypes, term2798, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


