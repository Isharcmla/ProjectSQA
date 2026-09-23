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

public class MultiStartUnivariateRealOptimizer_getFunctionValue_50600192321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public MultiStartUnivariateRealOptimizer_getFunctionValue_50600192321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term9 = (double[]) newDoubleArray(5);
        double[] term15 = (double[]) newDoubleArray(4);
        setField(term3, term3.getClass(), "optimizer", null);
        setIntField(term3, term3.getClass(), "maxIterations", 1162663216);
        setIntField(term3, term3.getClass(), "maxEvaluations", 1484323161);
        setIntField(term3, term3.getClass(), "totalIterations", 391863371);
        setIntField(term3, term3.getClass(), "totalEvaluations", -1922583790);
        setIntField(term3, term3.getClass(), "starts", -616727354);
        setField(term3, term3.getClass(), "generator", null);
        setDoubleElement(term9, 0, 0.13238746331190498);
        setDoubleElement(term9, 1, 0.3455959125047594);
        setDoubleElement(term9, 2, 0.5523635872663106);
        setDoubleElement(term9, 3, 0.544608645520025);
        setDoubleElement(term9, 4, 0.28570734989730284);
        setField(term3, term3.getClass(), "optima", term9);
        setDoubleElement(term15, 0, 0.40176586625454525);
        setDoubleElement(term15, 1, 0.2641345529914265);
        setDoubleElement(term15, 2, 0.36923381893433327);
        setDoubleElement(term15, 3, 0.6076495596892013);
        setField(term3, term3.getClass(), "optimaValues", term15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getFunctionValue", argTypes, term3, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


