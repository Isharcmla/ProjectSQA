package org.apache.commons.math3.analysis.differentiation;

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
import static org.apache.commons.math3.analysis.differentiation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.analysis.differentiation.EqualityUtils.*;

public class DSCompiler_getPartialDerivativeIndex_1559361099119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public DSCompiler_getPartialDerivativeIndex_1559361099119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.analysis.differentiation.DSCompiler");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[4];
        args[0] = 0;
        args[1] = 0;
        args[2] = null;
        args[3] = null;
        Object retValue = callMethod(klass, "getPartialDerivativeIndex", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, 0));
    }

};


