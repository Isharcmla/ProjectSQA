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

public class Flat3Map_put_1944740725850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221533;

    public Flat3Map_put_1944740725850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221533 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term221588 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term221533, term221533.getClass(), "delegateMap", null);
        setIntField(term221533, term221533.getClass(), "size", 3);
        setIntField(term221533, term221533.getClass(), "hash3", 0);
        setField(term221533, term221533.getClass(), "value3", null);
        setIntField(term221533, term221533.getClass(), "hash2", -1);
        setField(term221533, term221533.getClass(), "value2", null);
        setIntField(term221533, term221533.getClass(), "hash1", 0);
        setIntField(term221588, term221588.getClass(), "size", 0);
        setField(term221533, term221533.getClass(), "value1", term221588);
        setField(term221533, term221533.getClass(), "key3", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term221533;
        args[1] = null;
        callMethod(klass, "put", argTypes, term221533, args);
    }

};


