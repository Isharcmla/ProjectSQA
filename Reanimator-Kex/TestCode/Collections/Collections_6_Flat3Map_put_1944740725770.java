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

public class Flat3Map_put_1944740725770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195234;
     Object term195528;

    public Flat3Map_put_1944740725770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195234 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195574 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term195629 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term195234, term195234.getClass(), "delegateMap", null);
        setIntField(term195234, term195234.getClass(), "size", 3);
        setIntField(term195234, term195234.getClass(), "hash3", 0);
        setField(term195574, term195574.getClass(), "delegateMap", null);
        setIntField(term195574, term195574.getClass(), "size", 2);
        setField(term195574, term195574.getClass(), "key3", term195629);
        setField(term195574, term195574.getClass(), "key2", null);
        setField(term195574, term195574.getClass(), "value2", null);
        setIntField(term195574, term195574.getClass(), "hash2", 0);
        setIntField(term195574, term195574.getClass(), "hash1", 0);
        setField(term195574, term195574.getClass(), "value1", null);
        setIntField(term195574, term195574.getClass(), "hash3", -1);
        setField(term195234, term195234.getClass(), "key3", term195574);
        term195528 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term195528, term195528.getClass(), "delegateMap", null);
        setIntField(term195528, term195528.getClass(), "size", 3);
        setIntField(term195528, term195528.getClass(), "hash3", 0);
        setField(term195528, term195528.getClass(), "value3", null);
        setIntField(term195528, term195528.getClass(), "hash2", 0);
        setField(term195528, term195528.getClass(), "value2", null);
        setIntField(term195528, term195528.getClass(), "hash1", 0);
        setField(term195528, term195528.getClass(), "value1", null);
        setField(term195528, term195528.getClass(), "key3", null);
        setField(term195528, term195528.getClass(), "key2", term195574);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term195528;
        args[1] = null;
        callMethod(klass, "put", argTypes, term195234, args);
    }

};


