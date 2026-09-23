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

public class Flat3Map_containsKey_76092510158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26948;
     Object term27241;

    public Flat3Map_containsKey_76092510158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26948 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term27040 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term26948, term26948.getClass(), "delegateMap", null);
        setIntField(term26948, term26948.getClass(), "size", 3);
        setField(term26948, term26948.getClass(), "key3", term27040);
        term27241 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term27242 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term27241, term27241.getClass(), "size", 3);
        setIntField(term27241, term27241.getClass(), "hash1", 0);
        setIntField(term27241, term27241.getClass(), "hash2", 0);
        setIntField(term27241, term27241.getClass(), "hash3", 0);
        setField(term27241, term27241.getClass(), "key1", null);
        setField(term27241, term27241.getClass(), "key2", null);
        setIntField(term27242, term27242.getClass(), "size", 0);
        setIntField(term27242, term27242.getClass(), "hash1", 0);
        setIntField(term27242, term27242.getClass(), "hash2", 0);
        setIntField(term27242, term27242.getClass(), "hash3", 0);
        setField(term27242, term27242.getClass(), "key1", null);
        setField(term27242, term27242.getClass(), "key2", null);
        setField(term27242, term27242.getClass(), "key3", null);
        setField(term27242, term27242.getClass(), "value1", null);
        setField(term27242, term27242.getClass(), "value2", null);
        setField(term27242, term27242.getClass(), "value3", null);
        setField(term27242, term27242.getClass(), "delegateMap", null);
        setField(term27241, term27241.getClass(), "key3", term27242);
        setField(term27241, term27241.getClass(), "value1", null);
        setField(term27241, term27241.getClass(), "value2", null);
        setField(term27241, term27241.getClass(), "value3", null);
        setField(term27241, term27241.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "containsKey", argTypes, term26948, args);
        assertTrue(recursiveEquals(term26948, term27241));
    }

};


