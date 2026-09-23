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

public class Flat3Map_put_1944740725730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186094;
     Object term186370;

    public Flat3Map_put_1944740725730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186094 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term186186 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term186278 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term186094, term186094.getClass(), "delegateMap", null);
        setIntField(term186094, term186094.getClass(), "size", 2);
        setIntField(term186094, term186094.getClass(), "hash2", 0);
        setField(term186186, term186186.getClass(), "delegateMap", null);
        setIntField(term186186, term186186.getClass(), "size", -3);
        setField(term186094, term186094.getClass(), "key2", term186186);
        setIntField(term186094, term186094.getClass(), "hash1", 0);
        setField(term186278, term186278.getClass(), "delegateMap", null);
        setIntField(term186278, term186278.getClass(), "size", 2);
        setField(term186094, term186094.getClass(), "key1", term186278);
        term186370 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term186480 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractLinkedMap"));
        setField(term186370, term186370.getClass(), "delegateMap", null);
        setIntField(term186370, term186370.getClass(), "size", 2);
        setIntField(term186370, term186370.getClass(), "hash2", 0);
        setField(term186370, term186370.getClass(), "value2", null);
        setIntField(term186370, term186370.getClass(), "hash1", 0);
        setField(term186370, term186370.getClass(), "value1", null);
        setIntField(term186480, term186480.getClass(), "size", 2);
        setField(term186370, term186370.getClass(), "key2", term186480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term186370;
        args[1] = null;
        callMethod(klass, "put", argTypes, term186094, args);
    }

};


