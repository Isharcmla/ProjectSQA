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
import java.util.HashMap;
import java.lang.Object;

public class Flat3Map_equals_1826922527675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132319;
     Object term132531;
     Object term132708;
     Object term132711;

    public Flat3Map_equals_1826922527675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term132555 = new HashMap();
        term132319 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132405 = newInstance(Class.forName("java.lang.Object"));
        setField(term132319, term132319.getClass(), "delegateMap", null);
        setIntField(term132319, term132319.getClass(), "size", 2);
        setField(term132319, term132319.getClass(), "key2", term132555);
        setField(term132319, term132319.getClass(), "value2", term132405);
        term132531 = newInstance(Class.forName("java.lang.Object"));
        HashMap term132709 = new HashMap();
        term132708 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term132710 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term132708, term132708.getClass(), "size", 2);
        setIntField(term132708, term132708.getClass(), "hash1", 0);
        setIntField(term132708, term132708.getClass(), "hash2", 0);
        setIntField(term132708, term132708.getClass(), "hash3", 0);
        setField(term132708, term132708.getClass(), "key1", null);
        setField(term132708, term132708.getClass(), "key2", term132709);
        setField(term132708, term132708.getClass(), "key3", null);
        setField(term132708, term132708.getClass(), "value1", null);
        setField(term132708, term132708.getClass(), "value2", term132710);
        setField(term132708, term132708.getClass(), "value3", null);
        setField(term132708, term132708.getClass(), "delegateMap", null);
        term132711 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term132531;
        Object retValue = callMethod(klass, "equals", argTypes, term132319, args);
        assertTrue(recursiveEquals(term132319, term132708));
        assertTrue(recursiveEquals(term132531, term132711));
        assertTrue(recursiveEquals(retValue, false));
    }

};
