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

public class Flat3Map_put_1944740725264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42982;
     Object term43074;
     Object term43601;
     Object term43608;

    public Flat3Map_put_1944740725264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42982 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term42982, term42982.getClass(), "delegateMap", null);
        setIntField(term42982, term42982.getClass(), "size", 3);
        setIntField(term42982, term42982.getClass(), "hash3", 0);
        setField(term42982, term42982.getClass(), "key3", null);
        setIntField(term42982, term42982.getClass(), "hash2", -1);
        term43074 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term43074, term43074.getClass(), "delegateMap", null);
        setIntField(term43074, term43074.getClass(), "size", 3);
        setIntField(term43074, term43074.getClass(), "hash3", 0);
        setField(term43074, term43074.getClass(), "value3", null);
        setIntField(term43074, term43074.getClass(), "hash2", 0);
        setField(term43074, term43074.getClass(), "value2", null);
        setIntField(term43074, term43074.getClass(), "hash1", 0);
        setField(term43074, term43074.getClass(), "value1", null);
        term43601 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43602 = newInstance(Class.forName("org.apache.commons.collections.map.HashedMap"));
        Object[] term43603 = (Object[]) newArray("org.apache.commons.collections.map.AbstractHashedMap$HashEntry", 16);
        Object term43604 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term43605 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term43606 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        Object term43607 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term43601, term43601.getClass(), "size", 0);
        setIntField(term43601, term43601.getClass(), "hash1", 0);
        setIntField(term43601, term43601.getClass(), "hash2", 0);
        setIntField(term43601, term43601.getClass(), "hash3", 0);
        setField(term43601, term43601.getClass(), "key1", null);
        setField(term43601, term43601.getClass(), "key2", null);
        setField(term43601, term43601.getClass(), "key3", null);
        setField(term43601, term43601.getClass(), "value1", null);
        setField(term43601, term43601.getClass(), "value2", null);
        setField(term43601, term43601.getClass(), "value3", null);
        setFloatField(term43602, term43602.getClass(), "loadFactor", 0.75F);
        setIntField(term43602, term43602.getClass(), "size", 2);
        setField(term43604, term43604.getClass(), "next", null);
        setIntField(term43605, term43605.getClass(), "size", 3);
        setIntField(term43605, term43605.getClass(), "hash1", 0);
        setIntField(term43605, term43605.getClass(), "hash2", 0);
        setIntField(term43605, term43605.getClass(), "hash3", 0);
        setField(term43605, term43605.getClass(), "key1", null);
        setField(term43605, term43605.getClass(), "key2", null);
        setField(term43605, term43605.getClass(), "key3", null);
        setField(term43605, term43605.getClass(), "value1", null);
        setField(term43605, term43605.getClass(), "value2", null);
        setField(term43605, term43605.getClass(), "value3", null);
        setField(term43605, term43605.getClass(), "delegateMap", null);
        setField(term43604, term43604.getClass(), "key", term43605);
        setField(term43604, term43604.getClass(), "value", null);
        setElement(term43603, 0, term43604);
        setField(term43606, term43606.getClass(), "next", null);
        setField(term43606, term43606.getClass(), "key", term43607);
        setField(term43606, term43606.getClass(), "value", null);
        setElement(term43603, 5, term43606);
        setField(term43602, term43602.getClass(), "data", term43603);
        setIntField(term43602, term43602.getClass(), "threshold", 12);
        setIntField(term43602, term43602.getClass(), "modCount", 2);
        setField(term43602, term43602.getClass(), "entrySet", null);
        setField(term43602, term43602.getClass(), "keySet", null);
        setField(term43602, term43602.getClass(), "values", null);
        setField(term43602, term43602.getClass(), "keySet", null);
        setField(term43602, term43602.getClass(), "values", null);
        setField(term43601, term43601.getClass(), "delegateMap", term43602);
        term43608 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term43608, term43608.getClass(), "size", 3);
        setIntField(term43608, term43608.getClass(), "hash1", 0);
        setIntField(term43608, term43608.getClass(), "hash2", 0);
        setIntField(term43608, term43608.getClass(), "hash3", 0);
        setField(term43608, term43608.getClass(), "key1", null);
        setField(term43608, term43608.getClass(), "key2", null);
        setField(term43608, term43608.getClass(), "key3", null);
        setField(term43608, term43608.getClass(), "value1", null);
        setField(term43608, term43608.getClass(), "value2", null);
        setField(term43608, term43608.getClass(), "value3", null);
        setField(term43608, term43608.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term43074;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term42982, args);
        assertTrue(recursiveEquals(term42982, term43601));
        assertTrue(recursiveEquals(term43074, term43608));
        assertTrue(recursiveEquals(retValue, null));
    }

};


