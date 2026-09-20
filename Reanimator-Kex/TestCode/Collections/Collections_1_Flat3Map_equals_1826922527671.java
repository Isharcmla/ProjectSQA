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

public class Flat3Map_equals_1826922527671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131559;
     Object term131699;
     Object term131861;
     Object term131864;

    public Flat3Map_equals_1826922527671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term131723 = new HashMap();
        term131559 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term131559, term131559.getClass(), "delegateMap", null);
        setIntField(term131559, term131559.getClass(), "size", 3);
        setField(term131559, term131559.getClass(), "key3", null);
        setField(term131559, term131559.getClass(), "value3", null);
        setField(term131559, term131559.getClass(), "key2", term131723);
        term131699 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term131699, term131699.getClass(), "delegateMap", null);
        setIntField(term131699, term131699.getClass(), "size", 3);
        setField(term131699, term131699.getClass(), "key3", null);
        setField(term131699, term131699.getClass(), "value3", null);
        setIntField(term131699, term131699.getClass(), "hash3", 0);
        setIntField(term131699, term131699.getClass(), "hash2", 0);
        setField(term131699, term131699.getClass(), "key2", term131723);
        HashMap term131862 = new HashMap();
        term131861 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term131861, term131861.getClass(), "size", 3);
        setIntField(term131861, term131861.getClass(), "hash1", 0);
        setIntField(term131861, term131861.getClass(), "hash2", 0);
        setIntField(term131861, term131861.getClass(), "hash3", 0);
        setField(term131861, term131861.getClass(), "key1", null);
        setField(term131861, term131861.getClass(), "key2", term131862);
        setField(term131861, term131861.getClass(), "key3", null);
        setField(term131861, term131861.getClass(), "value1", null);
        setField(term131861, term131861.getClass(), "value2", null);
        setField(term131861, term131861.getClass(), "value3", null);
        setField(term131861, term131861.getClass(), "delegateMap", null);
        HashMap term131865 = new HashMap();
        term131864 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term131864, term131864.getClass(), "size", 3);
        setIntField(term131864, term131864.getClass(), "hash1", 0);
        setIntField(term131864, term131864.getClass(), "hash2", 0);
        setIntField(term131864, term131864.getClass(), "hash3", 0);
        setField(term131864, term131864.getClass(), "key1", null);
        setField(term131864, term131864.getClass(), "key2", term131865);
        setField(term131864, term131864.getClass(), "key3", null);
        setField(term131864, term131864.getClass(), "value1", null);
        setField(term131864, term131864.getClass(), "value2", null);
        setField(term131864, term131864.getClass(), "value3", null);
        setField(term131864, term131864.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term131699;
        Object retValue = callMethod(klass, "equals", argTypes, term131559, args);
        assertTrue(recursiveEquals(term131559, term131861));
        assertTrue(recursiveEquals(term131699, term131864));
        assertTrue(recursiveEquals(retValue, true));
    }

};
