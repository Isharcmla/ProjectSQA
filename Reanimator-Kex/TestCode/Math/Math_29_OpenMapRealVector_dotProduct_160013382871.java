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
import java.lang.NullPointerException;
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_dotProduct_160013382871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2905;

    public OpenMapRealVector_dotProduct_160013382871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2905 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term2906 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] term2907 = (int[]) newIntArray(32);
        double[] term2940 = (double[]) newDoubleArray(32);
        byte[] term2973 = (byte[]) newByteArray(32);
        setField(term2906, term2906.getClass(), "keys", term2907);
        setField(term2906, term2906.getClass(), "values", term2940);
        setField(term2906, term2906.getClass(), "states", term2973);
        setDoubleField(term2906, term2906.getClass(), "missingEntries", 0.0);
        setIntField(term2906, term2906.getClass(), "size", 0);
        setIntField(term2906, term2906.getClass(), "mask", 31);
        setIntField(term2906, term2906.getClass(), "count", 0);
        setField(term2905, term2905.getClass(), "entries", term2906);
        setIntField(term2905, term2905.getClass(), "virtualSize", -6029667);
        setDoubleField(term2905, term2905.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "dotProduct", argTypes, term2905, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


