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
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import static org.apache.commons.math.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BrentOptimizer_localMin_36303945121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16182;

    public BrentOptimizer_localMin_36303945121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16182 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.BrentOptimizer"));
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
        args[1] = null;
        args[2] = null;
        args[3] = 0.0;
        args[4] = 0.0;
        args[5] = 0.0;
        args[6] = 2.225073858507202E-308;
        args[7] = -2.225073858507202E-308;
        try {
            callMethod(klass, "localMin", argTypes, term16182, args);
            assertTrue(false);
        }
        catch (NotStrictlyPositiveException e) {
        }

    }

};


