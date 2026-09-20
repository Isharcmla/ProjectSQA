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

public class Flat3Map_get_229621781543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103090;
     Object term103376;
     Object term103500;
     Object term103504;

    public Flat3Map_get_229621781543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103090 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103128 = newInstance(Class.forName("java.lang.Object"));
        term103376 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103431 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term103090, term103090.getClass(), "delegateMap", null);
        setIntField(term103090, term103090.getClass(), "size", 2);
        setIntField(term103090, term103090.getClass(), "hash2", 0);
        setField(term103090, term103090.getClass(), "key2", term103128);
        setField(term103376, term103376.getClass(), "delegateMap", null);
        setIntField(term103376, term103376.getClass(), "size", 2);
        setIntField(term103376, term103376.getClass(), "hash2", 0);
        setField(term103376, term103376.getClass(), "value2", null);
        setIntField(term103376, term103376.getClass(), "hash1", 0);
        setIntField(term103431, term103431.getClass(), "size", 0);
        setField(term103376, term103376.getClass(), "value1", term103431);
        setField(term103376, term103376.getClass(), "key2", null);
        setField(term103376, term103376.getClass(), "key1", null);
        setField(term103090, term103090.getClass(), "key1", term103376);
        setField(term103090, term103090.getClass(), "value1", null);
        setIntField(term103090, term103090.getClass(), "hash1", 0);
        term103500 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103501 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103502 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term103503 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term103500, term103500.getClass(), "size", 2);
        setIntField(term103500, term103500.getClass(), "hash1", 0);
        setIntField(term103500, term103500.getClass(), "hash2", 0);
        setIntField(term103500, term103500.getClass(), "hash3", 0);
        setIntField(term103501, term103501.getClass(), "size", 2);
        setIntField(term103501, term103501.getClass(), "hash1", 0);
        setIntField(term103501, term103501.getClass(), "hash2", 0);
        setIntField(term103501, term103501.getClass(), "hash3", 0);
        setField(term103501, term103501.getClass(), "key1", null);
        setField(term103501, term103501.getClass(), "key2", null);
        setField(term103501, term103501.getClass(), "key3", null);
        setFloatField(term103502, term103502.getClass(), "loadFactor", 0.0F);
        setIntField(term103502, term103502.getClass(), "size", 0);
        setField(term103502, term103502.getClass(), "data", null);
        setIntField(term103502, term103502.getClass(), "threshold", 0);
        setIntField(term103502, term103502.getClass(), "modCount", 0);
        setField(term103502, term103502.getClass(), "entrySet", null);
        setField(term103502, term103502.getClass(), "keySet", null);
        setField(term103502, term103502.getClass(), "values", null);
        setField(term103502, term103502.getClass(), "keySet", null);
        setField(term103502, term103502.getClass(), "values", null);
        setField(term103501, term103501.getClass(), "value1", term103502);
        setField(term103501, term103501.getClass(), "value2", null);
        setField(term103501, term103501.getClass(), "value3", null);
        setField(term103501, term103501.getClass(), "delegateMap", null);
        setField(term103500, term103500.getClass(), "key1", term103501);
        setField(term103500, term103500.getClass(), "key2", term103503);
        setField(term103500, term103500.getClass(), "key3", null);
        setField(term103500, term103500.getClass(), "value1", null);
        setField(term103500, term103500.getClass(), "value2", null);
        setField(term103500, term103500.getClass(), "value3", null);
        setField(term103500, term103500.getClass(), "delegateMap", null);
        term103504 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term103505 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term103504, term103504.getClass(), "size", 2);
        setIntField(term103504, term103504.getClass(), "hash1", 0);
        setIntField(term103504, term103504.getClass(), "hash2", 0);
        setIntField(term103504, term103504.getClass(), "hash3", 0);
        setField(term103504, term103504.getClass(), "key1", null);
        setField(term103504, term103504.getClass(), "key2", null);
        setField(term103504, term103504.getClass(), "key3", null);
        setFloatField(term103505, term103505.getClass(), "loadFactor", 0.0F);
        setIntField(term103505, term103505.getClass(), "size", 0);
        setField(term103505, term103505.getClass(), "data", null);
        setIntField(term103505, term103505.getClass(), "threshold", 0);
        setIntField(term103505, term103505.getClass(), "modCount", 0);
        setField(term103505, term103505.getClass(), "entrySet", null);
        setField(term103505, term103505.getClass(), "keySet", null);
        setField(term103505, term103505.getClass(), "values", null);
        setField(term103505, term103505.getClass(), "keySet", null);
        setField(term103505, term103505.getClass(), "values", null);
        setField(term103504, term103504.getClass(), "value1", term103505);
        setField(term103504, term103504.getClass(), "value2", null);
        setField(term103504, term103504.getClass(), "value3", null);
        setField(term103504, term103504.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term103376;
        Object retValue = callMethod(klass, "get", argTypes, term103090, args);
        assertTrue(recursiveEquals(term103090, term103500));
        assertTrue(recursiveEquals(term103376, term103504));
        assertTrue(recursiveEquals(retValue, null));
    }

};
