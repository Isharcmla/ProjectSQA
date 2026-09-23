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

public class Flat3Map_containsKey_76092510132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23222;
     Object term23314;
     Object term23881;
     Object term23882;

    public Flat3Map_containsKey_76092510132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23222 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term23222, term23222.getClass(), "delegateMap", null);
        term23314 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term23881 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term23881, term23881.getClass(), "size", 0);
        setIntField(term23881, term23881.getClass(), "hash1", 0);
        setIntField(term23881, term23881.getClass(), "hash2", 0);
        setIntField(term23881, term23881.getClass(), "hash3", 0);
        setField(term23881, term23881.getClass(), "key1", null);
        setField(term23881, term23881.getClass(), "key2", null);
        setField(term23881, term23881.getClass(), "key3", null);
        setField(term23881, term23881.getClass(), "value1", null);
        setField(term23881, term23881.getClass(), "value2", null);
        setField(term23881, term23881.getClass(), "value3", null);
        setField(term23881, term23881.getClass(), "delegateMap", null);
        term23882 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term23882, term23882.getClass(), "size", 0);
        setIntField(term23882, term23882.getClass(), "hash1", 0);
        setIntField(term23882, term23882.getClass(), "hash2", 0);
        setIntField(term23882, term23882.getClass(), "hash3", 0);
        setField(term23882, term23882.getClass(), "key1", null);
        setField(term23882, term23882.getClass(), "key2", null);
        setField(term23882, term23882.getClass(), "key3", null);
        setField(term23882, term23882.getClass(), "value1", null);
        setField(term23882, term23882.getClass(), "value2", null);
        setField(term23882, term23882.getClass(), "value3", null);
        setField(term23882, term23882.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23314;
        callMethod(klass, "containsKey", argTypes, term23222, args);
        assertTrue(recursiveEquals(term23222, term23881));
        assertTrue(recursiveEquals(term23314, term23882));
    }

};


