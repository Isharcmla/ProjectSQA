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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BOBYQAOptimizer_doOptimize_166019900363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56517;

    public BOBYQAOptimizer_doOptimize_166019900363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56517 = newInstance(Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer"));
        double[] term56373 = (double[]) newDoubleArray(0);
        double[] term56375 = (double[]) newDoubleArray(0);
        setField(term56517, term56517.getClass(), "lowerBound", term56373);
        setField(term56517, term56517.getClass(), "upperBound", term56375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.direct.BOBYQAOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term56517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


