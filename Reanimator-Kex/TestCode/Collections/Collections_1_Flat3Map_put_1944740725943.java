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

public class Flat3Map_put_1944740725943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189041;
     Object term189133;
     Object term189179;
     Object term189181;

    public Flat3Map_put_1944740725943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189041 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term189041, term189041.getClass(), "delegateMap", null);
        setIntField(term189041, term189041.getClass(), "size", 1);
        setIntField(term189041, term189041.getClass(), "hash1", 0);
        setField(term189041, term189041.getClass(), "key1", term189041);
        term189133 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term189133, term189133.getClass(), "delegateMap", null);
        setIntField(term189133, term189133.getClass(), "size", 1);
        setIntField(term189133, term189133.getClass(), "hash1", 0);
        setField(term189133, term189133.getClass(), "value1", null);
        term189179 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term189180 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term189179, term189179.getClass(), "size", 2);
        setIntField(term189179, term189179.getClass(), "hash1", 0);
        setIntField(term189179, term189179.getClass(), "hash2", 0);
        setIntField(term189179, term189179.getClass(), "hash3", 0);
        setField(term189179, term189179.getClass(), "key1", term189179);
        setIntField(term189180, term189180.getClass(), "size", 1);
        setIntField(term189180, term189180.getClass(), "hash1", 0);
        setIntField(term189180, term189180.getClass(), "hash2", 0);
        setIntField(term189180, term189180.getClass(), "hash3", 0);
        setField(term189180, term189180.getClass(), "key1", null);
        setField(term189180, term189180.getClass(), "key2", null);
        setField(term189180, term189180.getClass(), "key3", null);
        setField(term189180, term189180.getClass(), "value1", null);
        setField(term189180, term189180.getClass(), "value2", null);
        setField(term189180, term189180.getClass(), "value3", null);
        setField(term189180, term189180.getClass(), "delegateMap", null);
        setField(term189179, term189179.getClass(), "key2", term189180);
        setField(term189179, term189179.getClass(), "key3", null);
        setField(term189179, term189179.getClass(), "value1", null);
        setField(term189179, term189179.getClass(), "value2", null);
        setField(term189179, term189179.getClass(), "value3", null);
        setField(term189179, term189179.getClass(), "delegateMap", null);
        term189181 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term189181, term189181.getClass(), "size", 1);
        setIntField(term189181, term189181.getClass(), "hash1", 0);
        setIntField(term189181, term189181.getClass(), "hash2", 0);
        setIntField(term189181, term189181.getClass(), "hash3", 0);
        setField(term189181, term189181.getClass(), "key1", null);
        setField(term189181, term189181.getClass(), "key2", null);
        setField(term189181, term189181.getClass(), "key3", null);
        setField(term189181, term189181.getClass(), "value1", null);
        setField(term189181, term189181.getClass(), "value2", null);
        setField(term189181, term189181.getClass(), "value3", null);
        setField(term189181, term189181.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term189133;
        args[1] = null;
        Object retValue = callMethod(klass, "put", argTypes, term189041, args);
        assertTrue(recursiveEquals(term189041, term189179));
        assertTrue(recursiveEquals(term189133, term189181));
        assertTrue(recursiveEquals(retValue, null));
    }

};
