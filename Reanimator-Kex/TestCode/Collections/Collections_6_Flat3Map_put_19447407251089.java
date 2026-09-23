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

public class Flat3Map_put_19447407251089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318943;
     Object term319241;
     Object term320891;
     Object term320899;

    public Flat3Map_put_19447407251089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318943 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term319035 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term319149 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        setField(term318943, term318943.getClass(), "delegateMap", null);
        setIntField(term318943, term318943.getClass(), "size", 3);
        setIntField(term318943, term318943.getClass(), "hash3", 0);
        setField(term318943, term318943.getClass(), "key3", null);
        setIntField(term318943, term318943.getClass(), "hash2", 0);
        setField(term318943, term318943.getClass(), "key2", null);
        setIntField(term318943, term318943.getClass(), "hash1", 0);
        setField(term319035, term319035.getClass(), "delegateMap", null);
        setIntField(term319035, term319035.getClass(), "size", 3);
        setField(term319035, term319035.getClass(), "key3", term319149);
        setField(term319035, term319035.getClass(), "key2", null);
        setField(term319035, term319035.getClass(), "value2", null);
        setField(term318943, term318943.getClass(), "key1", term319035);
        term319241 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term319351 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term319391 = newInstance(Class.forName("java.util.CollSer"));
        setField(term319241, term319241.getClass(), "delegateMap", null);
        setIntField(term319241, term319241.getClass(), "size", 3);
        setIntField(term319241, term319241.getClass(), "hash3", 0);
        setField(term319241, term319241.getClass(), "value3", null);
        setIntField(term319241, term319241.getClass(), "hash2", 0);
        setIntField(term319351, term319351.getClass(), "size", 0);
        setField(term319241, term319241.getClass(), "value2", term319351);
        setIntField(term319241, term319241.getClass(), "hash1", 0);
        setField(term319241, term319241.getClass(), "value1", null);
        setField(term319241, term319241.getClass(), "key3", null);
        setField(term319241, term319241.getClass(), "key2", term319391);
        term320891 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term320892 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term320893 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term320894 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term320895 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term320896 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term320897 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term320898 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term320891, term320891.getClass(), "size", 0);
        setIntField(term320891, term320891.getClass(), "hash1", 0);
        setIntField(term320891, term320891.getClass(), "hash2", 0);
        setIntField(term320891, term320891.getClass(), "hash3", 0);
        setField(term320891, term320891.getClass(), "key1", null);
        setField(term320891, term320891.getClass(), "key2", null);
        setField(term320891, term320891.getClass(), "key3", null);
        setField(term320891, term320891.getClass(), "value1", null);
        setField(term320891, term320891.getClass(), "value2", null);
        setField(term320891, term320891.getClass(), "value3", null);
        setFloatField(term320892, term320892.getClass(), "loadFactor", 0.75F);
        setIntField(term320892, term320892.getClass(), "size", 3);
        setField(term320895, term320895.getClass(), "next", null);
        setField(term320895, term320895.getClass(), "key", null);
        setField(term320895, term320895.getClass(), "value", null);
        setField(term320894, term320894.getClass(), "next", term320895);
        setIntField(term320896, term320896.getClass(), "size", 3);
        setIntField(term320896, term320896.getClass(), "hash1", 0);
        setIntField(term320896, term320896.getClass(), "hash2", 0);
        setIntField(term320896, term320896.getClass(), "hash3", 0);
        setField(term320896, term320896.getClass(), "key1", null);
        setField(term320896, term320896.getClass(), "key2", null);
        setField(term320896, term320896.getClass(), "key3", null);
        setField(term320896, term320896.getClass(), "value1", null);
        setField(term320896, term320896.getClass(), "value2", null);
        setField(term320896, term320896.getClass(), "value3", null);
        setField(term320896, term320896.getClass(), "delegateMap", null);
        setField(term320894, term320894.getClass(), "key", term320896);
        setField(term320894, term320894.getClass(), "value", null);
        setElement(term320893, 0, term320894);
        setField(term320897, term320897.getClass(), "next", null);
        setField(term320897, term320897.getClass(), "key", term320898);
        setField(term320897, term320897.getClass(), "value", null);
        setElement(term320893, 6, term320897);
        setField(term320892, term320892.getClass(), "data", term320893);
        setIntField(term320892, term320892.getClass(), "threshold", 12);
        setIntField(term320892, term320892.getClass(), "modCount", 3);
        setField(term320892, term320892.getClass(), "entrySet", null);
        setField(term320892, term320892.getClass(), "keySet", null);
        setField(term320892, term320892.getClass(), "values", null);
        setField(term320892, term320892.getClass(), "keySet", null);
        setField(term320892, term320892.getClass(), "values", null);
        setField(term320891, term320891.getClass(), "delegateMap", term320892);
        term320899 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term320899, term320899.getClass(), "size", 3);
        setIntField(term320899, term320899.getClass(), "hash1", 0);
        setIntField(term320899, term320899.getClass(), "hash2", 0);
        setIntField(term320899, term320899.getClass(), "hash3", 0);
        setField(term320899, term320899.getClass(), "key1", null);
        setField(term320899, term320899.getClass(), "key2", null);
        setField(term320899, term320899.getClass(), "key3", null);
        setField(term320899, term320899.getClass(), "value1", null);
        setField(term320899, term320899.getClass(), "value2", null);
        setField(term320899, term320899.getClass(), "value3", null);
        setField(term320899, term320899.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term319241;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term318943, args);
        assertTrue(recursiveEquals(term318943, term320891));
        assertTrue(recursiveEquals(term319241, term320899));
        assertTrue(recursiveEquals(retValue, null));
    }

};


