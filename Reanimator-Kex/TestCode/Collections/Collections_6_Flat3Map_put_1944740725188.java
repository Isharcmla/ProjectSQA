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

public class Flat3Map_put_1944740725188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31003;
     Object term31736;
     Object term31742;

    public Flat3Map_put_1944740725188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31003 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term31003, term31003.getClass(), "delegateMap", null);
        setIntField(term31003, term31003.getClass(), "size", 3);
        term31736 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31737 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term31738 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term31739 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term31740 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term31741 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term31736, term31736.getClass(), "size", 0);
        setIntField(term31736, term31736.getClass(), "hash1", 0);
        setIntField(term31736, term31736.getClass(), "hash2", 0);
        setIntField(term31736, term31736.getClass(), "hash3", 0);
        setField(term31736, term31736.getClass(), "key1", null);
        setField(term31736, term31736.getClass(), "key2", null);
        setField(term31736, term31736.getClass(), "key3", null);
        setField(term31736, term31736.getClass(), "value1", null);
        setField(term31736, term31736.getClass(), "value2", null);
        setField(term31736, term31736.getClass(), "value3", null);
        setFloatField(term31737, term31737.getClass(), "loadFactor", 0.75F);
        setIntField(term31737, term31737.getClass(), "size", 2);
        setField(term31739, term31739.getClass(), "next", null);
        setField(term31739, term31739.getClass(), "key", term31736);
        setField(term31739, term31739.getClass(), "value", null);
        setElement(term31738, 0, term31739);
        setField(term31740, term31740.getClass(), "next", null);
        setField(term31740, term31740.getClass(), "key", term31741);
        setField(term31740, term31740.getClass(), "value", null);
        setElement(term31738, 5, term31740);
        setField(term31737, term31737.getClass(), "data", term31738);
        setIntField(term31737, term31737.getClass(), "threshold", 12);
        setIntField(term31737, term31737.getClass(), "modCount", 2);
        setField(term31737, term31737.getClass(), "entrySet", null);
        setField(term31737, term31737.getClass(), "keySet", null);
        setField(term31737, term31737.getClass(), "values", null);
        setField(term31737, term31737.getClass(), "keySet", null);
        setField(term31737, term31737.getClass(), "values", null);
        setField(term31736, term31736.getClass(), "delegateMap", term31737);
        term31742 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term31743 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term31744 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term31745 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term31746 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term31747 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term31742, term31742.getClass(), "size", 0);
        setIntField(term31742, term31742.getClass(), "hash1", 0);
        setIntField(term31742, term31742.getClass(), "hash2", 0);
        setIntField(term31742, term31742.getClass(), "hash3", 0);
        setField(term31742, term31742.getClass(), "key1", null);
        setField(term31742, term31742.getClass(), "key2", null);
        setField(term31742, term31742.getClass(), "key3", null);
        setField(term31742, term31742.getClass(), "value1", null);
        setField(term31742, term31742.getClass(), "value2", null);
        setField(term31742, term31742.getClass(), "value3", null);
        setFloatField(term31743, term31743.getClass(), "loadFactor", 0.75F);
        setIntField(term31743, term31743.getClass(), "size", 2);
        setField(term31745, term31745.getClass(), "next", null);
        setField(term31745, term31745.getClass(), "key", term31742);
        setField(term31745, term31745.getClass(), "value", null);
        setElement(term31744, 0, term31745);
        setField(term31746, term31746.getClass(), "next", null);
        setField(term31746, term31746.getClass(), "key", term31747);
        setField(term31746, term31746.getClass(), "value", null);
        setElement(term31744, 5, term31746);
        setField(term31743, term31743.getClass(), "data", term31744);
        setIntField(term31743, term31743.getClass(), "threshold", 12);
        setIntField(term31743, term31743.getClass(), "modCount", 2);
        setField(term31743, term31743.getClass(), "entrySet", null);
        setField(term31743, term31743.getClass(), "keySet", null);
        setField(term31743, term31743.getClass(), "values", null);
        setField(term31743, term31743.getClass(), "keySet", null);
        setField(term31743, term31743.getClass(), "values", null);
        setField(term31742, term31742.getClass(), "delegateMap", term31743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term31003;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term31003, args);
        assertTrue(recursiveEquals(term31003, term31736));
        assertTrue(recursiveEquals(term31003, term31742));
        assertTrue(recursiveEquals(retValue, null));
    }

};


