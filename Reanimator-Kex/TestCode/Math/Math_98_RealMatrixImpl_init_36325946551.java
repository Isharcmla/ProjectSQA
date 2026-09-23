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
import static org.apache.commons.math.linear.EqualityUtils.*;
import java.lang.Object;

public class RealMatrixImpl_init_36325946551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term6357;
     Object term6360;

    public RealMatrixImpl_init_36325946551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = (double[]) newDoubleArray(1);
        setDoubleElement(term78, 0, 0.6805867182029153);
        term6357 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term6358 = (Object[]) newArray("[D", 1);
        double[] term6359 = (double[]) newDoubleArray(1);
        setDoubleElement(term6359, 0, 0.6805867182029153);
        setElement(term6358, 0, term6359);
        setField(term6357, term6357.getClass(), "data", term6358);
        setField(term6357, term6357.getClass(), "lu", null);
        setField(term6357, term6357.getClass(), "permutation", null);
        setIntField(term6357, term6357.getClass(), "parity", 1);
        term6360 = (double[]) newDoubleArray(1);
        setDoubleElement(term6360, 0, 0.6805867182029153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term78;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6357));
        assertTrue(recursiveEquals(term78, term6360));
    }

};


