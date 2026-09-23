package org.apache.commons.math.optimization.direct;

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
import org.apache.commons.math.exception.NumberIsTooSmallException;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BOBYQAOptimizer_doOptimize_166019900333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38545;

    public BOBYQAOptimizer_doOptimize_166019900333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38545 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        double[] term38398 = (double[]) newDoubleArray(0);
        double[] term38400 = (double[]) newDoubleArray(0);
        double[] term38402 = (double[]) newDoubleArray(0);
        setField(term38545, term38545.getClass(), "lowerBound", term38398);
        setField(term38545, term38545.getClass(), "upperBound", term38400);
        setField(term38545, term38545.getClass(), "start", term38402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term38545, args);
            assertTrue(false);
        }
        catch (NumberIsTooSmallException e) {
        }

    }

};


