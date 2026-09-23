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

public class Flat3Map_put_19447407251153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351653;
     Object term352525;
     Object term352532;

    public Flat3Map_put_19447407251153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term351653 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term351684 = newInstance(Class.forName("java.util.regex.Pattern$Node"));
        setField(term351653, term351653.getClass(), "delegateMap", null);
        setIntField(term351653, term351653.getClass(), "size", 3);
        setIntField(term351653, term351653.getClass(), "hash3", 0);
        setField(term351653, term351653.getClass(), "value3", null);
        setIntField(term351653, term351653.getClass(), "hash2", 0);
        setField(term351653, term351653.getClass(), "value2", null);
        setIntField(term351653, term351653.getClass(), "hash1", 0);
        setField(term351653, term351653.getClass(), "value1", null);
        setField(term351653, term351653.getClass(), "key3", null);
        setField(term351653, term351653.getClass(), "key2", null);
        setField(term351653, term351653.getClass(), "key1", term351684);
        term352525 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term352526 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term352527 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term352528 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352529 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352530 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352531 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term352525, term352525.getClass(), "size", 0);
        setIntField(term352525, term352525.getClass(), "hash1", 0);
        setIntField(term352525, term352525.getClass(), "hash2", 0);
        setIntField(term352525, term352525.getClass(), "hash3", 0);
        setField(term352525, term352525.getClass(), "key1", null);
        setField(term352525, term352525.getClass(), "key2", null);
        setField(term352525, term352525.getClass(), "key3", null);
        setField(term352525, term352525.getClass(), "value1", null);
        setField(term352525, term352525.getClass(), "value2", null);
        setField(term352525, term352525.getClass(), "value3", null);
        setFloatField(term352526, term352526.getClass(), "loadFactor", 0.75F);
        setIntField(term352526, term352526.getClass(), "size", 3);
        setField(term352529, term352529.getClass(), "next", null);
        setField(term352529, term352529.getClass(), "key", null);
        setField(term352529, term352529.getClass(), "value", null);
        setField(term352528, term352528.getClass(), "next", term352529);
        setField(term352528, term352528.getClass(), "key", term352525);
        setField(term352528, term352528.getClass(), "value", null);
        setElement(term352527, 4, term352528);
        setField(term352530, term352530.getClass(), "next", null);
        setField(term352530, term352530.getClass(), "key", term352531);
        setField(term352530, term352530.getClass(), "value", null);
        setElement(term352527, 6, term352530);
        setField(term352526, term352526.getClass(), "data", term352527);
        setIntField(term352526, term352526.getClass(), "threshold", 12);
        setIntField(term352526, term352526.getClass(), "modCount", 3);
        setField(term352526, term352526.getClass(), "entrySet", null);
        setField(term352526, term352526.getClass(), "keySet", null);
        setField(term352526, term352526.getClass(), "values", null);
        setField(term352526, term352526.getClass(), "keySet", null);
        setField(term352526, term352526.getClass(), "values", null);
        setField(term352525, term352525.getClass(), "delegateMap", term352526);
        term352532 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term352533 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term352534 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term352535 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352536 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352537 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term352538 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term352532, term352532.getClass(), "size", 0);
        setIntField(term352532, term352532.getClass(), "hash1", 0);
        setIntField(term352532, term352532.getClass(), "hash2", 0);
        setIntField(term352532, term352532.getClass(), "hash3", 0);
        setField(term352532, term352532.getClass(), "key1", null);
        setField(term352532, term352532.getClass(), "key2", null);
        setField(term352532, term352532.getClass(), "key3", null);
        setField(term352532, term352532.getClass(), "value1", null);
        setField(term352532, term352532.getClass(), "value2", null);
        setField(term352532, term352532.getClass(), "value3", null);
        setFloatField(term352533, term352533.getClass(), "loadFactor", 0.75F);
        setIntField(term352533, term352533.getClass(), "size", 3);
        setField(term352536, term352536.getClass(), "next", null);
        setField(term352536, term352536.getClass(), "key", null);
        setField(term352536, term352536.getClass(), "value", null);
        setField(term352535, term352535.getClass(), "next", term352536);
        setField(term352535, term352535.getClass(), "key", term352532);
        setField(term352535, term352535.getClass(), "value", null);
        setElement(term352534, 4, term352535);
        setField(term352537, term352537.getClass(), "next", null);
        setField(term352537, term352537.getClass(), "key", term352538);
        setField(term352537, term352537.getClass(), "value", null);
        setElement(term352534, 6, term352537);
        setField(term352533, term352533.getClass(), "data", term352534);
        setIntField(term352533, term352533.getClass(), "threshold", 12);
        setIntField(term352533, term352533.getClass(), "modCount", 3);
        setField(term352533, term352533.getClass(), "entrySet", null);
        setField(term352533, term352533.getClass(), "keySet", null);
        setField(term352533, term352533.getClass(), "values", null);
        setField(term352533, term352533.getClass(), "keySet", null);
        setField(term352533, term352533.getClass(), "values", null);
        setField(term352532, term352532.getClass(), "delegateMap", term352533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term351653;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term351653, args);
        assertTrue(recursiveEquals(term351653, term352525));
        assertTrue(recursiveEquals(term351653, term352532));
        assertTrue(recursiveEquals(retValue, null));
    }

};


