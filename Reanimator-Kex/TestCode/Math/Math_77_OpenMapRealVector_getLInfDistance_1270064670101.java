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

public class OpenMapRealVector_getLInfDistance_1270064670101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7223;

    public OpenMapRealVector_getLInfDistance_1270064670101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7223 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term7224 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term7225 = (int[]) newIntArray(32);
        double[] term7258 = (double[]) newDoubleArray(32);
        byte[] term7291 = (byte[]) newByteArray(32);
        setField(term7224, term7224.getClass(), "keys", term7225);
        setField(term7224, term7224.getClass(), "values", term7258);
        setField(term7224, term7224.getClass(), "states", term7291);
        setDoubleField(term7224, term7224.getClass(), "missingEntries", 0.0);
        setIntField(term7224, term7224.getClass(), "size", 0);
        setIntField(term7224, term7224.getClass(), "mask", 31);
        setIntField(term7224, term7224.getClass(), "count", 0);
        setField(term7223, term7223.getClass(), "entries", term7224);
        setIntField(term7223, term7223.getClass(), "virtualSize", -817164822);
        setDoubleField(term7223, term7223.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLInfDistance", argTypes, term7223, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


