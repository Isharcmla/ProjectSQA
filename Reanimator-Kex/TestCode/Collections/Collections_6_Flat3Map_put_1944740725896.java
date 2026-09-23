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

public class Flat3Map_put_1944740725896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237366;
     Object term237496;

    public Flat3Map_put_1944740725896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237366 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term237404 = newInstance(Class.forName("java.lang.Object"));
        setField(term237366, term237366.getClass(), "delegateMap", null);
        setIntField(term237366, term237366.getClass(), "size", 3);
        setIntField(term237366, term237366.getClass(), "hash3", 0);
        setField(term237366, term237366.getClass(), "key3", term237404);
        setField(term237366, term237366.getClass(), "key2", term237366);
        setField(term237366, term237366.getClass(), "value2", null);
        setIntField(term237366, term237366.getClass(), "hash2", 0);
        term237496 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term237606 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        setField(term237496, term237496.getClass(), "delegateMap", null);
        setIntField(term237496, term237496.getClass(), "size", 3);
        setIntField(term237496, term237496.getClass(), "hash3", 0);
        setField(term237496, term237496.getClass(), "value3", null);
        setIntField(term237496, term237496.getClass(), "hash2", 0);
        setIntField(term237606, term237606.getClass(), "size", 0);
        setField(term237496, term237496.getClass(), "value2", term237606);
        setIntField(term237496, term237496.getClass(), "hash1", 0);
        setField(term237496, term237496.getClass(), "value1", null);
        setField(term237496, term237496.getClass(), "key3", null);
        setField(term237496, term237496.getClass(), "key2", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term237496;
        args[1] = null;
        callMethod(klass, "put", argTypes, term237366, args);
    }

};


