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

public class Flat3Map_get_229621781321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57869;
     Object term57961;
     Object term58023;
     Object term58024;

    public Flat3Map_get_229621781321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57869 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term57869, term57869.getClass(), "delegateMap", null);
        setIntField(term57869, term57869.getClass(), "size", 2);
        setIntField(term57869, term57869.getClass(), "hash2", 0);
        setField(term57869, term57869.getClass(), "key2", term57869);
        term57961 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term57961, term57961.getClass(), "delegateMap", null);
        setIntField(term57961, term57961.getClass(), "size", 2);
        setIntField(term57961, term57961.getClass(), "hash2", 0);
        setField(term57961, term57961.getClass(), "value2", null);
        setIntField(term57961, term57961.getClass(), "hash1", 0);
        setField(term57961, term57961.getClass(), "value1", null);
        term58023 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term58023, term58023.getClass(), "size", 2);
        setIntField(term58023, term58023.getClass(), "hash1", 0);
        setIntField(term58023, term58023.getClass(), "hash2", 0);
        setIntField(term58023, term58023.getClass(), "hash3", 0);
        setField(term58023, term58023.getClass(), "key1", null);
        setField(term58023, term58023.getClass(), "key2", term58023);
        setField(term58023, term58023.getClass(), "key3", null);
        setField(term58023, term58023.getClass(), "value1", null);
        setField(term58023, term58023.getClass(), "value2", null);
        setField(term58023, term58023.getClass(), "value3", null);
        setField(term58023, term58023.getClass(), "delegateMap", null);
        term58024 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term58024, term58024.getClass(), "size", 2);
        setIntField(term58024, term58024.getClass(), "hash1", 0);
        setIntField(term58024, term58024.getClass(), "hash2", 0);
        setIntField(term58024, term58024.getClass(), "hash3", 0);
        setField(term58024, term58024.getClass(), "key1", null);
        setField(term58024, term58024.getClass(), "key2", null);
        setField(term58024, term58024.getClass(), "key3", null);
        setField(term58024, term58024.getClass(), "value1", null);
        setField(term58024, term58024.getClass(), "value2", null);
        setField(term58024, term58024.getClass(), "value3", null);
        setField(term58024, term58024.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term57961;
        Object retValue = callMethod(klass, "get", argTypes, term57869, args);
        assertTrue(recursiveEquals(term57869, term58023));
        assertTrue(recursiveEquals(term57961, term58024));
        assertTrue(recursiveEquals(retValue, null));
    }

};
