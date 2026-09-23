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

public class Flat3Map_put_1944740725583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120201;
     Object term120477;
     Object term120888;
     Object term120896;

    public Flat3Map_put_1944740725583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120201 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120293 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120385 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term120201, term120201.getClass(), "delegateMap", null);
        setIntField(term120201, term120201.getClass(), "size", 3);
        setIntField(term120201, term120201.getClass(), "hash3", 0);
        setField(term120293, term120293.getClass(), "delegateMap", null);
        setIntField(term120293, term120293.getClass(), "size", 3);
        setField(term120293, term120293.getClass(), "key3", term120385);
        setField(term120293, term120293.getClass(), "key2", null);
        setField(term120293, term120293.getClass(), "value2", null);
        setField(term120201, term120201.getClass(), "key3", term120293);
        term120477 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120517 = newInstance(Class.forName("java.io.Console$1"));
        setField(term120477, term120477.getClass(), "delegateMap", null);
        setIntField(term120477, term120477.getClass(), "size", 3);
        setIntField(term120477, term120477.getClass(), "hash3", 0);
        setField(term120477, term120477.getClass(), "value3", null);
        setIntField(term120477, term120477.getClass(), "hash2", 0);
        setField(term120477, term120477.getClass(), "value2", null);
        setIntField(term120477, term120477.getClass(), "hash1", 0);
        setField(term120477, term120477.getClass(), "value1", null);
        setField(term120477, term120477.getClass(), "key3", null);
        setField(term120477, term120477.getClass(), "key2", term120517);
        term120888 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120889 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term120890 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term120891 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term120892 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term120893 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term120894 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term120895 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term120888, term120888.getClass(), "size", 0);
        setIntField(term120888, term120888.getClass(), "hash1", 0);
        setIntField(term120888, term120888.getClass(), "hash2", 0);
        setIntField(term120888, term120888.getClass(), "hash3", 0);
        setField(term120888, term120888.getClass(), "key1", null);
        setField(term120888, term120888.getClass(), "key2", null);
        setField(term120888, term120888.getClass(), "key3", null);
        setField(term120888, term120888.getClass(), "value1", null);
        setField(term120888, term120888.getClass(), "value2", null);
        setField(term120888, term120888.getClass(), "value3", null);
        setFloatField(term120889, term120889.getClass(), "loadFactor", 0.75F);
        setIntField(term120889, term120889.getClass(), "size", 3);
        setField(term120892, term120892.getClass(), "next", null);
        setField(term120892, term120892.getClass(), "key", null);
        setField(term120892, term120892.getClass(), "value", null);
        setField(term120891, term120891.getClass(), "next", term120892);
        setIntField(term120893, term120893.getClass(), "size", 3);
        setIntField(term120893, term120893.getClass(), "hash1", 0);
        setIntField(term120893, term120893.getClass(), "hash2", 0);
        setIntField(term120893, term120893.getClass(), "hash3", 0);
        setField(term120893, term120893.getClass(), "key1", null);
        setField(term120893, term120893.getClass(), "key2", null);
        setField(term120893, term120893.getClass(), "key3", null);
        setField(term120893, term120893.getClass(), "value1", null);
        setField(term120893, term120893.getClass(), "value2", null);
        setField(term120893, term120893.getClass(), "value3", null);
        setField(term120893, term120893.getClass(), "delegateMap", null);
        setField(term120891, term120891.getClass(), "key", term120893);
        setField(term120891, term120891.getClass(), "value", null);
        setElement(term120890, 0, term120891);
        setField(term120894, term120894.getClass(), "next", null);
        setField(term120894, term120894.getClass(), "key", term120895);
        setField(term120894, term120894.getClass(), "value", null);
        setElement(term120890, 5, term120894);
        setField(term120889, term120889.getClass(), "data", term120890);
        setIntField(term120889, term120889.getClass(), "threshold", 12);
        setIntField(term120889, term120889.getClass(), "modCount", 3);
        setField(term120889, term120889.getClass(), "entrySet", null);
        setField(term120889, term120889.getClass(), "keySet", null);
        setField(term120889, term120889.getClass(), "values", null);
        setField(term120889, term120889.getClass(), "keySet", null);
        setField(term120889, term120889.getClass(), "values", null);
        setField(term120888, term120888.getClass(), "delegateMap", term120889);
        term120896 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term120896, term120896.getClass(), "size", 3);
        setIntField(term120896, term120896.getClass(), "hash1", 0);
        setIntField(term120896, term120896.getClass(), "hash2", 0);
        setIntField(term120896, term120896.getClass(), "hash3", 0);
        setField(term120896, term120896.getClass(), "key1", null);
        setField(term120896, term120896.getClass(), "key2", null);
        setField(term120896, term120896.getClass(), "key3", null);
        setField(term120896, term120896.getClass(), "value1", null);
        setField(term120896, term120896.getClass(), "value2", null);
        setField(term120896, term120896.getClass(), "value3", null);
        setField(term120896, term120896.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term120477;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term120201, args);
        assertTrue(recursiveEquals(term120201, term120888));
        assertTrue(recursiveEquals(term120477, term120896));
        assertTrue(recursiveEquals(retValue, null));
    }

};


