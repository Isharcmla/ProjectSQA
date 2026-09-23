package org.apache.commons.math.optimization.univariate;

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
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.univariate.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class MultiStartUnivariateRealOptimizer_sortPairs_29542117219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term708;
     Object enum5;
     Object term3044;
     Object enum6;
     Object term3056;
     Object term3057;
     Object term3058;
     Object term3059;

    public MultiStartUnivariateRealOptimizer_sortPairs_29542117219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term708 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term712 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 7);
        Object term713 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term716 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term719 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term722 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term725 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term728 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term731 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term708, term708.getClass(), "optimizer", null);
        setIntField(term708, term708.getClass(), "maxEvaluations", 590364439);
        setIntField(term708, term708.getClass(), "totalEvaluations", 865208305);
        setIntField(term708, term708.getClass(), "starts", -1275173084);
        setField(term708, term708.getClass(), "generator", null);
        setDoubleField(term713, term713.getClass(), "point", 0.025133051616627267);
        setDoubleField(term713, term713.getClass(), "value", 0.016575281023182953);
        setElement(term712, 0, term713);
        setDoubleField(term716, term716.getClass(), "point", 0.5308350402051779);
        setDoubleField(term716, term716.getClass(), "value", 0.7154795600170818);
        setElement(term712, 1, term716);
        setDoubleField(term719, term719.getClass(), "point", 0.6355029654528058);
        setDoubleField(term719, term719.getClass(), "value", 0.0022646783892913414);
        setElement(term712, 2, term719);
        setDoubleField(term722, term722.getClass(), "point", 0.36226058076369927);
        setDoubleField(term722, term722.getClass(), "value", 0.03699061125289671);
        setElement(term712, 3, term722);
        setDoubleField(term725, term725.getClass(), "point", 0.6047137830113202);
        setDoubleField(term725, term725.getClass(), "value", 0.6767213143579776);
        setElement(term712, 4, term725);
        setDoubleField(term728, term728.getClass(), "point", 0.48862955528902696);
        setDoubleField(term728, term728.getClass(), "value", 0.426231085465289);
        setElement(term712, 5, term728);
        setDoubleField(term731, term731.getClass(), "point", 0.0027299293098262956);
        setDoubleField(term731, term731.getClass(), "value", 0.29874017652881824);
        setElement(term712, 6, term731);
        setField(term708, term708.getClass(), "optima", term712);
        Class<? extends Object> term3061 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term3060 = ((Class) term3061).getDeclaredField((String) "MAXIMIZE");
        ((Field) term3060).setAccessible(true);
        enum5 = ((Field) term3060).get((Object) null);
        term3044 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term3045 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 7);
        Object term3046 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term3047 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term3048 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term3049 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term3050 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term3051 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term3052 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term3044, term3044.getClass(), "optimizer", null);
        setIntField(term3044, term3044.getClass(), "maxEvaluations", 590364439);
        setIntField(term3044, term3044.getClass(), "totalEvaluations", 865208305);
        setIntField(term3044, term3044.getClass(), "starts", -1275173084);
        setField(term3044, term3044.getClass(), "generator", null);
        setDoubleField(term3046, term3046.getClass(), "point", 0.5308350402051779);
        setDoubleField(term3046, term3046.getClass(), "value", 0.7154795600170818);
        setElement(term3045, 0, term3046);
        setDoubleField(term3047, term3047.getClass(), "point", 0.6047137830113202);
        setDoubleField(term3047, term3047.getClass(), "value", 0.6767213143579776);
        setElement(term3045, 1, term3047);
        setDoubleField(term3048, term3048.getClass(), "point", 0.48862955528902696);
        setDoubleField(term3048, term3048.getClass(), "value", 0.426231085465289);
        setElement(term3045, 2, term3048);
        setDoubleField(term3049, term3049.getClass(), "point", 0.0027299293098262956);
        setDoubleField(term3049, term3049.getClass(), "value", 0.29874017652881824);
        setElement(term3045, 3, term3049);
        setDoubleField(term3050, term3050.getClass(), "point", 0.36226058076369927);
        setDoubleField(term3050, term3050.getClass(), "value", 0.03699061125289671);
        setElement(term3045, 4, term3050);
        setDoubleField(term3051, term3051.getClass(), "point", 0.025133051616627267);
        setDoubleField(term3051, term3051.getClass(), "value", 0.016575281023182953);
        setElement(term3045, 5, term3051);
        setDoubleField(term3052, term3052.getClass(), "point", 0.6355029654528058);
        setDoubleField(term3052, term3052.getClass(), "value", 0.0022646783892913414);
        setElement(term3045, 6, term3052);
        setField(term3044, term3044.getClass(), "optima", term3045);
        Class<? extends Object> term3317 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term3316 = ((Class) term3317).getDeclaredField((String) "MAXIMIZE");
        ((Field) term3316).setAccessible(true);
        enum6 = ((Field) term3316).get((Object) null);
        term3056 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setDoubleField(term3056, term3056.getClass(), "point", 0.0027299293098262956);
        setDoubleField(term3056, term3056.getClass(), "value", 0.29874017652881824);
        term3057 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setDoubleField(term3057, term3057.getClass(), "point", 0.48862955528902696);
        setDoubleField(term3057, term3057.getClass(), "value", 0.426231085465289);
        term3058 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setDoubleField(term3058, term3058.getClass(), "point", 0.0027299293098262956);
        setDoubleField(term3058, term3058.getClass(), "value", 0.29874017652881824);
        term3059 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setDoubleField(term3059, term3059.getClass(), "point", 0.48862955528902696);
        setDoubleField(term3059, term3059.getClass(), "value", 0.426231085465289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.GoalType");
        Object[] args = new Object[1];
        args[0] = enum5;
        callMethod(klass, "sortPairs", argTypes, term708, args);
        assertTrue(recursiveEquals(term708, term3044));
        assertTrue(recursiveEquals(enum5, enum6));
    }

};


