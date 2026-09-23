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
import org.apache.commons.math.MaxIterationsExceededException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class BrentOptimizer_localMin_36303945171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54877;
     Object term54991;
     Object enum78;

    public BrentOptimizer_localMin_36303945171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54877 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setIntField(term54877, term54877.getClass(), "evaluations", 2147483646);
        setIntField(term54877, term54877.getClass(), "maxEvaluations", 2147483647);
        term54991 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$15"));
        Class<? extends Object> term56071 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term56070 = ((Class) term56071).getDeclaredField((String) "MAXIMIZE");
        ((Field) term56070).setAccessible(true);
        enum78 = ((Field) term56070).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[2] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[3] = double.class;
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        Object[] args = new Object[8];
        args[0] = false;
        args[1] = term54991;
        args[2] = enum78;
        args[3] = -1.7490513659736237E41;
        args[4] = 0.0;
        args[5] = -1.4639205929890583E-303;
        args[6] = 3.026100447569794E-306;
        args[7] = 2.225073858507202E-308;
        try {
            callMethod(klass, "localMin", argTypes, term54877, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


