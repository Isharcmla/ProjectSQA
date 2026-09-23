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

public class Flat3Map_put_1944740725372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63909;
     Object term64411;
     Object term64413;

    public Flat3Map_put_1944740725372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63909 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term63967 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setField(term63909, term63909.getClass(), "delegateMap", null);
        setIntField(term63909, term63909.getClass(), "size", 1);
        setIntField(term63909, term63909.getClass(), "hash1", 0);
        setField(term63909, term63909.getClass(), "value1", term63967);
        term64411 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64412 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setIntField(term64411, term64411.getClass(), "size", 2);
        setIntField(term64411, term64411.getClass(), "hash1", 0);
        setIntField(term64411, term64411.getClass(), "hash2", 1770287551);
        setIntField(term64411, term64411.getClass(), "hash3", 0);
        setField(term64411, term64411.getClass(), "key1", null);
        setField(term64411, term64411.getClass(), "key2", term64411);
        setField(term64411, term64411.getClass(), "key3", null);
        setField(term64412, term64412.getClass(), "runnable", null);
        setIntField(term64412, term64412.getClass(), "status", 0);
        setField(term64411, term64411.getClass(), "value1", term64412);
        setField(term64411, term64411.getClass(), "value2", null);
        setField(term64411, term64411.getClass(), "value3", null);
        setField(term64411, term64411.getClass(), "delegateMap", null);
        term64413 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term64414 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setIntField(term64413, term64413.getClass(), "size", 2);
        setIntField(term64413, term64413.getClass(), "hash1", 0);
        setIntField(term64413, term64413.getClass(), "hash2", 1770287551);
        setIntField(term64413, term64413.getClass(), "hash3", 0);
        setField(term64413, term64413.getClass(), "key1", null);
        setField(term64413, term64413.getClass(), "key2", term64413);
        setField(term64413, term64413.getClass(), "key3", null);
        setField(term64414, term64414.getClass(), "runnable", null);
        setIntField(term64414, term64414.getClass(), "status", 0);
        setField(term64413, term64413.getClass(), "value1", term64414);
        setField(term64413, term64413.getClass(), "value2", null);
        setField(term64413, term64413.getClass(), "value3", null);
        setField(term64413, term64413.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term63909;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term63909, args);
        assertTrue(recursiveEquals(term63909, term64411));
        assertTrue(recursiveEquals(term63909, term64413));
        assertTrue(recursiveEquals(retValue, null));
    }

};


