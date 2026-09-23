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

public class Flat3Map_put_1944740725710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173770;
     Object term174046;

    public Flat3Map_put_1944740725710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173770 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term174092 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term174138 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term173770, term173770.getClass(), "delegateMap", null);
        setIntField(term173770, term173770.getClass(), "size", 3);
        setIntField(term173770, term173770.getClass(), "hash3", 0);
        setField(term174092, term174092.getClass(), "delegateMap", null);
        setIntField(term174092, term174092.getClass(), "size", 0);
        setField(term174138, term174138.getClass(), "delegateMap", null);
        setIntField(term174138, term174138.getClass(), "size", 3);
        setField(term174092, term174092.getClass(), "key3", term174138);
        setField(term174092, term174092.getClass(), "key2", null);
        setField(term174092, term174092.getClass(), "value2", null);
        setIntField(term174092, term174092.getClass(), "hash3", 0);
        setField(term173770, term173770.getClass(), "key3", term174092);
        term174046 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term174046, term174046.getClass(), "delegateMap", null);
        setIntField(term174046, term174046.getClass(), "size", 3);
        setIntField(term174046, term174046.getClass(), "hash3", 0);
        setField(term174046, term174046.getClass(), "value3", null);
        setIntField(term174046, term174046.getClass(), "hash2", 0);
        setField(term174046, term174046.getClass(), "value2", null);
        setIntField(term174046, term174046.getClass(), "hash1", 0);
        setField(term174046, term174046.getClass(), "value1", null);
        setField(term174046, term174046.getClass(), "key3", null);
        setField(term174046, term174046.getClass(), "key2", term174092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term174046;
        args[1] = null;
        callMethod(klass, "put", argTypes, term173770, args);
    }

};


