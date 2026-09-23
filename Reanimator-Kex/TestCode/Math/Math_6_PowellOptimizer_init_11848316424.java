package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PowellOptimizer_init_11848316424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public PowellOptimizer_init_11848316424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11121 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        Object term11209 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term11121, term11121.getClass(), "checker", null);
        setField(term11121, term11121.getClass(), "evaluations", term11209);
        setField(term11121, term11121.getClass(), "iterations", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 2.225209674526869E-308;
        args[1] = -2.225073858507202E-308;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NumberIsTooSmallException e) {
        }

    }

};


