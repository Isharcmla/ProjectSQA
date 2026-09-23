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

public class OpenMapRealVector_subtract_187832260342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7998;

    public OpenMapRealVector_subtract_187832260342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7998 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term7999 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term8000 = (int[]) newIntArray(32);
        double[] term8033 = (double[]) newDoubleArray(32);
        byte[] term8066 = (byte[]) newByteArray(32);
        setField(term7999, term7999.getClass(), "keys", term8000);
        setField(term7999, term7999.getClass(), "values", term8033);
        setField(term7999, term7999.getClass(), "states", term8066);
        setDoubleField(term7999, term7999.getClass(), "missingEntries", 0.0);
        setIntField(term7999, term7999.getClass(), "size", 0);
        setIntField(term7999, term7999.getClass(), "mask", 31);
        setIntField(term7999, term7999.getClass(), "count", 0);
        setField(term7998, term7998.getClass(), "entries", term7999);
        setIntField(term7998, term7998.getClass(), "virtualSize", 454281060);
        setDoubleField(term7998, term7998.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "subtract", argTypes, term7998, args);
    }

};


