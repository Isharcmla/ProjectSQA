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

public class Flat3Map_put_19447407251030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293548;
     Object term293640;

    public Flat3Map_put_19447407251030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293548 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term293548, term293548.getClass(), "delegateMap", null);
        setIntField(term293548, term293548.getClass(), "size", -4);
        setIntField(term293548, term293548.getClass(), "hash3", 0);
        setField(term293548, term293548.getClass(), "key3", term293548);
        term293640 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term293734 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term293640, term293640.getClass(), "delegateMap", null);
        setIntField(term293640, term293640.getClass(), "size", 3);
        setIntField(term293640, term293640.getClass(), "hash3", 0);
        setField(term293640, term293640.getClass(), "value3", null);
        setIntField(term293640, term293640.getClass(), "hash2", 0);
        setIntField(term293734, term293734.getClass(), "size", 0);
        setField(term293640, term293640.getClass(), "value2", term293734);
        setIntField(term293640, term293640.getClass(), "hash1", 0);
        setField(term293640, term293640.getClass(), "value1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term293640;
        args[1] = null;
        callMethod(klass, "put", argTypes, term293548, args);
    }

};


