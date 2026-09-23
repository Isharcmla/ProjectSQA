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

public class MultiStartUnivariateRealOptimizer_getOptimaValues_51756386859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8653;
     Object term9758;
     Object term9750;

    public MultiStartUnivariateRealOptimizer_getOptimaValues_51756386859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8653 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term8496 = (double[]) newDoubleArray(0);
        setField(term8653, term8653.getClass(), "optimaValues", term8496);
        term9758 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term9759 = (double[]) newDoubleArray(0);
        setField(term9758, term9758.getClass(), "optimizer", null);
        setIntField(term9758, term9758.getClass(), "maxIterations", 0);
        setIntField(term9758, term9758.getClass(), "maxEvaluations", 0);
        setIntField(term9758, term9758.getClass(), "totalIterations", 0);
        setIntField(term9758, term9758.getClass(), "totalEvaluations", 0);
        setIntField(term9758, term9758.getClass(), "starts", 0);
        setField(term9758, term9758.getClass(), "generator", null);
        setField(term9758, term9758.getClass(), "optima", null);
        setField(term9758, term9758.getClass(), "optimaValues", term9759);
        term9750 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptimaValues", argTypes, term8653, args);
        assertTrue(recursiveEquals(term8653, term9758));
        assertTrue(recursiveEquals(retValue, term9750));
    }

};


