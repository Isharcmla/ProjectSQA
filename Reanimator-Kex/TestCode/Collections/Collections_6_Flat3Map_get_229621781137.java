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

public class Flat3Map_get_229621781137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24041;
     Object term24133;
     Object term24457;
     Object term24458;

    public Flat3Map_get_229621781137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24041 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term24041, term24041.getClass(), "delegateMap", null);
        term24133 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        term24457 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term24457, term24457.getClass(), "size", 0);
        setIntField(term24457, term24457.getClass(), "hash1", 0);
        setIntField(term24457, term24457.getClass(), "hash2", 0);
        setIntField(term24457, term24457.getClass(), "hash3", 0);
        setField(term24457, term24457.getClass(), "key1", null);
        setField(term24457, term24457.getClass(), "key2", null);
        setField(term24457, term24457.getClass(), "key3", null);
        setField(term24457, term24457.getClass(), "value1", null);
        setField(term24457, term24457.getClass(), "value2", null);
        setField(term24457, term24457.getClass(), "value3", null);
        setField(term24457, term24457.getClass(), "delegateMap", null);
        term24458 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term24458, term24458.getClass(), "size", 0);
        setIntField(term24458, term24458.getClass(), "hash1", 0);
        setIntField(term24458, term24458.getClass(), "hash2", 0);
        setIntField(term24458, term24458.getClass(), "hash3", 0);
        setField(term24458, term24458.getClass(), "key1", null);
        setField(term24458, term24458.getClass(), "key2", null);
        setField(term24458, term24458.getClass(), "key3", null);
        setField(term24458, term24458.getClass(), "value1", null);
        setField(term24458, term24458.getClass(), "value2", null);
        setField(term24458, term24458.getClass(), "value3", null);
        setField(term24458, term24458.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24133;
        Object retValue = callMethod(klass, "get", argTypes, term24041, args);
        assertTrue(recursiveEquals(term24041, term24457));
        assertTrue(recursiveEquals(term24133, term24458));
        assertTrue(recursiveEquals(retValue, null));
    }

};


