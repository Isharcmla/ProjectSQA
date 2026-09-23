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

public class MultiStartUnivariateRealOptimizer_getOptima_27505533458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8494;
     Object term9747;
     Object term9739;

    public MultiStartUnivariateRealOptimizer_getOptima_27505533458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8494 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term8337 = (double[]) newDoubleArray(0);
        setField(term8494, term8494.getClass(), "optima", term8337);
        term9747 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term9748 = (double[]) newDoubleArray(0);
        setField(term9747, term9747.getClass(), "optimizer", null);
        setIntField(term9747, term9747.getClass(), "maxIterations", 0);
        setIntField(term9747, term9747.getClass(), "maxEvaluations", 0);
        setIntField(term9747, term9747.getClass(), "totalIterations", 0);
        setIntField(term9747, term9747.getClass(), "totalEvaluations", 0);
        setIntField(term9747, term9747.getClass(), "starts", 0);
        setField(term9747, term9747.getClass(), "generator", null);
        setField(term9747, term9747.getClass(), "optima", term9748);
        setField(term9747, term9747.getClass(), "optimaValues", null);
        term9739 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptima", argTypes, term8494, args);
        assertTrue(recursiveEquals(term8494, term9747));
        assertTrue(recursiveEquals(retValue, term9739));
    }

};


