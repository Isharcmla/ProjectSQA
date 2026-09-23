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

public class Flat3Map_put_1944740725683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158272;
     Object term158918;
     Object term158925;

    public Flat3Map_put_1944740725683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158272 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158308 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        setField(term158272, term158272.getClass(), "delegateMap", null);
        setIntField(term158272, term158272.getClass(), "size", 3);
        setIntField(term158272, term158272.getClass(), "hash3", 0);
        setField(term158272, term158272.getClass(), "value3", null);
        setIntField(term158272, term158272.getClass(), "hash2", 0);
        setField(term158272, term158272.getClass(), "value2", null);
        setIntField(term158272, term158272.getClass(), "hash1", 0);
        setField(term158272, term158272.getClass(), "value1", term158308);
        term158918 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158919 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term158920 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term158921 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term158922 = newInstance(Class.forName("java.lang.Object"));
        Object term158923 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        Object term158924 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term158918, term158918.getClass(), "size", 0);
        setIntField(term158918, term158918.getClass(), "hash1", 0);
        setIntField(term158918, term158918.getClass(), "hash2", 0);
        setIntField(term158918, term158918.getClass(), "hash3", 0);
        setField(term158918, term158918.getClass(), "key1", null);
        setField(term158918, term158918.getClass(), "key2", null);
        setField(term158918, term158918.getClass(), "key3", null);
        setField(term158918, term158918.getClass(), "value1", null);
        setField(term158918, term158918.getClass(), "value2", null);
        setField(term158918, term158918.getClass(), "value3", null);
        setFloatField(term158919, term158919.getClass(), "loadFactor", 0.75F);
        setIntField(term158919, term158919.getClass(), "size", 2);
        setField(term158921, term158921.getClass(), "next", null);
        setField(term158921, term158921.getClass(), "key", term158922);
        setField(term158923, term158923.getClass(), "lambdaForm", null);
        setField(term158921, term158921.getClass(), "value", term158923);
        setElement(term158920, 5, term158921);
        setField(term158924, term158924.getClass(), "next", null);
        setField(term158924, term158924.getClass(), "key", term158918);
        setField(term158924, term158924.getClass(), "value", null);
        setElement(term158920, 14, term158924);
        setField(term158919, term158919.getClass(), "data", term158920);
        setIntField(term158919, term158919.getClass(), "threshold", 12);
        setIntField(term158919, term158919.getClass(), "modCount", 2);
        setField(term158919, term158919.getClass(), "entrySet", null);
        setField(term158919, term158919.getClass(), "keySet", null);
        setField(term158919, term158919.getClass(), "values", null);
        setField(term158919, term158919.getClass(), "keySet", null);
        setField(term158919, term158919.getClass(), "values", null);
        setField(term158918, term158918.getClass(), "delegateMap", term158919);
        term158925 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term158926 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term158927 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term158928 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term158929 = newInstance(Class.forName("java.lang.Object"));
        Object term158930 = newInstance(Class.forName("java.lang.invoke.LambdaFormEditor"));
        Object term158931 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term158925, term158925.getClass(), "size", 0);
        setIntField(term158925, term158925.getClass(), "hash1", 0);
        setIntField(term158925, term158925.getClass(), "hash2", 0);
        setIntField(term158925, term158925.getClass(), "hash3", 0);
        setField(term158925, term158925.getClass(), "key1", null);
        setField(term158925, term158925.getClass(), "key2", null);
        setField(term158925, term158925.getClass(), "key3", null);
        setField(term158925, term158925.getClass(), "value1", null);
        setField(term158925, term158925.getClass(), "value2", null);
        setField(term158925, term158925.getClass(), "value3", null);
        setFloatField(term158926, term158926.getClass(), "loadFactor", 0.75F);
        setIntField(term158926, term158926.getClass(), "size", 2);
        setField(term158928, term158928.getClass(), "next", null);
        setField(term158928, term158928.getClass(), "key", term158929);
        setField(term158930, term158930.getClass(), "lambdaForm", null);
        setField(term158928, term158928.getClass(), "value", term158930);
        setElement(term158927, 5, term158928);
        setField(term158931, term158931.getClass(), "next", null);
        setField(term158931, term158931.getClass(), "key", term158925);
        setField(term158931, term158931.getClass(), "value", null);
        setElement(term158927, 14, term158931);
        setField(term158926, term158926.getClass(), "data", term158927);
        setIntField(term158926, term158926.getClass(), "threshold", 12);
        setIntField(term158926, term158926.getClass(), "modCount", 2);
        setField(term158926, term158926.getClass(), "entrySet", null);
        setField(term158926, term158926.getClass(), "keySet", null);
        setField(term158926, term158926.getClass(), "values", null);
        setField(term158926, term158926.getClass(), "keySet", null);
        setField(term158926, term158926.getClass(), "values", null);
        setField(term158925, term158925.getClass(), "delegateMap", term158926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term158272;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term158272, args);
        assertTrue(recursiveEquals(term158272, term158918));
        assertTrue(recursiveEquals(term158272, term158925));
        assertTrue(recursiveEquals(retValue, null));
    }

};


