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

public class PowellOptimizer_init_11698969235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public PowellOptimizer_init_11698969235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term23796 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        Object term23900 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleValueChecker"));
        Object term23988 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term23796, term23796.getClass(), "checker", term23900);
        setField(term23796, term23796.getClass(), "evaluations", null);
        setField(term23796, term23796.getClass(), "iterations", term23988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = -8.00048828125;
        args[1] = 0.0;
        args[2] = 0.0;
        args[3] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NumberIsTooSmallException e) {
        }

    }

};


