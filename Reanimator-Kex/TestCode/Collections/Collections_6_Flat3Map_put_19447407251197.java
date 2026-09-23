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

public class Flat3Map_put_19447407251197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378696;
     Object term378918;

    public Flat3Map_put_19447407251197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378696 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term378734 = newInstance(Class.forName("java.lang.Object"));
        Object term378826 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term378696, term378696.getClass(), "delegateMap", null);
        setIntField(term378696, term378696.getClass(), "size", 3);
        setIntField(term378696, term378696.getClass(), "hash3", 0);
        setField(term378696, term378696.getClass(), "key3", term378734);
        setIntField(term378696, term378696.getClass(), "hash2", 0);
        setField(term378826, term378826.getClass(), "delegateMap", null);
        setIntField(term378826, term378826.getClass(), "size", -4);
        setField(term378696, term378696.getClass(), "key2", term378826);
        term378918 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term378918, term378918.getClass(), "delegateMap", null);
        setIntField(term378918, term378918.getClass(), "size", 3);
        setIntField(term378918, term378918.getClass(), "hash3", 0);
        setField(term378918, term378918.getClass(), "value3", null);
        setIntField(term378918, term378918.getClass(), "hash2", 0);
        setField(term378918, term378918.getClass(), "value2", null);
        setIntField(term378918, term378918.getClass(), "hash1", 0);
        setField(term378918, term378918.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term378918;
        args[1] = null;
        callMethod(klass, "put", argTypes, term378696, args);
    }

};


