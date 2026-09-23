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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_1944740725913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242419;
     Object term242599;

    public Flat3Map_put_1944740725913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242419 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term242507 = newInstance(Class.forName("org.apache.commons.collections.map.LRUMap"));
        setField(term242419, term242419.getClass(), "delegateMap", term242507);
        setIntField(term242419, term242419.getClass(), "size", 3);
        setIntField(term242419, term242419.getClass(), "hash3", 0);
        setField(term242419, term242419.getClass(), "key3", null);
        setIntField(term242419, term242419.getClass(), "hash2", 0);
        setField(term242419, term242419.getClass(), "key2", term242419);
        term242599 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term242693 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term242599, term242599.getClass(), "delegateMap", null);
        setIntField(term242599, term242599.getClass(), "size", 3);
        setIntField(term242599, term242599.getClass(), "hash3", 0);
        setField(term242599, term242599.getClass(), "value3", null);
        setIntField(term242599, term242599.getClass(), "hash2", 0);
        setField(term242599, term242599.getClass(), "value2", null);
        setIntField(term242599, term242599.getClass(), "hash1", 0);
        setIntField(term242693, term242693.getClass(), "size", 0);
        setField(term242599, term242599.getClass(), "value1", term242693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term242599;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term242419, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


