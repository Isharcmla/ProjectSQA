package org.apache.commons.collections.map;

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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_194474072530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;
     Object term125;
     Object term126;

    public Flat3Map_put_194474072530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114 = newInstance(Class.forName("java.lang.Object"));
        Object term115 = newInstance(Class.forName("java.lang.Object"));
        Object term116 = newInstance(Class.forName("java.lang.Object"));
        Object term117 = newInstance(Class.forName("java.lang.Object"));
        Object term118 = newInstance(Class.forName("java.lang.Object"));
        Object term119 = newInstance(Class.forName("java.lang.Object"));
        Object term120 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term109, term109.getClass(), "size", 729658803);
        setIntField(term109, term109.getClass(), "hash1", 114754804);
        setIntField(term109, term109.getClass(), "hash2", 1687361082);
        setIntField(term109, term109.getClass(), "hash3", 584893196);
        setField(term109, term109.getClass(), "key1", term114);
        setField(term109, term109.getClass(), "key2", term115);
        setField(term109, term109.getClass(), "key3", term116);
        setField(term109, term109.getClass(), "value1", term117);
        setField(term109, term109.getClass(), "value2", term118);
        setField(term109, term109.getClass(), "value3", term119);
        setFloatField(term120, term120.getClass(), "loadFactor", 0.0F);
        setIntField(term120, term120.getClass(), "size", 0);
        setField(term120, term120.getClass(), "data", null);
        setIntField(term120, term120.getClass(), "threshold", 0);
        setIntField(term120, term120.getClass(), "modCount", 0);
        setField(term120, term120.getClass(), "entrySet", null);
        setField(term120, term120.getClass(), "keySet", null);
        setField(term120, term120.getClass(), "values", null);
        setField(term120, term120.getClass(), "keySet", null);
        setField(term120, term120.getClass(), "values", null);
        setField(term109, term109.getClass(), "delegateMap", term120);
        term125 = newInstance(Class.forName("java.lang.Object"));
        term126 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term125;
        args[1] = term126;
        try {
            callMethod(klass, "put", argTypes, term109, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
