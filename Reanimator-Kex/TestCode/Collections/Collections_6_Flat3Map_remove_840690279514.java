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

public class Flat3Map_remove_840690279514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97118;
     Object term98193;

    public Flat3Map_remove_840690279514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97118 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term97210 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term97118, term97118.getClass(), "delegateMap", null);
        setIntField(term97118, term97118.getClass(), "size", 2);
        setField(term97118, term97118.getClass(), "key2", term97210);
        term98193 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term98194 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term98193, term98193.getClass(), "size", 1);
        setIntField(term98193, term98193.getClass(), "hash1", 0);
        setIntField(term98193, term98193.getClass(), "hash2", 0);
        setIntField(term98193, term98193.getClass(), "hash3", 0);
        setIntField(term98194, term98194.getClass(), "size", 0);
        setIntField(term98194, term98194.getClass(), "hash1", 0);
        setIntField(term98194, term98194.getClass(), "hash2", 0);
        setIntField(term98194, term98194.getClass(), "hash3", 0);
        setField(term98194, term98194.getClass(), "key1", null);
        setField(term98194, term98194.getClass(), "key2", null);
        setField(term98194, term98194.getClass(), "key3", null);
        setField(term98194, term98194.getClass(), "value1", null);
        setField(term98194, term98194.getClass(), "value2", null);
        setField(term98194, term98194.getClass(), "value3", null);
        setField(term98194, term98194.getClass(), "delegateMap", null);
        setField(term98193, term98193.getClass(), "key1", term98194);
        setField(term98193, term98193.getClass(), "key2", null);
        setField(term98193, term98193.getClass(), "key3", null);
        setField(term98193, term98193.getClass(), "value1", null);
        setField(term98193, term98193.getClass(), "value2", null);
        setField(term98193, term98193.getClass(), "value3", null);
        setField(term98193, term98193.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "remove", argTypes, term97118, args);
        assertTrue(recursiveEquals(term97118, term98193));
        assertTrue(recursiveEquals(retValue, null));
    }

};


