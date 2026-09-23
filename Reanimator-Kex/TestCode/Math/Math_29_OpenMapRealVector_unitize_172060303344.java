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

public class OpenMapRealVector_unitize_172060303344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8404;

    public OpenMapRealVector_unitize_172060303344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8404 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term8405 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term8406 = (int[]) newIntArray(32);
        double[] term8439 = (double[]) newDoubleArray(32);
        byte[] term8472 = (byte[]) newByteArray(32);
        setField(term8405, term8405.getClass(), "keys", term8406);
        setField(term8405, term8405.getClass(), "values", term8439);
        setField(term8405, term8405.getClass(), "states", term8472);
        setDoubleField(term8405, term8405.getClass(), "missingEntries", 0.0);
        setIntField(term8405, term8405.getClass(), "size", 0);
        setIntField(term8405, term8405.getClass(), "mask", 31);
        setIntField(term8405, term8405.getClass(), "count", 0);
        setField(term8404, term8404.getClass(), "entries", term8405);
        setIntField(term8404, term8404.getClass(), "virtualSize", 2055867847);
        setDoubleField(term8404, term8404.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unitize", argTypes, term8404, args);
    }

};


