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

public class MultiStartUnivariateRealOptimizer_getOptima_27505533463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10470;
     Object term10480;
     Object term10472;

    public MultiStartUnivariateRealOptimizer_getOptima_27505533463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10470 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term10310 = (double[]) newDoubleArray(0);
        setField(term10470, term10470.getClass(), "optima", term10310);
        term10480 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term10481 = (double[]) newDoubleArray(0);
        setField(term10480, term10480.getClass(), "optimizer", null);
        setIntField(term10480, term10480.getClass(), "maxIterations", 0);
        setIntField(term10480, term10480.getClass(), "maxEvaluations", 0);
        setIntField(term10480, term10480.getClass(), "totalIterations", 0);
        setIntField(term10480, term10480.getClass(), "totalEvaluations", 0);
        setIntField(term10480, term10480.getClass(), "starts", 0);
        setField(term10480, term10480.getClass(), "generator", null);
        setField(term10480, term10480.getClass(), "optima", term10481);
        setField(term10480, term10480.getClass(), "optimaValues", null);
        term10472 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptima", argTypes, term10470, args);
        assertTrue(recursiveEquals(term10470, term10480));
        assertTrue(recursiveEquals(retValue, term10472));
    }

};


