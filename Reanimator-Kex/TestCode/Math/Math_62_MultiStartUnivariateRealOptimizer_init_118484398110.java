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
import java.lang.Integer;

public class MultiStartUnivariateRealOptimizer_init_118484398110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term1007;

    public MultiStartUnivariateRealOptimizer_init_118484398110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        term1007 = newInstance(Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer"));
        setField(term1007, term1007.getClass(), "optimizer", null);
        setIntField(term1007, term1007.getClass(), "maxEvaluations", 0);
        setIntField(term1007, term1007.getClass(), "totalEvaluations", 0);
        setIntField(term1007, term1007.getClass(), "starts", 568599855);
        setField(term1007, term1007.getClass(), "generator", null);
        setField(term1007, term1007.getClass(), "optima", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.univariate.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.univariate.BaseUnivariateRealOptimizer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.math.random.RandomGenerator");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term1;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term1007));
        assertTrue(recursiveEquals(term1, 568599855));
    }

};


