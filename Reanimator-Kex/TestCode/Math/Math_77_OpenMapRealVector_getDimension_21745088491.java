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

public class OpenMapRealVector_getDimension_21745088491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4554;
     Object term35251;

    public OpenMapRealVector_getDimension_21745088491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4554 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term4555 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term4556 = (int[]) newIntArray(32);
        double[] term4589 = (double[]) newDoubleArray(32);
        byte[] term4622 = (byte[]) newByteArray(32);
        setField(term4555, term4555.getClass(), "keys", term4556);
        setField(term4555, term4555.getClass(), "values", term4589);
        setField(term4555, term4555.getClass(), "states", term4622);
        setDoubleField(term4555, term4555.getClass(), "missingEntries", 0.0);
        setIntField(term4555, term4555.getClass(), "size", 0);
        setIntField(term4555, term4555.getClass(), "mask", 31);
        setIntField(term4555, term4555.getClass(), "count", 0);
        setField(term4554, term4554.getClass(), "entries", term4555);
        setIntField(term4554, term4554.getClass(), "virtualSize", -1179120542);
        setDoubleField(term4554, term4554.getClass(), "epsilon", 1.0E-12);
        term35251 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term35252 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term35253 = (int[]) newIntArray(32);
        double[] term35254 = (double[]) newDoubleArray(32);
        byte[] term35255 = (byte[]) newByteArray(32);
        setField(term35252, term35252.getClass(), "keys", term35253);
        setField(term35252, term35252.getClass(), "values", term35254);
        setField(term35252, term35252.getClass(), "states", term35255);
        setDoubleField(term35252, term35252.getClass(), "missingEntries", 0.0);
        setIntField(term35252, term35252.getClass(), "size", 0);
        setIntField(term35252, term35252.getClass(), "mask", 31);
        setIntField(term35252, term35252.getClass(), "count", 0);
        setField(term35251, term35251.getClass(), "entries", term35252);
        setIntField(term35251, term35251.getClass(), "virtualSize", -1179120542);
        setDoubleField(term35251, term35251.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDimension", argTypes, term4554, args);
        assertTrue(recursiveEquals(term4554, term35251));
        assertTrue(recursiveEquals(retValue, -1179120542));
    }

};


