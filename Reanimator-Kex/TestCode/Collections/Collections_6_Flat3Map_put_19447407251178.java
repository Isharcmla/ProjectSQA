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

public class Flat3Map_put_19447407251178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365234;
     Object term365516;
     Object term366536;
     Object term366544;

    public Flat3Map_put_19447407251178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365234 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term365326 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term365424 = newInstance(Class.forName("org.apache.commons.collections.map.IdentityMap"));
        setField(term365234, term365234.getClass(), "delegateMap", null);
        setIntField(term365234, term365234.getClass(), "size", 3);
        setIntField(term365234, term365234.getClass(), "hash3", 0);
        setField(term365234, term365234.getClass(), "key3", null);
        setIntField(term365234, term365234.getClass(), "hash2", 0);
        setField(term365234, term365234.getClass(), "key2", null);
        setIntField(term365234, term365234.getClass(), "hash1", 0);
        setField(term365326, term365326.getClass(), "delegateMap", term365424);
        setField(term365234, term365234.getClass(), "key1", term365326);
        term365516 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term365610 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term365516, term365516.getClass(), "delegateMap", null);
        setIntField(term365516, term365516.getClass(), "size", 3);
        setIntField(term365516, term365516.getClass(), "hash3", 0);
        setField(term365516, term365516.getClass(), "value3", null);
        setIntField(term365516, term365516.getClass(), "hash2", 0);
        setIntField(term365610, term365610.getClass(), "size", 0);
        setField(term365516, term365516.getClass(), "value2", term365610);
        setIntField(term365516, term365516.getClass(), "hash1", 0);
        setField(term365516, term365516.getClass(), "value1", null);
        term366536 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term366537 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term366538 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term366539 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term366540 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term366541 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term366542 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term366543 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term366536, term366536.getClass(), "size", 0);
        setIntField(term366536, term366536.getClass(), "hash1", 0);
        setIntField(term366536, term366536.getClass(), "hash2", 0);
        setIntField(term366536, term366536.getClass(), "hash3", 0);
        setField(term366536, term366536.getClass(), "key1", null);
        setField(term366536, term366536.getClass(), "key2", null);
        setField(term366536, term366536.getClass(), "key3", null);
        setField(term366536, term366536.getClass(), "value1", null);
        setField(term366536, term366536.getClass(), "value2", null);
        setField(term366536, term366536.getClass(), "value3", null);
        setFloatField(term366537, term366537.getClass(), "loadFactor", 0.75F);
        setIntField(term366537, term366537.getClass(), "size", 3);
        setField(term366540, term366540.getClass(), "next", null);
        setField(term366540, term366540.getClass(), "key", null);
        setField(term366540, term366540.getClass(), "value", null);
        setField(term366539, term366539.getClass(), "next", term366540);
        setIntField(term366541, term366541.getClass(), "size", 3);
        setIntField(term366541, term366541.getClass(), "hash1", 0);
        setIntField(term366541, term366541.getClass(), "hash2", 0);
        setIntField(term366541, term366541.getClass(), "hash3", 0);
        setField(term366541, term366541.getClass(), "key1", null);
        setField(term366541, term366541.getClass(), "key2", null);
        setField(term366541, term366541.getClass(), "key3", null);
        setField(term366541, term366541.getClass(), "value1", null);
        setField(term366541, term366541.getClass(), "value2", null);
        setField(term366541, term366541.getClass(), "value3", null);
        setField(term366541, term366541.getClass(), "delegateMap", null);
        setField(term366539, term366539.getClass(), "key", term366541);
        setField(term366539, term366539.getClass(), "value", null);
        setElement(term366538, 0, term366539);
        setField(term366542, term366542.getClass(), "next", null);
        setField(term366542, term366542.getClass(), "key", term366543);
        setField(term366542, term366542.getClass(), "value", null);
        setElement(term366538, 6, term366542);
        setField(term366537, term366537.getClass(), "data", term366538);
        setIntField(term366537, term366537.getClass(), "threshold", 12);
        setIntField(term366537, term366537.getClass(), "modCount", 3);
        setField(term366537, term366537.getClass(), "entrySet", null);
        setField(term366537, term366537.getClass(), "keySet", null);
        setField(term366537, term366537.getClass(), "values", null);
        setField(term366537, term366537.getClass(), "keySet", null);
        setField(term366537, term366537.getClass(), "values", null);
        setField(term366536, term366536.getClass(), "delegateMap", term366537);
        term366544 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term366544, term366544.getClass(), "size", 3);
        setIntField(term366544, term366544.getClass(), "hash1", 0);
        setIntField(term366544, term366544.getClass(), "hash2", 0);
        setIntField(term366544, term366544.getClass(), "hash3", 0);
        setField(term366544, term366544.getClass(), "key1", null);
        setField(term366544, term366544.getClass(), "key2", null);
        setField(term366544, term366544.getClass(), "key3", null);
        setField(term366544, term366544.getClass(), "value1", null);
        setField(term366544, term366544.getClass(), "value2", null);
        setField(term366544, term366544.getClass(), "value3", null);
        setField(term366544, term366544.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term365516;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term365234, args);
        assertTrue(recursiveEquals(term365234, term366536));
        assertTrue(recursiveEquals(term365516, term366544));
        assertTrue(recursiveEquals(retValue, null));
    }

};


