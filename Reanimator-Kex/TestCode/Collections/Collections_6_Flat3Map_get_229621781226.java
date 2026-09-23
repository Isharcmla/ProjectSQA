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

public class Flat3Map_get_229621781226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37224;
     Object term37433;
     Object term37434;

    public Flat3Map_get_229621781226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37224 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term37224, term37224.getClass(), "delegateMap", null);
        setIntField(term37224, term37224.getClass(), "size", 0);
        setIntField(term37224, term37224.getClass(), "hash1", 0);
        setField(term37224, term37224.getClass(), "key1", term37224);
        term37433 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term37433, term37433.getClass(), "size", 0);
        setIntField(term37433, term37433.getClass(), "hash1", 0);
        setIntField(term37433, term37433.getClass(), "hash2", 0);
        setIntField(term37433, term37433.getClass(), "hash3", 0);
        setField(term37433, term37433.getClass(), "key1", term37433);
        setField(term37433, term37433.getClass(), "key2", null);
        setField(term37433, term37433.getClass(), "key3", null);
        setField(term37433, term37433.getClass(), "value1", null);
        setField(term37433, term37433.getClass(), "value2", null);
        setField(term37433, term37433.getClass(), "value3", null);
        setField(term37433, term37433.getClass(), "delegateMap", null);
        term37434 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term37434, term37434.getClass(), "size", 0);
        setIntField(term37434, term37434.getClass(), "hash1", 0);
        setIntField(term37434, term37434.getClass(), "hash2", 0);
        setIntField(term37434, term37434.getClass(), "hash3", 0);
        setField(term37434, term37434.getClass(), "key1", term37434);
        setField(term37434, term37434.getClass(), "key2", null);
        setField(term37434, term37434.getClass(), "key3", null);
        setField(term37434, term37434.getClass(), "value1", null);
        setField(term37434, term37434.getClass(), "value2", null);
        setField(term37434, term37434.getClass(), "value3", null);
        setField(term37434, term37434.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term37224;
        Object retValue = callMethod(klass, "get", argTypes, term37224, args);
        assertTrue(recursiveEquals(term37224, term37433));
        assertTrue(recursiveEquals(term37224, term37434));
        assertTrue(recursiveEquals(retValue, null));
    }

};


