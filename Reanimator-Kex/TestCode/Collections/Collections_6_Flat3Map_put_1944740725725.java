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

public class Flat3Map_put_1944740725725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183773;
     Object term184067;

    public Flat3Map_put_1944740725725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183773 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183865 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term183975 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term183773, term183773.getClass(), "delegateMap", null);
        setIntField(term183773, term183773.getClass(), "size", 3);
        setIntField(term183773, term183773.getClass(), "hash3", 0);
        setField(term183865, term183865.getClass(), "delegateMap", null);
        setIntField(term183865, term183865.getClass(), "size", 3);
        setField(term183865, term183865.getClass(), "key3", term183975);
        setField(term183865, term183865.getClass(), "key2", null);
        setField(term183865, term183865.getClass(), "value2", null);
        setIntField(term183865, term183865.getClass(), "hash3", -1);
        setField(term183773, term183773.getClass(), "key3", term183865);
        term184067 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term184159 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term184067, term184067.getClass(), "delegateMap", null);
        setIntField(term184067, term184067.getClass(), "size", 3);
        setIntField(term184067, term184067.getClass(), "hash3", 0);
        setField(term184067, term184067.getClass(), "value3", null);
        setIntField(term184067, term184067.getClass(), "hash2", 0);
        setField(term184067, term184067.getClass(), "value2", null);
        setIntField(term184067, term184067.getClass(), "hash1", 0);
        setField(term184067, term184067.getClass(), "value1", null);
        setField(term184067, term184067.getClass(), "key3", null);
        setField(term184067, term184067.getClass(), "key2", null);
        setField(term184159, term184159.getClass(), "delegateMap", null);
        setIntField(term184159, term184159.getClass(), "size", 0);
        setField(term184067, term184067.getClass(), "key1", term184159);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term184067;
        args[1] = null;
        callMethod(klass, "put", argTypes, term183773, args);
    }

};


