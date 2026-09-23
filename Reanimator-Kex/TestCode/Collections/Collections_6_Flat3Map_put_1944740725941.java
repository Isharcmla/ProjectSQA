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

public class Flat3Map_put_1944740725941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255918;
     Object term256010;

    public Flat3Map_put_1944740725941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255918 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term255918, term255918.getClass(), "delegateMap", null);
        setIntField(term255918, term255918.getClass(), "size", 3);
        setIntField(term255918, term255918.getClass(), "hash3", 0);
        setField(term255918, term255918.getClass(), "key3", null);
        setIntField(term255918, term255918.getClass(), "hash2", 0);
        setField(term255918, term255918.getClass(), "key2", null);
        setIntField(term255918, term255918.getClass(), "hash1", 0);
        setField(term255918, term255918.getClass(), "key1", term255918);
        setField(term255918, term255918.getClass(), "value3", null);
        term256010 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term256104 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        Object term256190 = newInstance(Class.forName("org.apache.commons.collections.BeanMap$4"));
        setField(term256010, term256010.getClass(), "delegateMap", null);
        setIntField(term256010, term256010.getClass(), "size", 3);
        setIntField(term256010, term256010.getClass(), "hash3", 0);
        setField(term256010, term256010.getClass(), "value3", null);
        setIntField(term256010, term256010.getClass(), "hash2", 0);
        setField(term256010, term256010.getClass(), "value2", null);
        setIntField(term256010, term256010.getClass(), "hash1", 0);
        setIntField(term256104, term256104.getClass(), "size", 0);
        setField(term256010, term256010.getClass(), "value1", term256104);
        setField(term256010, term256010.getClass(), "key3", null);
        setField(term256010, term256010.getClass(), "key2", null);
        setField(term256010, term256010.getClass(), "key1", term256190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term256010;
        args[1] = null;
        callMethod(klass, "put", argTypes, term255918, args);
    }

};


