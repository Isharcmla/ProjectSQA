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

public class Flat3Map_clear_161778567635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;

    public Flat3Map_clear_161778567635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term201 = newInstance(Class.forName("java.lang.Object"));
        Object term202 = newInstance(Class.forName("java.lang.Object"));
        Object term203 = newInstance(Class.forName("java.lang.Object"));
        Object term204 = newInstance(Class.forName("java.lang.Object"));
        Object term205 = newInstance(Class.forName("java.lang.Object"));
        Object term206 = newInstance(Class.forName("java.lang.Object"));
        Object term207 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term196, term196.getClass(), "size", 32185364);
        setIntField(term196, term196.getClass(), "hash1", 1768204942);
        setIntField(term196, term196.getClass(), "hash2", 1252951645);
        setIntField(term196, term196.getClass(), "hash3", 574481092);
        setField(term196, term196.getClass(), "key1", term201);
        setField(term196, term196.getClass(), "key2", term202);
        setField(term196, term196.getClass(), "key3", term203);
        setField(term196, term196.getClass(), "value1", term204);
        setField(term196, term196.getClass(), "value2", term205);
        setField(term196, term196.getClass(), "value3", term206);
        setFloatField(term207, term207.getClass(), "loadFactor", 0.0F);
        setIntField(term207, term207.getClass(), "size", 0);
        setField(term207, term207.getClass(), "data", null);
        setIntField(term207, term207.getClass(), "threshold", 0);
        setIntField(term207, term207.getClass(), "modCount", 0);
        setField(term207, term207.getClass(), "entrySet", null);
        setField(term207, term207.getClass(), "keySet", null);
        setField(term207, term207.getClass(), "values", null);
        setField(term207, term207.getClass(), "keySet", null);
        setField(term207, term207.getClass(), "values", null);
        setField(term196, term196.getClass(), "delegateMap", term207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term196, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


