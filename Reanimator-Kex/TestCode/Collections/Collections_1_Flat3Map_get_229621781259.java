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

public class Flat3Map_get_229621781259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45013;
     Object term46250;
     Object term46251;

    public Flat3Map_get_229621781259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45013 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term45013, term45013.getClass(), "delegateMap", null);
        setIntField(term45013, term45013.getClass(), "size", 2);
        setIntField(term45013, term45013.getClass(), "hash2", -1);
        setField(term45013, term45013.getClass(), "value2", null);
        setIntField(term45013, term45013.getClass(), "hash1", 0);
        setField(term45013, term45013.getClass(), "value1", null);
        term46250 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46250, term46250.getClass(), "size", 2);
        setIntField(term46250, term46250.getClass(), "hash1", 0);
        setIntField(term46250, term46250.getClass(), "hash2", -1);
        setIntField(term46250, term46250.getClass(), "hash3", 0);
        setField(term46250, term46250.getClass(), "key1", null);
        setField(term46250, term46250.getClass(), "key2", null);
        setField(term46250, term46250.getClass(), "key3", null);
        setField(term46250, term46250.getClass(), "value1", null);
        setField(term46250, term46250.getClass(), "value2", null);
        setField(term46250, term46250.getClass(), "value3", null);
        setField(term46250, term46250.getClass(), "delegateMap", null);
        term46251 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term46251, term46251.getClass(), "size", 2);
        setIntField(term46251, term46251.getClass(), "hash1", 0);
        setIntField(term46251, term46251.getClass(), "hash2", -1);
        setIntField(term46251, term46251.getClass(), "hash3", 0);
        setField(term46251, term46251.getClass(), "key1", null);
        setField(term46251, term46251.getClass(), "key2", null);
        setField(term46251, term46251.getClass(), "key3", null);
        setField(term46251, term46251.getClass(), "value1", null);
        setField(term46251, term46251.getClass(), "value2", null);
        setField(term46251, term46251.getClass(), "value3", null);
        setField(term46251, term46251.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45013;
        Object retValue = callMethod(klass, "get", argTypes, term45013, args);
        assertTrue(recursiveEquals(term45013, term46250));
        assertTrue(recursiveEquals(term45013, term46251));
        assertTrue(recursiveEquals(retValue, null));
    }

};
