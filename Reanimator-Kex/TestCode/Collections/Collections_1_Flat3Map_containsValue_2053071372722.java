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
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.map.EqualityUtils.*;
import java.lang.Object;

public class Flat3Map_containsValue_2053071372722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143924;
     Object term144126;
     Object term144851;
     Object term144853;

    public Flat3Map_containsValue_2053071372722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143924 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144034 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term143924, term143924.getClass(), "delegateMap", null);
        setIntField(term143924, term143924.getClass(), "size", 2);
        setIntField(term144034, term144034.getClass(), "size", -1);
        setField(term143924, term143924.getClass(), "value2", term144034);
        term144126 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144236 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term144236, term144236.getClass(), "size", 0);
        setField(term144126, term144126.getClass(), "delegateMap", term144236);
        term144851 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144852 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term144851, term144851.getClass(), "size", 2);
        setIntField(term144851, term144851.getClass(), "hash1", 0);
        setIntField(term144851, term144851.getClass(), "hash2", 0);
        setIntField(term144851, term144851.getClass(), "hash3", 0);
        setField(term144851, term144851.getClass(), "key1", null);
        setField(term144851, term144851.getClass(), "key2", null);
        setField(term144851, term144851.getClass(), "key3", null);
        setField(term144851, term144851.getClass(), "value1", null);
        setFloatField(term144852, term144852.getClass(), "loadFactor", 0.0F);
        setIntField(term144852, term144852.getClass(), "size", -1);
        setField(term144852, term144852.getClass(), "data", null);
        setIntField(term144852, term144852.getClass(), "threshold", 0);
        setIntField(term144852, term144852.getClass(), "modCount", 0);
        setField(term144852, term144852.getClass(), "entrySet", null);
        setField(term144852, term144852.getClass(), "keySet", null);
        setField(term144852, term144852.getClass(), "values", null);
        setField(term144852, term144852.getClass(), "keySet", null);
        setField(term144852, term144852.getClass(), "values", null);
        setField(term144851, term144851.getClass(), "value2", term144852);
        setField(term144851, term144851.getClass(), "value3", null);
        setField(term144851, term144851.getClass(), "delegateMap", null);
        term144853 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term144854 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term144853, term144853.getClass(), "size", 0);
        setIntField(term144853, term144853.getClass(), "hash1", 0);
        setIntField(term144853, term144853.getClass(), "hash2", 0);
        setIntField(term144853, term144853.getClass(), "hash3", 0);
        setField(term144853, term144853.getClass(), "key1", null);
        setField(term144853, term144853.getClass(), "key2", null);
        setField(term144853, term144853.getClass(), "key3", null);
        setField(term144853, term144853.getClass(), "value1", null);
        setField(term144853, term144853.getClass(), "value2", null);
        setField(term144853, term144853.getClass(), "value3", null);
        setFloatField(term144854, term144854.getClass(), "loadFactor", 0.0F);
        setIntField(term144854, term144854.getClass(), "size", 0);
        setField(term144854, term144854.getClass(), "data", null);
        setIntField(term144854, term144854.getClass(), "threshold", 0);
        setIntField(term144854, term144854.getClass(), "modCount", 0);
        setField(term144854, term144854.getClass(), "entrySet", null);
        setField(term144854, term144854.getClass(), "keySet", null);
        setField(term144854, term144854.getClass(), "values", null);
        setField(term144854, term144854.getClass(), "keySet", null);
        setField(term144854, term144854.getClass(), "values", null);
        setField(term144853, term144853.getClass(), "delegateMap", term144854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term144126;
        callMethod(klass, "containsValue", argTypes, term143924, args);
        assertTrue(recursiveEquals(term143924, term144851));
        assertTrue(recursiveEquals(term144126, term144853));
    }

};
