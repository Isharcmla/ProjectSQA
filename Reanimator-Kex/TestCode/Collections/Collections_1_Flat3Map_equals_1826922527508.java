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

public class Flat3Map_equals_1826922527508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95700;
     Object term95910;
     Object term96312;
     Object term96314;

    public Flat3Map_equals_1826922527508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95700 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term95818 = newInstance(Class.forName("org.apache.commons.collections.functors.ExceptionFactory"));
        setField(term95700, term95700.getClass(), "delegateMap", null);
        setIntField(term95700, term95700.getClass(), "size", 2);
        setField(term95700, term95700.getClass(), "key2", term95818);
        term95910 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term95910, term95910.getClass(), "delegateMap", null);
        setIntField(term95910, term95910.getClass(), "size", 2);
        term96312 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term96313 = newInstance(Class.forName("org.apache.commons.collections.functors.ExceptionFactory"));
        setIntField(term96312, term96312.getClass(), "size", 2);
        setIntField(term96312, term96312.getClass(), "hash1", 0);
        setIntField(term96312, term96312.getClass(), "hash2", 0);
        setIntField(term96312, term96312.getClass(), "hash3", 0);
        setField(term96312, term96312.getClass(), "key1", null);
        setField(term96312, term96312.getClass(), "key2", term96313);
        setField(term96312, term96312.getClass(), "key3", null);
        setField(term96312, term96312.getClass(), "value1", null);
        setField(term96312, term96312.getClass(), "value2", null);
        setField(term96312, term96312.getClass(), "value3", null);
        setField(term96312, term96312.getClass(), "delegateMap", null);
        term96314 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term96314, term96314.getClass(), "size", 2);
        setIntField(term96314, term96314.getClass(), "hash1", 0);
        setIntField(term96314, term96314.getClass(), "hash2", 0);
        setIntField(term96314, term96314.getClass(), "hash3", 0);
        setField(term96314, term96314.getClass(), "key1", null);
        setField(term96314, term96314.getClass(), "key2", null);
        setField(term96314, term96314.getClass(), "key3", null);
        setField(term96314, term96314.getClass(), "value1", null);
        setField(term96314, term96314.getClass(), "value2", null);
        setField(term96314, term96314.getClass(), "value3", null);
        setField(term96314, term96314.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term95910;
        Object retValue = callMethod(klass, "equals", argTypes, term95700, args);
        assertTrue(recursiveEquals(term95700, term96312));
        assertTrue(recursiveEquals(term95910, term96314));
        assertTrue(recursiveEquals(retValue, false));
    }

};
