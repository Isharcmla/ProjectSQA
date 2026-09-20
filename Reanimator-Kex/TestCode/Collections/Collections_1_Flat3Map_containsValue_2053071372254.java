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

public class Flat3Map_containsValue_2053071372254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44630;
     Object term44825;
     Object term44827;

    public Flat3Map_containsValue_2053071372254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44630 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term44676 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term44630, term44630.getClass(), "delegateMap", null);
        setIntField(term44630, term44630.getClass(), "size", 3);
        setField(term44630, term44630.getClass(), "value3", term44676);
        term44825 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term44826 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44825, term44825.getClass(), "size", 3);
        setIntField(term44825, term44825.getClass(), "hash1", 0);
        setIntField(term44825, term44825.getClass(), "hash2", 0);
        setIntField(term44825, term44825.getClass(), "hash3", 0);
        setField(term44825, term44825.getClass(), "key1", null);
        setField(term44825, term44825.getClass(), "key2", null);
        setField(term44825, term44825.getClass(), "key3", null);
        setField(term44825, term44825.getClass(), "value1", null);
        setField(term44825, term44825.getClass(), "value2", null);
        setIntField(term44826, term44826.getClass(), "size", 0);
        setIntField(term44826, term44826.getClass(), "hash1", 0);
        setIntField(term44826, term44826.getClass(), "hash2", 0);
        setIntField(term44826, term44826.getClass(), "hash3", 0);
        setField(term44826, term44826.getClass(), "key1", null);
        setField(term44826, term44826.getClass(), "key2", null);
        setField(term44826, term44826.getClass(), "key3", null);
        setField(term44826, term44826.getClass(), "value1", null);
        setField(term44826, term44826.getClass(), "value2", null);
        setField(term44826, term44826.getClass(), "value3", null);
        setField(term44826, term44826.getClass(), "delegateMap", null);
        setField(term44825, term44825.getClass(), "value3", term44826);
        setField(term44825, term44825.getClass(), "delegateMap", null);
        term44827 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term44828 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term44827, term44827.getClass(), "size", 3);
        setIntField(term44827, term44827.getClass(), "hash1", 0);
        setIntField(term44827, term44827.getClass(), "hash2", 0);
        setIntField(term44827, term44827.getClass(), "hash3", 0);
        setField(term44827, term44827.getClass(), "key1", null);
        setField(term44827, term44827.getClass(), "key2", null);
        setField(term44827, term44827.getClass(), "key3", null);
        setField(term44827, term44827.getClass(), "value1", null);
        setField(term44827, term44827.getClass(), "value2", null);
        setIntField(term44828, term44828.getClass(), "size", 0);
        setIntField(term44828, term44828.getClass(), "hash1", 0);
        setIntField(term44828, term44828.getClass(), "hash2", 0);
        setIntField(term44828, term44828.getClass(), "hash3", 0);
        setField(term44828, term44828.getClass(), "key1", null);
        setField(term44828, term44828.getClass(), "key2", null);
        setField(term44828, term44828.getClass(), "key3", null);
        setField(term44828, term44828.getClass(), "value1", null);
        setField(term44828, term44828.getClass(), "value2", null);
        setField(term44828, term44828.getClass(), "value3", null);
        setField(term44828, term44828.getClass(), "delegateMap", null);
        setField(term44827, term44827.getClass(), "value3", term44828);
        setField(term44827, term44827.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term44630;
        callMethod(klass, "containsValue", argTypes, term44630, args);
        assertTrue(recursiveEquals(term44630, term44825));
        assertTrue(recursiveEquals(term44630, term44827));
    }

};
