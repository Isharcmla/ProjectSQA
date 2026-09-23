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

public class MultiStartUnivariateRealOptimizer_resetRelativeAccuracy_36191284931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public MultiStartUnivariateRealOptimizer_resetRelativeAccuracy_36191284931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term243 = (double[]) newDoubleArray(2);
        double[] term246 = (double[]) newDoubleArray(1);
        setField(term237, term237.getClass(), "optimizer", null);
        setIntField(term237, term237.getClass(), "maxIterations", 454281060);
        setIntField(term237, term237.getClass(), "maxEvaluations", -1786399638);
        setIntField(term237, term237.getClass(), "totalIterations", 2055867847);
        setIntField(term237, term237.getClass(), "totalEvaluations", -1048298087);
        setIntField(term237, term237.getClass(), "starts", 292681826);
        setField(term237, term237.getClass(), "generator", null);
        setDoubleElement(term243, 0, 0.48862955528902696);
        setDoubleElement(term243, 1, 0.426231085465289);
        setField(term237, term237.getClass(), "optima", term243);
        setDoubleElement(term246, 0, 0.0027299293098262956);
        setField(term237, term237.getClass(), "optimaValues", term246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetRelativeAccuracy", argTypes, term237, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


