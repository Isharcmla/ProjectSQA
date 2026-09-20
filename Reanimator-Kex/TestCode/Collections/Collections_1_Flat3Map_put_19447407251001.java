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

public class Flat3Map_put_19447407251001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199560;
     Object term199944;
     Object term200933;
     Object term200939;

    public Flat3Map_put_19447407251001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199560 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term199652 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term199740 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        Object term200000 = newInstance(Class.forName("org.apache.commons.collections.map.CaseInsensitiveMap"));
        setField(term199560, term199560.getClass(), "delegateMap", null);
        setIntField(term199560, term199560.getClass(), "size", 3);
        setIntField(term199560, term199560.getClass(), "hash3", 0);
        setField(term199560, term199560.getClass(), "key3", null);
        setIntField(term199560, term199560.getClass(), "hash2", 0);
        setField(term199560, term199560.getClass(), "key2", null);
        setIntField(term199560, term199560.getClass(), "hash1", 0);
        setField(term199652, term199652.getClass(), "delegateMap", null);
        setIntField(term199652, term199652.getClass(), "size", 3);
        setField(term199652, term199652.getClass(), "key3", null);
        setField(term199652, term199652.getClass(), "value3", null);
        setField(term199560, term199560.getClass(), "key1", term199652);
        setField(term199560, term199560.getClass(), "value3", null);
        setField(term199560, term199560.getClass(), "value2", term199740);
        setIntField(term200000, term200000.getClass(), "size", 0);
        setField(term199560, term199560.getClass(), "value1", term200000);
        term199944 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term199944, term199944.getClass(), "delegateMap", null);
        setIntField(term199944, term199944.getClass(), "size", 3);
        setIntField(term199944, term199944.getClass(), "hash3", -9568256);
        setField(term199944, term199944.getClass(), "value3", null);
        setIntField(term199944, term199944.getClass(), "hash2", 3276800);
        setField(term199944, term199944.getClass(), "value2", term200000);
        setIntField(term199944, term199944.getClass(), "hash1", 6291456);
        setField(term199944, term199944.getClass(), "value1", null);
        setField(term199944, term199944.getClass(), "key3", null);
        setField(term199944, term199944.getClass(), "key2", null);
        term200933 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term200934 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term200935 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term200936 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term200937 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term200938 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term200933, term200933.getClass(), "size", 0);
        setIntField(term200933, term200933.getClass(), "hash1", 0);
        setIntField(term200933, term200933.getClass(), "hash2", 0);
        setIntField(term200933, term200933.getClass(), "hash3", 0);
        setField(term200933, term200933.getClass(), "key1", null);
        setField(term200933, term200933.getClass(), "key2", null);
        setField(term200933, term200933.getClass(), "key3", null);
        setField(term200933, term200933.getClass(), "value1", null);
        setField(term200933, term200933.getClass(), "value2", null);
        setField(term200933, term200933.getClass(), "value3", null);
        setFloatField(term200934, term200934.getClass(), "loadFactor", 0.75F);
        setIntField(term200934, term200934.getClass(), "size", 3);
        setField(term200937, term200937.getClass(), "next", null);
        setField(term200937, term200937.getClass(), "key", null);
        setField(term200937, term200937.getClass(), "value", null);
        setField(term200936, term200936.getClass(), "next", term200937);
        setIntField(term200938, term200938.getClass(), "size", 3);
        setIntField(term200938, term200938.getClass(), "hash1", 6291456);
        setIntField(term200938, term200938.getClass(), "hash2", 3276800);
        setIntField(term200938, term200938.getClass(), "hash3", -9568256);
        setField(term200938, term200938.getClass(), "key1", null);
        setField(term200938, term200938.getClass(), "key2", null);
        setField(term200938, term200938.getClass(), "key3", null);
        setField(term200938, term200938.getClass(), "value1", null);
        setField(term200938, term200938.getClass(), "value2", null);
        setField(term200938, term200938.getClass(), "value3", null);
        setField(term200938, term200938.getClass(), "delegateMap", null);
        setField(term200936, term200936.getClass(), "key", term200938);
        setField(term200936, term200936.getClass(), "value", null);
        setElement(term200935, 0, term200936);
        setField(term200934, term200934.getClass(), "data", term200935);
        setIntField(term200934, term200934.getClass(), "threshold", 12);
        setIntField(term200934, term200934.getClass(), "modCount", 3);
        setField(term200934, term200934.getClass(), "entrySet", null);
        setField(term200934, term200934.getClass(), "keySet", null);
        setField(term200934, term200934.getClass(), "values", null);
        setField(term200934, term200934.getClass(), "keySet", null);
        setField(term200934, term200934.getClass(), "values", null);
        setField(term200933, term200933.getClass(), "delegateMap", term200934);
        term200939 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term200939, term200939.getClass(), "size", 3);
        setIntField(term200939, term200939.getClass(), "hash1", 6291456);
        setIntField(term200939, term200939.getClass(), "hash2", 3276800);
        setIntField(term200939, term200939.getClass(), "hash3", -9568256);
        setField(term200939, term200939.getClass(), "key1", null);
        setField(term200939, term200939.getClass(), "key2", null);
        setField(term200939, term200939.getClass(), "key3", null);
        setField(term200939, term200939.getClass(), "value1", null);
        setField(term200939, term200939.getClass(), "value2", null);
        setField(term200939, term200939.getClass(), "value3", null);
        setField(term200939, term200939.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term199944;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term199560, args);
        assertTrue(recursiveEquals(term199560, term200933));
        assertTrue(recursiveEquals(term199944, term200939));
        assertTrue(recursiveEquals(retValue, null));
    }

};
