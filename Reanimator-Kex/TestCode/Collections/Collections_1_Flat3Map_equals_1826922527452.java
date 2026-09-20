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

public class Flat3Map_equals_1826922527452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83565;
     Object term83705;
     Object term84081;
     Object term84084;

    public Flat3Map_equals_1826922527452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term83613 = new HashMap();
        term83565 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term83565, term83565.getClass(), "delegateMap", null);
        setIntField(term83565, term83565.getClass(), "size", 3);
        setField(term83565, term83565.getClass(), "key3", null);
        setField(term83565, term83565.getClass(), "value3", null);
        setField(term83565, term83565.getClass(), "key2", null);
        setField(term83565, term83565.getClass(), "value2", null);
        setField(term83565, term83565.getClass(), "key1", term83613);
        term83705 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setField(term83705, term83705.getClass(), "delegateMap", null);
        setIntField(term83705, term83705.getClass(), "size", 3);
        setField(term83705, term83705.getClass(), "key3", null);
        setField(term83705, term83705.getClass(), "value3", null);
        HashMap term84082 = new HashMap();
        term84081 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term84081, term84081.getClass(), "size", 3);
        setIntField(term84081, term84081.getClass(), "hash1", 0);
        setIntField(term84081, term84081.getClass(), "hash2", 0);
        setIntField(term84081, term84081.getClass(), "hash3", 0);
        setField(term84081, term84081.getClass(), "key1", term84082);
        setField(term84081, term84081.getClass(), "key2", null);
        setField(term84081, term84081.getClass(), "key3", null);
        setField(term84081, term84081.getClass(), "value1", null);
        setField(term84081, term84081.getClass(), "value2", null);
        setField(term84081, term84081.getClass(), "value3", null);
        setField(term84081, term84081.getClass(), "delegateMap", null);
        term84084 = newInstance(Class.forName("org.apache.commons.collections.map.Flat3Map"));
        setIntField(term84084, term84084.getClass(), "size", 3);
        setIntField(term84084, term84084.getClass(), "hash1", 0);
        setIntField(term84084, term84084.getClass(), "hash2", 0);
        setIntField(term84084, term84084.getClass(), "hash3", 0);
        setField(term84084, term84084.getClass(), "key1", null);
        setField(term84084, term84084.getClass(), "key2", null);
        setField(term84084, term84084.getClass(), "key3", null);
        setField(term84084, term84084.getClass(), "value1", null);
        setField(term84084, term84084.getClass(), "value2", null);
        setField(term84084, term84084.getClass(), "value3", null);
        setField(term84084, term84084.getClass(), "delegateMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.map.Flat3Map");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term83705;
        Object retValue = callMethod(klass, "equals", argTypes, term83565, args);
        assertTrue(recursiveEquals(term83565, term84081));
        assertTrue(recursiveEquals(term83705, term84084));
        assertTrue(recursiveEquals(retValue, false));
    }

};
