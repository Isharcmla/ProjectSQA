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

public class Flat3Map_put_19447407251195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377578;
     Object term377670;

    public Flat3Map_put_19447407251195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377578 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term377578, term377578.getClass(), "delegateMap", null);
        setIntField(term377578, term377578.getClass(), "size", 3);
        setIntField(term377578, term377578.getClass(), "hash3", -1);
        setField(term377578, term377578.getClass(), "key3", null);
        setIntField(term377578, term377578.getClass(), "hash2", 0);
        setField(term377578, term377578.getClass(), "key2", null);
        setIntField(term377578, term377578.getClass(), "hash1", 0);
        setField(term377578, term377578.getClass(), "key1", term377578);
        setField(term377578, term377578.getClass(), "value3", null);
        term377670 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term377764 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term377850 = newInstance(Class.forName("org.apache.commons.collections.BeanMap$4"));
        setField(term377670, term377670.getClass(), "delegateMap", null);
        setIntField(term377670, term377670.getClass(), "size", 3);
        setIntField(term377670, term377670.getClass(), "hash3", 0);
        setField(term377670, term377670.getClass(), "value3", null);
        setIntField(term377670, term377670.getClass(), "hash2", 0);
        setField(term377670, term377670.getClass(), "value2", null);
        setIntField(term377670, term377670.getClass(), "hash1", 0);
        setIntField(term377764, term377764.getClass(), "size", 0);
        setField(term377670, term377670.getClass(), "value1", term377764);
        setField(term377670, term377670.getClass(), "key3", null);
        setField(term377670, term377670.getClass(), "key2", null);
        setField(term377670, term377670.getClass(), "key1", term377850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term377670;
        args[1] = null;
        callMethod(klass, "put", argTypes, term377578, args);
    }

};


