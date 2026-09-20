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

public class Flat3Map_equals_1826922527697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137660;
     Object term137800;
     Object term138048;
     Object term138051;

    public Flat3Map_equals_1826922527697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term137872 = new HashMap();
        term137660 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term137660, term137660.getClass(), "delegateMap", null);
        setIntField(term137660, term137660.getClass(), "size", 3);
        setField(term137660, term137660.getClass(), "key3", null);
        setField(term137660, term137660.getClass(), "value3", null);
        setField(term137660, term137660.getClass(), "key2", term137872);
        HashMap term137848 = new HashMap();
        term137800 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term137800, term137800.getClass(), "delegateMap", null);
        setIntField(term137800, term137800.getClass(), "size", 3);
        setField(term137800, term137800.getClass(), "key3", null);
        setField(term137800, term137800.getClass(), "value3", null);
        setIntField(term137800, term137800.getClass(), "hash3", 0);
        setIntField(term137800, term137800.getClass(), "hash2", 0);
        setField(term137800, term137800.getClass(), "key2", term137848);
        setIntField(term137800, term137800.getClass(), "hash1", 0);
        setField(term137800, term137800.getClass(), "key1", term137872);
        HashMap term138049 = new HashMap();
        term138048 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term138048, term138048.getClass(), "size", 3);
        setIntField(term138048, term138048.getClass(), "hash1", 0);
        setIntField(term138048, term138048.getClass(), "hash2", 0);
        setIntField(term138048, term138048.getClass(), "hash3", 0);
        setField(term138048, term138048.getClass(), "key1", null);
        setField(term138048, term138048.getClass(), "key2", term138049);
        setField(term138048, term138048.getClass(), "key3", null);
        setField(term138048, term138048.getClass(), "value1", null);
        setField(term138048, term138048.getClass(), "value2", null);
        setField(term138048, term138048.getClass(), "value3", null);
        setField(term138048, term138048.getClass(), "delegateMap", null);
        HashMap term138052 = new HashMap();
        HashMap term138054 = new HashMap();
        term138051 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term138051, term138051.getClass(), "size", 3);
        setIntField(term138051, term138051.getClass(), "hash1", 0);
        setIntField(term138051, term138051.getClass(), "hash2", 0);
        setIntField(term138051, term138051.getClass(), "hash3", 0);
        setField(term138051, term138051.getClass(), "key1", term138052);
        setField(term138051, term138051.getClass(), "key2", term138054);
        setField(term138051, term138051.getClass(), "key3", null);
        setField(term138051, term138051.getClass(), "value1", null);
        setField(term138051, term138051.getClass(), "value2", null);
        setField(term138051, term138051.getClass(), "value3", null);
        setField(term138051, term138051.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term137800;
        Object retValue = callMethod(klass, "equals", argTypes, term137660, args);
        assertTrue(recursiveEquals(term137660, term138048));
        assertTrue(recursiveEquals(term137800, term138051));
        assertTrue(recursiveEquals(retValue, true));
    }

};
