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
     Object term198;

    public Flat3Map_clear_161778567635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term203 = newInstance(Class.forName("java.lang.Object"));
        Object term204 = newInstance(Class.forName("java.lang.Object"));
        Object term205 = newInstance(Class.forName("java.lang.Object"));
        Object term206 = newInstance(Class.forName("java.lang.Object"));
        Object term207 = newInstance(Class.forName("java.lang.Object"));
        Object term208 = newInstance(Class.forName("java.lang.Object"));
        Object term209 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term198, term198.getClass(), "size", 32185364);
        setIntField(term198, term198.getClass(), "hash1", 1768204942);
        setIntField(term198, term198.getClass(), "hash2", 1252951645);
        setIntField(term198, term198.getClass(), "hash3", 574481092);
        setField(term198, term198.getClass(), "key1", term203);
        setField(term198, term198.getClass(), "key2", term204);
        setField(term198, term198.getClass(), "key3", term205);
        setField(term198, term198.getClass(), "value1", term206);
        setField(term198, term198.getClass(), "value2", term207);
        setField(term198, term198.getClass(), "value3", term208);
        setFloatField(term209, term209.getClass(), "loadFactor", 0.0F);
        setIntField(term209, term209.getClass(), "size", 0);
        setField(term209, term209.getClass(), "data", null);
        setIntField(term209, term209.getClass(), "threshold", 0);
        setIntField(term209, term209.getClass(), "modCount", 0);
        setField(term209, term209.getClass(), "entrySet", null);
        setField(term209, term209.getClass(), "keySet", null);
        setField(term209, term209.getClass(), "values", null);
        setField(term209, term209.getClass(), "keySet", null);
        setField(term209, term209.getClass(), "values", null);
        setField(term198, term198.getClass(), "delegateMap", term209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term198, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
