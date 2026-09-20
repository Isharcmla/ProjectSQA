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

public class Flat3Map_get_229621781427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78764;
     Object term78823;
     Object term78825;

    public Flat3Map_get_229621781427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78764 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78807 = newInstance(Class.forName("org.apache.commons.collections.BeanMap$8"));
        setField(term78764, term78764.getClass(), "delegateMap", null);
        setIntField(term78764, term78764.getClass(), "size", 2);
        setIntField(term78764, term78764.getClass(), "hash2", 0);
        setField(term78764, term78764.getClass(), "value2", null);
        setIntField(term78764, term78764.getClass(), "hash1", 0);
        setField(term78764, term78764.getClass(), "value1", term78807);
        term78823 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78824 = newInstance(Class.forName("org.apache.commons.collections.BeanMap$8"));
        setIntField(term78823, term78823.getClass(), "size", 2);
        setIntField(term78823, term78823.getClass(), "hash1", 0);
        setIntField(term78823, term78823.getClass(), "hash2", 0);
        setIntField(term78823, term78823.getClass(), "hash3", 0);
        setField(term78823, term78823.getClass(), "key1", null);
        setField(term78823, term78823.getClass(), "key2", null);
        setField(term78823, term78823.getClass(), "key3", null);
        setField(term78823, term78823.getClass(), "value1", term78824);
        setField(term78823, term78823.getClass(), "value2", null);
        setField(term78823, term78823.getClass(), "value3", null);
        setField(term78823, term78823.getClass(), "delegateMap", null);
        term78825 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term78826 = newInstance(Class.forName("org.apache.commons.collections.BeanMap$8"));
        setIntField(term78825, term78825.getClass(), "size", 2);
        setIntField(term78825, term78825.getClass(), "hash1", 0);
        setIntField(term78825, term78825.getClass(), "hash2", 0);
        setIntField(term78825, term78825.getClass(), "hash3", 0);
        setField(term78825, term78825.getClass(), "key1", null);
        setField(term78825, term78825.getClass(), "key2", null);
        setField(term78825, term78825.getClass(), "key3", null);
        setField(term78825, term78825.getClass(), "value1", term78826);
        setField(term78825, term78825.getClass(), "value2", null);
        setField(term78825, term78825.getClass(), "value3", null);
        setField(term78825, term78825.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term78764;
        Object retValue = callMethod(klass, "get", argTypes, term78764, args);
        assertTrue(recursiveEquals(term78764, term78823));
        assertTrue(recursiveEquals(term78764, term78825));
        assertTrue(recursiveEquals(retValue, null));
    }

};
