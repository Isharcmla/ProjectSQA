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

public class Flat3Map_put_1944740725822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210212;
     Object term210844;
     Object term215782;

    public Flat3Map_put_1944740725822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210212 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term210304 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term210398 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term210528 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term210620 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term210714 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term210752 = newInstance(Class.forName("java.lang.Object"));
        setField(term210212, term210212.getClass(), "delegateMap", null);
        setIntField(term210212, term210212.getClass(), "size", 3);
        setIntField(term210212, term210212.getClass(), "hash3", -1606303743);
        setField(term210304, term210304.getClass(), "delegateMap", null);
        setIntField(term210304, term210304.getClass(), "size", 3);
        setIntField(term210398, term210398.getClass(), "size", 0);
        setField(term210304, term210304.getClass(), "key3", term210398);
        setField(term210304, term210304.getClass(), "key2", null);
        setField(term210304, term210304.getClass(), "value2", null);
        setIntField(term210304, term210304.getClass(), "hash3", 539232273);
        setIntField(term210304, term210304.getClass(), "hash2", 1807777824);
        setIntField(term210304, term210304.getClass(), "hash1", 873218304);
        setField(term210304, term210304.getClass(), "key1", term210528);
        setField(term210304, term210304.getClass(), "value3", null);
        setField(term210304, term210304.getClass(), "value1", null);
        setField(term210212, term210212.getClass(), "key3", term210304);
        setIntField(term210212, term210212.getClass(), "hash2", -1606303743);
        setField(term210212, term210212.getClass(), "key2", null);
        setIntField(term210212, term210212.getClass(), "hash1", -1606303743);
        setField(term210212, term210212.getClass(), "key1", null);
        setField(term210212, term210212.getClass(), "value3", term210620);
        setField(term210212, term210212.getClass(), "value2", term210714);
        setField(term210212, term210212.getClass(), "value1", term210752);
        term210844 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term210936 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term210844, term210844.getClass(), "delegateMap", null);
        setIntField(term210844, term210844.getClass(), "size", 3);
        setIntField(term210844, term210844.getClass(), "hash3", 2052063233);
        setField(term210844, term210844.getClass(), "value3", null);
        setIntField(term210844, term210844.getClass(), "hash2", -1265827840);
        setField(term210844, term210844.getClass(), "value2", null);
        setIntField(term210844, term210844.getClass(), "hash1", 1902428160);
        setField(term210844, term210844.getClass(), "value1", null);
        setField(term210844, term210844.getClass(), "key3", null);
        setField(term210936, term210936.getClass(), "delegateMap", null);
        setIntField(term210936, term210936.getClass(), "size", 2);
        setIntField(term210936, term210936.getClass(), "hash2", 1677754373);
        setField(term210936, term210936.getClass(), "value2", null);
        setIntField(term210936, term210936.getClass(), "hash1", 570523656);
        setField(term210936, term210936.getClass(), "value1", null);
        setField(term210844, term210844.getClass(), "key2", term210936);
        term215782 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term210844;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term210212, args);
        assertTrue(recursiveEquals(term210844, term215782));
        assertTrue(recursiveEquals(retValue, null));
    }

};


