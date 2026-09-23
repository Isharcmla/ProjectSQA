package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_equals_146384934147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9013;
     Object term9120;

    public OpenMapRealVector_equals_146384934147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9013 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term9014 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term9015 = (int[]) newIntArray(32);
        double[] term9048 = (double[]) newDoubleArray(32);
        byte[] term9081 = (byte[]) newByteArray(32);
        setField(term9014, term9014.getClass(), "keys", term9015);
        setField(term9014, term9014.getClass(), "values", term9048);
        setField(term9014, term9014.getClass(), "states", term9081);
        setDoubleField(term9014, term9014.getClass(), "missingEntries", 0.0);
        setIntField(term9014, term9014.getClass(), "size", 0);
        setIntField(term9014, term9014.getClass(), "mask", 31);
        setIntField(term9014, term9014.getClass(), "count", 0);
        setField(term9013, term9013.getClass(), "entries", term9014);
        setIntField(term9013, term9013.getClass(), "virtualSize", 458147407);
        setDoubleField(term9013, term9013.getClass(), "epsilon", 1.0E-12);
        term9120 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9120;
        callMethod(klass, "equals", argTypes, term9013, args);
    }

};


