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
     Object term107;
     Object term123;
     Object term124;

    public Flat3Map_put_194474072530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term112 = newInstance(Class.forName("java.lang.Object"));
        Object term113 = newInstance(Class.forName("java.lang.Object"));
        Object term114 = newInstance(Class.forName("java.lang.Object"));
        Object term115 = newInstance(Class.forName("java.lang.Object"));
        Object term116 = newInstance(Class.forName("java.lang.Object"));
        Object term117 = newInstance(Class.forName("java.lang.Object"));
        Object term118 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term107, term107.getClass(), "size", 729658803);
        setIntField(term107, term107.getClass(), "hash1", 114754804);
        setIntField(term107, term107.getClass(), "hash2", 1687361082);
        setIntField(term107, term107.getClass(), "hash3", 584893196);
        setField(term107, term107.getClass(), "key1", term112);
        setField(term107, term107.getClass(), "key2", term113);
        setField(term107, term107.getClass(), "key3", term114);
        setField(term107, term107.getClass(), "value1", term115);
        setField(term107, term107.getClass(), "value2", term116);
        setField(term107, term107.getClass(), "value3", term117);
        setFloatField(term118, term118.getClass(), "loadFactor", 0.0F);
        setIntField(term118, term118.getClass(), "size", 0);
        setField(term118, term118.getClass(), "data", null);
        setIntField(term118, term118.getClass(), "threshold", 0);
        setIntField(term118, term118.getClass(), "modCount", 0);
        setField(term118, term118.getClass(), "entrySet", null);
        setField(term118, term118.getClass(), "keySet", null);
        setField(term118, term118.getClass(), "values", null);
        setField(term118, term118.getClass(), "keySet", null);
        setField(term118, term118.getClass(), "values", null);
        setField(term107, term107.getClass(), "delegateMap", term118);
        term123 = newInstance(Class.forName("java.lang.Object"));
        term124 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term123;
        args[1] = term124;
        try {
            callMethod(klass, "put", argTypes, term107, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


