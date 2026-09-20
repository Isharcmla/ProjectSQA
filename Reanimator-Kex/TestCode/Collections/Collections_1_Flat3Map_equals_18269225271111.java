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
import java.lang.Object;

public class Flat3Map_equals_18269225271111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221125;
     Object term221339;
     Object term221375;
     Object term221377;

    public Flat3Map_equals_18269225271111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221125 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term221247 = newInstance(Class.forName("java.util.concurrent.atomic.DoubleAdder$SerializationProxy"));
        setField(term221125, term221125.getClass(), "delegateMap", null);
        setIntField(term221125, term221125.getClass(), "size", 3);
        setField(term221125, term221125.getClass(), "key3", term221247);
        term221339 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term221339, term221339.getClass(), "delegateMap", null);
        setIntField(term221339, term221339.getClass(), "size", 3);
        term221375 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term221376 = newInstance(Class.forName("java.util.concurrent.atomic.DoubleAdder$SerializationProxy"));
        setIntField(term221375, term221375.getClass(), "size", 3);
        setIntField(term221375, term221375.getClass(), "hash1", 0);
        setIntField(term221375, term221375.getClass(), "hash2", 0);
        setIntField(term221375, term221375.getClass(), "hash3", 0);
        setField(term221375, term221375.getClass(), "key1", null);
        setField(term221375, term221375.getClass(), "key2", null);
        setDoubleField(term221376, term221376.getClass(), "value", 0.0);
        setField(term221375, term221375.getClass(), "key3", term221376);
        setField(term221375, term221375.getClass(), "value1", null);
        setField(term221375, term221375.getClass(), "value2", null);
        setField(term221375, term221375.getClass(), "value3", null);
        setField(term221375, term221375.getClass(), "delegateMap", null);
        term221377 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term221377, term221377.getClass(), "size", 3);
        setIntField(term221377, term221377.getClass(), "hash1", 0);
        setIntField(term221377, term221377.getClass(), "hash2", 0);
        setIntField(term221377, term221377.getClass(), "hash3", 0);
        setField(term221377, term221377.getClass(), "key1", null);
        setField(term221377, term221377.getClass(), "key2", null);
        setField(term221377, term221377.getClass(), "key3", null);
        setField(term221377, term221377.getClass(), "value1", null);
        setField(term221377, term221377.getClass(), "value2", null);
        setField(term221377, term221377.getClass(), "value3", null);
        setField(term221377, term221377.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term221339;
        Object retValue = callMethod(klass, "equals", argTypes, term221125, args);
        assertTrue(recursiveEquals(term221125, term221375));
        assertTrue(recursiveEquals(term221339, term221377));
        assertTrue(recursiveEquals(retValue, false));
    }

};
