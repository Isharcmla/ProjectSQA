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

public class OpenMapRealVector_append_86404634681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2296;
     Object term2403;
     Object term28682;
     Object term28687;
     Object term28063;

    public OpenMapRealVector_append_86404634681() {
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
        term28682 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term28683 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term28684 = (int[]) newIntArray(32);
        double[] term28685 = (double[]) newDoubleArray(32);
        byte[] term28686 = (byte[]) newByteArray(32);
        setField(term28683, term28683.getClass(), "keys", term28684);
        setField(term28683, term28683.getClass(), "values", term28685);
        setField(term28683, term28683.getClass(), "states", term28686);
        setDoubleField(term28683, term28683.getClass(), "missingEntries", 0.0);
        setIntField(term28683, term28683.getClass(), "size", 0);
        setIntField(term28683, term28683.getClass(), "mask", 31);
        setIntField(term28683, term28683.getClass(), "count", 0);
        setField(term28682, term28682.getClass(), "entries", term28683);
        setIntField(term28682, term28682.getClass(), "virtualSize", 1622346318);
        setDoubleField(term28682, term28682.getClass(), "epsilon", 1.0E-12);
        term28687 = (double[]) newDoubleArray(1);
        setDoubleElement(term28687, 0, 0.9527281779865117);
        term28063 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term28064 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term28065 = (int[]) newIntArray(32);
        double[] term28098 = (double[]) newDoubleArray(32);
        byte[] term28131 = (byte[]) newByteArray(32);
        setIntElement(term28065, 12, 1622346318);
        setField(term28064, term28064.getClass(), "keys", term28065);
        setDoubleElement(term28098, 12, 0.9527281779865117);
        setField(term28064, term28064.getClass(), "values", term28098);
        setByteElement(term28131, 12, (byte) 1);
        setField(term28064, term28064.getClass(), "states", term28131);
        setDoubleField(term28064, term28064.getClass(), "missingEntries", 0.0);
        setIntField(term28064, term28064.getClass(), "size", 1);
        setIntField(term28064, term28064.getClass(), "mask", 31);
        setIntField(term28064, term28064.getClass(), "count", 1);
        setField(term28063, term28063.getClass(), "entries", term28064);
        setIntField(term28063, term28063.getClass(), "virtualSize", 1622346319);
        setDoubleField(term28063, term28063.getClass(), "epsilon", 1.0E-12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2403;
        Object retValue = callMethod(klass, "append", argTypes, term2296, args);
        assertTrue(recursiveEquals(term2296, term28682));
        assertTrue(recursiveEquals(term2403, term28687));
        assertTrue(recursiveEquals(retValue, term28063));
    }

};


