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

public class Flat3Map_equals_1826922527592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112926;
     Object term113164;
     Object term113802;
     Object term113804;

    public Flat3Map_equals_1826922527592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112926 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113072 = newInstance(Class.forName("java.lang.invoke.StringConcatFactory$MethodHandleStringBuilderStrategy"));
        setField(term112926, term112926.getClass(), "delegateMap", null);
        setIntField(term112926, term112926.getClass(), "size", 3);
        setField(term112926, term112926.getClass(), "key3", null);
        setField(term112926, term112926.getClass(), "value3", null);
        setField(term112926, term112926.getClass(), "key2", null);
        setField(term112926, term112926.getClass(), "value2", null);
        setField(term112926, term112926.getClass(), "key1", term113072);
        term113164 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term113164, term113164.getClass(), "delegateMap", null);
        setIntField(term113164, term113164.getClass(), "size", 3);
        setField(term113164, term113164.getClass(), "key3", null);
        setField(term113164, term113164.getClass(), "value3", null);
        setIntField(term113164, term113164.getClass(), "hash3", -1);
        setIntField(term113164, term113164.getClass(), "hash2", 0);
        term113802 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term113803 = newInstance(Class.forName("java.lang.invoke.StringConcatFactory$MethodHandleStringBuilderStrategy"));
        setIntField(term113802, term113802.getClass(), "size", 3);
        setIntField(term113802, term113802.getClass(), "hash1", 0);
        setIntField(term113802, term113802.getClass(), "hash2", 0);
        setIntField(term113802, term113802.getClass(), "hash3", 0);
        setField(term113802, term113802.getClass(), "key1", term113803);
        setField(term113802, term113802.getClass(), "key2", null);
        setField(term113802, term113802.getClass(), "key3", null);
        setField(term113802, term113802.getClass(), "value1", null);
        setField(term113802, term113802.getClass(), "value2", null);
        setField(term113802, term113802.getClass(), "value3", null);
        setField(term113802, term113802.getClass(), "delegateMap", null);
        term113804 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term113804, term113804.getClass(), "size", 3);
        setIntField(term113804, term113804.getClass(), "hash1", 0);
        setIntField(term113804, term113804.getClass(), "hash2", 0);
        setIntField(term113804, term113804.getClass(), "hash3", -1);
        setField(term113804, term113804.getClass(), "key1", null);
        setField(term113804, term113804.getClass(), "key2", null);
        setField(term113804, term113804.getClass(), "key3", null);
        setField(term113804, term113804.getClass(), "value1", null);
        setField(term113804, term113804.getClass(), "value2", null);
        setField(term113804, term113804.getClass(), "value3", null);
        setField(term113804, term113804.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term113164;
        Object retValue = callMethod(klass, "equals", argTypes, term112926, args);
        assertTrue(recursiveEquals(term112926, term113802));
        assertTrue(recursiveEquals(term113164, term113804));
        assertTrue(recursiveEquals(retValue, false));
    }

};
