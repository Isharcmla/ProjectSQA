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
import java.lang.Object;

public class OpenMapRealVector_append_517582264132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132383;
     Object term132593;

    public OpenMapRealVector_append_517582264132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132383 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term132491 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term128115 = (int[]) newIntArray(504);
        setIntField(term132383, term132383.getClass(), "virtualSize", 0);
        setField(term132491, term132491.getClass(), "keys", term128115);
        setField(term132491, term132491.getClass(), "values", null);
        setField(term132491, term132491.getClass(), "states", null);
        setDoubleField(term132491, term132491.getClass(), "missingEntries", 0.0);
        setIntField(term132491, term132491.getClass(), "size", 0);
        setIntField(term132491, term132491.getClass(), "mask", 0);
        setIntField(term132491, term132491.getClass(), "count", 0);
        setField(term132383, term132383.getClass(), "entries", term132491);
        setDoubleField(term132383, term132383.getClass(), "epsilon", 0.0);
        term132593 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term132701 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term132163 = (byte[]) newByteArray(5);
        setIntField(term132593, term132593.getClass(), "virtualSize", 0);
        setIntField(term132701, term132701.getClass(), "count", 0);
        setByteElement(term132163, 0, (byte) -128);
        setByteElement(term132163, 1, (byte) -128);
        setByteElement(term132163, 2, (byte) -128);
        setByteElement(term132163, 3, (byte) -128);
        setByteElement(term132163, 4, (byte) -128);
        setField(term132701, term132701.getClass(), "states", term132163);
        setField(term132593, term132593.getClass(), "entries", term132701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term132593;
        callMethod(klass, "append", argTypes, term132383, args);
    }

};


