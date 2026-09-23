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
import java.lang.NullPointerException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_dotProduct_41109436484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3111;

    public OpenMapRealVector_dotProduct_41109436484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3111 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term3112 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term3113 = (int[]) newIntArray(32);
        double[] term3146 = (double[]) newDoubleArray(32);
        byte[] term3179 = (byte[]) newByteArray(32);
        setField(term3112, term3112.getClass(), "keys", term3113);
        setField(term3112, term3112.getClass(), "values", term3146);
        setField(term3112, term3112.getClass(), "states", term3179);
        setDoubleField(term3112, term3112.getClass(), "missingEntries", 0.0);
        setIntField(term3112, term3112.getClass(), "size", 0);
        setIntField(term3112, term3112.getClass(), "mask", 31);
        setIntField(term3112, term3112.getClass(), "count", 0);
        setField(term3111, term3111.getClass(), "entries", term3112);
        setIntField(term3111, term3111.getClass(), "virtualSize", -2068769794);
        setDoubleField(term3111, term3111.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "dotProduct", argTypes, term3111, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


