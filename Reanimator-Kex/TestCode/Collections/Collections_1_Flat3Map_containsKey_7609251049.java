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

public class Flat3Map_containsKey_7609251049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13914;
     Object term13923;

    public Flat3Map_containsKey_7609251049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13914 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term13914, term13914.getClass(), "delegateMap", null);
        term13923 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term13923, term13923.getClass(), "size", 0);
        setIntField(term13923, term13923.getClass(), "hash1", 0);
        setIntField(term13923, term13923.getClass(), "hash2", 0);
        setIntField(term13923, term13923.getClass(), "hash3", 0);
        setField(term13923, term13923.getClass(), "key1", null);
        setField(term13923, term13923.getClass(), "key2", null);
        setField(term13923, term13923.getClass(), "key3", null);
        setField(term13923, term13923.getClass(), "value1", null);
        setField(term13923, term13923.getClass(), "value2", null);
        setField(term13923, term13923.getClass(), "value3", null);
        setField(term13923, term13923.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsKey", argTypes, term13914, args);
        assertTrue(recursiveEquals(term13914, term13923));
    }

};
