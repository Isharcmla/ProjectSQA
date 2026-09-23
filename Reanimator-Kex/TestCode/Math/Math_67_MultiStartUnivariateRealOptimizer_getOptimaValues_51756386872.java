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

public class MultiStartUnivariateRealOptimizer_getOptimaValues_51756386872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11912;
     Object term12371;
     Object term12363;

    public MultiStartUnivariateRealOptimizer_getOptimaValues_51756386872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11912 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term11753 = (double[]) newDoubleArray(0);
        setField(term11912, term11912.getClass(), "optimaValues", term11753);
        term12371 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term12372 = (double[]) newDoubleArray(0);
        setField(term12371, term12371.getClass(), "optimizer", null);
        setIntField(term12371, term12371.getClass(), "maxIterations", 0);
        setIntField(term12371, term12371.getClass(), "maxEvaluations", 0);
        setIntField(term12371, term12371.getClass(), "totalIterations", 0);
        setIntField(term12371, term12371.getClass(), "totalEvaluations", 0);
        setIntField(term12371, term12371.getClass(), "starts", 0);
        setField(term12371, term12371.getClass(), "generator", null);
        setField(term12371, term12371.getClass(), "optima", null);
        setField(term12371, term12371.getClass(), "optimaValues", term12372);
        term12363 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptimaValues", argTypes, term11912, args);
        assertTrue(recursiveEquals(term11912, term12371));
        assertTrue(recursiveEquals(retValue, term12363));
    }

};


