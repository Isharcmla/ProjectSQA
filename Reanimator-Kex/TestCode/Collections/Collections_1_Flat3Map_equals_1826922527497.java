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

public class Flat3Map_equals_1826922527497 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93507;
     Object term93647;
     Object term93778;
     Object term93781;

    public Flat3Map_equals_1826922527497() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term93555 = new HashMap();
        term93507 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term93507, term93507.getClass(), "delegateMap", null);
        setIntField(term93507, term93507.getClass(), "size", 3);
        setField(term93507, term93507.getClass(), "key3", null);
        setField(term93507, term93507.getClass(), "value3", null);
        setField(term93507, term93507.getClass(), "key2", term93555);
        term93647 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term93647, term93647.getClass(), "delegateMap", null);
        setIntField(term93647, term93647.getClass(), "size", 3);
        setField(term93647, term93647.getClass(), "key3", null);
        setField(term93647, term93647.getClass(), "value3", null);
        HashMap term93779 = new HashMap();
        term93778 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term93778, term93778.getClass(), "size", 3);
        setIntField(term93778, term93778.getClass(), "hash1", 0);
        setIntField(term93778, term93778.getClass(), "hash2", 0);
        setIntField(term93778, term93778.getClass(), "hash3", 0);
        setField(term93778, term93778.getClass(), "key1", null);
        setField(term93778, term93778.getClass(), "key2", term93779);
        setField(term93778, term93778.getClass(), "key3", null);
        setField(term93778, term93778.getClass(), "value1", null);
        setField(term93778, term93778.getClass(), "value2", null);
        setField(term93778, term93778.getClass(), "value3", null);
        setField(term93778, term93778.getClass(), "delegateMap", null);
        term93781 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term93781, term93781.getClass(), "size", 3);
        setIntField(term93781, term93781.getClass(), "hash1", 0);
        setIntField(term93781, term93781.getClass(), "hash2", 0);
        setIntField(term93781, term93781.getClass(), "hash3", 0);
        setField(term93781, term93781.getClass(), "key1", null);
        setField(term93781, term93781.getClass(), "key2", null);
        setField(term93781, term93781.getClass(), "key3", null);
        setField(term93781, term93781.getClass(), "value1", null);
        setField(term93781, term93781.getClass(), "value2", null);
        setField(term93781, term93781.getClass(), "value3", null);
        setField(term93781, term93781.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term93647;
        Object retValue = callMethod(klass, "equals", argTypes, term93507, args);
        assertTrue(recursiveEquals(term93507, term93778));
        assertTrue(recursiveEquals(term93647, term93781));
        assertTrue(recursiveEquals(retValue, false));
    }

};
