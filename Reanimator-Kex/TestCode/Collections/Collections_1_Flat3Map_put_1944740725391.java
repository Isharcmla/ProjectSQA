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
import static org.apache.commons.collections.map.EqualityUtils.*;

public class Flat3Map_put_1944740725391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72203;
     Object term72212;

    public Flat3Map_put_1944740725391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72203 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term72203, term72203.getClass(), "delegateMap", null);
        setIntField(term72203, term72203.getClass(), "size", 3);
        term72212 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term72212, term72212.getClass(), "size", 3);
        setIntField(term72212, term72212.getClass(), "hash1", 0);
        setIntField(term72212, term72212.getClass(), "hash2", 0);
        setIntField(term72212, term72212.getClass(), "hash3", 0);
        setField(term72212, term72212.getClass(), "key1", null);
        setField(term72212, term72212.getClass(), "key2", null);
        setField(term72212, term72212.getClass(), "key3", null);
        setField(term72212, term72212.getClass(), "value1", null);
        setField(term72212, term72212.getClass(), "value2", null);
        setField(term72212, term72212.getClass(), "value3", null);
        setField(term72212, term72212.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term72203, args);
        assertTrue(recursiveEquals(term72203, term72212));
        assertTrue(recursiveEquals(retValue, null));
    }

};
