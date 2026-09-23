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

public class Flat3Map_put_1944740725493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91712;
     Object term92526;
     Object term92532;

    public Flat3Map_put_1944740725493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91712 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term91745 = newInstance(Class.forName("java.util.zip.GZIPOutputStream"));
        setField(term91712, term91712.getClass(), "delegateMap", null);
        setIntField(term91712, term91712.getClass(), "size", 3);
        setIntField(term91712, term91712.getClass(), "hash3", 0);
        setField(term91712, term91712.getClass(), "value3", null);
        setIntField(term91712, term91712.getClass(), "hash2", 0);
        setField(term91712, term91712.getClass(), "value2", term91745);
        term92526 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term92527 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term92528 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term92529 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term92530 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term92531 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term92526, term92526.getClass(), "size", 0);
        setIntField(term92526, term92526.getClass(), "hash1", 0);
        setIntField(term92526, term92526.getClass(), "hash2", 0);
        setIntField(term92526, term92526.getClass(), "hash3", 0);
        setField(term92526, term92526.getClass(), "key1", null);
        setField(term92526, term92526.getClass(), "key2", null);
        setField(term92526, term92526.getClass(), "key3", null);
        setField(term92526, term92526.getClass(), "value1", null);
        setField(term92526, term92526.getClass(), "value2", null);
        setField(term92526, term92526.getClass(), "value3", null);
        setFloatField(term92527, term92527.getClass(), "loadFactor", 0.75F);
        setIntField(term92527, term92527.getClass(), "size", 2);
        setField(term92529, term92529.getClass(), "next", null);
        setField(term92529, term92529.getClass(), "key", term92526);
        setField(term92529, term92529.getClass(), "value", null);
        setElement(term92528, 0, term92529);
        setField(term92530, term92530.getClass(), "next", null);
        setField(term92530, term92530.getClass(), "key", term92531);
        setField(term92530, term92530.getClass(), "value", null);
        setElement(term92528, 5, term92530);
        setField(term92527, term92527.getClass(), "data", term92528);
        setIntField(term92527, term92527.getClass(), "threshold", 12);
        setIntField(term92527, term92527.getClass(), "modCount", 2);
        setField(term92527, term92527.getClass(), "entrySet", null);
        setField(term92527, term92527.getClass(), "keySet", null);
        setField(term92527, term92527.getClass(), "values", null);
        setField(term92527, term92527.getClass(), "keySet", null);
        setField(term92527, term92527.getClass(), "values", null);
        setField(term92526, term92526.getClass(), "delegateMap", term92527);
        term92532 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term92533 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term92534 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term92535 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term92536 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term92537 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term92532, term92532.getClass(), "size", 0);
        setIntField(term92532, term92532.getClass(), "hash1", 0);
        setIntField(term92532, term92532.getClass(), "hash2", 0);
        setIntField(term92532, term92532.getClass(), "hash3", 0);
        setField(term92532, term92532.getClass(), "key1", null);
        setField(term92532, term92532.getClass(), "key2", null);
        setField(term92532, term92532.getClass(), "key3", null);
        setField(term92532, term92532.getClass(), "value1", null);
        setField(term92532, term92532.getClass(), "value2", null);
        setField(term92532, term92532.getClass(), "value3", null);
        setFloatField(term92533, term92533.getClass(), "loadFactor", 0.75F);
        setIntField(term92533, term92533.getClass(), "size", 2);
        setField(term92535, term92535.getClass(), "next", null);
        setField(term92535, term92535.getClass(), "key", term92532);
        setField(term92535, term92535.getClass(), "value", null);
        setElement(term92534, 0, term92535);
        setField(term92536, term92536.getClass(), "next", null);
        setField(term92536, term92536.getClass(), "key", term92537);
        setField(term92536, term92536.getClass(), "value", null);
        setElement(term92534, 5, term92536);
        setField(term92533, term92533.getClass(), "data", term92534);
        setIntField(term92533, term92533.getClass(), "threshold", 12);
        setIntField(term92533, term92533.getClass(), "modCount", 2);
        setField(term92533, term92533.getClass(), "entrySet", null);
        setField(term92533, term92533.getClass(), "keySet", null);
        setField(term92533, term92533.getClass(), "values", null);
        setField(term92533, term92533.getClass(), "keySet", null);
        setField(term92533, term92533.getClass(), "values", null);
        setField(term92532, term92532.getClass(), "delegateMap", term92533);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term91712;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term91712, args);
        assertTrue(recursiveEquals(term91712, term92526));
        assertTrue(recursiveEquals(term91712, term92532));
        assertTrue(recursiveEquals(retValue, null));
    }

};


