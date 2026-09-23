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

public class Flat3Map_put_1944740725892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236923;

    public Flat3Map_put_1944740725892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236923 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term236969 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term237009 = newInstance(Class.forName("java.util.stream.ReduceOps$ReduceTask"));
        setField(term236923, term236923.getClass(), "delegateMap", null);
        setIntField(term236923, term236923.getClass(), "size", 0);
        setIntField(term236923, term236923.getClass(), "hash3", 0);
        setField(term236923, term236923.getClass(), "value3", null);
        setIntField(term236923, term236923.getClass(), "hash2", 0);
        setField(term236923, term236923.getClass(), "value2", null);
        setIntField(term236923, term236923.getClass(), "hash1", 0);
        setField(term236923, term236923.getClass(), "value1", null);
        setField(term236923, term236923.getClass(), "key3", null);
        setField(term236969, term236969.getClass(), "delegateMap", null);
        setIntField(term236969, term236969.getClass(), "size", 0);
        setField(term236923, term236923.getClass(), "key2", term236969);
        setField(term236923, term236923.getClass(), "key1", term237009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term236923;
        args[1] = null;
        callMethod(klass, "put", argTypes, term236923, args);
    }

};


