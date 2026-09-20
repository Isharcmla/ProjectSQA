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
import java.util.HashMap;

public class Flat3Map_equals_1826922527298 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52953;
     Object term53093;
     Object term53549;
     Object term53552;

    public Flat3Map_equals_1826922527298() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term53001 = new HashMap();
        term52953 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term52953, term52953.getClass(), "delegateMap", null);
        setIntField(term52953, term52953.getClass(), "size", 1);
        setField(term52953, term52953.getClass(), "key1", term53001);
        term53093 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term53093, term53093.getClass(), "delegateMap", null);
        setIntField(term53093, term53093.getClass(), "size", 1);
        setIntField(term53093, term53093.getClass(), "hash1", 0);
        HashMap term53550 = new HashMap();
        term53549 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term53549, term53549.getClass(), "size", 1);
        setIntField(term53549, term53549.getClass(), "hash1", 0);
        setIntField(term53549, term53549.getClass(), "hash2", 0);
        setIntField(term53549, term53549.getClass(), "hash3", 0);
        setField(term53549, term53549.getClass(), "key1", term53550);
        setField(term53549, term53549.getClass(), "key2", null);
        setField(term53549, term53549.getClass(), "key3", null);
        setField(term53549, term53549.getClass(), "value1", null);
        setField(term53549, term53549.getClass(), "value2", null);
        setField(term53549, term53549.getClass(), "value3", null);
        setField(term53549, term53549.getClass(), "delegateMap", null);
        term53552 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term53552, term53552.getClass(), "size", 1);
        setIntField(term53552, term53552.getClass(), "hash1", 0);
        setIntField(term53552, term53552.getClass(), "hash2", 0);
        setIntField(term53552, term53552.getClass(), "hash3", 0);
        setField(term53552, term53552.getClass(), "key1", null);
        setField(term53552, term53552.getClass(), "key2", null);
        setField(term53552, term53552.getClass(), "key3", null);
        setField(term53552, term53552.getClass(), "value1", null);
        setField(term53552, term53552.getClass(), "value2", null);
        setField(term53552, term53552.getClass(), "value3", null);
        setField(term53552, term53552.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term53093;
        Object retValue = callMethod(klass, "equals", argTypes, term52953, args);
        assertTrue(recursiveEquals(term52953, term53549));
        assertTrue(recursiveEquals(term53093, term53552));
        assertTrue(recursiveEquals(retValue, false));
    }

};
