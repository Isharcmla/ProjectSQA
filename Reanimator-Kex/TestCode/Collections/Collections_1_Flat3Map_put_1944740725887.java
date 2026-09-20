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

public class Flat3Map_put_1944740725887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178603;
     Object term179732;
     Object term179737;

    public Flat3Map_put_1944740725887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178603 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term178649 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term178603, term178603.getClass(), "delegateMap", null);
        setIntField(term178603, term178603.getClass(), "size", 3);
        setIntField(term178603, term178603.getClass(), "hash3", 0);
        setField(term178603, term178603.getClass(), "value3", null);
        setIntField(term178603, term178603.getClass(), "hash2", 0);
        setField(term178603, term178603.getClass(), "value2", null);
        setIntField(term178603, term178603.getClass(), "hash1", 0);
        setField(term178603, term178603.getClass(), "value1", null);
        setField(term178603, term178603.getClass(), "key3", term178649);
        term179732 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179733 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term179734 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term179735 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term179736 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term179732, term179732.getClass(), "size", 0);
        setIntField(term179732, term179732.getClass(), "hash1", 0);
        setIntField(term179732, term179732.getClass(), "hash2", 0);
        setIntField(term179732, term179732.getClass(), "hash3", 0);
        setField(term179732, term179732.getClass(), "key1", null);
        setField(term179732, term179732.getClass(), "key2", null);
        setField(term179732, term179732.getClass(), "key3", null);
        setField(term179732, term179732.getClass(), "value1", null);
        setField(term179732, term179732.getClass(), "value2", null);
        setField(term179732, term179732.getClass(), "value3", null);
        setFloatField(term179733, term179733.getClass(), "loadFactor", 0.75F);
        setIntField(term179733, term179733.getClass(), "size", 3);
        setField(term179736, term179736.getClass(), "next", null);
        setField(term179736, term179736.getClass(), "key", null);
        setField(term179736, term179736.getClass(), "value", null);
        setField(term179735, term179735.getClass(), "next", term179736);
        setField(term179735, term179735.getClass(), "key", term179732);
        setField(term179735, term179735.getClass(), "value", null);
        setElement(term179734, 0, term179735);
        setField(term179733, term179733.getClass(), "data", term179734);
        setIntField(term179733, term179733.getClass(), "threshold", 12);
        setIntField(term179733, term179733.getClass(), "modCount", 3);
        setField(term179733, term179733.getClass(), "entrySet", null);
        setField(term179733, term179733.getClass(), "keySet", null);
        setField(term179733, term179733.getClass(), "values", null);
        setField(term179733, term179733.getClass(), "keySet", null);
        setField(term179733, term179733.getClass(), "values", null);
        setField(term179732, term179732.getClass(), "delegateMap", term179733);
        term179737 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term179738 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term179739 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term179740 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term179741 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setIntField(term179737, term179737.getClass(), "size", 0);
        setIntField(term179737, term179737.getClass(), "hash1", 0);
        setIntField(term179737, term179737.getClass(), "hash2", 0);
        setIntField(term179737, term179737.getClass(), "hash3", 0);
        setField(term179737, term179737.getClass(), "key1", null);
        setField(term179737, term179737.getClass(), "key2", null);
        setField(term179737, term179737.getClass(), "key3", null);
        setField(term179737, term179737.getClass(), "value1", null);
        setField(term179737, term179737.getClass(), "value2", null);
        setField(term179737, term179737.getClass(), "value3", null);
        setFloatField(term179738, term179738.getClass(), "loadFactor", 0.75F);
        setIntField(term179738, term179738.getClass(), "size", 3);
        setField(term179741, term179741.getClass(), "next", null);
        setField(term179741, term179741.getClass(), "key", null);
        setField(term179741, term179741.getClass(), "value", null);
        setField(term179740, term179740.getClass(), "next", term179741);
        setField(term179740, term179740.getClass(), "key", term179737);
        setField(term179740, term179740.getClass(), "value", null);
        setElement(term179739, 0, term179740);
        setField(term179738, term179738.getClass(), "data", term179739);
        setIntField(term179738, term179738.getClass(), "threshold", 12);
        setIntField(term179738, term179738.getClass(), "modCount", 3);
        setField(term179738, term179738.getClass(), "entrySet", null);
        setField(term179738, term179738.getClass(), "keySet", null);
        setField(term179738, term179738.getClass(), "values", null);
        setField(term179738, term179738.getClass(), "keySet", null);
        setField(term179738, term179738.getClass(), "values", null);
        setField(term179737, term179737.getClass(), "delegateMap", term179738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term178603;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term178603, args);
        assertTrue(recursiveEquals(term178603, term179732));
        assertTrue(recursiveEquals(term178603, term179737));
        assertTrue(recursiveEquals(retValue, null));
    }

};
