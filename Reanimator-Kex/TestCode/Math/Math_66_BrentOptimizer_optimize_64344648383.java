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

public class BrentOptimizer_optimize_64344648383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64267;
     Object term64553;

    public BrentOptimizer_optimize_64344648383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term65117 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term65116 = ((Class) term65117).getDeclaredField((String) "MINIMIZE");
        ((Field) term65116).setAccessible(true);
        Object enum95 = ((Field) term65116).get((Object) null);
        term64267 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setBooleanField(term64267, term64267.getClass(), "resultComputed", false);
        setField(term64267, term64267.getClass(), "goal", enum95);
        setDoubleField(term64267, term64267.getClass(), "relativeAccuracy", 5.7646295132667904E17);
        setDoubleField(term64267, term64267.getClass(), "absoluteAccuracy", 4.0);
        setIntField(term64267, term64267.getClass(), "evaluations", 2147483646);
        setIntField(term64267, term64267.getClass(), "maxEvaluations", 2147483647);
        term64553 = newInstance(Class.forName("org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm"));
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
        args[0] = term64553;
        args[1] = null;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = 0.0;
        try {
            callMethod(klass, "optimize", argTypes, term64267, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


