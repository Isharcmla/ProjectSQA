package org.apache.commons.math.stat.inference;

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
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChiSquareTestImpl_chiSquareTest_85594117366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28650;

    public ChiSquareTestImpl_chiSquareTest_85594117366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28650 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = -7.291122019556399E-304;
        callMethod(klass, "chiSquareTest", argTypes, term28650, args);
    }

};


