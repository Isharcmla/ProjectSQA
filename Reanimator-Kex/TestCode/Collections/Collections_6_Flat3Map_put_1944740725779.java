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

public class Flat3Map_put_1944740725779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200975;
     Object term201453;

    public Flat3Map_put_1944740725779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200975 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term201067 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term201159 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term201251 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term201361 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term200975, term200975.getClass(), "delegateMap", null);
        setIntField(term200975, term200975.getClass(), "size", 3);
        setIntField(term200975, term200975.getClass(), "hash3", 0);
        setField(term201067, term201067.getClass(), "delegateMap", null);
        setIntField(term201067, term201067.getClass(), "size", 3);
        setField(term201067, term201067.getClass(), "key3", term201159);
        setField(term201067, term201067.getClass(), "key2", null);
        setField(term201067, term201067.getClass(), "value2", null);
        setIntField(term201067, term201067.getClass(), "hash3", -1);
        setIntField(term201067, term201067.getClass(), "hash2", -1);
        setIntField(term201067, term201067.getClass(), "hash1", -1);
        setField(term200975, term200975.getClass(), "key3", term201067);
        setIntField(term200975, term200975.getClass(), "hash2", 0);
        setField(term201251, term201251.getClass(), "delegateMap", term201361);
        setField(term200975, term200975.getClass(), "key2", term201251);
        term201453 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term201493 = newInstance(Class.forName("java.io.Console$1"));
        setField(term201453, term201453.getClass(), "delegateMap", null);
        setIntField(term201453, term201453.getClass(), "size", 3);
        setIntField(term201453, term201453.getClass(), "hash3", 0);
        setField(term201453, term201453.getClass(), "value3", null);
        setIntField(term201453, term201453.getClass(), "hash2", 0);
        setField(term201453, term201453.getClass(), "value2", null);
        setIntField(term201453, term201453.getClass(), "hash1", 0);
        setField(term201453, term201453.getClass(), "value1", null);
        setField(term201453, term201453.getClass(), "key3", null);
        setField(term201453, term201453.getClass(), "key2", term201493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term201453;
        args[1] = null;
        callMethod(klass, "put", argTypes, term200975, args);
    }

};


