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

public class Flat3Map_put_1944740725794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208439;
     Object term208623;

    public Flat3Map_put_1944740725794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208439 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term208531 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term208439, term208439.getClass(), "delegateMap", null);
        setIntField(term208439, term208439.getClass(), "size", 3);
        setIntField(term208439, term208439.getClass(), "hash3", -1);
        setIntField(term208439, term208439.getClass(), "hash2", 0);
        setField(term208439, term208439.getClass(), "key2", null);
        setIntField(term208439, term208439.getClass(), "hash1", 0);
        setField(term208531, term208531.getClass(), "delegateMap", null);
        setIntField(term208531, term208531.getClass(), "size", 3);
        setField(term208531, term208531.getClass(), "key3", null);
        setField(term208531, term208531.getClass(), "value3", null);
        setField(term208439, term208439.getClass(), "key1", term208531);
        term208623 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term208733 = newInstance(Class.forName("org.apache.commons.collections.map.AbstractHashedMap"));
        Object term208785 = newInstance(Class.forName("java.io.CharArrayWriter"));
        setField(term208623, term208623.getClass(), "delegateMap", null);
        setIntField(term208623, term208623.getClass(), "size", 3);
        setIntField(term208623, term208623.getClass(), "hash3", 0);
        setField(term208623, term208623.getClass(), "value3", null);
        setIntField(term208623, term208623.getClass(), "hash2", 0);
        setField(term208623, term208623.getClass(), "value2", null);
        setIntField(term208623, term208623.getClass(), "hash1", 0);
        setIntField(term208733, term208733.getClass(), "size", 0);
        setField(term208623, term208623.getClass(), "value1", term208733);
        setField(term208623, term208623.getClass(), "key3", null);
        setField(term208623, term208623.getClass(), "key2", null);
        setField(term208623, term208623.getClass(), "key1", term208785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term208623;
        args[1] = null;
        callMethod(klass, "put", argTypes, term208439, args);
    }

};


