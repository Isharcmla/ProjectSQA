package org.apache.commons.math3.util;

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
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MathArrays_checkOrder_105786781258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;

    public MathArrays_checkOrder_105786781258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1567 = (double[]) newDoubleArray(6);
        setDoubleElement(term1567, 0, 0.1544348383112728);
        setDoubleElement(term1567, 1, 0.5187846213101265);
        setDoubleElement(term1567, 2, 0.045893173090043815);
        setDoubleElement(term1567, 3, 0.3626177854778667);
        setDoubleElement(term1567, 4, 0.3163771663728089);
        setDoubleElement(term1567, 5, 0.8819646072665548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1567;
        try {
            callMethod(klass, "checkOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NonMonotonicSequenceException e) {
        }

    }

};


