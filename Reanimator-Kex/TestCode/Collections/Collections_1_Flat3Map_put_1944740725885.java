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

public class Flat3Map_put_1944740725885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178058;
     Object term178272;
     Object term178965;
     Object term178969;

    public Flat3Map_put_1944740725885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178058 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178096 = newInstance(Class.forName("java.lang.Object"));
        Object term178134 = newInstance(Class.forName("java.lang.Object"));
        term178272 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term178058, term178058.getClass(), "delegateMap", null);
        setIntField(term178058, term178058.getClass(), "size", 3);
        setIntField(term178058, term178058.getClass(), "hash3", 0);
        setField(term178058, term178058.getClass(), "key3", term178096);
        setIntField(term178058, term178058.getClass(), "hash2", 0);
        setField(term178058, term178058.getClass(), "key2", term178134);
        setIntField(term178058, term178058.getClass(), "hash1", 0);
        setField(term178272, term178272.getClass(), "delegateMap", null);
        setIntField(term178272, term178272.getClass(), "size", 3);
        setIntField(term178272, term178272.getClass(), "hash3", 0);
        setField(term178272, term178272.getClass(), "value3", null);
        setIntField(term178272, term178272.getClass(), "hash2", 0);
        setField(term178272, term178272.getClass(), "value2", null);
        setIntField(term178272, term178272.getClass(), "hash1", 0);
        setField(term178272, term178272.getClass(), "value1", null);
        setField(term178058, term178058.getClass(), "key1", term178272);
        term178965 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178966 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178967 = newInstance(Class.forName("java.lang.Object"));
        Object term178968 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term178965, term178965.getClass(), "size", 3);
        setIntField(term178965, term178965.getClass(), "hash1", 0);
        setIntField(term178965, term178965.getClass(), "hash2", 0);
        setIntField(term178965, term178965.getClass(), "hash3", 0);
        setIntField(term178966, term178966.getClass(), "size", 3);
        setIntField(term178966, term178966.getClass(), "hash1", 0);
        setIntField(term178966, term178966.getClass(), "hash2", 0);
        setIntField(term178966, term178966.getClass(), "hash3", 0);
        setField(term178966, term178966.getClass(), "key1", null);
        setField(term178966, term178966.getClass(), "key2", null);
        setField(term178966, term178966.getClass(), "key3", null);
        setField(term178966, term178966.getClass(), "value1", null);
        setField(term178966, term178966.getClass(), "value2", null);
        setField(term178966, term178966.getClass(), "value3", null);
        setField(term178966, term178966.getClass(), "delegateMap", null);
        setField(term178965, term178965.getClass(), "key1", term178966);
        setField(term178965, term178965.getClass(), "key2", term178967);
        setField(term178965, term178965.getClass(), "key3", term178968);
        setField(term178965, term178965.getClass(), "value1", null);
        setField(term178965, term178965.getClass(), "value2", null);
        setField(term178965, term178965.getClass(), "value3", null);
        setField(term178965, term178965.getClass(), "delegateMap", null);
        term178969 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term178969, term178969.getClass(), "size", 3);
        setIntField(term178969, term178969.getClass(), "hash1", 0);
        setIntField(term178969, term178969.getClass(), "hash2", 0);
        setIntField(term178969, term178969.getClass(), "hash3", 0);
        setField(term178969, term178969.getClass(), "key1", null);
        setField(term178969, term178969.getClass(), "key2", null);
        setField(term178969, term178969.getClass(), "key3", null);
        setField(term178969, term178969.getClass(), "value1", null);
        setField(term178969, term178969.getClass(), "value2", null);
        setField(term178969, term178969.getClass(), "value3", null);
        setField(term178969, term178969.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term178272;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term178058, args);
        assertTrue(recursiveEquals(term178058, term178965));
        assertTrue(recursiveEquals(term178272, term178969));
        assertTrue(recursiveEquals(retValue, null));
    }

};
