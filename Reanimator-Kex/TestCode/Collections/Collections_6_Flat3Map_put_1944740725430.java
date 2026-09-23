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
import java.util.HashMap;

public class Flat3Map_put_1944740725430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76864;
     Object term77144;
     Object term77897;
     Object term77905;

    public Flat3Map_put_1944740725430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term77004 = new HashMap();
        HashMap term77052 = new HashMap();
        term76864 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76956 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term76864, term76864.getClass(), "delegateMap", null);
        setIntField(term76864, term76864.getClass(), "size", 3);
        setIntField(term76864, term76864.getClass(), "hash3", 0);
        setField(term76956, term76956.getClass(), "delegateMap", null);
        setIntField(term76956, term76956.getClass(), "size", 3);
        setField(term76956, term76956.getClass(), "key3", term77004);
        setField(term76956, term76956.getClass(), "key2", null);
        setField(term76956, term76956.getClass(), "value2", term77052);
        setField(term76864, term76864.getClass(), "key3", term76956);
        term77144 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term77144, term77144.getClass(), "delegateMap", null);
        setIntField(term77144, term77144.getClass(), "size", 3);
        setIntField(term77144, term77144.getClass(), "hash3", 0);
        setField(term77144, term77144.getClass(), "value3", null);
        setIntField(term77144, term77144.getClass(), "hash2", 0);
        setField(term77144, term77144.getClass(), "value2", null);
        setIntField(term77144, term77144.getClass(), "hash1", 0);
        setField(term77144, term77144.getClass(), "value1", null);
        setField(term77144, term77144.getClass(), "key3", null);
        term77897 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term77898 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term77899 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term77900 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term77901 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term77902 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term77903 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term77904 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term77897, term77897.getClass(), "size", 0);
        setIntField(term77897, term77897.getClass(), "hash1", 0);
        setIntField(term77897, term77897.getClass(), "hash2", 0);
        setIntField(term77897, term77897.getClass(), "hash3", 0);
        setField(term77897, term77897.getClass(), "key1", null);
        setField(term77897, term77897.getClass(), "key2", null);
        setField(term77897, term77897.getClass(), "key3", null);
        setField(term77897, term77897.getClass(), "value1", null);
        setField(term77897, term77897.getClass(), "value2", null);
        setField(term77897, term77897.getClass(), "value3", null);
        setFloatField(term77898, term77898.getClass(), "loadFactor", 0.75F);
        setIntField(term77898, term77898.getClass(), "size", 3);
        setField(term77901, term77901.getClass(), "next", null);
        setField(term77901, term77901.getClass(), "key", null);
        setField(term77901, term77901.getClass(), "value", null);
        setField(term77900, term77900.getClass(), "next", term77901);
        setIntField(term77902, term77902.getClass(), "size", 3);
        setIntField(term77902, term77902.getClass(), "hash1", 0);
        setIntField(term77902, term77902.getClass(), "hash2", 0);
        setIntField(term77902, term77902.getClass(), "hash3", 0);
        setField(term77902, term77902.getClass(), "key1", null);
        setField(term77902, term77902.getClass(), "key2", null);
        setField(term77902, term77902.getClass(), "key3", null);
        setField(term77902, term77902.getClass(), "value1", null);
        setField(term77902, term77902.getClass(), "value2", null);
        setField(term77902, term77902.getClass(), "value3", null);
        setField(term77902, term77902.getClass(), "delegateMap", null);
        setField(term77900, term77900.getClass(), "key", term77902);
        setField(term77900, term77900.getClass(), "value", null);
        setElement(term77899, 0, term77900);
        setField(term77903, term77903.getClass(), "next", null);
        setField(term77903, term77903.getClass(), "key", term77904);
        setField(term77903, term77903.getClass(), "value", null);
        setElement(term77899, 5, term77903);
        setField(term77898, term77898.getClass(), "data", term77899);
        setIntField(term77898, term77898.getClass(), "threshold", 12);
        setIntField(term77898, term77898.getClass(), "modCount", 3);
        setField(term77898, term77898.getClass(), "entrySet", null);
        setField(term77898, term77898.getClass(), "keySet", null);
        setField(term77898, term77898.getClass(), "values", null);
        setField(term77898, term77898.getClass(), "keySet", null);
        setField(term77898, term77898.getClass(), "values", null);
        setField(term77897, term77897.getClass(), "delegateMap", term77898);
        term77905 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term77905, term77905.getClass(), "size", 3);
        setIntField(term77905, term77905.getClass(), "hash1", 0);
        setIntField(term77905, term77905.getClass(), "hash2", 0);
        setIntField(term77905, term77905.getClass(), "hash3", 0);
        setField(term77905, term77905.getClass(), "key1", null);
        setField(term77905, term77905.getClass(), "key2", null);
        setField(term77905, term77905.getClass(), "key3", null);
        setField(term77905, term77905.getClass(), "value1", null);
        setField(term77905, term77905.getClass(), "value2", null);
        setField(term77905, term77905.getClass(), "value3", null);
        setField(term77905, term77905.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term77144;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term76864, args);
        assertTrue(recursiveEquals(term76864, term77897));
        assertTrue(recursiveEquals(term77144, term77905));
        assertTrue(recursiveEquals(retValue, null));
    }

};


