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

public class Flat3Map_containsValue_2053071372156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27108;
     Object term27200;
     Object term27333;
     Object term27334;

    public Flat3Map_containsValue_2053071372156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27108 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term27108, term27108.getClass(), "delegateMap", null);
        setIntField(term27108, term27108.getClass(), "size", 3);
        term27200 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term27333 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27333, term27333.getClass(), "size", 3);
        setIntField(term27333, term27333.getClass(), "hash1", 0);
        setIntField(term27333, term27333.getClass(), "hash2", 0);
        setIntField(term27333, term27333.getClass(), "hash3", 0);
        setField(term27333, term27333.getClass(), "key1", null);
        setField(term27333, term27333.getClass(), "key2", null);
        setField(term27333, term27333.getClass(), "key3", null);
        setField(term27333, term27333.getClass(), "value1", null);
        setField(term27333, term27333.getClass(), "value2", null);
        setField(term27333, term27333.getClass(), "value3", null);
        setField(term27333, term27333.getClass(), "delegateMap", null);
        term27334 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27334, term27334.getClass(), "size", 0);
        setIntField(term27334, term27334.getClass(), "hash1", 0);
        setIntField(term27334, term27334.getClass(), "hash2", 0);
        setIntField(term27334, term27334.getClass(), "hash3", 0);
        setField(term27334, term27334.getClass(), "key1", null);
        setField(term27334, term27334.getClass(), "key2", null);
        setField(term27334, term27334.getClass(), "key3", null);
        setField(term27334, term27334.getClass(), "value1", null);
        setField(term27334, term27334.getClass(), "value2", null);
        setField(term27334, term27334.getClass(), "value3", null);
        setField(term27334, term27334.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27200;
        callMethod(klass, "containsValue", argTypes, term27108, args);
        assertTrue(recursiveEquals(term27108, term27333));
        assertTrue(recursiveEquals(term27200, term27334));
    }

};
