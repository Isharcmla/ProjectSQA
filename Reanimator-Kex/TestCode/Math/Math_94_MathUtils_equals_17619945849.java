package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MathUtils_equals_17619945849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53;
     Object term59;

    public MathUtils_equals_17619945849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53 = (double[]) newDoubleArray(5);
        setDoubleElement(term53, 0, 0.544608645520025);
        setDoubleElement(term53, 1, 0.28570734989730284);
        setDoubleElement(term53, 2, 0.40176586625454525);
        setDoubleElement(term53, 3, 0.2641345529914265);
        setDoubleElement(term53, 4, 0.36923381893433327);
        term59 = (double[]) newDoubleArray(4);
        setDoubleElement(term59, 0, 0.6076495596892013);
        setDoubleElement(term59, 1, 0.37773193782763337);
        setDoubleElement(term59, 2, 0.8474802076607362);
        setDoubleElement(term59, 3, 0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term53;
        args[1] = term59;
        callMethod(klass, "equals", argTypes, null, args);
    }

};


