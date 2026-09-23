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

public class Flat3Map_put_19447407251116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333068;
     Object term334238;
     Object term334244;

    public Flat3Map_put_19447407251116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term333068 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term333123 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term333068, term333068.getClass(), "delegateMap", null);
        setIntField(term333068, term333068.getClass(), "size", 3);
        setIntField(term333068, term333068.getClass(), "hash3", 0);
        setField(term333068, term333068.getClass(), "value3", term333123);
        term334238 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term334239 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term334240 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term334241 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term334242 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term334243 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term334238, term334238.getClass(), "size", 0);
        setIntField(term334238, term334238.getClass(), "hash1", 0);
        setIntField(term334238, term334238.getClass(), "hash2", 0);
        setIntField(term334238, term334238.getClass(), "hash3", 0);
        setField(term334238, term334238.getClass(), "key1", null);
        setField(term334238, term334238.getClass(), "key2", null);
        setField(term334238, term334238.getClass(), "key3", null);
        setField(term334238, term334238.getClass(), "value1", null);
        setField(term334238, term334238.getClass(), "value2", null);
        setField(term334238, term334238.getClass(), "value3", null);
        setFloatField(term334239, term334239.getClass(), "loadFactor", 0.75F);
        setIntField(term334239, term334239.getClass(), "size", 2);
        setField(term334241, term334241.getClass(), "next", null);
        setField(term334241, term334241.getClass(), "key", term334238);
        setField(term334241, term334241.getClass(), "value", null);
        setElement(term334240, 0, term334241);
        setField(term334242, term334242.getClass(), "next", null);
        setField(term334242, term334242.getClass(), "key", term334243);
        setField(term334242, term334242.getClass(), "value", null);
        setElement(term334240, 6, term334242);
        setField(term334239, term334239.getClass(), "data", term334240);
        setIntField(term334239, term334239.getClass(), "threshold", 12);
        setIntField(term334239, term334239.getClass(), "modCount", 2);
        setField(term334239, term334239.getClass(), "entrySet", null);
        setField(term334239, term334239.getClass(), "keySet", null);
        setField(term334239, term334239.getClass(), "values", null);
        setField(term334239, term334239.getClass(), "keySet", null);
        setField(term334239, term334239.getClass(), "values", null);
        setField(term334238, term334238.getClass(), "delegateMap", term334239);
        term334244 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term334245 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term334246 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term334247 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term334248 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term334249 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term334244, term334244.getClass(), "size", 0);
        setIntField(term334244, term334244.getClass(), "hash1", 0);
        setIntField(term334244, term334244.getClass(), "hash2", 0);
        setIntField(term334244, term334244.getClass(), "hash3", 0);
        setField(term334244, term334244.getClass(), "key1", null);
        setField(term334244, term334244.getClass(), "key2", null);
        setField(term334244, term334244.getClass(), "key3", null);
        setField(term334244, term334244.getClass(), "value1", null);
        setField(term334244, term334244.getClass(), "value2", null);
        setField(term334244, term334244.getClass(), "value3", null);
        setFloatField(term334245, term334245.getClass(), "loadFactor", 0.75F);
        setIntField(term334245, term334245.getClass(), "size", 2);
        setField(term334247, term334247.getClass(), "next", null);
        setField(term334247, term334247.getClass(), "key", term334244);
        setField(term334247, term334247.getClass(), "value", null);
        setElement(term334246, 0, term334247);
        setField(term334248, term334248.getClass(), "next", null);
        setField(term334248, term334248.getClass(), "key", term334249);
        setField(term334248, term334248.getClass(), "value", null);
        setElement(term334246, 6, term334248);
        setField(term334245, term334245.getClass(), "data", term334246);
        setIntField(term334245, term334245.getClass(), "threshold", 12);
        setIntField(term334245, term334245.getClass(), "modCount", 2);
        setField(term334245, term334245.getClass(), "entrySet", null);
        setField(term334245, term334245.getClass(), "keySet", null);
        setField(term334245, term334245.getClass(), "values", null);
        setField(term334245, term334245.getClass(), "keySet", null);
        setField(term334245, term334245.getClass(), "values", null);
        setField(term334244, term334244.getClass(), "delegateMap", term334245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term333068;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term333068, args);
        assertTrue(recursiveEquals(term333068, term334238));
        assertTrue(recursiveEquals(term333068, term334244));
        assertTrue(recursiveEquals(retValue, null));
    }

};


