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

public class Flat3Map_put_1944740725871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term228149;
     Object term228397;

    public Flat3Map_put_1944740725871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term228149 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term228397 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term228452 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term228149, term228149.getClass(), "delegateMap", null);
        setIntField(term228149, term228149.getClass(), "size", 3);
        setIntField(term228149, term228149.getClass(), "hash3", 0);
        setField(term228149, term228149.getClass(), "key3", null);
        setIntField(term228149, term228149.getClass(), "hash2", 0);
        setField(term228149, term228149.getClass(), "key2", null);
        setIntField(term228149, term228149.getClass(), "hash1", 0);
        setField(term228397, term228397.getClass(), "delegateMap", null);
        setIntField(term228397, term228397.getClass(), "size", 3);
        setIntField(term228397, term228397.getClass(), "hash3", 0);
        setField(term228397, term228397.getClass(), "value3", null);
        setIntField(term228397, term228397.getClass(), "hash2", 0);
        setField(term228397, term228397.getClass(), "value2", null);
        setIntField(term228397, term228397.getClass(), "hash1", 0);
        setIntField(term228452, term228452.getClass(), "size", 0);
        setField(term228397, term228397.getClass(), "value1", term228452);
        setField(term228149, term228149.getClass(), "key1", term228397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term228397;
        args[1] = null;
        callMethod(klass, "put", argTypes, term228149, args);
    }

};


