package org.apache.commons.math.optimization;

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
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.EqualityUtils.*;
import java.lang.Integer;

public class MultiStartUnivariateRealOptimizer_init_171505919620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1047;

    public MultiStartUnivariateRealOptimizer_init_171505919620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term1047 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        setField(term1047, term1047.getClass(), "optimizer", null);
        setIntField(term1047, term1047.getClass(), "maxIterations", 2147483647);
        setIntField(term1047, term1047.getClass(), "maxEvaluations", 2147483647);
        setIntField(term1047, term1047.getClass(), "totalIterations", 0);
        setIntField(term1047, term1047.getClass(), "totalEvaluations", 0);
        setIntField(term1047, term1047.getClass(), "starts", 568599855);
        setField(term1047, term1047.getClass(), "generator", null);
        setField(term1047, term1047.getClass(), "optima", null);
        setField(term1047, term1047.getClass(), "optimaValues", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.UnivariateRealOptimizer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1047));
        assertTrue(recursiveEquals(term1, 568599855));
    }

};


