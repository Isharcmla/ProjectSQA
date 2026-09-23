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

public class OpenMapRealVector_unitVector_188924428243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8201;

    public OpenMapRealVector_unitVector_188924428243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8201 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term8202 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term8203 = (int[]) newIntArray(32);
        double[] term8236 = (double[]) newDoubleArray(32);
        byte[] term8269 = (byte[]) newByteArray(32);
        setField(term8202, term8202.getClass(), "keys", term8203);
        setField(term8202, term8202.getClass(), "values", term8236);
        setField(term8202, term8202.getClass(), "states", term8269);
        setDoubleField(term8202, term8202.getClass(), "missingEntries", 0.0);
        setIntField(term8202, term8202.getClass(), "size", 0);
        setIntField(term8202, term8202.getClass(), "mask", 31);
        setIntField(term8202, term8202.getClass(), "count", 0);
        setField(term8201, term8201.getClass(), "entries", term8202);
        setIntField(term8201, term8201.getClass(), "virtualSize", -1786399638);
        setDoubleField(term8201, term8201.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unitVector", argTypes, term8201, args);
    }

};


