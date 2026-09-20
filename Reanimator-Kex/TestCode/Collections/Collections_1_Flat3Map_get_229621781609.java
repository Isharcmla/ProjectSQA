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

public class Flat3Map_get_229621781609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117425;
     Object term117531;
     Object term117533;

    public Flat3Map_get_229621781609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117425 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117480 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term117425, term117425.getClass(), "delegateMap", null);
        setIntField(term117425, term117425.getClass(), "size", 2);
        setIntField(term117425, term117425.getClass(), "hash2", 0);
        setIntField(term117480, term117480.getClass(), "size", 0);
        setField(term117425, term117425.getClass(), "value2", term117480);
        setIntField(term117425, term117425.getClass(), "hash1", 0);
        setField(term117425, term117425.getClass(), "value1", null);
        setField(term117425, term117425.getClass(), "key2", null);
        setField(term117425, term117425.getClass(), "key1", term117425);
        term117531 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117532 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term117531, term117531.getClass(), "size", 2);
        setIntField(term117531, term117531.getClass(), "hash1", 0);
        setIntField(term117531, term117531.getClass(), "hash2", 0);
        setIntField(term117531, term117531.getClass(), "hash3", 0);
        setField(term117531, term117531.getClass(), "key1", term117531);
        setField(term117531, term117531.getClass(), "key2", null);
        setField(term117531, term117531.getClass(), "key3", null);
        setField(term117531, term117531.getClass(), "value1", null);
        setFloatField(term117532, term117532.getClass(), "loadFactor", 0.0F);
        setIntField(term117532, term117532.getClass(), "size", 0);
        setField(term117532, term117532.getClass(), "data", null);
        setIntField(term117532, term117532.getClass(), "threshold", 0);
        setIntField(term117532, term117532.getClass(), "modCount", 0);
        setField(term117532, term117532.getClass(), "entrySet", null);
        setField(term117532, term117532.getClass(), "keySet", null);
        setField(term117532, term117532.getClass(), "values", null);
        setField(term117532, term117532.getClass(), "keySet", null);
        setField(term117532, term117532.getClass(), "values", null);
        setField(term117531, term117531.getClass(), "value2", term117532);
        setField(term117531, term117531.getClass(), "value3", null);
        setField(term117531, term117531.getClass(), "delegateMap", null);
        term117533 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term117534 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setIntField(term117533, term117533.getClass(), "size", 2);
        setIntField(term117533, term117533.getClass(), "hash1", 0);
        setIntField(term117533, term117533.getClass(), "hash2", 0);
        setIntField(term117533, term117533.getClass(), "hash3", 0);
        setField(term117533, term117533.getClass(), "key1", term117533);
        setField(term117533, term117533.getClass(), "key2", null);
        setField(term117533, term117533.getClass(), "key3", null);
        setField(term117533, term117533.getClass(), "value1", null);
        setFloatField(term117534, term117534.getClass(), "loadFactor", 0.0F);
        setIntField(term117534, term117534.getClass(), "size", 0);
        setField(term117534, term117534.getClass(), "data", null);
        setIntField(term117534, term117534.getClass(), "threshold", 0);
        setIntField(term117534, term117534.getClass(), "modCount", 0);
        setField(term117534, term117534.getClass(), "entrySet", null);
        setField(term117534, term117534.getClass(), "keySet", null);
        setField(term117534, term117534.getClass(), "values", null);
        setField(term117534, term117534.getClass(), "keySet", null);
        setField(term117534, term117534.getClass(), "values", null);
        setField(term117533, term117533.getClass(), "value2", term117534);
        setField(term117533, term117533.getClass(), "value3", null);
        setField(term117533, term117533.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term117425;
        Object retValue = callMethod(klass, "get", argTypes, term117425, args);
        assertTrue(recursiveEquals(term117425, term117531));
        assertTrue(recursiveEquals(term117425, term117533));
        assertTrue(recursiveEquals(retValue, null));
    }

};
