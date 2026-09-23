package org.apache.commons.math3.optimization.univariate;

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
import static org.apache.commons.math3.optimization.univariate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BrentOptimizer_init_137252149819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7955;

    public BrentOptimizer_init_137252149819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7707 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer"));
        Object term7795 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        setField(term7707, term7707.getClass(), "evaluations", term7795);
        setField(term7707, term7707.getClass(), "checker", null);
        term7955 = newInstance(Class.forName("org.apache.commons.math3.optimization.univariate.SimpleUnivariateValueChecker"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.univariate.BrentOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = Class.forName("org.apache.commons.math3.optimization.ConvergenceChecker");
        Object[] args = new Object[3];
        args[0] = -32.000003814697266;
        args[1] = 0.0;
        args[2] = term7955;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NumberIsTooSmallException e) {
        }

    }

};


