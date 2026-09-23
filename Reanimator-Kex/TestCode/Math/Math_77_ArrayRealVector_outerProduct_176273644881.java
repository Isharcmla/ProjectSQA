package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ArrayRealVector_outerProduct_176273644881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;
     Object term337;

    public ArrayRealVector_outerProduct_176273644881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term335 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term336 = (double[]) newDoubleArray(0);
        setField(term335, term335.getClass(), "data", term336);
        term337 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term338 = (double[]) newDoubleArray(0);
        setField(term337, term337.getClass(), "data", term338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term337;
        callMethod(klass, "outerProduct", argTypes, term335, args);
    }

};


