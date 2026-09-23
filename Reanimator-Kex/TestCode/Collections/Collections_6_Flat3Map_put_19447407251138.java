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

public class Flat3Map_put_19447407251138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343665;
     Object term344255;
     Object term345235;
     Object term345246;

    public Flat3Map_put_19447407251138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343665 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term343757 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term343849 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term343959 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term344053 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term344163 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term343665, term343665.getClass(), "delegateMap", null);
        setIntField(term343665, term343665.getClass(), "size", 3);
        setIntField(term343665, term343665.getClass(), "hash3", -394264576);
        setField(term343757, term343757.getClass(), "delegateMap", null);
        setIntField(term343757, term343757.getClass(), "size", 3);
        setField(term343849, term343849.getClass(), "delegateMap", null);
        setIntField(term343849, term343849.getClass(), "size", 0);
        setField(term343757, term343757.getClass(), "key3", term343849);
        setField(term343757, term343757.getClass(), "key2", null);
        setField(term343757, term343757.getClass(), "value2", null);
        setIntField(term343757, term343757.getClass(), "hash3", -1949892350);
        setField(term343757, term343757.getClass(), "value3", null);
        setIntField(term343757, term343757.getClass(), "hash2", 440534528);
        setIntField(term343757, term343757.getClass(), "hash1", -2146555136);
        setIntField(term343959, term343959.getClass(), "size", 0);
        setField(term343757, term343757.getClass(), "key1", term343959);
        setField(term343757, term343757.getClass(), "value1", null);
        setField(term343665, term343665.getClass(), "key3", term343757);
        setIntField(term343665, term343665.getClass(), "hash2", -394264576);
        setField(term343665, term343665.getClass(), "key2", null);
        setIntField(term343665, term343665.getClass(), "hash1", -394264576);
        setField(term343665, term343665.getClass(), "key1", null);
        setField(term343665, term343665.getClass(), "value3", term344053);
        setField(term343665, term343665.getClass(), "value2", null);
        setField(term343665, term343665.getClass(), "value1", term344163);
        term344255 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term344347 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term344439 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term344255, term344255.getClass(), "delegateMap", null);
        setIntField(term344255, term344255.getClass(), "size", 3);
        setIntField(term344255, term344255.getClass(), "hash3", 1073741824);
        setField(term344255, term344255.getClass(), "value3", null);
        setIntField(term344255, term344255.getClass(), "hash2", 268435456);
        setField(term344255, term344255.getClass(), "value2", null);
        setIntField(term344255, term344255.getClass(), "hash1", -1736441856);
        setField(term344255, term344255.getClass(), "value1", null);
        setField(term344255, term344255.getClass(), "key3", null);
        setField(term344347, term344347.getClass(), "delegateMap", null);
        setIntField(term344347, term344347.getClass(), "size", 0);
        setField(term344255, term344255.getClass(), "key2", term344347);
        setField(term344439, term344439.getClass(), "delegateMap", null);
        setIntField(term344439, term344439.getClass(), "size", 1);
        setIntField(term344439, term344439.getClass(), "hash1", 0);
        setField(term344439, term344439.getClass(), "value1", null);
        setField(term344255, term344255.getClass(), "key1", term344439);
        term345235 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term345236 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term345237 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term345238 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term345239 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term345240 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object term345241 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term345242 = newInstance(Class.forName("java.lang.Object"));
        Object term345243 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term345244 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term345245 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term345235, term345235.getClass(), "size", 0);
        setIntField(term345235, term345235.getClass(), "hash1", 0);
        setIntField(term345235, term345235.getClass(), "hash2", 0);
        setIntField(term345235, term345235.getClass(), "hash3", 0);
        setField(term345235, term345235.getClass(), "key1", null);
        setField(term345235, term345235.getClass(), "key2", null);
        setField(term345235, term345235.getClass(), "key3", null);
        setField(term345235, term345235.getClass(), "value1", null);
        setField(term345235, term345235.getClass(), "value2", null);
        setField(term345235, term345235.getClass(), "value3", null);
        setFloatField(term345236, term345236.getClass(), "loadFactor", 0.75F);
        setIntField(term345236, term345236.getClass(), "size", 3);
        setField(term345238, term345238.getClass(), "next", null);
        setIntField(term345239, term345239.getClass(), "size", 3);
        setIntField(term345239, term345239.getClass(), "hash1", -2146555136);
        setIntField(term345239, term345239.getClass(), "hash2", 440534528);
        setIntField(term345239, term345239.getClass(), "hash3", -1949892350);
        setField(term345239, term345239.getClass(), "key1", null);
        setField(term345239, term345239.getClass(), "key2", null);
        setField(term345239, term345239.getClass(), "key3", null);
        setField(term345239, term345239.getClass(), "value1", null);
        setField(term345239, term345239.getClass(), "value2", null);
        setField(term345239, term345239.getClass(), "value3", null);
        setField(term345239, term345239.getClass(), "delegateMap", null);
        setField(term345238, term345238.getClass(), "key", term345239);
        setFloatField(term345240, term345240.getClass(), "loadFactor", 0.0F);
        setIntField(term345240, term345240.getClass(), "size", 0);
        setField(term345240, term345240.getClass(), "data", null);
        setIntField(term345240, term345240.getClass(), "threshold", 0);
        setIntField(term345240, term345240.getClass(), "modCount", 0);
        setField(term345240, term345240.getClass(), "entrySet", null);
        setField(term345240, term345240.getClass(), "keySet", null);
        setField(term345240, term345240.getClass(), "values", null);
        setField(term345240, term345240.getClass(), "keySet", null);
        setField(term345240, term345240.getClass(), "values", null);
        setField(term345238, term345238.getClass(), "value", term345240);
        setElement(term345237, 2, term345238);
        setField(term345241, term345241.getClass(), "next", null);
        setField(term345241, term345241.getClass(), "key", term345242);
        setFloatField(term345243, term345243.getClass(), "loadFactor", 0.0F);
        setIntField(term345243, term345243.getClass(), "size", 0);
        setField(term345243, term345243.getClass(), "data", null);
        setIntField(term345243, term345243.getClass(), "threshold", 0);
        setIntField(term345243, term345243.getClass(), "modCount", 0);
        setField(term345243, term345243.getClass(), "entrySet", null);
        setField(term345243, term345243.getClass(), "keySet", null);
        setField(term345243, term345243.getClass(), "values", null);
        setField(term345243, term345243.getClass(), "keySet", null);
        setField(term345243, term345243.getClass(), "values", null);
        setField(term345241, term345241.getClass(), "value", term345243);
        setElement(term345237, 6, term345241);
        setField(term345244, term345244.getClass(), "next", null);
        setIntField(term345245, term345245.getClass(), "size", 3);
        setIntField(term345245, term345245.getClass(), "hash1", -1736441856);
        setIntField(term345245, term345245.getClass(), "hash2", 268435456);
        setIntField(term345245, term345245.getClass(), "hash3", 1073741824);
        setField(term345245, term345245.getClass(), "key1", null);
        setField(term345245, term345245.getClass(), "key2", null);
        setField(term345245, term345245.getClass(), "key3", null);
        setField(term345245, term345245.getClass(), "value1", null);
        setField(term345245, term345245.getClass(), "value2", null);
        setField(term345245, term345245.getClass(), "value3", null);
        setField(term345245, term345245.getClass(), "delegateMap", null);
        setField(term345244, term345244.getClass(), "key", term345245);
        setField(term345244, term345244.getClass(), "value", null);
        setElement(term345237, 15, term345244);
        setField(term345236, term345236.getClass(), "data", term345237);
        setIntField(term345236, term345236.getClass(), "threshold", 12);
        setIntField(term345236, term345236.getClass(), "modCount", 3);
        setField(term345236, term345236.getClass(), "entrySet", null);
        setField(term345236, term345236.getClass(), "keySet", null);
        setField(term345236, term345236.getClass(), "values", null);
        setField(term345236, term345236.getClass(), "keySet", null);
        setField(term345236, term345236.getClass(), "values", null);
        setField(term345235, term345235.getClass(), "delegateMap", term345236);
        term345246 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term345246, term345246.getClass(), "size", 3);
        setIntField(term345246, term345246.getClass(), "hash1", -1736441856);
        setIntField(term345246, term345246.getClass(), "hash2", 268435456);
        setIntField(term345246, term345246.getClass(), "hash3", 1073741824);
        setField(term345246, term345246.getClass(), "key1", null);
        setField(term345246, term345246.getClass(), "key2", null);
        setField(term345246, term345246.getClass(), "key3", null);
        setField(term345246, term345246.getClass(), "value1", null);
        setField(term345246, term345246.getClass(), "value2", null);
        setField(term345246, term345246.getClass(), "value3", null);
        setField(term345246, term345246.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term344255;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term343665, args);
        assertTrue(recursiveEquals(term343665, term345235));
        assertTrue(recursiveEquals(term344255, term345246));
        assertTrue(recursiveEquals(retValue, null));
    }

};


