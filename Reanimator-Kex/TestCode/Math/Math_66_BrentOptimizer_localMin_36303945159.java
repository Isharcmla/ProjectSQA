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

public class BrentOptimizer_localMin_36303945159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46119;
     Object term46233;
     Object enum69;

    public BrentOptimizer_localMin_36303945159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46119 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
        setIntField(term46119, term46119.getClass(), "evaluations", 2147483646);
        setIntField(term46119, term46119.getClass(), "maxEvaluations", 2147483647);
        term46233 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$17"));
        Class<? extends Object> term47313 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term47312 = ((Class) term47313).getDeclaredField((String) "MAXIMIZE");
        ((Field) term47312).setAccessible(true);
        enum69 = ((Field) term47312).get((Object) null);
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
        args[1] = term46233;
        args[2] = enum69;
        args[3] = 9.771485204639278E-227;
        args[4] = -3.3752746582108566;
        args[5] = -1.5084605381367744E-298;
        args[6] = 4.778309726738654E-299;
        args[7] = 3.785766995843859E-270;
        try {
            callMethod(klass, "localMin", argTypes, term46119, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


