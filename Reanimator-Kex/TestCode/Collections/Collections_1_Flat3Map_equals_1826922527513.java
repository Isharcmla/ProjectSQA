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

public class Flat3Map_equals_1826922527513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96476;
     Object term96616;
     Object term97527;
     Object term97530;

    public Flat3Map_equals_1826922527513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term96524 = new HashMap();
        term96476 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term96476, term96476.getClass(), "delegateMap", null);
        setIntField(term96476, term96476.getClass(), "size", 3);
        setField(term96476, term96476.getClass(), "key3", null);
        setField(term96476, term96476.getClass(), "value3", null);
        setField(term96476, term96476.getClass(), "key2", null);
        setField(term96476, term96476.getClass(), "value2", null);
        setField(term96476, term96476.getClass(), "key1", term96524);
        term96616 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term96616, term96616.getClass(), "delegateMap", null);
        setIntField(term96616, term96616.getClass(), "size", 3);
        setField(term96616, term96616.getClass(), "key3", null);
        setField(term96616, term96616.getClass(), "value3", null);
        setIntField(term96616, term96616.getClass(), "hash3", 0);
        setIntField(term96616, term96616.getClass(), "hash2", -1);
        HashMap term97528 = new HashMap();
        term97527 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term97527, term97527.getClass(), "size", 3);
        setIntField(term97527, term97527.getClass(), "hash1", 0);
        setIntField(term97527, term97527.getClass(), "hash2", 0);
        setIntField(term97527, term97527.getClass(), "hash3", 0);
        setField(term97527, term97527.getClass(), "key1", term97528);
        setField(term97527, term97527.getClass(), "key2", null);
        setField(term97527, term97527.getClass(), "key3", null);
        setField(term97527, term97527.getClass(), "value1", null);
        setField(term97527, term97527.getClass(), "value2", null);
        setField(term97527, term97527.getClass(), "value3", null);
        setField(term97527, term97527.getClass(), "delegateMap", null);
        term97530 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term97530, term97530.getClass(), "size", 3);
        setIntField(term97530, term97530.getClass(), "hash1", 0);
        setIntField(term97530, term97530.getClass(), "hash2", -1);
        setIntField(term97530, term97530.getClass(), "hash3", 0);
        setField(term97530, term97530.getClass(), "key1", null);
        setField(term97530, term97530.getClass(), "key2", null);
        setField(term97530, term97530.getClass(), "key3", null);
        setField(term97530, term97530.getClass(), "value1", null);
        setField(term97530, term97530.getClass(), "value2", null);
        setField(term97530, term97530.getClass(), "value3", null);
        setField(term97530, term97530.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term96616;
        Object retValue = callMethod(klass, "equals", argTypes, term96476, args);
        assertTrue(recursiveEquals(term96476, term97527));
        assertTrue(recursiveEquals(term96616, term97530));
        assertTrue(recursiveEquals(retValue, false));
    }

};
