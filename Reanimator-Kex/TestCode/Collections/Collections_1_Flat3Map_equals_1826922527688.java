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
import java.lang.Object;

public class Flat3Map_equals_1826922527688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135342;
     Object term135582;
     Object term136090;
     Object term136093;

    public Flat3Map_equals_1826922527688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term135606 = new HashMap();
        term135342 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term135428 = newInstance(Class.forName("java.lang.Object"));
        setField(term135342, term135342.getClass(), "delegateMap", null);
        setIntField(term135342, term135342.getClass(), "size", 2);
        setField(term135342, term135342.getClass(), "key2", term135606);
        setField(term135342, term135342.getClass(), "value2", term135428);
        term135582 = newInstance(Class.forName("java.lang.Object"));
        HashMap term136091 = new HashMap();
        term136090 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        Object term136092 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term136090, term136090.getClass(), "size", 2);
        setIntField(term136090, term136090.getClass(), "hash1", 0);
        setIntField(term136090, term136090.getClass(), "hash2", 0);
        setIntField(term136090, term136090.getClass(), "hash3", 0);
        setField(term136090, term136090.getClass(), "key1", null);
        setField(term136090, term136090.getClass(), "key2", term136091);
        setField(term136090, term136090.getClass(), "key3", null);
        setField(term136090, term136090.getClass(), "value1", null);
        setField(term136090, term136090.getClass(), "value2", term136092);
        setField(term136090, term136090.getClass(), "value3", null);
        setField(term136090, term136090.getClass(), "delegateMap", null);
        term136093 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term135582;
        Object retValue = callMethod(klass, "equals", argTypes, term135342, args);
        assertTrue(recursiveEquals(term135342, term136090));
        assertTrue(recursiveEquals(term135582, term136093));
        assertTrue(recursiveEquals(retValue, false));
    }

};
