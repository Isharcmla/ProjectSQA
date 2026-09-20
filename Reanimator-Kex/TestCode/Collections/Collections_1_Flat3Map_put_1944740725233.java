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

public class Flat3Map_put_1944740725233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40262;
     Object term40911;

    public Flat3Map_put_1944740725233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40262 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term40354 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term40262, term40262.getClass(), "delegateMap", null);
        setIntField(term40262, term40262.getClass(), "size", 2);
        setField(term40262, term40262.getClass(), "key2", term40354);
        term40911 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term40912 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term40911, term40911.getClass(), "size", 2);
        setIntField(term40911, term40911.getClass(), "hash1", 0);
        setIntField(term40911, term40911.getClass(), "hash2", 0);
        setIntField(term40911, term40911.getClass(), "hash3", 0);
        setField(term40911, term40911.getClass(), "key1", null);
        setIntField(term40912, term40912.getClass(), "size", 0);
        setIntField(term40912, term40912.getClass(), "hash1", 0);
        setIntField(term40912, term40912.getClass(), "hash2", 0);
        setIntField(term40912, term40912.getClass(), "hash3", 0);
        setField(term40912, term40912.getClass(), "key1", null);
        setField(term40912, term40912.getClass(), "key2", null);
        setField(term40912, term40912.getClass(), "key3", null);
        setField(term40912, term40912.getClass(), "value1", null);
        setField(term40912, term40912.getClass(), "value2", null);
        setField(term40912, term40912.getClass(), "value3", null);
        setField(term40912, term40912.getClass(), "delegateMap", null);
        setField(term40911, term40911.getClass(), "key2", term40912);
        setField(term40911, term40911.getClass(), "key3", null);
        setField(term40911, term40911.getClass(), "value1", null);
        setField(term40911, term40911.getClass(), "value2", null);
        setField(term40911, term40911.getClass(), "value3", null);
        setField(term40911, term40911.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term40262, args);
        assertTrue(recursiveEquals(term40262, term40911));
        assertTrue(recursiveEquals(retValue, null));
    }

};
