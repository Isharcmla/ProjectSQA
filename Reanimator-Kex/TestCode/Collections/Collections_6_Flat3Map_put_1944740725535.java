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

public class Flat3Map_put_1944740725535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105347;
     Object term105424;
     Object term105426;

    public Flat3Map_put_1944740725535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105347 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105405 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setField(term105347, term105347.getClass(), "delegateMap", null);
        setIntField(term105347, term105347.getClass(), "size", 1);
        setIntField(term105347, term105347.getClass(), "hash1", 0);
        setField(term105347, term105347.getClass(), "value1", term105405);
        term105424 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105425 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setIntField(term105424, term105424.getClass(), "size", 2);
        setIntField(term105424, term105424.getClass(), "hash1", 0);
        setIntField(term105424, term105424.getClass(), "hash2", 827310794);
        setIntField(term105424, term105424.getClass(), "hash3", 0);
        setField(term105424, term105424.getClass(), "key1", null);
        setField(term105424, term105424.getClass(), "key2", term105424);
        setField(term105424, term105424.getClass(), "key3", null);
        setField(term105425, term105425.getClass(), "runnable", null);
        setIntField(term105425, term105425.getClass(), "status", 0);
        setField(term105424, term105424.getClass(), "value1", term105425);
        setField(term105424, term105424.getClass(), "value2", null);
        setField(term105424, term105424.getClass(), "value3", null);
        setField(term105424, term105424.getClass(), "delegateMap", null);
        term105426 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term105427 = newInstance(Class.forName("java.util.concurrent.ForkJoinTask$RunnableExecuteAction"));
        setIntField(term105426, term105426.getClass(), "size", 2);
        setIntField(term105426, term105426.getClass(), "hash1", 0);
        setIntField(term105426, term105426.getClass(), "hash2", 827310794);
        setIntField(term105426, term105426.getClass(), "hash3", 0);
        setField(term105426, term105426.getClass(), "key1", null);
        setField(term105426, term105426.getClass(), "key2", term105426);
        setField(term105426, term105426.getClass(), "key3", null);
        setField(term105427, term105427.getClass(), "runnable", null);
        setIntField(term105427, term105427.getClass(), "status", 0);
        setField(term105426, term105426.getClass(), "value1", term105427);
        setField(term105426, term105426.getClass(), "value2", null);
        setField(term105426, term105426.getClass(), "value3", null);
        setField(term105426, term105426.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term105347;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term105347, args);
        assertTrue(recursiveEquals(term105347, term105424));
        assertTrue(recursiveEquals(term105347, term105426));
        assertTrue(recursiveEquals(retValue, null));
    }

};


