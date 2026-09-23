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

public class Flat3Map_put_19447407251038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295733;
     Object term297144;
     Object term297146;

    public Flat3Map_put_19447407251038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term295733 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term295791 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setField(term295733, term295733.getClass(), "delegateMap", null);
        setIntField(term295733, term295733.getClass(), "size", 1);
        setIntField(term295733, term295733.getClass(), "hash1", 0);
        setField(term295733, term295733.getClass(), "value1", term295791);
        term297144 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term297145 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setIntField(term297144, term297144.getClass(), "size", 2);
        setIntField(term297144, term297144.getClass(), "hash1", 0);
        setIntField(term297144, term297144.getClass(), "hash2", 430852972);
        setIntField(term297144, term297144.getClass(), "hash3", 0);
        setField(term297144, term297144.getClass(), "key1", null);
        setField(term297144, term297144.getClass(), "key2", term297144);
        setField(term297144, term297144.getClass(), "key3", null);
        setField(term297145, term297145.getClass(), "runnable", null);
        setIntField(term297145, term297145.getClass(), "status", 0);
        setField(term297144, term297144.getClass(), "value1", term297145);
        setField(term297144, term297144.getClass(), "value2", null);
        setField(term297144, term297144.getClass(), "value3", null);
        setField(term297144, term297144.getClass(), "delegateMap", null);
        term297146 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term297147 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setIntField(term297146, term297146.getClass(), "size", 2);
        setIntField(term297146, term297146.getClass(), "hash1", 0);
        setIntField(term297146, term297146.getClass(), "hash2", 430852972);
        setIntField(term297146, term297146.getClass(), "hash3", 0);
        setField(term297146, term297146.getClass(), "key1", null);
        setField(term297146, term297146.getClass(), "key2", term297146);
        setField(term297146, term297146.getClass(), "key3", null);
        setField(term297147, term297147.getClass(), "runnable", null);
        setIntField(term297147, term297147.getClass(), "status", 0);
        setField(term297146, term297146.getClass(), "value1", term297147);
        setField(term297146, term297146.getClass(), "value2", null);
        setField(term297146, term297146.getClass(), "value3", null);
        setField(term297146, term297146.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term295733;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term295733, args);
        assertTrue(recursiveEquals(term295733, term297144));
        assertTrue(recursiveEquals(term295733, term297146));
        assertTrue(recursiveEquals(retValue, null));
    }

};


