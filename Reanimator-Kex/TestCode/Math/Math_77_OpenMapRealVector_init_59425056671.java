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
import java.lang.Double;

public class OpenMapRealVector_init_59425056671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251;
     Object term260;
     Object term16364;
     Object term16369;

    public OpenMapRealVector_init_59425056671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term252 = new Double(0.544608645520025);
        Double term254 = new Double(0.28570734989730284);
        Double term256 = new Double(0.40176586625454525);
        Double term258 = new Double(0.2641345529914265);
        term251 = (Object[]) newArray("java.lang.Double", 4);
        setElement(term251, 0, term252);
        setElement(term251, 1, term254);
        setElement(term251, 2, term256);
        setElement(term251, 3, term258);
        term260 = new Double(0.7655020693602768);
        term16364 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term16365 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term16366 = (int[]) newIntArray(32);
        double[] term16367 = (double[]) newDoubleArray(32);
        byte[] term16368 = (byte[]) newByteArray(32);
        setField(term16365, term16365.getClass(), "keys", term16366);
        setField(term16365, term16365.getClass(), "values", term16367);
        setField(term16365, term16365.getClass(), "states", term16368);
        setDoubleField(term16365, term16365.getClass(), "missingEntries", 0.0);
        setIntField(term16365, term16365.getClass(), "size", 0);
        setIntField(term16365, term16365.getClass(), "mask", 31);
        setIntField(term16365, term16365.getClass(), "count", 0);
        setField(term16364, term16364.getClass(), "entries", term16365);
        setIntField(term16364, term16364.getClass(), "virtualSize", 4);
        setDoubleField(term16364, term16364.getClass(), "epsilon", 0.7655020693602768);
        Double term16370 = new Double(0.544608645520025);
        Double term16371 = new Double(0.28570734989730284);
        Double term16372 = new Double(0.40176586625454525);
        Double term16373 = new Double(0.2641345529914265);
        term16369 = (Object[]) newArray("java.lang.Double", 4);
        setElement(term16369, 0, term16370);
        setElement(term16369, 1, term16371);
        setElement(term16369, 2, term16372);
        setElement(term16369, 3, term16373);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Double"), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term251;
        args[1] = term260;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term16364));
        assertTrue(recursiveEquals(term251, term16369));
        assertTrue(recursiveEquals(term260, 0.7655020693602768));
    }

};


