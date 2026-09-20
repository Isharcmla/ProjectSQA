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

public class Flat3Map_remove_8406902791041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208389;
     Object term208465;
     Object term208479;
     Object term208480;

    public Flat3Map_remove_8406902791041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208389 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term208389, term208389.getClass(), "delegateMap", null);
        setIntField(term208389, term208389.getClass(), "size", 3);
        setIntField(term208389, term208389.getClass(), "hash3", -1);
        setIntField(term208389, term208389.getClass(), "hash2", 0);
        term208465 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        term208479 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term208479, term208479.getClass(), "size", 3);
        setIntField(term208479, term208479.getClass(), "hash1", 0);
        setIntField(term208479, term208479.getClass(), "hash2", 0);
        setIntField(term208479, term208479.getClass(), "hash3", -1);
        setField(term208479, term208479.getClass(), "key1", null);
        setField(term208479, term208479.getClass(), "key2", null);
        setField(term208479, term208479.getClass(), "key3", null);
        setField(term208479, term208479.getClass(), "value1", null);
        setField(term208479, term208479.getClass(), "value2", null);
        setField(term208479, term208479.getClass(), "value3", null);
        setField(term208479, term208479.getClass(), "delegateMap", null);
        term208480 = newInstance(Class.forName("java.util.stream.DoublePipeline$3$1"));
        setField(term208480, term208480.getClass(), "this$1", null);
        setField(term208480, term208480.getClass(), "downstream", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term208465;
        Object retValue = callMethod(klass, "remove", argTypes, term208389, args);
        assertTrue(recursiveEquals(term208389, term208479));
        assertTrue(recursiveEquals(term208465, term208480));
        assertTrue(recursiveEquals(retValue, null));
    }

};
