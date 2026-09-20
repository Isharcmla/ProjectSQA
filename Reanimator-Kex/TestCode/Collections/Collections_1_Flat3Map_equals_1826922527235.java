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

public class Flat3Map_equals_1826922527235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40804;
     Object term40896;
     Object term41002;
     Object term41003;

    public Flat3Map_equals_1826922527235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40804 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term40804, term40804.getClass(), "delegateMap", null);
        setIntField(term40804, term40804.getClass(), "size", 2);
        term40896 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term40896, term40896.getClass(), "delegateMap", null);
        setIntField(term40896, term40896.getClass(), "size", 2);
        term41002 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term41002, term41002.getClass(), "size", 2);
        setIntField(term41002, term41002.getClass(), "hash1", 0);
        setIntField(term41002, term41002.getClass(), "hash2", 0);
        setIntField(term41002, term41002.getClass(), "hash3", 0);
        setField(term41002, term41002.getClass(), "key1", null);
        setField(term41002, term41002.getClass(), "key2", null);
        setField(term41002, term41002.getClass(), "key3", null);
        setField(term41002, term41002.getClass(), "value1", null);
        setField(term41002, term41002.getClass(), "value2", null);
        setField(term41002, term41002.getClass(), "value3", null);
        setField(term41002, term41002.getClass(), "delegateMap", null);
        term41003 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term41003, term41003.getClass(), "size", 2);
        setIntField(term41003, term41003.getClass(), "hash1", 0);
        setIntField(term41003, term41003.getClass(), "hash2", 0);
        setIntField(term41003, term41003.getClass(), "hash3", 0);
        setField(term41003, term41003.getClass(), "key1", null);
        setField(term41003, term41003.getClass(), "key2", null);
        setField(term41003, term41003.getClass(), "key3", null);
        setField(term41003, term41003.getClass(), "value1", null);
        setField(term41003, term41003.getClass(), "value2", null);
        setField(term41003, term41003.getClass(), "value3", null);
        setField(term41003, term41003.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term40896;
        Object retValue = callMethod(klass, "equals", argTypes, term40804, args);
        assertTrue(recursiveEquals(term40804, term41002));
        assertTrue(recursiveEquals(term40896, term41003));
        assertTrue(recursiveEquals(retValue, true));
    }

};
