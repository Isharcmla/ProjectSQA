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
import java.util.HashMap;

public class Flat3Map_put_19447407251010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285995;
     Object term286467;

    public Flat3Map_put_19447407251010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term286375 = new HashMap();
        term285995 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term286087 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term286197 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term286327 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap$HashEntry"));
        setField(term285995, term285995.getClass(), "delegateMap", null);
        setIntField(term285995, term285995.getClass(), "size", 3);
        setIntField(term285995, term285995.getClass(), "hash3", 1884947718);
        setField(term286087, term286087.getClass(), "delegateMap", null);
        setIntField(term286087, term286087.getClass(), "size", 3);
        setIntField(term286197, term286197.getClass(), "size", 0);
        setField(term286087, term286087.getClass(), "key3", term286197);
        setField(term286087, term286087.getClass(), "key2", null);
        setField(term286087, term286087.getClass(), "value2", null);
        setIntField(term286087, term286087.getClass(), "hash3", 122896);
        setIntField(term286087, term286087.getClass(), "hash2", -2013258672);
        setIntField(term286087, term286087.getClass(), "hash1", -2012344320);
        setField(term286087, term286087.getClass(), "key1", term286327);
        setField(term286087, term286087.getClass(), "value3", null);
        setField(term286087, term286087.getClass(), "value1", null);
        setField(term285995, term285995.getClass(), "key3", term286087);
        setIntField(term285995, term285995.getClass(), "hash2", 1884947718);
        setField(term285995, term285995.getClass(), "key2", null);
        setIntField(term285995, term285995.getClass(), "hash1", 1884947718);
        setField(term285995, term285995.getClass(), "key1", null);
        setField(term285995, term285995.getClass(), "value3", null);
        setField(term285995, term285995.getClass(), "value2", term286375);
        setField(term285995, term285995.getClass(), "value1", null);
        term286467 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term286559 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term286467, term286467.getClass(), "delegateMap", null);
        setIntField(term286467, term286467.getClass(), "size", 3);
        setIntField(term286467, term286467.getClass(), "hash3", -1276115968);
        setField(term286467, term286467.getClass(), "value3", null);
        setIntField(term286467, term286467.getClass(), "hash2", 2080506112);
        setField(term286467, term286467.getClass(), "value2", null);
        setIntField(term286467, term286467.getClass(), "hash1", 1080557574);
        setField(term286467, term286467.getClass(), "value1", null);
        setField(term286467, term286467.getClass(), "key3", null);
        setField(term286559, term286559.getClass(), "delegateMap", null);
        setIntField(term286559, term286559.getClass(), "size", 2);
        setIntField(term286559, term286559.getClass(), "hash2", 16);
        setField(term286559, term286559.getClass(), "value2", null);
        setIntField(term286559, term286559.getClass(), "hash1", 122896);
        setField(term286559, term286559.getClass(), "value1", null);
        setField(term286467, term286467.getClass(), "key2", term286559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term286467;
        args[1] = null;
        callMethod(klass, "put", argTypes, term285995, args);
    }

};


