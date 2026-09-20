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

public class Flat3Map_equals_1826922527712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141430;
     Object term141626;
     Object term142047;
     Object term142049;

    public Flat3Map_equals_1826922527712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141430 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term141534 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$ArrayAccessor$1"));
        setField(term141430, term141430.getClass(), "delegateMap", null);
        setIntField(term141430, term141430.getClass(), "size", 3);
        setField(term141430, term141430.getClass(), "key3", null);
        setField(term141430, term141430.getClass(), "value3", null);
        setField(term141430, term141430.getClass(), "key2", term141534);
        term141626 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term141626, term141626.getClass(), "delegateMap", null);
        setIntField(term141626, term141626.getClass(), "size", 3);
        setField(term141626, term141626.getClass(), "key3", null);
        setField(term141626, term141626.getClass(), "value3", null);
        setIntField(term141626, term141626.getClass(), "hash3", -1);
        setIntField(term141626, term141626.getClass(), "hash2", 0);
        term142047 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term142048 = newInstance(Class.forName("java.lang.invoke.MethodHandleImpl$ArrayAccessor$1"));
        setIntField(term142047, term142047.getClass(), "size", 3);
        setIntField(term142047, term142047.getClass(), "hash1", 0);
        setIntField(term142047, term142047.getClass(), "hash2", 0);
        setIntField(term142047, term142047.getClass(), "hash3", 0);
        setField(term142047, term142047.getClass(), "key1", null);
        setIntField(term142048, term142048.getClass(), "hashCodeForCache", 0);
        setField(term142048, term142048.getClass(), "identity", null);
        setField(term142048, term142048.getClass(), "version", null);
        setField(term142047, term142047.getClass(), "key2", term142048);
        setField(term142047, term142047.getClass(), "key3", null);
        setField(term142047, term142047.getClass(), "value1", null);
        setField(term142047, term142047.getClass(), "value2", null);
        setField(term142047, term142047.getClass(), "value3", null);
        setField(term142047, term142047.getClass(), "delegateMap", null);
        term142049 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term142049, term142049.getClass(), "size", 3);
        setIntField(term142049, term142049.getClass(), "hash1", 0);
        setIntField(term142049, term142049.getClass(), "hash2", 0);
        setIntField(term142049, term142049.getClass(), "hash3", -1);
        setField(term142049, term142049.getClass(), "key1", null);
        setField(term142049, term142049.getClass(), "key2", null);
        setField(term142049, term142049.getClass(), "key3", null);
        setField(term142049, term142049.getClass(), "value1", null);
        setField(term142049, term142049.getClass(), "value2", null);
        setField(term142049, term142049.getClass(), "value3", null);
        setField(term142049, term142049.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term141626;
        Object retValue = callMethod(klass, "equals", argTypes, term141430, args);
        assertTrue(recursiveEquals(term141430, term142047));
        assertTrue(recursiveEquals(term141626, term142049));
        assertTrue(recursiveEquals(retValue, false));
    }

};
