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

public class Flat3Map_put_19447407251148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348865;
     Object term349363;
     Object term350394;
     Object term350403;

    public Flat3Map_put_19447407251148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348865 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term348957 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term349049 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term349141 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term349271 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object[] term348550 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        setField(term348865, term348865.getClass(), "delegateMap", null);
        setIntField(term348865, term348865.getClass(), "size", 3);
        setIntField(term348865, term348865.getClass(), "hash3", -1330064256);
        setField(term348957, term348957.getClass(), "delegateMap", null);
        setIntField(term348957, term348957.getClass(), "size", 3);
        setField(term348957, term348957.getClass(), "key3", term349049);
        setField(term348957, term348957.getClass(), "key2", null);
        setField(term348957, term348957.getClass(), "value2", null);
        setIntField(term348957, term348957.getClass(), "hash3", 1076896896);
        setIntField(term348957, term348957.getClass(), "hash2", 54001664);
        setIntField(term348957, term348957.getClass(), "hash1", 1834004480);
        setField(term348957, term348957.getClass(), "value3", null);
        setField(term348957, term348957.getClass(), "value1", null);
        setField(term348865, term348865.getClass(), "key3", term348957);
        setIntField(term348865, term348865.getClass(), "hash2", -1330064256);
        setField(term348865, term348865.getClass(), "key2", null);
        setIntField(term348865, term348865.getClass(), "hash1", -1330064256);
        setField(term348865, term348865.getClass(), "key1", null);
        setField(term348865, term348865.getClass(), "value3", term349141);
        setField(term348865, term348865.getClass(), "value2", term349271);
        setField(term348865, term348865.getClass(), "value1", term348550);
        term349363 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term349455 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term349363, term349363.getClass(), "delegateMap", null);
        setIntField(term349363, term349363.getClass(), "size", 3);
        setIntField(term349363, term349363.getClass(), "hash3", 1076896896);
        setField(term349363, term349363.getClass(), "value3", null);
        setIntField(term349363, term349363.getClass(), "hash2", 54001664);
        setField(term349363, term349363.getClass(), "value2", null);
        setIntField(term349363, term349363.getClass(), "hash1", 1834004480);
        setField(term349363, term349363.getClass(), "value1", null);
        setField(term349363, term349363.getClass(), "key3", null);
        setField(term349455, term349455.getClass(), "delegateMap", null);
        setIntField(term349455, term349455.getClass(), "size", 0);
        setField(term349363, term349363.getClass(), "key2", term349455);
        term350394 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term350395 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term350396 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term350397 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term350398 = newInstance(Class.forName("java.lang.Object"));
        Object[] term350399 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 0);
        Object term350400 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term350401 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term350402 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term350394, term350394.getClass(), "size", 0);
        setIntField(term350394, term350394.getClass(), "hash1", 0);
        setIntField(term350394, term350394.getClass(), "hash2", 0);
        setIntField(term350394, term350394.getClass(), "hash3", 0);
        setField(term350394, term350394.getClass(), "key1", null);
        setField(term350394, term350394.getClass(), "key2", null);
        setField(term350394, term350394.getClass(), "key3", null);
        setField(term350394, term350394.getClass(), "value1", null);
        setField(term350394, term350394.getClass(), "value2", null);
        setField(term350394, term350394.getClass(), "value3", null);
        setFloatField(term350395, term350395.getClass(), "loadFactor", 0.75F);
        setIntField(term350395, term350395.getClass(), "size", 3);
        setField(term350397, term350397.getClass(), "next", null);
        setField(term350397, term350397.getClass(), "key", term350398);
        setField(term350397, term350397.getClass(), "value", term350399);
        setElement(term350396, 6, term350397);
        setField(term350401, term350401.getClass(), "next", null);
        setField(term350401, term350401.getClass(), "key", null);
        setField(term350401, term350401.getClass(), "value", null);
        setField(term350400, term350400.getClass(), "next", term350401);
        setIntField(term350402, term350402.getClass(), "size", 3);
        setIntField(term350402, term350402.getClass(), "hash1", 1834004480);
        setIntField(term350402, term350402.getClass(), "hash2", 54001664);
        setIntField(term350402, term350402.getClass(), "hash3", 1076896896);
        setField(term350402, term350402.getClass(), "key1", null);
        setField(term350402, term350402.getClass(), "key2", null);
        setField(term350402, term350402.getClass(), "key3", null);
        setField(term350402, term350402.getClass(), "value1", null);
        setField(term350402, term350402.getClass(), "value2", null);
        setField(term350402, term350402.getClass(), "value3", null);
        setField(term350402, term350402.getClass(), "delegateMap", null);
        setField(term350400, term350400.getClass(), "key", term350402);
        setField(term350400, term350400.getClass(), "value", null);
        setElement(term350396, 11, term350400);
        setField(term350395, term350395.getClass(), "data", term350396);
        setIntField(term350395, term350395.getClass(), "threshold", 12);
        setIntField(term350395, term350395.getClass(), "modCount", 3);
        setField(term350395, term350395.getClass(), "entrySet", null);
        setField(term350395, term350395.getClass(), "keySet", null);
        setField(term350395, term350395.getClass(), "values", null);
        setField(term350395, term350395.getClass(), "keySet", null);
        setField(term350395, term350395.getClass(), "values", null);
        setField(term350394, term350394.getClass(), "delegateMap", term350395);
        term350403 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term350403, term350403.getClass(), "size", 3);
        setIntField(term350403, term350403.getClass(), "hash1", 1834004480);
        setIntField(term350403, term350403.getClass(), "hash2", 54001664);
        setIntField(term350403, term350403.getClass(), "hash3", 1076896896);
        setField(term350403, term350403.getClass(), "key1", null);
        setField(term350403, term350403.getClass(), "key2", null);
        setField(term350403, term350403.getClass(), "key3", null);
        setField(term350403, term350403.getClass(), "value1", null);
        setField(term350403, term350403.getClass(), "value2", null);
        setField(term350403, term350403.getClass(), "value3", null);
        setField(term350403, term350403.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term349363;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term348865, args);
        assertTrue(recursiveEquals(term348865, term350394));
        assertTrue(recursiveEquals(term349363, term350403));
        assertTrue(recursiveEquals(retValue, null));
    }

};


