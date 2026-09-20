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

public class Flat3Map_equals_1826922527370 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66926;
     Object term67018;
     Object term67462;
     Object term67463;

    public Flat3Map_equals_1826922527370() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66926 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term66926, term66926.getClass(), "delegateMap", null);
        setIntField(term66926, term66926.getClass(), "size", 3);
        term67018 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term67018, term67018.getClass(), "delegateMap", null);
        setIntField(term67018, term67018.getClass(), "size", 3);
        term67462 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term67462, term67462.getClass(), "size", 3);
        setIntField(term67462, term67462.getClass(), "hash1", 0);
        setIntField(term67462, term67462.getClass(), "hash2", 0);
        setIntField(term67462, term67462.getClass(), "hash3", 0);
        setField(term67462, term67462.getClass(), "key1", null);
        setField(term67462, term67462.getClass(), "key2", null);
        setField(term67462, term67462.getClass(), "key3", null);
        setField(term67462, term67462.getClass(), "value1", null);
        setField(term67462, term67462.getClass(), "value2", null);
        setField(term67462, term67462.getClass(), "value3", null);
        setField(term67462, term67462.getClass(), "delegateMap", null);
        term67463 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term67463, term67463.getClass(), "size", 3);
        setIntField(term67463, term67463.getClass(), "hash1", 0);
        setIntField(term67463, term67463.getClass(), "hash2", 0);
        setIntField(term67463, term67463.getClass(), "hash3", 0);
        setField(term67463, term67463.getClass(), "key1", null);
        setField(term67463, term67463.getClass(), "key2", null);
        setField(term67463, term67463.getClass(), "key3", null);
        setField(term67463, term67463.getClass(), "value1", null);
        setField(term67463, term67463.getClass(), "value2", null);
        setField(term67463, term67463.getClass(), "value3", null);
        setField(term67463, term67463.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term67018;
        Object retValue = callMethod(klass, "equals", argTypes, term66926, args);
        assertTrue(recursiveEquals(term66926, term67462));
        assertTrue(recursiveEquals(term67018, term67463));
        assertTrue(recursiveEquals(retValue, true));
    }

};
