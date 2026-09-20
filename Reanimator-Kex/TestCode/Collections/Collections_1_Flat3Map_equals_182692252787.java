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

public class Flat3Map_equals_182692252787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16945;
     Object term17133;
     Object term17338;
     Object term17340;

    public Flat3Map_equals_182692252787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16945 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term17039 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setField(term16945, term16945.getClass(), "delegateMap", term17039);
        term17133 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        term17338 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term17339 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setIntField(term17338, term17338.getClass(), "size", 0);
        setIntField(term17338, term17338.getClass(), "hash1", 0);
        setIntField(term17338, term17338.getClass(), "hash2", 0);
        setIntField(term17338, term17338.getClass(), "hash3", 0);
        setField(term17338, term17338.getClass(), "key1", null);
        setField(term17338, term17338.getClass(), "key2", null);
        setField(term17338, term17338.getClass(), "key3", null);
        setField(term17338, term17338.getClass(), "value1", null);
        setField(term17338, term17338.getClass(), "value2", null);
        setField(term17338, term17338.getClass(), "value3", null);
        setFloatField(term17339, term17339.getClass(), "loadFactor", 0.0F);
        setIntField(term17339, term17339.getClass(), "size", 0);
        setField(term17339, term17339.getClass(), "data", null);
        setIntField(term17339, term17339.getClass(), "threshold", 0);
        setIntField(term17339, term17339.getClass(), "modCount", 0);
        setField(term17339, term17339.getClass(), "entrySet", null);
        setField(term17339, term17339.getClass(), "keySet", null);
        setField(term17339, term17339.getClass(), "values", null);
        setField(term17339, term17339.getClass(), "keySet", null);
        setField(term17339, term17339.getClass(), "values", null);
        setField(term17338, term17338.getClass(), "delegateMap", term17339);
        term17340 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        setFloatField(term17340, term17340.getClass(), "loadFactor", 0.0F);
        setIntField(term17340, term17340.getClass(), "size", 0);
        setField(term17340, term17340.getClass(), "data", null);
        setIntField(term17340, term17340.getClass(), "threshold", 0);
        setIntField(term17340, term17340.getClass(), "modCount", 0);
        setField(term17340, term17340.getClass(), "entrySet", null);
        setField(term17340, term17340.getClass(), "keySet", null);
        setField(term17340, term17340.getClass(), "values", null);
        setField(term17340, term17340.getClass(), "keySet", null);
        setField(term17340, term17340.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17133;
        Object retValue = callMethod(klass, "equals", argTypes, term16945, args);
        assertTrue(recursiveEquals(term16945, term17338));
        assertTrue(recursiveEquals(term17133, term17340));
        assertTrue(recursiveEquals(retValue, true));
    }

};
