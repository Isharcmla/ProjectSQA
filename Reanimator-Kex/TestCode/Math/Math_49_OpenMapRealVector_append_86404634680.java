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

public class OpenMapRealVector_append_86404634680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2296;
     Object term2403;
     Object term28153;
     Object term28158;
     Object term27529;

    public OpenMapRealVector_append_86404634680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2296 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term2297 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term2298 = (int[]) newIntArray(32);
        double[] term2331 = (double[]) newDoubleArray(32);
        byte[] term2364 = (byte[]) newByteArray(32);
        setField(term2297, term2297.getClass(), "keys", term2298);
        setField(term2297, term2297.getClass(), "values", term2331);
        setField(term2297, term2297.getClass(), "states", term2364);
        setDoubleField(term2297, term2297.getClass(), "missingEntries", 0.0);
        setIntField(term2297, term2297.getClass(), "size", 0);
        setIntField(term2297, term2297.getClass(), "mask", 31);
        setIntField(term2297, term2297.getClass(), "count", 0);
        setField(term2296, term2296.getClass(), "entries", term2297);
        setIntField(term2296, term2296.getClass(), "virtualSize", 1622346318);
        setDoubleField(term2296, term2296.getClass(), "epsilon", 1.0E-12);
        term2403 = (double[]) newDoubleArray(1);
        setDoubleElement(term2403, 0, 0.9527281779865117);
        term28153 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term28154 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term28155 = (int[]) newIntArray(32);
        double[] term28156 = (double[]) newDoubleArray(32);
        byte[] term28157 = (byte[]) newByteArray(32);
        setField(term28154, term28154.getClass(), "keys", term28155);
        setField(term28154, term28154.getClass(), "values", term28156);
        setField(term28154, term28154.getClass(), "states", term28157);
        setDoubleField(term28154, term28154.getClass(), "missingEntries", 0.0);
        setIntField(term28154, term28154.getClass(), "size", 0);
        setIntField(term28154, term28154.getClass(), "mask", 31);
        setIntField(term28154, term28154.getClass(), "count", 0);
        setField(term28153, term28153.getClass(), "entries", term28154);
        setIntField(term28153, term28153.getClass(), "virtualSize", 1622346318);
        setDoubleField(term28153, term28153.getClass(), "epsilon", 1.0E-12);
        term28158 = (double[]) newDoubleArray(1);
        setDoubleElement(term28158, 0, 0.9527281779865117);
        term27529 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term27530 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term27531 = (int[]) newIntArray(32);
        double[] term27564 = (double[]) newDoubleArray(32);
        byte[] term27597 = (byte[]) newByteArray(32);
        setIntElement(term27531, 12, 1622346318);
        setField(term27530, term27530.getClass(), "keys", term27531);
        setDoubleElement(term27564, 12, 0.9527281779865117);
        setField(term27530, term27530.getClass(), "values", term27564);
        setByteElement(term27597, 12, (byte) 1);
        setField(term27530, term27530.getClass(), "states", term27597);
        setDoubleField(term27530, term27530.getClass(), "missingEntries", 0.0);
        setIntField(term27530, term27530.getClass(), "size", 1);
        setIntField(term27530, term27530.getClass(), "mask", 31);
        setIntField(term27530, term27530.getClass(), "count", 1);
        setField(term27529, term27529.getClass(), "entries", term27530);
        setIntField(term27529, term27529.getClass(), "virtualSize", 1622346319);
        setDoubleField(term27529, term27529.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2403;
        Object retValue = callMethod(klass, "append", argTypes, term2296, args);
        assertTrue(recursiveEquals(term2296, term28153));
        assertTrue(recursiveEquals(term2403, term28158));
        assertTrue(recursiveEquals(retValue, term27529));
    }

};


