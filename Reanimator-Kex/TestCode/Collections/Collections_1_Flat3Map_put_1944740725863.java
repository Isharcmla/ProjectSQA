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

public class Flat3Map_put_1944740725863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174132;
     Object term174247;
     Object term174249;

    public Flat3Map_put_1944740725863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174132 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term174187 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term174132, term174132.getClass(), "delegateMap", null);
        setIntField(term174132, term174132.getClass(), "size", 2);
        setIntField(term174132, term174132.getClass(), "hash2", 0);
        setField(term174132, term174132.getClass(), "value2", null);
        setIntField(term174132, term174132.getClass(), "hash1", 0);
        setField(term174132, term174132.getClass(), "value1", term174187);
        term174247 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term174248 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term174247, term174247.getClass(), "size", 3);
        setIntField(term174247, term174247.getClass(), "hash1", 0);
        setIntField(term174247, term174247.getClass(), "hash2", 0);
        setIntField(term174247, term174247.getClass(), "hash3", 0);
        setField(term174247, term174247.getClass(), "key1", null);
        setField(term174247, term174247.getClass(), "key2", null);
        setField(term174247, term174247.getClass(), "key3", term174247);
        setFloatField(term174248, term174248.getClass(), "loadFactor", 0.0F);
        setIntField(term174248, term174248.getClass(), "size", 0);
        setField(term174248, term174248.getClass(), "data", null);
        setIntField(term174248, term174248.getClass(), "threshold", 0);
        setIntField(term174248, term174248.getClass(), "modCount", 0);
        setField(term174248, term174248.getClass(), "entrySet", null);
        setField(term174248, term174248.getClass(), "keySet", null);
        setField(term174248, term174248.getClass(), "values", null);
        setField(term174248, term174248.getClass(), "keySet", null);
        setField(term174248, term174248.getClass(), "values", null);
        setField(term174247, term174247.getClass(), "value1", term174248);
        setField(term174247, term174247.getClass(), "value2", null);
        setField(term174247, term174247.getClass(), "value3", null);
        setField(term174247, term174247.getClass(), "delegateMap", null);
        term174249 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term174250 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term174249, term174249.getClass(), "size", 3);
        setIntField(term174249, term174249.getClass(), "hash1", 0);
        setIntField(term174249, term174249.getClass(), "hash2", 0);
        setIntField(term174249, term174249.getClass(), "hash3", 0);
        setField(term174249, term174249.getClass(), "key1", null);
        setField(term174249, term174249.getClass(), "key2", null);
        setField(term174249, term174249.getClass(), "key3", term174249);
        setFloatField(term174250, term174250.getClass(), "loadFactor", 0.0F);
        setIntField(term174250, term174250.getClass(), "size", 0);
        setField(term174250, term174250.getClass(), "data", null);
        setIntField(term174250, term174250.getClass(), "threshold", 0);
        setIntField(term174250, term174250.getClass(), "modCount", 0);
        setField(term174250, term174250.getClass(), "entrySet", null);
        setField(term174250, term174250.getClass(), "keySet", null);
        setField(term174250, term174250.getClass(), "values", null);
        setField(term174250, term174250.getClass(), "keySet", null);
        setField(term174250, term174250.getClass(), "values", null);
        setField(term174249, term174249.getClass(), "value1", term174250);
        setField(term174249, term174249.getClass(), "value2", null);
        setField(term174249, term174249.getClass(), "value3", null);
        setField(term174249, term174249.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term174132;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term174132, args);
        assertTrue(recursiveEquals(term174132, term174247));
        assertTrue(recursiveEquals(term174132, term174249));
        assertTrue(recursiveEquals(retValue, null));
    }

};
