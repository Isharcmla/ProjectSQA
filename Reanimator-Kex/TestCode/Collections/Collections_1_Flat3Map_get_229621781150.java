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

public class Flat3Map_get_229621781150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25986;
     Object term26078;
     Object term26665;
     Object term26666;

    public Flat3Map_get_229621781150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25986 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term25986, term25986.getClass(), "delegateMap", null);
        setIntField(term25986, term25986.getClass(), "size", 1);
        term26078 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term26665 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term26665, term26665.getClass(), "size", 1);
        setIntField(term26665, term26665.getClass(), "hash1", 0);
        setIntField(term26665, term26665.getClass(), "hash2", 0);
        setIntField(term26665, term26665.getClass(), "hash3", 0);
        setField(term26665, term26665.getClass(), "key1", null);
        setField(term26665, term26665.getClass(), "key2", null);
        setField(term26665, term26665.getClass(), "key3", null);
        setField(term26665, term26665.getClass(), "value1", null);
        setField(term26665, term26665.getClass(), "value2", null);
        setField(term26665, term26665.getClass(), "value3", null);
        setField(term26665, term26665.getClass(), "delegateMap", null);
        term26666 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term26666, term26666.getClass(), "size", 0);
        setIntField(term26666, term26666.getClass(), "hash1", 0);
        setIntField(term26666, term26666.getClass(), "hash2", 0);
        setIntField(term26666, term26666.getClass(), "hash3", 0);
        setField(term26666, term26666.getClass(), "key1", null);
        setField(term26666, term26666.getClass(), "key2", null);
        setField(term26666, term26666.getClass(), "key3", null);
        setField(term26666, term26666.getClass(), "value1", null);
        setField(term26666, term26666.getClass(), "value2", null);
        setField(term26666, term26666.getClass(), "value3", null);
        setField(term26666, term26666.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26078;
        Object retValue = callMethod(klass, "get", argTypes, term25986, args);
        assertTrue(recursiveEquals(term25986, term26665));
        assertTrue(recursiveEquals(term26078, term26666));
        assertTrue(recursiveEquals(retValue, null));
    }

};
