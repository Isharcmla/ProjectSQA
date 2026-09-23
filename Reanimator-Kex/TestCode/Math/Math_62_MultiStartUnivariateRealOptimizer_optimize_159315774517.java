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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;

public class MultiStartUnivariateRealOptimizer_optimize_159315774517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object enum3;
     Object term127;
     Object term129;

    public MultiStartUnivariateRealOptimizer_optimize_159315774517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        Object[] term108 = (Object[]) newArray("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair", 2);
        Object term109 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        Object term112 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.UnivariateRealPointValuePair"));
        setField(term104, term104.getClass(), "optimizer", null);
        setIntField(term104, term104.getClass(), "maxEvaluations", -655067527);
        setIntField(term104, term104.getClass(), "totalEvaluations", -6029667);
        setIntField(term104, term104.getClass(), "starts", -2068769794);
        setField(term104, term104.getClass(), "generator", null);
        setDoubleField(term109, term109.getClass(), "point", 0.8823181080774973);
        setDoubleField(term109, term109.getClass(), "value", 0.2192450926212024);
        setElement(term108, 0, term109);
        setDoubleField(term112, term112.getClass(), "point", 0.7591353014991907);
        setDoubleField(term112, term112.getClass(), "value", 0.791695029600875);
        setElement(term108, 1, term112);
        setField(term104, term104.getClass(), "optima", term108);
        Class<? extends Object> term2091 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term2090 = ((Class) term2091).getDeclaredField((String) "MAXIMIZE");
        ((Field) term2090).setAccessible(true);
        enum3 = ((Field) term2090).get((Object) null);
        term127 = new Double(0.6862221294683138);
        term129 = new Double(0.15917839663695388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = enum3;
        args[2] = term127;
        args[3] = term129;
        try {
            callMethod(klass, "optimize", argTypes, term104, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


