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
import java.lang.OutOfMemoryError;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;

public class MultiStartUnivariateRealOptimizer_optimize_111445202018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411;
     Object enum4;
     Object term446;
     Object term448;
     Object term450;

    public MultiStartUnivariateRealOptimizer_optimize_111445202018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term415 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 6);
        Object term416 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term419 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term422 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term425 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term428 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term431 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term411, term411.getClass(), "optimizer", null);
        setIntField(term411, term411.getClass(), "maxEvaluations", -117576464);
        setIntField(term411, term411.getClass(), "totalEvaluations", -1007160944);
        setIntField(term411, term411.getClass(), "starts", 1135664017);
        setField(term411, term411.getClass(), "generator", null);
        setDoubleField(term416, term416.getClass(), "point", 0.9374115574082594);
        setDoubleField(term416, term416.getClass(), "value", 0.8454723071922143);
        setElement(term415, 0, term416);
        setDoubleField(term419, term419.getClass(), "point", 0.8566567697571895);
        setDoubleField(term419, term419.getClass(), "value", 0.9203805380592256);
        setElement(term415, 1, term419);
        setDoubleField(term422, term422.getClass(), "point", 0.5804948995371725);
        setDoubleField(term422, term422.getClass(), "value", 0.20737514139742264);
        setElement(term415, 2, term422);
        setDoubleField(term425, term425.getClass(), "point", 0.7919370314903882);
        setDoubleField(term425, term425.getClass(), "value", 0.2109867221632754);
        setElement(term415, 3, term425);
        setDoubleField(term428, term428.getClass(), "point", 0.3227335400819148);
        setDoubleField(term428, term428.getClass(), "value", 0.43337207054070237);
        setElement(term415, 4, term428);
        setDoubleField(term431, term431.getClass(), "point", 0.13246999699526574);
        setDoubleField(term431, term431.getClass(), "value", 0.9126850255993704);
        setElement(term415, 5, term431);
        setField(term411, term411.getClass(), "optima", term415);
        Class<? extends Object> term2612 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term2611 = ((Class) term2612).getDeclaredField((String) "MAXIMIZE");
        ((Field) term2611).setAccessible(true);
        enum4 = ((Field) term2611).get((Object) null);
        term446 = new Double(0.11179067076100713);
        term448 = new Double(0.5306473989087822);
        term450 = new Double(0.022483645678509023);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = enum4;
        args[2] = term446;
        args[3] = term448;
        args[4] = term450;
        try {
            callMethod(klass, "optimize", argTypes, term411, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


