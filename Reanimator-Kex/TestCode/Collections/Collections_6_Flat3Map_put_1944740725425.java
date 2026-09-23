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

public class Flat3Map_put_1944740725425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76334;
     Object term76513;
     Object term76516;

    public Flat3Map_put_1944740725425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76334 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76380 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76435 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term76334, term76334.getClass(), "delegateMap", null);
        setIntField(term76334, term76334.getClass(), "size", 3);
        setIntField(term76334, term76334.getClass(), "hash3", 0);
        setField(term76334, term76334.getClass(), "value3", null);
        setIntField(term76334, term76334.getClass(), "hash2", 0);
        setField(term76334, term76334.getClass(), "value2", null);
        setIntField(term76334, term76334.getClass(), "hash1", 0);
        setField(term76334, term76334.getClass(), "value1", null);
        setIntField(term76435, term76435.getClass(), "size", -4);
        setField(term76380, term76380.getClass(), "delegateMap", term76435);
        setField(term76334, term76334.getClass(), "key3", term76380);
        setField(term76334, term76334.getClass(), "key2", term76334);
        term76513 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76514 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76515 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term76513, term76513.getClass(), "size", 3);
        setIntField(term76513, term76513.getClass(), "hash1", 0);
        setIntField(term76513, term76513.getClass(), "hash2", 0);
        setIntField(term76513, term76513.getClass(), "hash3", 0);
        setField(term76513, term76513.getClass(), "key1", null);
        setField(term76513, term76513.getClass(), "key2", term76513);
        setIntField(term76514, term76514.getClass(), "size", 0);
        setIntField(term76514, term76514.getClass(), "hash1", 0);
        setIntField(term76514, term76514.getClass(), "hash2", 0);
        setIntField(term76514, term76514.getClass(), "hash3", 0);
        setField(term76514, term76514.getClass(), "key1", null);
        setField(term76514, term76514.getClass(), "key2", null);
        setField(term76514, term76514.getClass(), "key3", null);
        setField(term76514, term76514.getClass(), "value1", null);
        setField(term76514, term76514.getClass(), "value2", null);
        setField(term76514, term76514.getClass(), "value3", null);
        setFloatField(term76515, term76515.getClass(), "loadFactor", 0.0F);
        setIntField(term76515, term76515.getClass(), "size", -4);
        setField(term76515, term76515.getClass(), "data", null);
        setIntField(term76515, term76515.getClass(), "threshold", 0);
        setIntField(term76515, term76515.getClass(), "modCount", 0);
        setField(term76515, term76515.getClass(), "entrySet", null);
        setField(term76515, term76515.getClass(), "keySet", null);
        setField(term76515, term76515.getClass(), "values", null);
        setField(term76515, term76515.getClass(), "keySet", null);
        setField(term76515, term76515.getClass(), "values", null);
        setField(term76514, term76514.getClass(), "delegateMap", term76515);
        setField(term76513, term76513.getClass(), "key3", term76514);
        setField(term76513, term76513.getClass(), "value1", null);
        setField(term76513, term76513.getClass(), "value2", null);
        setField(term76513, term76513.getClass(), "value3", null);
        setField(term76513, term76513.getClass(), "delegateMap", null);
        term76516 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76517 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term76518 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term76516, term76516.getClass(), "size", 3);
        setIntField(term76516, term76516.getClass(), "hash1", 0);
        setIntField(term76516, term76516.getClass(), "hash2", 0);
        setIntField(term76516, term76516.getClass(), "hash3", 0);
        setField(term76516, term76516.getClass(), "key1", null);
        setField(term76516, term76516.getClass(), "key2", term76516);
        setIntField(term76517, term76517.getClass(), "size", 0);
        setIntField(term76517, term76517.getClass(), "hash1", 0);
        setIntField(term76517, term76517.getClass(), "hash2", 0);
        setIntField(term76517, term76517.getClass(), "hash3", 0);
        setField(term76517, term76517.getClass(), "key1", null);
        setField(term76517, term76517.getClass(), "key2", null);
        setField(term76517, term76517.getClass(), "key3", null);
        setField(term76517, term76517.getClass(), "value1", null);
        setField(term76517, term76517.getClass(), "value2", null);
        setField(term76517, term76517.getClass(), "value3", null);
        setFloatField(term76518, term76518.getClass(), "loadFactor", 0.0F);
        setIntField(term76518, term76518.getClass(), "size", -4);
        setField(term76518, term76518.getClass(), "data", null);
        setIntField(term76518, term76518.getClass(), "threshold", 0);
        setIntField(term76518, term76518.getClass(), "modCount", 0);
        setField(term76518, term76518.getClass(), "entrySet", null);
        setField(term76518, term76518.getClass(), "keySet", null);
        setField(term76518, term76518.getClass(), "values", null);
        setField(term76518, term76518.getClass(), "keySet", null);
        setField(term76518, term76518.getClass(), "values", null);
        setField(term76517, term76517.getClass(), "delegateMap", term76518);
        setField(term76516, term76516.getClass(), "key3", term76517);
        setField(term76516, term76516.getClass(), "value1", null);
        setField(term76516, term76516.getClass(), "value2", null);
        setField(term76516, term76516.getClass(), "value3", null);
        setField(term76516, term76516.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term76334;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term76334, args);
        assertTrue(recursiveEquals(term76334, term76513));
        assertTrue(recursiveEquals(term76334, term76516));
        assertTrue(recursiveEquals(retValue, null));
    }

};


