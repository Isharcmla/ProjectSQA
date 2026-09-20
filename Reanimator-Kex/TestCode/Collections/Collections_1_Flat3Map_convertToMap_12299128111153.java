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

public class Flat3Map_convertToMap_12299128111153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250214;
     Object term250618;

    public Flat3Map_convertToMap_12299128111153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250214 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250288 = newInstance(Class.forName("java.util.IdentityHashMap$EntrySet"));
        Object term250418 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term250214, term250214.getClass(), "delegateMap", null);
        setIntField(term250214, term250214.getClass(), "size", 3);
        setField(term250214, term250214.getClass(), "key3", null);
        setField(term250214, term250214.getClass(), "value3", term250288);
        setField(term250214, term250214.getClass(), "key2", null);
        setField(term250214, term250214.getClass(), "value2", term250418);
        term250618 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term250619 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term250620 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term250621 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term250622 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term250618, term250618.getClass(), "size", 0);
        setIntField(term250618, term250618.getClass(), "hash1", 0);
        setIntField(term250618, term250618.getClass(), "hash2", 0);
        setIntField(term250618, term250618.getClass(), "hash3", 0);
        setField(term250618, term250618.getClass(), "key1", null);
        setField(term250618, term250618.getClass(), "key2", null);
        setField(term250618, term250618.getClass(), "key3", null);
        setField(term250618, term250618.getClass(), "value1", null);
        setField(term250618, term250618.getClass(), "value2", null);
        setField(term250618, term250618.getClass(), "value3", null);
        setFloatField(term250619, term250619.getClass(), "loadFactor", 0.75F);
        setIntField(term250619, term250619.getClass(), "size", 1);
        setField(term250621, term250621.getClass(), "next", null);
        setField(term250621, term250621.getClass(), "key", term250622);
        setField(term250621, term250621.getClass(), "value", null);
        setElement(term250620, 0, term250621);
        setField(term250619, term250619.getClass(), "data", term250620);
        setIntField(term250619, term250619.getClass(), "threshold", 12);
        setIntField(term250619, term250619.getClass(), "modCount", 1);
        setField(term250619, term250619.getClass(), "entrySet", null);
        setField(term250619, term250619.getClass(), "keySet", null);
        setField(term250619, term250619.getClass(), "values", null);
        setField(term250619, term250619.getClass(), "keySet", null);
        setField(term250619, term250619.getClass(), "values", null);
        setField(term250618, term250618.getClass(), "delegateMap", term250619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertToMap", argTypes, term250214, args);
        assertTrue(recursiveEquals(term250214, term250618));
    }

};
