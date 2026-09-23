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

public class Flat3Map_put_19447407251135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342350;
     Object term342610;
     Object term343097;
     Object term343105;

    public Flat3Map_put_19447407251135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342350 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342442 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342480 = newInstance(Class.forName("java.lang.Object"));
        Object term342518 = newInstance(Class.forName("java.lang.Object"));
        setField(term342350, term342350.getClass(), "delegateMap", null);
        setIntField(term342350, term342350.getClass(), "size", 3);
        setIntField(term342350, term342350.getClass(), "hash3", 0);
        setField(term342442, term342442.getClass(), "delegateMap", null);
        setIntField(term342442, term342442.getClass(), "size", 3);
        setField(term342442, term342442.getClass(), "key3", term342480);
        setField(term342442, term342442.getClass(), "key2", null);
        setField(term342442, term342442.getClass(), "value2", null);
        setIntField(term342442, term342442.getClass(), "hash3", 0);
        setIntField(term342442, term342442.getClass(), "hash2", 0);
        setIntField(term342442, term342442.getClass(), "hash1", 0);
        setField(term342442, term342442.getClass(), "key1", term342518);
        setField(term342350, term342350.getClass(), "key3", term342442);
        setIntField(term342350, term342350.getClass(), "hash2", -1);
        setIntField(term342350, term342350.getClass(), "hash1", -1);
        term342610 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term342702 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term342610, term342610.getClass(), "delegateMap", null);
        setIntField(term342610, term342610.getClass(), "size", 3);
        setIntField(term342610, term342610.getClass(), "hash3", 0);
        setField(term342610, term342610.getClass(), "value3", null);
        setIntField(term342610, term342610.getClass(), "hash2", 0);
        setField(term342610, term342610.getClass(), "value2", null);
        setIntField(term342610, term342610.getClass(), "hash1", 0);
        setField(term342610, term342610.getClass(), "value1", null);
        setField(term342610, term342610.getClass(), "key3", null);
        setField(term342702, term342702.getClass(), "delegateMap", null);
        setIntField(term342702, term342702.getClass(), "size", 2);
        setIntField(term342702, term342702.getClass(), "hash2", 0);
        setField(term342702, term342702.getClass(), "value2", null);
        setIntField(term342702, term342702.getClass(), "hash1", 0);
        setField(term342702, term342702.getClass(), "value1", null);
        setField(term342610, term342610.getClass(), "key2", term342702);
        term343097 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term343098 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term343099 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term343100 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term343101 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term343102 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term343103 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term343104 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term343097, term343097.getClass(), "size", 0);
        setIntField(term343097, term343097.getClass(), "hash1", 0);
        setIntField(term343097, term343097.getClass(), "hash2", 0);
        setIntField(term343097, term343097.getClass(), "hash3", 0);
        setField(term343097, term343097.getClass(), "key1", null);
        setField(term343097, term343097.getClass(), "key2", null);
        setField(term343097, term343097.getClass(), "key3", null);
        setField(term343097, term343097.getClass(), "value1", null);
        setField(term343097, term343097.getClass(), "value2", null);
        setField(term343097, term343097.getClass(), "value3", null);
        setFloatField(term343098, term343098.getClass(), "loadFactor", 0.75F);
        setIntField(term343098, term343098.getClass(), "size", 3);
        setField(term343101, term343101.getClass(), "next", null);
        setField(term343101, term343101.getClass(), "key", null);
        setField(term343101, term343101.getClass(), "value", null);
        setField(term343100, term343100.getClass(), "next", term343101);
        setIntField(term343102, term343102.getClass(), "size", 3);
        setIntField(term343102, term343102.getClass(), "hash1", 0);
        setIntField(term343102, term343102.getClass(), "hash2", 0);
        setIntField(term343102, term343102.getClass(), "hash3", 0);
        setField(term343102, term343102.getClass(), "key1", null);
        setField(term343102, term343102.getClass(), "key2", null);
        setField(term343102, term343102.getClass(), "key3", null);
        setField(term343102, term343102.getClass(), "value1", null);
        setField(term343102, term343102.getClass(), "value2", null);
        setField(term343102, term343102.getClass(), "value3", null);
        setField(term343102, term343102.getClass(), "delegateMap", null);
        setField(term343100, term343100.getClass(), "key", term343102);
        setField(term343100, term343100.getClass(), "value", null);
        setElement(term343099, 0, term343100);
        setField(term343103, term343103.getClass(), "next", null);
        setField(term343103, term343103.getClass(), "key", term343104);
        setField(term343103, term343103.getClass(), "value", null);
        setElement(term343099, 6, term343103);
        setField(term343098, term343098.getClass(), "data", term343099);
        setIntField(term343098, term343098.getClass(), "threshold", 12);
        setIntField(term343098, term343098.getClass(), "modCount", 3);
        setField(term343098, term343098.getClass(), "entrySet", null);
        setField(term343098, term343098.getClass(), "keySet", null);
        setField(term343098, term343098.getClass(), "values", null);
        setField(term343098, term343098.getClass(), "keySet", null);
        setField(term343098, term343098.getClass(), "values", null);
        setField(term343097, term343097.getClass(), "delegateMap", term343098);
        term343105 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term343105, term343105.getClass(), "size", 3);
        setIntField(term343105, term343105.getClass(), "hash1", 0);
        setIntField(term343105, term343105.getClass(), "hash2", 0);
        setIntField(term343105, term343105.getClass(), "hash3", 0);
        setField(term343105, term343105.getClass(), "key1", null);
        setField(term343105, term343105.getClass(), "key2", null);
        setField(term343105, term343105.getClass(), "key3", null);
        setField(term343105, term343105.getClass(), "value1", null);
        setField(term343105, term343105.getClass(), "value2", null);
        setField(term343105, term343105.getClass(), "value3", null);
        setField(term343105, term343105.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term342610;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term342350, args);
        assertTrue(recursiveEquals(term342350, term343097));
        assertTrue(recursiveEquals(term342610, term343105));
        assertTrue(recursiveEquals(retValue, null));
    }

};


