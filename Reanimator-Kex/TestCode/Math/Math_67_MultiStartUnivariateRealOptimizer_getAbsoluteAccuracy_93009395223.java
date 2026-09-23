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

public class MultiStartUnivariateRealOptimizer_getAbsoluteAccuracy_93009395223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;

    public MultiStartUnivariateRealOptimizer_getAbsoluteAccuracy_93009395223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term57 = (double[]) newDoubleArray(1);
        double[] term59 = (double[]) newDoubleArray(6);
        setField(term51, term51.getClass(), "optimizer", null);
        setIntField(term51, term51.getClass(), "maxIterations", -522618178);
        setIntField(term51, term51.getClass(), "maxEvaluations", 1134449235);
        setIntField(term51, term51.getClass(), "totalIterations", -883034806);
        setIntField(term51, term51.getClass(), "totalEvaluations", 1585847225);
        setIntField(term51, term51.getClass(), "starts", 597278769);
        setField(term51, term51.getClass(), "generator", null);
        setDoubleElement(term57, 0, 0.9828442029246764);
        setField(term51, term51.getClass(), "optima", term57);
        setDoubleElement(term59, 0, 0.2779719046761513);
        setDoubleElement(term59, 1, 0.6436713023569729);
        setDoubleElement(term59, 2, 0.7332741045694002);
        setDoubleElement(term59, 3, 0.4569171842750229);
        setDoubleElement(term59, 4, 0.8598297828918529);
        setDoubleElement(term59, 5, 0.43692187681405226);
        setField(term51, term51.getClass(), "optimaValues", term59);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getAbsoluteAccuracy", argTypes, term51, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


