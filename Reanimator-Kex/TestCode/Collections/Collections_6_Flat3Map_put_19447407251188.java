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
import java.lang.Object;

public class Flat3Map_put_19447407251188 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371934;
     Object term372438;

    public Flat3Map_put_19447407251188() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371934 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term372026 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term372140 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        Object term372232 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term372346 = newInstance(Class.forName("org.apache.commons.collections.iterators.EmptyIterator"));
        setField(term371934, term371934.getClass(), "delegateMap", null);
        setIntField(term371934, term371934.getClass(), "size", 3);
        setIntField(term371934, term371934.getClass(), "hash3", 0);
        setField(term371934, term371934.getClass(), "key3", null);
        setIntField(term371934, term371934.getClass(), "hash2", 0);
        setField(term372026, term372026.getClass(), "delegateMap", null);
        setIntField(term372026, term372026.getClass(), "size", 3);
        setField(term372026, term372026.getClass(), "key3", term372140);
        setField(term372026, term372026.getClass(), "key2", term372140);
        setField(term372026, term372026.getClass(), "key1", null);
        setField(term372026, term372026.getClass(), "value1", null);
        setIntField(term372026, term372026.getClass(), "hash3", -1);
        setIntField(term372026, term372026.getClass(), "hash2", -1);
        setIntField(term372026, term372026.getClass(), "hash1", -1);
        setField(term371934, term371934.getClass(), "key2", term372026);
        setIntField(term371934, term371934.getClass(), "hash1", 0);
        setField(term372232, term372232.getClass(), "delegateMap", null);
        setIntField(term372232, term372232.getClass(), "size", 3);
        setField(term372232, term372232.getClass(), "key3", term372346);
        setField(term372232, term372232.getClass(), "key2", term372346);
        setField(term372232, term372232.getClass(), "key1", null);
        setField(term372232, term372232.getClass(), "value1", null);
        setField(term371934, term371934.getClass(), "key1", term372232);
        term372438 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term372548 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term372616 = newInstance(Class.forName("java.lang.reflect.ReflectAccess"));
        setField(term372438, term372438.getClass(), "delegateMap", null);
        setIntField(term372438, term372438.getClass(), "size", 3);
        setIntField(term372438, term372438.getClass(), "hash3", 0);
        setField(term372438, term372438.getClass(), "value3", null);
        setIntField(term372438, term372438.getClass(), "hash2", 0);
        setIntField(term372548, term372548.getClass(), "size", 0);
        setField(term372438, term372438.getClass(), "value2", term372548);
        setIntField(term372438, term372438.getClass(), "hash1", 0);
        setField(term372438, term372438.getClass(), "value1", null);
        setField(term372438, term372438.getClass(), "key3", null);
        setField(term372438, term372438.getClass(), "key2", term372616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term372438;
        args[1] = null;
        callMethod(klass, "put", argTypes, term371934, args);
    }

};


