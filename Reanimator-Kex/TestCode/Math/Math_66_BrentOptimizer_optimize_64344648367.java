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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_optimize_64344648367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51969;

    public BrentOptimizer_optimize_64344648367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52665 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term52664 = ((Class) term52665).getDeclaredField((String) "MINIMIZE");
        ((Field) term52664).setAccessible(true);
        Object enum74 = ((Field) term52664).get((Object) null);
        term51969 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term51969, term51969.getClass(), "resultComputed", false);
        setField(term51969, term51969.getClass(), "goal", enum74);
        setDoubleField(term51969, term51969.getClass(), "relativeAccuracy", 7.205759403819008E16);
        setDoubleField(term51969, term51969.getClass(), "absoluteAccuracy", 4.503599627378688E15);
        setIntField(term51969, term51969.getClass(), "evaluations", 2147483646);
        setIntField(term51969, term51969.getClass(), "maxEvaluations", 2147483647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = 2.578032054096185E-231;
        args[3] = -2.755000996861061E-135;
        args[4] = 0.0;
        try {
            callMethod(klass, "optimize", argTypes, term51969, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


