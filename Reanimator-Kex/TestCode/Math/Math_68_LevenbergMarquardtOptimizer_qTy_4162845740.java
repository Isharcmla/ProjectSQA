package org.apache.commons.math.optimization.general;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LevenbergMarquardtOptimizer_qTy_4162845740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18724;

    public LevenbergMarquardtOptimizer_qTy_4162845740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18724 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        int[] term18562 = (int[]) newIntArray(0);
        setIntField(term18724, term18724.getClass(), "cols", 1);
        setField(term18724, term18724.getClass(), "permutation", term18562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "qTy", argTypes, term18724, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


