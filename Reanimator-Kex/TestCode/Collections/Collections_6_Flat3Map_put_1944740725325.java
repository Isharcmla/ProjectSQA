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

public class Flat3Map_put_1944740725325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54281;
     Object term54344;
     Object term54346;

    public Flat3Map_put_1944740725325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54281 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term54316 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setField(term54281, term54281.getClass(), "delegateMap", null);
        setIntField(term54281, term54281.getClass(), "size", 1);
        setIntField(term54281, term54281.getClass(), "hash1", 0);
        setField(term54281, term54281.getClass(), "value1", term54316);
        term54344 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term54345 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setIntField(term54344, term54344.getClass(), "size", 2);
        setIntField(term54344, term54344.getClass(), "hash1", 0);
        setIntField(term54344, term54344.getClass(), "hash2", 798110732);
        setIntField(term54344, term54344.getClass(), "hash3", 0);
        setField(term54344, term54344.getClass(), "key1", null);
        setField(term54344, term54344.getClass(), "key2", term54344);
        setField(term54344, term54344.getClass(), "key3", null);
        setField(term54345, term54345.getClass(), "this$1", null);
        setField(term54345, term54345.getClass(), "downstream", null);
        setField(term54344, term54344.getClass(), "value1", term54345);
        setField(term54344, term54344.getClass(), "value2", null);
        setField(term54344, term54344.getClass(), "value3", null);
        setField(term54344, term54344.getClass(), "delegateMap", null);
        term54346 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term54347 = newInstance(Class.forName("java.util.stream.IntPipeline$1$1"));
        setIntField(term54346, term54346.getClass(), "size", 2);
        setIntField(term54346, term54346.getClass(), "hash1", 0);
        setIntField(term54346, term54346.getClass(), "hash2", 798110732);
        setIntField(term54346, term54346.getClass(), "hash3", 0);
        setField(term54346, term54346.getClass(), "key1", null);
        setField(term54346, term54346.getClass(), "key2", term54346);
        setField(term54346, term54346.getClass(), "key3", null);
        setField(term54347, term54347.getClass(), "this$1", null);
        setField(term54347, term54347.getClass(), "downstream", null);
        setField(term54346, term54346.getClass(), "value1", term54347);
        setField(term54346, term54346.getClass(), "value2", null);
        setField(term54346, term54346.getClass(), "value3", null);
        setField(term54346, term54346.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term54281;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term54281, args);
        assertTrue(recursiveEquals(term54281, term54344));
        assertTrue(recursiveEquals(term54281, term54346));
        assertTrue(recursiveEquals(retValue, null));
    }

};


