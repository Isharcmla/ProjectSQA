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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_98489625229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;

    public MultiStartUnivariateRealOptimizer_resetAbsoluteAccuracy_98489625229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term195 = (double[]) newDoubleArray(0);
        double[] term196 = (double[]) newDoubleArray(2);
        setField(term189, term189.getClass(), "optimizer", null);
        setIntField(term189, term189.getClass(), "maxIterations", 767834723);
        setIntField(term189, term189.getClass(), "maxEvaluations", -602026508);
        setIntField(term189, term189.getClass(), "totalIterations", -157887805);
        setIntField(term189, term189.getClass(), "totalEvaluations", 1876565163);
        setIntField(term189, term189.getClass(), "starts", -817164822);
        setField(term189, term189.getClass(), "generator", null);
        setField(term189, term189.getClass(), "optima", term195);
        setDoubleElement(term196, 0, 0.43337207054070237);
        setDoubleElement(term196, 1, 0.13246999699526574);
        setField(term189, term189.getClass(), "optimaValues", term196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetAbsoluteAccuracy", argTypes, term189, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


