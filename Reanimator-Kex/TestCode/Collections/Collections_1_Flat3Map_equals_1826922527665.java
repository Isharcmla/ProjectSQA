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

public class Flat3Map_equals_1826922527665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130296;
     Object term130436;
     Object term130562;
     Object term130565;

    public Flat3Map_equals_1826922527665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term130344 = new HashMap();
        term130296 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term130296, term130296.getClass(), "delegateMap", null);
        setIntField(term130296, term130296.getClass(), "size", 2);
        setField(term130296, term130296.getClass(), "key2", term130344);
        HashMap term130484 = new HashMap();
        term130436 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term130436, term130436.getClass(), "delegateMap", null);
        setIntField(term130436, term130436.getClass(), "size", 2);
        setIntField(term130436, term130436.getClass(), "hash2", 0);
        setField(term130436, term130436.getClass(), "key2", term130484);
        setIntField(term130436, term130436.getClass(), "hash1", -1);
        HashMap term130563 = new HashMap();
        term130562 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term130562, term130562.getClass(), "size", 2);
        setIntField(term130562, term130562.getClass(), "hash1", 0);
        setIntField(term130562, term130562.getClass(), "hash2", 0);
        setIntField(term130562, term130562.getClass(), "hash3", 0);
        setField(term130562, term130562.getClass(), "key1", null);
        setField(term130562, term130562.getClass(), "key2", term130563);
        setField(term130562, term130562.getClass(), "key3", null);
        setField(term130562, term130562.getClass(), "value1", null);
        setField(term130562, term130562.getClass(), "value2", null);
        setField(term130562, term130562.getClass(), "value3", null);
        setField(term130562, term130562.getClass(), "delegateMap", null);
        HashMap term130566 = new HashMap();
        term130565 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term130565, term130565.getClass(), "size", 2);
        setIntField(term130565, term130565.getClass(), "hash1", -1);
        setIntField(term130565, term130565.getClass(), "hash2", 0);
        setIntField(term130565, term130565.getClass(), "hash3", 0);
        setField(term130565, term130565.getClass(), "key1", null);
        setField(term130565, term130565.getClass(), "key2", term130566);
        setField(term130565, term130565.getClass(), "key3", null);
        setField(term130565, term130565.getClass(), "value1", null);
        setField(term130565, term130565.getClass(), "value2", null);
        setField(term130565, term130565.getClass(), "value3", null);
        setField(term130565, term130565.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term130436;
        Object retValue = callMethod(klass, "equals", argTypes, term130296, args);
        assertTrue(recursiveEquals(term130296, term130562));
        assertTrue(recursiveEquals(term130436, term130565));
        assertTrue(recursiveEquals(retValue, true));
    }

};
