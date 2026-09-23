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

public class Flat3Map_put_1944740725566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114245;
     Object term114931;
     Object term114937;

    public Flat3Map_put_1944740725566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114245 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114278 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        setField(term114245, term114245.getClass(), "delegateMap", null);
        setIntField(term114245, term114245.getClass(), "size", 3);
        setIntField(term114245, term114245.getClass(), "hash3", 0);
        setField(term114245, term114245.getClass(), "value3", null);
        setIntField(term114245, term114245.getClass(), "hash2", 0);
        setField(term114245, term114245.getClass(), "value2", term114278);
        setIntField(term114245, term114245.getClass(), "hash1", 0);
        setField(term114245, term114245.getClass(), "value1", null);
        term114931 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114932 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term114933 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term114934 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term114935 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term114936 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term114931, term114931.getClass(), "size", 0);
        setIntField(term114931, term114931.getClass(), "hash1", 0);
        setIntField(term114931, term114931.getClass(), "hash2", 0);
        setIntField(term114931, term114931.getClass(), "hash3", 0);
        setField(term114931, term114931.getClass(), "key1", null);
        setField(term114931, term114931.getClass(), "key2", null);
        setField(term114931, term114931.getClass(), "key3", null);
        setField(term114931, term114931.getClass(), "value1", null);
        setField(term114931, term114931.getClass(), "value2", null);
        setField(term114931, term114931.getClass(), "value3", null);
        setFloatField(term114932, term114932.getClass(), "loadFactor", 0.75F);
        setIntField(term114932, term114932.getClass(), "size", 2);
        setField(term114934, term114934.getClass(), "next", null);
        setField(term114934, term114934.getClass(), "key", term114931);
        setField(term114934, term114934.getClass(), "value", null);
        setElement(term114933, 0, term114934);
        setField(term114935, term114935.getClass(), "next", null);
        setField(term114935, term114935.getClass(), "key", term114936);
        setField(term114935, term114935.getClass(), "value", null);
        setElement(term114933, 5, term114935);
        setField(term114932, term114932.getClass(), "data", term114933);
        setIntField(term114932, term114932.getClass(), "threshold", 12);
        setIntField(term114932, term114932.getClass(), "modCount", 2);
        setField(term114932, term114932.getClass(), "entrySet", null);
        setField(term114932, term114932.getClass(), "keySet", null);
        setField(term114932, term114932.getClass(), "values", null);
        setField(term114932, term114932.getClass(), "keySet", null);
        setField(term114932, term114932.getClass(), "values", null);
        setField(term114931, term114931.getClass(), "delegateMap", term114932);
        term114937 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term114938 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term114939 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term114940 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term114941 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term114942 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term114937, term114937.getClass(), "size", 0);
        setIntField(term114937, term114937.getClass(), "hash1", 0);
        setIntField(term114937, term114937.getClass(), "hash2", 0);
        setIntField(term114937, term114937.getClass(), "hash3", 0);
        setField(term114937, term114937.getClass(), "key1", null);
        setField(term114937, term114937.getClass(), "key2", null);
        setField(term114937, term114937.getClass(), "key3", null);
        setField(term114937, term114937.getClass(), "value1", null);
        setField(term114937, term114937.getClass(), "value2", null);
        setField(term114937, term114937.getClass(), "value3", null);
        setFloatField(term114938, term114938.getClass(), "loadFactor", 0.75F);
        setIntField(term114938, term114938.getClass(), "size", 2);
        setField(term114940, term114940.getClass(), "next", null);
        setField(term114940, term114940.getClass(), "key", term114937);
        setField(term114940, term114940.getClass(), "value", null);
        setElement(term114939, 0, term114940);
        setField(term114941, term114941.getClass(), "next", null);
        setField(term114941, term114941.getClass(), "key", term114942);
        setField(term114941, term114941.getClass(), "value", null);
        setElement(term114939, 5, term114941);
        setField(term114938, term114938.getClass(), "data", term114939);
        setIntField(term114938, term114938.getClass(), "threshold", 12);
        setIntField(term114938, term114938.getClass(), "modCount", 2);
        setField(term114938, term114938.getClass(), "entrySet", null);
        setField(term114938, term114938.getClass(), "keySet", null);
        setField(term114938, term114938.getClass(), "values", null);
        setField(term114938, term114938.getClass(), "keySet", null);
        setField(term114938, term114938.getClass(), "values", null);
        setField(term114937, term114937.getClass(), "delegateMap", term114938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term114245;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term114245, args);
        assertTrue(recursiveEquals(term114245, term114931));
        assertTrue(recursiveEquals(term114245, term114937));
        assertTrue(recursiveEquals(retValue, null));
    }

};


