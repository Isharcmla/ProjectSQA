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

public class Flat3Map_get_229621781182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30918;
     Object term31083;
     Object term31084;

    public Flat3Map_get_229621781182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30918 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term30918, term30918.getClass(), "delegateMap", null);
        setIntField(term30918, term30918.getClass(), "size", 0);
        term31083 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term31083, term31083.getClass(), "size", 0);
        setIntField(term31083, term31083.getClass(), "hash1", 0);
        setIntField(term31083, term31083.getClass(), "hash2", 0);
        setIntField(term31083, term31083.getClass(), "hash3", 0);
        setField(term31083, term31083.getClass(), "key1", null);
        setField(term31083, term31083.getClass(), "key2", null);
        setField(term31083, term31083.getClass(), "key3", null);
        setField(term31083, term31083.getClass(), "value1", null);
        setField(term31083, term31083.getClass(), "value2", null);
        setField(term31083, term31083.getClass(), "value3", null);
        setField(term31083, term31083.getClass(), "delegateMap", null);
        term31084 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term31084, term31084.getClass(), "size", 0);
        setIntField(term31084, term31084.getClass(), "hash1", 0);
        setIntField(term31084, term31084.getClass(), "hash2", 0);
        setIntField(term31084, term31084.getClass(), "hash3", 0);
        setField(term31084, term31084.getClass(), "key1", null);
        setField(term31084, term31084.getClass(), "key2", null);
        setField(term31084, term31084.getClass(), "key3", null);
        setField(term31084, term31084.getClass(), "value1", null);
        setField(term31084, term31084.getClass(), "value2", null);
        setField(term31084, term31084.getClass(), "value3", null);
        setField(term31084, term31084.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30918;
        Object retValue = callMethod(klass, "get", argTypes, term30918, args);
        assertTrue(recursiveEquals(term30918, term31083));
        assertTrue(recursiveEquals(term30918, term31084));
        assertTrue(recursiveEquals(retValue, null));
    }

};
