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
import java.lang.NullPointerException;
import static org.apache.commons.collections.map.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Flat3Map_put_1944740725935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251579;
     Object term251873;

    public Flat3Map_put_1944740725935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251579 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term251689 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term251781 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term251579, term251579.getClass(), "delegateMap", term251689);
        setIntField(term251579, term251579.getClass(), "size", 3);
        setIntField(term251579, term251579.getClass(), "hash3", 0);
        setField(term251579, term251579.getClass(), "key3", null);
        setIntField(term251579, term251579.getClass(), "hash2", 0);
        setField(term251781, term251781.getClass(), "delegateMap", null);
        setIntField(term251781, term251781.getClass(), "size", 3);
        setField(term251781, term251781.getClass(), "key3", null);
        setField(term251781, term251781.getClass(), "value3", null);
        setField(term251579, term251579.getClass(), "key2", term251781);
        setIntField(term251579, term251579.getClass(), "hash1", 0);
        setField(term251579, term251579.getClass(), "key1", term251579);
        term251873 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term251967 = newInstance(Class.forName("org.apache.commons.collections.map.LinkedMap"));
        setField(term251873, term251873.getClass(), "delegateMap", null);
        setIntField(term251873, term251873.getClass(), "size", 3);
        setIntField(term251873, term251873.getClass(), "hash3", 0);
        setField(term251873, term251873.getClass(), "value3", null);
        setIntField(term251873, term251873.getClass(), "hash2", 0);
        setField(term251873, term251873.getClass(), "value2", null);
        setIntField(term251873, term251873.getClass(), "hash1", 0);
        setIntField(term251967, term251967.getClass(), "size", 0);
        setField(term251873, term251873.getClass(), "value1", term251967);
        setField(term251873, term251873.getClass(), "key3", null);
        setField(term251873, term251873.getClass(), "key2", null);
        setField(term251873, term251873.getClass(), "key1", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term251873;
        args[1] = null;
        try {
            callMethod(klass, "put", argTypes, term251579, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


